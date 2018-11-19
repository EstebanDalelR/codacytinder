package com.google.zxing;

public final class ChecksumException extends ReaderException {
    /* renamed from: c */
    private static final ChecksumException f25452c;

    static {
        ChecksumException checksumException = new ChecksumException();
        f25452c = checksumException;
        checksumException.setStackTrace(b);
    }

    private ChecksumException() {
    }

    /* renamed from: a */
    public static ChecksumException m30471a() {
        return a ? new ChecksumException() : f25452c;
    }
}
