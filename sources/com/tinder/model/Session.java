package com.tinder.model;

import com.tinder.managers.ManagerApp;

public class Session {
    public String appVersion;
    public long openDateTime;

    public Session(long j, String str) {
        this.openDateTime = j;
        this.appVersion = str;
    }

    public static Session create() {
        return new Session(System.currentTimeMillis(), ManagerApp.f12346b);
    }
}
