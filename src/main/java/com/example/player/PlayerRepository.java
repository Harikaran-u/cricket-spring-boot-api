package com.example.player;

import java.util.ArrayList;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player addPlayer(Player player);

}