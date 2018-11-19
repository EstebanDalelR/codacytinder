package com.google.zxing;

public final class FormatException extends ReaderException {
    /* renamed from: c */
    private static final FormatException f25453c;

    static {
        FormatException formatException = new FormatException();
        f25453c = formatException;
        formatException.setStackTrace(b);
    }

    private FormatException() {
    }

    /* renamed from: a */
    public static FormatException m30472a() {
        return a ? new FormatException() : f25453c;
    }
}
