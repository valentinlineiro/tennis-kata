package com.example.tennis.infrastructure.common.adapter;

import com.example.tennis.common.UUIDMother;
import com.example.tennis.domain.common.port.UUIDGenerationPort;

import java.util.UUID;

public class FixedUUIDGenerationAdapter implements UUIDGenerationPort {

	@Override
	public UUID generate() {
		return UUIDMother.uuid();
	}

}
