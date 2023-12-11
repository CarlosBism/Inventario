package com.Inventario.ModuloProductos.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Stock")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stock {

//    create table stock(
//            stockId int primary key not null,
//            cantidad long not null,
//            productoId int not null,
//            foreign key (productoId) references Producto (productoId)
//            );

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stockId;
    private long cantidad;

    //Muchos a uno con producto
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "productoId")
    Producto producto;

//    Uno a muchos con bodega
    @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL)
    @JsonIgnore
    List<Bodega> lista = new ArrayList<Bodega>();


}
