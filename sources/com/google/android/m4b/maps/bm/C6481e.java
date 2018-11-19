package com.google.android.m4b.maps.bm;

import android.util.Log;
import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.aa.am;
import com.google.android.m4b.maps.aa.am.C6309a;
import com.google.android.m4b.maps.aa.ay;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bm.C4824c.C4823a;
import com.google.android.m4b.maps.bn.C4831a;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bq;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.bm.e */
public final class C6481e implements C4824c {
    /* renamed from: b */
    private final ay<ba, C4820a> f24019b;
    /* renamed from: c */
    private final Set<C4699a> f24020c;

    /* renamed from: a */
    public final void mo5083a(C4823a c4823a) {
    }

    /* renamed from: b */
    public final void mo5085b(C4823a c4823a) {
    }

    public C6481e() {
        this.f24019b = am.m34127d();
        this.f24020c = al.m27704f();
    }

    private C6481e(Collection<C4820a> collection, bq bqVar) {
        C6481e c6481e = this;
        bq bqVar2 = bqVar;
        C6309a e = am.m34128e();
        Collection hashSet = new HashSet();
        int i = 0;
        int i2 = 0;
        for (C4820a c4820a : collection) {
            bq a = bq.m28669a(c4820a.m21389b());
            double d = ((double) a.m28678d()) / a.m28680f().m21488e();
            double e2 = ((double) a.m28679e()) / a.m28680f().m21488e();
            if (d < 7000.0d) {
                if (e2 < 7000.0d) {
                    c4820a.m21387a((Set) hashSet);
                    if (bqVar2 == null || bqVar2.mo5135b(c4820a.m21389b())) {
                        i++;
                        Iterator it = ba.m21606a(a, 15).iterator();
                        while (it.hasNext()) {
                            e.m27708a((ba) it.next(), c4820a);
                        }
                    }
                }
            }
            if (C4728u.m21050a("BuildingBounds", 4)) {
                String valueOf = String.valueOf(c4820a.m21386a());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 120);
                stringBuilder.append("Ignoring building with overly large width/height (");
                stringBuilder.append(d);
                stringBuilder.append("m width, ");
                stringBuilder.append(e2);
                stringBuilder.append("m height, id=");
                stringBuilder.append(valueOf);
                Log.i("BuildingBounds", stringBuilder.toString());
            }
            i2++;
        }
        c6481e.f24020c = al.m27701a(hashSet);
        c6481e.f24019b = e.m27709a();
        if (C4728u.m21050a("BuildingBounds", 3)) {
            int size = collection.size();
            int b = c6481e.f24019b.mo6990b();
            StringBuilder stringBuilder2 = new StringBuilder(82);
            stringBuilder2.append(size);
            stringBuilder2.append(" buildings, ");
            stringBuilder2.append(i);
            stringBuilder2.append(" loaded, ");
            stringBuilder2.append(i2);
            stringBuilder2.append(" skipped, ");
            stringBuilder2.append(b);
            stringBuilder2.append(" tiles.");
            Log.d("BuildingBounds", stringBuilder2.toString());
        }
    }

    /* renamed from: a */
    public final Collection<C4820a> mo5082a(ba baVar) {
        baVar = baVar.m21611a();
        int b = baVar.m21619b();
        if (b < 15) {
            return al.m27704f();
        }
        if (b == 15) {
            return this.f24019b.mo6988a(baVar);
        }
        return C4820a.m21385a(this.f24019b.mo6988a(baVar.m21612a(15)), baVar.m21626i());
    }

    /* renamed from: a */
    public final boolean mo5084a(C4699a c4699a) {
        return this.f24020c.contains(c4699a);
    }

    /* renamed from: a */
    public static C6481e m28441a(Reader reader, bq bqVar) {
        BufferedReader bufferedReader = new BufferedReader(reader);
        reader = new LinkedList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return new C6481e(reader, bqVar);
            }
            readLine = readLine.trim();
            Object obj = null;
            if (readLine.length() != 0) {
                Object split = readLine.split("\\s+");
                int i = 3;
                String str;
                String str2;
                if (split.length >= 3) {
                    C7436c b = C7436c.m32017b(split[0]);
                    C4831a a = C4831a.m21408a(split[1]);
                    C4831a a2 = C4831a.m21408a(split[2]);
                    if (!(b == null || a == null)) {
                        if (a2 != null) {
                            af a3;
                            if (split.length > 3) {
                                a3 = C4820a.m21384a(split[3]);
                                if (a3 != null) {
                                    i = 4;
                                }
                            }
                            af b2 = af.m21466b(a.m21411a(), a.m21412b());
                            af b3 = af.m21466b(a2.m21411a(), a2.m21412b());
                            Object obj2 = new String[(split.length - i)];
                            System.arraycopy(split, i, obj2, 0, obj2.length);
                            obj = new C4820a(b, com.google.android.m4b.maps.bo.al.m32203a(b2, b3), a3, obj2);
                        }
                    }
                    if (C4728u.m21050a("INDOOR", 3)) {
                        str = "INDOOR";
                        str2 = "Failed to parse line: ";
                        readLine = String.valueOf(readLine);
                        Log.d(str, readLine.length() != 0 ? str2.concat(readLine) : new String(str2));
                    }
                } else if (C4728u.m21050a("INDOOR", 3)) {
                    str = "INDOOR";
                    str2 = "Failed to parse line: ";
                    readLine = String.valueOf(readLine);
                    Log.d(str, readLine.length() != 0 ? str2.concat(readLine) : new String(str2));
                }
            }
            if (obj != null) {
                reader.add(obj);
            }
        }
    }
}
