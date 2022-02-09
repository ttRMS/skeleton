package io.ttrms.skeleton;

public interface IPacketRegister {
    IPacketRegister add();
    Handlers.Handler<?, ?, ?, ?> getHandler();
}
