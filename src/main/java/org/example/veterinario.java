package org.example;

public class veterinario {

    //id

  private    Integer id;

    //nombre

     private String nombre;

    //cedula
     private int cedula;

    //constructor vacio

    public veterinario() {
    }

    //costructor lleno


    public veterinario(Integer id, String nombre, int cedula) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
    }
}
