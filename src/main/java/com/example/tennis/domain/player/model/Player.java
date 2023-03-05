package com.example.tennis.model;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.UUID;

@Data
@Builder
public class Player {

	private Id id;

	private String name;

	@Value(staticConstructor = "of")
	public static class Id {

		UUID value;

	}
}
