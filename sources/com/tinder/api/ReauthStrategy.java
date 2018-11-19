package com.tinder.api;

public interface ReauthStrategy {
    void onReauthFail(Exception exception);

    void onReauthSuccess(String str);

    String reauth() throws Exception;
}
