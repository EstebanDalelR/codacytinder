package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.ce.C5096d;
import java.util.ArrayList;
import java.util.Iterator;

public final class ae implements Iterator<C5096d> {
    /* renamed from: a */
    private ArrayList<Iterator<C5096d>> f18391a = new ArrayList();
    /* renamed from: b */
    private C5096d[] f18392b;
    /* renamed from: c */
    private int f18393c = 0;

    public final /* synthetic */ Object next() {
        return m22286a();
    }

    /* renamed from: a */
    public final void m22287a(Iterator<C5096d> it) {
        if (this.f18392b != null) {
            throw new IllegalStateException("Cannot call addIterator after next has been called");
        } else if (it.hasNext()) {
            this.f18391a.add(it);
        }
    }

    public final boolean hasNext() {
        return this.f18393c < this.f18391a.size();
    }

    /* renamed from: a */
    public final C5096d m22286a() {
        if (this.f18392b == null) {
            m22285c();
        }
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (i < this.f18392b.length) {
            if (this.f18392b[i] != null && this.f18392b[i].m22749b() > r2) {
                i3 = this.f18392b[i].m22749b();
                i2 = i;
            }
            i++;
        }
        C5096d c5096d = this.f18392b[i2];
        Iterator it = (Iterator) this.f18391a.get(i2);
        if (it != null) {
            this.f18392b[i2] = (C5096d) it.next();
            if (!it.hasNext()) {
                this.f18391a.set(i2, null);
            }
        } else {
            this.f18392b[i2] = null;
            this.f18393c++;
        }
        return c5096d;
    }

    /* renamed from: b */
    public final C5096d m22288b() {
        if (this.f18392b == null) {
            m22285c();
        }
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (i < this.f18392b.length) {
            if (this.f18392b[i] != null && this.f18392b[i].m22749b() > r2) {
                i3 = this.f18392b[i].m22749b();
                i2 = i;
            }
            i++;
        }
        return this.f18392b[i2];
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    private void m22285c() {
        this.f18392b = new C5096d[this.f18391a.size()];
        for (int i = 0; i < this.f18391a.size(); i++) {
            Iterator it = (Iterator) this.f18391a.get(i);
            this.f18392b[i] = (C5096d) it.next();
            if (!it.hasNext()) {
                this.f18391a.set(i, null);
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[RankMergingFeatureIterator");
        for (int i = 0; i < this.f18391a.size(); i++) {
            stringBuilder.append('|');
            stringBuilder.append(this.f18391a.get(i));
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
