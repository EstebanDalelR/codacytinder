package com.airbnb.lottie.model.content;

import android.graphics.Path.FillType;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.C4053e;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C4068b;
import com.airbnb.lottie.model.animatable.C4069c;
import com.airbnb.lottie.model.animatable.C4070d;
import com.airbnb.lottie.model.animatable.C4071f;
import com.airbnb.lottie.model.layer.C4077a;

/* renamed from: com.airbnb.lottie.model.content.c */
public class C2987c implements ContentModel {
    /* renamed from: a */
    private final GradientType f9267a;
    /* renamed from: b */
    private final FillType f9268b;
    /* renamed from: c */
    private final C4069c f9269c;
    /* renamed from: d */
    private final C4070d f9270d;
    /* renamed from: e */
    private final C4071f f9271e;
    /* renamed from: f */
    private final C4071f f9272f;
    /* renamed from: g */
    private final String f9273g;
    @Nullable
    /* renamed from: h */
    private final C4068b f9274h;
    @Nullable
    /* renamed from: i */
    private final C4068b f9275i;

    /* renamed from: com.airbnb.lottie.model.content.c$a */
    static class C0836a {
        /* renamed from: a */
        static com.airbnb.lottie.model.content.C2987c m2908a(org.json.JSONObject r12, com.airbnb.lottie.C0788c r13) {
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
            r0 = "nm";
            r2 = r12.optString(r0);
            r0 = "g";
            r0 = r12.optJSONObject(r0);
            if (r0 == 0) goto L_0x0027;
        L_0x000e:
            r1 = "k";
            r1 = r0.has(r1);
            if (r1 == 0) goto L_0x0027;
        L_0x0016:
            r1 = "p";
            r1 = r0.optInt(r1);
            r3 = "k";
            r0 = r0.optJSONObject(r3);
            r3 = "p";	 Catch:{ JSONException -> 0x0027 }
            r0.put(r3, r1);	 Catch:{ JSONException -> 0x0027 }
        L_0x0027:
            r1 = 0;
            if (r0 == 0) goto L_0x0030;
        L_0x002a:
            r0 = com.airbnb.lottie.model.animatable.C4069c.C0805a.m2872a(r0, r13);
            r5 = r0;
            goto L_0x0031;
        L_0x0030:
            r5 = r1;
        L_0x0031:
            r0 = "o";
            r0 = r12.optJSONObject(r0);
            if (r0 == 0) goto L_0x003f;
        L_0x0039:
            r0 = com.airbnb.lottie.model.animatable.C4070d.C0807a.m2874a(r0, r13);
            r6 = r0;
            goto L_0x0040;
        L_0x003f:
            r6 = r1;
        L_0x0040:
            r0 = "r";
            r3 = 1;
            r0 = r12.optInt(r0, r3);
            if (r0 != r3) goto L_0x004d;
        L_0x0049:
            r0 = android.graphics.Path.FillType.WINDING;
        L_0x004b:
            r4 = r0;
            goto L_0x0050;
        L_0x004d:
            r0 = android.graphics.Path.FillType.EVEN_ODD;
            goto L_0x004b;
        L_0x0050:
            r0 = "t";
            r0 = r12.optInt(r0, r3);
            if (r0 != r3) goto L_0x005c;
        L_0x0058:
            r0 = com.airbnb.lottie.model.content.GradientType.Linear;
        L_0x005a:
            r3 = r0;
            goto L_0x005f;
        L_0x005c:
            r0 = com.airbnb.lottie.model.content.GradientType.Radial;
            goto L_0x005a;
        L_0x005f:
            r0 = "s";
            r0 = r12.optJSONObject(r0);
            if (r0 == 0) goto L_0x006d;
        L_0x0067:
            r0 = com.airbnb.lottie.model.animatable.C4071f.C0809a.m2875a(r0, r13);
            r7 = r0;
            goto L_0x006e;
        L_0x006d:
            r7 = r1;
        L_0x006e:
            r0 = "e";
            r12 = r12.optJSONObject(r0);
            if (r12 == 0) goto L_0x007c;
        L_0x0076:
            r12 = com.airbnb.lottie.model.animatable.C4071f.C0809a.m2875a(r12, r13);
            r8 = r12;
            goto L_0x007d;
        L_0x007c:
            r8 = r1;
        L_0x007d:
            r12 = new com.airbnb.lottie.model.content.c;
            r9 = 0;
            r10 = 0;
            r11 = 0;
            r1 = r12;
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10);
            return r12;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.content.c.a.a(org.json.JSONObject, com.airbnb.lottie.c):com.airbnb.lottie.model.content.c");
        }
    }

    private C2987c(String str, GradientType gradientType, FillType fillType, C4069c c4069c, C4070d c4070d, C4071f c4071f, C4071f c4071f2, C4068b c4068b, C4068b c4068b2) {
        this.f9267a = gradientType;
        this.f9268b = fillType;
        this.f9269c = c4069c;
        this.f9270d = c4070d;
        this.f9271e = c4071f;
        this.f9272f = c4071f2;
        this.f9273g = str;
        this.f9274h = c4068b;
        this.f9275i = c4068b2;
    }

    /* renamed from: a */
    public String m11545a() {
        return this.f9273g;
    }

    /* renamed from: b */
    public GradientType m11546b() {
        return this.f9267a;
    }

    /* renamed from: c */
    public FillType m11547c() {
        return this.f9268b;
    }

    /* renamed from: d */
    public C4069c m11548d() {
        return this.f9269c;
    }

    /* renamed from: e */
    public C4070d m11549e() {
        return this.f9270d;
    }

    /* renamed from: f */
    public C4071f m11550f() {
        return this.f9271e;
    }

    /* renamed from: g */
    public C4071f m11551g() {
        return this.f9272f;
    }

    public Content toContent(C0792d c0792d, C4077a c4077a) {
        return new C4053e(c0792d, c4077a, this);
    }
}
