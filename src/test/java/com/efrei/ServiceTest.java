package com.efrei;

import com.efrei.data.ProgrammeurBean;
import com.efrei.service.ProgrammeurBeanRepository;
import com.efrei.service.ProgrammeurService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ServiceTest {

    @Autowired
    ProgrammeurBeanRepository repository;

    @Autowired
    ProgrammeurService service;

    @BeforeEach
    public void init(){
        ProgrammeurBean linus = new ProgrammeurBean("Stroustrup","Bjarne","2 avenue Linux Git","linuxroot","Didier Achvar","Salsa",1969,2170,50);
        repository.save(linus);
    }

    @Test
    public void modifierSalaire(){
        ProgrammeurBean programmeur = repository.findByNom("Stroustrup");
        assertNotNull(programmeur);
    }

}
