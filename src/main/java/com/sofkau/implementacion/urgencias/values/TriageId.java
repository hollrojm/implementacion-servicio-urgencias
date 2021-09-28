package com.sofkau.implementacion.urgencias.values;

import co.com.sofka.domain.generic.Identity;

public final class TriageId extends Identity {
    public TriageId() {
    }

    public  TriageId(String id){
        super(id);
    }
    public static TriageId of(String id){
        return new TriageId(id);
    }
}
