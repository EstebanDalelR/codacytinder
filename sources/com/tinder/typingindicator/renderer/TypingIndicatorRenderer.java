package com.tinder.typingindicator.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.annotation.ColorInt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.collections.ab;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18464j;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001!B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0005J\u0016\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005J\u0016\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0010j\b\u0012\u0004\u0012\u00020\u000e`\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/tinder/typingindicator/renderer/TypingIndicatorRenderer;", "", "typingIndicatorRendererDelegate", "Lcom/tinder/typingindicator/renderer/TypingIndicatorRenderer$TypingIndicatorRendererDelegate;", "dotCount", "", "dotSize", "dotSpacing", "dotPrimaryColor", "(Lcom/tinder/typingindicator/renderer/TypingIndicatorRenderer$TypingIndicatorRendererDelegate;IIII)V", "dotPaints", "", "Landroid/graphics/Paint;", "dotRadius", "", "dotXOrigins", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "dotYOrigin", "createDotPaints", "createPaint", "paintColor", "draw", "", "canvas", "Landroid/graphics/Canvas;", "onAnimationEnd", "dotIndex", "onAnimationUpdate", "animatedValue", "onSizeChanged", "height", "paddingStart", "TypingIndicatorRendererDelegate", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class TypingIndicatorRenderer {
    /* renamed from: a */
    private final List<Paint> f47541a = m57511b(this.f47546f);
    /* renamed from: b */
    private final ArrayList<Float> f47542b = new ArrayList(this.f47546f);
    /* renamed from: c */
    private final float f47543c = (((float) this.f47547g) / 1073741824);
    /* renamed from: d */
    private float f47544d;
    /* renamed from: e */
    private final TypingIndicatorRendererDelegate f47545e;
    /* renamed from: f */
    private final int f47546f;
    /* renamed from: g */
    private final int f47547g;
    /* renamed from: h */
    private final int f47548h;
    /* renamed from: i */
    private final int f47549i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/typingindicator/renderer/TypingIndicatorRenderer$TypingIndicatorRendererDelegate;", "", "getLayoutDirection", "", "invalidate", "", "ui_release"}, k = 1, mv = {1, 1, 10})
    public interface TypingIndicatorRendererDelegate {
        int getLayoutDirection();

        void invalidate();
    }

    public TypingIndicatorRenderer(@NotNull TypingIndicatorRendererDelegate typingIndicatorRendererDelegate, int i, int i2, int i3, @ColorInt int i4) {
        C2668g.b(typingIndicatorRendererDelegate, "typingIndicatorRendererDelegate");
        this.f47545e = typingIndicatorRendererDelegate;
        this.f47546f = i;
        this.f47547g = i2;
        this.f47548h = i3;
        this.f47549i = i4;
        if ((this.f47546f > null ? true : null) == null) {
            typingIndicatorRendererDelegate = new StringBuilder();
            typingIndicatorRendererDelegate.append("Dot count ");
            typingIndicatorRendererDelegate.append(this.f47546f);
            typingIndicatorRendererDelegate.append(" must be greater than 0");
            throw ((Throwable) new IllegalArgumentException(typingIndicatorRendererDelegate.toString().toString()));
        }
    }

    /* renamed from: a */
    public final void m57514a(int i, int i2) {
        if (this.f47545e.getLayoutDirection() == 1) {
            i2 = (this.f47541a.size() - 1) - i2;
        }
        ((Paint) this.f47541a.get(i2)).setColor(i);
        this.f47545e.invalidate();
    }

    /* renamed from: a */
    public final void m57513a(int i) {
        ((Paint) this.f47541a.get(i)).setColor(this.f47549i);
        this.f47545e.invalidate();
    }

    /* renamed from: b */
    public final void m57516b(int i, int i2) {
        this.f47544d = ((float) i) / 1073741824;
        this.f47542b.clear();
        this.f47542b.add(Float.valueOf(((float) i2) + this.f47543c));
        i = this.f47546f;
        for (i2 = 1; i2 < i; i2++) {
            this.f47542b.add(Float.valueOf((((Number) this.f47542b.get(i2 - 1)).floatValue() + ((float) this.f47547g)) + ((float) this.f47548h)));
        }
    }

    /* renamed from: a */
    public final void m57515a(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        int i = this.f47546f;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.f47542b.get(i2);
            C2668g.a(obj, "dotXOrigins[index]");
            canvas.drawCircle(((Number) obj).floatValue(), this.f47544d, this.f47543c, (Paint) this.f47541a.get(i2));
        }
    }

    /* renamed from: b */
    private final List<Paint> m57511b(int i) {
        Iterable b = C18464j.m66925b(0, i);
        Collection arrayList = new ArrayList(C18457p.m66906a(b, 10));
        i = b.iterator();
        while (i.hasNext()) {
            ((ab) i).mo13805b();
            arrayList.add(m57512c(this.f47549i));
        }
        return (List) arrayList;
    }

    /* renamed from: c */
    private final Paint m57512c(int i) {
        Paint paint = new Paint(1);
        paint.setColor(i);
        paint.setStyle(Style.FILL);
        return paint;
    }
}
