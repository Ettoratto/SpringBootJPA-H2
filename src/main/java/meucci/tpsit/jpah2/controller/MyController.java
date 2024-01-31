package meucci.tpsit.jpah2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import meucci.tpsit.jpah2.model.Persona;
import meucci.tpsit.jpah2.repo.PersonaRepository;

@RestController
@RequestMapping("/persona")
public class MyController {
    
    @Autowired
    PersonaRepository personaRepository;

    @GetMapping("/list")
    public List<Persona> list(){
        return personaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Persona readOne(@PathVariable("id") long id){
        return personaRepository.getById(id);
    }

    @PostMapping()
    public Persona insert(@RequestBody Persona p){
        return personaRepository.save(p);
    }

}
