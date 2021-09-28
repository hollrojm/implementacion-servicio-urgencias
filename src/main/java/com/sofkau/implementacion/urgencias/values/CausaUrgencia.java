package com.sofkau.implementacion.urgencias.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CausaUrgencia implements ValueObject<String> {

    private final String value;

    public CausaUrgencia(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La Enfermedad del paciente no puede estar vacia");
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
        CausaUrgencia that = (CausaUrgencia) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
