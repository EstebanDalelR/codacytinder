package org.joda.time.convert;

import org.joda.time.C19304a;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.ISOChronology;

/* renamed from: org.joda.time.convert.i */
class C19634i extends C19481a implements InstantConverter, PartialConverter {
    /* renamed from: a */
    static final C19634i f61404a = new C19634i();

    protected C19634i() {
    }

    public C19304a getChronology(Object obj, DateTimeZone dateTimeZone) {
        obj = ((ReadableInstant) obj).getChronology();
        if (obj == null) {
            return ISOChronology.m71190b(dateTimeZone);
        }
        if (obj.mo14710a() != dateTimeZone) {
            obj = obj.mo14711a(dateTimeZone);
            if (obj == null) {
                return ISOChronology.m71190b(dateTimeZone);
            }
        }
        return obj;
    }

    public C19304a getChronology(Object obj, C19304a c19304a) {
        return c19304a == null ? DateTimeUtils.m68910a(((ReadableInstant) obj).getChronology()) : c19304a;
    }

    public long getInstantMillis(Object obj, C19304a c19304a) {
        return ((ReadableInstant) obj).getMillis();
    }

    public Class<?> getSupportedType() {
        return ReadableInstant.class;
    }
}
