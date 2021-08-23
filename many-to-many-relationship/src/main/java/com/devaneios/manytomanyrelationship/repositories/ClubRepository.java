package com.devaneios.manytomanyrelationship.repositories;

import com.devaneios.manytomanyrelationship.entities.Club;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends CrudRepository<Club, Long> {

}
