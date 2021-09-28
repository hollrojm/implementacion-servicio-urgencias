package com.sofkau.implementacion.urgencias;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import com.sofkau.implementacion.urgencias.values.Enfermedad;
import com.sofkau.implementacion.urgencias.values.InformacionPaciente;

public final class Paciente extends Entity {

    private final InformacionPaciente informacionPaciente;
    private final Enfermedad enfermedad;

    public Paciente(Identity entityId, InformacionPaciente informacionPaciente, Enfermedad enfermedad) {
        super(entityId);
        this.informacionPaciente = informacionPaciente;
        this.enfermedad = enfermedad;
    }
}
