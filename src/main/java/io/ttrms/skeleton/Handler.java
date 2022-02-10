package io.ttrms.skeleton;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Handler<T, CoreT, SessionT, PacketT, StoreT> {
    @Getter(AccessLevel.PROTECTED) private final CoreT core;

    @SuppressWarnings("unused")
    public Handler() {
        this(null);
    }

    public abstract boolean handleIn(SessionT session, PacketT packet);

    public abstract PacketT handleOut(SessionT session, PacketT packet);

    public abstract void handlePostOut(SessionT session, PacketT packet);

    protected abstract StoreT getStore();
}
