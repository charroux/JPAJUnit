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
        ProgrammeurBean stroustrup = new ProgrammeurBean("Stroustrup","Bjarne","2 avenue Linux Git","linuxroot","Didier Achvar","Salsa",1969,2170,50);
        repository.save(stroustrup);
        ProgrammeurBean turing = new ProgrammeurBean("Turing","Bjarne","2 avenue Linux Git","linuxroot","Didier Achvar","Salsa",1969,2170,50);
        repository.save(turing);
    }

   /*@Test
    public void modifierSalaire(){
        ProgrammeurBean programmeur = repository.findByNom("Stroustrup");
        assertNotNull(programmeur);
       try {
           service.modifierSalaireProgrammeur(programmeur, (float)12345);
       } catch (Exception e) {
           fail("Exception non expected");
       }
   }*/

    @Test
    void exceptionTesting() {
        ProgrammeurBean programmeur = repository.findByNom("Turing");
        assertNotNull(programmeur);
        Exception exception = assertThrows(Exception.class, () -> service.modifierSalaireProgrammeur(programmeur, null));
        assertEquals("Salaire null", exception.getMessage());
    }

}
