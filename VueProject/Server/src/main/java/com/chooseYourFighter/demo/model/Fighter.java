package com.chooseYourFighter.demo.model;

public class Fighter {
    private int fighter_id;
    private String fighter_name;
    private String fighter_genre;
    private String ability_1;
    private String ability_2;
    private String ability_3;
    private String description;

    //constructor for fighter

    public Fighter(int fighter_id, String fighter_name, String fighter_genre, String ability_1, String ability_2, String ability_3, String description) {
        this.fighter_id = fighter_id;
        this.fighter_name = fighter_name;
        this.fighter_genre = fighter_genre;
        this.ability_1 = ability_1;
        this.ability_2 = ability_2;
        this.ability_3 = ability_3;
        this.description = description;
    }

    //getters for fighter instance variables

    public int getFighterId() {
        return fighter_id;
    }

    public String getFighter_name() {
        return fighter_name;
    }

    public String getFighter_genre() {
        return fighter_genre;
    }

    public String getAbility_1() {
        return ability_1;
    }

    public String getAbility_2() {
        return ability_2;
    }

    public String getAbility_3() {
        return ability_3;
    }

    public String getDescription() {
        return description;
    }

    //setters for fighter instance variables

    public void setFighterId(int id) {
        this.fighter_id = fighter_id;
    }

    public void setFighter_name(String fighter_name) {
        this.fighter_name = fighter_name;
    }

    public void setFighter_genre(String fighter_genre) {
        this.fighter_genre = fighter_genre;
    }

    public void setAbility_1(String ability_1) {
        this.ability_1 = ability_1;
    }

    public void setAbility_2(String ability_2) {
        this.ability_2 = ability_2;
    }

    public void setAbility_3(String ability_3) {
        this.ability_3 = ability_3;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
