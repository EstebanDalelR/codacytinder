package com.facebook.accountkit;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: com.facebook.accountkit.b */
public final class C1186b {
    /* renamed from: a */
    private final HashSet<LoggingBehavior> f3159a = new HashSet(Collections.singleton(LoggingBehavior.DEVELOPER_ERRORS));

    /* renamed from: a */
    public boolean m4130a(LoggingBehavior loggingBehavior) {
        synchronized (this.f3159a) {
            loggingBehavior = this.f3159a.contains(loggingBehavior);
        }
        return loggingBehavior;
    }
}
