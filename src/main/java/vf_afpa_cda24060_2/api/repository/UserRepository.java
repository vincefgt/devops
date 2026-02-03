package vf_afpa_cda24060_2.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vf_afpa_cda24060_2.api.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
