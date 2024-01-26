package koreatech20.koreatech20.repository;

import koreatech20.koreatech20.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    Optional<User> findByName(String name);
    List<User> findAll();
}
