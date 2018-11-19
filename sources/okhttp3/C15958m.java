package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* renamed from: okhttp3.m */
public final class C15958m {
    /* renamed from: a */
    private static final Pattern f49510a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    /* renamed from: b */
    private static final Pattern f49511b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    /* renamed from: c */
    private final String f49512c;
    /* renamed from: d */
    private final String f49513d;
    /* renamed from: e */
    private final String f49514e;
    @Nullable
    /* renamed from: f */
    private final String f49515f;

    private C15958m(String str, String str2, String str3, @Nullable String str4) {
        this.f49512c = str;
        this.f49513d = str2;
        this.f49514e = str3;
        this.f49515f = str4;
    }

    @Nullable
    /* renamed from: a */
    public static C15958m m60479a(String str) {
        Matcher matcher = f49510a.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String toLowerCase = matcher.group(1).toLowerCase(Locale.US);
        String toLowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = f49511b.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group != null) {
                if (group.equalsIgnoreCase("charset")) {
                    group = matcher2.group(2);
                    if (group == null) {
                        group = matcher2.group(3);
                    } else if (group.startsWith("'") && group.endsWith("'") && group.length() > 2) {
                        group = group.substring(1, group.length() - 1);
                    }
                    if (str2 != null && !group.equalsIgnoreCase(str2)) {
                        return null;
                    }
                    str2 = group;
                }
            }
        }
        return new C15958m(str, toLowerCase, toLowerCase2, str2);
    }

    /* renamed from: a */
    public String m60480a() {
        return this.f49513d;
    }

    @Nullable
    /* renamed from: b */
    public Charset m60482b() {
        return m60481a(null);
    }

    @javax.annotation.Nullable
    /* renamed from: a */
    public java.nio.charset.Charset m60481a(@javax.annotation.Nullable java.nio.charset.Charset r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f49515f;	 Catch:{ IllegalArgumentException -> 0x000c }
        if (r0 == 0) goto L_0x000b;	 Catch:{ IllegalArgumentException -> 0x000c }
    L_0x0004:
        r0 = r1.f49515f;	 Catch:{ IllegalArgumentException -> 0x000c }
        r0 = java.nio.charset.Charset.forName(r0);	 Catch:{ IllegalArgumentException -> 0x000c }
        r2 = r0;
    L_0x000b:
        return r2;
    L_0x000c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.m.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public String toString() {
        return this.f49512c;
    }

    public boolean equals(@Nullable Object obj) {
        return (!(obj instanceof C15958m) || ((C15958m) obj).f49512c.equals(this.f49512c) == null) ? null : true;
    }

    public int hashCode() {
        return this.f49512c.hashCode();
    }
}
