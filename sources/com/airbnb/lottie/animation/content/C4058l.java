package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.Path.FillType;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.content.C2994j;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C4077a;
import com.airbnb.lottie.p017b.C0784f;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.l */
public class C4058l implements C2965h, AnimationListener {
    /* renamed from: a */
    private final Path f12911a = new Path();
    /* renamed from: b */
    private final String f12912b;
    /* renamed from: c */
    private final C0792d f12913c;
    /* renamed from: d */
    private final BaseKeyframeAnimation<?, Path> f12914d;
    /* renamed from: e */
    private boolean f12915e;
    @Nullable
    /* renamed from: f */
    private C2966n f12916f;

    public C4058l(C0792d c0792d, C4077a c4077a, C2994j c2994j) {
        this.f12912b = c2994j.m11580a();
        this.f12913c = c0792d;
        this.f12914d = c2994j.m11581b().createAnimation();
        c4077a.m15914a(this.f12914d);
        this.f12914d.mo1165a((AnimationListener) this);
    }

    public void onValueChanged() {
        m15871a();
    }

    /* renamed from: a */
    private void m15871a() {
        this.f12915e = false;
        this.f12913c.invalidateSelf();
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (list2 = null; list2 < list.size(); list2++) {
            Content content = (Content) list.get(list2);
            if (content instanceof C2966n) {
                C2966n c2966n = (C2966n) content;
                if (c2966n.m11474a() == Type.Simultaneously) {
                    this.f12916f = c2966n;
                    this.f12916f.m11475a(this);
                }
            }
        }
    }

    /* renamed from: c */
    public Path mo3174c() {
        if (this.f12915e) {
            return this.f12911a;
        }
        this.f12911a.reset();
        this.f12911a.set((Path) this.f12914d.mo1163b());
        this.f12911a.setFillType(FillType.EVEN_ODD);
        C0784f.m2772a(this.f12911a, this.f12916f);
        this.f12915e = true;
        return this.f12911a;
    }

    public String getName() {
        return this.f12912b;
    }
}
