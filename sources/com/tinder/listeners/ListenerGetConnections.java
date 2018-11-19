package com.tinder.listeners;

import com.tinder.model.ConnectionsGroup;

public interface ListenerGetConnections {
    void onConnectionsLoad(ConnectionsGroup connectionsGroup, int i);

    void onConnectionsLoadFail(int i);
}
