package com.tinder.loops.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.C0441a;
import android.support.v4.view.C0592b;
import android.util.AttributeSet;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.jakewharton.rxbinding2.C7833a;
import io.reactivex.Observer;
import io.reactivex.p453a.C17353a;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.ImageViewTouchBase.DisplayType;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005+,-./B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0002J\n\u0010\u001c\u001a\u00060\u001dR\u00020\u0000J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$J\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u0007J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(H\u0002J\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u0007J\b\u0010*\u001a\u00020\u001fH\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u00060"}, d2 = {"Lcom/tinder/loops/ui/view/PannableImageView;", "Lit/sephiroth/android/library/imagezoom/ImageViewTouch;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "detector", "Landroid/support/v4/view/GestureDetectorCompat;", "direction", "Lcom/tinder/loops/ui/view/PannableImageView$Direction;", "onPanListener", "Lcom/tinder/loops/ui/view/PannableImageView$OnPanListener;", "getOnPanListener", "()Lcom/tinder/loops/ui/view/PannableImageView$OnPanListener;", "setOnPanListener", "(Lcom/tinder/loops/ui/view/PannableImageView$OnPanListener;)V", "whitePaint", "Landroid/graphics/Paint;", "getWhitePaint", "()Landroid/graphics/Paint;", "whitePaint$delegate", "Lkotlin/Lazy;", "computeCroppingArea", "Lcom/tinder/loops/ui/view/PannableImageView$CroppingArea;", "emptyOnPanListener", "observeOnPanEvent", "Lcom/tinder/loops/ui/view/PannableImageView$OnPanObservable;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setAnimationDrawable", "animationDrawable", "Landroid/graphics/drawable/AnimationDrawable;", "id", "setDisplayDirection", "drawable", "Landroid/graphics/drawable/Drawable;", "setDrawable", "updatePanListener", "CroppingArea", "Direction", "InternalGestureListener", "OnPanListener", "OnPanObservable", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
public final class PannableImageView extends ImageViewTouch {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f44521a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(PannableImageView.class), "whitePaint", "getWhitePaint()Landroid/graphics/Paint;"))};
    @NotNull
    /* renamed from: K */
    private OnPanListener f44522K;
    /* renamed from: L */
    private C0592b f44523L;
    /* renamed from: M */
    private Direction f44524M;
    /* renamed from: N */
    private final Lazy f44525N;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/loops/ui/view/PannableImageView$Direction;", "", "(Ljava/lang/String;I)V", "PORTRAIT", "LANDSCAPE", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    private enum Direction {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/loops/ui/view/PannableImageView$OnPanListener;", "", "onPan", "", "croppingArea", "Lcom/tinder/loops/ui/view/PannableImageView$CroppingArea;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    public interface OnPanListener {
        void onPan(@NotNull C9808a c9808a);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/tinder/loops/ui/view/PannableImageView$CroppingArea;", "", "leftPositionPercentageOfWidth", "", "topPositionPercentageOfHeight", "rightPositionPercentageOfWidth", "bottomPositionPercentageOfHeight", "(FFFF)V", "getBottomPositionPercentageOfHeight", "()F", "getLeftPositionPercentageOfWidth", "getRightPositionPercentageOfWidth", "getTopPositionPercentageOfHeight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.view.PannableImageView$a */
    public static final class C9808a {
        /* renamed from: a */
        private final float f32501a;
        /* renamed from: b */
        private final float f32502b;
        /* renamed from: c */
        private final float f32503c;
        /* renamed from: d */
        private final float f32504d;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9808a) {
                    C9808a c9808a = (C9808a) obj;
                    if (Float.compare(this.f32501a, c9808a.f32501a) == 0 && Float.compare(this.f32502b, c9808a.f32502b) == 0 && Float.compare(this.f32503c, c9808a.f32503c) == 0 && Float.compare(this.f32504d, c9808a.f32504d) == 0) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f32501a) * 31) + Float.floatToIntBits(this.f32502b)) * 31) + Float.floatToIntBits(this.f32503c)) * 31) + Float.floatToIntBits(this.f32504d);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CroppingArea(leftPositionPercentageOfWidth=");
            stringBuilder.append(this.f32501a);
            stringBuilder.append(", topPositionPercentageOfHeight=");
            stringBuilder.append(this.f32502b);
            stringBuilder.append(", rightPositionPercentageOfWidth=");
            stringBuilder.append(this.f32503c);
            stringBuilder.append(", bottomPositionPercentageOfHeight=");
            stringBuilder.append(this.f32504d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9808a(float f, float f2, float f3, float f4) {
            this.f32501a = f;
            this.f32502b = f2;
            this.f32503c = f3;
            this.f32504d = f4;
        }

        /* renamed from: a */
        public final float m40428a() {
            return this.f32501a;
        }

        /* renamed from: b */
        public final float m40429b() {
            return this.f32502b;
        }

        /* renamed from: c */
        public final float m40430c() {
            return this.f32503c;
        }

        /* renamed from: d */
        public final float m40431d() {
            return this.f32504d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/tinder/loops/ui/view/PannableImageView$InternalGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/tinder/loops/ui/view/PannableImageView;)V", "onScroll", "", "e1", "Landroid/view/MotionEvent;", "e2", "distanceX", "", "distanceY", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.view.PannableImageView$b */
    public final class C9809b extends SimpleOnGestureListener {
        /* renamed from: a */
        final /* synthetic */ PannableImageView f32505a;

        public C9809b(PannableImageView pannableImageView) {
            this.f32505a = pannableImageView;
        }

        public boolean onScroll(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f, float f2) {
            this.f32505a.m53768j();
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/loops/ui/view/PannableImageView$emptyOnPanListener$1", "Lcom/tinder/loops/ui/view/PannableImageView$OnPanListener;", "()V", "onPan", "", "croppingArea", "Lcom/tinder/loops/ui/view/PannableImageView$CroppingArea;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.view.PannableImageView$d */
    public static final class C11962d implements OnPanListener {
        public void onPan(@NotNull C9808a c9808a) {
            C2668g.b(c9808a, "croppingArea");
        }

        C11962d() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0002H\u0014J\u0018\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\fH\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/tinder/loops/ui/view/PannableImageView$OnPanObservable;", "Lcom/jakewharton/rxbinding2/InitialValueObservable;", "Lcom/tinder/loops/ui/view/PannableImageView$CroppingArea;", "pannableImageView", "Lcom/tinder/loops/ui/view/PannableImageView;", "(Lcom/tinder/loops/ui/view/PannableImageView;Lcom/tinder/loops/ui/view/PannableImageView;)V", "getPannableImageView", "()Lcom/tinder/loops/ui/view/PannableImageView;", "getInitialValue", "subscribeListener", "", "observer", "Lio/reactivex/Observer;", "Listener", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.view.PannableImageView$c */
    public final class C14048c extends C7833a<C9808a> {
        /* renamed from: a */
        final /* synthetic */ PannableImageView f44518a;
        @NotNull
        /* renamed from: b */
        private final PannableImageView f44519b;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016R\u0019\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/tinder/loops/ui/view/PannableImageView$OnPanObservable$Listener;", "Lio/reactivex/android/MainThreadDisposable;", "Lcom/tinder/loops/ui/view/PannableImageView$OnPanListener;", "pannableImageView", "Lcom/tinder/loops/ui/view/PannableImageView;", "observer", "Lio/reactivex/Observer;", "Lcom/tinder/loops/ui/view/PannableImageView$CroppingArea;", "(Lcom/tinder/loops/ui/view/PannableImageView$OnPanObservable;Lcom/tinder/loops/ui/view/PannableImageView;Lio/reactivex/Observer;)V", "getObserver", "()Lio/reactivex/Observer;", "getPannableImageView", "()Lcom/tinder/loops/ui/view/PannableImageView;", "onDispose", "", "onPan", "croppingArea", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.loops.ui.view.PannableImageView$c$a */
        public final class C13380a extends C17353a implements OnPanListener {
            /* renamed from: a */
            final /* synthetic */ C14048c f42399a;
            @NotNull
            /* renamed from: b */
            private final PannableImageView f42400b;
            @NotNull
            /* renamed from: c */
            private final Observer<? super C9808a> f42401c;

            public C13380a(C14048c c14048c, @NotNull PannableImageView pannableImageView, @NotNull Observer<? super C9808a> observer) {
                C2668g.b(pannableImageView, "pannableImageView");
                C2668g.b(observer, "observer");
                this.f42399a = c14048c;
                this.f42400b = pannableImageView;
                this.f42401c = observer;
            }

            /* renamed from: a */
            protected void m51741a() {
                this.f42400b.setOnPanListener(this.f42399a.f44518a.m53766h());
            }

            public void onPan(@NotNull C9808a c9808a) {
                C2668g.b(c9808a, "croppingArea");
                C17353a.b();
                if (!isDisposed()) {
                    this.f42401c.onNext(c9808a);
                }
            }
        }

        public C14048c(PannableImageView pannableImageView, @NotNull PannableImageView pannableImageView2) {
            C2668g.b(pannableImageView2, "pannableImageView");
            this.f44518a = pannableImageView;
            this.f44519b = pannableImageView2;
        }

        /* renamed from: a */
        public /* synthetic */ Object m53758a() {
            return m53760b();
        }

        @NotNull
        /* renamed from: b */
        protected C9808a m53760b() {
            return this.f44519b.m53767i();
        }

        /* renamed from: a */
        protected void m53759a(@NotNull Observer<? super C9808a> observer) {
            C2668g.b(observer, "observer");
            C13380a c13380a = new C13380a(this, this.f44519b, observer);
            observer.onSubscribe(c13380a);
            this.f44519b.setOnPanListener(c13380a);
        }
    }

    @JvmOverloads
    public PannableImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PannableImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Paint getWhitePaint() {
        Lazy lazy = this.f44525N;
        KProperty kProperty = f44521a[0];
        return (Paint) lazy.getValue();
    }

    @JvmOverloads
    public /* synthetic */ PannableImageView(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @JvmOverloads
    public PannableImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
        this.f44522K = m53766h();
        this.f44524M = Direction.PORTRAIT;
        this.f44525N = C18451c.a((Function0) PannableImageView$whitePaint$2.f44520a);
        setScaleEnabled(false);
        setDoubleTapEnabled(false);
        this.f44523L = new C0592b(context, (OnGestureListener) new C9809b(this));
        setOnTouchListener((OnTouchListener) new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f44523L.a(motionEvent);
                return null;
            }
        });
    }

    @NotNull
    public final OnPanListener getOnPanListener() {
        return this.f44522K;
    }

    public final void setOnPanListener(@NotNull OnPanListener onPanListener) {
        C2668g.b(onPanListener, "<set-?>");
        this.f44522K = onPanListener;
    }

    /* renamed from: h */
    private final OnPanListener m53766h() {
        return new C11962d();
    }

    public final void setDrawable(int i) {
        i = C0441a.a(getResources(), i, null);
        if (i != 0) {
            setDisplayDirection(i);
            setImageDrawable(i);
        }
    }

    public final void setAnimationDrawable(int i) {
        i = C0441a.a(getResources(), i, null);
        if (i == 0) {
            throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        }
        setAnimationDrawable((AnimationDrawable) i);
    }

    public final void setAnimationDrawable(@NotNull AnimationDrawable animationDrawable) {
        C2668g.b(animationDrawable, "animationDrawable");
        Drawable drawable = animationDrawable;
        setDisplayDirection(drawable);
        setImageDrawable(drawable);
        animationDrawable.start();
    }

    @NotNull
    /* renamed from: a */
    public final C14048c m53769a() {
        return new C14048c(this, this);
    }

    protected void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        float width = (float) getWidth();
        float height = (float) getHeight();
        float f = width / 3.0f;
        float f2 = (width / ((float) 3)) * 2.0f;
        float f3 = height / 3.0f;
        float f4 = f3 * 2.0f;
        if (canvas != null) {
            Canvas canvas2 = canvas;
            float f5 = height;
            canvas2.drawLine(f, 0.0f, f, f5, getWhitePaint());
            canvas2.drawLine(f2, 0.0f, f2, f5, getWhitePaint());
            Canvas canvas3 = canvas;
            float f6 = width;
            canvas3.drawLine(0.0f, f3, f6, f3, getWhitePaint());
            canvas3.drawLine(0.0f, f4, f6, f4, getWhitePaint());
        }
    }

    private final void setDisplayDirection(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= drawable.getIntrinsicHeight()) {
            setDisplayType(DisplayType.FIT_HEIGHT);
            this.f44524M = Direction.LANDSCAPE;
            return;
        }
        setDisplayType(DisplayType.FIT_WIDTH);
        this.f44524M = Direction.PORTRAIT;
    }

    /* renamed from: i */
    private final C9808a m53767i() {
        RectF bitmapRect = getBitmapRect();
        C2668g.a(bitmapRect, "bitmapRect");
        float f = 0.0f;
        if (bitmapRect.isEmpty()) {
            return new C9808a(0.0f, 0.0f, 1.0f, 1.0f);
        }
        float abs;
        int width = getWidth();
        int height = getHeight();
        float abs2 = Math.abs(bitmapRect.left) + Math.abs(bitmapRect.right);
        float abs3 = Math.abs(bitmapRect.top) + Math.abs(bitmapRect.bottom);
        switch (this.f44524M) {
            case LANDSCAPE:
                abs = Math.abs(bitmapRect.left);
                break;
            case PORTRAIT:
                abs = 0.0f;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (this.f44524M) {
            case LANDSCAPE:
                break;
            case PORTRAIT:
                f = Math.abs(bitmapRect.top);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new C9808a(abs / abs2, f / abs3, Math.min((abs + ((float) width)) / abs2, 1.0f), Math.min((f + ((float) height)) / abs3, 1.0f));
    }

    /* renamed from: j */
    private final void m53768j() {
        this.f44522K.onPan(m53767i());
    }
}
