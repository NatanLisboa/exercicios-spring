package com.devaneios.fizzbuzzfizzbuzz.repositories;

import com.devaneios.fizzbuzzfizzbuzz.entities.FizzNumber;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface FizzRepository extends CrudRepository<FizzNumber, Integer> {

    @Modifying
    @Transactional
    @Query(value="INSERT INTO tb_fizz(number) VALUES (:number)", nativeQuery = true)
    void createFizzNumber(int number);

}
