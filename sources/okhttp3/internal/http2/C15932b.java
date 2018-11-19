package okhttp3.internal.http2;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.tinder.ads.source.dfp.DfpCustomTargetingValuesKt;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.C15908c;
import okio.BufferedSource;
import okio.ByteString;
import okio.C15976k;
import okio.C18549c;
import okio.Source;

/* renamed from: okhttp3.internal.http2.b */
final class C15932b {
    /* renamed from: a */
    static final C15929a[] f49386a = new C15929a[]{new C15929a(C15929a.f49364f, ""), new C15929a(C15929a.f49361c, "GET"), new C15929a(C15929a.f49361c, "POST"), new C15929a(C15929a.f49362d, "/"), new C15929a(C15929a.f49362d, "/index.html"), new C15929a(C15929a.f49363e, "http"), new C15929a(C15929a.f49363e, "https"), new C15929a(C15929a.f49360b, "200"), new C15929a(C15929a.f49360b, "204"), new C15929a(C15929a.f49360b, "206"), new C15929a(C15929a.f49360b, "304"), new C15929a(C15929a.f49360b, "400"), new C15929a(C15929a.f49360b, "404"), new C15929a(C15929a.f49360b, "500"), new C15929a("accept-charset", ""), new C15929a("accept-encoding", "gzip, deflate"), new C15929a("accept-language", ""), new C15929a("accept-ranges", ""), new C15929a("accept", ""), new C15929a("access-control-allow-origin", ""), new C15929a(DfpCustomTargetingValuesKt.ADS_TARGETING_AGE, ""), new C15929a("allow", ""), new C15929a("authorization", ""), new C15929a("cache-control", ""), new C15929a("content-disposition", ""), new C15929a("content-encoding", ""), new C15929a("content-language", ""), new C15929a("content-length", ""), new C15929a("content-location", ""), new C15929a("content-range", ""), new C15929a("content-type", ""), new C15929a("cookie", ""), new C15929a(ManagerWebServices.PARAM_DATE, ""), new C15929a("etag", ""), new C15929a("expect", ""), new C15929a("expires", ""), new C15929a(ManagerWebServices.PARAM_FROM, ""), new C15929a("host", ""), new C15929a("if-match", ""), new C15929a("if-modified-since", ""), new C15929a("if-none-match", ""), new C15929a("if-range", ""), new C15929a("if-unmodified-since", ""), new C15929a("last-modified", ""), new C15929a(ManagerWebServices.IG_PARAM_LINK, ""), new C15929a("location", ""), new C15929a("max-forwards", ""), new C15929a("proxy-authenticate", ""), new C15929a("proxy-authorization", ""), new C15929a("range", ""), new C15929a("referer", ""), new C15929a("refresh", ""), new C15929a("retry-after", ""), new C15929a("server", ""), new C15929a("set-cookie", ""), new C15929a("strict-transport-security", ""), new C15929a("transfer-encoding", ""), new C15929a("user-agent", ""), new C15929a("vary", ""), new C15929a("via", ""), new C15929a("www-authenticate", "")};
    /* renamed from: b */
    static final Map<ByteString, Integer> f49387b = C15932b.m60309a();

    /* renamed from: okhttp3.internal.http2.b$a */
    static final class C15930a {
        /* renamed from: a */
        C15929a[] f49368a;
        /* renamed from: b */
        int f49369b;
        /* renamed from: c */
        int f49370c;
        /* renamed from: d */
        int f49371d;
        /* renamed from: e */
        private final List<C15929a> f49372e;
        /* renamed from: f */
        private final BufferedSource f49373f;
        /* renamed from: g */
        private final int f49374g;
        /* renamed from: h */
        private int f49375h;

        C15930a(int i, Source source) {
            this(i, i, source);
        }

        C15930a(int i, int i2, Source source) {
            this.f49372e = new ArrayList();
            this.f49368a = new C15929a[8];
            this.f49369b = this.f49368a.length - 1;
            this.f49370c = 0;
            this.f49371d = 0;
            this.f49374g = i;
            this.f49375h = i2;
            this.f49373f = C15976k.m60609a(source);
        }

        /* renamed from: d */
        private void m60288d() {
            if (this.f49375h >= this.f49371d) {
                return;
            }
            if (this.f49375h == 0) {
                m60290e();
            } else {
                m60284a(this.f49371d - this.f49375h);
            }
        }

