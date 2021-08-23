package com.devaneios.manytomanyrelationship.entities;

import com.devaneios.manytomanyrelationship.enums.ChampionshipFormat;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_championship")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Championship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(unique = true)
    private String name;

    private Date startDate;

    private Date endDate;

    private ChampionshipFormat format;

    private Integer maxNumberOfClubs;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "championship_id")
    private List<ClubChampionshipRelationship> championshipClubRelationship;

}
