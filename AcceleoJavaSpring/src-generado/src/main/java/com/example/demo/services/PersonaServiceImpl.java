package com.example.demo.services;


import com.example.demo.entities.Paquete1.Persona;
import com.example.demo.repositories.BaseRepository;
import com.example.demo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{

	@Autowired
	private PersonaRepository PersonaRepository;
	
	public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository){ super(baseRepository); }
}
