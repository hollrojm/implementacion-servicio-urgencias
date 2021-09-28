package com.sofkau.implementacion.personalMedico.values;

import co.com.sofka.domain.generic.Identity;

public final class HistoriaClinicaId extends Identity {
    public HistoriaClinicaId() {
    }

    public  HistoriaClinicaId(String id){
        super(id);
    }
    public static HistoriaClinicaId of(String id){
        return new HistoriaClinicaId(id);
    }
}
