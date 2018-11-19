package com.google.android.m4b.maps.bl;

import com.google.android.m4b.maps.bl.C4809e.C4808a;
import com.google.android.m4b.maps.bl.C4816i.C4815b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bl.k */
public final class C6474k extends C4809e {
    public C6474k(C4815b c4815b) {
        super(c4815b);
    }

    /* renamed from: a */
    public final C4808a mo5071a(long j, LinkedList linkedList, List list) {
        for (C4809e c : list) {
            if (c.mo5075c()) {
                return C4808a.NO;
            }
        }
        if (linkedList.size() < 3) {
            return C4808a.MAYBE;
        }
        j = null;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C4812h c4812h = (C4812h) it.next();
            if (c4812h.mo5047b() > 1) {
                j = c4812h;
                break;
            }
        }
        C4812h c4812h2 = (C4812h) linkedList.getLast();
        if (j == null) {
            return C4808a.NO;
        }
        if (c4812h2.mo5047b() <= 1) {
            return C4808a.NO;
        }
        linkedList = list.isEmpty() != null ? 1035122882 : 1043511490;
        list = Math.abs(C4809e.m21314a(j.m21343f(), c4812h2.m21343f()));
        if (list < linkedList) {
            return C4808a.NO;
        }
        linkedList = (c4812h2.mo5048c() + c4812h2.mo5049d()) * 1056964608;
        float g = c4812h2.m21344g() / linkedList;
        if (g < 0.75f) {
            return C4808a.NO;
        }
        j = Math.abs(g - (j.m21344g() / linkedList));
        if (j != 0.0f) {
            list /= j;
            if (list < 1056964608) {
                return C4808a.NO;
            }
            if (list < 1063675494) {
                return C4808a.MAYBE;
            }
        }
        return C4808a.YES;
    }

    /* renamed from: b */
    protected final boolean mo5072b(C4816i c4816i) {
        return this.a.mo5066e(c4816i);
    }

    /* renamed from: d */
    protected final void mo5073d(C4816i c4816i) {
        this.a.mo5067f(c4816i);
    }

    /* renamed from: f */
    protected final boolean mo5074f(C4816i c4816i) {
        return this.a.mo5065d(c4816i);
    }
}
