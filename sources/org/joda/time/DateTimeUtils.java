package org.joda.time;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;

public class DateTimeUtils {
    /* renamed from: a */
    public static final MillisProvider f60064a = new C19479a();
    /* renamed from: b */
    private static volatile MillisProvider f60065b = f60064a;
    /* renamed from: c */
    private static final AtomicReference<Map<String, DateTimeZone>> f60066c = new AtomicReference();

    public interface MillisProvider {
        long getMillis();
    }

    /* renamed from: org.joda.time.DateTimeUtils$a */
    static class C19479a implements MillisProvider {
        C19479a() {
        }

        public long getMillis() {
            return System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public static final long m68902a() {
        return f60065b.getMillis();
    }

    /* renamed from: a */
    public static final long m68904a(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return m68902a();
        }
        return readableInstant.getMillis();
    }

    /* renamed from: b */
    public static final C19304a m68914b(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return ISOChronology.m71189O();
        }
        readableInstant = readableInstant.getChronology();
        return readableInstant == null ? ISOChronology.m71189O() : readableInstant;
    }

    /* renamed from: a */
    public static final C19304a m68908a(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        readableInstant = readableInstant != null ? readableInstant.getChronology() : readableInstant2 != null ? readableInstant2.getChronology() : null;
        return readableInstant == null ? ISOChronology.m71189O() : readableInstant;
    }

    /* renamed from: a */
    public static final C19304a m68909a(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            return ISOChronology.m71189O();
        }
        readableInterval = readableInterval.getChronology();
        return readableInterval == null ? ISOChronology.m71189O() : readableInterval;
    }

    /* renamed from: a */
    public static final C19304a m68910a(C19304a c19304a) {
        return c19304a == null ? ISOChronology.m71189O() : c19304a;
    }

    /* renamed from: a */
    public static final DateTimeZone m68906a(DateTimeZone dateTimeZone) {
        return dateTimeZone == null ? DateTimeZone.a() : dateTimeZone;
    }

    /* renamed from: a */
    public static final PeriodType m68907a(PeriodType periodType) {
        return periodType == null ? PeriodType.m68936a() : periodType;
    }

    /* renamed from: a */
    public static final long m68903a(ReadableDuration readableDuration) {
        return readableDuration == null ? 0 : readableDuration.getMillis();
    }

    /* renamed from: a */
    public static final boolean m68912a(ReadablePartial readablePartial) {
        if (readablePartial == null) {
            throw new IllegalArgumentException("Partial must not be null");
        }
        DurationFieldType durationFieldType = null;
        for (int i = 0; i < readablePartial.size(); i++) {
            C19305b field = readablePartial.getField(i);
            if (i > 0 && (field.mo14550e() == null || field.mo14550e().mo14521a() != r2)) {
                return false;
            }
            durationFieldType = field.mo14548d().mo14521a();
        }
        return true;
    }

    /* renamed from: a */
    public static final java.text.DateFormatSymbols m68905a(java.util.Locale r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java.text.DateFormatSymbols.class;	 Catch:{ Exception -> 0x001c }
        r1 = "getInstance";	 Catch:{ Exception -> 0x001c }
        r2 = 1;	 Catch:{ Exception -> 0x001c }
        r3 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x001c }
        r4 = java.util.Locale.class;	 Catch:{ Exception -> 0x001c }
        r5 = 0;	 Catch:{ Exception -> 0x001c }
        r3[r5] = r4;	 Catch:{ Exception -> 0x001c }
        r0 = r0.getMethod(r1, r3);	 Catch:{ Exception -> 0x001c }
        r1 = 0;	 Catch:{ Exception -> 0x001c }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x001c }
        r2[r5] = r6;	 Catch:{ Exception -> 0x001c }
        r0 = r0.invoke(r1, r2);	 Catch:{ Exception -> 0x001c }
        r0 = (java.text.DateFormatSymbols) r0;	 Catch:{ Exception -> 0x001c }
        return r0;
    L_0x001c:
        r0 = new java.text.DateFormatSymbols;
        r0.<init>(r6);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeUtils.a(java.util.Locale):java.text.DateFormatSymbols");
    }

    /* renamed from: b */
    public static final Map<String, DateTimeZone> m68913b() {
        Map<String, DateTimeZone> map = (Map) f60066c.get();
        if (map != null) {
            return map;
        }
        map = m68915c();
        return !f60066c.compareAndSet(null, map) ? (Map) f60066c.get() : map;
    }

    /* renamed from: c */
    private static Map<String, DateTimeZone> m68915c() {
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", DateTimeZone.f8461a);
        linkedHashMap.put("UTC", DateTimeZone.f8461a);
        linkedHashMap.put("GMT", DateTimeZone.f8461a);
        m68911a(linkedHashMap, "EST", "America/New_York");
        m68911a(linkedHashMap, "EDT", "America/New_York");
        m68911a(linkedHashMap, "CST", "America/Chicago");
        m68911a(linkedHashMap, "CDT", "America/Chicago");
        m68911a(linkedHashMap, "MST", "America/Denver");
        m68911a(linkedHashMap, "MDT", "America/Denver");
        m68911a(linkedHashMap, "PST", "America/Los_Angeles");
        m68911a(linkedHashMap, "PDT", "America/Los_Angeles");
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    private static void m68911a(java.util.Map<java.lang.String, org.joda.time.DateTimeZone> r0, java.lang.String r1, java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = org.joda.time.DateTimeZone.a(r2);	 Catch:{ RuntimeException -> 0x0007 }
        r0.put(r1, r2);	 Catch:{ RuntimeException -> 0x0007 }
    L_0x0007:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeUtils.a(java.util.Map, java.lang.String, java.lang.String):void");
    }
}