        /* renamed from: e */
        private void m60290e() {
            Arrays.fill(this.f49368a, null);
            this.f49369b = this.f49368a.length - 1;
            this.f49370c = 0;
            this.f49371d = 0;
        }

        /* renamed from: a */
        private int m60284a(int i) {
            int i2 = 0;
            if (i > 0) {
                for (int length = this.f49368a.length - 1; length >= this.f49369b && i > 0; length--) {
                    i -= this.f49368a[length].f49367i;
                    this.f49371d -= this.f49368a[length].f49367i;
                    this.f49370c--;
                    i2++;
                }
                System.arraycopy(this.f49368a, this.f49369b + 1, this.f49368a, (this.f49369b + 1) + i2, this.f49370c);
                this.f49369b += i2;
            }
            return i2;
        }

        /* renamed from: a */
        void m60298a() throws IOException {
            while (!this.f49373f.exhausted()) {
                int readByte = this.f49373f.readByte() & 255;
                if (readByte == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                    throw new IOException("index == 0");
                } else if ((readByte & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                    m60286b(m60297a(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m60294g();
                } else if ((readByte & 64) == 64) {
                    m60291e(m60297a(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    this.f49375h = m60297a(readByte, 31);
                    if (this.f49375h >= 0) {
                        if (this.f49375h <= this.f49374g) {
                            m60288d();
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid dynamic table size update ");
                    stringBuilder.append(this.f49375h);
                    throw new IOException(stringBuilder.toString());
                } else {
                    if (readByte != 16) {
                        if (readByte != 0) {
                            m60289d(m60297a(readByte, 15) - 1);
                        }
                    }
                    m60293f();
                }
            }
        }

        /* renamed from: b */
        public List<C15929a> m60299b() {
            List arrayList = new ArrayList(this.f49372e);
            this.f49372e.clear();
            return arrayList;
        }

        /* renamed from: b */
        private void m60286b(int i) throws IOException {
            if (m60295g(i)) {
                this.f49372e.add(C15932b.f49386a[i]);
                return;
            }
            int c = m60287c(i - C15932b.f49386a.length);
            if (c >= 0) {
                if (c < this.f49368a.length) {
                    this.f49372e.add(this.f49368a[c]);
                    return;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Header index too large ");
            stringBuilder.append(i + 1);
            throw new IOException(stringBuilder.toString());
        }

        /* renamed from: c */
        private int m60287c(int i) {
            return (this.f49369b + 1) + i;
        }

        /* renamed from: d */
        private void m60289d(int i) throws IOException {
            this.f49372e.add(new C15929a(m60292f(i), m60300c()));
        }

        /* renamed from: f */
        private void m60293f() throws IOException {
            this.f49372e.add(new C15929a(C15932b.m60310a(m60300c()), m60300c()));
        }

        /* renamed from: e */
        private void m60291e(int i) throws IOException {
            m60285a(-1, new C15929a(m60292f(i), m60300c()));
        }

        /* renamed from: g */
        private void m60294g() throws IOException {
            m60285a(-1, new C15929a(C15932b.m60310a(m60300c()), m60300c()));
        }

        /* renamed from: f */
        private ByteString m60292f(int i) throws IOException {
            if (m60295g(i)) {
                return C15932b.f49386a[i].f49365g;
            }
            int c = m60287c(i - C15932b.f49386a.length);
            if (c >= 0) {
                if (c < this.f49368a.length) {
                    return this.f49368a[c].f49365g;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Header index too large ");
            stringBuilder.append(i + 1);
            throw new IOException(stringBuilder.toString());
        }

        /* renamed from: g */
        private boolean m60295g(int i) {
            return i >= 0 && i <= C15932b.f49386a.length - 1;
        }

        /* renamed from: a */
        private void m60285a(int i, C15929a c15929a) {
            this.f49372e.add(c15929a);
            int i2 = c15929a.f49367i;
            if (i != -1) {
                i2 -= this.f49368a[m60287c(i)].f49367i;
            }
            if (i2 > this.f49375h) {
                m60290e();
                return;
            }
            int a = m60284a((this.f49371d + i2) - this.f49375h);
            if (i == -1) {
                if (this.f49370c + 1 > this.f49368a.length) {
                    i = new C15929a[(this.f49368a.length * 2)];
                    System.arraycopy(this.f49368a, 0, i, this.f49368a.length, this.f49368a.length);
                    this.f49369b = this.f49368a.length - 1;
                    this.f49368a = i;
                }
                i = this.f49369b;
                this.f49369b = i - 1;
                this.f49368a[i] = c15929a;
                this.f49370c++;
            } else {
                this.f49368a[i + (m60287c(i) + a)] = c15929a;
            }
            this.f49371d += i2;
        }

        /* renamed from: h */
        private int m60296h() throws IOException {
            return this.f49373f.readByte() & 255;
        }

        /* renamed from: a */
        int m60297a(int i, int i2) throws IOException {
            i &= i2;
            if (i < i2) {
                return i;
            }
            i = 0;
            while (true) {
                int h = m60296h();
                if ((h & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                    return i2 + (h << i);
                }
                i2 += (h & 127) << i;
                i += 7;
            }
        }

        /* renamed from: c */
        ByteString m60300c() throws IOException {
            int h = m60296h();
            Object obj = (h & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH ? 1 : null;
            h = m60297a(h, 127);
            if (obj != null) {
                return ByteString.m60581a(C15942i.m60409a().m60414a(this.f49373f.readByteArray((long) h)));
            }
            return this.f49373f.readByteString((long) h);
        }
    }

    /* renamed from: okhttp3.internal.http2.b$b */
    static final class C15931b {
        /* renamed from: a */
        int f49376a;
        /* renamed from: b */
        int f49377b;
        /* renamed from: c */
        C15929a[] f49378c;
        /* renamed from: d */
        int f49379d;
        /* renamed from: e */
        int f49380e;
        /* renamed from: f */
        int f49381f;
        /* renamed from: g */
        private final C18549c f49382g;
        /* renamed from: h */
        private final boolean f49383h;
        /* renamed from: i */
        private int f49384i;
        /* renamed from: j */
        private boolean f49385j;

        C15931b(C18549c c18549c) {
            this(4096, true, c18549c);
        }

        C15931b(int i, boolean z, C18549c c18549c) {
            this.f49384i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f49378c = new C15929a[8];
            this.f49379d = this.f49378c.length - 1;
            this.f49380e = 0;
            this.f49381f = 0;
            this.f49376a = i;
            this.f49377b = i;
            this.f49383h = z;
            this.f49382g = c18549c;
        }

        /* renamed from: a */
        private void m60301a() {
            Arrays.fill(this.f49378c, null);
            this.f49379d = this.f49378c.length - 1;
            this.f49380e = 0;
            this.f49381f = 0;
        }

        /* renamed from: b */
        private int m60303b(int i) {
            int i2 = 0;
            if (i > 0) {
                for (int length = this.f49378c.length - 1; length >= this.f49379d && i > 0; length--) {
                    i -= this.f49378c[length].f49367i;
                    this.f49381f -= this.f49378c[length].f49367i;
                    this.f49380e--;
                    i2++;
                }
                System.arraycopy(this.f49378c, this.f49379d + 1, this.f49378c, (this.f49379d + 1) + i2, this.f49380e);
                Arrays.fill(this.f49378c, this.f49379d + 1, (this.f49379d + 1) + i2, null);
                this.f49379d += i2;
            }
            return i2;
        }

        /* renamed from: a */
        private void m60302a(C15929a c15929a) {
            int i = c15929a.f49367i;
            if (i > this.f49377b) {
                m60301a();
                return;
            }
            m60303b((this.f49381f + i) - this.f49377b);
            if (this.f49380e + 1 > this.f49378c.length) {
                Object obj = new C15929a[(this.f49378c.length * 2)];
                System.arraycopy(this.f49378c, 0, obj, this.f49378c.length, this.f49378c.length);
                this.f49379d = this.f49378c.length - 1;
                this.f49378c = obj;
            }
            int i2 = this.f49379d;
            this.f49379d = i2 - 1;
            this.f49378c[i2] = c15929a;
            this.f49380e++;
            this.f49381f += i;
        }

        /* renamed from: a */
        void m60307a(List<C15929a> list) throws IOException {
            if (this.f49385j) {
                if (this.f49384i < this.f49377b) {
                    m60306a(this.f49384i, 31, 32);
                }
                this.f49385j = false;
                this.f49384i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                m60306a(this.f49377b, 31, 32);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int intValue;
                int i2;
                C15929a c15929a = (C15929a) list.get(i);
                ByteString g = c15929a.f49365g.mo13430g();
                ByteString byteString = c15929a.f49366h;
                Integer num = (Integer) C15932b.f49387b.get(g);
                if (num != null) {
                    intValue = num.intValue() + 1;
                    if (intValue > 1 && intValue < 8) {
                        if (C15908c.m60168a(C15932b.f49386a[intValue - 1].f49366h, (Object) byteString)) {
                            i2 = intValue;
                        } else if (C15908c.m60168a(C15932b.f49386a[intValue].f49366h, (Object) byteString)) {
                            i2 = intValue;
                            intValue++;
                        }
                    }
                    i2 = intValue;
                    intValue = -1;
                } else {
                    intValue = -1;
                    i2 = -1;
                }
                if (intValue == -1) {
                    int length = this.f49378c.length;
                    for (int i3 = this.f49379d + 1; i3 < length; i3++) {
                        if (C15908c.m60168a(this.f49378c[i3].f49365g, (Object) g)) {
                            if (C15908c.m60168a(this.f49378c[i3].f49366h, (Object) byteString)) {
                                intValue = C15932b.f49386a.length + (i3 - this.f49379d);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i3 - this.f49379d) + C15932b.f49386a.length;
                            }
                        }
                    }
                }
                if (intValue != -1) {
                    m60306a(intValue, 127, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                } else if (i2 == -1) {
                    this.f49382g.m66958b(64);
                    m60308a(g);
                    m60308a(byteString);
                    m60302a(c15929a);
                } else if (!g.m60592a(C15929a.f49359a) || C15929a.f49364f.equals(g)) {
                    m60306a(i2, 63, 64);
                    m60308a(byteString);
                    m60302a(c15929a);
                } else {
                    m60306a(i2, 15, 0);
                    m60308a(byteString);
                }
            }
        }

        /* renamed from: a */
        void m60306a(int i, int i2, int i3) {
            if (i < i2) {
                this.f49382g.m66958b(i | i3);
                return;
            }
            this.f49382g.m66958b(i3 | i2);
            i -= i2;
            while (i >= ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                this.f49382g.m66958b(ProfileEditingConfig.DEFAULT_MAX_LENGTH | (i & 127));
                i >>>= 7;
            }
            this.f49382g.m66958b(i);
        }

        /* renamed from: a */
        void m60308a(ByteString byteString) throws IOException {
            if (!this.f49383h || C15942i.m60409a().m60412a(byteString) >= byteString.mo13431h()) {
                m60306a(byteString.mo13431h(), 127, 0);
                this.f49382g.m66952a(byteString);
                return;
            }
            Object c18549c = new C18549c();
            C15942i.m60409a().m60413a(byteString, c18549c);
            byteString = c18549c.readByteString();
            m60306a(byteString.mo13431h(), 127, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            this.f49382g.m66952a(byteString);
        }

        /* renamed from: a */
        void m60305a(int i) {
            this.f49376a = i;
            i = Math.min(i, 16384);
            if (this.f49377b != i) {
                if (i < this.f49377b) {
                    this.f49384i = Math.min(this.f49384i, i);
                }
                this.f49385j = true;
                this.f49377b = i;
                m60304b();
            }
        }

        /* renamed from: b */
        private void m60304b() {
            if (this.f49377b >= this.f49381f) {
                return;
            }
            if (this.f49377b == 0) {
                m60301a();
            } else {
                m60303b(this.f49381f - this.f49377b);
            }
        }
    }

    /* renamed from: a */
    private static Map<ByteString, Integer> m60309a() {
        Map linkedHashMap = new LinkedHashMap(f49386a.length);
        for (int i = 0; i < f49386a.length; i++) {
            if (!linkedHashMap.containsKey(f49386a[i].f49365g)) {
                linkedHashMap.put(f49386a[i].f49365g, Integer.valueOf(i));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    static ByteString m60310a(ByteString byteString) throws IOException {
        int h = byteString.mo13431h();
        int i = 0;
        while (i < h) {
            byte a = byteString.mo13418a(i);
            if (a < (byte) 65 || a > (byte) 90) {
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                stringBuilder.append(byteString.mo13419a());
                throw new IOException(stringBuilder.toString());
            }
        }
        return byteString;
    }
}
