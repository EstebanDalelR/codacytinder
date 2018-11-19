package com.github.pwittchen.reactivenetwork.library.rx2.internet.observing.error;

public interface ErrorHandler {
    void handleError(Exception exception, String str);
}
