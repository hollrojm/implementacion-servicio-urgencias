package com.sofkau.implementacion.servicioHospitalizacion.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofkau.implementacion.urgencias.values.CausaUrgencia;

import java.util.Objects;

public final class InformacionFarmacia implements ValueObject<String> {

    private final String value;

    public InformacionFarmacia(String value) {
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
        InformacionFarmacia that = (InformacionFarmacia) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
