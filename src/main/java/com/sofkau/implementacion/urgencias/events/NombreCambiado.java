package com.sofkau.implementacion.urgencias.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.implementacion.urgencias.values.CausaUrgencia;

public final class NombreCambiado extends DomainEvent {

    private final CausaUrgencia CausaUrgencia;

    public NombreCambiado(CausaUrgencia causaUrgencia) {
        super("hospital.urgencias.NombreCambiado");
        CausaUrgencia = causaUrgencia;
    }

    public CausaUrgencia getCausaUrgencia() {
        return CausaUrgencia;
    }
}
