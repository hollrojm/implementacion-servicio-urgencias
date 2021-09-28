package com.sofkau.implementacion.personalMedico;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkau.implementacion.personalMedico.values.HistoriaClinicaId;
import com.sofkau.implementacion.personalMedico.values.HojaDeVida;
import com.sofkau.implementacion.personalMedico.values.PersonalMedicoId;
import com.sofkau.implementacion.personalMedico.values.ProfesionalId;

public final class PersonalMedico extends AggregateEvent<PersonalMedicoId> {

    protected HistoriaClinicaId historiaClinicaId;
    protected ProfesionalId profesionalId;
    protected HojaDeVida hojaDeVida;


    public PersonalMedico(PersonalMedicoId personalMedicoId, HojaDeVida hojaDeVida) {
        super(personalMedicoId);
    }
}
