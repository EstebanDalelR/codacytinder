package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.graphics.Path.Op;
import android.os.Build.VERSION;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* renamed from: com.airbnb.lottie.animation.content.g */
public class C4054g implements GreedyContent, C2965h {
    /* renamed from: a */
    private final Path f12874a = new Path();
    /* renamed from: b */
    private final Path f12875b = new Path();
    /* renamed from: c */
    private final Path f12876c = new Path();
    /* renamed from: d */
    private final String f12877d;
    /* renamed from: e */
    private final List<C2965h> f12878e = new ArrayList();
    /* renamed from: f */
    private final MergePaths f12879f;

    public C4054g(MergePaths mergePaths) {
        if (VERSION.SDK_INT < 19) {
            throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
        }
        this.f12877d = mergePaths.m11518a();
        this.f12879f = mergePaths;
    }

    public void absorbContent(ListIterator<Content> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Content content = (Content) listIterator.previous();
            if (content instanceof C2965h) {
                this.f12878e.add((C2965h) content);
                listIterator.remove();
            }
        }
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < this.f12878e.size(); i++) {
            ((C2965h) this.f12878e.get(i)).setContents(list, list2);
        }
    }

    /* renamed from: c */
    public Path mo3174c() {
        this.f12876c.reset();
        switch (this.f12879f.m11519b()) {
            case Merge:
                m15861a();
                break;
            case Add:
                m15862a(Op.UNION);
                break;
            case Subtract:
                m15862a(Op.REVERSE_DIFFERENCE);
                break;
            case Intersect:
                m15862a(Op.INTERSECT);
                break;
            case ExcludeIntersections:
                m15862a(Op.XOR);
                break;
            default:
                break;
        }
        return this.f12876c;
    }

    public String getName() {
        return this.f12877d;
    }

    /* renamed from: a */
    private void m15861a() {
        for (int i = 0; i < this.f12878e.size(); i++) {
            this.f12876c.addPath(((C2965h) this.f12878e.get(i)).mo3174c());
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    private void m15862a(Op op) {
        this.f12875b.reset();
        this.f12874a.reset();
        for (int size = this.f12878e.size() - 1; size >= 1; size--) {
            C2965h c2965h = (C2965h) this.f12878e.get(size);
            if (c2965h instanceof C4050b) {
                C4050b c4050b = (C4050b) c2965h;
                List a = c4050b.m15853a();
                for (int size2 = a.size() - 1; size2 >= 0; size2--) {
                    Path c = ((C2965h) a.get(size2)).mo3174c();
                    c.transform(c4050b.m15854b());
                    this.f12875b.addPath(c);
                }
            } else {
                this.f12875b.addPath(c2965h.mo3174c());
            }
        }
        int i = 0;
        C2965h c2965h2 = (C2965h) this.f12878e.get(0);
        if (c2965h2 instanceof C4050b) {
            C4050b c4050b2 = (C4050b) c2965h2;
            List a2 = c4050b2.m15853a();
            while (i < a2.size()) {
                Path c2 = ((C2965h) a2.get(i)).mo3174c();
                c2.transform(c4050b2.m15854b());
                this.f12874a.addPath(c2);
                i++;
            }
        } else {
            this.f12874a.set(c2965h2.mo3174c());
        }
        this.f12876c.op(this.f12874a, this.f12875b, op);
    }
}
