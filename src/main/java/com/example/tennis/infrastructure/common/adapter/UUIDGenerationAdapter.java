package com.example.tennis.infrastructure.common.adapter;

import com.example.tennis.domain.common.port.UUIDProvider;

import java.util.UUID;

public class UUIDProviderAdapter implements UUIDProvider {

	@Override
	public UUID generate() {
		return UUID.randomUUID();
	}

}
