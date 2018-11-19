package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.content.C2986a;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C4077a;
import com.airbnb.lottie.p017b.C0784f;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.c */
public class C4051c implements C2965h, AnimationListener {
    /* renamed from: a */
    private final Path f12845a = new Path();
    /* renamed from: b */
    private final String f12846b;
    /* renamed from: c */
    private final C0792d f12847c;
    /* renamed from: d */
    private final BaseKeyframeAnimation<?, PointF> f12848d;
    /* renamed from: e */
    private final BaseKeyframeAnimation<?, PointF> f12849e;
    @Nullable
    /* renamed from: f */
    private C2966n f12850f;
    /* renamed from: g */
    private boolean f12851g;

    public C4051c(C0792d c0792d, C4077a c4077a, C2986a c2986a) {
        this.f12846b = c2986a.m11542a();
        this.f12847c = c0792d;
        this.f12848d = c2986a.m11544c().createAnimation();
        this.f12849e = c2986a.m11543b().createAnimation();
        c4077a.m15914a(this.f12848d);
        c4077a.m15914a(this.f12849e);
        this.f12848d.mo1165a((AnimationListener) this);
        this.f12849e.mo1165a((AnimationListener) this);
    }

    public void onValueChanged() {
        m15856a();
    }

    /* renamed from: a */
    private void m15856a() {
        this.f12851g = false;
        this.f12847c.invalidateSelf();
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (list2 = null; list2 < list.size(); list2++) {
            Content content = (Content) list.get(list2);
            if (content instanceof C2966n) {
                C2966n c2966n = (C2966n) content;
                if (c2966n.m11474a() == Type.Simultaneously) {
                    this.f12850f = c2966n;
                    this.f12850f.m11475a(this);
                }
            }
        }
    }

    public String getName() {
        return this.f12846b;
    }

    /* renamed from: c */
    public Path mo3174c() {
        if (this.f12851g) {
            return r0.f12845a;
        }
        r0.f12845a.reset();
        PointF pointF = (PointF) r0.f12848d.mo1163b();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        r0.f12845a.reset();
        float f5 = -f2;
        r0.f12845a.moveTo(0.0f, f5);
        float f6 = f3 + 0.0f;
        float f7 = 0.0f - f4;
        r0.f12845a.cubicTo(f6, f5, f, f7, f, 0.0f);
        f4 += 0.0f;
        r0.f12845a.cubicTo(f, f4, f6, f2, 0.0f, f2);
        f3 = 0.0f - f3;
        f6 = -f;
        r0.f12845a.cubicTo(f3, f2, f6, f4, f6, 0.0f);
        f2 = f5;
        r0.f12845a.cubicTo(f6, f7, f3, f2, 0.0f, f2);
        pointF = (PointF) r0.f12849e.mo1163b();
        r0.f12845a.offset(pointF.x, pointF.y);
        r0.f12845a.close();
        C0784f.m2772a(r0.f12845a, r0.f12850f);
        r0.f12851g = true;
        return r0.f12845a;
    }
}
