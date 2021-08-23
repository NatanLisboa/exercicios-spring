package com.devaneios.manytomanyrelationship.services.impl;

import com.devaneios.manytomanyrelationship.dto.ClubDto;
import com.devaneios.manytomanyrelationship.entities.Club;
import com.devaneios.manytomanyrelationship.repositories.ClubRepository;
import com.devaneios.manytomanyrelationship.services.ClubService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClubServiceImpl implements ClubService {

    private final ClubRepository clubRepository;

    @Override
    public void createClub(ClubDto clubDto) {
        Club club = Club.builder()
                .name(clubDto.getName())
                .amountOfPlayers(clubDto.getAmountOfPlayers())
                .coach(clubDto.getCoach())
                .build();
        clubRepository.save(club);
    }

}
