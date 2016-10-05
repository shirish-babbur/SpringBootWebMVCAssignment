package org.webonise.springmvcwebapplication.Repository;

import org.springframework.data.repository.CrudRepository;
import org.webonise.springmvcwebapplication.Model.Users;

public interface UserRepository extends CrudRepository<Users, Integer> {

}
