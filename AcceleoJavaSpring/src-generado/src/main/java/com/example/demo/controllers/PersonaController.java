package com.example.demo.controllers;

import com.example.demo.entities.Paquete1.Persona;
import com.example.demo.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/persona")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{

}
