package com.google.android.m4b.maps.ct;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.m4b.maps.ct.C5255d.C5253a;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

/* renamed from: com.google.android.m4b.maps.ct.u */
final class C6658u extends C5255d {
    /* renamed from: b */
    private static final int[] f24946b;
    private static final long serialVersionUID = 1;
    /* renamed from: c */
    private final int f24947c;
    /* renamed from: d */
    private final C5255d f24948d;
    /* renamed from: e */
    private final C5255d f24949e;
    /* renamed from: f */
    private final int f24950f;
    /* renamed from: g */
    private final int f24951g;
    /* renamed from: h */
    private int f24952h;

    /* renamed from: com.google.android.m4b.maps.ct.u$a */
    static class C5280a {
        /* renamed from: a */
        private final Stack<C5255d> f19604a;

        private C5280a() {
            this.f19604a = new Stack();
        }

        /* renamed from: a */
        private void m23434a(C5255d c5255d) {
            if (c5255d.mo5385f()) {
                int a = C5280a.m23432a(c5255d.mo5381b());
                int i = C6658u.f24946b[a + 1];
                if (!this.f19604a.isEmpty()) {
                    if (((C5255d) this.f19604a.peek()).mo5381b() < i) {
                        a = C6658u.f24946b[a];
                        C5255d c5255d2 = (C5255d) this.f19604a.pop();
                        while (!this.f19604a.isEmpty() && ((C5255d) this.f19604a.peek()).mo5381b() < a) {
                            c5255d2 = new C6658u((C5255d) this.f19604a.pop(), c5255d2);
                        }
                        C5255d c6658u = new C6658u(c5255d2, c5255d);
                        while (this.f19604a.isEmpty() == null) {
                            if (((C5255d) this.f19604a.peek()).mo5381b() >= C6658u.f24946b[C5280a.m23432a(c6658u.mo5381b()) + 1]) {
                                break;
                            }
                            c6658u = new C6658u((C5255d) this.f19604a.pop(), c6658u);
                        }
                        this.f19604a.push(c6658u);
                        return;
                    }
                }
                this.f19604a.push(c5255d);
            } else if (c5255d instanceof C6658u) {
                C6658u c6658u2 = (C6658u) c5255d;
                m23434a(c6658u2.f24948d);
                m23434a(c6658u2.f24949e);
            } else {
                c5255d = String.valueOf(c5255d.getClass());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(c5255d).length() + 49);
                stringBuilder.append("Has a new type of ByteString been created? Found ");
                stringBuilder.append(c5255d);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        /* renamed from: a */
        private static int m23432a(int i) {
            i = Arrays.binarySearch(C6658u.f24946b, i);
            return i < 0 ? (-(i + 1)) - 1 : i;
        }

        /* renamed from: a */
        static /* synthetic */ C5255d m23433a(C5280a c5280a, C5255d c5255d, C5255d c5255d2) {
            c5280a.m23434a(c5255d);
            c5280a.m23434a(c5255d2);
            c5255d = (C5255d) c5280a.f19604a.pop();
            while (c5280a.f19604a.isEmpty() == null) {
                c5255d = new C6658u((C5255d) c5280a.f19604a.pop(), c5255d);
            }
            return c5255d;
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.u$b */
    static class C5281b implements Iterator<C6654p> {
        /* renamed from: a */
        private final Stack<C6658u> f19605a;
        /* renamed from: b */
        private C6654p f19606b;

        public final /* synthetic */ Object next() {
            return m23437a();
        }

        private C5281b(C5255d c5255d) {
            this.f19605a = new Stack();
            this.f19606b = m23435a(c5255d);
        }

        /* renamed from: a */
        private C6654p m23435a(C5255d c5255d) {
            while (c5255d instanceof C6658u) {
                C6658u c6658u = (C6658u) c5255d;
                this.f19605a.push(c6658u);
                c5255d = c6658u.f24948d;
            }
            return (C6654p) c5255d;
        }

        /* renamed from: b */
        private C6654p m23436b() {
            while (!this.f19605a.isEmpty()) {
                Object obj;
                C5255d a = m23435a(((C6658u) this.f19605a.pop()).f24949e);
                if (a.mo5381b() == 0) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj == null) {
                    return a;
                }
            }
            return null;
        }

        public final boolean hasNext() {
            return this.f19606b != null;
        }

        /* renamed from: a */
        public final C6654p m23437a() {
            if (this.f19606b == null) {
                throw new NoSuchElementException();
            }
            C6654p c6654p = this.f19606b;
            this.f19606b = m23436b();
            return c6654p;
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.u$d */
    class C5282d extends InputStream {
        /* renamed from: a */
        private C5281b f19607a;
        /* renamed from: b */
        private C6654p f19608b;
        /* renamed from: c */
        private int f19609c;
        /* renamed from: d */
        private int f19610d;
        /* renamed from: e */
        private int f19611e;
        /* renamed from: f */
        private int f19612f;
        /* renamed from: g */
        private /* synthetic */ C6658u f19613g;

        public final boolean markSupported() {
            return true;
        }

        public C5282d(C6658u c6658u) {
            this.f19613g = c6658u;
            m23439a();
        }

        public final int read(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw new NullPointerException();
            }
            if (i >= 0 && i2 >= 0) {
                if (i2 <= bArr.length - i) {
                    return m23438a(bArr, i, i2);
                }
            }
            throw new IndexOutOfBoundsException();
        }

        public final long skip(long j) {
            if (j < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return (long) m23438a(null, 0, (int) j);
        }

        /* renamed from: a */
        private int m23438a(byte[] bArr, int i, int i2) {
            int i3 = i;
            i = i2;
            while (i > 0) {
                m23440b();
                if (this.f19608b == null) {
                    if (i == i2) {
                        return -1;
                    }
                    return i2 - i;
                }
                int min = Math.min(this.f19609c - this.f19610d, i);
                if (bArr != null) {
                    this.f19608b.m23271a(bArr, this.f19610d, i3, min);
                    i3 += min;
                }
                this.f19610d += min;
                i -= min;
            }
            return i2 - i;
        }

        public final int read() {
            m23440b();
            if (this.f19608b == null) {
                return -1;
            }
            C6654p c6654p = this.f19608b;
            int i = this.f19610d;
            this.f19610d = i + 1;
            return c6654p.m29689b(i) & 255;
        }

        public final int available() {
            return this.f19613g.mo5381b() - (this.f19611e + this.f19610d);
        }

        public final void mark(int i) {
            this.f19612f = this.f19611e + this.f19610d;
        }

        public final synchronized void reset() {
            m23439a();
            m23438a(null, 0, this.f19612f);
        }

        /* renamed from: a */
        private void m23439a() {
            this.f19607a = new C5281b(this.f19613g);
            this.f19608b = this.f19607a.m23437a();
            this.f19609c = this.f19608b.mo5381b();
            this.f19610d = 0;
            this.f19611e = 0;
        }

        /* renamed from: b */
        private void m23440b() {
            if (this.f19608b != null && this.f19610d == this.f19609c) {
                this.f19611e += this.f19609c;
                this.f19610d = 0;
                if (this.f19607a.hasNext()) {
                    this.f19608b = this.f19607a.m23437a();
                    this.f19609c = this.f19608b.mo5381b();
                    return;
                }
                this.f19608b = null;
                this.f19609c = 0;
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.u$c */
    class C6657c implements C5253a {
        /* renamed from: a */
        private final C5281b f24942a;
        /* renamed from: b */
        private C5253a f24943b;
        /* renamed from: c */
        private int f24944c;
        /* renamed from: d */
        private /* synthetic */ C6658u f24945d;

        private C6657c(C6658u c6658u) {
            this.f24945d = c6658u;
            this.f24942a = new C5281b(c6658u);
            this.f24943b = this.f24942a.m23437a().mo5380a();
            this.f24944c = c6658u.mo5381b();
        }

        public final boolean hasNext() {
            return this.f24944c > 0;
        }

        /* renamed from: a */
        public final byte mo5378a() {
            if (!this.f24943b.hasNext()) {
                this.f24943b = this.f24942a.m23437a().mo5380a();
            }
            this.f24944c--;
            return this.f24943b.mo5378a();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final /* synthetic */ Object next() {
            return Byte.valueOf(mo5378a());
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return mo5380a();
    }

    static {
        List arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
        f24946b = new int[arrayList.size()];
        for (i = 0; i < f24946b.length; i++) {
            f24946b[i] = ((Integer) arrayList.get(i)).intValue();
        }
    }

    private C6658u(C5255d c5255d, C5255d c5255d2) {
        this.f24952h = 0;
        this.f24948d = c5255d;
        this.f24949e = c5255d2;
        this.f24950f = c5255d.mo5381b();
        this.f24947c = this.f24950f + c5255d2.mo5381b();
        this.f24951g = Math.max(c5255d.mo5384e(), c5255d2.mo5384e()) + 1;
    }

    /* renamed from: a */
    static C5255d m29710a(C5255d c5255d, C5255d c5255d2) {
        C6658u c6658u = c5255d instanceof C6658u ? (C6658u) c5255d : null;
        if (c5255d2.mo5381b() == 0) {
            return c5255d;
        }
        if (c5255d.mo5381b() != 0) {
            int b = c5255d.mo5381b() + c5255d2.mo5381b();
            if (b < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                return C6658u.m29713b(c5255d, c5255d2);
            }
            if (c6658u != null && c6658u.f24949e.mo5381b() + c5255d2.mo5381b() < ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                c5255d2 = new C6658u(c6658u.f24948d, C6658u.m29713b(c6658u.f24949e, c5255d2));
            } else if (c6658u == null || c6658u.f24948d.mo5384e() <= c6658u.f24949e.mo5384e() || c6658u.f24951g <= c5255d2.mo5384e()) {
                if (b >= f24946b[Math.max(c5255d.mo5384e(), c5255d2.mo5384e()) + 1]) {
                    return new C6658u(c5255d, c5255d2);
                }
                return C5280a.m23433a(new C5280a(), c5255d, c5255d2);
            } else {
                c5255d2 = new C6658u(c6658u.f24948d, new C6658u(c6658u.f24949e, c5255d2));
            }
        }
        return c5255d2;
    }

    /* renamed from: b */
    private static C6654p m29713b(C5255d c5255d, C5255d c5255d2) {
        int b = c5255d.mo5381b();
        int b2 = c5255d2.mo5381b();
        byte[] bArr = new byte[(b + b2)];
        c5255d.m23271a(bArr, 0, 0, b);
        c5255d2.m23271a(bArr, 0, b, b2);
        return new C6654p(bArr);
    }

    /* renamed from: b */
    public final int mo5381b() {
        return this.f24947c;
    }

    /* renamed from: e */
    protected final int mo5384e() {
        return this.f24951g;
    }

    /* renamed from: f */
    protected final boolean mo5385f() {
        return this.f24947c >= f24946b[this.f24951g];
    }

    /* renamed from: b */
    protected final void mo5382b(byte[] bArr, int i, int i2, int i3) {
        if (i + i3 <= this.f24950f) {
            this.f24948d.mo5382b(bArr, i, i2, i3);
        } else if (i >= this.f24950f) {
            this.f24949e.mo5382b(bArr, i - this.f24950f, i2, i3);
        } else {
            int i4 = this.f24950f - i;
            this.f24948d.mo5382b(bArr, i, i2, i4);
            this.f24949e.mo5382b(bArr, 0, i2 + i4, i3 - i4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5255d)) {
            return false;
        }
        C5255d c5255d = (C5255d) obj;
        if (this.f24947c != c5255d.mo5381b()) {
            return false;
        }
        if (this.f24947c == 0) {
            return true;
        }
        if (this.f24952h != 0) {
            int g = c5255d.mo5386g();
            if (!(g == 0 || this.f24952h == g)) {
                return false;
            }
        }
        Iterator c5281b = new C5281b(this);
        C6654p c6654p = (C6654p) c5281b.next();
        Iterator c5281b2 = new C5281b(c5255d);
        C6654p c6654p2 = (C6654p) c5281b2.next();
        int i = null;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean a;
            int b = c6654p.mo5381b() - i;
            int b2 = c6654p2.mo5381b() - i2;
            int min = Math.min(b, b2);
            if (i == null) {
                a = c6654p.m29688a(c6654p2, i2, min);
            } else {
                a = c6654p2.m29688a(c6654p, i, min);
            }
            if (!a) {
                return false;
            }
            i3 += min;
            if (i3 >= this.f24947c) {
                break;
            }
            if (min == b) {
                c6654p = (C6654p) c5281b.next();
                i = null;
            } else {
                i += min;
            }
            if (min == b2) {
                c6654p2 = (C6654p) c5281b2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
        if (i3 == this.f24947c) {
            return true;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        int i = this.f24952h;
        if (i == 0) {
            i = mo5379a(this.f24947c, 0, this.f24947c);
            if (i == 0) {
                i = 1;
            }
            this.f24952h = i;
        }
        return i;
    }

    /* renamed from: g */
    protected final int mo5386g() {
        return this.f24952h;
    }

    /* renamed from: a */
    protected final int mo5379a(int i, int i2, int i3) {
        if (i2 + i3 <= this.f24950f) {
            return this.f24948d.mo5379a(i, i2, i3);
        }
        if (i2 >= this.f24950f) {
            return this.f24949e.mo5379a(i, i2 - this.f24950f, i3);
        }
        int i4 = this.f24950f - i2;
        return this.f24949e.mo5379a(this.f24948d.mo5379a(i, i2, i4), 0, i3 - i4);
    }

    /* renamed from: d */
    public final C5257e mo5383d() {
        return C5257e.m23280a(new C5282d(this));
    }

    final Object writeReplace() {
        return new C6654p(m23274c());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* renamed from: a */
    public final C5253a mo5380a() {
        return new C6657c();
    }
}
