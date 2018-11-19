package com.airbnb.lottie.model.animatable;

import android.graphics.Color;
import android.support.annotation.IntRange;
import android.util.Log;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C2971m;
import com.airbnb.lottie.animation.keyframe.C4061c;
import com.airbnb.lottie.model.animatable.AnimatableValue.Factory;
import com.airbnb.lottie.model.content.C0834b;
import com.airbnb.lottie.p017b.C0783e;
import com.leanplum.BuildConfig;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.animatable.c */
public class C4069c extends C2984n<C0834b, C0834b> {

    /* renamed from: com.airbnb.lottie.model.animatable.c$a */
    public static final class C0805a {
        /* renamed from: a */
        public static C4069c m2872a(JSONObject jSONObject, C0788c c0788c) {
            jSONObject = C0820m.m2884a(jSONObject, 1.0f, c0788c, new C2977b(jSONObject.optInt(BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER, jSONObject.optJSONArray("k").length() / 4))).m2888a();
            return new C4069c(jSONObject.f2186a, (C0834b) jSONObject.f2187b);
        }
    }

    /* renamed from: com.airbnb.lottie.model.animatable.c$b */
    private static class C2977b implements Factory<C0834b> {
        /* renamed from: a */
        private final int f9223a;

        public /* synthetic */ Object valueFromObject(Object obj, float f) {
            return m11499a(obj, f);
        }

        private C2977b(int i) {
            this.f9223a = i;
        }

        /* renamed from: a */
        public C0834b m11499a(Object obj, float f) {
            JSONArray jSONArray = (JSONArray) obj;
            f = new float[this.f9223a];
            int[] iArr = new int[this.f9223a];
            C0834b c0834b = new C0834b(f, iArr);
            if (jSONArray.length() != this.f9223a * 4) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected gradient length: ");
                stringBuilder.append(jSONArray.length());
                stringBuilder.append(". Expected ");
                stringBuilder.append(this.f9223a * 4);
                stringBuilder.append(". This may affect the appearance of the gradient. ");
                stringBuilder.append("Make sure to save your After Effects file before exporting an animation with ");
                stringBuilder.append("gradients.");
                Log.w("LOTTIE", stringBuilder.toString());
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f9223a * 4; i3++) {
                int i4 = i3 / 4;
                double optDouble = jSONArray.optDouble(i3);
                switch (i3 % 4) {
                    case 0:
                        f[i4] = (float) optDouble;
                        break;
                    case 1:
                        i = (int) (optDouble * 255.0d);
                        break;
                    case 2:
                        i2 = (int) (optDouble * 255.0d);
                        break;
                    case 3:
                        iArr[i4] = Color.argb(255, i, i2, (int) (optDouble * 255.0d));
                        break;
                    default:
                        break;
                }
            }
            m11498a(c0834b, jSONArray);
            return c0834b;
        }

        /* renamed from: a */
        private void m11498a(C0834b c0834b, JSONArray jSONArray) {
            int i = this.f9223a * 4;
            if (jSONArray.length() > i) {
                int length = (jSONArray.length() - i) / 2;
                double[] dArr = new double[length];
                double[] dArr2 = new double[length];
                int i2 = 0;
                while (i < jSONArray.length()) {
                    if (i % 2 == 0) {
                        dArr[i2] = jSONArray.optDouble(i);
                    } else {
                        dArr2[i2] = jSONArray.optDouble(i);
                        i2++;
                    }
                    i++;
                }
                for (int i3 = 0; i3 < c0834b.m2907c(); i3++) {
                    jSONArray = c0834b.m2906b()[i3];
                    c0834b.m2906b()[i3] = Color.argb(m11497a((double) c0834b.m2905a()[i3], dArr, dArr2), Color.red(jSONArray), Color.green(jSONArray), Color.blue(jSONArray));
                }
            }
        }

        @IntRange(from = 0, to = 255)
        /* renamed from: a */
        private int m11497a(double d, double[] dArr, double[] dArr2) {
            double[] dArr3 = dArr;
            double[] dArr4 = dArr2;
            for (int i = 1; i < dArr3.length; i++) {
                int i2 = i - 1;
                double d2 = dArr3[i2];
                double d3 = dArr3[i];
                if (dArr3[i] >= d) {
                    return (int) (C0783e.m2758a(dArr4[i2], dArr4[i], (d - d2) / (d3 - d2)) * 255.0d);
                }
            }
            return (int) (dArr4[dArr4.length - 1] * 255.0d);
        }
    }

    private C4069c(List<C0768a<C0834b>> list, C0834b c0834b) {
        super(list, c0834b);
    }

    public BaseKeyframeAnimation<C0834b, C0834b> createAnimation() {
        if (hasAnimation()) {
            return new C4061c(this.a);
        }
        return new C2971m(this.b);
    }
}
