package com.devaneios.manytomanyrelationship.dto;

import com.devaneios.manytomanyrelationship.enums.ChampionshipFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChampionshipDto {

    private String name;

    private Date startDate;

    private Date endDate;

    private ChampionshipFormat format;

    private Integer maxNumberOfClubs;

}
