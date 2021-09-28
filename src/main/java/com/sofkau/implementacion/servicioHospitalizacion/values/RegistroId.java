package com.sofkau.implementacion.servicioHospitalizacion.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkau.implementacion.personalMedico.values.HistoriaClinicaId;

public final class RegistroId extends Identity {
    public RegistroId() {
    }

    public  RegistroId(String id){
        super(id);
    }
    public static RegistroId of(String id){
        return new RegistroId(id);
    }
}
