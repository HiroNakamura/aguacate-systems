package com.inforhomex.aguacatesys.springbootbasics.service;

import java.util.List;
import java.util.Map;

public interface IService<T>{
    List<T> getAllObjects();
    List<Map<K,V>> getAllMensajes();
}