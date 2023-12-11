package com.Inventario.ModuloProductos.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "Estante")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Estante {

//    create table Estante(
//            estanteId int primary key not null,
//            pasillo varchar(20) not null,
//    numeroEstante bigint not null,
//    bodegaId int not null,
//    foreign key (bodegaId) references Bodega (bodegaId)
//            );

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int estanteId;
    private String Pasillo;
    private int numeroEstante;

    //Muchos a  uno con bodega
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bodegaId")
    Bodega bodega;


}
