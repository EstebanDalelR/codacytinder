package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C4077a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.n */
public class C2966n implements Content, AnimationListener {
    /* renamed from: a */
    private String f9202a;
    /* renamed from: b */
    private final List<AnimationListener> f9203b = new ArrayList();
    /* renamed from: c */
    private final Type f9204c;
    /* renamed from: d */
    private final BaseKeyframeAnimation<?, Float> f9205d;
    /* renamed from: e */
    private final BaseKeyframeAnimation<?, Float> f9206e;
    /* renamed from: f */
    private final BaseKeyframeAnimation<?, Float> f9207f;

    public void setContents(List<Content> list, List<Content> list2) {
    }

    public C2966n(C4077a c4077a, ShapeTrimPath shapeTrimPath) {
        this.f9202a = shapeTrimPath.m11537a();
        this.f9204c = shapeTrimPath.m11538b();
        this.f9205d = shapeTrimPath.m11540d().createAnimation();
        this.f9206e = shapeTrimPath.m11539c().createAnimation();
        this.f9207f = shapeTrimPath.m11541e().createAnimation();
        c4077a.m15914a(this.f9205d);
        c4077a.m15914a(this.f9206e);
        c4077a.m15914a(this.f9207f);
        this.f9205d.mo1165a((AnimationListener) this);
        this.f9206e.mo1165a((AnimationListener) this);
        this.f9207f.mo1165a((AnimationListener) this);
    }

    public void onValueChanged() {
        for (int i = 0; i < this.f9203b.size(); i++) {
            ((AnimationListener) this.f9203b.get(i)).onValueChanged();
        }
    }

    public String getName() {
        return this.f9202a;
    }

    /* renamed from: a */
    void m11475a(AnimationListener animationListener) {
        this.f9203b.add(animationListener);
    }

    /* renamed from: a */
    Type m11474a() {
        return this.f9204c;
    }

    /* renamed from: b */
    public BaseKeyframeAnimation<?, Float> m11476b() {
        return this.f9205d;
    }

    /* renamed from: c */
    public BaseKeyframeAnimation<?, Float> m11477c() {
        return this.f9206e;
    }

    /* renamed from: d */
    public BaseKeyframeAnimation<?, Float> m11478d() {
        return this.f9207f;
    }
}
