package com.tinder.events;

import android.support.annotation.Nullable;
import com.tinder.model.GlobalConfig;
import com.tinder.model.UserMeta;

public class EventGlobalsLoaded {
    private final GlobalConfig globalConfig;
    @Nullable
    private final UserMeta userMeta;

    public EventGlobalsLoaded(GlobalConfig globalConfig, @Nullable UserMeta userMeta) {
        this.globalConfig = globalConfig;
        this.userMeta = userMeta;
    }

    public GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    @Nullable
    public UserMeta getUserMeta() {
        return this.userMeta;
    }
}
