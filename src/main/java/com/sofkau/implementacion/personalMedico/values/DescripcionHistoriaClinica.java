package com.sofkau.implementacion.personalMedico.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class DescripcionHistoriaClinica implements ValueObject<String> {

    private final String value;

    public DescripcionHistoriaClinica(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La Historia clinica no puede estar vacia");
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
        DescripcionHistoriaClinica that = (DescripcionHistoriaClinica) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
