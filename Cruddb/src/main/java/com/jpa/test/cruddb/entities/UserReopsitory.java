package com.jpa.test.cruddb.entities;

import org.springframework.data.repository.CrudRepository;

public interface UserReopsitory  extends CrudRepository<Student,Integer>
{
}
