package com.google.android.m4b.maps.ca;

import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.aa.bo;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.aj.C4836a;
import com.google.android.m4b.maps.bo.bj;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.ca.m */
public final class C5060m {

    /* renamed from: com.google.android.m4b.maps.ca.m$a */
    static class C5059a {
        /* renamed from: a */
        private final LinkedList<af> f18760a = new LinkedList();

        public C5059a(af afVar, af afVar2) {
            this.f18760a.add(afVar);
            this.f18760a.add(afVar2);
        }

        /* renamed from: a */
        public final boolean m22656a(C5059a c5059a) {
            if (((af) c5059a.f18760a.getLast()).equals(this.f18760a.getFirst())) {
                this.f18760a.removeFirst();
                this.f18760a.addAll(0, c5059a.f18760a);
                return true;
            } else if (!((af) c5059a.f18760a.getFirst()).equals(this.f18760a.getLast())) {
                return false;
            } else {
                this.f18760a.removeLast();
                this.f18760a.addAll(c5059a.f18760a);
                return true;
            }
        }

        /* renamed from: a */
        public final af m22655a() {
            return (af) this.f18760a.getFirst();
        }

        /* renamed from: b */
        public final af m22657b() {
            return (af) this.f18760a.getLast();
        }

        /* renamed from: c */
        public final aj m22658c() {
            C4836a c4836a = new C4836a(this.f18760a.size());
            Iterator it = this.f18760a.iterator();
            while (it.hasNext()) {
                c4836a.m21514a((af) it.next());
            }
            return c4836a.m21516c();
        }
    }

    /* renamed from: a */
    private static void m22660a(Map<af, C5059a> map, af afVar, af afVar2) {
        C5059a c5059a = new C5059a(afVar, afVar2);
        C5059a c5059a2 = (C5059a) map.get(afVar);
        C5059a c5059a3 = (C5059a) map.get(afVar2);
        if (c5059a2 != null && c5059a.m22656a(c5059a2)) {
            map.remove(c5059a2.m22655a());
            map.remove(c5059a2.m22657b());
        }
        if (!(c5059a3 == null || c5059a3 == c5059a2 || c5059a.m22656a(c5059a3) == null)) {
            map.remove(c5059a3.m22655a());
            map.remove(c5059a3.m22657b());
        }
        map.put(c5059a.m22655a(), c5059a);
        map.put(c5059a.m22657b(), c5059a);
    }

    /* renamed from: a */
    public static List<aj> m22659a(bj bjVar, byte[] bArr) {
        Map b = ax.m20623b();
        for (int i = 0; i < bjVar.m21691a(); i++) {
            af afVar = new af();
            af afVar2 = new af();
            af afVar3 = new af();
            bjVar.m21692a(i, afVar, afVar2, afVar3);
            if ((bArr[i] & 1) != 0) {
                C5060m.m22660a(b, afVar, afVar2);
            }
            if ((bArr[i] & 2) != 0) {
                C5060m.m22660a(b, afVar2, afVar3);
            }
            if ((bArr[i] & 4) != 0) {
                C5060m.m22660a(b, afVar3, afVar);
            }
        }
        bj<C5059a> a = bo.m20652a(b.values());
        bArr = au.m20524a(a.size());
        for (C5059a c : a) {
            bArr.add(c.m22658c());
        }
        return bArr;
    }
}
