package com.Inventario.ModuloProductos.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Bodega")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bodega {

//    Mapeo de la BD
//create table Bodega(
////            bodegaId int primary key not null,
////            nombre varchar(60) not null,
////    numeroBodega long not null,
////    stockId int not null,
////    foreign key (stockId) references stock (stockId)
////            );
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bodegaId;
    private String nombre;
    private int numeroBodega;


    //Muchos a uno con stock
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "stockId")
    Stock stock;

    //Uno a muchos con Estante
    @OneToMany(mappedBy = "bodega",cascade = CascadeType.ALL)
    @JsonIgnore
    List<Estante> lista = new ArrayList<>();
}
