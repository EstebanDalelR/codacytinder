package okhttp3;

import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import okhttp3.internal.C15908c;
import okio.BufferedSink;
import okio.ByteString;
import okio.C18549c;

/* renamed from: okhttp3.n */
public final class C17690n extends C15964r {
    /* renamed from: a */
    public static final C15958m f55027a = C15958m.m60479a("multipart/mixed");
    /* renamed from: b */
    public static final C15958m f55028b = C15958m.m60479a("multipart/alternative");
    /* renamed from: c */
    public static final C15958m f55029c = C15958m.m60479a("multipart/digest");
    /* renamed from: d */
    public static final C15958m f55030d = C15958m.m60479a("multipart/parallel");
    /* renamed from: e */
    public static final C15958m f55031e = C15958m.m60479a("multipart/form-data");
    /* renamed from: f */
    private static final byte[] f55032f = new byte[]{(byte) 58, (byte) 32};
    /* renamed from: g */
    private static final byte[] f55033g = new byte[]{(byte) 13, (byte) 10};
    /* renamed from: h */
    private static final byte[] f55034h = new byte[]{(byte) 45, (byte) 45};
    /* renamed from: i */
    private final ByteString f55035i;
    /* renamed from: j */
    private final C15958m f55036j;
    /* renamed from: k */
    private final C15958m f55037k;
    /* renamed from: l */
    private final List<C15960b> f55038l;
    /* renamed from: m */
    private long f55039m = -1;

    /* renamed from: okhttp3.n$a */
    public static final class C15959a {
        /* renamed from: a */
        private final ByteString f49516a;
        /* renamed from: b */
        private C15958m f49517b;
        /* renamed from: c */
        private final List<C15960b> f49518c;

        public C15959a() {
            this(UUID.randomUUID().toString());
        }

        public C15959a(String str) {
            this.f49517b = C17690n.f55027a;
            this.f49518c = new ArrayList();
            this.f49516a = ByteString.m60580a(str);
        }

        /* renamed from: a */
        public C15959a m60485a(C15958m c15958m) {
            if (c15958m == null) {
                throw new NullPointerException("type == null");
            } else if (c15958m.m60480a().equals("multipart")) {
                this.f49517b = c15958m;
                return this;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("multipart != ");
                stringBuilder.append(c15958m);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        /* renamed from: a */
        public C15959a m60484a(@Nullable C15957l c15957l, C15964r c15964r) {
            return m60486a(C15960b.m60489a(c15957l, c15964r));
        }

        /* renamed from: a */
        public C15959a m60483a(String str, @Nullable String str2, C15964r c15964r) {
            return m60486a(C15960b.m60488a(str, str2, c15964r));
        }

        /* renamed from: a */
        public C15959a m60486a(C15960b c15960b) {
            if (c15960b == null) {
                throw new NullPointerException("part == null");
            }
            this.f49518c.add(c15960b);
            return this;
        }

        /* renamed from: a */
        public C17690n m60487a() {
            if (!this.f49518c.isEmpty()) {
                return new C17690n(this.f49516a, this.f49517b, this.f49518c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
    }

    /* renamed from: okhttp3.n$b */
    public static final class C15960b {
        @Nullable
        /* renamed from: a */
        final C15957l f49519a;
        /* renamed from: b */
        final C15964r f49520b;

        /* renamed from: a */
        public static C15960b m60489a(@Nullable C15957l c15957l, C15964r c15964r) {
            if (c15964r == null) {
                throw new NullPointerException("body == null");
            } else if (c15957l != null && c15957l.m60475a(ManagerWebServices.PARAM_CONTENT_TYPE) != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (c15957l == null || c15957l.m60475a("Content-Length") == null) {
                return new C15960b(c15957l, c15964r);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        /* renamed from: a */
        public static C15960b m60488a(String str, @Nullable String str2, C15964r c15964r) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder stringBuilder = new StringBuilder("form-data; name=");
            C17690n.m64376a(stringBuilder, str);
            if (str2 != null) {
                stringBuilder.append("; filename=");
                C17690n.m64376a(stringBuilder, str2);
            }
            return C15960b.m60489a(C15957l.m60472a("Content-Disposition", stringBuilder.toString()), c15964r);
        }

        private C15960b(@Nullable C15957l c15957l, C15964r c15964r) {
            this.f49519a = c15957l;
            this.f49520b = c15964r;
        }
    }

    C17690n(ByteString byteString, C15958m c15958m, List<C15960b> list) {
        this.f55035i = byteString;
        this.f55036j = c15958m;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c15958m);
        stringBuilder.append("; boundary=");
        stringBuilder.append(byteString.mo13419a());
        this.f55037k = C15958m.m60479a(stringBuilder.toString());
        this.f55038l = C15908c.m60161a((List) list);
    }

    public C15958m contentType() {
        return this.f55037k;
    }

    public long contentLength() throws IOException {
        long j = this.f55039m;
        if (j != -1) {
            return j;
        }
        j = m64375a(null, true);
        this.f55039m = j;
        return j;
    }

    public void writeTo(BufferedSink bufferedSink) throws IOException {
        m64375a(bufferedSink, false);
    }

    /* renamed from: a */
    private long m64375a(@Nullable BufferedSink bufferedSink, boolean z) throws IOException {
        C18549c c18549c;
        long a;
        if (z) {
            bufferedSink = new C18549c();
            c18549c = bufferedSink;
        } else {
            c18549c = null;
        }
        int size = this.f55038l.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C15960b c15960b = (C15960b) this.f55038l.get(i);
            C15957l c15957l = c15960b.f49519a;
            C15964r c15964r = c15960b.f49520b;
            bufferedSink.write(f55034h);
            bufferedSink.write(this.f55035i);
            bufferedSink.write(f55033g);
            if (c15957l != null) {
                int a2 = c15957l.m60473a();
                for (int i2 = 0; i2 < a2; i2++) {
                    bufferedSink.writeUtf8(c15957l.m60474a(i2)).write(f55032f).writeUtf8(c15957l.m60476b(i2)).write(f55033g);
                }
            }
            C15958m contentType = c15964r.contentType();
            if (contentType != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(contentType.toString()).write(f55033g);
            }
            long contentLength = c15964r.contentLength();
            if (contentLength != -1) {
                bufferedSink.writeUtf8("Content-Length: ").writeDecimalLong(contentLength).write(f55033g);
            } else if (z) {
                c18549c.m66964d();
                return -1;
            }
            bufferedSink.write(f55033g);
            if (z) {
                j += contentLength;
            } else {
                c15964r.writeTo(bufferedSink);
            }
            bufferedSink.write(f55033g);
        }
        bufferedSink.write(f55034h);
        bufferedSink.write(this.f55035i);
        bufferedSink.write(f55034h);
        bufferedSink.write(f55033g);
        if (z) {
            a = j + c18549c.m66945a();
            c18549c.m66964d();
        } else {
            a = j;
        }
        return a;
    }

    /* renamed from: a */
    static StringBuilder m64376a(StringBuilder stringBuilder, String str) {
        stringBuilder.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                stringBuilder.append("%0A");
            } else if (charAt == '\r') {
                stringBuilder.append("%0D");
            } else if (charAt != '\"') {
                stringBuilder.append(charAt);
            } else {
                stringBuilder.append("%22");
            }
        }
        stringBuilder.append('\"');
        return stringBuilder;
    }
}
