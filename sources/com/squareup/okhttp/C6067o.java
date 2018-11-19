package com.squareup.okhttp;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.squareup.okhttp.o */
public final class C6067o {
    /* renamed from: a */
    private static final Pattern f22224a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    /* renamed from: b */
    private static final Pattern f22225b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    /* renamed from: c */
    private final String f22226c;
    /* renamed from: d */
    private final String f22227d;
    /* renamed from: e */
    private final String f22228e;
    /* renamed from: f */
    private final String f22229f;

    private C6067o(String str, String str2, String str3, String str4) {
        this.f22226c = str;
        this.f22227d = str2;
        this.f22228e = str3;
        this.f22229f = str4;
    }

    /* renamed from: a */
    public static C6067o m26289a(String str) {
        Matcher matcher = f22224a.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String toLowerCase = matcher.group(1).toLowerCase(Locale.US);
        String toLowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = f22225b.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group = matcher2.group(1);
            if (group != null) {
                if (group.equalsIgnoreCase("charset")) {
                    if (matcher2.group(2) != null) {
                        group = matcher2.group(2);
                    } else {
                        group = matcher2.group(3);
                    }
                    if (str2 == null || group.equalsIgnoreCase(str2)) {
                        str2 = group;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Multiple different charsets: ");
                        stringBuilder.append(str);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
        }
        return new C6067o(str, toLowerCase, toLowerCase2, str2);
    }

    /* renamed from: a */
    public Charset m26290a(Charset charset) {
        return this.f22229f != null ? Charset.forName(this.f22229f) : charset;
    }

    public String toString() {
        return this.f22226c;
    }

    public boolean equals(Object obj) {
        return (!(obj instanceof C6067o) || ((C6067o) obj).f22226c.equals(this.f22226c) == null) ? null : true;
    }

    public int hashCode() {
        return this.f22226c.hashCode();
    }
}
