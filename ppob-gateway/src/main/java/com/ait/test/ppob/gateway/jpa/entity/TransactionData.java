package com.ait.test.ppob.gateway.jpa.entity;

import com.ait.test.ppob.gateway.constant.StatusEnum;
import com.ait.test.ppob.gateway.jpa.entity.composite.TransactionKey;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TransactionData {

    @EmbeddedId
    private TransactionKey id;

    private String clientReferenceNumber;

    private long amount;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;
}
