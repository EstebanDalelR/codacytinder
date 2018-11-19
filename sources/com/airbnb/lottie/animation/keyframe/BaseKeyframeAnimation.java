package com.airbnb.lottie.animation.keyframe;

import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import com.airbnb.lottie.animation.C0768a;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseKeyframeAnimation<K, A> {
    /* renamed from: a */
    final List<AnimationListener> f2101a = new ArrayList();
    /* renamed from: b */
    private boolean f2102b = false;
    /* renamed from: c */
    private final List<? extends C0768a<K>> f2103c;
    /* renamed from: d */
    private float f2104d = 0.0f;
    @Nullable
    /* renamed from: e */
    private C0768a<K> f2105e;

    public interface AnimationListener {
        void onValueChanged();
    }

    /* renamed from: a */
    abstract A mo1161a(C0768a<K> c0768a, float f);

    BaseKeyframeAnimation(List<? extends C0768a<K>> list) {
        this.f2103c = list;
    }

    /* renamed from: a */
    public void m2720a() {
        this.f2102b = true;
    }

    /* renamed from: a */
    public void mo1165a(AnimationListener animationListener) {
        this.f2101a.add(animationListener);
    }

    /* renamed from: a */
    public void mo1162a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (f < m2717f()) {
            f = 0.0f;
        } else if (f > m2718g()) {
            f = 1.0f;
        }
        if (f != this.f2104d) {
            this.f2104d = f;
            for (int i = 0; i < this.f2101a.size(); i++) {
                ((AnimationListener) this.f2101a.get(i)).onValueChanged();
            }
        }
    }

    /* renamed from: d */
    private C0768a<K> mo1164d() {
        if (this.f2103c.isEmpty()) {
            throw new IllegalStateException("There are no keyframes");
        } else if (this.f2105e != null && this.f2105e.m2710a(this.f2104d)) {
            return this.f2105e;
        } else {
            int i = 0;
            C0768a<K> c0768a = (C0768a) this.f2103c.get(0);
            if (this.f2104d < c0768a.m2709a()) {
                this.f2105e = c0768a;
                return c0768a;
            }
            while (!c0768a.m2710a(this.f2104d) && i < this.f2103c.size()) {
                c0768a = (C0768a) this.f2103c.get(i);
                i++;
            }
            this.f2105e = c0768a;
            return c0768a;
        }
    }

    /* renamed from: e */
    private float m2716e() {
        if (this.f2102b) {
            return 0.0f;
        }
        C0768a d = mo1164d();
        if (d.m2712c()) {
            return 0.0f;
        }
        return d.f2091c.getInterpolation((this.f2104d - d.m2709a()) / (d.m2711b() - d.m2709a()));
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    /* renamed from: f */
    private float m2717f() {
        return this.f2103c.isEmpty() ? 0.0f : ((C0768a) this.f2103c.get(0)).m2709a();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    /* renamed from: g */
    private float m2718g() {
        return this.f2103c.isEmpty() ? 1.0f : ((C0768a) this.f2103c.get(this.f2103c.size() - 1)).m2711b();
    }

    /* renamed from: b */
    public A mo1163b() {
        return mo1161a(mo1164d(), m2716e());
    }

    /* renamed from: c */
    public float m2724c() {
        return this.f2104d;
    }
}
