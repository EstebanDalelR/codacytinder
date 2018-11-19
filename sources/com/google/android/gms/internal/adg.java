package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map.Entry;

final class adg implements Iterator<Entry<K, V>> {
    /* renamed from: a */
    private int f15039a;
    /* renamed from: b */
    private boolean f15040b;
    /* renamed from: c */
    private Iterator<Entry<K, V>> f15041c;
    /* renamed from: d */
    private /* synthetic */ ada f15042d;

    private adg(ada ada) {
        this.f15042d = ada;
        this.f15039a = -1;
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m18913a() {
        if (this.f15041c == null) {
            this.f15041c = this.f15042d.f15030c.entrySet().iterator();
        }
        return this.f15041c;
    }

    public final boolean hasNext() {
        return this.f15039a + 1 >= this.f15042d.f15029b.size() ? !this.f15042d.f15030c.isEmpty() && m18913a().hasNext() : true;
    }

    public final /* synthetic */ Object next() {
        this.f15040b = true;
        int i = this.f15039a + 1;
        this.f15039a = i;
        return (Entry) (i < this.f15042d.f15029b.size() ? this.f15042d.f15029b.get(this.f15039a) : m18913a().next());
    }

    public final void remove() {
        if (this.f15040b) {
            this.f15040b = false;
            this.f15042d.m18902e();
            if (this.f15039a < this.f15042d.f15029b.size()) {
                ada ada = this.f15042d;
                int i = this.f15039a;
                this.f15039a = i - 1;
                ada.m18900c(i);
                return;
            }
            m18913a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
