package vf_afpa_cda24060_2.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vf_afpa_cda24060_2.api.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    // pas de code
    // en effet, @Repository nous donne accés à un CRUD
    // Héritées automatiquement de JpaRepository :
    // save(User user)
    // findById(Long id)
    // findAll()
    // deleteById(Long id)
    // delete(User user)
    // count()
    // existsById(Long id)
}
