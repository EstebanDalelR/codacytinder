package android.databinding;

import java.util.ArrayList;
import java.util.List;

/* renamed from: android.databinding.c */
public class C0117c<C, T, A> implements Cloneable {
    /* renamed from: a */
    private List<C> f264a = new ArrayList();
    /* renamed from: b */
    private long f265b = 0;
    /* renamed from: c */
    private long[] f266c;
    /* renamed from: d */
    private int f267d;
    /* renamed from: e */
    private final C0116a<C, T, A> f268e;

    /* renamed from: android.databinding.c$a */
    public static abstract class C0116a<C, T, A> {
        /* renamed from: a */
        public abstract void mo133a(C c, T t, int i, A a);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m350a();
    }

    public C0117c(C0116a<C, T, A> c0116a) {
        this.f268e = c0116a;
    }

    /* renamed from: a */
    public synchronized void m352a(T t, int i, A a) {
        this.f267d++;
        m349c(t, i, a);
        this.f267d--;
        if (this.f267d == null) {
            if (this.f266c != null) {
                for (t = this.f266c.length - 1; t >= null; t--) {
                    long j = this.f266c[t];
                    if (j != 0) {
                        m343a((t + 1) * 64, j);
                        this.f266c[t] = 0;
                    }
                }
            }
            if (this.f265b != 0) {
                m343a(null, this.f265b);
                this.f265b = 0;
            }
        }
    }

    /* renamed from: b */
    private void m348b(T t, int i, A a) {
        m345a(t, i, a, 0, Math.min(64, this.f264a.size()), this.f265b);
    }

    /* renamed from: c */
    private void m349c(T t, int i, A a) {
        int size = this.f264a.size();
        int length = this.f266c == null ? -1 : this.f266c.length - 1;
        m344a(t, i, a, length);
        m345a(t, i, a, (length + 2) * 64, size, 0);
    }

    /* renamed from: a */
    private void m344a(T t, int i, A a, int i2) {
        if (i2 < 0) {
            m348b(t, i, a);
            return;
        }
        long j = this.f266c[i2];
        int i3 = (i2 + 1) * 64;
        int min = Math.min(this.f264a.size(), i3 + 64);
        m344a(t, i, a, i2 - 1);
        m345a(t, i, a, i3, min, j);
    }

    /* renamed from: a */
    private void m345a(T t, int i, A a, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.f268e.mo133a(this.f264a.get(i2), t, i, a);
            }
            j2 <<= 1;
            i2++;
        }
    }

    /* renamed from: a */
    public synchronized void m351a(C c) {
        if (c == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        int lastIndexOf = this.f264a.lastIndexOf(c);
        if (lastIndexOf < 0 || m346a(lastIndexOf)) {
            this.f264a.add(c);
        }
    }

    /* renamed from: a */
    private boolean m346a(int i) {
        boolean z = true;
        if (i < 64) {
            if ((this.f265b & (1 << i)) == 0) {
                z = false;
            }
            return z;
        } else if (this.f266c == null) {
            return false;
        } else {
            int i2 = (i / 64) - 1;
            if (i2 >= this.f266c.length) {
                return false;
            }
            if ((this.f266c[i2] & (1 << (i % 64))) == 0) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: a */
    private void m343a(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = (i + 64) - 1; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.f264a.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    /* renamed from: b */
    public synchronized void m353b(C c) {
        if (this.f267d == 0) {
            this.f264a.remove(c);
        } else {
            int lastIndexOf = this.f264a.lastIndexOf(c);
            if (lastIndexOf >= null) {
                m347b(lastIndexOf);
            }
        }
    }

    /* renamed from: b */
    private void m347b(int i) {
        if (i < 64) {
            this.f265b |= 1 << i;
            return;
        }
        int i2 = (i / 64) - 1;
        if (this.f266c == null) {
            this.f266c = new long[(this.f264a.size() / 64)];
        } else if (this.f266c.length <= i2) {
            Object obj = new long[(this.f264a.size() / 64)];
            System.arraycopy(this.f266c, 0, obj, 0, this.f266c.length);
            this.f266c = obj;
        }
        long j = 1 << (i % 64);
        i = this.f266c;
        i[i2] = i[i2] | j;
    }

    /* renamed from: a */
    public synchronized C0117c<C, T, A> m350a() {
        C0117c<C, T, A> c0117c;
        CloneNotSupportedException e;
        try {
            c0117c = (C0117c) super.clone();
            try {
                c0117c.f265b = 0;
                c0117c.f266c = null;
                int i = 0;
                c0117c.f267d = 0;
                c0117c.f264a = new ArrayList();
                int size = this.f264a.size();
                while (i < size) {
                    if (!m346a(i)) {
                        c0117c.f264a.add(this.f264a.get(i));
                    }
                    i++;
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
                return c0117c;
            }
        } catch (CloneNotSupportedException e3) {
            CloneNotSupportedException cloneNotSupportedException = e3;
            c0117c = null;
            e = cloneNotSupportedException;
            e.printStackTrace();
            return c0117c;
        }
        return c0117c;
    }
}
