package com.walkers.sportslight.user.DTO;

import com.walkers.sportslight.user.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserRegistMapper {
    UserRegistMapper INSTANCE = Mappers.getMapper(UserRegistMapper.class);

    User toUser(UserRegistDTO userRegistInfo);
}
