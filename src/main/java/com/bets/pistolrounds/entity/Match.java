package com.bets.pistolrounds.entity;

import com.bets.pistolrounds.entity.enums.MatchFormat;
import com.bets.pistolrounds.entity.enums.MatchLocation;
import com.bets.pistolrounds.entity.enums.PlayMap;

import java.time.Instant;
import java.util.List;

public class Match {

    private String id;
    private List<Team> teams;
    private String tournament;
    private Instant startTime;
    private MatchFormat format;
    private MatchLocation location;
    private Boolean isLive;
    private List<PlayMap> maps;


}
