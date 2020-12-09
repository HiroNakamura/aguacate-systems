package com.inforhomex.aguacatesys.springbootbasics.service;

import java.util.List;

public interface IService<T>{
    List<T> getAllObjects();
}