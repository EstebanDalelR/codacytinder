package com.facebook;

public class FacebookServiceException extends FacebookException {
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    private final FacebookRequestError f9723a;

    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.f9723a = facebookRequestError;
    }

    /* renamed from: a */
    public final FacebookRequestError m12165a() {
        return this.f9723a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{FacebookServiceException: ");
        stringBuilder.append("httpResponseCode: ");
        stringBuilder.append(this.f9723a.getRequestStatusCode());
        stringBuilder.append(", facebookErrorCode: ");
        stringBuilder.append(this.f9723a.getErrorCode());
        stringBuilder.append(", facebookErrorType: ");
        stringBuilder.append(this.f9723a.getErrorType());
        stringBuilder.append(", message: ");
        stringBuilder.append(this.f9723a.getErrorMessage());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
