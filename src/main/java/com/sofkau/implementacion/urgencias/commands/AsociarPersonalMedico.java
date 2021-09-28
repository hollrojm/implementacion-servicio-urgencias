package com.sofkau.implementacion.urgencias.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkau.implementacion.personalMedico.values.ProfesionalId;
import com.sofkau.implementacion.urgencias.values.UrgenciasId;

public final class AsociarPersonalMedico extends Command {

    private final UrgenciasId urgenciasId;
    private final ProfesionalId profesionalId;

    public AsociarPersonalMedico(UrgenciasId urgenciasId, ProfesionalId profesionalId) {
        this.urgenciasId = urgenciasId;
        this.profesionalId = profesionalId;
    }

    public UrgenciasId getUrgenciasId() {
        return urgenciasId;
    }

    public ProfesionalId getProfesionalId() {
        return profesionalId;
    }
}
