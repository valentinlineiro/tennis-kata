package com.example.tennis.domain.player.usecase.input;

import com.example.tennis.domain.player.model.InvalidPlayerException;
import lombok.Builder;

@Builder
public record CreatePlayerUseCaseInput(String name) {

	public CreatePlayerUseCaseInput {
		if (name == null || name.isBlank()) {
			throw new InvalidPlayerException("Player name is required");
		}
	}

}
