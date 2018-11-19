package com.bumptech.glide.load.engine;

public class ErrorWrappingGlideException extends Exception {
    public /* synthetic */ Throwable getCause() {
        return m3506a();
    }

    public ErrorWrappingGlideException(Error error) {
        super(error);
        if (error == null) {
            throw new NullPointerException("The causing error must not be null");
        }
    }

    /* renamed from: a */
    public Error m3506a() {
        return (Error) super.getCause();
    }
}
