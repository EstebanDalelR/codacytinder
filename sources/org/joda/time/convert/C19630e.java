package org.joda.time.convert;

import java.util.Date;
import org.joda.time.C19304a;

/* renamed from: org.joda.time.convert.e */
final class C19630e extends C19481a implements InstantConverter, PartialConverter {
    /* renamed from: a */
    static final C19630e f61400a = new C19630e();

    protected C19630e() {
    }

    public long getInstantMillis(Object obj, C19304a c19304a) {
        return ((Date) obj).getTime();
    }

    public Class<?> getSupportedType() {
        return Date.class;
    }
}
