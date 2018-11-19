package com.tinder.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.tinder.C6250b.C6249b;
import com.tinder.base.view.TouchBlockingFrameLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001:\u0001,B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J(\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0014J\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\bJ\u000e\u0010+\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\bR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\f¨\u0006-"}, d2 = {"Lcom/tinder/views/RoundedFrameLayout;", "Lcom/tinder/base/view/TouchBlockingFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bottomLeft", "", "getBottomLeft", "()Z", "setBottomLeft", "(Z)V", "bottomRight", "getBottomRight", "setBottomRight", "cornerRadius", "", "getCornerRadius", "()I", "setCornerRadius", "(I)V", "roundingPath", "Landroid/graphics/Path;", "topLeft", "getTopLeft", "setTopLeft", "topRight", "getTopRight", "setTopRight", "clipPath", "", "canvas", "Landroid/graphics/Canvas;", "configureRounding", "draw", "onSizeChanged", "w", "h", "oldw", "oldh", "setRoundBottom", "shouldRound", "setRoundTop", "RoundedOutlineProvider", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public class RoundedFrameLayout extends TouchBlockingFrameLayout {
    /* renamed from: a */
    private Path f56663a;
    /* renamed from: b */
    private int f56664b;
    /* renamed from: c */
    private boolean f56665c;
    /* renamed from: d */
    private boolean f56666d;
    /* renamed from: e */
    private boolean f56667e;
    /* renamed from: f */
    private boolean f56668f;
    /* renamed from: g */
    private HashMap f56669g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/views/RoundedFrameLayout$RoundedOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "width", "", "height", "radius", "(III)V", "getHeight", "()I", "setHeight", "(I)V", "getRadius", "setRadius", "getWidth", "setWidth", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    @TargetApi(21)
    /* renamed from: com.tinder.views.RoundedFrameLayout$a */
    private static final class C15439a extends ViewOutlineProvider {
        /* renamed from: a */
        private int f47836a;
        /* renamed from: b */
        private int f47837b;
        /* renamed from: c */
        private int f47838c;

        public C15439a(int i, int i2, int i3) {
            this.f47836a = i;
            this.f47837b = i2;
            this.f47838c = i3;
        }

        /* renamed from: a */
        public final void m57926a(int i) {
            this.f47836a = i;
        }

        /* renamed from: b */
        public final void m57927b(int i) {
            this.f47837b = i;
        }

        /* renamed from: c */
        public final void m57928c(int i) {
            this.f47838c = i;
        }

        public void getOutline(@NotNull View view, @NotNull Outline outline) {
            C2668g.b(view, "view");
            C2668g.b(outline, "outline");
            outline.setRoundRect(0, 0, this.f47836a, this.f47837b, (float) this.f47838c);
        }
    }

    @JvmOverloads
    public RoundedFrameLayout(@NotNull Context context) {
        this(context, null, 2, null);
    }

    /* renamed from: a */
    public View m66286a(int i) {
        if (this.f56669g == null) {
            this.f56669g = new HashMap();
        }
        View view = (View) this.f56669g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f56669g.put(Integer.valueOf(i), view);
        return view;
    }

    @JvmOverloads
    public /* synthetic */ RoundedFrameLayout(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    @JvmOverloads
    public RoundedFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        if (attributeSet != null) {
            context = context.obtainStyledAttributes(attributeSet, C6249b.RoundedFrameLayout, 0, 0);
            this.f56664b = context.getDimensionPixelSize(0, 0);
            context.recycle();
        }
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider((ViewOutlineProvider) new C15439a(getWidth(), getHeight(), this.f56664b));
        }
    }

    public final int getCornerRadius() {
        return this.f56664b;
    }

    public final void setCornerRadius(int i) {
        this.f56664b = i;
    }

    public final boolean getTopLeft() {
        return this.f56665c;
    }

    public final void setTopLeft(boolean z) {
        this.f56665c = z;
    }

    public final boolean getTopRight() {
        return this.f56666d;
    }

    public final void setTopRight(boolean z) {
        this.f56666d = z;
    }

    public final boolean getBottomLeft() {
        return this.f56667e;
    }

    public final void setBottomLeft(boolean z) {
        this.f56667e = z;
    }

    public final boolean getBottomRight() {
        return this.f56668f;
    }

    public final void setBottomRight(boolean z) {
        this.f56668f = z;
    }

    public final void setRoundTop(boolean z) {
        this.f56665c = z;
        this.f56666d = z;
    }

    public final void setRoundBottom(boolean z) {
        this.f56667e = z;
        this.f56668f = z;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m66284a();
    }

    public void draw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        int save = canvas.save();
        m66285a(canvas);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    private final void m66284a() {
        if (getWidth() > 0 && getHeight() > 0 && this.f56664b > 0) {
            this.f56663a = C15470z.m57957a(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (float) this.f56664b, (float) this.f56664b, this.f56665c, this.f56666d, this.f56668f, this.f56667e);
            if (VERSION.SDK_INT >= 21) {
                ViewOutlineProvider outlineProvider = getOutlineProvider();
                if (outlineProvider == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.views.RoundedFrameLayout.RoundedOutlineProvider");
                }
                ((C15439a) outlineProvider).m57928c(this.f56664b);
                outlineProvider = getOutlineProvider();
                if (outlineProvider == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.views.RoundedFrameLayout.RoundedOutlineProvider");
                }
                ((C15439a) outlineProvider).m57926a(getWidth());
                outlineProvider = getOutlineProvider();
                if (outlineProvider == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.views.RoundedFrameLayout.RoundedOutlineProvider");
                }
                ((C15439a) outlineProvider).m57927b(getHeight());
            }
        }
    }

    /* renamed from: a */
    private final void m66285a(Canvas canvas) {
        Path path = this.f56663a;
        if (path != null) {
            canvas.clipPath(path);
        }
    }
}
