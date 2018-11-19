package com.squareup.okhttp.internal.framed;

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
import okio.BufferedSource;
import okio.ByteString;
import okio.C15976k;
import okio.C18549c;
import okio.Source;

/* renamed from: com.squareup.okhttp.internal.framed.d */
final class C6031d {
    /* renamed from: a */
    private static final C6028c[] f22110a = new C6028c[]{new C6028c(C6028c.f22095e, ""), new C6028c(C6028c.f22092b, "GET"), new C6028c(C6028c.f22092b, "POST"), new C6028c(C6028c.f22093c, "/"), new C6028c(C6028c.f22093c, "/index.html"), new C6028c(C6028c.f22094d, "http"), new C6028c(C6028c.f22094d, "https"), new C6028c(C6028c.f22091a, "200"), new C6028c(C6028c.f22091a, "204"), new C6028c(C6028c.f22091a, "206"), new C6028c(C6028c.f22091a, "304"), new C6028c(C6028c.f22091a, "400"), new C6028c(C6028c.f22091a, "404"), new C6028c(C6028c.f22091a, "500"), new C6028c("accept-charset", ""), new C6028c("accept-encoding", "gzip, deflate"), new C6028c("accept-language", ""), new C6028c("accept-ranges", ""), new C6028c("accept", ""), new C6028c("access-control-allow-origin", ""), new C6028c(DfpCustomTargetingValuesKt.ADS_TARGETING_AGE, ""), new C6028c("allow", ""), new C6028c("authorization", ""), new C6028c("cache-control", ""), new C6028c("content-disposition", ""), new C6028c("content-encoding", ""), new C6028c("content-language", ""), new C6028c("content-length", ""), new C6028c("content-location", ""), new C6028c("content-range", ""), new C6028c("content-type", ""), new C6028c("cookie", ""), new C6028c(ManagerWebServices.PARAM_DATE, ""), new C6028c("etag", ""), new C6028c("expect", ""), new C6028c("expires", ""), new C6028c(ManagerWebServices.PARAM_FROM, ""), new C6028c("host", ""), new C6028c("if-match", ""), new C6028c("if-modified-since", ""), new C6028c("if-none-match", ""), new C6028c("if-range", ""), new C6028c("if-unmodified-since", ""), new C6028c("last-modified", ""), new C6028c(ManagerWebServices.IG_PARAM_LINK, ""), new C6028c("location", ""), new C6028c("max-forwards", ""), new C6028c("proxy-authenticate", ""), new C6028c("proxy-authorization", ""), new C6028c("range", ""), new C6028c("referer", ""), new C6028c("refresh", ""), new C6028c("retry-after", ""), new C6028c("server", ""), new C6028c("set-cookie", ""), new C6028c("strict-transport-security", ""), new C6028c("transfer-encoding", ""), new C6028c("user-agent", ""), new C6028c("vary", ""), new C6028c("via", ""), new C6028c("www-authenticate", "")};
    /* renamed from: b */
    private static final Map<ByteString, Integer> f22111b = C6031d.m26075c();

    /* renamed from: com.squareup.okhttp.internal.framed.d$a */
    static final class C6029a {
        /* renamed from: a */
        C6028c[] f22101a = new C6028c[8];
        /* renamed from: b */
        int f22102b = (this.f22101a.length - 1);
        /* renamed from: c */
        int f22103c = 0;
        /* renamed from: d */
        int f22104d = 0;
        /* renamed from: e */
        private final List<C6028c> f22105e = new ArrayList();
        /* renamed from: f */
        private final BufferedSource f22106f;
        /* renamed from: g */
        private int f22107g;
        /* renamed from: h */
        private int f22108h;

        C6029a(int i, Source source) {
            this.f22107g = i;
            this.f22108h = i;
            this.f22106f = C15976k.a(source);
        }

        /* renamed from: a */
        void m26065a(int i) {
            this.f22107g = i;
            this.f22108h = i;
            m26054d();
        }

