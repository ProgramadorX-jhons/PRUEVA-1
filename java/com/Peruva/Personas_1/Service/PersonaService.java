package com.Peruva.Personas_1.Service;

import com.Peruva.Personas_1.Entity.Personas;
import com.Peruva.Personas_1.Repository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements  IPersonaService{

    @Autowired
    private IPersonaRepo data;
    @Override
    public List<Personas> listar() {
        return (List<Personas>)data.findAll();
    }

    @Override
    public Optional<Personas> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Personas p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
