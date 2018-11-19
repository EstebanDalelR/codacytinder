package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.C15908c;
import okhttp3.internal.connection.C15921f;
import okhttp3.internal.connection.C17659c;

/* renamed from: okhttp3.internal.http.f */
public final class C17662f implements Chain {
    /* renamed from: a */
    private final List<Interceptor> f54902a;
    /* renamed from: b */
    private final C15921f f54903b;
    /* renamed from: c */
    private final HttpCodec f54904c;
    /* renamed from: d */
    private final C17659c f54905d;
    /* renamed from: e */
    private final int f54906e;
    /* renamed from: f */
    private final C15963q f54907f;
    /* renamed from: g */
    private final Call f54908g;
    /* renamed from: h */
    private final EventListener f54909h;
    /* renamed from: i */
    private final int f54910i;
    /* renamed from: j */
    private final int f54911j;
    /* renamed from: k */
    private final int f54912k;
    /* renamed from: l */
    private int f54913l;

    public C17662f(List<Interceptor> list, C15921f c15921f, HttpCodec httpCodec, C17659c c17659c, int i, C15963q c15963q, Call call, EventListener eventListener, int i2, int i3, int i4) {
        this.f54902a = list;
        this.f54905d = c17659c;
        this.f54903b = c15921f;
        this.f54904c = httpCodec;
        this.f54906e = i;
        this.f54907f = c15963q;
        this.f54908g = call;
        this.f54909h = eventListener;
        this.f54910i = i2;
        this.f54911j = i3;
        this.f54912k = i4;
    }

    public Connection connection() {
        return this.f54905d;
    }

    public int connectTimeoutMillis() {
        return this.f54910i;
    }

    public Chain withConnectTimeout(int i, TimeUnit timeUnit) {
        return new C17662f(this.f54902a, this.f54903b, this.f54904c, this.f54905d, this.f54906e, this.f54907f, this.f54908g, this.f54909h, C15908c.m60153a("timeout", (long) i, timeUnit), this.f54911j, this.f54912k);
    }

    public int readTimeoutMillis() {
        return this.f54911j;
    }

    public Chain withReadTimeout(int i, TimeUnit timeUnit) {
        return new C17662f(this.f54902a, this.f54903b, this.f54904c, this.f54905d, this.f54906e, this.f54907f, this.f54908g, this.f54909h, this.f54910i, C15908c.m60153a("timeout", (long) i, timeUnit), this.f54912k);
    }

    public int writeTimeoutMillis() {
        return this.f54912k;
    }

    public Chain withWriteTimeout(int i, TimeUnit timeUnit) {
        return new C17662f(this.f54902a, this.f54903b, this.f54904c, this.f54905d, this.f54906e, this.f54907f, this.f54908g, this.f54909h, this.f54910i, this.f54911j, C15908c.m60153a("timeout", (long) i, timeUnit));
    }

    /* renamed from: a */
    public C15921f m64316a() {
        return this.f54903b;
    }

    /* renamed from: b */
    public HttpCodec m64318b() {
        return this.f54904c;
    }

    public Call call() {
        return this.f54908g;
    }

    /* renamed from: c */
    public EventListener m64319c() {
        return this.f54909h;
    }

    public C15963q request() {
        return this.f54907f;
    }

    public C15966s proceed(C15963q c15963q) throws IOException {
        return m64317a(c15963q, this.f54903b, this.f54904c, this.f54905d);
    }

    /* renamed from: a */
    public C15966s m64317a(C15963q c15963q, C15921f c15921f, HttpCodec httpCodec, C17659c c17659c) throws IOException {
        if (this.f54906e >= this.f54902a.size()) {
            throw new AssertionError();
        }
        r0.f54913l++;
        StringBuilder stringBuilder;
        if (r0.f54904c != null && !r0.f54905d.m64311a(c15963q.m60526a())) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("network interceptor ");
            stringBuilder.append(r0.f54902a.get(r0.f54906e - 1));
            stringBuilder.append(" must retain the same host and port");
            throw new IllegalStateException(stringBuilder.toString());
        } else if (r0.f54904c == null || r0.f54913l <= 1) {
            C17662f c17662f = new C17662f(r0.f54902a, c15921f, httpCodec, c17659c, r0.f54906e + 1, c15963q, r0.f54908g, r0.f54909h, r0.f54910i, r0.f54911j, r0.f54912k);
            Interceptor interceptor = (Interceptor) r0.f54902a.get(r0.f54906e);
            C15966s intercept = interceptor.intercept(c17662f);
            StringBuilder stringBuilder2;
            if (httpCodec != null && r0.f54906e + 1 < r0.f54902a.size() && c17662f.f54913l != 1) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("network interceptor ");
                stringBuilder2.append(interceptor);
                stringBuilder2.append(" must call proceed() exactly once");
                throw new IllegalStateException(stringBuilder2.toString());
            } else if (intercept == null) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("interceptor ");
                stringBuilder2.append(interceptor);
                stringBuilder2.append(" returned null");
                throw new NullPointerException(stringBuilder2.toString());
            } else if (intercept.m60560h() != null) {
                return intercept;
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("interceptor ");
                stringBuilder2.append(interceptor);
                stringBuilder2.append(" returned a response with no body");
                throw new IllegalStateException(stringBuilder2.toString());
            }
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("network interceptor ");
            stringBuilder.append(r0.f54902a.get(r0.f54906e - 1));
            stringBuilder.append(" must call proceed() exactly once");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
