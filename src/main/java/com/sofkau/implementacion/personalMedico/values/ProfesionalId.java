package com.sofkau.implementacion.personalMedico.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkau.implementacion.urgencias.values.PacienteId;

public final class ProfesionalId extends Identity {
    public ProfesionalId() {
    }

    public  ProfesionalId(String id){
        super(id);
    }
    public static ProfesionalId of(String id){
        return new ProfesionalId(id);
    }
}
