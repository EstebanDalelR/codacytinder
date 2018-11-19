package okhttp3;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.Closeable;
import javax.annotation.Nullable;
import okhttp3.C15957l.C15956a;

/* renamed from: okhttp3.s */
public final class C15966s implements Closeable {
    /* renamed from: a */
    final C15963q f49571a;
    /* renamed from: b */
    final Protocol f49572b;
    /* renamed from: c */
    final int f49573c;
    /* renamed from: d */
    final String f49574d;
    @Nullable
    /* renamed from: e */
    final C15955k f49575e;
    /* renamed from: f */
    final C15957l f49576f;
    @Nullable
    /* renamed from: g */
    final C15968t f49577g;
    @Nullable
    /* renamed from: h */
    final C15966s f49578h;
    @Nullable
    /* renamed from: i */
    final C15966s f49579i;
    @Nullable
    /* renamed from: j */
    final C15966s f49580j;
    /* renamed from: k */
    final long f49581k;
    /* renamed from: l */
    final long f49582l;
    /* renamed from: m */
    private volatile C15887c f49583m;

    /* renamed from: okhttp3.s$a */
    public static class C15965a {
        /* renamed from: a */
        C15963q f49559a;
        /* renamed from: b */
        Protocol f49560b;
        /* renamed from: c */
        int f49561c;
        /* renamed from: d */
        String f49562d;
        @Nullable
        /* renamed from: e */
        C15955k f49563e;
        /* renamed from: f */
        C15956a f49564f;
        /* renamed from: g */
        C15968t f49565g;
        /* renamed from: h */
        C15966s f49566h;
        /* renamed from: i */
        C15966s f49567i;
        /* renamed from: j */
        C15966s f49568j;
        /* renamed from: k */
        long f49569k;
        /* renamed from: l */
        long f49570l;

        public C15965a() {
            this.f49561c = -1;
            this.f49564f = new C15956a();
        }

        C15965a(C15966s c15966s) {
            this.f49561c = -1;
            this.f49559a = c15966s.f49571a;
            this.f49560b = c15966s.f49572b;
            this.f49561c = c15966s.f49573c;
            this.f49562d = c15966s.f49574d;
            this.f49563e = c15966s.f49575e;
            this.f49564f = c15966s.f49576f.m60478b();
            this.f49565g = c15966s.f49577g;
            this.f49566h = c15966s.f49578h;
            this.f49567i = c15966s.f49579i;
            this.f49568j = c15966s.f49580j;
            this.f49569k = c15966s.f49581k;
            this.f49570l = c15966s.f49582l;
        }

        /* renamed from: a */
        public C15965a m60543a(C15963q c15963q) {
            this.f49559a = c15963q;
            return this;
        }

        /* renamed from: a */
        public C15965a m60540a(Protocol protocol) {
            this.f49560b = protocol;
            return this;
        }

        /* renamed from: a */
        public C15965a m60536a(int i) {
            this.f49561c = i;
            return this;
        }

        /* renamed from: a */
        public C15965a m60538a(String str) {
            this.f49562d = str;
            return this;
        }

        /* renamed from: a */
        public C15965a m60541a(@Nullable C15955k c15955k) {
            this.f49563e = c15955k;
            return this;
        }

        /* renamed from: a */
        public C15965a m60539a(String str, String str2) {
            this.f49564f.m60470c(str, str2);
            return this;
        }

