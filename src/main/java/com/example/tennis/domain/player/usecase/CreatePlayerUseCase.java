package com.example.tennis.usecase;

import com.example.tennis.common.InputValidator;
import com.example.tennis.common.UUIDProvider;
import com.example.tennis.domain.player.model.Player;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Value;

@AllArgsConstructor
public class CreatePlayerUseCase {

	private InputValidator inputValidator;
	private UUIDProvider uuidProvider;

	public Output execute(Input input) {
		inputValidator.validate(input);
		return Output.of(Player.builder().id(Player.Id.of(uuidProvider.generate())).name(input.getName()).build());
	}

	@Value(staticConstructor = "of")
	public static class Input {

		@NotBlank
		String name;

	}

	@Value(staticConstructor = "of")
	public static class Output {

		Player player;

	}

}
