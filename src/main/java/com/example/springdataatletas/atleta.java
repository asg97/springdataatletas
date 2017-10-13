package com.example.springdataatletas;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class atleta {



@Id

@GeneratedValue
private String name;
private String apellido;
private String nacionalidad;
private LocalDate FechaNac;

    public atleta(String apellido, String nacionalidad, LocalDate fechaNac) {
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        FechaNac = fechaNac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        FechaNac = fechaNac;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        atleta atleta = (atleta) o;

        if (name != null ? !name.equals(atleta.name) : atleta.name != null) return false;
        if (apellido != null ? !apellido.equals(atleta.apellido) : atleta.apellido != null) return false;
        if (nacionalidad != null ? !nacionalidad.equals(atleta.nacionalidad) : atleta.nacionalidad != null)
            return false;
        return FechaNac != null ? FechaNac.equals(atleta.FechaNac) : atleta.FechaNac == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (nacionalidad != null ? nacionalidad.hashCode() : 0);
        result = 31 * result + (FechaNac != null ? FechaNac.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "atleta{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", FechaNac=" + FechaNac +
                '}';
    }
}
