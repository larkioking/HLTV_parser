package com.bets.pistolrounds.service;

import com.bets.pistolrounds.entity.Match;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

import static com.bets.pistolrounds.utils.URLConstants.HLTV_URL;
import static com.bets.pistolrounds.utils.URLConstants.MATCHES;
import static com.bets.pistolrounds.utils.CSSClassConstants.UPCOMING_MATCHES;

@Service
public class MatchesService implements IMatchesService {

    @Autowired
    IConnectionManager connectionManager;

    @Override
    public List<Match> getUpcomingMatches() {
        Document matchesPage = connectionManager.returnPage(HLTV_URL + MATCHES);
        Elements matches = matchesPage.getElementsByClass(UPCOMING_MATCHES);

        return Collections.emptyList();
    }
}
