package com.tinder.video.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.video.C15407a.C15400g;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J(\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0014J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/video/view/RoundedConstraintLayout;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "radius", "roundingPath", "Landroid/graphics/Path;", "clipPath", "", "canvas", "Landroid/graphics/Canvas;", "configureRounding", "dispatchDraw", "onSizeChanged", "w", "h", "oldw", "oldh", "setRoundedCornerRadius", "newRadius", "video_release"}, k = 1, mv = {1, 1, 10})
public class RoundedConstraintLayout extends ConstraintLayout {
    /* renamed from: a */
    private Path f52878a;
    /* renamed from: b */
    private int f52879b;
    /* renamed from: c */
    private HashMap f52880c;

    @JvmOverloads
    public RoundedConstraintLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public RoundedConstraintLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo13544a(int i) {
        if (this.f52880c == null) {
            this.f52880c = new HashMap();
        }
        View view = (View) this.f52880c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f52880c.put(Integer.valueOf(i), view);
        return view;
    }

    @JvmOverloads
    public /* synthetic */ RoundedConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @JvmOverloads
    public RoundedConstraintLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
        if (attributeSet != null) {
            context = context.obtainStyledAttributes(attributeSet, C15400g.RoundedConstraintLayout, 0, 0);
            this.f52879b = context.getDimensionPixelSize(C15400g.RoundedConstraintLayout_contentCornerRadius, 0);
            context.recycle();
        }
    }

    public final void setRoundedCornerRadius(int i) {
        this.f52879b = i;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo13545a();
    }

    /* renamed from: a */
    private final void mo13545a() {
        if (getWidth() > 0 && getHeight() > 0 && this.f52879b > 0) {
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), (float) this.f52879b, (float) this.f52879b, Direction.CCW);
            this.f52878a = path;
        }
    }

    /* renamed from: a */
    private final void m63173a(Canvas canvas) {
        if (this.f52878a != null) {
            canvas.clipPath(this.f52878a);
        }
    }

    public void dispatchDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        int save = canvas.save();
        m63173a(canvas);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }
}
