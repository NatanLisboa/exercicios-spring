package com.devaneios.manytomanyrelationship.services;

import com.devaneios.manytomanyrelationship.dto.ChampionshipDto;

public interface ChampionshipService {

    void createChampionship(ChampionshipDto championshipDto);

    void registerClubIntoChampionship(Long clubId, Long championshipId);
}
