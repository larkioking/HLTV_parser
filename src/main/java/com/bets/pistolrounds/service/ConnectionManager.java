package com.bets.pistolrounds.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static com.bets.pistolrounds.utils.Constants.USER_AGENT;

@Service
public class ConnectionManager implements IConnectionManager {

    @Override
    public Document returnPage(String url) {
        Document doc = null;
        try {
            doc = Jsoup.connect(url)
                    .userAgent(USER_AGENT)
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }
}
