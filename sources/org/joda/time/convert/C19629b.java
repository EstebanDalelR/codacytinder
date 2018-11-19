package org.joda.time.convert;

import com.google.android.exoplayer2.Format;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.joda.time.C19304a;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/* renamed from: org.joda.time.convert.b */
final class C19629b extends C19481a implements InstantConverter, PartialConverter {
    /* renamed from: a */
    static final C19629b f61399a = new C19629b();

    protected C19629b() {
    }

    public org.joda.time.C19304a getChronology(java.lang.Object r1, org.joda.time.C19304a r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        if (r2 == 0) goto L_0x0003;
    L_0x0002:
        return r2;
    L_0x0003:
        r1 = (java.util.Calendar) r1;
        r2 = r1.getTimeZone();	 Catch:{ IllegalArgumentException -> 0x000e }
        r2 = org.joda.time.DateTimeZone.a(r2);	 Catch:{ IllegalArgumentException -> 0x000e }
        goto L_0x0012;
    L_0x000e:
        r2 = org.joda.time.DateTimeZone.a();
    L_0x0012:
        r1 = r0.getChronology(r1, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.convert.b.getChronology(java.lang.Object, org.joda.time.a):org.joda.time.a");
    }

    public C19304a getChronology(Object obj, DateTimeZone dateTimeZone) {
        if (obj.getClass().getName().endsWith(".BuddhistCalendar")) {
            return BuddhistChronology.m71155b(dateTimeZone);
        }
        if (!(obj instanceof GregorianCalendar)) {
            return ISOChronology.m71190b(dateTimeZone);
        }
        long time = ((GregorianCalendar) obj).getGregorianChange().getTime();
        if (time == Long.MIN_VALUE) {
            return GregorianChronology.m71688b(dateTimeZone);
        }
        if (time == Format.OFFSET_SAMPLE_RELATIVE) {
            return JulianChronology.m71702b(dateTimeZone);
        }
        return GJChronology.m71172a(dateTimeZone, time, 4);
    }

    public long getInstantMillis(Object obj, C19304a c19304a) {
        return ((Calendar) obj).getTime().getTime();
    }

    public Class<?> getSupportedType() {
        return Calendar.class;
    }
}
