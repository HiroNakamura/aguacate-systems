package com.inforhomex.aguacatesys.springbootbasics.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.inforhomex.aguacatesys.springbootbasics.model.Mensajes;

public interface MensajesMongoRepository extends MongoRepository<Mensajes, String> {}