package io.ttrms.skeleton;

public abstract class AbstractPacketManager<Core extends AbstractCore<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, ServerListener, ClientListener> {
    protected Core abstractCore;
}
