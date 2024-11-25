package com.walkers.sportslight.userStat.command.application.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class UserStatUpdateDTO {
    private List<UserStatDTO> upgrades;

}