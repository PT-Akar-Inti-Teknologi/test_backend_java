package com.ait.test.ppob.gateway.jpa.entity.composite;

import com.ait.test.ppob.gateway.jpa.entity.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.OneToMany;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionKey implements Serializable {
    @OneToMany
    private Client client;
    private String refferenceNumber;
}
