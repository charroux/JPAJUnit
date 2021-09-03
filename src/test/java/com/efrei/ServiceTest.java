package com.efrei;

import com.efrei.data.ProgrammeurBean;
import com.efrei.service.ProgrammeurBeanRepository;
import com.efrei.service.ProgrammeurService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ServiceTest {

    @Autowired
    ProgrammeurBeanRepository repository;

    @Autowired
    ProgrammeurService service;

    @BeforeEach
    public void populateDatabase(){
        ProgrammeurBean stroustrup = new ProgrammeurBean("Stroustrup","Bjarne","2 avenue Linux Git","linuxroot","Didier Achvar","Salsa",1969,2170,50);
        repository.save(stroustrup);
    }

    @AfterEach
    public void cleanDatabase(){
        ProgrammeurBean programmeur = repository.findByNom("Stroustrup");
        repository.delete((programmeur));
    }

   @Test
   @Order(2)
    public void modifierSalaire(){
        ProgrammeurBean programmeur = repository.findByNom("Stroustrup");
        assertNotNull(programmeur);
       try {
           service.modifierSalaireProgrammeur(programmeur, (float)12345);
       } catch (Exception e) {
           fail("Exception non expected");
       }
   }

    @Test
    @Order(1)
    void exceptionTesting() {
        ProgrammeurBean programmeur = repository.findByNom("Stroustrup");
        assertNotNull(programmeur);
        Exception exception = assertThrows(Exception.class, () -> service.modifierSalaireProgrammeur(programmeur, null));
        assertEquals("Salaire null", exception.getMessage());
    }

}
