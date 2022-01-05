package de.thb.webbakilogin.service;

import de.thb.webbakilogin.entity.Szenarien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface SzenarioService  {

    List<String> szenarioGetAllSzena();
    List<String> szenarioGetAllMaster();
    List<String> szenarioGetAllSubs();

    /**
     * Six methods for each tab_id
     */

    List<String> getAllMastertopicsOne();

    List<String> getAllMastertopicsTwo();

    List<String> getAllMastertopicsThree();

    List<String> getAllMastertopicsFour();

    List<String> getAllMastertopicsFive();

    List<String> getAllMastertopicsSix();

}
