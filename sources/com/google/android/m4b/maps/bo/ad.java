package com.google.android.m4b.maps.bo;

import android.util.Log;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bo.bn.C6511a;
import com.google.android.m4b.maps.bo.bn.C6512b;
import com.google.android.m4b.maps.bo.bn.C6513c;
import com.google.android.m4b.maps.bo.bn.C6514d;
import com.google.android.m4b.maps.bo.bo.C4842a;
import com.google.android.m4b.maps.bo.bo.C4843b;
import com.google.android.m4b.maps.ch.C5203e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ad extends bo {
    /* renamed from: a */
    private final List<C4848k> f28874a;
    /* renamed from: b */
    private List<C4848k> f28875b;
    /* renamed from: c */
    private Set<C4699a> f28876c = new HashSet();
    /* renamed from: d */
    private List<String> f28877d;
    /* renamed from: e */
    private List<String> f28878e;
    /* renamed from: f */
    private long f28879f = -1;

    /* renamed from: com.google.android.m4b.maps.bo.ad$a */
    class C6491a implements C4843b {
        /* renamed from: a */
        private int f24074a;
        /* renamed from: b */
        private int f24075b;
        /* renamed from: c */
        private /* synthetic */ ad f24076c;

        private C6491a(ad adVar) {
            this.f24076c = adVar;
            this.f24074a = 0;
            this.f24075b = 0;
        }

        public final boolean hasNext() {
            return this.f24074a < this.f24076c.f28875b.size();
        }

        public final void remove() {
            throw new UnsupportedOperationException("remove() not supported");
        }

        /* renamed from: a */
        public final C4848k mo5104a() {
            return (C4848k) this.f24076c.f28875b.get(this.f24074a);
        }

        /* renamed from: b */
        public final void mo5105b() {
            this.f24075b = this.f24074a;
        }

        /* renamed from: c */
        public final void mo5106c() {
            this.f24074a = this.f24075b;
        }

        public final /* synthetic */ Object next() {
            List a = this.f24076c.f28875b;
            int i = this.f24074a;
            this.f24074a = i + 1;
            return (C4848k) a.get(i);
        }
    }

    /* renamed from: a */
    public static bo m34214a(bo boVar, bo boVar2, C5203e c5203e) {
        long a = boVar.mo7073a();
        if (a < 0 || (boVar2.mo7073a() >= 0 && boVar2.mo7073a() < a)) {
            a = boVar2.mo7073a();
        }
        if (boVar2.m32255p() == 0 && a == boVar.mo7073a()) {
            return boVar;
        }
        if (boVar2.m32255p() > 0) {
            boVar = m34213a(boVar, c5203e);
            boVar.f28876c = new HashSet();
            c5203e = new ArrayList();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < boVar2.m32255p(); i2++) {
                bn b = boVar2.m32240b(i2);
                if (b instanceof C6511a) {
                    c5203e.add((C6511a) b);
                } else if (b instanceof C6513c) {
                    boVar.f28876c.add(((C6513c) b).m28650a());
                } else if (b instanceof C6512b) {
                    arrayList.add((C6512b) b);
                } else if (b instanceof C6514d) {
                    arrayList2.add((C6514d) b);
                } else {
                    boVar2 = String.valueOf(b);
                    c5203e = new StringBuilder(String.valueOf(boVar2).length() + 16);
                    c5203e.append("Wrong modifier: ");
                    c5203e.append(boVar2);
                    throw new IllegalArgumentException(c5203e.toString());
                }
            }
            Iterator it = boVar.f28875b.iterator();
            while (it.hasNext()) {
                if (boVar.f28876c.contains(((C4848k) it.next()).mo5107a())) {
                    it.remove();
                }
            }
            c5203e = c5203e.iterator();
            while (c5203e.hasNext()) {
                int i3;
                C6511a c6511a = (C6511a) c5203e.next();
                for (i3 = 0; i3 < c6511a.m28645a().mo5111l().length; i3++) {
                    int[] l = c6511a.m28645a().mo5111l();
                    l[i3] = l[i3] + boVar.f28877d.size();
                }
                if (!c6511a.m28646b() || c6511a.m28647c() >= boVar.f28874a.size()) {
                    if (c6511a.m28647c() >= boVar.f28874a.size() && C4728u.m21050a("MutableVectorTile", 6)) {
                        String valueOf = String.valueOf(boVar2.mo5101h());
                        String valueOf2 = String.valueOf(boVar2.mo5099d());
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length());
                        stringBuilder.append("Invalid plane index on tile ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" at ");
                        stringBuilder.append(valueOf2);
                        Log.e("MutableVectorTile", stringBuilder.toString());
                    }
                    boVar.f28875b.add(c6511a.m28645a());
                } else {
                    i3 = boVar.f28875b.indexOf((C4848k) boVar.f28874a.get(c6511a.m28647c()));
                    if (i3 < 0) {
                        boVar.f28875b.add(c6511a.m28645a());
                    } else if (c6511a.m28648d()) {
                        boVar.f28875b.add(i3, c6511a.m28645a());
                    } else {
                        boVar.f28875b.add(i3 + 1, c6511a.m28645a());
                    }
                }
            }
            c5203e = arrayList2.iterator();
            while (c5203e.hasNext()) {
                c5203e.next();
            }
            c5203e = arrayList.iterator();
            while (c5203e.hasNext()) {
                boVar.f28875b.add(0, ((C6512b) c5203e.next()).m28649a());
            }
            c5203e = boVar2.mo7543c();
            while (i < c5203e.length) {
                if (!boVar.f28878e.contains(c5203e[i])) {
                    boVar.f28878e.add(c5203e[i]);
                }
                i++;
            }
            boVar.f28877d.addAll(Arrays.asList(boVar2.mo7544f()));
            boVar.f28879f = a;
            return boVar;
        } else if ((boVar instanceof ad) == null) {
            return new C4842a(c5203e).m21717a(boVar.mo5099d()).m21722b(boVar.mo5100e()).m21715a(boVar.mo5102i()).m21720a(boVar.mo7543c()).m21724b(boVar.mo7544f()).m21725c(boVar.m32253n()).m21719a(boVar.m32254o()).m21718a(boVar.mo5101h()).m21716a(a).m21723b(boVar.mo7074b()).m21721a();
        } else {
            ((ad) boVar).f28879f = a;
            return boVar;
        }
    }

    /* renamed from: a */
    private static ad m34213a(bo boVar, C5203e c5203e) {
        return boVar instanceof ad ? (ad) boVar : new ad(boVar, c5203e);
    }

    private ad(bo boVar, C5203e c5203e) {
        super(boVar.mo5099d(), boVar.mo5100e(), boVar.m32252m(), boVar.mo5102i(), null, null, boVar.m32253n(), null, boVar.mo5101h(), null, -1, boVar.mo7074b(), c5203e);
        this.f28874a = Collections.unmodifiableList(Arrays.asList(boVar.m32254o()));
        this.f28875b = new ArrayList();
        C4843b k = boVar.mo7546k();
        while (k.hasNext()) {
            r1.f28875b.add(k.next());
        }
        r1.f28877d = new ArrayList();
        if (boVar.mo7544f() != null) {
            r1.f28877d.addAll(Arrays.asList(boVar.mo7544f()));
        }
        r1.f28878e = new ArrayList();
        if (boVar.mo7543c() != null) {
            r1.f28878e.addAll(Arrays.asList(boVar.mo7543c()));
        }
        r1.f28879f = boVar.mo7073a();
    }

    /* renamed from: b */
    public static bo m34216b(bo boVar, bo boVar2, C5203e c5203e) {
        boVar = m34213a(boVar, c5203e);
        for (C4848k c4848k : boVar2.m32254o()) {
            if (c4848k.mo5109h() == 6) {
                for (int i = 0; i < boVar.f28875b.size(); i++) {
                    if (((C4848k) boVar.f28875b.get(i)).mo5109h() == 6) {
                        boVar.f28875b.set(i, c4848k);
                        break;
                    }
                }
                if (C4728u.m21050a("MutableVectorTile", 5)) {
                    Log.w("MutableVectorTile", "No raster to replace in the base tile. Adding the new raster to the feature collection");
                }
                boVar.f28875b.add(c4848k);
            } else {
                boVar.f28875b.add(c4848k);
            }
        }
        return m34214a(boVar, boVar2, c5203e);
    }

    /* renamed from: c */
    public final String[] mo7543c() {
        return (String[]) this.f28878e.toArray(new String[this.f28878e.size()]);
    }

    /* renamed from: f */
    public final String[] mo7544f() {
        return (String[]) this.f28877d.toArray(new String[this.f28877d.size()]);
    }

    /* renamed from: g */
    public final int mo7545g() {
        return this.f28875b.size();
    }

    /* renamed from: a */
    public final C4848k mo7542a(int i) {
        return (C4848k) this.f28875b.get(i);
    }

    /* renamed from: k */
    public final C4843b mo7546k() {
        return new C6491a();
    }

    /* renamed from: l */
    public final Set<C4699a> mo7547l() {
        return Collections.unmodifiableSet(this.f28876c);
    }

    /* renamed from: a */
    public final long mo7073a() {
        return this.f28879f;
    }

    /* renamed from: a */
    public final boolean mo5096a(C4712d c4712d) {
        return (this.f28879f < 0 || C4712d.m20957c() <= this.f28879f) ? null : true;
    }
}
