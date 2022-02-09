package io.ttrms.skeleton;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public abstract class AbstractCore<Config, Cache, Client, Server, Expunged, PacketManager, DiscordBot, Account, Crypt> {
    protected Config config;
    protected Cache cache;
    protected Client client;
    protected Server server;
    protected Expunged expunged;
    protected PacketManager packetManager;
    protected DiscordBot bot;
    @Setter protected Account account;
    @Setter protected Crypt crypt;
}
