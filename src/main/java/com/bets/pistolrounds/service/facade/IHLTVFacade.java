package com.bets.pistolrounds.service.facade;

import com.bets.pistolrounds.entity.Match;

import java.util.List;

public interface IHLTVFacade {

    List<Match> getUpcomingMatches();
}
