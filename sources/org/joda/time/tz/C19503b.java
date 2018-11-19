package org.joda.time.tz;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.b */
public final class C19503b implements Provider {
    /* renamed from: a */
    private static final Set<String> f60899a = Collections.singleton("UTC");

    public DateTimeZone getZone(String str) {
        return "UTC".equalsIgnoreCase(str) != null ? DateTimeZone.f8461a : null;
    }

    public Set<String> getAvailableIDs() {
        return f60899a;
    }
}
