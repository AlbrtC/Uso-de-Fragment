package com.proyecto2.carlos.appmovil2.Entity;

import java.io.Serializable;

/**
 * Created by CARLOS on 08/01/2017.
 */
public class Contact implements Serializable {
    String Nombre;
    String Ocupacion;
    Integer Edad;
    Integer Sexo;

    public Contact() {
    }

    public Contact(String nombre, Integer edad, String ocupacion, Integer sexo) {
        Nombre = nombre;
        Edad = edad;
        Ocupacion = ocupacion;
        Sexo = sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        Ocupacion = ocupacion;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public Integer getSexo() {
        return Sexo;
    }

    public void setSexo(Integer sexo) {
        Sexo = sexo;
    }
}
