package com.example.tennis.domain.player.usecase;

import com.example.tennis.domain.player.model.PlayerMother;
import com.example.tennis.domain.player.usecase.CreatePlayerUseCase.Output;
import com.example.tennis.domain.player.usecase.CreatePlayerUseCase.Output.OutputBuilder;

public class CreatePlayerUseCaseOutputMother {

	public static OutputBuilder rogerFedererCreated() {
		return Output.builder().player(PlayerMother.rogerFedererWithId().build());
	}

}
