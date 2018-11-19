package com.tinder.listeners;

import com.tinder.model.User;

public interface ListenerProfileLoad {
    void onProfileLoadFailed();

    void onProfileLoaded(User user);
}
