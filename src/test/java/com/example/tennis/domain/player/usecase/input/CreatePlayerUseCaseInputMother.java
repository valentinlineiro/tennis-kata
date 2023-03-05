package com.example.tennis.domain.player.usecase;

import com.example.tennis.domain.player.usecase.input.CreatePlayerUseCaseInput;
import com.example.tennis.domain.player.usecase.input.CreatePlayerUseCaseInput.InputBuilder;

public class CreatePlayerUseCaseInputMother {

	public static InputBuilder rogerFederer() {
		return CreatePlayerUseCaseInput.builder().name("Roger Federer");
	}

	public static InputBuilder invalidName() {
		return CreatePlayerUseCaseInput.builder().name("");
	}

}
