package com.sofkau.implementacion.urgencias;

import co.com.sofka.domain.generic.Entity;
import com.sofkau.implementacion.urgencias.values.CategoriaTriage;
import com.sofkau.implementacion.urgencias.values.Descripcion;
import com.sofkau.implementacion.urgencias.values.TriageId;

import java.util.Objects;

public final class Triage extends Entity<TriageId> {
    private  CategoriaTriage categoriaTriage;
    private  Descripcion descripcion;

    public Triage(TriageId entityId, CategoriaTriage categoriaTriage, Descripcion descripcion) {
        super(entityId);
        this.categoriaTriage = categoriaTriage;
        this.descripcion = descripcion;
    }

    //Comportamientos
    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public void actualizarTriage(CategoriaTriage categoriaTriage){
        this.categoriaTriage = Objects.requireNonNull(categoriaTriage);
    }



    public CategoriaTriage categoriaTriage() {
        return categoriaTriage;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
