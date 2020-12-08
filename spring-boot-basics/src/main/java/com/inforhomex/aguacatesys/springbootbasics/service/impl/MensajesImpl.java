package com.inforhomex.aguacatesys.springbootbasics.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inforhomex.aguacatesys.springbootbasics.model.Mensajes;

@Service("mensajesImpl")
public class MensajesImpl implements IService<Mensajes>{

    @Override
    public List<T> getAllObjects(){
        return null;
    }

    @Override
    public List<Map<K,V>> getAllMensajes(){
        return null;
    }

}