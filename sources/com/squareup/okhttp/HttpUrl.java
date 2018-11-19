package com.squareup.okhttp;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.C18549c;

public final class HttpUrl {
    /* renamed from: a */
    private static final char[] f21890a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    /* renamed from: b */
    private final String f21891b;
    /* renamed from: c */
    private final String f21892c;
    /* renamed from: d */
    private final String f21893d;
    /* renamed from: e */
    private final String f21894e;
    /* renamed from: f */
    private final int f21895f;
    /* renamed from: g */
    private final List<String> f21896g;
    /* renamed from: h */
    private final List<String> f21897h;
    /* renamed from: i */
    private final String f21898i;
    /* renamed from: j */
    private final String f21899j;

    /* renamed from: com.squareup.okhttp.HttpUrl$1 */
    static /* synthetic */ class C59941 {
        /* renamed from: a */
        static final /* synthetic */ int[] f21881a = new int[ParseResult.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.squareup.okhttp.HttpUrl.Builder.ParseResult.values();
            r0 = r0.length;
            r0 = new int[r0];
            f21881a = r0;
            r0 = f21881a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.squareup.okhttp.HttpUrl.Builder.ParseResult.SUCCESS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f21881a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.squareup.okhttp.HttpUrl.Builder.ParseResult.INVALID_HOST;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f21881a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.squareup.okhttp.HttpUrl.Builder.ParseResult.UNSUPPORTED_SCHEME;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f21881a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.squareup.okhttp.HttpUrl.Builder.ParseResult.MISSING_SCHEME;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f21881a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.squareup.okhttp.HttpUrl.Builder.ParseResult.INVALID_PORT;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.HttpUrl.1.<clinit>():void");
        }
    }

    public static final class Builder {
        /* renamed from: a */
        String f21882a;
        /* renamed from: b */
        String f21883b = "";
        /* renamed from: c */
        String f21884c = "";
        /* renamed from: d */
        String f21885d;
        /* renamed from: e */
        int f21886e = -1;
        /* renamed from: f */
        final List<String> f21887f = new ArrayList();
        /* renamed from: g */
        List<String> f21888g;
        /* renamed from: h */
        String f21889h;

        enum ParseResult {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public Builder() {
            this.f21887f.add("");
        }

        /* renamed from: a */
        public Builder m25714a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f21882a = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.f21882a = "https";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected scheme: ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            return this;
        }

