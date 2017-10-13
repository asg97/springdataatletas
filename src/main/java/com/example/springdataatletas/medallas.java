package com.example.springdataatletas;
import javax.persistence.*;
import java.lang.reflect.Array;


@Entity

public class medallas {

private int id;
private Array tipoMedalla;
private String especialidad;
private String competicion;

@ManyToOne
   private atleta Atleta;


    public medallas(int id, Array tipoMedalla, String especialidad, String competicion) {
        this.id = id;
        this.tipoMedalla = tipoMedalla;
        this.especialidad = especialidad;
        this.competicion = competicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Array getTipoMedalla() {
        return tipoMedalla;
    }

    public void setTipoMedalla(Array tipoMedalla) {
        this.tipoMedalla = tipoMedalla;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCompeticion() {
        return competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        medallas medallas = (medallas) o;

        if (id != medallas.id) return false;
        if (tipoMedalla != null ? !tipoMedalla.equals(medallas.tipoMedalla) : medallas.tipoMedalla != null)
            return false;
        if (especialidad != null ? !especialidad.equals(medallas.especialidad) : medallas.especialidad != null)
            return false;
        if (competicion != null ? !competicion.equals(medallas.competicion) : medallas.competicion != null)
            return false;
        return Atleta != null ? Atleta.equals(medallas.Atleta) : medallas.Atleta == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tipoMedalla != null ? tipoMedalla.hashCode() : 0);
        result = 31 * result + (especialidad != null ? especialidad.hashCode() : 0);
        result = 31 * result + (competicion != null ? competicion.hashCode() : 0);
        result = 31 * result + (Atleta != null ? Atleta.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "medallas{" +
                "id=" + id +
                ", tipoMedalla=" + tipoMedalla +
                ", especialidad='" + especialidad + '\'' +
                ", competicion='" + competicion + '\'' +
                ", Atleta=" + Atleta +
                '}';
    }
}
