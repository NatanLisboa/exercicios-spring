package com.devaneios.manytomanyrelationship.entities;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tb_club_championship_relationship")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClubChampionshipRelationship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "club_id", unique = true)
    private Club club;

    @ManyToOne
    @JoinColumn(name = "championship_id")
    private Championship championship;

    @Builder.Default
    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = false)
    private Date registryDate = new Date();

}
