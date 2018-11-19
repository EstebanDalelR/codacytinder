package com.leanplum.callbacks;

public abstract class InboxChangedCallback implements Runnable {
    public abstract void inboxChanged();

    public void run() {
        inboxChanged();
    }
}
