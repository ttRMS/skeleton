package io.ttrms.skeleton;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class Handlers {

    public abstract static class IncomingHandler<T, Core, Session, Packet> extends Handler<T, Core, Session, Packet> {
        public IncomingHandler(Core core) {
            super(core);
        }
    }

    public abstract static class OutgoingHandler<T, Core, Session, Packet> extends Handler<T, Core, Session, Packet> {
        public OutgoingHandler(Core core) {
            super(core);
        }
    }

    public abstract static class PostOutgoingHandler<T, Core, Session, Packet> extends Handler<T, Core, Session, Packet> {
        public PostOutgoingHandler(Core core) {
            super(core);
        }
    }

    @RequiredArgsConstructor
    public abstract static class Handler<T, Core, Session, Packet> {
        @Getter(AccessLevel.PROTECTED) private final Core core;

        /**
         * Do something with the provided packet and decides if it should be forwarded to a connected player
         *
         * @return true if the packet should be forwarded, false to drop the packet
         */
        @SuppressWarnings("unchecked")
        public boolean handle(Session session, Packet packet) {
            return apply(session, (T) packet);
        }

        protected abstract boolean apply(Session session, T packet);

        protected abstract IStore getStore();
    }
}
