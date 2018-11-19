package com.tinder.typingindicator.view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.tinder.typingindicator.p434a.C15310a;
import com.tinder.typingindicator.p442h.C15325a.C15322a;
import com.tinder.typingindicator.p442h.C15325a.C15323b;
import com.tinder.typingindicator.p442h.C15325a.C15324c;
import com.tinder.typingindicator.renderer.TypingIndicatorRenderer;
import com.tinder.typingindicator.renderer.TypingIndicatorRenderer.TypingIndicatorRendererDelegate;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0014J(\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0014J\u0006\u0010&\u001a\u00020\u001bJ\u0006\u0010'\u001a\u00020\u001bR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/tinder/typingindicator/view/TypingIndicatorView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/typingindicator/renderer/TypingIndicatorRenderer$TypingIndicatorRendererDelegate;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animator", "Lcom/tinder/typingindicator/animator/TypingIndicatorAnimator;", "defaultDotPrimaryColor", "defaultDotSecondaryColor", "defaultDotSize", "defaultDotSpacing", "dotPrimaryColor", "dotSecondaryColor", "dotSize", "dotSpacing", "dotsWidth", "typingIndicatorRenderer", "Lcom/tinder/typingindicator/renderer/TypingIndicatorRenderer;", "measureHeight", "measureSpec", "measureWidth", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldw", "oldh", "startAnimation", "stopAnimation", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class TypingIndicatorView extends FrameLayout implements TypingIndicatorRendererDelegate {
    /* renamed from: a */
    private final int f52741a;
    /* renamed from: b */
    private final int f52742b;
    /* renamed from: c */
    private final int f52743c;
    /* renamed from: d */
    private final int f52744d;
    /* renamed from: e */
    private int f52745e;
    /* renamed from: f */
    private int f52746f;
    /* renamed from: g */
    private int f52747g;
    /* renamed from: h */
    private int f52748h;
    /* renamed from: i */
    private final TypingIndicatorRenderer f52749i;
    /* renamed from: j */
    private final C15310a f52750j;
    /* renamed from: k */
    private final int f52751k;

    @JvmOverloads
    public TypingIndicatorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public TypingIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public /* synthetic */ TypingIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @JvmOverloads
    public TypingIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
        this.f52741a = C0432b.c(context, C15322a.typing_indicator_dots_light);
        this.f52742b = C0432b.c(context, C15322a.typing_indicator_dots_dark);
        this.f52743c = context.getResources().getDimensionPixelSize(C15323b.typing_indicator_dot_size);
        this.f52744d = context.getResources().getDimensionPixelSize(C15323b.typing_indicator_dot_spacing);
        this.f52745e = this.f52741a;
        this.f52746f = this.f52742b;
        this.f52747g = this.f52743c;
        this.f52748h = this.f52744d;
        if (attributeSet != null) {
            context = context.obtainStyledAttributes(attributeSet, C15324c.TypingIndicatorView);
            try {
                this.f52745e = context.getColor(C15324c.TypingIndicatorView_tiv_dotPrimaryColor, this.f52741a);
                this.f52746f = context.getColor(C15324c.TypingIndicatorView_tiv_dotSecondaryColor, this.f52742b);
                this.f52747g = context.getDimensionPixelSize(C15324c.TypingIndicatorView_tiv_dotSize, this.f52743c);
                this.f52748h = context.getDimensionPixelSize(C15324c.TypingIndicatorView_tiv_dotSpacing, this.f52744d);
            } finally {
                context.recycle();
            }
        }
        this.f52751k = this.f52747g + ((this.f52748h + this.f52747g) * 2);
        this.f52749i = new TypingIndicatorRenderer(this, 3, this.f52747g, this.f52748h, this.f52745e);
        this.f52750j = new C15310a(this.f52749i, 3, this.f52745e, this.f52746f);
    }

    /* renamed from: a */
    public final void m63066a() {
        this.f52750j.m57485a();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f52749i.m57516b(i2, getPaddingStart());
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(m63065b(i), m63064a(i2));
    }

    protected void onDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        super.onDraw(canvas);
        this.f52749i.m57515a(canvas);
    }

    /* renamed from: a */
    private final int m63064a(int i) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int paddingTop = (this.f52747g + getPaddingTop()) + getPaddingBottom();
        if (mode == Integer.MIN_VALUE) {
            return Math.min(paddingTop, i);
        }
        if (mode == 0 || mode != 1073741824) {
            return paddingTop;
        }
        return i;
    }

    /* renamed from: b */
    private final int m63065b(int i) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int paddingStart = (this.f52751k + getPaddingStart()) + getPaddingEnd();
        if (mode == Integer.MIN_VALUE) {
            return Math.min(paddingStart, i);
        }
        if (mode == 0 || mode != 1073741824) {
            return paddingStart;
        }
        return i;
    }
}
