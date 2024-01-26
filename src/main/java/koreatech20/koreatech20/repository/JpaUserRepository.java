package koreatech20.koreatech20.repository;

import koreatech20.koreatech20.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JpaUserRepository extends JpaRepository<User, Long>, UserRepository {
    @Override
    User save(User user);

    @Override
    Optional<User> findById(Long id);

    @Override
    Optional<User> findByName(String name);

    @Override
    List<User> findAll();
}
