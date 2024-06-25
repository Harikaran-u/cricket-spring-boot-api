package com.example.player;

public class Player {
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    public Player(int id, String playerName, int jerseyNumber, String role) {
        this.playerId = id;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public int getId() {
        return this.playerId;
    }

    public void setId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return this.playerName;
    }

    public void setName(String playerName) {
        this.playerName = playerName;
    }

    public int getJerseyNumber() {
        return this.jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}