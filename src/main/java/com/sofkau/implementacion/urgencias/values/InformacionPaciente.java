package com.sofkau.implementacion.urgencias.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class InformacionPaciente implements ValueObject<String> {

    private final String value;

    public InformacionPaciente(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La Informacion del paciente no puede estar vacia");
        }
    }

    @Override
    public String value() {
        return null;
    }
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return  false;
        InformacionPaciente that = (InformacionPaciente) o;
        return Objects.equals(value, that.value);
    }
    public int hashCode(){
        return Objects.hash(value);
    }
}
