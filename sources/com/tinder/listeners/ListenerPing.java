package com.tinder.listeners;

public interface ListenerPing {
    void onBadLocation();

    void onLoggedOut();

    void onPingFailure();

    void onPingSuccess();
}
