package com.sofkau.implementacion.urgencias;

import co.com.sofka.domain.generic.AggregateEvent;

import com.sofkau.implementacion.personalMedico.values.ProfesionalId;
import com.sofkau.implementacion.servicioHospitalizacion.values.ServicioHospitalizacionId;
import com.sofkau.implementacion.urgencias.events.PersonalMedicoAgregado;
import com.sofkau.implementacion.urgencias.events.TriageAgregado;
import com.sofkau.implementacion.urgencias.events.UrgenciaAgregada;
import com.sofkau.implementacion.urgencias.values.*;

import java.util.Objects;
import java.util.Set;


public class Urgencias extends AggregateEvent<UrgenciasId>{

    protected CausaUrgencia CausaUrgencia;
    protected ProfesionalId profesionalId;
    protected Set<Triage> triages;
    protected ServicioHospitalizacionId servicioHospitalizacionId;
    protected Paciente paciente;


    public Urgencias(UrgenciasId entityId, CausaUrgencia ubicacion) {
        super(entityId);
        appendChange(new UrgenciaAgregada(ubicacion)).apply();
    }

    public void agregarTriage(TriageId entityId, CategoriaTriage categoriaTriage, Descripcion descripcion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(categoriaTriage);
        Objects.requireNonNull(descripcion);
        appendChange(new TriageAgregado(entityId, categoriaTriage, descripcion)).apply();
    }
    public void asociarPersonalMedico(ProfesionalId profesionalId){
        appendChange(new PersonalMedicoAsociado(profesionalId)).apply();

    }
}
