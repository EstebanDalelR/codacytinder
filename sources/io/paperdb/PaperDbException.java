package io.paperdb;

public class PaperDbException extends RuntimeException {
    public PaperDbException(String str) {
        super(str);
    }

    public PaperDbException(String str, Throwable th) {
        super(str, th);
    }
}
