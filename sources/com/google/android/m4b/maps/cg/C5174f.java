package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.model.BitmapDescriptor;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C7701d;
import com.tinder.api.ManagerWebServices;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.cg.f */
public abstract class C5174f {
    /* renamed from: a */
    private static C6616e f19257a;
    /* renamed from: b */
    private final byte f19258b;

    /* renamed from: com.google.android.m4b.maps.cg.f$a */
    public static class C6612a extends C5174f {
        /* renamed from: a */
        private final String f24797a;

        private C6612a(String str) {
            super((byte) 3);
            this.f24797a = (String) C5462v.m23768a((Object) str, (Object) "null asset name");
        }

        /* renamed from: a */
        public final android.graphics.Bitmap mo5311a(android.content.Context r2) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r2 = r2.getAssets();	 Catch:{ IOException -> 0x0017 }
            r0 = r1.f24797a;	 Catch:{ IOException -> 0x0017 }
            r2 = r2.open(r0);	 Catch:{ IOException -> 0x0017 }
            r0 = android.graphics.BitmapFactory.decodeStream(r2);	 Catch:{ all -> 0x0012 }
            r2.close();	 Catch:{ IOException -> 0x0011 }
        L_0x0011:
            return r0;
        L_0x0012:
            r0 = move-exception;
            r2.close();	 Catch:{ IOException -> 0x0016 }
        L_0x0016:
            throw r0;
        L_0x0017:
            r2 = 0;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.f.a.a(android.content.Context):android.graphics.Bitmap");
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f24797a});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6612a)) {
                return null;
            }
            return this.f24797a.equals(((C6612a) obj).f24797a);
        }

        public final String toString() {
            return C5461u.m23765a(this).m23764a("asset", this.f24797a).toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.f$b */
    public static class C6613b extends C5174f {
        /* renamed from: a */
        private final C5174f f24798a;
        /* renamed from: b */
        private final float f24799b;

        public C6613b(C5174f c5174f, float f) {
            boolean z = false;
            super((byte) 1);
            if (f >= 0.0f && f < 360.0f) {
                z = true;
            }
            C5462v.m23773b(z, "hue outside range [0.0,360.0)");
            this.f24798a = (C5174f) C5462v.m23767a((Object) c5174f);
            this.f24799b = f;
        }

        /* renamed from: a */
        public final Bitmap mo5311a(Context context) {
            Bitmap a = this.f24798a.mo5311a(context);
            context = this.f24799b;
            int height = a.getHeight();
            int width = a.getWidth();
            int i = height * width;
            int[] iArr = new int[i];
            a.getPixels(iArr, 0, width, 0, 0, width, height);
            int[] iArr2 = new int[i];
            float[] fArr = new float[3];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                Color.colorToHSV(iArr[i2], fArr);
                fArr[0] = context;
                iArr2[i2] = Color.HSVToColor(Color.alpha(iArr[i2]), fArr);
            }
            return Bitmap.createBitmap(iArr2, 0, width, width, height, Config.ARGB_8888);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f24798a, Float.valueOf(this.f24799b)});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6613b)) {
                return false;
            }
            C6613b c6613b = (C6613b) obj;
            return this.f24798a.equals(c6613b.f24798a) && Float.floatToIntBits(this.f24799b) == Float.floatToIntBits(c6613b.f24799b);
        }

        public final String toString() {
            return C5461u.m23765a(this).m23764a("base", this.f24798a).m23764a("hue", Float.valueOf(this.f24799b)).toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.f$c */
    public static class C6614c extends C5174f {
        /* renamed from: a */
        private final String f24800a;

        private C6614c(String str) {
            super((byte) 4);
            this.f24800a = (String) C5462v.m23768a((Object) str, (Object) "null file name");
        }

        /* renamed from: a */
        public final android.graphics.Bitmap mo5311a(android.content.Context r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = com.google.android.m4b.maps.cg.bx.m23056a();
            r1 = r2.f24800a;	 Catch:{ FileNotFoundException -> 0x001f }
            r3 = r3.openFileInput(r1);	 Catch:{ FileNotFoundException -> 0x001f }
            r1 = android.graphics.BitmapFactory.decodeStream(r3);	 Catch:{ all -> 0x0015 }
            r3.close();	 Catch:{ IOException -> 0x0011 }
        L_0x0011:
            com.google.android.m4b.maps.cg.bx.m23057a(r0);
            return r1;
        L_0x0015:
            r1 = move-exception;
            r3.close();	 Catch:{ IOException -> 0x0019 }
        L_0x0019:
            throw r1;	 Catch:{ all -> 0x001a }
        L_0x001a:
            r3 = move-exception;
            com.google.android.m4b.maps.cg.bx.m23057a(r0);
            throw r3;
        L_0x001f:
            com.google.android.m4b.maps.cg.bx.m23057a(r0);
            r3 = 0;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.f.c.a(android.content.Context):android.graphics.Bitmap");
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f24800a});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6614c)) {
                return null;
            }
            return this.f24800a.equals(((C6614c) obj).f24800a);
        }

        public final String toString() {
            return C5461u.m23765a(this).m23764a(ManagerWebServices.PARAM_FILE, this.f24800a).toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.f$d */
    public static class C6615d extends C5174f {
        /* renamed from: a */
        private final Bitmap f24801a;

        private C6615d(Bitmap bitmap) {
            super((byte) 5);
            this.f24801a = bitmap;
        }

        /* renamed from: a */
        public final Bitmap mo5311a(Context context) {
            return this.f24801a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f24801a});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6615d)) {
                return null;
            }
            return this.f24801a.equals(((C6615d) obj).f24801a);
        }

        public final String toString() {
            return C5461u.m23765a(this).toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.f$e */
    public static class C6616e extends C5174f {
        /* renamed from: a */
        private final int f24802a;
        /* renamed from: b */
        private final Resources f24803b;

        private C6616e(Resources resources, int i) {
            super((byte) 6);
            this.f24803b = (Resources) C5462v.m23768a((Object) resources, (Object) "libraryResources");
            C5462v.m23772a(i >= 0, "invalid resource id: %s", new Object[]{Integer.valueOf(i)});
            this.f24802a = i;
        }

        /* renamed from: a */
        public final Bitmap mo5311a(Context context) {
            return BitmapFactory.decodeResource(this.f24803b, this.f24802a);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24802a)});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6616e)) {
                return false;
            }
            return this.f24802a == ((C6616e) obj).f24802a;
        }

        public final String toString() {
            return C5461u.m23765a(this).m23764a("resource ", Integer.valueOf(this.f24802a)).toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.f$f */
    public static class C6617f extends C5174f {
        /* renamed from: a */
        private final String f24804a;

        private C6617f(String str) {
            super((byte) 7);
            this.f24804a = (String) C5462v.m23768a((Object) str, (Object) "null file name");
        }

        /* renamed from: a */
        public final Bitmap mo5311a(Context context) {
            return BitmapFactory.decodeFile(this.f24804a);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f24804a});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6617f)) {
                return null;
            }
            return this.f24804a.equals(((C6617f) obj).f24804a);
        }

        public final String toString() {
            return C5461u.m23765a(this).m23764a("path", this.f24804a).toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.f$g */
    public static class C6618g extends C5174f {
        /* renamed from: a */
        private final int f24805a;

        private C6618g(int i) {
            super((byte) 2);
            C5462v.m23772a(i >= 0, "invalid resource id: %s", Integer.valueOf(i));
            this.f24805a = i;
        }

        /* renamed from: a */
        public final Bitmap mo5311a(Context context) {
            return BitmapFactory.decodeResource(context.getResources(), this.f24805a);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24805a)});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6618g)) {
                return false;
            }
            return this.f24805a == ((C6618g) obj).f24805a;
        }

        public final String toString() {
            return C5461u.m23765a(this).m23764a("resource ", Integer.valueOf(this.f24805a)).toString();
        }
    }

    /* renamed from: a */
    public abstract Bitmap mo5311a(Context context);

    private C5174f(byte b) {
        this.f19258b = b;
    }

    /* renamed from: a */
    public static C6616e m23121a(Resources resources) {
        if (f19257a == null) {
            f19257a = new C6616e(resources, C4513R.drawable.maps_default_marker);
        }
        return f19257a;
    }

    /* renamed from: a */
    static C5174f m23122a(BitmapDescriptor bitmapDescriptor, Resources resources) {
        if (bitmapDescriptor == null) {
            return C5174f.m23121a(resources);
        }
        return C5174f.m23123a(bitmapDescriptor.m23843a(), resources);
    }

    /* renamed from: a */
    static C5174f m23123a(C5484b c5484b, Resources resources) {
        if (c5484b == null) {
            return C5174f.m23121a(resources);
        }
        return (C5174f) C7701d.m33408a(c5484b);
    }
}
