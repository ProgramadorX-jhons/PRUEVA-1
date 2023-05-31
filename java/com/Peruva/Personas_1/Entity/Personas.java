package com.Peruva.Personas_1.Entity;
//hoja numero 1
import jakarta.persistence.*;

//hoja numero 1
@Entity
@Table(name="personas")
public class Personas {
    //atributos
    //generar entidad  y generate value

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nombre;
    private String apellidos;
    private String direccion;

    //metodos contructor vacio;
    public Personas(){

    }
    //metodos contructor con parametros

    public Personas(String id, String nombre, String apellidos, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    //get y set


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
