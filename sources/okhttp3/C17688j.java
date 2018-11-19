package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.internal.C15908c;
import okio.BufferedSink;
import okio.C18549c;

/* renamed from: okhttp3.j */
public final class C17688j extends C15964r {
    /* renamed from: a */
    private static final C15958m f55021a = C15958m.m60479a("application/x-www-form-urlencoded");
    /* renamed from: b */
    private final List<String> f55022b;
    /* renamed from: c */
    private final List<String> f55023c;

    /* renamed from: okhttp3.j$a */
    public static final class C15954a {
        /* renamed from: a */
        private final List<String> f49500a;
        /* renamed from: b */
        private final List<String> f49501b;
        /* renamed from: c */
        private final Charset f49502c;

        public C15954a() {
            this(null);
        }

        public C15954a(Charset charset) {
            this.f49500a = new ArrayList();
            this.f49501b = new ArrayList();
            this.f49502c = charset;
        }

        /* renamed from: a */
        public C15954a m60454a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 == null) {
                throw new NullPointerException("value == null");
            } else {
                this.f49500a.add(HttpUrl.m59990a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f49502c));
                this.f49501b.add(HttpUrl.m59990a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f49502c));
                return this;
            }
        }

        /* renamed from: b */
        public C15954a m60456b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 == null) {
                throw new NullPointerException("value == null");
            } else {
                this.f49500a.add(HttpUrl.m59990a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f49502c));
                this.f49501b.add(HttpUrl.m59990a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f49502c));
                return this;
            }
        }

        /* renamed from: a */
        public C17688j m60455a() {
            return new C17688j(this.f49500a, this.f49501b);
        }
    }

    C17688j(List<String> list, List<String> list2) {
        this.f55022b = C15908c.m60161a((List) list);
        this.f55023c = C15908c.m60161a((List) list2);
    }

    public C15958m contentType() {
        return f55021a;
    }

    public long contentLength() {
        return m64372a(null, true);
    }

    public void writeTo(BufferedSink bufferedSink) throws IOException {
        m64372a(bufferedSink, false);
    }

    /* renamed from: a */
    private long m64372a(@Nullable BufferedSink bufferedSink, boolean z) {
        if (z) {
            bufferedSink = new C18549c();
        } else {
            bufferedSink = bufferedSink.buffer();
        }
        int size = this.f55022b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                bufferedSink.m66958b(38);
            }
            bufferedSink.m66948a((String) this.f55022b.get(i));
            bufferedSink.m66958b(61);
            bufferedSink.m66948a((String) this.f55023c.get(i));
        }
        if (!z) {
            return 0;
        }
        long a = bufferedSink.m66945a();
        bufferedSink.m66964d();
        return a;
    }
}
