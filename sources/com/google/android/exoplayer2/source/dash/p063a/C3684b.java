package com.google.android.exoplayer2.source.dash.p063a;

import android.net.Uri;
import com.google.android.exoplayer2.offline.FilterableManifest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.dash.a.b */
public class C3684b implements FilterableManifest<C3684b, C2200g> {
    /* renamed from: a */
    public final long f11432a;
    /* renamed from: b */
    public final long f11433b;
    /* renamed from: c */
    public final long f11434c;
    /* renamed from: d */
    public final boolean f11435d;
    /* renamed from: e */
    public final long f11436e;
    /* renamed from: f */
    public final long f11437f;
    /* renamed from: g */
    public final long f11438g;
    /* renamed from: h */
    public final long f11439h;
    /* renamed from: i */
    public final C2201h f11440i;
    /* renamed from: j */
    public final Uri f11441j;
    /* renamed from: k */
    private final List<C2197d> f11442k;

    public /* synthetic */ Object copy(List list) {
        return m13956a(list);
    }

    public C3684b(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C2201h c2201h, Uri uri, List<C2197d> list) {
        this.f11432a = j;
        this.f11433b = j2;
        this.f11434c = j3;
        this.f11435d = z;
        this.f11436e = j4;
        this.f11437f = j5;
        this.f11438g = j6;
        this.f11439h = j7;
        this.f11440i = c2201h;
        this.f11441j = uri;
        r0.f11442k = list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public final int m13955a() {
        return this.f11442k.size();
    }

    /* renamed from: a */
    public final C2197d m13957a(int i) {
        return (C2197d) this.f11442k.get(i);
    }

    /* renamed from: b */
    public final long m13958b(int i) {
        if (i != this.f11442k.size() - 1) {
            return ((C2197d) this.f11442k.get(i + 1)).f6333b - ((C2197d) this.f11442k.get(i)).f6333b;
        }
        if (this.f11433b == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f11433b - ((C2197d) this.f11442k.get(i)).f6333b;
    }

    /* renamed from: a */
    public final C3684b m13956a(List<C2200g> list) {
        long j;
        long b;
        C3684b c3684b = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C2200g(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i >= m13955a()) {
                break;
            }
            if (((C2200g) linkedList.peek()).f6340a != i) {
                b = m13958b(i);
                if (b != -9223372036854775807L) {
                    j2 += b;
                }
            } else {
                C2197d a = m13957a(i);
                List a2 = C3684b.m13954a(a.f6334c, linkedList);
                arrayList.add(new C2197d(a.f6332a, a.f6333b - j2, a2, a.f6335d));
            }
            i++;
        }
        if (c3684b.f11433b != -9223372036854775807L) {
            j = c3684b.f11433b - j2;
        }
        long j3 = c3684b.f11432a;
        b = c3684b.f11434c;
        boolean z = c3684b.f11435d;
        long j4 = c3684b.f11436e;
        long j5 = c3684b.f11437f;
        ArrayList arrayList2 = arrayList;
        long j6 = c3684b.f11438g;
        long j7 = c3684b.f11439h;
        return new C3684b(j3, j, b, z, j4, j5, j6, j7, c3684b.f11440i, c3684b.f11441j, arrayList2);
    }

    /* renamed from: a */
    private static ArrayList<C2195a> m13954a(List<C2195a> list, LinkedList<C2200g> linkedList) {
        C2200g c2200g = (C2200g) linkedList.poll();
        int i = c2200g.f6340a;
        ArrayList<C2195a> arrayList = new ArrayList();
        do {
            int i2 = c2200g.f6341b;
            C2195a c2195a = (C2195a) list.get(i2);
            List list2 = c2195a.f6326c;
            List arrayList2 = new ArrayList();
            do {
                arrayList2.add((C2199f) list2.get(c2200g.f6342c));
                c2200g = (C2200g) linkedList.poll();
                if (c2200g.f6340a != i) {
                    break;
                }
            } while (c2200g.f6341b == i2);
            arrayList.add(new C2195a(c2195a.f6324a, c2195a.f6325b, arrayList2, c2195a.f6327d, c2195a.f6328e));
        } while (c2200g.f6340a == i);
        linkedList.addFirst(c2200g);
        return arrayList;
    }
}
