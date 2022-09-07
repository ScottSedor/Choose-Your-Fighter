package com.chooseYourFighter.demo.controller;

import com.chooseYourFighter.demo.dao.FighterDao;
import com.chooseYourFighter.demo.model.Fighter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/")
public class FighterController {

    private FighterDao fighterDao;

    public FighterController(FighterDao fighterDao){this.fighterDao = fighterDao;}

    @RequestMapping(value="/fighterList", method = RequestMethod.GET)
    public List<Fighter> getFullFightersList() {
        return fighterDao.getAllFighters();
    }

}
