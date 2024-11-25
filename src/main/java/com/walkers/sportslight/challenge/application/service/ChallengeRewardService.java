package com.walkers.sportslight.challenge.application.service;

import com.walkers.sportslight.challenge.application.dto.ChallengeRewardMapper;
import com.walkers.sportslight.challenge.application.dto.ChallengeRewardRequest;
import com.walkers.sportslight.challenge.application.dto.RewardModifyServiceDTO;
import com.walkers.sportslight.challenge.domain.repository.ChallengeRewardRepository;
import com.walkers.sportslight.challenge.domain.service.RewardImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ChallengeRewardService {

    private final RewardImageService rewardImageService;
    private final ChallengeRewardBoardService challengeRewardBoardService;

    public long addReward(RewardModifyServiceDTO rewardInfo) {
        String rewardImageUrl=null;
        try{
            rewardImageUrl = rewardImageService.imageUpload(rewardInfo.getRewardImage());
        } catch (IOException e){
            throw new RuntimeException("파일 업로드에 실패했습니다.");
        }

        return challengeRewardBoardService.addRewardBoard(rewardInfo, rewardImageUrl);
    }

    public void changeRewardStatus(long challengeRewardId, String isChecked){
        challengeRewardBoardService.changeRewardChecked(challengeRewardId,isChecked);
    }


}