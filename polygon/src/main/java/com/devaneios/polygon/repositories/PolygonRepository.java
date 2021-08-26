package com.devaneios.polygon.repositories;

import com.devaneios.polygon.entitites.Polygon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolygonRepository extends CrudRepository<Polygon, Long> {

    boolean existsByName(String name);

}
