package com.inforhomex.aguacatesys.springbootbasics.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inforhomex.aguacatesys.springbootbasics.service.IService;
import com.inforhomex.aguacatesys.springbootbasics.model.Mensajes;
import com.inforhomex.aguacatesys.springbootbasics.repository.MensajesMongoRepository;
import java.util.List;

@Service("mensajesImpl")
public class MensajesImpl implements IService<Mensajes>{

    @Autowired
    private MensajesMongoRepository mensajesMongoRepository;

    @Override
    public List<Mensajes> getAllObjects(){
        return mensajesMongoRepository.findAll();
    }

}