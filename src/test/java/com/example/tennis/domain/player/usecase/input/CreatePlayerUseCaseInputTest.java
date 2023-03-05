package com.example.tennis.domain.player.usecase.input;

import com.example.tennis.domain.player.model.InvalidPlayerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatePlayerUseCaseInputTest {

	@Test
	void shouldAllowValidInput() {
		assertDoesNotThrow(() -> CreatePlayerUseCaseInputMother.rogerFederer().build());
	}

	@Test
	void shouldNotAllowBlankName() {
		InvalidPlayerException result = assertThrows(InvalidPlayerException.class, () -> CreatePlayerUseCaseInputMother.invalidName().build());
		assertEquals("Player name is required", result.getMessage());
	}

}