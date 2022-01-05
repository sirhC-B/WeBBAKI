package de.thb.webbakilogin.repository;

import de.thb.webbakilogin.entity.Szenarien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SzenarienRepository extends JpaRepository<Szenarien, Integer> {


    @Override
    List<Szenarien> findAll();

    @Query("SELECT name FROM szenarien")
    List<String> getAllSzena();

    @Query("SELECT name FROM szenarien WHERE mastertopic=true")
    List<String> getAllMaster();

    /**
     * Six Methods for each tab_id
     * @return
     */

    @Query("SELECT name FROM szenarien WHERE mastertopic=true AND tab_id=1")
    List<String> getAllMastertopicsOne();

    @Query("SELECT name FROM szenarien WHERE mastertopic=true AND tab_id=2")
    List<String> getAllMastertopicsTwo();

    @Query("SELECT name FROM szenarien WHERE mastertopic=true AND tab_id=3")
    List<String> getAllMastertopicsThree();

    @Query("SELECT name FROM szenarien WHERE mastertopic=true AND tab_id=4")
    List<String> getAllMastertopicsFour();

    @Query("SELECT name FROM szenarien WHERE mastertopic=true AND tab_id=5")
    List<String> getAllMastertopicsFive();

    @Query("SELECT name FROM szenarien WHERE mastertopic=true AND tab_id=6")
    List<String> getAllMastertopicsSix();

    @Query("SELECT name from szenarien where mastertopic=false")
    List<String> getAllSubtopics();


}
