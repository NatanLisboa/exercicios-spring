package com.devaneios.manytomanyrelationship.services.impl;

import com.devaneios.manytomanyrelationship.dto.ChampionshipDto;
import com.devaneios.manytomanyrelationship.entities.Championship;
import com.devaneios.manytomanyrelationship.repositories.ChampionshipRepository;
import com.devaneios.manytomanyrelationship.services.ChampionshipService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChampionshipServiceImpl implements ChampionshipService {

    private final ChampionshipRepository championshipRepository;

    @Override
    public void createChampionship(ChampionshipDto championshipDto) {
        Championship championship = Championship.builder()
                                    .name(championshipDto.getName())
                                    .startDate(championshipDto.getStartDate())
                                    .endDate(championshipDto.getEndDate())
                                    .format(championshipDto.getFormat())
                                    .maxNumberOfClubs(championshipDto.getMaxNumberOfClubs())
                                    .build();
        championshipRepository.save(championship);
    }

    @Override
    public void registerClubIntoChampionship(Long clubId, Long championshipId) {
        this.championshipRepository.registerClubIntoChampionship(clubId, championshipId);
    }

}
