package org.sunbird.walloffame.service;

import org.sunbird.common.model.SBApiResponse;

import java.util.Map;

/**
 * @author mahesh.vakkund
 */
public interface WallOfFameService {
    public Map<String, Object> fetchWallOfFameData();

    public SBApiResponse learnerLeaderBoard(String rootOrgId, String authToken);

    public SBApiResponse fetchingTop10Learners(String ministryOrgId, String authToken);

    public SBApiResponse getUserLeaderBoard(String authToken);

    public SBApiResponse getMdoLeaderBoard();

}
