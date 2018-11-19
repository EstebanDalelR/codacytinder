package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C0776o;
import com.airbnb.lottie.model.animatable.C2983l;
import com.airbnb.lottie.model.content.C2993i;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.C4077a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.b */
public class C4050b implements DrawingContent, C2965h, AnimationListener {
    /* renamed from: a */
    private final Matrix f12837a;
    /* renamed from: b */
    private final Path f12838b;
    /* renamed from: c */
    private final RectF f12839c;
    /* renamed from: d */
    private final String f12840d;
    /* renamed from: e */
    private final List<Content> f12841e;
    /* renamed from: f */
    private final C0792d f12842f;
    @Nullable
    /* renamed from: g */
    private List<C2965h> f12843g;
    @Nullable
    /* renamed from: h */
    private C0776o f12844h;

    /* renamed from: a */
    private static List<Content> m15852a(C0792d c0792d, C4077a c4077a, List<ContentModel> list) {
        List<Content> arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            Content toContent = ((ContentModel) list.get(i)).toContent(c0792d, c4077a);
            if (toContent != null) {
                arrayList.add(toContent);
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: a */
    static C2983l m15851a(List<ContentModel> list) {
        for (int i = 0; i < list.size(); i++) {
            ContentModel contentModel = (ContentModel) list.get(i);
            if (contentModel instanceof C2983l) {
                return (C2983l) contentModel;
            }
        }
        return null;
    }

    public C4050b(C0792d c0792d, C4077a c4077a, C2993i c2993i) {
        this(c0792d, c4077a, c2993i.m11578a(), C4050b.m15852a(c0792d, c4077a, c2993i.m11579b()), C4050b.m15851a(c2993i.m11579b()));
    }

    C4050b(C0792d c0792d, C4077a c4077a, String str, List<Content> list, @Nullable C2983l c2983l) {
        this.f12837a = new Matrix();
        this.f12838b = new Path();
        this.f12839c = new RectF();
        this.f12840d = str;
        this.f12842f = c0792d;
        this.f12841e = list;
        if (c2983l != null) {
            this.f12844h = c2983l.m11515h();
            this.f12844h.m2732a(c4077a);
            this.f12844h.m2731a((AnimationListener) this);
        }
        c0792d = new ArrayList();
        for (c4077a = list.size() - 1; c4077a >= null; c4077a--) {
            Content content = (Content) list.get(c4077a);
            if ((content instanceof GreedyContent) != null) {
                c0792d.add((GreedyContent) content);
            }
        }
        for (c4077a = c0792d.size() - 1; c4077a >= null; c4077a--) {
            ((GreedyContent) c0792d.get(c4077a)).absorbContent(list.listIterator(list.size()));
        }
    }

    public void onValueChanged() {
        this.f12842f.invalidateSelf();
    }

    public String getName() {
        return this.f12840d;
    }

    public void addColorFilter(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
        for (int i = 0; i < this.f12841e.size(); i++) {
            Content content = (Content) this.f12841e.get(i);
            if (content instanceof DrawingContent) {
                DrawingContent drawingContent = (DrawingContent) content;
                if (str2 != null) {
                    if (!str2.equals(content.getName())) {
                        drawingContent.addColorFilter(str, str2, colorFilter);
                    }
                }
                drawingContent.addColorFilter(str, null, colorFilter);
            }
        }
    }

    public void setContents(List<Content> list, List<Content> list2) {
        list2 = new ArrayList(list.size() + this.f12841e.size());
        list2.addAll(list);
        for (list = this.f12841e.size() - 1; list >= null; list--) {
            Content content = (Content) this.f12841e.get(list);
            content.setContents(list2, this.f12841e.subList(0, list));
            list2.add(content);
        }
    }

    /* renamed from: a */
    List<C2965h> m15853a() {
        if (this.f12843g == null) {
            this.f12843g = new ArrayList();
            for (int i = 0; i < this.f12841e.size(); i++) {
                Content content = (Content) this.f12841e.get(i);
                if (content instanceof C2965h) {
                    this.f12843g.add((C2965h) content);
                }
            }
        }
        return this.f12843g;
    }

    /* renamed from: b */
    Matrix m15854b() {
        if (this.f12844h != null) {
            return this.f12844h.m2735d();
        }
        this.f12837a.reset();
        return this.f12837a;
    }

    /* renamed from: c */
    public Path mo3174c() {
        this.f12837a.reset();
        if (this.f12844h != null) {
            this.f12837a.set(this.f12844h.m2735d());
        }
        this.f12838b.reset();
        for (int size = this.f12841e.size() - 1; size >= 0; size--) {
            Content content = (Content) this.f12841e.get(size);
            if (content instanceof C2965h) {
                this.f12838b.addPath(((C2965h) content).mo3174c(), this.f12837a);
            }
        }
        return this.f12838b;
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        this.f12837a.set(matrix);
        if (this.f12844h != null) {
            this.f12837a.preConcat(this.f12844h.m2735d());
            i = (int) ((((((float) ((Integer) this.f12844h.m2730a().mo1163b()).intValue()) / 100.0f) * ((float) i)) / 1132396544) * 1132396544);
        }
        for (matrix = this.f12841e.size() - 1; matrix >= null; matrix--) {
            Object obj = this.f12841e.get(matrix);
            if (obj instanceof DrawingContent) {
                ((DrawingContent) obj).draw(canvas, this.f12837a, i);
            }
        }
    }

    public void getBounds(RectF rectF, Matrix matrix) {
        this.f12837a.set(matrix);
        if (this.f12844h != null) {
            this.f12837a.preConcat(this.f12844h.m2735d());
        }
        this.f12839c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (matrix = this.f12841e.size() - 1; matrix >= null; matrix--) {
            Content content = (Content) this.f12841e.get(matrix);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).getBounds(this.f12839c, this.f12837a);
                if (rectF.isEmpty()) {
                    rectF.set(this.f12839c);
                } else {
                    rectF.set(Math.min(rectF.left, this.f12839c.left), Math.min(rectF.top, this.f12839c.top), Math.max(rectF.right, this.f12839c.right), Math.max(rectF.bottom, this.f12839c.bottom));
                }
            }
        }
    }
}
