package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.util.C0550f;
import android.support.v4.util.C0563n;
import android.util.Log;
import com.airbnb.lottie.C0795e.C0794a;
import com.airbnb.lottie.model.C0852f;
import com.airbnb.lottie.model.C0852f.C0851a;
import com.airbnb.lottie.model.C0854g;
import com.airbnb.lottie.model.C0854g.C0853a;
import com.airbnb.lottie.model.C4075e;
import com.airbnb.lottie.model.C4076h;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.Layer.C0858a;
import com.airbnb.lottie.model.layer.Layer.LayerType;
import com.airbnb.lottie.p017b.C0784f;
import com.leanplum.BuildConfig;
import com.tinder.api.ManagerWebServices;
import java.io.Closeable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.c */
public class C0788c {
    /* renamed from: a */
    private final Map<String, List<Layer>> f2137a;
    /* renamed from: b */
    private final Map<String, C0795e> f2138b;
    /* renamed from: c */
    private final Map<String, C0852f> f2139c;
    /* renamed from: d */
    private final C0563n<C0854g> f2140d;
    /* renamed from: e */
    private final C0550f<Layer> f2141e;
    /* renamed from: f */
    private final List<Layer> f2142f;
    /* renamed from: g */
    private final HashSet<String> f2143g;
    /* renamed from: h */
    private final PerformanceTracker f2144h;
    /* renamed from: i */
    private final Rect f2145i;
    /* renamed from: j */
    private final long f2146j;
    /* renamed from: k */
    private final long f2147k;
    /* renamed from: l */
    private final float f2148l;
    /* renamed from: m */
    private final float f2149m;
    /* renamed from: n */
    private final int f2150n;
    /* renamed from: o */
    private final int f2151o;
    /* renamed from: p */
    private final int f2152p;

    /* renamed from: com.airbnb.lottie.c$a */
    public static class C0787a {
        /* renamed from: a */
        public static Cancellable m2778a(Context context, String str, OnCompositionLoadedListener onCompositionLoadedListener) {
            try {
                return C0787a.m2777a(context, context.getAssets().open(str), onCompositionLoadedListener);
            } catch (Context context2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to find file ");
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString(), context2);
            }
        }

