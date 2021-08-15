package com.devaneios.fizzbuzzfizzbuzz.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_fizz")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FizzNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer number;

}
