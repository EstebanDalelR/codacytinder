package com.google.android.exoplayer2.source.smoothstreaming.p064a;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.FilterableManifest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a.a */
public class C3699a implements FilterableManifest<C3699a, C2217b> {
    /* renamed from: a */
    public final int f11551a;
    /* renamed from: b */
    public final int f11552b;
    /* renamed from: c */
    public final int f11553c;
    /* renamed from: d */
    public final boolean f11554d;
    /* renamed from: e */
    public final C2215a f11555e;
    /* renamed from: f */
    public final C2216b[] f11556f;
    /* renamed from: g */
    public final long f11557g;
    /* renamed from: h */
    public final long f11558h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a.a$a */
    public static class C2215a {
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a.a$b */
    public static class C2216b {
        /* renamed from: a */
        public final int f6412a;
        /* renamed from: b */
        public final String f6413b;
        /* renamed from: c */
        public final long f6414c;
        /* renamed from: d */
        public final String f6415d;
        /* renamed from: e */
        public final int f6416e;
        /* renamed from: f */
        public final int f6417f;
        /* renamed from: g */
        public final int f6418g;
        /* renamed from: h */
        public final int f6419h;
        /* renamed from: i */
        public final String f6420i;
        /* renamed from: j */
        public final Format[] f6421j;
        /* renamed from: k */
        public final int f6422k;
        /* renamed from: l */
        private final String f6423l;
        /* renamed from: m */
        private final String f6424m;
        /* renamed from: n */
        private final List<Long> f6425n;
        /* renamed from: o */
        private final long[] f6426o;
        /* renamed from: p */
        private final long f6427p;

        private C2216b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long[] jArr, long j2) {
            this.f6423l = str;
            this.f6424m = str2;
            this.f6412a = i;
            this.f6413b = str3;
            this.f6414c = j;
            this.f6415d = str4;
            this.f6416e = i2;
            this.f6417f = i3;
            this.f6418g = i4;
            this.f6419h = i5;
            this.f6420i = str5;
            this.f6421j = formatArr;
            this.f6425n = list;
            this.f6426o = jArr;
            this.f6427p = j2;
            this.f6422k = list.size();
        }

        /* renamed from: a */
        public C2216b m7920a(Format[] formatArr) {
            String str = this.f6423l;
            String str2 = this.f6424m;
            int i = this.f6412a;
            String str3 = this.f6413b;
            long j = this.f6414c;
            String str4 = this.f6415d;
            int i2 = this.f6416e;
            int i3 = this.f6417f;
            int i4 = this.f6418g;
            int i5 = this.f6419h;
            String str5 = this.f6420i;
            List list = this.f6425n;
            List list2 = list;
            return new C2216b(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, formatArr, list2, this.f6426o, this.f6427p);
        }
    }

    public /* synthetic */ Object copy(List list) {
        return m14036a(list);
    }

    private C3699a(int i, int i2, long j, long j2, int i3, boolean z, C2215a c2215a, C2216b[] c2216bArr) {
        this.f11551a = i;
        this.f11552b = i2;
        this.f11557g = j;
        this.f11558h = j2;
        this.f11553c = i3;
        this.f11554d = z;
        this.f11555e = c2215a;
        this.f11556f = c2216bArr;
    }

    /* renamed from: a */
    public final C3699a m14036a(List<C2217b> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        list = new ArrayList();
        List arrayList2 = new ArrayList();
        C2216b c2216b = null;
        int i = 0;
        while (i < arrayList.size()) {
            C2217b c2217b = (C2217b) arrayList.get(i);
            C2216b c2216b2 = this.f11556f[c2217b.f6428a];
            if (!(c2216b2 == c2216b || c2216b == null)) {
                list.add(c2216b.m7920a((Format[]) arrayList2.toArray(new Format[0])));
                arrayList2.clear();
            }
            arrayList2.add(c2216b2.f6421j[c2217b.f6429b]);
            i++;
            c2216b = c2216b2;
        }
        if (c2216b != null) {
            list.add(c2216b.m7920a((Format[]) arrayList2.toArray(new Format[0])));
        }
        return new C3699a(this.f11551a, this.f11552b, this.f11557g, this.f11558h, this.f11553c, this.f11554d, this.f11555e, (C2216b[]) list.toArray(new C2216b[0]));
    }
}
