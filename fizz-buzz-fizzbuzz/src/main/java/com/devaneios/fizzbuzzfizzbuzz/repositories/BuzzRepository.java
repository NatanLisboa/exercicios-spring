package com.devaneios.fizzbuzzfizzbuzz.repositories;

import com.devaneios.fizzbuzzfizzbuzz.entities.BuzzNumber;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface BuzzRepository extends CrudRepository<BuzzNumber, Integer> {

    @Modifying
    @Transactional
    @Query(value="INSERT INTO tb_buzz(number) VALUES (:number)", nativeQuery = true)
    void createBuzzNumber(int number);

}
