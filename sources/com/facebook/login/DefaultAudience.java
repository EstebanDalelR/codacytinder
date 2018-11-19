package com.facebook.login;

import com.tinder.api.ManagerWebServices;

public enum DefaultAudience {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS(ManagerWebServices.FB_PARAM_FRIENDS),
    EVERYONE("everyone");
    
    private final String nativeProtocolAudience;

    private DefaultAudience(String str) {
        this.nativeProtocolAudience = str;
    }

    public String getNativeProtocolAudience() {
        return this.nativeProtocolAudience;
    }
}
