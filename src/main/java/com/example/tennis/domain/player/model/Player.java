package com.example.tennis.domain.player.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

import static java.util.Objects.requireNonNull;

@Data
@Builder
public class Player {

	private Id id;

	private String name;

	public record Id(UUID value) {

		public Id {
			requireNonNull(value);
		}

	}
}
