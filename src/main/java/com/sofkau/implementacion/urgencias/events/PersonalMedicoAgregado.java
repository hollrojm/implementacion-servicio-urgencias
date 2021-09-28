package com.sofkau.implementacion.urgencias.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.implementacion.personalMedico.values.ProfesionalId;
import com.sofkau.implementacion.urgencias.values.CausaUrgencia;

public final class PersonalMedicoAgregado extends DomainEvent {
    private final ProfesionalId profesionalId;
    public PersonalMedicoAgregado(ProfesionalId profesionalId) {
        super("Hospital.urgencias.personalMedicoAgregado");
        this.profesionalId = profesionalId;
    }

    public ProfesionalId getProfesionalId() {
        return profesionalId;
    }
}
