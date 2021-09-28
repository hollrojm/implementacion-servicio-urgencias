package com.sofkau.implementacion.urgencias;

import co.com.sofka.domain.generic.EventChange;
import com.sofkau.implementacion.personalMedico.PersonalMedico;
import com.sofkau.implementacion.urgencias.events.*;

import java.util.HashSet;

public final class UrgenciasChange extends EventChange {
    public UrgenciasChange(Urgencias urgencias) {

        apply((PersonalMedicoAsociado event)->{
            urgencias.triages = event.getCategoriaTriage();

        });
        apply((NombreCambiado event)->{
            urgencias.paciente.equals(event.getCausaUrgencia());

        });


        apply((PersonalMedicoAgregado event)->{
            urgencias.profesionalId = event.getProfesionalId();
        });



        //apply((UrgenciaAgregada event)->{
           // urgencias.CausaUrgencia = event.getCausaUrgencia();
        //});
        //apply((CategoriaTriageActualizada event)->{
            //var triage = urgencias.getCausaUrgencia()(event.getTriageId())
                    //./orElseThrow(() -> new IllegalArgumentException("No se encuentra la funcion del triage"));
                     //triage.actualizarTriage(event.
                    //getCategoriaTriage());
        //});

    }
}
