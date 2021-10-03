package com.bets.pistolrounds.service;

import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

public interface IConnectionManager {

    Document returnPage(String url);
}
