package com.example.storageserver.storage;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity@Data
public class JourneyOutcome {

    @Id
    private String id = UUID.randomUUID().toString();

    private String journeyType;

    private String journeyId;

    @Column(name = "_when")
    private LocalDateTime when = LocalDateTime.now();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "journeyOutcome", fetch = FetchType.EAGER)
    private List<Variable> variables = new ArrayList<>();

    @Override
    public String toString() {
        return id;
    }
}
