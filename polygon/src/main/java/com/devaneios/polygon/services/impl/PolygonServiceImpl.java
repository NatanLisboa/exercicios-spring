package com.devaneios.polygon.services.impl;

import com.devaneios.polygon.dto.PolygonDto;
import com.devaneios.polygon.entitites.Polygon;
import com.devaneios.polygon.exceptions.AlreadyRegisteredPolygonException;
import com.devaneios.polygon.exceptions.PolygonNotValidException;
import com.devaneios.polygon.repositories.PolygonRepository;
import com.devaneios.polygon.services.PolygonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PolygonServiceImpl implements PolygonService {

    private final PolygonRepository polygonRepository;

    public void registerPolygon(PolygonDto polygonDto){
        Polygon polygon = Polygon.builder()
                .name(polygonDto.getName())
                .numberOfSides(polygonDto.getNumberOfSides())
                .build();

        if (polygon.isValid() && !polygonRepository.existsByName(polygon.getName())) {
            this.polygonRepository.save(polygon);
        } else if (!polygon.isValid()) {
            throw new PolygonNotValidException();
        } else {
            throw new AlreadyRegisteredPolygonException();
        }

    }

}
