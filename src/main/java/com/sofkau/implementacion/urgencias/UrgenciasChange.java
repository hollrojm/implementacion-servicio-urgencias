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

        apply((TriageAgregado event)->{
            var numTriage = urgencias.triages().size();
            if(numTriage == 100){
                throw new IllegalArgumentException("No puedes agregar mas Triages solo hasta 100.");

            }
        });

        apply((UrgenciaAgregada event)->{
            urgencias.CausaUrgencia = event.getCausaUrgencia();
        });
        apply((CategoriaTriageActualizada event)->{
            var triage = urgencias.getCausaUrgenciaporId(event.getTriageId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la funcion del triage"));
                     triage.actualizarTriage(event.
                    getCategoriaTriage());
        });

    }
}
