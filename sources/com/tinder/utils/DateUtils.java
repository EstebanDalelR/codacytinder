package com.tinder.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pools.C4028b;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

@Deprecated
public class DateUtils extends android.text.format.DateUtils {
    /* renamed from: a */
    private static final SimpleDateFormat f47603a = new SimpleDateFormat("yy-MM-dd'T'HH:mm:ss.SSS'Z'");

    private static class PooledDateFormat extends SimpleDateFormat {
        /* renamed from: a */
        private static final C4028b<SimpleDateFormat> f47602a = new C4028b(10);

        /* renamed from: a */
        public static SimpleDateFormat m57582a() {
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) f47602a.acquire();
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            simpleDateFormat = new SimpleDateFormat("yy-MM-dd'T'HH:mm:ss.SSS'Z'");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
            return simpleDateFormat;
        }
    }

    static {
        f47603a.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
    }

    /* renamed from: a */
    public static synchronized long m57584a(@Nullable String str) {
        synchronized (DateUtils.class) {
            long currentTimeMillis = System.currentTimeMillis();
            if (str == null) {
                return currentTimeMillis;
            }
            try {
                long time = f47603a.parse(str).getTime();
                return time;
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to get time from String date ");
                stringBuilder.append(str);
                ad.a(stringBuilder.toString(), e);
                return currentTimeMillis;
            }
        }
    }

    /* renamed from: a */
    public static int m57583a(@NonNull Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        date = Calendar.getInstance();
        int i = date.get(1) - instance.get(1);
        if (date.get(2) < instance.get(2)) {
            i--;
        } else if (date.get(2) == instance.get(2) && date.get(5) < instance.get(5)) {
            i--;
        }
        return i < 0 ? 0 : i;
    }

    @NonNull
    /* renamed from: a */
    public static DateFormat m57586a() {
        return PooledDateFormat.m57582a();
    }

    /* renamed from: a */
    public static String m57585a(long j) {
        int toHours = ((int) TimeUnit.MILLISECONDS.toHours(j)) % 24;
        int toMinutes = ((int) TimeUnit.MILLISECONDS.toMinutes(j)) % 60;
        j = ((int) TimeUnit.MILLISECONDS.toSeconds(j)) % 60;
        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf(toHours), Integer.valueOf(toMinutes), Integer.valueOf(j)});
    }

    /* renamed from: b */
    public static long m57590b(String str) {
        return TimeUnit.MILLISECONDS.toHours(m57592d(str));
    }

    /* renamed from: c */
    public static long m57591c(String str) {
        return TimeUnit.MILLISECONDS.toMinutes(m57592d(str)) % 60;
    }

    /* renamed from: d */
    public static long m57592d(String str) {
        return System.currentTimeMillis() - (new Date(m57584a(str)).getTime() + 1000);
    }

    /* renamed from: b */
    public static long m57589b(long j) {
        Date date = new Date(j);
        return (date.getTime() + 1000) - System.currentTimeMillis();
    }

    /* renamed from: e */
    public static long m57593e(@NonNull String str) {
        Date date = new Date(m57584a(str));
        return (date.getTime() + 1000) - System.currentTimeMillis();
    }

    /* renamed from: f */
    public static boolean m57594f(String str) {
        Date date = new Date(m57584a(str));
        Date date2 = new Date(Calendar.getInstance().getTimeInMillis());
        str = new SimpleDateFormat("yyyyMMdd");
        return str.format(date).equals(str.format(date2));
    }

    /* renamed from: a */
    public static DateFormat m57587a(Context context) {
        return android.text.format.DateFormat.getLongDateFormat(context);
    }

    /* renamed from: a */
    public static boolean m57588a(long j, long j2) {
        return System.currentTimeMillis() - j > j2 ? 1 : 0;
    }
}
