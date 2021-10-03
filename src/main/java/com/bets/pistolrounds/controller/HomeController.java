package com.bets.pistolrounds.controller;

import com.bets.pistolrounds.service.IConnectionManager;
import com.bets.pistolrounds.service.facade.IHLTVFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private IHLTVFacade hltvFacade;

    @GetMapping("/home")
    public String getHomePage(Model model) {
        hltvFacade.getUpcomingMatches();
        return "home_page";
    }


}
