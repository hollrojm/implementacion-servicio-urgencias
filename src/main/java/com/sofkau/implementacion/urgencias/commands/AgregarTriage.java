package com.sofkau.implementacion.urgencias.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.implementacion.urgencias.values.CategoriaTriage;
import com.sofkau.implementacion.urgencias.values.Descripcion;
import com.sofkau.implementacion.urgencias.values.TriageId;
import com.sofkau.implementacion.urgencias.values.UrgenciasId;

public final class AgregarTriage extends Command {

    private final UrgenciasId urgenciasId;
    private final TriageId entityId;
    private final CategoriaTriage categoriaTriage;
    private final Descripcion descripcion;

    public AgregarTriage(UrgenciasId urgenciasId, TriageId entityId, CategoriaTriage categoriaTriage, Descripcion descripcion) {
        this.urgenciasId = urgenciasId;
        this.entityId = entityId;
        this.categoriaTriage = categoriaTriage;
        this.descripcion = descripcion;
    }

    public UrgenciasId getUrgenciasId() {
        return urgenciasId;
    }

    public TriageId getEntityId() {
        return entityId;
    }

    public CategoriaTriage getCategoriaTriage() {
        return categoriaTriage;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
