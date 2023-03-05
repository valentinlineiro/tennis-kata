package com.example.tennis.domain.player.port;

import com.example.tennis.infrastructure.common.adapter.FixedUUIDGenerationAdapter;
import com.example.tennis.infrastructure.player.adapter.InMemoryPlayerRepositoryAdapter;

public class SavePlayerPortFactory {

	public static SavePlayerPort create() {
		return new InMemoryPlayerRepositoryAdapter(new FixedUUIDGenerationAdapter());
	}

}
