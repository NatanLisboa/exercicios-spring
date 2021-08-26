package com.devaneios.polygon.entitites;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tb_polygon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Polygon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(unique = true)
    private String name;

    private int numberOfSides;

    @Builder.Default
    @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "polygon_id")
    private List<PolygonSide> sides = new ArrayList<>();

    public boolean isValid(){

        if (numberOfSides > 3 || (numberOfSides == 3 && !(sides.size() == 3))){
            return true;
        } else if (numberOfSides == 3){
            return isValidTriangle();
        }

        return false;

    }

    private boolean isValidTriangle(){

        double a = sides.get(0).getLength();
        double b = sides.get(1).getLength();
        double c = sides.get(2).getLength();

        return (a + b >= c) && (b + c >= a) && (a + c >= b);

    }

}
