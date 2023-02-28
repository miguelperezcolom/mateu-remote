package com.example.storageserver;

import com.example.storageserver.camunda.ExternalTaskPoller;
import com.example.storageserver.storage.JourneyOutcome;
import com.example.storageserver.storage.JourneyOutcomeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PollerTester {

    @Autowired
    ExternalTaskPoller poller;

    @Autowired
    JourneyOutcomeRepository repo;

    @Test
    public void pollTest() {

        poller.poll();

        List<JourneyOutcome> outcomes = repo.findAll();

        Assertions.assertTrue(outcomes.size() > 0);

    }

}
