package com.tinder.updates;

public interface UpdatesScheduler {
    boolean schedule();

    boolean unschedule();
}
