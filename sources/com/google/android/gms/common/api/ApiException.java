package com.google.android.gms.common.api;

import android.support.annotation.NonNull;

public class ApiException extends Exception {
    /* renamed from: a */
    protected final Status f7415a;

    public ApiException(@NonNull Status status) {
        int statusCode = status.getStatusCode();
        String statusMessage = status.getStatusMessage() != null ? status.getStatusMessage() : "";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(statusMessage).length() + 13);
        stringBuilder.append(statusCode);
        stringBuilder.append(": ");
        stringBuilder.append(statusMessage);
        super(stringBuilder.toString());
        this.f7415a = status;
    }
}
