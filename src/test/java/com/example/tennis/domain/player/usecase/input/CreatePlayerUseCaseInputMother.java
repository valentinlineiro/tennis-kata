package com.example.tennis.domain.player.usecase.input;

import com.example.tennis.domain.player.usecase.input.CreatePlayerUseCaseInput.CreatePlayerUseCaseInputBuilder;

public class CreatePlayerUseCaseInputMother {

	public static CreatePlayerUseCaseInputBuilder rogerFederer() {
		return CreatePlayerUseCaseInput.builder().name("Roger Federer");
	}

	public static CreatePlayerUseCaseInputBuilder invalidName() {
		return CreatePlayerUseCaseInput.builder().name("");
	}

}
