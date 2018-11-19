package com.airbnb.lottie.model.animatable;

import android.support.annotation.Nullable;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.model.animatable.C4067a.C0801a;
import com.airbnb.lottie.model.animatable.C4068b.C0803a;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.animatable.k */
public class C0816k {
    @Nullable
    /* renamed from: a */
    public final C4067a f2182a;
    @Nullable
    /* renamed from: b */
    public final C4067a f2183b;
    @Nullable
    /* renamed from: c */
    public final C4068b f2184c;
    @Nullable
    /* renamed from: d */
    public final C4068b f2185d;

    /* renamed from: com.airbnb.lottie.model.animatable.k$a */
    public static final class C0815a {
        /* renamed from: a */
        public static C0816k m2880a(JSONObject jSONObject, C0788c c0788c) {
            C4068b c4068b = null;
            if (jSONObject != null) {
                if (jSONObject.has("a")) {
                    jSONObject = jSONObject.optJSONObject("a");
                    JSONObject optJSONObject = jSONObject.optJSONObject("fc");
                    C4067a a = optJSONObject != null ? C0801a.m2868a(optJSONObject, c0788c) : null;
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("sc");
                    C4067a a2 = optJSONObject2 != null ? C0801a.m2868a(optJSONObject2, c0788c) : null;
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("sw");
                    C4068b a3 = optJSONObject3 != null ? C0803a.m2870a(optJSONObject3, c0788c) : null;
                    jSONObject = jSONObject.optJSONObject("t");
                    if (jSONObject != null) {
                        c4068b = C0803a.m2870a(jSONObject, c0788c);
                    }
                    return new C0816k(a, a2, a3, c4068b);
                }
            }
            return new C0816k(null, null, null, null);
        }
    }

    C0816k(@Nullable C4067a c4067a, @Nullable C4067a c4067a2, @Nullable C4068b c4068b, @Nullable C4068b c4068b2) {
        this.f2182a = c4067a;
        this.f2183b = c4067a2;
        this.f2184c = c4068b;
        this.f2185d = c4068b2;
    }
}
