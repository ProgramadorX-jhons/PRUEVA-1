package com.Peruva.Personas_1.Repository;
//hoja numero 2
import com.Peruva.Personas_1.Entity.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepo  extends JpaRepository<Personas, Integer> {
}