        /* renamed from: d */
        private void m26054d() {
            if (this.f22108h >= this.f22104d) {
                return;
            }
            if (this.f22108h == 0) {
                m26055e();
            } else {
                m26051b(this.f22104d - this.f22108h);
            }
        }

        /* renamed from: e */
        private void m26055e() {
            this.f22105e.clear();
            Arrays.fill(this.f22101a, null);
            this.f22102b = this.f22101a.length - 1;
            this.f22103c = 0;
            this.f22104d = 0;
        }

        /* renamed from: b */
        private int m26051b(int i) {
            int i2 = 0;
            if (i > 0) {
                for (int length = this.f22101a.length - 1; length >= this.f22102b && i > 0; length--) {
                    i -= this.f22101a[length].f22100j;
                    this.f22104d -= this.f22101a[length].f22100j;
                    this.f22103c--;
                    i2++;
                }
                System.arraycopy(this.f22101a, this.f22102b + 1, this.f22101a, (this.f22102b + 1) + i2, this.f22103c);
                this.f22102b += i2;
            }
            return i2;
        }

        /* renamed from: a */
        void m26064a() throws IOException {
            while (!this.f22106f.exhausted()) {
                int readByte = this.f22106f.readByte() & 255;
                if (readByte == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                    throw new IOException("index == 0");
                } else if ((readByte & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                    m26052c(m26063a(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m26060g();
                } else if ((readByte & 64) == 64) {
                    m26058f(m26063a(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    this.f22108h = m26063a(readByte, 31);
                    if (this.f22108h >= 0) {
                        if (this.f22108h <= this.f22107g) {
                            m26054d();
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid dynamic table size update ");
                    stringBuilder.append(this.f22108h);
                    throw new IOException(stringBuilder.toString());
                } else {
                    if (readByte != 16) {
                        if (readByte != 0) {
                            m26056e(m26063a(readByte, 15) - 1);
                        }
                    }
                    m26057f();
                }
            }
        }

        /* renamed from: b */
        public List<C6028c> m26066b() {
            List arrayList = new ArrayList(this.f22105e);
            this.f22105e.clear();
            return arrayList;
        }

        /* renamed from: c */
        private void m26052c(int i) throws IOException {
            if (m26062h(i)) {
                this.f22105e.add(C6031d.f22110a[i]);
                return;
            }
            int d = m26053d(i - C6031d.f22110a.length);
            if (d >= 0) {
                if (d <= this.f22101a.length - 1) {
                    this.f22105e.add(this.f22101a[d]);
                    return;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Header index too large ");
            stringBuilder.append(i + 1);
            throw new IOException(stringBuilder.toString());
        }

        /* renamed from: d */
        private int m26053d(int i) {
            return (this.f22102b + 1) + i;
        }

        /* renamed from: e */
        private void m26056e(int i) throws IOException {
            this.f22105e.add(new C6028c(m26059g(i), m26067c()));
        }

        /* renamed from: f */
        private void m26057f() throws IOException {
            this.f22105e.add(new C6028c(C6031d.m26074b(m26067c()), m26067c()));
        }

        /* renamed from: f */
        private void m26058f(int i) throws IOException {
            m26050a(-1, new C6028c(m26059g(i), m26067c()));
        }

        /* renamed from: g */
        private void m26060g() throws IOException {
            m26050a(-1, new C6028c(C6031d.m26074b(m26067c()), m26067c()));
        }

        /* renamed from: g */
        private ByteString m26059g(int i) {
            if (m26062h(i)) {
                return C6031d.f22110a[i].f22098h;
            }
            return this.f22101a[m26053d(i - C6031d.f22110a.length)].f22098h;
        }

        /* renamed from: h */
        private boolean m26062h(int i) {
            return i >= 0 && i <= C6031d.f22110a.length - 1;
        }

        /* renamed from: a */
        private void m26050a(int i, C6028c c6028c) {
            this.f22105e.add(c6028c);
            int i2 = c6028c.f22100j;
            if (i != -1) {
                i2 -= this.f22101a[m26053d(i)].f22100j;
            }
            if (i2 > this.f22108h) {
                m26055e();
                return;
            }
            int b = m26051b((this.f22104d + i2) - this.f22108h);
            if (i == -1) {
                if (this.f22103c + 1 > this.f22101a.length) {
                    i = new C6028c[(this.f22101a.length * 2)];
                    System.arraycopy(this.f22101a, 0, i, this.f22101a.length, this.f22101a.length);
                    this.f22102b = this.f22101a.length - 1;
                    this.f22101a = i;
                }
                i = this.f22102b;
                this.f22102b = i - 1;
                this.f22101a[i] = c6028c;
                this.f22103c++;
            } else {
                this.f22101a[i + (m26053d(i) + b)] = c6028c;
            }
            this.f22104d += i2;
        }

        /* renamed from: h */
        private int m26061h() throws IOException {
            return this.f22106f.readByte() & 255;
        }

        /* renamed from: a */
        int m26063a(int i, int i2) throws IOException {
            i &= i2;
            if (i < i2) {
                return i;
            }
            i = 0;
            while (true) {
                int h = m26061h();
                if ((h & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                    return i2 + (h << i);
                }
                i2 += (h & 127) << i;
                i += 7;
            }
        }

        /* renamed from: c */
        ByteString m26067c() throws IOException {
            int h = m26061h();
            Object obj = (h & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == ProfileEditingConfig.DEFAULT_MAX_LENGTH ? 1 : null;
            h = m26063a(h, 127);
            if (obj != null) {
                return ByteString.a(C6034f.m26081a().m26084a(this.f22106f.readByteArray((long) h)));
            }
            return this.f22106f.readByteString((long) h);
        }
    }

    /* renamed from: com.squareup.okhttp.internal.framed.d$b */
    static final class C6030b {
        /* renamed from: a */
        private final C18549c f22109a;

        C6030b(C18549c c18549c) {
            this.f22109a = c18549c;
        }

        /* renamed from: a */
        void m26069a(List<C6028c> list) throws IOException {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ByteString g = ((C6028c) list.get(i)).f22098h.g();
                Integer num = (Integer) C6031d.f22111b.get(g);
                if (num != null) {
                    m26068a(num.intValue() + 1, 15, 0);
                    m26070a(((C6028c) list.get(i)).f22099i);
                } else {
                    this.f22109a.b(0);
                    m26070a(g);
                    m26070a(((C6028c) list.get(i)).f22099i);
                }
            }
        }

        /* renamed from: a */
        void m26068a(int i, int i2, int i3) throws IOException {
            if (i < i2) {
                this.f22109a.b(i | i3);
                return;
            }
            this.f22109a.b(i3 | i2);
            i -= i2;
            while (i >= ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                this.f22109a.b(ProfileEditingConfig.DEFAULT_MAX_LENGTH | (i & 127));
                i >>>= 7;
            }
            this.f22109a.b(i);
        }

        /* renamed from: a */
        void m26070a(ByteString byteString) throws IOException {
            m26068a(byteString.h(), 127, 0);
            this.f22109a.a(byteString);
        }
    }

    /* renamed from: c */
    private static Map<ByteString, Integer> m26075c() {
        Map linkedHashMap = new LinkedHashMap(f22110a.length);
        for (int i = 0; i < f22110a.length; i++) {
            if (!linkedHashMap.containsKey(f22110a[i].f22098h)) {
                linkedHashMap.put(f22110a[i].f22098h, Integer.valueOf(i));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: b */
    private static ByteString m26074b(ByteString byteString) throws IOException {
        int h = byteString.h();
        int i = 0;
        while (i < h) {
            byte a = byteString.a(i);
            if (a < (byte) 65 || a > (byte) 90) {
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                stringBuilder.append(byteString.a());
                throw new IOException(stringBuilder.toString());
            }
        }
        return byteString;
    }
}
