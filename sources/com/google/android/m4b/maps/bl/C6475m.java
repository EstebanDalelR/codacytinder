package com.google.android.m4b.maps.bl;

import com.google.android.m4b.maps.bl.C4809e.C4808a;
import com.google.android.m4b.maps.bl.C4816i.C4815b;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bl.m */
public final class C6475m extends C4809e {
    /* renamed from: c */
    public final boolean mo5075c() {
        return true;
    }

    public C6475m(C4815b c4815b) {
        super(c4815b);
    }

    /* renamed from: a */
    public final C4808a mo5071a(long j, LinkedList linkedList, List list) {
        if (linkedList.size() < 3) {
            return C4808a.MAYBE;
        }
        C4812h c4812h = (C4812h) linkedList.getLast();
        float f = c4812h.m21343f();
        linkedList = linkedList.listIterator(linkedList.size());
        C4812h c4812h2 = c4812h;
        while (linkedList.hasPrevious()) {
            C4812h c4812h3 = (C4812h) linkedList.previous();
            if (c4812h3.mo5047b() != c4812h.mo5047b()) {
                break;
            } else if (Math.abs(C4809e.m21314a(f, c4812h3.m21343f())) > 0.17453292f) {
                return C4808a.NO;
            } else {
                c4812h2 = c4812h3;
            }
        }
        if (Math.abs(c4812h2.m21344g() - c4812h.m21344g()) / ((c4812h.mo5048c() + c4812h.mo5049d()) * 1056964608) < (list.isEmpty() ? 0.1f : 0.2f)) {
            return C4808a.MAYBE;
        }
        return C4808a.YES;
    }

    /* renamed from: b */
    protected final boolean mo5072b(C4816i c4816i) {
        return this.a.mo5062b(c4816i, false);
    }

    /* renamed from: d */
    protected final void mo5073d(C4816i c4816i) {
        this.a.mo5064c(c4816i, false);
    }

    /* renamed from: f */
    protected final boolean mo5074f(C4816i c4816i) {
        return this.a.mo5060a(c4816i, false);
    }
}
