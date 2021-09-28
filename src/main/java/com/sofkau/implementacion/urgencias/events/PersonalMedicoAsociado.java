package com.sofkau.implementacion.urgencias.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.implementacion.urgencias.values.CategoriaTriage;
import com.sofkau.implementacion.urgencias.values.Descripcion;
import com.sofkau.implementacion.urgencias.values.TriageId;

public final class PersonalMedicoAsociado  extends DomainEvent {
    private final TriageId triageId;
    private final CategoriaTriage categoriaTriage;
    private final Descripcion descripcion;
    public PersonalMedicoAsociado(TriageId triageId, CategoriaTriage categoriaTriage, Descripcion descripcion) {
        super("hospital.urgencias.personalmedicoasociado");
        this.triageId = triageId;
        this.categoriaTriage = categoriaTriage;
        this.descripcion = descripcion;
    }

    public TriageId getTriageId() {
        return triageId;
    }

    public CategoriaTriage getCategoriaTriage() {
        return categoriaTriage;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
