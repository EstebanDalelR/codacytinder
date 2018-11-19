package android.support.design.widget;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* renamed from: android.support.design.widget.k */
class C0243k {
    /* renamed from: a */
    private static C0243k f882a;
    /* renamed from: b */
    private final Object f883b = new Object();
    /* renamed from: c */
    private final Handler f884c = new Handler(Looper.getMainLooper(), new C02401(this));
    /* renamed from: d */
    private C0242b f885d;
    /* renamed from: e */
    private C0242b f886e;

    /* renamed from: android.support.design.widget.k$1 */
    class C02401 implements Callback {
        /* renamed from: a */
        final /* synthetic */ C0243k f878a;

        C02401(C0243k c0243k) {
            this.f878a = c0243k;
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return null;
            }
            this.f878a.m907a((C0242b) message.obj);
            return true;
        }
    }

    /* renamed from: android.support.design.widget.k$a */
    interface C0241a {
        /* renamed from: a */
        void mo217a();

        /* renamed from: a */
        void mo218a(int i);
    }

    /* renamed from: android.support.design.widget.k$b */
    private static class C0242b {
        /* renamed from: a */
        final WeakReference<C0241a> f879a;
        /* renamed from: b */
        int f880b;
        /* renamed from: c */
        boolean f881c;

        C0242b(int i, C0241a c0241a) {
            this.f879a = new WeakReference(c0241a);
            this.f880b = i;
        }

        /* renamed from: a */
        boolean m897a(C0241a c0241a) {
            return (c0241a == null || this.f879a.get() != c0241a) ? null : true;
        }
    }

    /* renamed from: a */
    static C0243k m898a() {
        if (f882a == null) {
            f882a = new C0243k();
        }
        return f882a;
    }

    private C0243k() {
    }

    /* renamed from: a */
    public void m904a(int i, C0241a c0241a) {
        synchronized (this.f883b) {
            if (m902f(c0241a)) {
                this.f885d.f880b = i;
                this.f884c.removeCallbacksAndMessages(this.f885d);
                m901b(this.f885d);
                return;
            }
            if (m903g(c0241a)) {
                this.f886e.f880b = i;
            } else {
                this.f886e = new C0242b(i, c0241a);
            }
            if (this.f885d == 0 || m899a(this.f885d, 4) == 0) {
                this.f885d = 0;
                m900b();
                return;
            }
        }
    }

    /* renamed from: a */
    public void m906a(C0241a c0241a, int i) {
        synchronized (this.f883b) {
            if (m902f(c0241a)) {
                m899a(this.f885d, i);
            } else if (m903g(c0241a) != null) {
                m899a(this.f886e, i);
            }
        }
    }

    /* renamed from: a */
    public void m905a(C0241a c0241a) {
        synchronized (this.f883b) {
            if (m902f(c0241a) != null) {
                this.f885d = null;
                if (this.f886e != null) {
                    m900b();
                }
            }
        }
    }

    /* renamed from: b */
    public void m908b(C0241a c0241a) {
        synchronized (this.f883b) {
            if (m902f(c0241a) != null) {
                m901b(this.f885d);
            }
        }
    }

    /* renamed from: c */
    public void m909c(C0241a c0241a) {
        synchronized (this.f883b) {
            if (m902f(c0241a) != null && this.f885d.f881c == null) {
                this.f885d.f881c = true;
                this.f884c.removeCallbacksAndMessages(this.f885d);
            }
        }
    }

    /* renamed from: d */
    public void m910d(C0241a c0241a) {
        synchronized (this.f883b) {
            if (!(m902f(c0241a) == null || this.f885d.f881c == null)) {
                this.f885d.f881c = false;
                m901b(this.f885d);
            }
        }
    }

    /* renamed from: e */
    public boolean m911e(C0241a c0241a) {
        synchronized (this.f883b) {
            if (!m902f(c0241a)) {
                if (m903g(c0241a) == null) {
                    c0241a = null;
                }
            }
            c0241a = true;
        }
        return c0241a;
    }

    /* renamed from: b */
    private void m900b() {
        if (this.f886e != null) {
            this.f885d = this.f886e;
            this.f886e = null;
            C0241a c0241a = (C0241a) this.f885d.f879a.get();
            if (c0241a != null) {
                c0241a.mo217a();
            } else {
                this.f885d = null;
            }
        }
    }

    /* renamed from: a */
    private boolean m899a(C0242b c0242b, int i) {
        C0241a c0241a = (C0241a) c0242b.f879a.get();
        if (c0241a == null) {
            return null;
        }
        this.f884c.removeCallbacksAndMessages(c0242b);
        c0241a.mo218a(i);
        return true;
    }

    /* renamed from: f */
    private boolean m902f(C0241a c0241a) {
        return (this.f885d == null || this.f885d.m897a(c0241a) == null) ? null : true;
    }

    /* renamed from: g */
    private boolean m903g(C0241a c0241a) {
        return (this.f886e == null || this.f886e.m897a(c0241a) == null) ? null : true;
    }

    /* renamed from: b */
    private void m901b(C0242b c0242b) {
        if (c0242b.f880b != -2) {
            int i = 2750;
            if (c0242b.f880b > 0) {
                i = c0242b.f880b;
            } else if (c0242b.f880b == -1) {
                i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            }
            this.f884c.removeCallbacksAndMessages(c0242b);
            this.f884c.sendMessageDelayed(Message.obtain(this.f884c, 0, c0242b), (long) i);
        }
    }

    /* renamed from: a */
    void m907a(C0242b c0242b) {
        synchronized (this.f883b) {
            if (this.f885d == c0242b || this.f886e == c0242b) {
                m899a(c0242b, 2);
            }
        }
    }
}
