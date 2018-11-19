package com.google.android.m4b.maps.cg;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.m4b.maps.cg.C5174f.C6612a;
import com.google.android.m4b.maps.cg.C5174f.C6613b;
import com.google.android.m4b.maps.cg.C5174f.C6614c;
import com.google.android.m4b.maps.cg.C5174f.C6615d;
import com.google.android.m4b.maps.cg.C5174f.C6617f;
import com.google.android.m4b.maps.cg.C5174f.C6618g;
import com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate.Stub;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C7701d;

/* renamed from: com.google.android.m4b.maps.cg.e */
public final class C7510e extends Stub {
    /* renamed from: a */
    private Resources f28019a;

    public C7510e(Resources resources) {
        this.f28019a = resources;
    }

    public final C5484b defaultMarker() {
        return C7701d.m33407a(C5174f.m23121a(this.f28019a));
    }

    public final C5484b defaultMarkerWithHue(float f) {
        return C7701d.m33407a(new C6613b(C5174f.m23121a(this.f28019a), f));
    }

    public final C5484b fromResource(int i) {
        return C7701d.m33407a(new C6618g(i));
    }

    public final C5484b fromAsset(String str) {
        return C7701d.m33407a(new C6612a(str));
    }

    public final C5484b fromFile(String str) {
        return C7701d.m33407a(new C6614c(str));
    }

    public final C5484b fromBitmap(Bitmap bitmap) {
        return C7701d.m33407a(new C6615d(bitmap));
    }

    public final C5484b fromPath(String str) {
        return C7701d.m33407a(new C6617f(str));
    }
}
