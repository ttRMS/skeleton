package io.ttrms.skeleton;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Handler<T, CoreT, SessionT, PacketT> {
    @Getter(AccessLevel.PROTECTED) private final CoreT core;

    @SuppressWarnings("unused")
    public Handler() {
        this(null);
    }

    /**
     * Do something with the provided packet and decides if it should be forwarded to a connected player
     *
     * @return true if the packet should be forwarded, false to drop the packet
     */
    @SuppressWarnings("unchecked")
    public boolean handle(SessionT session, PacketT packet) {
        return apply(session, (T) packet);
    }

    protected abstract boolean apply(SessionT session, T packet);

    protected abstract IStore getStore();
}
