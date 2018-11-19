package okhttp3;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.internal.C15908c;
import okio.C18549c;

public final class HttpUrl {
    /* renamed from: d */
    private static final char[] f49073d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    /* renamed from: a */
    final String f49074a;
    /* renamed from: b */
    final String f49075b;
    /* renamed from: c */
    final int f49076c;
    /* renamed from: e */
    private final String f49077e;
    /* renamed from: f */
    private final String f49078f;
    /* renamed from: g */
    private final List<String> f49079g;
    @Nullable
    /* renamed from: h */
    private final List<String> f49080h;
    @Nullable
    /* renamed from: i */
    private final String f49081i;
    /* renamed from: j */
    private final String f49082j;

    public static final class Builder {
        @Nullable
        /* renamed from: a */
        String f49065a;
        /* renamed from: b */
        String f49066b = "";
        /* renamed from: c */
        String f49067c = "";
        @Nullable
        /* renamed from: d */
        String f49068d;
        /* renamed from: e */
        int f49069e = -1;
        /* renamed from: f */
        final List<String> f49070f = new ArrayList();
        @Nullable
        /* renamed from: g */
        List<String> f49071g;
        @Nullable
        /* renamed from: h */
        String f49072h;

        enum ParseResult {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public Builder() {
            this.f49070f.add("");
        }

        /* renamed from: a */
        public Builder m59976a(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f49065a = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.f49065a = "https";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected scheme: ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            return this;
        }

