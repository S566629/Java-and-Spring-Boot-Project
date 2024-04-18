package com.bandiClasses.DMS.repository;
/**
*
* @author S566629 - SAIKUMAR THANGALLA MUNI VENKATA
*/
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {

	List<Dog>findByName(String name);
}
