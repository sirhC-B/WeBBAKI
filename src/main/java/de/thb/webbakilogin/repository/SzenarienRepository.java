package de.thb.webbakilogin.repository;

import de.thb.webbakilogin.entity.Szenarien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SzenarienRepository extends JpaRepository<Szenarien,Integer> {


   @Override
   List<Szenarien> findAll();

   @Query("SELECT name FROM szenarien")
   List<String> getAllSzena();




}
