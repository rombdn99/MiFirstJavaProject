package com.netmind.model;

import java.util.UUID;

public class NetmindObject {
	private final UUID uuid;

	public NetmindObject() {
		uuid = UUID.randomUUID();
	}

	public NetmindObject(UUID uuid) {
		this.uuid = uuid;
	}

	public UUID getUuid() {
		return uuid;
	}

}
