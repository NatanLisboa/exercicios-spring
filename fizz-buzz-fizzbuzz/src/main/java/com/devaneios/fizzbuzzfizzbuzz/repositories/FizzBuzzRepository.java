package com.devaneios.fizzbuzzfizzbuzz.repositories;

import com.devaneios.fizzbuzzfizzbuzz.entities.FizzBuzzNumber;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
public interface FizzBuzzRepository extends CrudRepository<FizzBuzzNumber, Integer> {

    @Modifying
    @Transactional
    @Query(value="INSERT INTO tb_fizz_buzz(number) VALUES (:number)", nativeQuery = true)
    void createFizzBuzzNumber(int number);

    @Query(value = "SELECT number FROM tb_fizz_buzz", nativeQuery = true)
    ArrayList<Integer> getAllFizzBuzzNumbers();
}
