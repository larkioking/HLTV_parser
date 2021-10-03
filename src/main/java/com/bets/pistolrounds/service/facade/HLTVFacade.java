package com.bets.pistolrounds.service.facade;

import com.bets.pistolrounds.entity.Match;
import com.bets.pistolrounds.service.IMatchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HLTVFacade implements IHLTVFacade {

    @Autowired
    private IMatchesService matchesService;

    @Override
    public List<Match> getUpcomingMatches() {
        return matchesService.getUpcomingMatches();
    }
}
