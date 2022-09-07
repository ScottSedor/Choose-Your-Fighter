package com.chooseYourFighter.demo.dao;

import com.chooseYourFighter.demo.model.Fighter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//This is the data access object model for a Fighter java object.  This DAO contains JDBC logic to parse data into an object usable in Java.
@Component
public class JdbcFighterDao implements FighterDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcFighterDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String SQL_SELECT_ALL_FIGHTERS = "SELECT fighter_id, fighter_name, fighter_genre, ability_1, ability_2, ability_3, description " +
                                                          "FROM fighter ";

    @Override
    public List<Fighter> getAllFighters() {
        List<Fighter> fighters = new ArrayList<>();
        SqlRowSet results = jdbcTemplate.queryForRowSet(SQL_SELECT_ALL_FIGHTERS);
        while(results.next()) {
            Fighter fighter = mapRowToTransfer(results);
            fighters.add(fighter);
        }
        return fighters;
    }

    private Fighter mapRowToTransfer(SqlRowSet rs) {
        return new Fighter(rs.getInt("fighter_id"),
                rs.getString("fighter_name"),
                rs.getString("fighter_genre"),
                rs.getString("ability_1"),
                rs.getString("ability_2"),
                rs.getString("ability_3"),
                rs.getString("description"));
    }

}
