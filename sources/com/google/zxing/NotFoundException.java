package com.google.zxing;

public final class NotFoundException extends ReaderException {
    /* renamed from: c */
    private static final NotFoundException f25454c;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f25454c = notFoundException;
        notFoundException.setStackTrace(b);
    }

    private NotFoundException() {
    }

    /* renamed from: a */
    public static NotFoundException m30473a() {
        return f25454c;
    }
}
