package com.example.storageserver.storage;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity@Data
public class Variable {

    @Id
    private String id = UUID.randomUUID().toString();

    @ManyToOne
    private JourneyOutcome journeyOutcome;

    @Column(name = "_key")
    private String key;

    @Column(name = "_value")
    private String value;

    @Override
    public String toString() {
        return id;
    }

}
