package io.ttrms.skeleton;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
public abstract class AbstractPacketManager<CoreT extends AbstractCore<?, ?, ?, ?, ?, ?, ?, ?, ?>, ServerListenerT, ClientListenerT> {
    @Getter protected final CoreT core;
    protected ServerListenerT serverListener;
    protected ClientListenerT clientListener;
}
