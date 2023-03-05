package com.example.tennis.domain.player.model;

import com.example.tennis.common.UUIDMother;
import com.example.tennis.domain.player.model.Player.Id;
import com.example.tennis.domain.player.model.Player.PlayerBuilder;

public class PlayerMother {

	public static PlayerBuilder rogerFederer() {
		return Player.builder().name("Roger Federer");
	}

	public static PlayerBuilder rogerFedererWithId() {
		return rogerFederer().id(new Id(UUIDMother.uuid()));
	}

}
