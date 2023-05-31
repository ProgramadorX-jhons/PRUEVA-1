package com.Peruva.Personas_1.Service;
//hoja numero 3
import com.Peruva.Personas_1.Entity.Personas;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    public List<Personas>listar();
    public Optional<Personas>listarId(int id);
    public int save(Personas p);
    public void delete(int id);
}
