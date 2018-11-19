package com.tinder.design.togglenavigationview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import android.util.SparseIntArray;
import com.tinder.base.p170a.p171a.C8299a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Ref.IntRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001'B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0002J\"\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\u0003H\u0002J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\rJ\u0016\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rJ\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/tinder/design/togglenavigationview/FlingHelper;", "", "screenDensity", "", "callback", "Lcom/tinder/design/togglenavigationview/FlingHelper$Callback;", "valueAnimator", "Landroid/animation/ValueAnimator;", "targetLocationsX", "Landroid/util/SparseIntArray;", "(FLcom/tinder/design/togglenavigationview/FlingHelper$Callback;Landroid/animation/ValueAnimator;Landroid/util/SparseIntArray;)V", "flingVelocity", "<set-?>", "", "leftThreshold", "getLeftThreshold", "()I", "setLeftThreshold", "(I)V", "rightThreshold", "getRightThreshold", "setRightThreshold", "cancelIfRunning", "", "clearThresholdValues", "findNearestTarget", "pivot", "fling", "flingDistance", "target", "velocityFactor", "flingToClosestTarget", "currX", "flingToTarget", "targetNew", "isRunning", "", "updateTargetCenters", "targetCentersX", "Callback", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
public final class FlingHelper {
    /* renamed from: a */
    private final float f30948a;
    /* renamed from: b */
    private int f30949b;
    /* renamed from: c */
    private int f30950c;
    /* renamed from: d */
    private final Callback f30951d;
    /* renamed from: e */
    private final ValueAnimator f30952e;
    /* renamed from: f */
    private final SparseIntArray f30953f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/tinder/design/togglenavigationview/FlingHelper$Callback;", "", "flingBy", "", "dx", "", "flingCancelled", "flingFinished", "targetIndex", "flingStarted", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
    public interface Callback {
        void flingBy(int i);

        void flingCancelled();

        void flingFinished(int i);

        void flingStarted();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/design/togglenavigationview/FlingHelper$fling$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.design.togglenavigationview.FlingHelper$a */
    static final class C8826a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ IntRef f30938a;
        /* renamed from: b */
        final /* synthetic */ FlingHelper f30939b;
        /* renamed from: c */
        final /* synthetic */ int f30940c;
        /* renamed from: d */
        final /* synthetic */ int f30941d;
        /* renamed from: e */
        final /* synthetic */ float f30942e;

        C8826a(IntRef intRef, FlingHelper flingHelper, int i, int i2, float f) {
            this.f30938a = intRef;
            this.f30939b = flingHelper;
            this.f30940c = i;
            this.f30941d = i2;
            this.f30942e = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedValue();
            if (valueAnimator == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            valueAnimator = ((Integer) valueAnimator).intValue() - this.f30938a.f49021a;
            this.f30939b.f30951d.flingBy(valueAnimator);
            IntRef intRef = this.f30938a;
            intRef.f49021a += valueAnimator;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/tinder/design/togglenavigationview/FlingHelper$fling$1$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/design/togglenavigationview/FlingHelper$fling$1;Landroid/animation/ValueAnimator;)V", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.design.togglenavigationview.FlingHelper$b */
    public static final class C8827b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ ValueAnimator f30943a;
        /* renamed from: b */
        final /* synthetic */ FlingHelper f30944b;
        /* renamed from: c */
        final /* synthetic */ int f30945c;
        /* renamed from: d */
        final /* synthetic */ int f30946d;
        /* renamed from: e */
        final /* synthetic */ float f30947e;

        C8827b(ValueAnimator valueAnimator, FlingHelper flingHelper, int i, int i2, float f) {
            this.f30943a = valueAnimator;
            this.f30944b = flingHelper;
            this.f30945c = i;
            this.f30946d = i2;
            this.f30947e = f;
        }

        public void onAnimationCancel(@Nullable Animator animator) {
            this.f30943a.removeAllUpdateListeners();
            this.f30943a.removeAllListeners();
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f30944b.f30951d.flingFinished(this.f30946d);
            this.f30943a.removeAllUpdateListeners();
            this.f30943a.removeAllListeners();
        }
    }

