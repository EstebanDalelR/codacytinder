package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.model.content.C0843g;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.f */
public class C0773f {
    /* renamed from: a */
    private final List<BaseKeyframeAnimation<C0843g, Path>> f2106a;
    /* renamed from: b */
    private final List<BaseKeyframeAnimation<Integer, Integer>> f2107b;
    /* renamed from: c */
    private final List<Mask> f2108c;

    public C0773f(List<Mask> list) {
        this.f2108c = list;
        this.f2106a = new ArrayList(list.size());
        this.f2107b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f2106a.add(((Mask) list.get(i)).m2897b().createAnimation());
            this.f2107b.add(((Mask) list.get(i)).m2898c().createAnimation());
        }
    }

    /* renamed from: a */
    public List<Mask> m2725a() {
        return this.f2108c;
    }

    /* renamed from: b */
    public List<BaseKeyframeAnimation<C0843g, Path>> m2726b() {
        return this.f2106a;
    }

    /* renamed from: c */
    public List<BaseKeyframeAnimation<Integer, Integer>> m2727c() {
        return this.f2107b;
    }
}
