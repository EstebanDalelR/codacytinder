package com.facebook.ads.internal.p043j.p045b;

import com.facebook.ads.internal.p043j.p045b.p046a.C1445a;
import com.facebook.ads.internal.p043j.p045b.p046a.C1446c;
import java.io.File;

/* renamed from: com.facebook.ads.internal.j.b.c */
class C1453c {
    /* renamed from: a */
    public final File f3990a;
    /* renamed from: b */
    public final C1446c f3991b;
    /* renamed from: c */
    public final C1445a f3992c;

    C1453c(File file, C1446c c1446c, C1445a c1445a) {
        this.f3990a = file;
        this.f3991b = c1446c;
        this.f3992c = c1445a;
    }

    /* renamed from: a */
    File m5083a(String str) {
        return new File(this.f3990a, this.f3991b.mo1774a(str));
    }
}
