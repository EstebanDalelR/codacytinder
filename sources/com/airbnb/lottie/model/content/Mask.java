package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.model.animatable.C4070d;
import com.airbnb.lottie.model.animatable.C4070d.C0807a;
import com.airbnb.lottie.model.animatable.C4073h;
import com.airbnb.lottie.model.animatable.C4073h.C0813a;
import org.json.JSONObject;

public class Mask {
    /* renamed from: a */
    private final MaskMode f2195a;
    /* renamed from: b */
    private final C4073h f2196b;
    /* renamed from: c */
    private final C4070d f2197c;

    public enum MaskMode {
        MaskModeAdd,
        MaskModeSubtract,
        MaskModeIntersect,
        MaskModeUnknown
    }

    /* renamed from: com.airbnb.lottie.model.content.Mask$a */
    public static class C0823a {
        /* renamed from: a */
        public static Mask m2895a(JSONObject jSONObject, C0788c c0788c) {
            Object obj;
            MaskMode maskMode;
            String optString = jSONObject.optString("mode");
            int hashCode = optString.hashCode();
            if (hashCode != 97) {
                if (hashCode != 105) {
                    if (hashCode == 115) {
                        if (optString.equals("s")) {
                            obj = 1;
                            switch (obj) {
                                case null:
                                    maskMode = MaskMode.MaskModeAdd;
                                    break;
                                case 1:
                                    maskMode = MaskMode.MaskModeSubtract;
                                    break;
                                case 2:
                                    maskMode = MaskMode.MaskModeIntersect;
                                    break;
                                default:
                                    maskMode = MaskMode.MaskModeUnknown;
                                    break;
                            }
                            return new Mask(maskMode, C0813a.m2878a(jSONObject.optJSONObject("pt"), c0788c), C0807a.m2874a(jSONObject.optJSONObject("o"), c0788c));
                        }
                    }
                } else if (optString.equals("i")) {
                    obj = 2;
                    switch (obj) {
                        case null:
                            maskMode = MaskMode.MaskModeAdd;
                            break;
                        case 1:
                            maskMode = MaskMode.MaskModeSubtract;
                            break;
                        case 2:
                            maskMode = MaskMode.MaskModeIntersect;
                            break;
                        default:
                            maskMode = MaskMode.MaskModeUnknown;
                            break;
                    }
                    return new Mask(maskMode, C0813a.m2878a(jSONObject.optJSONObject("pt"), c0788c), C0807a.m2874a(jSONObject.optJSONObject("o"), c0788c));
                }
            } else if (optString.equals("a")) {
                obj = null;
                switch (obj) {
                    case null:
                        maskMode = MaskMode.MaskModeAdd;
                        break;
                    case 1:
                        maskMode = MaskMode.MaskModeSubtract;
                        break;
                    case 2:
                        maskMode = MaskMode.MaskModeIntersect;
                        break;
                    default:
                        maskMode = MaskMode.MaskModeUnknown;
                        break;
                }
                return new Mask(maskMode, C0813a.m2878a(jSONObject.optJSONObject("pt"), c0788c), C0807a.m2874a(jSONObject.optJSONObject("o"), c0788c));
            }
            obj = -1;
            switch (obj) {
                case null:
                    maskMode = MaskMode.MaskModeAdd;
                    break;
                case 1:
                    maskMode = MaskMode.MaskModeSubtract;
                    break;
                case 2:
                    maskMode = MaskMode.MaskModeIntersect;
                    break;
                default:
                    maskMode = MaskMode.MaskModeUnknown;
                    break;
            }
            return new Mask(maskMode, C0813a.m2878a(jSONObject.optJSONObject("pt"), c0788c), C0807a.m2874a(jSONObject.optJSONObject("o"), c0788c));
        }
    }

    private Mask(MaskMode maskMode, C4073h c4073h, C4070d c4070d) {
        this.f2195a = maskMode;
        this.f2196b = c4073h;
        this.f2197c = c4070d;
    }

    /* renamed from: a */
    public MaskMode m2896a() {
        return this.f2195a;
    }

    /* renamed from: b */
    public C4073h m2897b() {
        return this.f2196b;
    }

    /* renamed from: c */
    public C4070d m2898c() {
        return this.f2197c;
    }
}
