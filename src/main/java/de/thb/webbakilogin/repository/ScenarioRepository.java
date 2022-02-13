package de.thb.webbakilogin.repository;

import de.thb.webbakilogin.entity.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScenarioRepository extends JpaRepository<Scenario, Integer> {


    @Override
    List<Scenario> findAll();

    @Query("SELECT name FROM scenario")
    List<String> findAllNames();

    @Query("SELECT name FROM scenario WHERE masterTopic=true")
    List<String> findAllMasterTopics();

    /**
     * Six Methods for each tab_id
     * @return
     */

    @Query("SELECT name FROM scenario WHERE masterTopic=true AND tab_id=1")
    List<String> getAllMastertopicsOne();

    @Query("SELECT name FROM scenario WHERE masterTopic=true AND tab_id=2")
    List<String> getAllMastertopicsTwo();

    @Query("SELECT name FROM scenario WHERE masterTopic=true AND tab_id=3")
    List<String> getAllMastertopicsThree();

    @Query("SELECT name FROM scenario WHERE masterTopic=true AND tab_id=4")
    List<String> getAllMastertopicsFour();

    @Query("SELECT name FROM scenario WHERE masterTopic=true AND tab_id=5")
    List<String> getAllMastertopicsFive();

    @Query("SELECT name FROM scenario WHERE masterTopic=true AND tab_id=6")
    List<String> getAllMastertopicsSix();

    @Query("SELECT name from scenario where masterTopic=false")
    List<String> getAllSubtopics();


}
