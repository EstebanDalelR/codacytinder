package retrofit.client;

import com.squareup.okhttp.C6066n;
import com.squareup.okhttp.C6067o;
import com.squareup.okhttp.C6068p;
import com.squareup.okhttp.C6071q;
import com.squareup.okhttp.C6071q.C6070a;
import com.squareup.okhttp.C6072r;
import com.squareup.okhttp.C6075s;
import com.squareup.okhttp.C6076t;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okio.BufferedSink;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

/* renamed from: retrofit.client.c */
public class C19528c implements Client {
    /* renamed from: a */
    private final C6068p f61034a;

    /* renamed from: a */
    private static C6068p m70498a() {
        C6068p c6068p = new C6068p();
        c6068p.a(15000, TimeUnit.MILLISECONDS);
        c6068p.b(DefaultFastMatchValues.NEW_COUNT_FETCH_INTERVAL, TimeUnit.MILLISECONDS);
        return c6068p;
    }

    public C19528c() {
        this(C19528c.m70498a());
    }

    public C19528c(C6068p c6068p) {
        if (c6068p == null) {
            throw new NullPointerException("client == null");
        }
        this.f61034a = c6068p;
    }

    public C19370e execute(C19369d c19369d) throws IOException {
        return C19528c.m70502a(this.f61034a.a(C19528c.m70499a(c19369d)).a());
    }

    /* renamed from: a */
    static C6071q m70499a(C19369d c19369d) {
        C6070a a = new C6070a().a(c19369d.m69547b()).a(c19369d.m69546a(), C19528c.m70500a(c19369d.m69549d()));
        c19369d = c19369d.m69548c();
        int size = c19369d.size();
        for (int i = 0; i < size; i++) {
            C19368b c19368b = (C19368b) c19369d.get(i);
            String b = c19368b.m69545b();
            if (b == null) {
                b = "";
            }
            a.b(c19368b.m69544a(), b);
        }
        return a.a();
    }

    /* renamed from: a */
    static C19370e m70502a(C6075s c6075s) {
        return new C19370e(c6075s.a().c(), c6075s.c(), c6075s.e(), C19528c.m70501a(c6075s.g()), C19528c.m70503a(c6075s.h()));
    }

    /* renamed from: a */
    private static C6072r m70500a(final TypedOutput typedOutput) {
        if (typedOutput == null) {
            return null;
        }
        final C6067o a = C6067o.a(typedOutput.mimeType());
        return new C6072r() {
            /* renamed from: a */
            public C6067o m70495a() {
                return a;
            }

            /* renamed from: a */
            public void m70496a(BufferedSink bufferedSink) throws IOException {
                typedOutput.writeTo(bufferedSink.outputStream());
            }

            /* renamed from: b */
            public long m70497b() {
                return typedOutput.length();
            }
        };
    }

    /* renamed from: a */
    private static TypedInput m70503a(final C6076t c6076t) {
        if (c6076t.b() == 0) {
            return null;
        }
        return new TypedInput() {
            public String mimeType() {
                C6067o a = c6076t.a();
                if (a == null) {
                    return null;
                }
                return a.toString();
            }

            public long length() {
                return c6076t.b();
            }

            public InputStream in() throws IOException {
                return c6076t.d();
            }
        };
    }

    /* renamed from: a */
    private static List<C19368b> m70501a(C6066n c6066n) {
        int a = c6066n.a();
        List<C19368b> arrayList = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            arrayList.add(new C19368b(c6066n.a(i), c6066n.b(i)));
        }
        return arrayList;
    }
}
