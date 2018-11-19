package org.joda.time.convert;

import org.joda.time.C19304a;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* renamed from: org.joda.time.convert.k */
class C19636k extends C19481a implements PartialConverter {
    /* renamed from: a */
    static final C19636k f61406a = new C19636k();

    protected C19636k() {
    }

    public C19304a getChronology(Object obj, DateTimeZone dateTimeZone) {
        return getChronology(obj, (C19304a) null).mo14711a(dateTimeZone);
    }

    public C19304a getChronology(Object obj, C19304a c19304a) {
        return c19304a == null ? DateTimeUtils.m68910a(((ReadablePartial) obj).getChronology()) : c19304a;
    }

    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, C19304a c19304a) {
        ReadablePartial readablePartial2 = (ReadablePartial) obj;
        int size = readablePartial.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = readablePartial2.get(readablePartial.getFieldType(i));
        }
        c19304a.mo14492a(readablePartial, iArr);
        return iArr;
    }

    public Class<?> getSupportedType() {
        return ReadablePartial.class;
    }
}
