package com.squareup.okhttp;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.squareup.okhttp.C6066n.C6065a;
import com.squareup.okhttp.internal.http.C6053j;
import java.util.Collections;
import java.util.List;

/* renamed from: com.squareup.okhttp.s */
public final class C6075s {
    /* renamed from: a */
    private final C6071q f22279a;
    /* renamed from: b */
    private final Protocol f22280b;
    /* renamed from: c */
    private final int f22281c;
    /* renamed from: d */
    private final String f22282d;
    /* renamed from: e */
    private final C6063m f22283e;
    /* renamed from: f */
    private final C6066n f22284f;
    /* renamed from: g */
    private final C6076t f22285g;
    /* renamed from: h */
    private C6075s f22286h;
    /* renamed from: i */
    private C6075s f22287i;
    /* renamed from: j */
    private final C6075s f22288j;
    /* renamed from: k */
    private volatile C6000c f22289k;

    /* renamed from: com.squareup.okhttp.s$a */
    public static class C6074a {
        /* renamed from: a */
        private C6071q f22269a;
        /* renamed from: b */
        private Protocol f22270b;
        /* renamed from: c */
        private int f22271c;
        /* renamed from: d */
        private String f22272d;
        /* renamed from: e */
        private C6063m f22273e;
        /* renamed from: f */
        private C6065a f22274f;
        /* renamed from: g */
        private C6076t f22275g;
        /* renamed from: h */
        private C6075s f22276h;
        /* renamed from: i */
        private C6075s f22277i;
        /* renamed from: j */
        private C6075s f22278j;

        public C6074a() {
            this.f22271c = -1;
            this.f22274f = new C6065a();
        }

        private C6074a(C6075s c6075s) {
            this.f22271c = -1;
            this.f22269a = c6075s.f22279a;
            this.f22270b = c6075s.f22280b;
            this.f22271c = c6075s.f22281c;
            this.f22272d = c6075s.f22282d;
            this.f22273e = c6075s.f22283e;
            this.f22274f = c6075s.f22284f.m26285b();
            this.f22275g = c6075s.f22285g;
            this.f22276h = c6075s.f22286h;
            this.f22277i = c6075s.f22287i;
            this.f22278j = c6075s.f22288j;
        }

        /* renamed from: a */
        public C6074a m26374a(C6071q c6071q) {
            this.f22269a = c6071q;
            return this;
        }

        /* renamed from: a */
        public C6074a m26371a(Protocol protocol) {
            this.f22270b = protocol;
            return this;
        }

        /* renamed from: a */
        public C6074a m26370a(int i) {
            this.f22271c = i;
            return this;
        }

        /* renamed from: a */
        public C6074a m26377a(String str) {
            this.f22272d = str;
            return this;
        }

        /* renamed from: a */
        public C6074a m26372a(C6063m c6063m) {
            this.f22273e = c6063m;
            return this;
        }

        /* renamed from: a */
        public C6074a m26378a(String str, String str2) {
            this.f22274f.m26280c(str, str2);
            return this;
        }

        /* renamed from: b */
        public C6074a m26381b(String str, String str2) {
            this.f22274f.m26276a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C6074a m26373a(C6066n c6066n) {
            this.f22274f = c6066n.m26285b();
            return this;
        }

        /* renamed from: a */
        public C6074a m26376a(C6076t c6076t) {
            this.f22275g = c6076t;
            return this;
        }

        /* renamed from: a */
        public C6074a m26375a(C6075s c6075s) {
            if (c6075s != null) {
                m26359a("networkResponse", c6075s);
            }
            this.f22276h = c6075s;
            return this;
        }

        /* renamed from: b */
        public C6074a m26380b(C6075s c6075s) {
            if (c6075s != null) {
                m26359a("cacheResponse", c6075s);
            }
            this.f22277i = c6075s;
            return this;
        }

        /* renamed from: a */
        private void m26359a(String str, C6075s c6075s) {
            StringBuilder stringBuilder;
            if (c6075s.f22285g != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".body != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (c6075s.f22286h != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".networkResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (c6075s.f22287i != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".cacheResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (c6075s.f22288j != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".priorResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        /* renamed from: c */
        public C6074a m26382c(C6075s c6075s) {
            if (c6075s != null) {
                m26363d(c6075s);
            }
            this.f22278j = c6075s;
            return this;
        }

        /* renamed from: d */
        private void m26363d(C6075s c6075s) {
            if (c6075s.f22285g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: a */
        public C6075s m26379a() {
            if (this.f22269a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f22270b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f22271c >= 0) {
                return new C6075s();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("code < 0: ");
                stringBuilder.append(this.f22271c);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private C6075s(C6074a c6074a) {
        this.f22279a = c6074a.f22269a;
        this.f22280b = c6074a.f22270b;
        this.f22281c = c6074a.f22271c;
        this.f22282d = c6074a.f22272d;
        this.f22283e = c6074a.f22273e;
        this.f22284f = c6074a.f22274f.m26277a();
        this.f22285g = c6074a.f22275g;
        this.f22286h = c6074a.f22276h;
        this.f22287i = c6074a.f22277i;
        this.f22288j = c6074a.f22278j;
    }

    /* renamed from: a */
    public C6071q m26393a() {
        return this.f22279a;
    }

    /* renamed from: b */
    public Protocol m26396b() {
        return this.f22280b;
    }

    /* renamed from: c */
    public int m26397c() {
        return this.f22281c;
    }

    /* renamed from: d */
    public boolean m26398d() {
        return this.f22281c >= Callback.DEFAULT_DRAG_ANIMATION_DURATION && this.f22281c < MapboxConstants.ANIMATION_DURATION;
    }

    /* renamed from: e */
    public String m26399e() {
        return this.f22282d;
    }

    /* renamed from: f */
    public C6063m m26400f() {
        return this.f22283e;
    }

    /* renamed from: a */
    public String m26394a(String str) {
        return m26395a(str, null);
    }

    /* renamed from: a */
    public String m26395a(String str, String str2) {
        str = this.f22284f.m26284a(str);
        return str != null ? str : str2;
    }

    /* renamed from: g */
    public C6066n m26401g() {
        return this.f22284f;
    }

    /* renamed from: h */
    public C6076t m26402h() {
        return this.f22285g;
    }

    /* renamed from: i */
    public C6074a m26403i() {
        return new C6074a();
    }

    /* renamed from: j */
    public C6075s m26404j() {
        return this.f22286h;
    }

    /* renamed from: k */
    public C6075s m26405k() {
        return this.f22287i;
    }

    /* renamed from: l */
    public List<C6006f> m26406l() {
        String str;
        if (this.f22281c == 401) {
            str = "WWW-Authenticate";
        } else if (this.f22281c != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return C6053j.m26215b(m26401g(), str);
    }

    /* renamed from: m */
    public C6000c m26407m() {
        C6000c c6000c = this.f22289k;
        if (c6000c != null) {
            return c6000c;
        }
        c6000c = C6000c.m25794a(this.f22284f);
        this.f22289k = c6000c;
        return c6000c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Response{protocol=");
        stringBuilder.append(this.f22280b);
        stringBuilder.append(", code=");
        stringBuilder.append(this.f22281c);
        stringBuilder.append(", message=");
        stringBuilder.append(this.f22282d);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f22279a.m26347c());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
