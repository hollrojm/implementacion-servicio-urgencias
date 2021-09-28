package com.sofkau.implementacion.servicioHospitalizacion;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.implementacion.servicioHospitalizacion.values.FarmaciaId;
import com.sofkau.implementacion.servicioHospitalizacion.values.RegistroId;
import com.sofkau.implementacion.servicioHospitalizacion.values.ServicioHospitalizacionId;
import com.sofkau.implementacion.servicioHospitalizacion.values.Tipo;

public final class ServicioHospitalizacion extends AggregateEvent<ServicioHospitalizacionId> {

    protected Tipo tipo;
    protected RegistroId registroid;
    protected FarmaciaId farmaciaid;


    public ServicioHospitalizacion(ServicioHospitalizacionId servicioHospitalizacionId, Tipo tipo) {
        super(servicioHospitalizacionId);
    }
}
