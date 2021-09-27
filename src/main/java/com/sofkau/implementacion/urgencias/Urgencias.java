package com.sofkau.implementacion.urgencias;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.implementacion.urgencias.values.Ubicacion;
import com.sofkau.implementacion.urgencias.values.UrgenciasId;


public class Urgencias extends AggregateEvent<UrgenciasId>{


    public Urgencias(UrgenciasId entityId, Ubicacion ubicacion) {
        super(entityId);
    }
}
