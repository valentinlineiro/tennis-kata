package com.example.tennis.domain.player.usecase;

import com.example.tennis.domain.player.port.SavePlayerPortFactory;

public class CreatePlayerUseCaseFactory {

	public static CreatePlayerUseCase create() {
		return new CreatePlayerUseCase(SavePlayerPortFactory.create());
	}

}
