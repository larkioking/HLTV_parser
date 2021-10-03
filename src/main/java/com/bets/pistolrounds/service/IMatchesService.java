package com.bets.pistolrounds.service;

import com.bets.pistolrounds.entity.Match;

import java.util.List;

public interface IMatchesService {

    List<Match> getUpcomingMatches();
}
