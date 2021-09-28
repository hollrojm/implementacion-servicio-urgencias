package com.sofkau.implementacion.urgencias.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.implementacion.urgencias.values.CategoriaTriage;
import com.sofkau.implementacion.urgencias.values.TriageId;
import com.sofkau.implementacion.urgencias.values.UrgenciasId;

public final class ActualizarCategoriaTriage extends Command {

    private final UrgenciasId urgenciasId;
    private final TriageId entityId;
    private final CategoriaTriage categoriaTriage;

    public ActualizarCategoriaTriage(UrgenciasId urgenciasId, TriageId entityId, CategoriaTriage categoriaTriage) {
        this.urgenciasId = urgenciasId;
        this.entityId = entityId;
        this.categoriaTriage = categoriaTriage;
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
}
