package io.ttrms.skeleton;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public abstract class AbstractCore<ConfigT, CacheT, ClientT, ServerT, ExpungedT, PacketManagerT, DiscordBotT, AccountT, CryptT> {
    protected ConfigT config;
    protected CacheT cache;
    protected ClientT client;
    protected ServerT server;
    protected ExpungedT expunged;
    protected PacketManagerT packetManager;
    protected DiscordBotT bot;
    @Setter protected AccountT account;
    @Setter protected CryptT crypt;
}
