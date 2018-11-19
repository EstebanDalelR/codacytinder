package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.C4050b;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.layer.C4077a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.content.i */
public class C2993i implements ContentModel {
    /* renamed from: a */
    private final String f9301a;
    /* renamed from: b */
    private final List<ContentModel> f9302b;

    /* renamed from: com.airbnb.lottie.model.content.i$a */
    static class C0846a {
        /* renamed from: b */
        private static C2993i m2919b(JSONObject jSONObject, C0788c c0788c) {
            JSONArray optJSONArray = jSONObject.optJSONArray("it");
            jSONObject = jSONObject.optString("nm");
            List arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                ContentModel a = C2993i.m11577a(optJSONArray.optJSONObject(i), c0788c);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return new C2993i(jSONObject, arrayList);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    /* renamed from: a */
    public static com.airbnb.lottie.model.content.ContentModel m11577a(org.json.JSONObject r2, com.airbnb.lottie.C0788c r3) {
        /*
        r0 = "ty";
        r0 = r2.optString(r0);
        r1 = r0.hashCode();
        switch(r1) {
            case 3239: goto L_0x008f;
            case 3270: goto L_0x0085;
            case 3295: goto L_0x007b;
            case 3307: goto L_0x0071;
            case 3308: goto L_0x0067;
            case 3488: goto L_0x005c;
            case 3633: goto L_0x0051;
            case 3646: goto L_0x0046;
            case 3669: goto L_0x003c;
            case 3679: goto L_0x0031;
            case 3681: goto L_0x0026;
            case 3705: goto L_0x001a;
            case 3710: goto L_0x000f;
            default: goto L_0x000d;
        };
    L_0x000d:
        goto L_0x0099;
    L_0x000f:
        r1 = "tr";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0099;
    L_0x0017:
        r1 = 5;
        goto L_0x009a;
    L_0x001a:
        r1 = "tm";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0099;
    L_0x0022:
        r1 = 9;
        goto L_0x009a;
    L_0x0026:
        r1 = "st";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0099;
    L_0x002e:
        r1 = 1;
        goto L_0x009a;
    L_0x0031:
        r1 = "sr";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0099;
    L_0x0039:
        r1 = 10;
        goto L_0x009a;
    L_0x003c:
        r1 = "sh";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0099;
    L_0x0044:
        r1 = 6;
        goto L_0x009a;
    L_0x0046:
        r1 = "rp";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0099;
    L_0x004e:
        r1 = 12;
        goto L_0x009a;
    L_0x0051:
        r1 = "rc";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0099;
    L_0x0059:
        r1 = 8;
        goto L_0x009a;
    L_0x005c:
        r1 = "mm";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0099;
    L_0x0064:
        r1 = 11;
        goto L_0x009a;
    L_0x0067:
        r1 = "gs";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0099;
    L_0x006f:
        r1 = 2;
        goto L_0x009a;
    L_0x0071:
        r1 = "gr";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0099;
    L_0x0079:
        r1 = 0;
        goto L_0x009a;
    L_0x007b:
        r1 = "gf";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0099;
    L_0x0083:
        r1 = 4;
        goto L_0x009a;
    L_0x0085:
        r1 = "fl";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0099;
    L_0x008d:
        r1 = 3;
        goto L_0x009a;
    L_0x008f:
        r1 = "el";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0099;
    L_0x0097:
        r1 = 7;
        goto L_0x009a;
    L_0x0099:
        r1 = -1;
    L_0x009a:
        switch(r1) {
            case 0: goto L_0x00f1;
            case 1: goto L_0x00ec;
            case 2: goto L_0x00e7;
            case 3: goto L_0x00e2;
            case 4: goto L_0x00dd;
            case 5: goto L_0x00d8;
            case 6: goto L_0x00d3;
            case 7: goto L_0x00ce;
            case 8: goto L_0x00c9;
            case 9: goto L_0x00c4;
            case 10: goto L_0x00bf;
            case 11: goto L_0x00ba;
            case 12: goto L_0x00b5;
            default: goto L_0x009d;
        };
    L_0x009d:
        r2 = "LOTTIE";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r1 = "Unknown shape type ";
        r3.append(r1);
        r3.append(r0);
        r3 = r3.toString();
        android.util.Log.w(r2, r3);
        r2 = 0;
        return r2;
    L_0x00b5:
        r2 = com.airbnb.lottie.model.content.C2990f.C0841a.m2911a(r2, r3);
        return r2;
    L_0x00ba:
        r2 = com.airbnb.lottie.model.content.MergePaths.C0825a.m2899a(r2);
        return r2;
    L_0x00bf:
        r2 = com.airbnb.lottie.model.content.PolystarShape.C0827a.m2900a(r2, r3);
        return r2;
    L_0x00c4:
        r2 = com.airbnb.lottie.model.content.ShapeTrimPath.C0831a.m2902a(r2, r3);
        return r2;
    L_0x00c9:
        r2 = com.airbnb.lottie.model.content.C2989e.C0840a.m2910a(r2, r3);
        return r2;
    L_0x00ce:
        r2 = com.airbnb.lottie.model.content.C2986a.C0833a.m2903a(r2, r3);
        return r2;
    L_0x00d3:
        r2 = com.airbnb.lottie.model.content.C2994j.C0848a.m2920a(r2, r3);
        return r2;
    L_0x00d8:
        r2 = com.airbnb.lottie.model.animatable.C2983l.C0818a.m2882a(r2, r3);
        return r2;
    L_0x00dd:
        r2 = com.airbnb.lottie.model.content.C2987c.C0836a.m2908a(r2, r3);
        return r2;
    L_0x00e2:
        r2 = com.airbnb.lottie.model.content.C2992h.C0845a.m2917a(r2, r3);
        return r2;
    L_0x00e7:
        r2 = com.airbnb.lottie.model.content.C2988d.C0838a.m2909a(r2, r3);
        return r2;
    L_0x00ec:
        r2 = com.airbnb.lottie.model.content.ShapeStroke.C0829a.m2901a(r2, r3);
        return r2;
    L_0x00f1:
        r2 = com.airbnb.lottie.model.content.C2993i.C0846a.m2919b(r2, r3);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.content.i.a(org.json.JSONObject, com.airbnb.lottie.c):com.airbnb.lottie.model.content.ContentModel");
    }

    public C2993i(String str, List<ContentModel> list) {
        this.f9301a = str;
        this.f9302b = list;
    }

    /* renamed from: a */
    public String m11578a() {
        return this.f9301a;
    }

    /* renamed from: b */
    public List<ContentModel> m11579b() {
        return this.f9302b;
    }

    public Content toContent(C0792d c0792d, C4077a c4077a) {
        return new C4050b(c0792d, c4077a, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeGroup{name='");
        stringBuilder.append(this.f9301a);
        stringBuilder.append("' Shapes: ");
        stringBuilder.append(Arrays.toString(this.f9302b.toArray()));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
