package com.devaneios.polygon.repositories;

import com.devaneios.polygon.entitites.PolygonSide;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolygonSideRepository extends CrudRepository<PolygonSide, Long> {



}
