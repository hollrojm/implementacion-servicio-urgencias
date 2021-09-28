package com.sofkau.implementacion.urgencias.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofkau.implementacion.urgencias.Triage;

import java.util.Locale;
import java.util.Objects;
import java.util.Set;

public final class CategoriaTriage implements ValueObject<String> {

    private final String value;

    public CategoriaTriage(String value) {
        this.value = Objects.requireNonNull(value).toUpperCase(Locale.ROOT);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La Enfermedad del paciente no puede estar vacia");
        }
        if(this.value.length()>1){
            throw new IllegalArgumentException("Solo se permite A, B, C, D,");
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
        CategoriaTriage that = (CategoriaTriage) o;
        return Objects.equals(value, that.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
}
