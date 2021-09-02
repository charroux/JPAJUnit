package com.efrei.service;

import com.efrei.data.ProgrammeurBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ProgrammeurServiceImpl implements ProgrammeurService {

    ProgrammeurBeanRepository repository;

    @Autowired
    public ProgrammeurServiceImpl(ProgrammeurBeanRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public void modifierSalaireProgrammeur(ProgrammeurBean programmeur, Float salaire) throws Exception {
        programmeur.setSalaire(salaire);
        repository.save(programmeur);
    }

}
