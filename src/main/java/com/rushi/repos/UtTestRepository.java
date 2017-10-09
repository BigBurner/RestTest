package com.rushi.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rushi.model.UtTest;

@CrossOrigin
public interface UtTestRepository extends CrudRepository<UtTest, String>  {

}
