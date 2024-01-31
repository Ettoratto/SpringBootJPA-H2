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
        return personaRepository.findById(id).get();
    }

    @PostMapping()
    public Persona insert(@RequestBody Persona p){
        return personaRepository.save(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        personaRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Persona update(@PathVariable("id") long id, @RequestBody Persona p){
        p.setId(id);
        return personaRepository.save(p);
    }

}
