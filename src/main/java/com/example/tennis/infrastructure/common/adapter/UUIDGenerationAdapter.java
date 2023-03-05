package com.example.tennis.infrastructure.common.adapter;

import com.example.tennis.domain.common.port.UUIDGenerationPort;

import java.util.UUID;

public class UUIDGenerationAdapter implements UUIDGenerationPort {

	@Override
	public UUID generate() {
		return UUID.randomUUID();
	}

}
