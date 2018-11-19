package com.tinder.model;

public class InstagramAuthError {
    public String errorMessage;
    public int status;

    public InstagramAuthError(int i, String str) {
        this.status = i;
        this.errorMessage = str;
    }
}
