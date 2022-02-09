package io.ttrms.skeleton;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class AbstractPacketManager<Core extends AbstractCore<?, ?, ?, ?, ?, ?, ?, ?, ?>, ServerListener, ClientListener> {
    @Getter protected final Core core;
    protected ServerListener serverListener;
    protected ClientListener clientListener;
}
