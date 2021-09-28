package com.sofkau.implementacion.servicioHospitalizacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class InformacionRegistro implements ValueObject<String> {

    private final String value;

    public InformacionRegistro(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La Infromacion de la farmacia no puede estar vacia");
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
        InformacionRegistro that = (InformacionRegistro) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