        /* renamed from: a */
        public static Cancellable m2777a(Context context, InputStream inputStream, OnCompositionLoadedListener onCompositionLoadedListener) {
            Cancellable c4075e = new C4075e(context.getResources(), onCompositionLoadedListener);
            c4075e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new InputStream[]{inputStream});
            return c4075e;
        }

        /* renamed from: a */
        public static C0788c m2780a(Context context, String str) {
            try {
                return C0787a.m2781a(context.getResources(), context.getAssets().open(str));
            } catch (Context context2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to find file ");
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString(), context2);
            }
        }

        /* renamed from: a */
        public static Cancellable m2779a(Resources resources, JSONObject jSONObject, OnCompositionLoadedListener onCompositionLoadedListener) {
            Cancellable c4076h = new C4076h(resources, onCompositionLoadedListener);
            c4076h.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new JSONObject[]{jSONObject});
            return c4076h;
        }

        @Nullable
        /* renamed from: a */
        public static C0788c m2781a(Resources resources, InputStream inputStream) {
            try {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                resources = C0787a.m2782a(resources, new JSONObject(new String(bArr, "UTF-8")));
                C0784f.m2773a((Closeable) inputStream);
                return resources;
            } catch (Resources resources2) {
                Log.e("LOTTIE", "Failed to load composition.", new IllegalStateException("Unable to find file.", resources2));
            } catch (Resources resources22) {
                Log.e("LOTTIE", "Failed to load composition.", new IllegalStateException("Unable to load JSON.", resources22));
            } catch (Throwable th) {
                C0784f.m2773a((Closeable) inputStream);
            }
            C0784f.m2773a((Closeable) inputStream);
            return null;
        }

        /* renamed from: a */
        public static C0788c m2782a(Resources resources, JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            float f = resources.getDisplayMetrics().density;
            int optInt = jSONObject2.optInt("w", -1);
            int optInt2 = jSONObject2.optInt("h", -1);
            Rect rect = (optInt == -1 || optInt2 == -1) ? null : new Rect(0, 0, (int) (((float) optInt) * f), (int) (((float) optInt2) * f));
            long optLong = jSONObject2.optLong("ip", 0);
            long optLong2 = jSONObject2.optLong("op", 0);
            float optDouble = (float) jSONObject2.optDouble("fr", 0.0d);
            String[] split = jSONObject2.optString("v").split("[.]");
            C0788c c0788c = new C0788c(rect, optLong, optLong2, optDouble, f, Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
            JSONArray optJSONArray = jSONObject2.optJSONArray(ManagerWebServices.PARAM_KEY_ASSETS);
            C0787a.m2786b(optJSONArray, c0788c);
            C0787a.m2784a(optJSONArray, c0788c);
            C0787a.m2787b(jSONObject2.optJSONObject("fonts"), c0788c);
            C0787a.m2788c(jSONObject2.optJSONArray("chars"), c0788c);
            C0787a.m2785a(jSONObject2, c0788c);
            return c0788c;
        }

        /* renamed from: a */
        private static void m2785a(JSONObject jSONObject, C0788c c0788c) {
            jSONObject = jSONObject.optJSONArray("layers");
            if (jSONObject != null) {
                int length = jSONObject.length();
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    Layer a = C0858a.m2935a(jSONObject.optJSONObject(i2), c0788c);
                    if (a.m2947k() == LayerType.Image) {
                        i++;
                    }
                    C0787a.m2783a(c0788c.f2142f, c0788c.f2141e, a);
                }
                if (i > 4) {
                    jSONObject = new StringBuilder();
                    jSONObject.append("You have ");
                    jSONObject.append(i);
                    jSONObject.append(" images. Lottie should primarily be ");
                    jSONObject.append("used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers");
                    jSONObject.append(" to shape layers.");
                    c0788c.m2797a(jSONObject.toString());
                }
            }
        }

        /* renamed from: a */
        private static void m2784a(@Nullable JSONArray jSONArray, C0788c c0788c) {
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("layers");
                    if (optJSONArray != null) {
                        List arrayList = new ArrayList(optJSONArray.length());
                        C0550f c0550f = new C0550f();
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            Layer a = C0858a.m2935a(optJSONArray.optJSONObject(i2), c0788c);
                            c0550f.m2032b(a.m2941e(), a);
                            arrayList.add(a);
                        }
                        c0788c.f2137a.put(optJSONObject.optString("id"), arrayList);
                    }
                }
            }
        }

        /* renamed from: b */
        private static void m2786b(@Nullable JSONArray jSONArray, C0788c c0788c) {
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject.has(BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER)) {
                        C0795e a = C0794a.m2863a(optJSONObject);
                        c0788c.f2138b.put(a.m2864a(), a);
                    }
                }
            }
        }

        /* renamed from: b */
        private static void m2787b(@Nullable JSONObject jSONObject, C0788c c0788c) {
            if (jSONObject != null) {
                jSONObject = jSONObject.optJSONArray("list");
                if (jSONObject != null) {
                    int length = jSONObject.length();
                    for (int i = 0; i < length; i++) {
                        C0852f a = C0851a.m2922a(jSONObject.optJSONObject(i));
                        c0788c.f2139c.put(a.m2924b(), a);
                    }
                }
            }
        }

        /* renamed from: c */
        private static void m2788c(@Nullable JSONArray jSONArray, C0788c c0788c) {
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    C0854g a = C0853a.m2926a(jSONArray.optJSONObject(i), c0788c);
                    c0788c.f2140d.m2084b(a.hashCode(), a);
                }
            }
        }

        /* renamed from: a */
        private static void m2783a(List<Layer> list, C0550f<Layer> c0550f, Layer layer) {
            list.add(layer);
            c0550f.m2032b(layer.m2941e(), layer);
        }
    }

    private C0788c(Rect rect, long j, long j2, float f, float f2, int i, int i2, int i3) {
        this.f2137a = new HashMap();
        this.f2138b = new HashMap();
        this.f2139c = new HashMap();
        this.f2140d = new C0563n();
        this.f2141e = new C0550f();
        this.f2142f = new ArrayList();
        this.f2143g = new HashSet();
        this.f2144h = new PerformanceTracker();
        this.f2145i = rect;
        this.f2146j = j;
        this.f2147k = j2;
        this.f2148l = f;
        this.f2149m = f2;
        this.f2150n = i;
        this.f2151o = i2;
        this.f2152p = i3;
        if (C0784f.m2774a(this, 4, 5, 0) == null) {
            m2797a("Lottie only supports bodymovin >= 4.5.0");
        }
    }

    @RestrictTo({Scope.LIBRARY})
    /* renamed from: a */
    public void m2797a(String str) {
        Log.w("LOTTIE", str);
        this.f2143g.add(str);
    }

    /* renamed from: a */
    public void m2798a(boolean z) {
        this.f2144h.m2691a(z);
    }

    /* renamed from: a */
    public PerformanceTracker m2795a() {
        return this.f2144h;
    }

    @RestrictTo({Scope.LIBRARY})
    /* renamed from: a */
    public Layer m2796a(long j) {
        return (Layer) this.f2141e.m2025a(j);
    }

    /* renamed from: b */
    public Rect m2799b() {
        return this.f2145i;
    }

    /* renamed from: c */
    public long m2801c() {
        return (long) ((((float) (this.f2147k - this.f2146j)) / this.f2148l) * 1000.0f);
    }

    @RestrictTo({Scope.LIBRARY})
    /* renamed from: d */
    public int m2802d() {
        return this.f2150n;
    }

    @RestrictTo({Scope.LIBRARY})
    /* renamed from: e */
    public int m2803e() {
        return this.f2151o;
    }

    @RestrictTo({Scope.LIBRARY})
    /* renamed from: f */
    public int m2804f() {
        return this.f2152p;
    }

    @RestrictTo({Scope.LIBRARY})
    /* renamed from: g */
    public long m2805g() {
        return this.f2146j;
    }

    @RestrictTo({Scope.LIBRARY})
    /* renamed from: h */
    public long m2806h() {
        return this.f2147k;
    }

    /* renamed from: i */
    public List<Layer> m2807i() {
        return this.f2142f;
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    /* renamed from: b */
    public List<Layer> m2800b(String str) {
        return (List) this.f2137a.get(str);
    }

    /* renamed from: j */
    public C0563n<C0854g> m2808j() {
        return this.f2140d;
    }

    /* renamed from: k */
    public Map<String, C0852f> m2809k() {
        return this.f2139c;
    }

    /* renamed from: l */
    Map<String, C0795e> m2810l() {
        return this.f2138b;
    }

    /* renamed from: m */
    public float m2811m() {
        return (((float) m2801c()) * this.f2148l) / 1000.0f;
    }

    /* renamed from: n */
    public float m2812n() {
        return this.f2149m;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LottieComposition:\n");
        for (Layer a : this.f2142f) {
            stringBuilder.append(a.m2937a("\t"));
        }
        return stringBuilder.toString();
    }
}
