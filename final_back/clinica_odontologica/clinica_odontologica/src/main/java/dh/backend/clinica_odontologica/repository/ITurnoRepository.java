package dh.backend.clinica_odontologica.repository;

import dh.backend.clinica_odontologica.entity.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Integer> {

    @Query("Select t from Turno t where t.fecha BETWEEN :startDate and :endDate")
    List<Turno> buscarTurnoEntreFechas(@Param("startDate") LocalDate startDate, @Param("endDate")LocalDate endDate);
}
