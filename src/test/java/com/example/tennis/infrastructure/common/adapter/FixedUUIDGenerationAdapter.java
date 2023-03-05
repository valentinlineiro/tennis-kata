package com.example.tennis.common;

import com.example.tennis.domain.common.port.UUIDProvider;

import java.util.UUID;

public class FixedUUIDProvider implements UUIDProvider {

	@Override
	public UUID generate() {
		return UUIDMother.uuid();
	}

}
