package com.efrei.service;

import com.efrei.data.ProgrammeurBean;
import org.springframework.data.repository.CrudRepository;

public interface ProgrammeurBeanRepository extends CrudRepository<ProgrammeurBean, Integer> {

    ProgrammeurBean findByNom(String nom);

}
