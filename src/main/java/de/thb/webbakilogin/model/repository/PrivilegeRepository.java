package de.thb.webbakilogin.model.repository;

import de.thb.webbakilogin.model.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege, Long>{
    Privilege findByName(String name);
}
