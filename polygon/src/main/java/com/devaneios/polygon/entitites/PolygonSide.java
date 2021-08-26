package com.devaneios.polygon.entitites;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="tb_polygon_side")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PolygonSide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private double length;

    @ManyToOne
    @JoinColumn(name = "polygon_id")
    private Polygon polygon;

    public boolean isPositive(){
        return length > 0;
    }

}
