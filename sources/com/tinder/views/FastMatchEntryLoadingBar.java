package com.tinder.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import butterknife.BindArray;
import butterknife.ButterKnife;
import com.google.android.gms.common.ConnectionResult;
import java.util.Arrays;
import java.util.List;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0002&'B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0014J\u0010\u0010$\u001a\u00020\u001c2\b\b\u0002\u0010%\u001a\u00020\"R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/tinder/views/FastMatchEntryLoadingBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "foregroundPaint", "Landroid/graphics/Paint;", "foregroundStrokeWidth", "", "gradientColors", "", "getGradientColors$Tinder_release", "()[I", "setGradientColors$Tinder_release", "([I)V", "gradientValues", "Lcom/tinder/views/FastMatchEntryLoadingBar$GradientPoints;", "getGradientValues", "()Lcom/tinder/views/FastMatchEntryLoadingBar$GradientPoints;", "gradientValues$delegate", "Lkotlin/Lazy;", "mSweepGradient", "Landroid/graphics/SweepGradient;", "rectF", "Landroid/graphics/RectF;", "onAttachedToWindow", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "startAnimation", "duration", "Companion", "GradientPoints", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchEntryLoadingBar extends View {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f47734a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(FastMatchEntryLoadingBar.class), "gradientValues", "getGradientValues()Lcom/tinder/views/FastMatchEntryLoadingBar$GradientPoints;"))};
    /* renamed from: b */
    public static final C15427a f47735b = new C15427a();
    /* renamed from: h */
    private static final List<Float> f47736h = C17554o.m64199b((Object[]) new Float[]{Float.valueOf(0.15f), Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(0.85f), Float.valueOf(1.0f)});
    /* renamed from: c */
    private float f47737c;
    /* renamed from: d */
    private final RectF f47738d = new RectF();
    /* renamed from: e */
    private final Paint f47739e;
    /* renamed from: f */
    private SweepGradient f47740f;
    /* renamed from: g */
    private final Lazy f47741g;
    @NotNull
    @BindArray(2130903045)
    public int[] gradientColors;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/views/FastMatchEntryLoadingBar$Companion;", "", "()V", "GRADIENT_POINT_ARRAY", "", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.views.FastMatchEntryLoadingBar$a */
    public static final class C15427a {
        private C15427a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/views/FastMatchEntryLoadingBar$GradientPoints;", "", "colors", "", "positions", "", "([I[F)V", "getColors", "()[I", "getPositions", "()[F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.views.FastMatchEntryLoadingBar$b */
    public static final class C15428b {
        @NotNull
        /* renamed from: a */
        private final int[] f47732a;
        @NotNull
        /* renamed from: b */
        private final float[] f47733b;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GradientPoints(colors=");
            stringBuilder.append(Arrays.toString(this.f47732a));
            stringBuilder.append(", positions=");
            stringBuilder.append(Arrays.toString(this.f47733b));
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15428b(@NotNull int[] iArr, @NotNull float[] fArr) {
            C2668g.b(iArr, "colors");
            C2668g.b(fArr, "positions");
            this.f47732a = iArr;
            this.f47733b = fArr;
        }

        @NotNull
        /* renamed from: a */
        public final int[] m57839a() {
            return this.f47732a;
        }

        @NotNull
        /* renamed from: b */
        public final float[] m57840b() {
            return this.f47733b;
        }

        public boolean equals(@Nullable Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }
    }

    private final C15428b getGradientValues() {
        Lazy lazy = this.f47741g;
        KProperty kProperty = f47734a[0];
        return (C15428b) lazy.getValue();
    }

    public FastMatchEntryLoadingBar(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        context = context.getResources();
        C2668g.a(context, "context.resources");
        this.f47737c = TypedValue.applyDimension(1, 3.0f, context.getDisplayMetrics());
        context = new Paint(1);
        context.setColor(-7829368);
        context.setStyle(Style.STROKE);
        context.setStrokeWidth(this.f47737c);
        context.setStrokeCap(Cap.BUTT);
        this.f47739e = context;
        this.f47741g = C15810e.m59833a((Function0) new FastMatchEntryLoadingBar$gradientValues$2(this));
        ButterKnife.a(this);
    }

    @NotNull
    public final int[] getGradientColors$Tinder_release() {
        int[] iArr = this.gradientColors;
        if (iArr == null) {
            C2668g.b("gradientColors");
        }
        return iArr;
    }

    public final void setGradientColors$Tinder_release(@NotNull int[] iArr) {
        C2668g.b(iArr, "<set-?>");
        this.gradientColors = iArr;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m57842a(this, 0, 1, null);
    }

    protected void onDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f47740f == null) {
            this.f47740f = new SweepGradient((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), getGradientValues().m57839a(), getGradientValues().m57840b());
        }
        if (this.f47740f != null) {
            this.f47739e.setShader(this.f47740f);
        }
        canvas.drawArc(this.f47738d, 0.0f, 360.0f, false, this.f47739e);
    }

    protected void onMeasure(int i, int i2) {
        i = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(i, i);
        float f = (float) 0;
        float f2 = (float) 2;
        i = (float) i;
        this.f47738d.set((this.f47737c / f2) + f, f + (this.f47737c / f2), i - (this.f47737c / f2), i - (this.f47737c / f2));
    }

    /* renamed from: a */
    public static /* synthetic */ void m57842a(FastMatchEntryLoadingBar fastMatchEntryLoadingBar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        }
        fastMatchEntryLoadingBar.m57843a(i);
    }

    /* renamed from: a */
    public final void m57843a(int i) {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration((long) i);
        rotateAnimation.setInterpolator((Interpolator) new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        startAnimation(rotateAnimation);
    }
}
