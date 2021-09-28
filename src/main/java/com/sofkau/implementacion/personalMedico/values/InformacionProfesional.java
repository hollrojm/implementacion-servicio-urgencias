package com.sofkau.implementacion.personalMedico.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofkau.implementacion.servicioHospitalizacion.values.InformacionRegistro;

import java.util.Objects;

public final class InformacionProfesional implements ValueObject<String> {

    private final String value;

    public InformacionProfesional(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La Informacion del profesional no puede estar vacia");
        }
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return  false;
        InformacionProfesional that = (InformacionProfesional) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
