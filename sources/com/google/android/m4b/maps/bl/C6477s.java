package com.google.android.m4b.maps.bl;

import com.google.android.m4b.maps.bl.C4809e.C4808a;
import com.google.android.m4b.maps.bl.C4816i.C4815b;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bl.s */
public final class C6477s extends C4809e {
    /* renamed from: b */
    public final boolean mo5076b() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo5075c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo5077d() {
        return true;
    }

    public C6477s(C4815b c4815b) {
        super(c4815b);
    }

    /* renamed from: a */
    public final C4808a mo5071a(long j, LinkedList linkedList, List list) {
        C4812h c4812h;
        list = linkedList.iterator();
        while (list.hasNext()) {
            c4812h = (C4812h) list.next();
            if (c4812h.mo5047b() == 2) {
                break;
            }
        }
        c4812h = null;
        linkedList = linkedList.listIterator(linkedList.size());
        while (linkedList.hasPrevious() != null) {
            list = (C4812h) linkedList.previous();
            if (list.mo5047b() == 2) {
                break;
            }
        }
        list = null;
        if (c4812h != null) {
            if (list != null) {
                if (list.mo5045a() - j > 300) {
                    return C4808a.NO;
                }
                if (Math.max(Math.max(Math.abs(list.mo5044a(0) - c4812h.mo5044a(0)) / list.mo5048c(), Math.abs(list.mo5046b(0) - c4812h.mo5046b(0)) / list.mo5049d()), Math.max(Math.abs(list.mo5044a(1) - c4812h.mo5044a(1)) / list.mo5048c(), Math.abs(list.mo5046b(1) - c4812h.mo5046b(1)) / list.mo5049d())) > 0.125f) {
                    return C4808a.NO;
                }
                return C4808a.YES;
            }
        }
        return C4808a.NO;
    }

    /* renamed from: b */
    protected final boolean mo5072b(C4816i c4816i) {
        return this.a.mo5062b(c4816i, true);
    }

    /* renamed from: d */
    protected final void mo5073d(C4816i c4816i) {
        this.a.mo5064c(c4816i, true);
    }

    /* renamed from: f */
    protected final boolean mo5074f(C4816i c4816i) {
        return this.a.mo5060a(c4816i, true);
    }
}
