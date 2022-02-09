package io.ttrms.skeleton;

public interface IPacketRegister<
        RegisterT extends IPacketRegister<?, ?, PacketT>,
        HandlerT extends Handler<?, ?, ?, PacketT>,
        PacketT> {

    RegisterT add(Class<? extends PacketT> packetClass, HandlerT handler);

    HandlerT getHandler(PacketT packet);
}
