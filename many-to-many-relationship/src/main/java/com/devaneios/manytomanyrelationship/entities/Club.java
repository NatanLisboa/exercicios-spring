package com.devaneios.manytomanyrelationship.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tb_club")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(unique = true)
    private String name;

    private Integer amountOfPlayers;

    private String coach;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "club_id")
    private List<ClubChampionshipRelationship> clubChampionshipRelationship;

}
