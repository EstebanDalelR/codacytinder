package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.hls.playlist.a */
public final class C4252a extends C3695b {
    /* renamed from: a */
    public final List<C2211a> f13754a;
    /* renamed from: b */
    public final List<C2211a> f13755b;
    /* renamed from: c */
    public final List<C2211a> f13756c;
    /* renamed from: d */
    public final Format f13757d;
    /* renamed from: e */
    public final List<Format> f13758e;

    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.a$a */
    public static final class C2211a {
        /* renamed from: a */
        public final String f6389a;
        /* renamed from: b */
        public final Format f6390b;

        /* renamed from: a */
        public static C2211a m7893a(String str) {
            return new C2211a(str, Format.createContainerFormat("0", "application/x-mpegURL", null, null, -1, 0, null));
        }

        public C2211a(String str, Format format) {
            this.f6389a = str;
            this.f6390b = format;
        }
    }

    public /* synthetic */ Object copy(List list) {
        return m17001a(list);
    }

    public C4252a(String str, List<String> list, List<C2211a> list2, List<C2211a> list3, List<C2211a> list4, Format format, List<Format> list5) {
        super(str, list);
        this.f13754a = Collections.unmodifiableList(list2);
        this.f13755b = Collections.unmodifiableList(list3);
        this.f13756c = Collections.unmodifiableList(list4);
        this.f13757d = format;
        this.f13758e = list5 != null ? Collections.unmodifiableList(list5) : null;
    }

    /* renamed from: a */
    public C4252a m17001a(List<RenditionKey> list) {
        return new C4252a(this.o, this.p, C4252a.m17000a(this.f13754a, 0, list), C4252a.m17000a(this.f13755b, 1, list), C4252a.m17000a(this.f13756c, 2, list), this.f13757d, this.f13758e);
    }

    /* renamed from: a */
    public static C4252a m16999a(String str) {
        List singletonList = Collections.singletonList(C2211a.m7893a(str));
        List emptyList = Collections.emptyList();
        return new C4252a(null, Collections.emptyList(), singletonList, emptyList, emptyList, null, null);
    }

    /* renamed from: a */
    private static List<C2211a> m17000a(List<C2211a> list, int i, List<RenditionKey> list2) {
        List<C2211a> arrayList = new ArrayList(list2.size());
        int i2 = 0;
        while (i2 < list.size()) {
            C2211a c2211a = (C2211a) list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                RenditionKey renditionKey = (RenditionKey) list2.get(i3);
                if (renditionKey.f6387a == i && renditionKey.f6388b == i2) {
                    arrayList.add(c2211a);
                    break;
                }
            }
            i2++;
        }
        return arrayList;
    }
}
