package com.aguacate.aguacate.genericos;

import java.util.List;

public interface Generica<T>{
    public abstract void merge(T clase);
    public abstract void delete(T clase);
}