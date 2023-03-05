package com.example.tennis.infrastructure.player.adapter;

import com.example.tennis.domain.common.port.UUIDGenerationPort;
import com.example.tennis.domain.player.model.Player;
import com.example.tennis.domain.player.model.Player.Id;
import com.example.tennis.domain.player.port.SavePlayerPort;
import lombok.AllArgsConstructor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@AllArgsConstructor
public class InMemoryPlayerRepositoryAdapter implements SavePlayerPort {

	private final Map<Id, Player> players = new ConcurrentHashMap<>();

	private UUIDGenerationPort uuidGenerationPort;

	@Override
	public Player save(Player player) {
		if (player.getId() == null) {
			player.setId(new Id(uuidGenerationPort.generate()));
		}
		players.put(player.getId(), player);
		return player;
	}

}
