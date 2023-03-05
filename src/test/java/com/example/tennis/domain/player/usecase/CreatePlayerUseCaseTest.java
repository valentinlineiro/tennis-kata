package com.example.tennis.usecase;

import com.example.tennis.domain.player.model.InvalidPlayerException;
import com.example.tennis.domain.player.usecase.CreatePlayerUseCase;
import com.example.tennis.domain.player.usecase.CreatePlayerUseCase.Input;
import com.example.tennis.domain.player.usecase.CreatePlayerUseCase.Output;
import com.example.tennis.infrastructure.common.adapter.FixedUUIDGenerationAdapter;
import com.example.tennis.infrastructure.common.adapter.InputValidationAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CreatePlayerUseCaseTest {

	private final CreatePlayerUseCase createPlayerUseCase = new CreatePlayerUseCase(new InputValidationAdapter(), new FixedUUIDGenerationAdapter());

	@Test
	void shouldCreatePlayerWhenValidDataIsProvided() {
		Output expected = CreatePlayerUseCaseTestMother.shouldCreatePlayerWhenValidDataIsProvidedOutput();
		Input input = CreatePlayerUseCaseTestMother.shouldCreatePlayerWhenValidDataIsProvidedInput();
		assertEquals(expected, createPlayerUseCase.execute(input));
	}

	@Test
	void shouldNotCreatePlayerWhenNameIsEmpty() {
		Input input = CreatePlayerUseCaseTestMother.shouldNotCreatePlayerWhenNameIsEmptyInput();
		assertThrows(InvalidPlayerException.class, () -> createPlayerUseCase.execute(input));
	}

}