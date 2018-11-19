package com.google.android.m4b.maps.bw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.m4b.maps.bw.e */
public class C4976e<Key, Value> {
    /* renamed from: a */
    private final HashMap<Key, C4975c<Key, Value>> f18357a = new HashMap();
    /* renamed from: b */
    private C4975c<Key, Value> f18358b;
    /* renamed from: c */
    private C4975c<Key, Value> f18359c;
    /* renamed from: d */
    private int f18360d;

    /* renamed from: com.google.android.m4b.maps.bw.e$a */
    public static class C4973a<Key, Value> implements Iterator<C4974b<Key, Value>> {
        /* renamed from: a */
        private C4975c<Key, Value> f18350a;

        public final /* synthetic */ Object next() {
            return m22243a();
        }

        public C4973a(C4975c<Key, Value> c4975c) {
            this.f18350a = c4975c;
        }

        public final boolean hasNext() {
            return this.f18350a != null;
        }

        /* renamed from: a */
        public final C4974b<Key, Value> m22243a() {
            C4974b<Key, Value> c4974b = new C4974b(this.f18350a.f18355c, this.f18350a.f18356d);
            this.f18350a = this.f18350a.f18354b;
            return c4974b;
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bw.e$b */
    public static class C4974b<Key, Value> {
        /* renamed from: a */
        public Key f18351a;
        /* renamed from: b */
        public Value f18352b;

        public C4974b(Key key, Value value) {
            this.f18351a = key;
            this.f18352b = value;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bw.e$c */
    static class C4975c<Key, Value> {
        /* renamed from: a */
        public C4975c<Key, Value> f18353a;
        /* renamed from: b */
        public C4975c<Key, Value> f18354b;
        /* renamed from: c */
        public Key f18355c;
        /* renamed from: d */
        public Value f18356d;

        C4975c() {
        }
    }

    /* renamed from: a */
    protected void mo5147a(Key key, Value value) {
    }

    /* renamed from: b */
    protected void mo5247b(Key key, Value value) {
    }

    public C4976e(int i) {
        this.f18360d = i;
    }

    /* renamed from: a */
    public final void m22247a() {
        m22248a(0);
    }

    /* renamed from: b */
    public final int m22250b() {
        return this.f18357a.size();
    }

    /* renamed from: c */
    public final void m22255c(Key key, Value value) {
        C4975c c4975c = (C4975c) this.f18357a.get(key);
        if (c4975c == null) {
            m22248a(this.f18360d - 1);
        }
        C4975c c4975c2 = new C4975c();
        c4975c2.f18356d = value;
        c4975c2.f18355c = key;
        if (c4975c != null) {
            m22245b(c4975c);
            mo5247b(key, c4975c.f18356d);
            mo5147a(key, c4975c.f18356d);
        }
        this.f18357a.put(c4975c2.f18355c, c4975c2);
        m22244a(c4975c2);
    }

    /* renamed from: a */
    public final Value m22246a(Key key) {
        C4975c c4975c = (C4975c) this.f18357a.get(key);
        if (c4975c == null) {
            return null;
        }
        return c4975c.f18356d;
    }

    /* renamed from: b */
    public final Value m22251b(Key key) {
        C4975c c4975c = (C4975c) this.f18357a.get(key);
        if (c4975c == null) {
            return null;
        }
        m22245b(c4975c);
        m22244a(c4975c);
        return c4975c.f18356d;
    }

    /* renamed from: c */
    public final Value m22253c() {
        if (this.f18359c == null) {
            return null;
        }
        return m22254c(this.f18359c.f18355c);
    }

    /* renamed from: d */
    public final Collection<Value> m22256d() {
        Collection arrayList = new ArrayList(this.f18357a.size());
        for (C4975c c4975c = this.f18358b; c4975c != null; c4975c = c4975c.f18354b) {
            arrayList.add(c4975c.f18356d);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m22248a(int i) {
        while (this.f18357a.size() > i) {
            mo5147a(this.f18358b.f18355c, m22254c(this.f18358b.f18355c));
        }
    }

    /* renamed from: a */
    private void m22244a(C4975c<Key, Value> c4975c) {
        if (this.f18359c == null) {
            this.f18358b = c4975c;
            this.f18359c = c4975c;
            return;
        }
        C4975c c4975c2 = this.f18359c;
        c4975c.f18353a = c4975c2;
        c4975c2.f18354b = c4975c;
        this.f18359c = c4975c;
    }

    /* renamed from: b */
    private void m22245b(C4975c<Key, Value> c4975c) {
        C4975c c4975c2 = c4975c.f18353a;
        C4975c c4975c3 = c4975c.f18354b;
        if (c4975c2 != null) {
            c4975c2.f18354b = c4975c3;
        }
        if (c4975c3 != null) {
            c4975c3.f18353a = c4975c2;
        }
        c4975c.f18353a = null;
        c4975c.f18354b = null;
        if (this.f18358b == c4975c) {
            this.f18358b = c4975c3;
        }
        if (this.f18359c == c4975c) {
            this.f18359c = c4975c2;
        }
    }

    /* renamed from: e */
    public final C4973a<Key, Value> m22257e() {
        return new C4973a(this.f18358b);
    }

    /* renamed from: c */
    public final Value m22254c(Key key) {
        C4975c c4975c = (C4975c) this.f18357a.remove(key);
        if (c4975c == null) {
            return null;
        }
        m22245b(c4975c);
        mo5247b(key, c4975c.f18356d);
        return c4975c.f18356d;
    }
}
