package com.sofkau.implementacion.urgencias.values;

import co.com.sofka.domain.generic.Identity;

public final class UrgenciasId extends Identity {

    public UrgenciasId() {
    }

    public  UrgenciasId(String id){
        super(id);
    }
    public static UrgenciasId of(String id){
        return new UrgenciasId(id);
    }

}
