package by.academy.repository;

import by.academy.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class TestSpringUserInterface implements UserRepositoryInterface{
    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public Optional<User> findOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findAll(int limit, int offset) {
        return null;
    }

    @Override
    public User create(User object) {
        return null;
    }

    @Override
    public User update(User object) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }



//    @Override
//    public List<User> findNameSurnameParam(String K) {
//        return null;
//    }

    @Override
    public Map<String, String> getUserStats() {
        return null;
    }

    @Override
    public Optional<User> findByLogin(String login) {
        return Optional.empty();
    }
}
