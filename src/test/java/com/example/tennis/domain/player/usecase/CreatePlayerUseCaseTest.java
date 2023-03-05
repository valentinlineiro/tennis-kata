package com.example.tennis.domain.player.usecase;

import com.example.tennis.domain.player.usecase.CreatePlayerUseCase.Output;
import com.example.tennis.domain.player.usecase.input.CreatePlayerUseCaseInput;
import com.example.tennis.domain.player.usecase.input.CreatePlayerUseCaseInputMother;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreatePlayerUseCaseTest {

	private final CreatePlayerUseCase createPlayerUseCase = CreatePlayerUseCaseFactory.create();

	@Test
	void shouldCreatePlayerWhenValidDataIsProvided() {
		Output expected = CreatePlayerUseCaseOutputMother.rogerFedererCreated().build();
		CreatePlayerUseCaseInput input = CreatePlayerUseCaseInputMother.rogerFederer().build();
		assertEquals(expected, createPlayerUseCase.execute(input));
	}

}