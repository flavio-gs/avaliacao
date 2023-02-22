package com.igreja.ipep.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "telaPrincipal")
public class TelaPrincipal {

    @Id
//    @SequenceGenerator(name = "TELAPRINCIPAL_ID_GENERATOR", sequenceName = "TELAPRINCIPAL_ID_SEQ", allocationSize = 1)
    private Long id;

}
