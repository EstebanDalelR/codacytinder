package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0785b;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.content.C2992h;
import com.airbnb.lottie.model.layer.C4077a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.d */
public class C4052d implements DrawingContent, AnimationListener {
    /* renamed from: a */
    private final Path f12852a = new Path();
    /* renamed from: b */
    private final Paint f12853b = new Paint(1);
    /* renamed from: c */
    private final String f12854c;
    /* renamed from: d */
    private final List<C2965h> f12855d = new ArrayList();
    /* renamed from: e */
    private final BaseKeyframeAnimation<Integer, Integer> f12856e;
    /* renamed from: f */
    private final BaseKeyframeAnimation<Integer, Integer> f12857f;
    /* renamed from: g */
    private final C0792d f12858g;

    public C4052d(C0792d c0792d, C4077a c4077a, C2992h c2992h) {
        this.f12854c = c2992h.m11573a();
        this.f12858g = c0792d;
        if (c2992h.m11574b() != null) {
            if (c2992h.m11575c() != null) {
                this.f12852a.setFillType(c2992h.m11576d());
                this.f12856e = c2992h.m11574b().createAnimation();
                this.f12856e.mo1165a((AnimationListener) this);
                c4077a.m15914a(this.f12856e);
                this.f12857f = c2992h.m11575c().createAnimation();
                this.f12857f.mo1165a((AnimationListener) this);
                c4077a.m15914a(this.f12857f);
                return;
            }
        }
        this.f12856e = null;
        this.f12857f = null;
    }

    public void onValueChanged() {
        this.f12858g.invalidateSelf();
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (list = null; list < list2.size(); list++) {
            Content content = (Content) list2.get(list);
            if (content instanceof C2965h) {
                this.f12855d.add((C2965h) content);
            }
        }
    }

    public String getName() {
        return this.f12854c;
    }

    public void addColorFilter(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
        this.f12853b.setColorFilter(colorFilter);
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        C0785b.m2775a("FillContent#draw");
        this.f12853b.setColor(((Integer) this.f12856e.mo1163b()).intValue());
        this.f12853b.setAlpha((int) ((((((float) i) / 1132396544) * ((float) ((Integer) this.f12857f.mo1163b()).intValue())) / 1120403456) * 1132396544));
        this.f12852a.reset();
        for (i = 0; i < this.f12855d.size(); i++) {
            this.f12852a.addPath(((C2965h) this.f12855d.get(i)).mo3174c(), matrix);
        }
        canvas.drawPath(this.f12852a, this.f12853b);
        C0785b.m2776b("FillContent#draw");
    }

    public void getBounds(RectF rectF, Matrix matrix) {
        this.f12852a.reset();
        for (int i = 0; i < this.f12855d.size(); i++) {
            this.f12852a.addPath(((C2965h) this.f12855d.get(i)).mo3174c(), matrix);
        }
        this.f12852a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1065353216, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
