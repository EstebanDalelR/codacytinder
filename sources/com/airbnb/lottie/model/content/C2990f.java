package com.airbnb.lottie.model.content;

import android.support.annotation.Nullable;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.C4057k;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C2983l;
import com.airbnb.lottie.model.animatable.C2983l.C0818a;
import com.airbnb.lottie.model.animatable.C4068b;
import com.airbnb.lottie.model.animatable.C4068b.C0803a;
import com.airbnb.lottie.model.layer.C4077a;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.content.f */
public class C2990f implements ContentModel {
    /* renamed from: a */
    private final String f9291a;
    /* renamed from: b */
    private final C4068b f9292b;
    /* renamed from: c */
    private final C4068b f9293c;
    /* renamed from: d */
    private final C2983l f9294d;

    /* renamed from: com.airbnb.lottie.model.content.f$a */
    static final class C0841a {
        /* renamed from: a */
        static C2990f m2911a(JSONObject jSONObject, C0788c c0788c) {
            return new C2990f(jSONObject.optString("nm"), C0803a.m2871a(jSONObject.optJSONObject("c"), c0788c, false), C0803a.m2871a(jSONObject.optJSONObject("o"), c0788c, false), C0818a.m2882a(jSONObject.optJSONObject("tr"), c0788c));
        }
    }

    C2990f(String str, C4068b c4068b, C4068b c4068b2, C2983l c2983l) {
        this.f9291a = str;
        this.f9292b = c4068b;
        this.f9293c = c4068b2;
        this.f9294d = c2983l;
    }

    /* renamed from: a */
    public String m11567a() {
        return this.f9291a;
    }

    /* renamed from: b */
    public C4068b m11568b() {
        return this.f9292b;
    }

    /* renamed from: c */
    public C4068b m11569c() {
        return this.f9293c;
    }

    /* renamed from: d */
    public C2983l m11570d() {
        return this.f9294d;
    }

    @Nullable
    public Content toContent(C0792d c0792d, C4077a c4077a) {
        return new C4057k(c0792d, c4077a, this);
    }
}
