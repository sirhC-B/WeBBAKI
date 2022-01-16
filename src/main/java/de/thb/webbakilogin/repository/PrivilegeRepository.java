package de.thb.webbakilogin.repository;

import de.thb.webbakilogin.entity.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilegeRepository extends JpaRepository<Privilege, Long>{
    Privilege findByName(String name);
}
