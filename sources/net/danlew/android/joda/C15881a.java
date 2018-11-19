package net.danlew.android.joda;

import android.content.Context;
import android.text.format.DateUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;

/* renamed from: net.danlew.android.joda.a */
public class C15881a {
    /* renamed from: a */
    private static final DateTime f49059a = new DateTime(0, DateTimeZone.f8461a);

    /* renamed from: a */
    public static String m59936a(Context context, ReadableInstant readableInstant, int i) {
        return DateUtils.formatDateTime(context, C15881a.m59938b(readableInstant), i | 8192);
    }

    /* renamed from: b */
    private static long m59938b(ReadableInstant readableInstant) {
        return (readableInstant instanceof DateTime ? (DateTime) readableInstant : new DateTime(readableInstant)).b(DateTimeZone.f8461a).getMillis();
    }

    /* renamed from: a */
    public static boolean m59937a(ReadableInstant readableInstant) {
        return LocalDate.a().a(new LocalDate(readableInstant)) == null ? true : null;
    }
}
