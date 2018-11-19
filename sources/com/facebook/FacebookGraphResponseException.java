package com.facebook;

public class FacebookGraphResponseException extends FacebookException {
    /* renamed from: a */
    private final GraphResponse f9722a;

    public FacebookGraphResponseException(GraphResponse graphResponse, String str) {
        super(str);
        this.f9722a = graphResponse;
    }

    public final String toString() {
        FacebookRequestError a = this.f9722a != null ? this.f9722a.m4092a() : null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            stringBuilder.append(message);
            stringBuilder.append(" ");
        }
        if (a != null) {
            stringBuilder.append("httpResponseCode: ");
            stringBuilder.append(a.getRequestStatusCode());
            stringBuilder.append(", facebookErrorCode: ");
            stringBuilder.append(a.getErrorCode());
            stringBuilder.append(", facebookErrorType: ");
            stringBuilder.append(a.getErrorType());
            stringBuilder.append(", message: ");
            stringBuilder.append(a.getErrorMessage());
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }
}
