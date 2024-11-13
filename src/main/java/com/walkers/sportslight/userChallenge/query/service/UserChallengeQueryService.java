package com.walkers.sportslight.userChallenge.query.service;

import com.walkers.sportslight.userChallenge.query.dto.UserChallengeResponseDTO;
import com.walkers.sportslight.userChallenge.query.repository.UserChallengeQueryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserChallengeQueryService {

    private UserChallengeQueryRepository userChallengeQueryRepository;

    public UserChallengeQueryService(UserChallengeQueryRepository userChallengeQueryRepository) {
        this.userChallengeQueryRepository = userChallengeQueryRepository;
    }

    public List<UserChallengeResponseDTO> findByUserNo(long userNo){
        System.out.println("userNo: "+ userNo);
        return userChallengeQueryRepository.findByUserNo(userNo);
    }


    public UserChallengeResponseDTO findUserChallengeRecord(long userNo, long challengeId) {
        return null;
    }
}