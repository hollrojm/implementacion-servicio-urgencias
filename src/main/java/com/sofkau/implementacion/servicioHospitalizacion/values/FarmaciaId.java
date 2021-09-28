package com.sofkau.implementacion.servicioHospitalizacion.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkau.implementacion.urgencias.values.UrgenciasId;

public final class FarmaciaId extends Identity {

    public FarmaciaId() {
    }

    public  FarmaciaId(String id){
        super(id);
    }
    public static FarmaciaId of(String id){
        return new FarmaciaId(id);
    }
}
