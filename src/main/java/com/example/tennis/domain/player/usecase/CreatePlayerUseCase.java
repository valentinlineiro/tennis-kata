package com.example.tennis.domain.player.usecase;

import com.example.tennis.domain.player.model.Player;
import com.example.tennis.domain.player.port.SavePlayerPort;
import com.example.tennis.domain.player.usecase.input.CreatePlayerUseCaseInput;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@AllArgsConstructor
public class CreatePlayerUseCase {

	private SavePlayerPort savePlayerPort;

	public Output execute(CreatePlayerUseCaseInput input) {
		return Output.builder().player(savePlayerPort.save(Player.builder().name(input.name()).build())).build();
	}

	@Value
	@Builder
	public static class Output {

		Player player;

	}

}
