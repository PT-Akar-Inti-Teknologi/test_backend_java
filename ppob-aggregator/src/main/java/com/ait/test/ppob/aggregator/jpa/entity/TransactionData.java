package com.ait.test.ppob.aggregator.jpa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TransactionData {

    @Id
    @GeneratedValue
    private Long id;

    private Date requestDate;

    private String referenceNmber;

    private long amount;

}
