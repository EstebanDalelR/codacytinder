package org.joda.time.convert;

import org.joda.time.C19304a;

/* renamed from: org.joda.time.convert.f */
class C19631f extends C19481a implements DurationConverter, InstantConverter, PartialConverter {
    /* renamed from: a */
    static final C19631f f61401a = new C19631f();

    protected C19631f() {
    }

    public long getInstantMillis(Object obj, C19304a c19304a) {
        return ((Long) obj).longValue();
    }

    public long getDurationMillis(Object obj) {
        return ((Long) obj).longValue();
    }

    public Class<?> getSupportedType() {
        return Long.class;
    }
}
