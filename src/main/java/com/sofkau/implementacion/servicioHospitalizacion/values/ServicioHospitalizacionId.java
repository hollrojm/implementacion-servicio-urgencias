package com.sofkau.implementacion.servicioHospitalizacion.values;

import co.com.sofka.domain.generic.Identity;

public final class ServicioHospitalizacionId extends Identity {
    public ServicioHospitalizacionId() {
    }

    public  ServicioHospitalizacionId(String id){
        super(id);
    }
    public static ServicioHospitalizacionId of(String id){
        return new ServicioHospitalizacionId(id);
    }
}
