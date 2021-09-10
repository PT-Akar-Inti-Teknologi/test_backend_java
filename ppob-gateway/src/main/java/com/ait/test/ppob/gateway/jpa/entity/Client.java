package com.ait.test.ppob.gateway.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
@Setter
public class Client {

    @Id
    private String id;

    private String name;

    private String email;

    private boolean isActive;

    @OneToMany(mappedBy = "id.client")
    private Set<TransactionData> transactionData;
}
