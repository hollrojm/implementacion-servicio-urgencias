package com.sofkau.implementacion.urgencias.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Entity;
import com.sofkau.implementacion.urgencias.values.CategoriaTriage;
import com.sofkau.implementacion.urgencias.values.TriageId;

import java.util.UUID;

public final class CategoriaTriageActualizada extends DomainEvent {

    private final TriageId triageId;
    private final CategoriaTriage categoriaTriage;

    public CategoriaTriageActualizada(TriageId triageId, CategoriaTriage categoriaTriage) {
        super("hospital.urgencias.categoriatriageactualizada");
        this.triageId = triageId;
        this.categoriaTriage = categoriaTriage;
    }

    public TriageId getTriageId() {
        return triageId;
    }

    public CategoriaTriage getCategoriaTriage() {
        return categoriaTriage;
    }
}
