package com.airbnb.lottie;

import android.support.v4.util.C0546b;
import android.support.v4.util.C0559j;
import com.airbnb.lottie.p017b.C0782d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PerformanceTracker {
    /* renamed from: a */
    private boolean f2072a = false;
    /* renamed from: b */
    private final Set<FrameListener> f2073b = new C0546b();
    /* renamed from: c */
    private Map<String, C0782d> f2074c = new HashMap();
    /* renamed from: d */
    private final Comparator<C0559j<String, Float>> f2075d = new C07631(this);

    /* renamed from: com.airbnb.lottie.PerformanceTracker$1 */
    class C07631 implements Comparator<C0559j<String, Float>> {
        /* renamed from: a */
        final /* synthetic */ PerformanceTracker f2071a;

        C07631(PerformanceTracker performanceTracker) {
            this.f2071a = performanceTracker;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m2689a((C0559j) obj, (C0559j) obj2);
        }

        /* renamed from: a */
        public int m2689a(C0559j<String, Float> c0559j, C0559j<String, Float> c0559j2) {
            c0559j = ((Float) c0559j.f1725b).floatValue();
            c0559j2 = ((Float) c0559j2.f1725b).floatValue();
            if (c0559j2 > c0559j) {
                return 1;
            }
            return c0559j > c0559j2 ? -1 : null;
        }
    }

    public interface FrameListener {
        void onFrameRendered(float f);
    }

    /* renamed from: a */
    void m2691a(boolean z) {
        this.f2072a = z;
    }

    /* renamed from: a */
    public void m2690a(String str, float f) {
        if (this.f2072a) {
            C0782d c0782d = (C0782d) this.f2074c.get(str);
            if (c0782d == null) {
                c0782d = new C0782d();
                this.f2074c.put(str, c0782d);
            }
            c0782d.m2757a(f);
            if (str.equals("root") != null) {
                for (FrameListener onFrameRendered : this.f2073b) {
                    onFrameRendered.onFrameRendered(f);
                }
            }
        }
    }
}
