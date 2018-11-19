package com.google.android.m4b.maps.p104d;

import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: com.google.android.m4b.maps.d.a */
public final class C5318a {
    /* renamed from: a */
    private static final Pattern f19722a = Pattern.compile(" +");
    /* renamed from: b */
    private static final Pattern f19723b = Pattern.compile("\\W");
    /* renamed from: c */
    private static C5318a f19724c = new C5318a(new C5316a[0]);
    /* renamed from: d */
    private final C5316a[] f19725d;
    /* renamed from: e */
    private final Pattern f19726e;

    /* renamed from: com.google.android.m4b.maps.d.a$a */
    public static class C5316a implements Comparable {
        /* renamed from: d */
        public static final C5316a f19717d = new C5316a();
        /* renamed from: a */
        public final String f19718a;
        /* renamed from: b */
        public final String f19719b;
        /* renamed from: c */
        public final boolean f19720c;
        /* renamed from: e */
        private String f19721e;

        public C5316a(String str, String str2) {
            this.f19721e = str;
            str = C5318a.f19722a.split(str2);
            if (str.length == 0) {
                throw new C5317b("Empty rule");
            }
            this.f19718a = str[0];
            String str3 = null;
            int i = 1;
            boolean z = false;
            while (i < str.length) {
                String toLowerCase = str[i].toLowerCase();
                if (toLowerCase.equals("rewrite")) {
                    int i2 = i + 1;
                    if (i2 < str.length) {
                        str3 = str[i2];
                        i += 2;
                    }
                }
                if (toLowerCase.equals("block")) {
                    i++;
                    z = true;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Illegal rule: ");
                    stringBuilder.append(str2);
                    throw new C5317b(stringBuilder.toString());
                }
            }
            this.f19719b = str3;
            this.f19720c = z;
        }

        private C5316a() {
            this.f19721e = "DEFAULT";
            this.f19718a = "";
            this.f19719b = null;
            this.f19720c = false;
        }

        public final int compareTo(Object obj) {
            return ((C5316a) obj).f19718a.compareTo(this.f19718a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.d.a$b */
    public static class C5317b extends Exception {
        public C5317b(String str) {
            super(str);
        }
    }

    public C5318a(C5316a[] c5316aArr) {
        Arrays.sort(c5316aArr);
        StringBuilder stringBuilder = new StringBuilder("(");
        for (int i = 0; i < c5316aArr.length; i++) {
            if (i > 0) {
                stringBuilder.append(")|(");
            }
            stringBuilder.append(f19723b.matcher(c5316aArr[i].f19718a).replaceAll("\\\\$0"));
        }
        stringBuilder.append(")");
        this.f19726e = Pattern.compile(stringBuilder.toString());
        this.f19725d = c5316aArr;
    }

    /* renamed from: a */
    public final C5316a m23545a(String str) {
        str = this.f19726e.matcher(str);
        if (str.lookingAt()) {
            int i = 0;
            while (i < this.f19725d.length) {
                int i2 = i + 1;
                if (str.group(i2) != null) {
                    return this.f19725d[i];
                }
                i = i2;
            }
        }
        return C5316a.f19717d;
    }
}
