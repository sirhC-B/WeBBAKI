package de.thb.webbakilogin;

import de.thb.webbakilogin.model.User;
import de.thb.webbakilogin.model.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        User user = new User();
        user.setEmail("mustermann@testmail.com");
        user.setPassword("password");
        user.setFirstName("Max");
        user.setLastName("Mustermann");

        User savedUser = repo.save(user);

        User existUser = entityManager.find(User.class, savedUser.getId());

    }
}
