package io.ttrms.skeleton;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public abstract class AbstractCore<Config, Cache, Client, Server,
        Expunged, PacketManager, DiscordBot, Account> {

    protected Config config;
    protected Cache cache;
    protected Client client;
    protected Server server;
    protected Expunged expunged;
    protected PacketManager packetManager;
    protected DiscordBot discordBot;
    protected Account account;
}
