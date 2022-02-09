package io.ttrms.skeleton;

public interface IPacketRegister<Register extends IPacketRegister<?, ?, Packet>, Handler extends Handlers.Handler<?, ?, ?, Packet>, Packet> {
    Register add(Class<? extends Packet> packetClass, Handlers.Handler<?, ?, ?, ?> handler);
    Handler getHandler(Packet packet);
}