    public FlingHelper(float f, @NotNull Callback callback, @NotNull ValueAnimator valueAnimator, @NotNull SparseIntArray sparseIntArray) {
        C2668g.b(callback, "callback");
        C2668g.b(valueAnimator, "valueAnimator");
        C2668g.b(sparseIntArray, "targetLocationsX");
        this.f30951d = callback;
        this.f30952e = valueAnimator;
        this.f30953f = sparseIntArray;
        this.f30948a = f * 0.5f;
        this.f30949b = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f30950c = Integer.MIN_VALUE;
    }

    public /* synthetic */ FlingHelper(float f, Callback callback, ValueAnimator valueAnimator, SparseIntArray sparseIntArray, int i, C15823e c15823e) {
        if ((i & 4) != null) {
            valueAnimator = new ValueAnimator();
        }
        if ((i & 8) != 0) {
            sparseIntArray = new SparseIntArray();
        }
        this(f, callback, valueAnimator, sparseIntArray);
    }

    /* renamed from: a */
    public final int m37553a() {
        return this.f30949b;
    }

    /* renamed from: b */
    public final int m37557b() {
        return this.f30950c;
    }

    /* renamed from: c */
    public final boolean m37558c() {
        return this.f30952e.isRunning();
    }

    /* renamed from: a */
    public final void m37556a(@NotNull SparseIntArray sparseIntArray) {
        C2668g.b(sparseIntArray, "targetCentersX");
        this.f30953f.clear();
        m37552e();
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            int valueAt = sparseIntArray.valueAt(i);
            this.f30953f.put(sparseIntArray.keyAt(i), valueAt);
            this.f30949b = Math.min(this.f30949b, valueAt);
            this.f30950c = Math.max(this.f30950c, valueAt);
        }
    }

    /* renamed from: a */
    public final void m37555a(int i, int i2) {
        int i3 = this.f30953f.get(i2) - i;
        this.f30951d.flingStarted();
        m37549a(i3, i2, 1069547520);
    }

    /* renamed from: a */
    public final void m37554a(int i) {
        this.f30951d.flingStarted();
        int b = m37551b(i);
        m37550a(this, this.f30953f.get(b) - i, b, 0.0f, 4, null);
    }

    /* renamed from: d */
    public final void m37559d() {
        if (this.f30952e.isRunning()) {
            C8299a.m35391a(this.f30952e);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m37550a(FlingHelper flingHelper, int i, int i2, float f, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            f = 1.0f;
        }
        flingHelper.m37549a(i, i2, f);
    }

    /* renamed from: a */
    private final void m37549a(int i, int i2, float f) {
        ValueAnimator valueAnimator = this.f30952e;
        C8299a.m35391a(valueAnimator);
        valueAnimator.setIntValues(new int[]{0, i});
        IntRef intRef = new IntRef();
        intRef.f49021a = 0;
        int i3 = i;
        int i4 = i2;
        float f2 = f;
        valueAnimator.addUpdateListener(new C8826a(intRef, this, i3, i4, f2));
        valueAnimator.addListener(new C8827b(valueAnimator, this, i3, i4, f2));
        valueAnimator.setDuration((long) (((float) Math.abs(i)) / (this.f30948a * f)));
        valueAnimator.start();
    }

    /* renamed from: b */
    private final int m37551b(int i) {
        int i2 = 0;
        int abs = Math.abs(i - this.f30953f.valueAt(0));
        int size = this.f30953f.size();
        for (int i3 = 1; i3 < size; i3++) {
            int abs2 = Math.abs(i - this.f30953f.valueAt(i3));
            if (abs > abs2) {
                i2 = i3;
                abs = abs2;
            }
        }
        return i2;
    }

    /* renamed from: e */
    private final void m37552e() {
        this.f30949b = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f30950c = Integer.MIN_VALUE;
    }
}
