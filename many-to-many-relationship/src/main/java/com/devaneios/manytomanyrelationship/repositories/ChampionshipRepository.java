package com.devaneios.manytomanyrelationship.repositories;

import com.devaneios.manytomanyrelationship.entities.Championship;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface ChampionshipRepository extends CrudRepository<Championship, Long> {

    @Modifying
    @Transactional
    @Query(value="INSERT INTO tb_club_championship_relationship(club_id, championship_id) VALUES (:clubId, :championshipId)", nativeQuery = true)
    void registerClubIntoChampionship(Long clubId, Long championshipId);

}
