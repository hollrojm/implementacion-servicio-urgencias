package com.sofkau.implementacion.urgencias.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.implementacion.urgencias.values.CausaUrgencia;

public final class UrgenciaAgregada extends DomainEvent {
    private final CausaUrgencia causaUrgencia;

    public UrgenciaAgregada(CausaUrgencia causaUrgencia) {
        super("hospital.urgencias.servicioCreado");
        this.causaUrgencia = causaUrgencia;
    }

    public CausaUrgencia getCausaUrgencia() {
        return causaUrgencia;
    }
}
