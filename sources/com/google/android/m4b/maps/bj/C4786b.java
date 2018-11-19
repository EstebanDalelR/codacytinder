package com.google.android.m4b.maps.bj;

import com.google.android.m4b.maps.aa.bo;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ba;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.bj.b */
public final class C4786b {
    /* renamed from: a */
    private static Set<ba> m21192a(C4787f c4787f, Set<ba> set, af afVar) {
        Set<ba> linkedHashSet = new LinkedHashSet();
        for (ba a : set) {
            ba a2 = c4787f.mo5018a(a2, afVar);
            if (a2 != null) {
                linkedHashSet.add(a2);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public static LinkedHashSet<ba> m21191a(C4787f c4787f, int i, Collection<ba> collection, af afVar, int i2, LinkedHashSet<ba> linkedHashSet) {
        LinkedHashSet<ba> linkedHashSet2;
        int i3;
        int c;
        int i4;
        int i5;
        C4787f c4787f2 = c4787f;
        af afVar2 = afVar;
        LinkedHashSet<ba> linkedHashSet3 = linkedHashSet == null ? new LinkedHashSet() : linkedHashSet;
        Set<ba> b = bo.m20658b(collection);
        Set linkedHashSet4 = new LinkedHashSet();
        if (b.isEmpty()) {
            linkedHashSet2 = linkedHashSet3;
        } else {
            Object obj;
            int c2;
            ba baVar = (ba) b.iterator().next();
            int b2 = baVar.m21619b();
            int i6 = 1 << b2;
            int i7 = i6 - 1;
            i3 = i6 >> 1;
            c = baVar.m21620c();
            for (ba c3 : b) {
                c = Math.min(c, c3.m21620c());
            }
            for (ba c32 : b) {
                if (c32.m21620c() - c >= i3) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            Iterator it = b.iterator();
            i4 = i6;
            i5 = i4;
            int i8 = 0;
            int i9 = 0;
            while (it.hasNext()) {
                Iterator it2 = it;
                ba baVar2 = (ba) it.next();
                linkedHashSet2 = linkedHashSet3;
                c2 = baVar2.m21620c();
                if (obj != null && c2 < i3) {
                    c2 += i6;
                }
                i4 = Math.min(i4, c2);
                i9 = Math.max(i9, c2);
                i5 = Math.min(i5, baVar2.m21621d());
                i8 = Math.max(i8, baVar2.m21621d());
                it = it2;
                linkedHashSet3 = linkedHashSet2;
            }
            linkedHashSet2 = linkedHashSet3;
            c2 = i4 & i7;
            linkedHashSet4.add(baVar.m21613a(b2, c2, i5));
            linkedHashSet4.add(baVar.m21613a(b2, c2, i8));
            c2 = i9 & i7;
            linkedHashSet4.add(baVar.m21613a(b2, c2, i5));
            linkedHashSet4.add(baVar.m21613a(b2, c2, i8));
        }
        Set a = C4786b.m21192a(c4787f2, b, afVar2);
        Set a2 = C4786b.m21192a(c4787f2, linkedHashSet4, afVar2);
        int i10 = 1;
        int i11 = 0;
        int i12 = i2;
        while (!r2.isEmpty() && i12 > 0 && i10 <= i && i11 < 3) {
            LinkedHashSet<ba> linkedHashSet5;
            Set linkedHashSet6;
            int i13;
            if (((ba) r2.iterator().next()).m21619b() > 13 || ((i11 > 0 || r2.size() > 2) && ((i11 >= 2 || i10 < 4) && (i11 >= 3 || i10 < 6)))) {
                linkedHashSet5 = linkedHashSet2;
            } else {
                i7 = i12;
                for (ba baVar3 : r2) {
                    if (i7 == 0) {
                        break;
                    }
                    linkedHashSet5 = linkedHashSet2;
                    if (linkedHashSet5.add(baVar3)) {
                        i7--;
                    }
                    linkedHashSet2 = linkedHashSet5;
                }
                linkedHashSet5 = linkedHashSet2;
                if (i12 != i7) {
                    i11++;
                }
                i12 = i7;
            }
            Collection collection2;
            if (collection2 != null && (r2.size() <= 2 || i10 >= 3)) {
                r2.addAll(collection2);
                collection2 = null;
            }
            if (r2.size() <= 2) {
                linkedHashSet6 = new LinkedHashSet();
                Iterator it3 = r2.iterator();
                while (it3.hasNext()) {
                    ba baVar4 = (ba) it3.next();
                    i3 = 1;
                    i7 = 1 << baVar4.m21619b();
                    c = i7 - 1;
                    i5 = -1;
                    while (i5 <= i3) {
                        Iterator it4;
                        i4 = -1;
                        while (i4 <= i3) {
                            i3 = baVar4.m21621d() + i4;
                            if (i3 < 0 || i3 >= i7) {
                                it4 = it3;
                                i13 = i12;
                            } else {
                                it4 = it3;
                                i13 = i12;
                                linkedHashSet6.add(baVar4.m21613a(baVar4.m21619b(), ((baVar4.m21620c() + i5) + i7) & c, i3));
                            }
                            i4++;
                            it3 = it4;
                            i12 = i13;
                            i3 = 1;
                        }
                        it4 = it3;
                        i13 = i12;
                        i5++;
                        i3 = 1;
                    }
                }
                i13 = i12;
            } else {
                i13 = i12;
                linkedHashSet6 = r2;
            }
            if (a2 != null) {
                a2 = C4786b.m21192a(c4787f2, a2, afVar2);
            }
            a = C4786b.m21192a(c4787f2, linkedHashSet6, afVar2);
            i10++;
            linkedHashSet2 = linkedHashSet5;
            i12 = i13;
        }
        return linkedHashSet2;
    }
}
