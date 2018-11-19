package com.squareup.okhttp.internal.http;

import java.io.IOException;

public final class RequestException extends Exception {
    public /* synthetic */ Throwable getCause() {
        return m26122a();
    }

    public RequestException(IOException iOException) {
        super(iOException);
    }

    /* renamed from: a */
    public IOException m26122a() {
        return (IOException) super.getCause();
    }
}
