package com.sofkau.implementacion.urgencias.values;

import co.com.sofka.domain.generic.Identity;

public final class PacienteId extends Identity {
    public PacienteId() {
    }

    public  PacienteId(String id){
        super(id);
    }
    public static PacienteId of(String id){
        return new PacienteId(id);
    }
}
