package com.facebook.ads.internal.p043j.p045b;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.internal.j.b.d */
class C1454d {
    /* renamed from: d */
    private static final Pattern f3993d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");
    /* renamed from: e */
    private static final Pattern f3994e = Pattern.compile("GET /(.*) HTTP");
    /* renamed from: a */
    public final String f3995a;
    /* renamed from: b */
    public final long f3996b;
    /* renamed from: c */
    public final boolean f3997c;

    public C1454d(String str) {
        C1463j.m5119a(str);
        long a = m5084a(str);
        this.f3996b = Math.max(0, a);
        this.f3997c = a >= 0;
        this.f3995a = m5086b(str);
    }

    /* renamed from: a */
    private long m5084a(String str) {
        Matcher matcher = f3993d.matcher(str);
        return matcher.find() ? Long.parseLong(matcher.group(1)) : -1;
    }

    /* renamed from: a */
    public static C1454d m5085a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            Object readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                return new C1454d(stringBuilder.toString());
            }
            stringBuilder.append(readLine);
            stringBuilder.append('\n');
        }
    }

    /* renamed from: b */
    private String m5086b(String str) {
        Matcher matcher = f3994e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid request `");
        stringBuilder.append(str);
        stringBuilder.append("`: url not found!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GetRequest{rangeOffset=");
        stringBuilder.append(this.f3996b);
        stringBuilder.append(", partial=");
        stringBuilder.append(this.f3997c);
        stringBuilder.append(", uri='");
        stringBuilder.append(this.f3995a);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
