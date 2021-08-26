package com.devaneios.polygon.services.impl;

import com.devaneios.polygon.entitites.PolygonSide;
import com.devaneios.polygon.exceptions.NonPositiveSideValueReceivedException;
import com.devaneios.polygon.exceptions.PolygonNotFoundException;
import com.devaneios.polygon.exceptions.TriangleNotValidException;
import com.devaneios.polygon.repositories.PolygonRepository;
import com.devaneios.polygon.repositories.PolygonSideRepository;
import com.devaneios.polygon.services.PolygonSideService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PolygonSideServiceImpl implements PolygonSideService {

    private final PolygonRepository polygonRepository;
    private final PolygonSideRepository polygonSideRepository;

    @Override
    public void registerPolygonSide(double length, Long polygonId) {

        PolygonSide polygonSide = PolygonSide.builder()
                .length(length)
                .polygon(polygonRepository.findById(polygonId).orElseThrow(PolygonNotFoundException::new))
                .build();

        int polygonNumberOfSides = polygonSide.getPolygon().getNumberOfSides();
        int polygonSidesListSize = polygonSide.getPolygon().getSides().size();

        if (polygonSide.isPositive() && polygonSidesListSize < polygonNumberOfSides) {
            this.polygonSideRepository.save(polygonSide);
        } else if (!(polygonSidesListSize < polygonNumberOfSides)) {
            throw new IndexOutOfBoundsException("Não é possível cadastrar mais lados nesse polígono");
        } else {
            throw new NonPositiveSideValueReceivedException();
        }

        if (polygonSidesListSize == 2) {

            polygonSide.getPolygon().getSides().add(polygonSide);

            if (!polygonSide.getPolygon().isValid()) {
                this.polygonSideRepository.delete(polygonSide);
                throw new TriangleNotValidException();
            }

        }

    }

}
