package com.Inventario.ModuloProductos.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Producto")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {

//    create tableProducto(
        //    productoId int primary key not null,
        //    nombreProducto varchar(60) not null,
        //    descripcion longtext,
        //    precio decimal(10,2)s
//);


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productoId;
    private String nombreProducto;
    private String descripcion;
    private double precio;

    @OneToMany (mappedBy = "producto", cascade = CascadeType.ALL)
    @JsonIgnore
    List<Stock> lista = new ArrayList<Stock>();


}
