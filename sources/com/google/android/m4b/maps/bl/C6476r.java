package com.google.android.m4b.maps.bl;

import com.google.android.m4b.maps.bl.C4809e.C4808a;
import com.google.android.m4b.maps.bl.C4816i.C4815b;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.m4b.maps.bl.r */
public abstract class C6476r extends C4809e {
    /* renamed from: b */
    protected float f23999b = 0.125f;
    /* renamed from: c */
    protected float f24000c = 1.0f;
    /* renamed from: d */
    private float f24001d = 0.7853982f;
    /* renamed from: e */
    private float f24002e = 0.25f;

    /* renamed from: a */
    protected abstract float mo7064a(float f);

    /* renamed from: a */
    protected abstract float mo7065a(C4812h c4812h, int i);

    /* renamed from: b */
    protected abstract float mo7066b(C4812h c4812h, int i);

    /* renamed from: b */
    public final boolean mo5076b() {
        return true;
    }

    public C6476r(C4815b c4815b) {
        super(c4815b);
    }

    /* renamed from: a */
    public final C4808a mo5071a(long j, LinkedList linkedList, List list) {
        if (linkedList.size() < 3) {
            return C4808a.MAYBE;
        }
        C4812h c4812h = (C4812h) linkedList.getLast();
        if (c4812h.mo5047b() != 2) {
            return C4808a.NO;
        }
        ListIterator listIterator = linkedList.listIterator(linkedList.size());
        C4812h c4812h2 = c4812h;
        C4812h c4812h3 = null;
        linkedList = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (listIterator.hasPrevious()) {
            C4812h c4812h4 = (C4812h) listIterator.previous();
            if (c4812h4.mo5047b() != c4812h.mo5047b()) {
                break;
            } else if (mo7064a(c4812h4.m21343f()) >= this.f24001d) {
                return C4808a.NO;
            } else {
                if (c4812h4.m21344g() / c4812h4.mo5048c() < this.f24002e) {
                    return C4808a.NO;
                }
                if (c4812h3 != null) {
                    linkedList += Math.abs(mo7065a(c4812h4, 0) - mo7065a(c4812h3, 0));
                    f2 += Math.abs(mo7066b(c4812h4, 0) - mo7066b(c4812h3, 0));
                    f += Math.abs(mo7065a(c4812h4, c4812h4.mo5047b() - 1) - mo7065a(c4812h3, c4812h3.mo5047b() - 1));
                    f3 += Math.abs(mo7066b(c4812h4, c4812h4.mo5047b() - 1) - mo7066b(c4812h3, c4812h3.mo5047b() - 1));
                }
                c4812h2 = c4812h4;
                c4812h3 = c4812h2;
            }
        }
        if (linkedList + f > (f2 + f3) * this.f24000c) {
            return C4808a.NO;
        }
        float b = mo7066b(c4812h, 0) - mo7066b(c4812h2, 0);
        linkedList = mo7066b(c4812h, c4812h.mo5047b() - 1) - mo7066b(c4812h2, c4812h2.mo5047b() - 1);
        if (b * linkedList < null) {
            return C4808a.NO;
        }
        if (Math.min(Math.abs(b) / c4812h.mo5049d(), Math.abs(linkedList) / c4812h.mo5049d()) < this.f23999b) {
            return C4808a.MAYBE;
        }
        return C4808a.YES;
    }
}
