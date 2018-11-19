package org.apache.commons.lang3.exception;

/* renamed from: org.apache.commons.lang3.exception.a */
public class C15992a {
    /* renamed from: a */
    private static final String[] f49740a = new String[]{"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};

    /* renamed from: a */
    public static <R> R m60741a(Throwable th) {
        return C15992a.m60742b(th);
    }

    /* renamed from: b */
    private static <R, T extends Throwable> R m60742b(Throwable th) throws Throwable {
        throw th;
    }
}
