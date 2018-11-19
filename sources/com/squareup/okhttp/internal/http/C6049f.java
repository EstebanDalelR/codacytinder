package com.squareup.okhttp.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.squareup.okhttp.internal.http.f */
public final class C6049f {
    /* renamed from: a */
    private static final TimeZone f22161a = TimeZone.getTimeZone("GMT");
    /* renamed from: b */
    private static final ThreadLocal<DateFormat> f22162b = new C60481();
    /* renamed from: c */
    private static final String[] f22163c = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    /* renamed from: d */
    private static final DateFormat[] f22164d = new DateFormat[f22163c.length];

    /* renamed from: com.squareup.okhttp.internal.http.f$1 */
    static class C60481 extends ThreadLocal<DateFormat> {
        C60481() {
        }

        protected /* synthetic */ Object initialValue() {
            return m26163a();
        }

        /* renamed from: a */
        protected DateFormat m26163a() {
            DateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C6049f.f22161a);
            return simpleDateFormat;
        }
    }

    /* renamed from: a */
    public static Date m26164a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f22162b.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f22163c) {
            int length = f22163c.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f22164d[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f22163c[i], Locale.US);
                    dateFormat.setTimeZone(f22161a);
                    f22164d[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