        /* renamed from: b */
        public C15965a m60548b(String str, String str2) {
            this.f49564f.m60465a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C15965a m60542a(C15957l c15957l) {
            this.f49564f = c15957l.m60478b();
            return this;
        }

        /* renamed from: a */
        public C15965a m60545a(@Nullable C15968t c15968t) {
            this.f49565g = c15968t;
            return this;
        }

        /* renamed from: a */
        public C15965a m60544a(@Nullable C15966s c15966s) {
            if (c15966s != null) {
                m60534a("networkResponse", c15966s);
            }
            this.f49566h = c15966s;
            return this;
        }

        /* renamed from: b */
        public C15965a m60549b(@Nullable C15966s c15966s) {
            if (c15966s != null) {
                m60534a("cacheResponse", c15966s);
            }
            this.f49567i = c15966s;
            return this;
        }

        /* renamed from: a */
        private void m60534a(String str, C15966s c15966s) {
            StringBuilder stringBuilder;
            if (c15966s.f49577g != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".body != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (c15966s.f49578h != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".networkResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (c15966s.f49579i != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".cacheResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (c15966s.f49580j != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".priorResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        /* renamed from: c */
        public C15965a m60550c(@Nullable C15966s c15966s) {
            if (c15966s != null) {
                m60535d(c15966s);
            }
            this.f49568j = c15966s;
            return this;
        }

        /* renamed from: d */
        private void m60535d(C15966s c15966s) {
            if (c15966s.f49577g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: a */
        public C15965a m60537a(long j) {
            this.f49569k = j;
            return this;
        }

        /* renamed from: b */
        public C15965a m60547b(long j) {
            this.f49570l = j;
            return this;
        }

        /* renamed from: a */
        public C15966s m60546a() {
            if (this.f49559a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f49560b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f49561c < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("code < 0: ");
                stringBuilder.append(this.f49561c);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f49562d != null) {
                return new C15966s(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }

    C15966s(C15965a c15965a) {
        this.f49571a = c15965a.f49559a;
        this.f49572b = c15965a.f49560b;
        this.f49573c = c15965a.f49561c;
        this.f49574d = c15965a.f49562d;
        this.f49575e = c15965a.f49563e;
        this.f49576f = c15965a.f49564f.m60466a();
        this.f49577g = c15965a.f49565g;
        this.f49578h = c15965a.f49566h;
        this.f49579i = c15965a.f49567i;
        this.f49580j = c15965a.f49568j;
        this.f49581k = c15965a.f49569k;
        this.f49582l = c15965a.f49570l;
    }

    /* renamed from: a */
    public C15963q m60553a() {
        return this.f49571a;
    }

    /* renamed from: b */
    public Protocol m60554b() {
        return this.f49572b;
    }

    /* renamed from: c */
    public int m60555c() {
        return this.f49573c;
    }

    /* renamed from: d */
    public boolean m60556d() {
        return this.f49573c >= Callback.DEFAULT_DRAG_ANIMATION_DURATION && this.f49573c < MapboxConstants.ANIMATION_DURATION;
    }

    /* renamed from: e */
    public String m60557e() {
        return this.f49574d;
    }

    /* renamed from: f */
    public C15955k m60558f() {
        return this.f49575e;
    }

    @Nullable
    /* renamed from: a */
    public String m60551a(String str) {
        return m60552a(str, null);
    }

    @Nullable
    /* renamed from: a */
    public String m60552a(String str, @Nullable String str2) {
        str = this.f49576f.m60475a(str);
        return str != null ? str : str2;
    }

    /* renamed from: g */
    public C15957l m60559g() {
        return this.f49576f;
    }

    @Nullable
    /* renamed from: h */
    public C15968t m60560h() {
        return this.f49577g;
    }

    /* renamed from: i */
    public C15965a m60561i() {
        return new C15965a(this);
    }

    @Nullable
    /* renamed from: j */
    public C15966s m60562j() {
        return this.f49578h;
    }

    @Nullable
    /* renamed from: k */
    public C15966s m60563k() {
        return this.f49580j;
    }

    /* renamed from: l */
    public C15887c m60564l() {
        C15887c c15887c = this.f49583m;
        if (c15887c != null) {
            return c15887c;
        }
        c15887c = C15887c.m60043a(this.f49576f);
        this.f49583m = c15887c;
        return c15887c;
    }

    /* renamed from: m */
    public long m60565m() {
        return this.f49581k;
    }

    /* renamed from: n */
    public long m60566n() {
        return this.f49582l;
    }

    public void close() {
        if (this.f49577g == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        this.f49577g.close();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Response{protocol=");
        stringBuilder.append(this.f49572b);
        stringBuilder.append(", code=");
        stringBuilder.append(this.f49573c);
        stringBuilder.append(", message=");
        stringBuilder.append(this.f49574d);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f49571a.m60526a());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
