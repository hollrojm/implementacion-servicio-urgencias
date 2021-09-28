package com.sofkau.implementacion.personalMedico.values;

import co.com.sofka.domain.generic.Identity;

public final class PersonalMedicoId extends Identity {

    public PersonalMedicoId() {
    }

    public  PersonalMedicoId(String id){
        super(id);
    }
    public static HistoriaClinicaId of(String id){
        return new HistoriaClinicaId(id);
    }
}
