package com.example.player;

import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.example.player.PlayerService;

@RestController
public class PlayerController {
    PlayerService newService = new PlayerService();

    @GetMapping("/")
    public ArrayList<Player> getPlayers() {
        return newService.getPlayers();
    }

    @PostMapping("/players")

    public Player addPlayer(@RequestBody Player player) {
        return newService.addPlayer(player);
    }
}