        /* renamed from: b */
        public Builder m25716b(String str) {
            if (str == null) {
                throw new IllegalArgumentException("host == null");
            }
            String g = m25707g(str, 0, str.length());
            if (g == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected host: ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.f21885d = g;
            return this;
        }

        /* renamed from: a */
        public Builder m25713a(int i) {
            if (i > 0) {
                if (i <= 65535) {
                    this.f21886e = i;
                    return this;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected port: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        /* renamed from: a */
        int m25711a() {
            return this.f21886e != -1 ? this.f21886e : HttpUrl.m25720a(this.f21882a);
        }

        /* renamed from: c */
        public Builder m25717c(String str) {
            this.f21888g = str != null ? HttpUrl.m25733b(HttpUrl.m25725a(str, " \"'<>#", true, true, true)) : null;
            return this;
        }

        /* renamed from: b */
        Builder m25715b() {
            int i;
            int size = this.f21887f.size();
            for (i = 0; i < size; i++) {
                this.f21887f.set(i, HttpUrl.m25725a((String) this.f21887f.get(i), "[]", true, false, true));
            }
            if (this.f21888g != null) {
                size = this.f21888g.size();
                for (i = 0; i < size; i++) {
                    String str = (String) this.f21888g.get(i);
                    if (str != null) {
                        this.f21888g.set(i, HttpUrl.m25725a(str, "\\^`{|}", true, true, true));
                    }
                }
            }
            if (this.f21889h != null) {
                this.f21889h = HttpUrl.m25725a(this.f21889h, " \"#<>\\^`{|}", true, false, false);
            }
            return this;
        }

        /* renamed from: c */
        public HttpUrl m25718c() {
            if (this.f21882a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f21885d != null) {
                return new HttpUrl();
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f21882a);
            stringBuilder.append("://");
            if (!(this.f21883b.isEmpty() && this.f21884c.isEmpty())) {
                stringBuilder.append(this.f21883b);
                if (!this.f21884c.isEmpty()) {
                    stringBuilder.append(':');
                    stringBuilder.append(this.f21884c);
                }
                stringBuilder.append('@');
            }
            if (this.f21885d.indexOf(58) != -1) {
                stringBuilder.append('[');
                stringBuilder.append(this.f21885d);
                stringBuilder.append(']');
            } else {
                stringBuilder.append(this.f21885d);
            }
            int a = m25711a();
            if (a != HttpUrl.m25720a(this.f21882a)) {
                stringBuilder.append(':');
                stringBuilder.append(a);
            }
            HttpUrl.m25728a(stringBuilder, this.f21887f);
            if (this.f21888g != null) {
                stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
                HttpUrl.m25734b(stringBuilder, this.f21888g);
            }
            if (this.f21889h != null) {
                stringBuilder.append('#');
                stringBuilder.append(this.f21889h);
            }
            return stringBuilder.toString();
        }

        /* renamed from: a */
        ParseResult m25712a(HttpUrl httpUrl, String str) {
            int a;
            String str2 = str;
            int i = 0;
            int b = m25698b(str2, 0, str.length());
            int c = m25699c(str2, b, str.length());
            if (m25700d(str2, b, c) != -1) {
                if (str2.regionMatches(true, b, "https:", 0, 6)) {
                    r0.f21882a = "https";
                    b += "https:".length();
                } else {
                    if (!str2.regionMatches(true, b, "http:", 0, 5)) {
                        return ParseResult.UNSUPPORTED_SCHEME;
                    }
                    r0.f21882a = "http";
                    b += "http:".length();
                }
            } else if (httpUrl == null) {
                return ParseResult.MISSING_SCHEME;
            } else {
                r0.f21882a = httpUrl.f21891b;
            }
            int e = m25703e(str2, b, c);
            if (e < 2 && httpUrl != null) {
                if (httpUrl.f21891b.equals(r0.f21882a)) {
                    r0.f21883b = httpUrl.m25742e();
                    r0.f21884c = httpUrl.m25743f();
                    r0.f21885d = httpUrl.f21894e;
                    r0.f21886e = httpUrl.f21895f;
                    r0.f21887f.clear();
                    r0.f21887f.addAll(httpUrl.m25747j());
                    if (b == c || str2.charAt(b) == '#') {
                        m25717c(httpUrl.m25748k());
                    }
                    int i2 = b;
                    a = HttpUrl.m25731b(str2, i2, c, "?#");
                    m25695a(str2, i2, a);
                    if (a < c && str2.charAt(a) == ManagerWebServices.QUERY_QUESTION_MARK) {
                        i = HttpUrl.m25731b(str2, a, c, "#");
                        r0.f21888g = HttpUrl.m25733b(HttpUrl.m25723a(str2, a + 1, i, " \"'<>#", true, true, true));
                        a = i;
                    }
                    if (a < c && str2.charAt(a) == '#') {
                        r0.f21889h = HttpUrl.m25723a(str2, 1 + a, c, "", true, false, false);
                    }
                    return ParseResult.SUCCESS;
                }
            }
            e = b + e;
            Object obj = null;
            while (true) {
                i2 = HttpUrl.m25731b(str2, e, c, "@/\\?#");
                char charAt = i2 != c ? str2.charAt(i2) : '￿';
                if (!(charAt == '￿' || charAt == '#' || charAt == '/' || charAt == '\\')) {
                    switch (charAt) {
                        case '?':
                            break;
                        case '@':
                            if (i == 0) {
                                int a2 = HttpUrl.m25731b(str2, e, i2, ":");
                                int i3 = a2;
                                String a3 = HttpUrl.m25723a(str2, e, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                if (obj != null) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append(r0.f21883b);
                                    stringBuilder.append("%40");
                                    stringBuilder.append(a3);
                                    a3 = stringBuilder.toString();
                                }
                                r0.f21883b = a3;
                                if (i3 != i2) {
                                    r0.f21884c = HttpUrl.m25723a(str2, i3 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                    i = 1;
                                }
                                obj = 1;
                            } else {
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(r0.f21884c);
                                stringBuilder2.append("%40");
                                stringBuilder2.append(HttpUrl.m25723a(str2, e, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, true));
                                r0.f21884c = stringBuilder2.toString();
                            }
                            e = i2 + 1;
                            continue;
                        default:
                            continue;
                    }
                }
                a = m25705f(str2, e, i2);
                int i4 = a + 1;
                if (i4 < i2) {
                    r0.f21885d = m25707g(str2, e, a);
                    r0.f21886e = m25710i(str2, i4, i2);
                    if (r0.f21886e == -1) {
                        return ParseResult.INVALID_PORT;
                    }
                }
                r0.f21885d = m25707g(str2, e, a);
                r0.f21886e = HttpUrl.m25720a(r0.f21882a);
                if (r0.f21885d == null) {
                    return ParseResult.INVALID_HOST;
                }
                a = HttpUrl.m25731b(str2, i2, c, "?#");
                m25695a(str2, i2, a);
                i = HttpUrl.m25731b(str2, a, c, "#");
                r0.f21888g = HttpUrl.m25733b(HttpUrl.m25723a(str2, a + 1, i, " \"'<>#", true, true, true));
                a = i;
                r0.f21889h = HttpUrl.m25723a(str2, 1 + a, c, "", true, false, false);
                return ParseResult.SUCCESS;
            }
        }

        /* renamed from: a */
        private void m25695a(String str, int i, int i2) {
            if (i != i2) {
                int i3;
                boolean z;
                char charAt = str.charAt(i);
                if (charAt != '/') {
                    if (charAt != '\\') {
                        this.f21887f.set(this.f21887f.size() - 1, "");
                        while (true) {
                            i3 = i;
                            if (i3 < i2) {
                                i = HttpUrl.m25731b(str, i3, i2, "/\\");
                                z = i >= i2;
                                m25696a(str, i3, i, z, true);
                                if (z) {
                                    i++;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
                this.f21887f.clear();
                this.f21887f.add("");
                i++;
                while (true) {
                    i3 = i;
                    if (i3 < i2) {
                        i = HttpUrl.m25731b(str, i3, i2, "/\\");
                        if (i >= i2) {
                        }
                        m25696a(str, i3, i, z, true);
                        if (z) {
                            i++;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        private void m25696a(String str, int i, int i2, boolean z, boolean z2) {
            str = HttpUrl.m25723a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, true);
            if (m25702d(str) == 0) {
                if (m25704e(str) != 0) {
                    m25701d();
                    return;
                }
                if (((String) this.f21887f.get(this.f21887f.size() - 1)).isEmpty() != 0) {
                    this.f21887f.set(this.f21887f.size() - 1, str);
                } else {
                    this.f21887f.add(str);
                }
                if (z) {
                    this.f21887f.add("");
                }
            }
        }

        /* renamed from: d */
        private boolean m25702d(String str) {
            if (!str.equals(".")) {
                if (str.equalsIgnoreCase("%2e") == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: e */
        private boolean m25704e(String str) {
            if (!(str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e"))) {
                if (str.equalsIgnoreCase("%2e%2e") == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: d */
        private void m25701d() {
            if (!((String) this.f21887f.remove(this.f21887f.size() - 1)).isEmpty() || this.f21887f.isEmpty()) {
                this.f21887f.add("");
            } else {
                this.f21887f.set(this.f21887f.size() - 1, "");
            }
        }

        /* renamed from: b */
        private int m25698b(String str, int i, int i2) {
            while (i < i2) {
                switch (str.charAt(i)) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                        i++;
                    default:
                        return i;
                }
            }
            return i2;
        }

        /* renamed from: c */
        private int m25699c(String str, int i, int i2) {
            i2--;
            while (i2 >= i) {
                switch (str.charAt(i2)) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                        i2--;
                    default:
                        return i2 + 1;
                }
            }
            return i;
        }

        /* renamed from: d */
        private static int m25700d(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if (charAt < 'a' || charAt > 'z') {
                if (charAt >= 'A') {
                    if (charAt > 'Z') {
                    }
                }
                return -1;
            }
            while (true) {
                i++;
                if (i < i2) {
                    charAt = str.charAt(i);
                    if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '+' || charAt == '-'))) {
                        if (charAt != '.') {
                            break;
                        }
                    }
                } else {
                    return -1;
                }
            }
            if (charAt == ':') {
                return i;
            }
            return -1;
        }

        /* renamed from: e */
        private static int m25703e(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: f */
        private static int m25705f(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: g */
        private static String m25707g(String str, int i, int i2) {
            str = HttpUrl.m25724a(str, i, i2, false);
            if (str.startsWith("[") == 0 || str.endsWith("]") == 0) {
                return m25706f(str);
            }
            str = m25709h(str, 1, str.length() - 1);
            if (str == null) {
                return null;
            }
            byte[] address = str.getAddress();
            if (address.length == 16) {
                return m25694a(address);
            }
            throw new AssertionError();
        }

        /* renamed from: h */
        private static java.net.InetAddress m25709h(java.lang.String r10, int r11, int r12) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = 16;
            r0 = new byte[r0];
            r1 = -1;
            r2 = 0;
            r3 = 0;
            r4 = -1;
            r5 = -1;
        L_0x0009:
            r6 = 0;
            if (r11 >= r12) goto L_0x007c;
        L_0x000c:
            r7 = r0.length;
            if (r3 != r7) goto L_0x0010;
        L_0x000f:
            return r6;
        L_0x0010:
            r7 = r11 + 2;
            if (r7 > r12) goto L_0x0029;
        L_0x0014:
            r8 = "::";
            r9 = 2;
            r8 = r10.regionMatches(r11, r8, r2, r9);
            if (r8 == 0) goto L_0x0029;
        L_0x001d:
            if (r4 == r1) goto L_0x0020;
        L_0x001f:
            return r6;
        L_0x0020:
            r3 = r3 + 2;
            if (r7 != r12) goto L_0x0026;
        L_0x0024:
            r4 = r3;
            goto L_0x007c;
        L_0x0026:
            r4 = r3;
            r5 = r7;
            goto L_0x004d;
        L_0x0029:
            if (r3 == 0) goto L_0x004c;
        L_0x002b:
            r7 = ":";
            r8 = 1;
            r7 = r10.regionMatches(r11, r7, r2, r8);
            if (r7 == 0) goto L_0x0037;
        L_0x0034:
            r11 = r11 + 1;
            goto L_0x004c;
        L_0x0037:
            r7 = ".";
            r11 = r10.regionMatches(r11, r7, r2, r8);
            if (r11 == 0) goto L_0x004b;
        L_0x003f:
            r11 = r3 + -2;
            r10 = m25697a(r10, r5, r12, r0, r11);
            if (r10 != 0) goto L_0x0048;
        L_0x0047:
            return r6;
        L_0x0048:
            r3 = r3 + 2;
            goto L_0x007c;
        L_0x004b:
            return r6;
        L_0x004c:
            r5 = r11;
        L_0x004d:
            r11 = r5;
            r7 = 0;
        L_0x004f:
            if (r11 >= r12) goto L_0x0062;
        L_0x0051:
            r8 = r10.charAt(r11);
            r8 = com.squareup.okhttp.HttpUrl.m25719a(r8);
            if (r8 != r1) goto L_0x005c;
        L_0x005b:
            goto L_0x0062;
        L_0x005c:
            r7 = r7 << 4;
            r7 = r7 + r8;
            r11 = r11 + 1;
            goto L_0x004f;
        L_0x0062:
            r8 = r11 - r5;
            if (r8 == 0) goto L_0x007b;
        L_0x0066:
            r9 = 4;
            if (r8 <= r9) goto L_0x006a;
        L_0x0069:
            goto L_0x007b;
        L_0x006a:
            r6 = r3 + 1;
            r8 = r7 >>> 8;
            r8 = r8 & 255;
            r8 = (byte) r8;
            r0[r3] = r8;
            r3 = r6 + 1;
            r7 = r7 & 255;
            r7 = (byte) r7;
            r0[r6] = r7;
            goto L_0x0009;
        L_0x007b:
            return r6;
        L_0x007c:
            r10 = r0.length;
            if (r3 == r10) goto L_0x008f;
        L_0x007f:
            if (r4 != r1) goto L_0x0082;
        L_0x0081:
            return r6;
        L_0x0082:
            r10 = r0.length;
            r11 = r3 - r4;
            r10 = r10 - r11;
            java.lang.System.arraycopy(r0, r4, r0, r10, r11);
            r10 = r0.length;
            r10 = r10 - r3;
            r10 = r10 + r4;
            java.util.Arrays.fill(r0, r4, r10, r2);
        L_0x008f:
            r10 = java.net.InetAddress.getByAddress(r0);	 Catch:{ UnknownHostException -> 0x0094 }
            return r10;
        L_0x0094:
            r10 = new java.lang.AssertionError;
            r10.<init>();
            throw r10;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.HttpUrl.Builder.h(java.lang.String, int, int):java.net.InetAddress");
        }

        /* renamed from: a */
        private static boolean m25697a(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == bArr.length) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0') {
                        break;
                    } else if (charAt > '9') {
                        break;
                    } else if (i6 == 0 && i != i5) {
                        return false;
                    } else {
                        i6 = ((i6 * 10) + charAt) - 48;
                        if (i6 > 255) {
                            return false;
                        }
                        i5++;
                    }
                }
                if (i5 - i == 0) {
                    return false;
                }
                i = i4 + 1;
                bArr[i4] = (byte) i6;
                i4 = i;
                i = i5;
            }
            if (i4 != i3 + 4) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        private static java.lang.String m25706f(java.lang.String r2) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = 0;
            r2 = java.net.IDN.toASCII(r2);	 Catch:{ IllegalArgumentException -> 0x001a }
            r1 = java.util.Locale.US;	 Catch:{ IllegalArgumentException -> 0x001a }
            r2 = r2.toLowerCase(r1);	 Catch:{ IllegalArgumentException -> 0x001a }
            r1 = r2.isEmpty();	 Catch:{ IllegalArgumentException -> 0x001a }
            if (r1 == 0) goto L_0x0012;	 Catch:{ IllegalArgumentException -> 0x001a }
        L_0x0011:
            return r0;	 Catch:{ IllegalArgumentException -> 0x001a }
        L_0x0012:
            r1 = m25708g(r2);	 Catch:{ IllegalArgumentException -> 0x001a }
            if (r1 == 0) goto L_0x0019;
        L_0x0018:
            return r0;
        L_0x0019:
            return r2;
        L_0x001a:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.HttpUrl.Builder.f(java.lang.String):java.lang.String");
        }

        /* renamed from: g */
        private static boolean m25708g(String str) {
            int i = 0;
            while (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt > '\u001f') {
                    if (charAt < '') {
                        if (" #%/:?@[\\]".indexOf(charAt) != -1) {
                            return true;
                        }
                        i++;
                    }
                }
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private static String m25694a(byte[] bArr) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = -1;
            while (i2 < bArr.length) {
                int i5 = i2;
                while (i5 < 16 && bArr[i5] == (byte) 0 && bArr[i5 + 1] == (byte) 0) {
                    i5 += 2;
                }
                int i6 = i5 - i2;
                if (i6 > i3) {
                    i4 = i2;
                    i3 = i6;
                }
                i2 = i5 + 2;
            }
            C18549c c18549c = new C18549c();
            while (i < bArr.length) {
                if (i == i4) {
                    c18549c.b(58);
                    i += i3;
                    if (i == 16) {
                        c18549c.b(58);
                    }
                } else {
                    if (i > 0) {
                        c18549c.b(58);
                    }
                    c18549c.f((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                    i += 2;
                }
            }
            return c18549c.readUtf8();
        }

        /* renamed from: i */
        private static int m25710i(java.lang.String r8, int r9, int r10) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = -1;
            r4 = "";	 Catch:{ NumberFormatException -> 0x001a }
            r5 = 0;	 Catch:{ NumberFormatException -> 0x001a }
            r6 = 0;	 Catch:{ NumberFormatException -> 0x001a }
            r7 = 1;	 Catch:{ NumberFormatException -> 0x001a }
            r1 = r8;	 Catch:{ NumberFormatException -> 0x001a }
            r2 = r9;	 Catch:{ NumberFormatException -> 0x001a }
            r3 = r10;	 Catch:{ NumberFormatException -> 0x001a }
            r8 = com.squareup.okhttp.HttpUrl.m25723a(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ NumberFormatException -> 0x001a }
            r8 = java.lang.Integer.parseInt(r8);	 Catch:{ NumberFormatException -> 0x001a }
            if (r8 <= 0) goto L_0x0019;
        L_0x0013:
            r9 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
            if (r8 > r9) goto L_0x0019;
        L_0x0018:
            return r8;
        L_0x0019:
            return r0;
        L_0x001a:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.HttpUrl.Builder.i(java.lang.String, int, int):int");
        }
    }

    /* renamed from: a */
    static int m25719a(char c) {
        return (c < '0' || c > '9') ? (c < 'a' || c > 'f') ? (c < 'A' || c > 'F') ? -1 : (c - 65) + 10 : (c - 97) + 10 : c - 48;
    }

    private HttpUrl(Builder builder) {
        this.f21891b = builder.f21882a;
        this.f21892c = m25726a(builder.f21883b, false);
        this.f21893d = m25726a(builder.f21884c, false);
        this.f21894e = builder.f21885d;
        this.f21895f = builder.m25711a();
        this.f21896g = m25727a(builder.f21887f, false);
        String str = null;
        this.f21897h = builder.f21888g != null ? m25727a(builder.f21888g, true) : null;
        if (builder.f21889h != null) {
            str = m25726a(builder.f21889h, false);
        }
        this.f21898i = str;
        this.f21899j = builder.toString();
    }

    /* renamed from: a */
    public URL m25737a() {
        try {
            return new URL(this.f21899j);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public java.net.URI m25738b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.m25751n();	 Catch:{ URISyntaxException -> 0x0012 }
        r0 = r0.m25715b();	 Catch:{ URISyntaxException -> 0x0012 }
        r0 = r0.toString();	 Catch:{ URISyntaxException -> 0x0012 }
        r1 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0012 }
        r1.<init>(r0);	 Catch:{ URISyntaxException -> 0x0012 }
        return r1;
    L_0x0012:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "not valid as a java.net.URI: ";
        r1.append(r2);
        r2 = r3.f21899j;
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.HttpUrl.b():java.net.URI");
    }

    /* renamed from: c */
    public String m25740c() {
        return this.f21891b;
    }

    /* renamed from: d */
    public boolean m25741d() {
        return this.f21891b.equals("https");
    }

    /* renamed from: e */
    public String m25742e() {
        if (this.f21892c.isEmpty()) {
            return "";
        }
        int length = this.f21891b.length() + 3;
        return this.f21899j.substring(length, m25731b(this.f21899j, length, this.f21899j.length(), ":@"));
    }

    /* renamed from: f */
    public String m25743f() {
        if (this.f21893d.isEmpty()) {
            return "";
        }
        return this.f21899j.substring(this.f21899j.indexOf(58, this.f21891b.length() + 3) + 1, this.f21899j.indexOf(64));
    }

    /* renamed from: g */
    public String m25744g() {
        return this.f21894e;
    }

    /* renamed from: h */
    public int m25745h() {
        return this.f21895f;
    }

    /* renamed from: a */
    public static int m25720a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") != null ? 443 : -1;
    }

    /* renamed from: i */
    public String m25746i() {
        int indexOf = this.f21899j.indexOf(47, this.f21891b.length() + 3);
        return this.f21899j.substring(indexOf, m25731b(this.f21899j, indexOf, this.f21899j.length(), "?#"));
    }

    /* renamed from: a */
    static void m25728a(StringBuilder stringBuilder, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append('/');
            stringBuilder.append((String) list.get(i));
        }
    }

    /* renamed from: j */
    public List<String> m25747j() {
        int indexOf = this.f21899j.indexOf(47, this.f21891b.length() + 3);
        int b = m25731b(this.f21899j, indexOf, this.f21899j.length(), "?#");
        List<String> arrayList = new ArrayList();
        while (indexOf < b) {
            indexOf++;
            int b2 = m25731b(this.f21899j, indexOf, b, "/");
            arrayList.add(this.f21899j.substring(indexOf, b2));
            indexOf = b2;
        }
        return arrayList;
    }

    /* renamed from: k */
    public String m25748k() {
        if (this.f21897h == null) {
            return null;
        }
        int indexOf = this.f21899j.indexOf(63) + 1;
        return this.f21899j.substring(indexOf, m25731b(this.f21899j, indexOf + 1, this.f21899j.length(), "#"));
    }

    /* renamed from: b */
    static void m25734b(StringBuilder stringBuilder, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
            }
            stringBuilder.append(str);
            if (str2 != null) {
                stringBuilder.append('=');
                stringBuilder.append(str2);
            }
        }
    }

    /* renamed from: b */
    static List<String> m25733b(String str) {
        List<String> arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 != -1) {
                if (indexOf2 <= indexOf) {
                    arrayList.add(str.substring(i, indexOf2));
                    arrayList.add(str.substring(indexOf2 + 1, indexOf));
                    i = indexOf + 1;
                }
            }
            arrayList.add(str.substring(i, indexOf));
            arrayList.add(null);
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: l */
    public String m25749l() {
        if (this.f21897h == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        m25734b(stringBuilder, this.f21897h);
        return stringBuilder.toString();
    }

    /* renamed from: m */
    public String m25750m() {
        if (this.f21898i == null) {
            return null;
        }
        return this.f21899j.substring(this.f21899j.indexOf(35) + 1);
    }

    /* renamed from: c */
    public HttpUrl m25739c(String str) {
        Builder builder = new Builder();
        return builder.m25712a(this, str) == ParseResult.SUCCESS ? builder.m25718c() : null;
    }

    /* renamed from: n */
    public Builder m25751n() {
        Builder builder = new Builder();
        builder.f21882a = this.f21891b;
        builder.f21883b = m25742e();
        builder.f21884c = m25743f();
        builder.f21885d = this.f21894e;
        builder.f21886e = this.f21895f != m25720a(this.f21891b) ? this.f21895f : -1;
        builder.f21887f.clear();
        builder.f21887f.addAll(m25747j());
        builder.m25717c(m25748k());
        builder.f21889h = m25750m();
        return builder;
    }

    /* renamed from: d */
    public static HttpUrl m25736d(String str) {
        Builder builder = new Builder();
        if (builder.m25712a(null, str) == ParseResult.SUCCESS) {
            return builder.m25718c();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (!(obj instanceof HttpUrl) || ((HttpUrl) obj).f21899j.equals(this.f21899j) == null) ? null : true;
    }

    public int hashCode() {
        return this.f21899j.hashCode();
    }

    public String toString() {
        return this.f21899j;
    }

    /* renamed from: b */
    private static int m25731b(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    static String m25726a(String str, boolean z) {
        return m25724a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private List<String> m25727a(List<String> list, boolean z) {
        List arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(str != null ? m25726a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static String m25724a(String str, int i, int i2, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt != '%') {
                if (charAt != '+' || !z) {
                    i3++;
                }
            }
            C18549c c18549c = new C18549c();
            c18549c.a(str, i, i3);
            m25730a(c18549c, str, i3, i2, z);
            return c18549c.readUtf8();
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m25730a(C18549c c18549c, String str, int i, int i2, boolean z) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37) {
                int i3 = i + 2;
                if (i3 < i2) {
                    int a = m25719a(str.charAt(i + 1));
                    int a2 = m25719a(str.charAt(i3));
                    if (!(a == -1 || a2 == -1)) {
                        c18549c.b((a << 4) + a2);
                        i = i3;
                        i += Character.charCount(codePointAt);
                    }
                    c18549c.a(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
            if (codePointAt == 43 && z) {
                c18549c.b(32);
                i += Character.charCount(codePointAt);
            }
            c18549c.a(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static String m25723a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < ProfileEditingConfig.DEFAULT_MAX_LENGTH || !z3) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || z))) {
                if (codePointAt != 43 || !z2) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            C18549c c18549c = new C18549c();
            c18549c.a(str, i, i3);
            m25729a(c18549c, str, i3, i2, str2, z, z2, z3);
            return c18549c.readUtf8();
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m25729a(C18549c c18549c, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3) {
        C18549c c18549c2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (z) {
                if (!(codePointAt == 9 || codePointAt == 10 || codePointAt == 12)) {
                    if (codePointAt == 13) {
                    }
                }
                i += Character.charCount(codePointAt);
            }
            if (codePointAt == 43 && z2) {
                c18549c.a(z ? "+" : "%2B");
                i += Character.charCount(codePointAt);
            } else {
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < ProfileEditingConfig.DEFAULT_MAX_LENGTH || !z3) && str2.indexOf(codePointAt) == -1)) {
                    if (codePointAt != 37 || z) {
                        c18549c.a(codePointAt);
                        i += Character.charCount(codePointAt);
                    }
                }
                if (c18549c2 == null) {
                    c18549c2 = new C18549c();
                }
                c18549c2.a(codePointAt);
                while (!c18549c2.exhausted()) {
                    int readByte = c18549c2.readByte() & 255;
                    c18549c.b(37);
                    c18549c.b(f21890a[(readByte >> 4) & 15]);
                    c18549c.b(f21890a[readByte & 15]);
                }
                i += Character.charCount(codePointAt);
            }
        }
    }

    /* renamed from: a */
    static String m25725a(String str, String str2, boolean z, boolean z2, boolean z3) {
        return m25723a(str, 0, str.length(), str2, z, z2, z3);
    }
}
