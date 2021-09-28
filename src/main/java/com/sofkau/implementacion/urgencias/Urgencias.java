package com.sofkau.implementacion.urgencias;

import co.com.sofka.domain.generic.AggregateEvent;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkau.implementacion.personalMedico.values.ProfesionalId;
import com.sofkau.implementacion.servicioHospitalizacion.values.ServicioHospitalizacionId;
import com.sofkau.implementacion.urgencias.events.*;
import com.sofkau.implementacion.urgencias.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Urgencias extends AggregateEvent<UrgenciasId>{

    protected CausaUrgencia CausaUrgencia;
    protected ProfesionalId profesionalId;
    protected CategoriaTriage triages;
    protected ServicioHospitalizacionId servicioHospitalizacionId;
    protected Paciente paciente;


    public Urgencias(UrgenciasId urgenciasId, CausaUrgencia causaUrgencia) {
        super(urgenciasId);
        appendChange(new UrgenciaAgregada(causaUrgencia)).apply();
    }

    private Urgencias(UrgenciasId urgenciasId){
        super(urgenciasId);
        subscribe(new UrgenciasChange(this));

    }
    public static Urgencias from(UrgenciasId urgenciasId, List<DomainEvent> events){
        var urgencias = new Urgencias(urgenciasId);
        events.forEach(urgencias::applyEvent);
        return urgencias;

    }

    public void agregarTriage(TriageId entityId, CategoriaTriage categoriaTriage, Descripcion descripcion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(categoriaTriage);
        Objects.requireNonNull(descripcion);
        appendChange(new TriageAgregado(entityId, categoriaTriage, descripcion)).apply();
    }
    public void asociarPersonalMedico(ProfesionalId profesionalId){
        appendChange(new PersonalMedicoAgregado(profesionalId)).apply();

    }
    public void cambiarCausaUrgencia(CausaUrgencia CausaUrgencia){
        appendChange(new NombreCambiado(CausaUrgencia)).apply();
    }
    public void actualizarCategoriaTriage(TriageId entityId, CategoriaTriage categoriaTriage ){
        appendChange(new CategoriaTriageActualizada(entityId, categoriaTriage)).apply();

    }


    public ProfesionalId ProfesionalId() {
        return profesionalId;
    }


    public ServicioHospitalizacionId ServicioHospitalizacionId() {
        return servicioHospitalizacionId;
    }

    public Paciente Paciente() {
        return paciente;
    }
}