        /* renamed from: b */
        public Builder m59979b(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f49066b = HttpUrl.m59989a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: c */
        public Builder m59981c(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f49067c = HttpUrl.m59989a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: d */
        public Builder m59983d(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String e = m59969e(str, 0, str.length());
            if (e == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected host: ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.f49068d = e;
            return this;
        }

        /* renamed from: a */
        public Builder m59975a(int i) {
            if (i > 0) {
                if (i <= 65535) {
                    this.f49069e = i;
                    return this;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected port: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        /* renamed from: a */
        int m59973a() {
            return this.f49069e != -1 ? this.f49069e : HttpUrl.m59986a(this.f49065a);
        }

        /* renamed from: e */
        public Builder m59984e(String str) {
            if (str == null) {
                throw new NullPointerException("pathSegment == null");
            }
            m59964a(str, 0, str.length(), false, false);
            return this;
        }

        /* renamed from: f */
        public Builder m59985f(@Nullable String str) {
            if (str != null) {
                str = HttpUrl.m59998b(HttpUrl.m59989a(str, " \"'<>#", true, false, true, true));
            } else {
                str = null;
            }
            this.f49071g = str;
            return this;
        }

        /* renamed from: a */
        public Builder m59977a(String str, @Nullable String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.f49071g == null) {
                this.f49071g = new ArrayList();
            }
            this.f49071g.add(HttpUrl.m59989a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            str = this.f49071g;
            if (str2 != null) {
                str2 = HttpUrl.m59989a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
            } else {
                str2 = null;
            }
            str.add(str2);
            return this;
        }

        /* renamed from: b */
        public Builder m59980b(String str, @Nullable String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.f49071g == null) {
                this.f49071g = new ArrayList();
            }
            this.f49071g.add(HttpUrl.m59989a(str, " \"'<>#&=", true, false, true, true));
            str = this.f49071g;
            if (str2 != null) {
                str2 = HttpUrl.m59989a(str2, " \"'<>#&=", true, false, true, true);
            } else {
                str2 = null;
            }
            str.add(str2);
            return this;
        }

        /* renamed from: b */
        Builder m59978b() {
            int size = this.f49070f.size();
            for (int i = 0; i < size; i++) {
                this.f49070f.set(i, HttpUrl.m59989a((String) this.f49070f.get(i), "[]", true, true, false, true));
            }
            if (this.f49071g != null) {
                size = this.f49071g.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str = (String) this.f49071g.get(i2);
                    if (str != null) {
                        this.f49071g.set(i2, HttpUrl.m59989a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            if (this.f49072h != null) {
                this.f49072h = HttpUrl.m59989a(this.f49072h, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: c */
        public HttpUrl m59982c() {
            if (this.f49065a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f49068d != null) {
                return new HttpUrl(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f49065a);
            stringBuilder.append("://");
            if (!(this.f49066b.isEmpty() && this.f49067c.isEmpty())) {
                stringBuilder.append(this.f49066b);
                if (!this.f49067c.isEmpty()) {
                    stringBuilder.append(':');
                    stringBuilder.append(this.f49067c);
                }
                stringBuilder.append('@');
            }
            if (this.f49068d.indexOf(58) != -1) {
                stringBuilder.append('[');
                stringBuilder.append(this.f49068d);
                stringBuilder.append(']');
            } else {
                stringBuilder.append(this.f49068d);
            }
            int a = m59973a();
            if (a != HttpUrl.m59986a(this.f49065a)) {
                stringBuilder.append(':');
                stringBuilder.append(a);
            }
            HttpUrl.m59994a(stringBuilder, this.f49070f);
            if (this.f49071g != null) {
                stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
                HttpUrl.m59999b(stringBuilder, this.f49071g);
            }
            if (this.f49072h != null) {
                stringBuilder.append('#');
                stringBuilder.append(this.f49072h);
            }
            return stringBuilder.toString();
        }

        /* renamed from: a */
        ParseResult m59974a(@Nullable HttpUrl httpUrl, String str) {
            int a;
            int i;
            Builder builder = this;
            HttpUrl httpUrl2 = httpUrl;
            String str2 = str;
            int a2 = C15908c.m60150a(str2, 0, str.length());
            int b = C15908c.m60174b(str2, a2, str.length());
            if (m59965b(str2, a2, b) != -1) {
                if (str2.regionMatches(true, a2, "https:", 0, 6)) {
                    builder.f49065a = "https";
                    a2 += "https:".length();
                } else {
                    if (!str2.regionMatches(true, a2, "http:", 0, 5)) {
                        return ParseResult.UNSUPPORTED_SCHEME;
                    }
                    builder.f49065a = "http";
                    a2 += "http:".length();
                }
            } else if (httpUrl2 == null) {
                return ParseResult.MISSING_SCHEME;
            } else {
                builder.f49065a = httpUrl2.f49074a;
            }
            int c = m59966c(str2, a2, b);
            char c2 = '#';
            if (c < 2 && httpUrl2 != null) {
                if (httpUrl2.f49074a.equals(builder.f49065a)) {
                    builder.f49066b = httpUrl.m60007e();
                    builder.f49067c = httpUrl.m60009f();
                    builder.f49068d = httpUrl2.f49075b;
                    builder.f49069e = httpUrl2.f49076c;
                    builder.f49070f.clear();
                    builder.f49070f.addAll(httpUrl.m60013j());
                    if (a2 == b || str2.charAt(a2) == '#') {
                        m59985f(httpUrl.m60015l());
                    }
                    int i2 = a2;
                    a = C15908c.m60152a(str2, i2, b, "?#");
                    m59963a(str2, i2, a);
                    if (a < b || str2.charAt(a) != ManagerWebServices.QUERY_QUESTION_MARK) {
                        i = a;
                    } else {
                        i = C15908c.m60151a(str2, a, b, '#');
                        builder.f49071g = HttpUrl.m59998b(HttpUrl.m59987a(str2, a + 1, i, " \"'<>#", true, false, true, true, null));
                    }
                    if (i < b && str2.charAt(i) == '#') {
                        builder.f49072h = HttpUrl.m59987a(str2, i + 1, b, "", true, false, false, false, null);
                    }
                    return ParseResult.SUCCESS;
                }
            }
            c = a2 + c;
            Object obj = null;
            Object obj2 = null;
            while (true) {
                a2 = C15908c.m60152a(str2, c, b, "@/\\?#");
                char charAt = a2 != b ? str2.charAt(a2) : '￿';
                if (!(charAt == '￿' || charAt == r13 || charAt == '/' || charAt == '\\')) {
                    switch (charAt) {
                        case '?':
                            break;
                        case '@':
                            if (obj == null) {
                                int a3 = C15908c.m60151a(str2, c, a2, ':');
                                int i3 = a3;
                                i2 = a2;
                                String a4 = HttpUrl.m59987a(str2, c, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                if (obj2 != null) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append(builder.f49066b);
                                    stringBuilder.append("%40");
                                    stringBuilder.append(a4);
                                    a4 = stringBuilder.toString();
                                }
                                builder.f49066b = a4;
                                if (i3 != i2) {
                                    builder.f49067c = HttpUrl.m59987a(str2, i3 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                    obj = 1;
                                }
                                obj2 = 1;
                            } else {
                                i2 = a2;
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(builder.f49067c);
                                stringBuilder2.append("%40");
                                stringBuilder2.append(HttpUrl.m59987a(str2, c, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                builder.f49067c = stringBuilder2.toString();
                            }
                            c = i2 + 1;
                            continue;
                        default:
                            continue;
                    }
                }
                i2 = a2;
                a = m59967d(str2, c, i2);
                int i4 = a + 1;
                if (i4 < i2) {
                    builder.f49068d = m59969e(str2, c, a);
                    builder.f49069e = m59970f(str2, i4, i2);
                    if (builder.f49069e == -1) {
                        return ParseResult.INVALID_PORT;
                    }
                }
                builder.f49068d = m59969e(str2, c, a);
                builder.f49069e = HttpUrl.m59986a(builder.f49065a);
                if (builder.f49068d == null) {
                    return ParseResult.INVALID_HOST;
                }
                a = C15908c.m60152a(str2, i2, b, "?#");
                m59963a(str2, i2, a);
                if (a < b) {
                }
                i = a;
                builder.f49072h = HttpUrl.m59987a(str2, i + 1, b, "", true, false, false, false, null);
                return ParseResult.SUCCESS;
                c2 = '#';
            }
        }

        /* renamed from: a */
        private void m59963a(String str, int i, int i2) {
            if (i != i2) {
                int i3;
                boolean z;
                char charAt = str.charAt(i);
                if (charAt != '/') {
                    if (charAt != '\\') {
                        this.f49070f.set(this.f49070f.size() - 1, "");
                        while (true) {
                            i3 = i;
                            if (i3 < i2) {
                                i = C15908c.m60152a(str, i3, i2, "/\\");
                                z = i >= i2;
                                m59964a(str, i3, i, z, true);
                                if (z) {
                                    i++;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
                this.f49070f.clear();
                this.f49070f.add("");
                i++;
                while (true) {
                    i3 = i;
                    if (i3 < i2) {
                        i = C15908c.m60152a(str, i3, i2, "/\\");
                        if (i >= i2) {
                        }
                        m59964a(str, i3, i, z, true);
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
        private void m59964a(String str, int i, int i2, boolean z, boolean z2) {
            str = HttpUrl.m59987a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (m59971g(str) == 0) {
                if (m59972h(str) != 0) {
                    m59968d();
                    return;
                }
                if (((String) this.f49070f.get(this.f49070f.size() - 1)).isEmpty() != 0) {
                    this.f49070f.set(this.f49070f.size() - 1, str);
                } else {
                    this.f49070f.add(str);
                }
                if (z) {
                    this.f49070f.add("");
                }
            }
        }

        /* renamed from: g */
        private boolean m59971g(String str) {
            if (!str.equals(".")) {
                if (str.equalsIgnoreCase("%2e") == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: h */
        private boolean m59972h(String str) {
            if (!(str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e"))) {
                if (str.equalsIgnoreCase("%2e%2e") == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: d */
        private void m59968d() {
            if (!((String) this.f49070f.remove(this.f49070f.size() - 1)).isEmpty() || this.f49070f.isEmpty()) {
                this.f49070f.add("");
            } else {
                this.f49070f.set(this.f49070f.size() - 1, "");
            }
        }

        /* renamed from: b */
        private static int m59965b(String str, int i, int i2) {
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

        /* renamed from: c */
        private static int m59966c(String str, int i, int i2) {
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

        /* renamed from: d */
        private static int m59967d(String str, int i, int i2) {
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

        /* renamed from: e */
        private static String m59969e(String str, int i, int i2) {
            return C15908c.m60156a(HttpUrl.m59988a(str, i, i2, false));
        }

        /* renamed from: f */
        private static int m59970f(java.lang.String r10, int r11, int r12) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = -1;
            r4 = "";	 Catch:{ NumberFormatException -> 0x001c }
            r5 = 0;	 Catch:{ NumberFormatException -> 0x001c }
            r6 = 0;	 Catch:{ NumberFormatException -> 0x001c }
            r7 = 0;	 Catch:{ NumberFormatException -> 0x001c }
            r8 = 1;	 Catch:{ NumberFormatException -> 0x001c }
            r9 = 0;	 Catch:{ NumberFormatException -> 0x001c }
            r1 = r10;	 Catch:{ NumberFormatException -> 0x001c }
            r2 = r11;	 Catch:{ NumberFormatException -> 0x001c }
            r3 = r12;	 Catch:{ NumberFormatException -> 0x001c }
            r10 = okhttp3.HttpUrl.m59987a(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ NumberFormatException -> 0x001c }
            r10 = java.lang.Integer.parseInt(r10);	 Catch:{ NumberFormatException -> 0x001c }
            if (r10 <= 0) goto L_0x001b;
        L_0x0015:
            r11 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
            if (r10 > r11) goto L_0x001b;
        L_0x001a:
            return r10;
        L_0x001b:
            return r0;
        L_0x001c:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.f(java.lang.String, int, int):int");
        }
    }

    HttpUrl(Builder builder) {
        this.f49074a = builder.f49065a;
        this.f49077e = m59991a(builder.f49066b, false);
        this.f49078f = m59991a(builder.f49067c, false);
        this.f49075b = builder.f49068d;
        this.f49076c = builder.m59973a();
        this.f49079g = m59992a(builder.f49070f, false);
        String str = null;
        this.f49080h = builder.f49071g != null ? m59992a(builder.f49071g, true) : null;
        if (builder.f49072h != null) {
            str = m59991a(builder.f49072h, false);
        }
        this.f49081i = str;
        this.f49082j = builder.toString();
    }

    /* renamed from: a */
    public URL m60001a() {
        try {
            return new URL(this.f49082j);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public java.net.URI m60002b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.m60020q();
        r0 = r0.m59978b();
        r0 = r0.toString();
        r1 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0012 }
        r1.<init>(r0);	 Catch:{ URISyntaxException -> 0x0012 }
        return r1;
    L_0x0012:
        r1 = move-exception;
        r2 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]";	 Catch:{ Exception -> 0x0020 }
        r3 = "";	 Catch:{ Exception -> 0x0020 }
        r0 = r0.replaceAll(r2, r3);	 Catch:{ Exception -> 0x0020 }
        r0 = java.net.URI.create(r0);	 Catch:{ Exception -> 0x0020 }
        return r0;
    L_0x0020:
        r0 = new java.lang.RuntimeException;
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.b():java.net.URI");
    }

    /* renamed from: c */
    public String m60003c() {
        return this.f49074a;
    }

    /* renamed from: d */
    public boolean m60006d() {
        return this.f49074a.equals("https");
    }

    /* renamed from: e */
    public String m60007e() {
        if (this.f49077e.isEmpty()) {
            return "";
        }
        int length = this.f49074a.length() + 3;
        return this.f49082j.substring(length, C15908c.m60152a(this.f49082j, length, this.f49082j.length(), ":@"));
    }

    /* renamed from: f */
    public String m60009f() {
        if (this.f49078f.isEmpty()) {
            return "";
        }
        return this.f49082j.substring(this.f49082j.indexOf(58, this.f49074a.length() + 3) + 1, this.f49082j.indexOf(64));
    }

    /* renamed from: g */
    public String m60010g() {
        return this.f49075b;
    }

    /* renamed from: h */
    public int m60011h() {
        return this.f49076c;
    }

    /* renamed from: a */
    public static int m59986a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") != null ? 443 : -1;
    }

    /* renamed from: i */
    public String m60012i() {
        int indexOf = this.f49082j.indexOf(47, this.f49074a.length() + 3);
        return this.f49082j.substring(indexOf, C15908c.m60152a(this.f49082j, indexOf, this.f49082j.length(), "?#"));
    }

    /* renamed from: a */
    static void m59994a(StringBuilder stringBuilder, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append('/');
            stringBuilder.append((String) list.get(i));
        }
    }

    /* renamed from: j */
    public List<String> m60013j() {
        int indexOf = this.f49082j.indexOf(47, this.f49074a.length() + 3);
        int a = C15908c.m60152a(this.f49082j, indexOf, this.f49082j.length(), "?#");
        List<String> arrayList = new ArrayList();
        while (indexOf < a) {
            indexOf++;
            int a2 = C15908c.m60151a(this.f49082j, indexOf, a, '/');
            arrayList.add(this.f49082j.substring(indexOf, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    /* renamed from: k */
    public List<String> m60014k() {
        return this.f49079g;
    }

    @Nullable
    /* renamed from: l */
    public String m60015l() {
        if (this.f49080h == null) {
            return null;
        }
        int indexOf = this.f49082j.indexOf(63) + 1;
        return this.f49082j.substring(indexOf, C15908c.m60151a(this.f49082j, indexOf, this.f49082j.length(), '#'));
    }

    /* renamed from: b */
    static void m59999b(StringBuilder stringBuilder, List<String> list) {
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
    static List<String> m59998b(String str) {
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

    @Nullable
    /* renamed from: m */
    public String m60016m() {
        if (this.f49080h == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        m59999b(stringBuilder, this.f49080h);
        return stringBuilder.toString();
    }

    /* renamed from: n */
    public int m60017n() {
        return this.f49080h != null ? this.f49080h.size() / 2 : 0;
    }

    @Nullable
    /* renamed from: c */
    public String m60004c(String str) {
        if (this.f49080h == null) {
            return null;
        }
        int size = this.f49080h.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.f49080h.get(i))) {
                return (String) this.f49080h.get(i + 1);
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: o */
    public String m60018o() {
        if (this.f49081i == null) {
            return null;
        }
        return this.f49082j.substring(this.f49082j.indexOf(35) + 1);
    }

    /* renamed from: p */
    public String m60019p() {
        return m60008e("/...").m59979b("").m59981c("").m59982c().toString();
    }

    @Nullable
    /* renamed from: d */
    public HttpUrl m60005d(String str) {
        str = m60008e(str);
        return str != null ? str.m59982c() : null;
    }

    /* renamed from: q */
    public Builder m60020q() {
        Builder builder = new Builder();
        builder.f49065a = this.f49074a;
        builder.f49066b = m60007e();
        builder.f49067c = m60009f();
        builder.f49068d = this.f49075b;
        builder.f49069e = this.f49076c != m59986a(this.f49074a) ? this.f49076c : -1;
        builder.f49070f.clear();
        builder.f49070f.addAll(m60013j());
        builder.m59985f(m60015l());
        builder.f49072h = m60018o();
        return builder;
    }

    @Nullable
    /* renamed from: e */
    public Builder m60008e(String str) {
        Builder builder = new Builder();
        return builder.m59974a(this, str) == ParseResult.SUCCESS ? builder : null;
    }

    @Nullable
    /* renamed from: f */
    public static HttpUrl m60000f(String str) {
        Builder builder = new Builder();
        if (builder.m59974a(null, str) == ParseResult.SUCCESS) {
            return builder.m59982c();
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public static HttpUrl m59993a(URL url) {
        return m60000f(url.toString());
    }

    public boolean equals(@Nullable Object obj) {
        return (!(obj instanceof HttpUrl) || ((HttpUrl) obj).f49082j.equals(this.f49082j) == null) ? null : true;
    }

    public int hashCode() {
        return this.f49082j.hashCode();
    }

    public String toString() {
        return this.f49082j;
    }

    /* renamed from: a */
    static String m59991a(String str, boolean z) {
        return m59988a(str, 0, str.length(), z);
    }

    /* renamed from: a */
    private List<String> m59992a(List<String> list, boolean z) {
        int size = list.size();
        List arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            arrayList.add(str != null ? m59991a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static String m59988a(String str, int i, int i2, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt != '%') {
                if (charAt != '+' || !z) {
                    i3++;
                }
            }
            C18549c c18549c = new C18549c();
            c18549c.m66949a(str, i, i3);
            m59996a(c18549c, str, i3, i2, z);
            return c18549c.readUtf8();
        }
        return str.substring(i, i2);
    }

    /* renamed from: a */
    static void m59996a(C18549c c18549c, String str, int i, int i2, boolean z) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37) {
                int i3 = i + 2;
                if (i3 < i2) {
                    int a = C15908c.m60149a(str.charAt(i + 1));
                    int a2 = C15908c.m60149a(str.charAt(i3));
                    if (!(a == -1 || a2 == -1)) {
                        c18549c.m66958b((a << 4) + a2);
                        i = i3;
                        i += Character.charCount(codePointAt);
                    }
                    c18549c.m66947a(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
            if (codePointAt == 43 && z) {
                c18549c.m66958b(32);
                i += Character.charCount(codePointAt);
            }
            c18549c.m66947a(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    static boolean m59997a(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != 37 || C15908c.m60149a(str.charAt(i + 1)) == -1 || C15908c.m60149a(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static String m59987a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            String str4;
            int codePointAt = str3.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= ProfileEditingConfig.DEFAULT_MAX_LENGTH && z4)) {
                str4 = str2;
            } else {
                str4 = str2;
                if (str4.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z && (!z2 || m59997a(str3, i4, i3))))) {
                    if (codePointAt != 43 || !z3) {
                        i4 += Character.charCount(codePointAt);
                    }
                }
            }
            C18549c c18549c = new C18549c();
            c18549c.m66949a(str3, i, i4);
            m59995a(c18549c, str3, i4, i3, str4, z, z2, z3, z4, charset);
            return c18549c.readUtf8();
        }
        return str3.substring(i, i3);
    }

    /* renamed from: a */
    static void m59995a(C18549c c18549c, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
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
            if (codePointAt == 43 && z3) {
                c18549c.m66948a(z ? "+" : "%2B");
                i += Character.charCount(codePointAt);
            } else {
                int readByte;
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < ProfileEditingConfig.DEFAULT_MAX_LENGTH || !z4) && str2.indexOf(codePointAt) == -1)) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2 && !m59997a(str, i, i2)) {
                            }
                        }
                    }
                    c18549c.m66947a(codePointAt);
                    i += Character.charCount(codePointAt);
                }
                if (c18549c2 == null) {
                    c18549c2 = new C18549c();
                }
                if (charset != null) {
                    if (!charset.equals(C15908c.f49249e)) {
                        c18549c2.m66950a(str, i, Character.charCount(codePointAt) + i, charset);
                        while (!c18549c2.exhausted()) {
                            readByte = c18549c2.readByte() & 255;
                            c18549c.m66958b(37);
                            c18549c.m66958b(f49073d[(readByte >> 4) & 15]);
                            c18549c.m66958b(f49073d[readByte & 15]);
                        }
                        i += Character.charCount(codePointAt);
                    }
                }
                c18549c2.m66947a(codePointAt);
                while (!c18549c2.exhausted()) {
                    readByte = c18549c2.readByte() & 255;
                    c18549c.m66958b(37);
                    c18549c.m66958b(f49073d[(readByte >> 4) & 15]);
                    c18549c.m66958b(f49073d[readByte & 15]);
                }
                i += Character.charCount(codePointAt);
            }
        }
    }

    /* renamed from: a */
    static String m59990a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return m59987a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    /* renamed from: a */
    static String m59989a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m59987a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
