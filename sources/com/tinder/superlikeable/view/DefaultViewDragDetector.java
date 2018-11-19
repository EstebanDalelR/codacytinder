package com.tinder.superlikeable.view;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.AdError;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.superlikeable.view.ViewDragDetector.Callback;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001:\b)*+,-./0BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001fH\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001fH\u0016J\u000e\u0010'\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010(\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148B@BX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/tinder/superlikeable/view/DefaultViewDragDetector;", "Lcom/tinder/superlikeable/view/ViewDragDetector;", "parent", "Landroid/view/ViewGroup;", "velocityTrackerWrapper", "Lcom/tinder/superlikeable/view/DefaultViewDragDetector$VelocityTrackerWrapper;", "dragStartCoordinatesProvider", "Lcom/tinder/superlikeable/view/DefaultViewDragDetector$DragStartCoordinatesProvider;", "childViewFinder", "Lcom/tinder/superlikeable/view/DefaultViewDragDetector$ChildViewFinder;", "motionEventIndexValidator", "Lcom/tinder/superlikeable/view/DefaultViewDragDetector$MotionEventIndexValidator;", "selectedViewHolder", "Lcom/tinder/superlikeable/view/DefaultViewDragDetector$SelectedViewHolder;", "callback", "Lcom/tinder/superlikeable/view/ViewDragDetector$Callback;", "viewSelectionPredicate", "Lcom/tinder/superlikeable/view/DefaultViewDragDetector$ViewSelectionPredicate;", "(Landroid/view/ViewGroup;Lcom/tinder/superlikeable/view/DefaultViewDragDetector$VelocityTrackerWrapper;Lcom/tinder/superlikeable/view/DefaultViewDragDetector$DragStartCoordinatesProvider;Lcom/tinder/superlikeable/view/DefaultViewDragDetector$ChildViewFinder;Lcom/tinder/superlikeable/view/DefaultViewDragDetector$MotionEventIndexValidator;Lcom/tinder/superlikeable/view/DefaultViewDragDetector$SelectedViewHolder;Lcom/tinder/superlikeable/view/ViewDragDetector$Callback;Lcom/tinder/superlikeable/view/DefaultViewDragDetector$ViewSelectionPredicate;)V", "value", "Landroid/view/View;", "selectedView", "getSelectedView", "()Landroid/view/View;", "setSelectedView", "(Landroid/view/View;)V", "checkSelectedViewNull", "", "handleOnActionCancel", "", "event", "Landroid/view/MotionEvent;", "handleOnActionDown", "handleOnActionMove", "handleOnActionPointerUp", "handleOnActionUp", "onInterceptTouchEvent", "motionEvent", "onTouchEvent", "setCallback", "setViewSelectionPredicate", "ChildViewFinder", "DragStartCoordinatesProvider", "MotionEventIndexValidator", "SelectedViewHolder", "SimpleDragDetectorCallback", "SimpleViewSelectionPredicate", "VelocityTrackerWrapper", "ViewSelectionPredicate", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
@UiThread
public final class DefaultViewDragDetector implements ViewDragDetector {
    /* renamed from: a */
    private final ViewGroup f52064a;
    /* renamed from: b */
    private final C15154g f52065b;
    /* renamed from: c */
    private final C15151b f52066c;
    /* renamed from: d */
    private final C15150a f52067d;
    /* renamed from: e */
    private final C15152c f52068e;
    /* renamed from: f */
    private final C15153d f52069f;
    /* renamed from: g */
    private Callback f52070g;
    /* renamed from: h */
    private ViewSelectionPredicate f52071h;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/superlikeable/view/DefaultViewDragDetector$ViewSelectionPredicate;", "", "isEnabled", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public interface ViewSelectionPredicate {
        boolean isEnabled();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/tinder/superlikeable/view/DefaultViewDragDetector$ChildViewFinder;", "", "()V", "findViewUnder", "Landroid/view/View;", "viewGroup", "Landroid/view/ViewGroup;", "x", "", "y", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.DefaultViewDragDetector$a */
    public static final class C15150a {
        @Nullable
        /* renamed from: a */
        public final View m57012a(@NotNull ViewGroup viewGroup, float f, float f2) {
            C2668g.b(viewGroup, "viewGroup");
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C2668g.a(childAt, "child");
                if (f >= ((float) childAt.getLeft()) && f < ((float) childAt.getRight()) && f2 >= ((float) childAt.getTop()) && f2 < ((float) childAt.getBottom())) {
                    return childAt;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/superlikeable/view/DefaultViewDragDetector$DragStartCoordinatesProvider;", "", "()V", "startPoint", "Landroid/graphics/PointF;", "get", "reset", "", "update", "x", "", "y", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.DefaultViewDragDetector$b */
    public static final class C15151b {
        /* renamed from: a */
        private final PointF f47148a = new PointF(0.0f, 0.0f);

        /* renamed from: a */
        public final void m57014a(float f, float f2) {
            this.f47148a.set(f, f2);
        }

        /* renamed from: a */
        public final void m57013a() {
            this.f47148a.set(0.0f, 0.0f);
        }

        @NotNull
        /* renamed from: b */
        public final PointF m57015b() {
            return this.f47148a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/superlikeable/view/DefaultViewDragDetector$MotionEventIndexValidator;", "", "()V", "isFirstActionIndex", "", "event", "Landroid/view/MotionEvent;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.DefaultViewDragDetector$c */
    public static final class C15152c {
        /* renamed from: a */
        public final boolean m57016a(@NotNull MotionEvent motionEvent) {
            C2668g.b(motionEvent, "event");
            return motionEvent.getActionIndex() == null ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tinder/superlikeable/view/DefaultViewDragDetector$SelectedViewHolder;", "", "()V", "selectedView", "Landroid/view/View;", "getSelectedView", "()Landroid/view/View;", "setSelectedView", "(Landroid/view/View;)V", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.DefaultViewDragDetector$d */
    public static final class C15153d {
        @Nullable
        /* renamed from: a */
        private View f47149a;

        @Nullable
        /* renamed from: a */
        public final View m57017a() {
            return this.f47149a;
        }

        /* renamed from: a */
        public final void m57018a(@Nullable View view) {
            this.f47149a = view;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0006H\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/superlikeable/view/DefaultViewDragDetector$VelocityTrackerWrapper;", "", "()V", "velocityTracker", "Landroid/view/VelocityTracker;", "addMovement", "", "motionEvent", "Landroid/view/MotionEvent;", "computeCurrentVelocity", "units", "", "createNew", "getXVelocity", "", "getYVelocity", "recycle", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.DefaultViewDragDetector$g */
    public static final class C15154g {
        /* renamed from: a */
        private VelocityTracker f47150a;

        @SuppressLint({"Recycle"})
        /* renamed from: a */
        public final void m57019a() {
            VelocityTracker velocityTracker = this.f47150a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.f47150a = VelocityTracker.obtain();
        }

        /* renamed from: a */
        public final void m57021a(@NotNull MotionEvent motionEvent) {
            C2668g.b(motionEvent, "motionEvent");
            VelocityTracker velocityTracker = this.f47150a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        /* renamed from: b */
        public final void m57022b() {
            VelocityTracker velocityTracker = this.f47150a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.f47150a = (VelocityTracker) null;
        }

        /* renamed from: a */
        public final void m57020a(int i) {
            VelocityTracker velocityTracker = this.f47150a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        /* renamed from: c */
        public final float m57023c() {
            VelocityTracker velocityTracker = this.f47150a;
            return velocityTracker != null ? velocityTracker.getXVelocity() : 0.0f;
        }

        /* renamed from: d */
        public final float m57024d() {
            VelocityTracker velocityTracker = this.f47150a;
            return velocityTracker != null ? velocityTracker.getYVelocity() : 0.0f;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J0\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lcom/tinder/superlikeable/view/DefaultViewDragDetector$SimpleDragDetectorCallback;", "Lcom/tinder/superlikeable/view/ViewDragDetector$Callback;", "()V", "onSelectedViewDiscarded", "", "view", "Landroid/view/View;", "onViewDragged", "dx", "", "dy", "startX", "startY", "onViewReleased", "vx", "vy", "onViewSelected", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.DefaultViewDragDetector$e */
    private static final class C16900e implements Callback {
        public void onSelectedViewDiscarded(@NotNull View view) {
            C2668g.b(view, "view");
        }

        public void onViewDragged(@NotNull View view, float f, float f2, float f3, float f4) {
            C2668g.b(view, "view");
        }

        public void onViewReleased(@NotNull View view, float f, float f2) {
            C2668g.b(view, "view");
        }

        public void onViewSelected(@NotNull View view) {
            C2668g.b(view, "view");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/tinder/superlikeable/view/DefaultViewDragDetector$SimpleViewSelectionPredicate;", "Lcom/tinder/superlikeable/view/DefaultViewDragDetector$ViewSelectionPredicate;", "()V", "isEnabled", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.DefaultViewDragDetector$f */
    private static final class C16901f implements ViewSelectionPredicate {
        public boolean isEnabled() {
            return false;
        }
    }

    public boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "motionEvent");
        return true;
    }

    public DefaultViewDragDetector(@NotNull ViewGroup viewGroup, @NotNull C15154g c15154g, @NotNull C15151b c15151b, @NotNull C15150a c15150a, @NotNull C15152c c15152c, @NotNull C15153d c15153d, @NotNull Callback callback, @NotNull ViewSelectionPredicate viewSelectionPredicate) {
        C2668g.b(viewGroup, "parent");
        C2668g.b(c15154g, "velocityTrackerWrapper");
        C2668g.b(c15151b, "dragStartCoordinatesProvider");
        C2668g.b(c15150a, "childViewFinder");
        C2668g.b(c15152c, "motionEventIndexValidator");
        C2668g.b(c15153d, "selectedViewHolder");
        C2668g.b(callback, "callback");
        C2668g.b(viewSelectionPredicate, "viewSelectionPredicate");
        this.f52064a = viewGroup;
        this.f52065b = c15154g;
        this.f52066c = c15151b;
        this.f52067d = c15150a;
        this.f52068e = c15152c;
        this.f52069f = c15153d;
        this.f52070g = callback;
        this.f52071h = viewSelectionPredicate;
    }

    public /* synthetic */ DefaultViewDragDetector(ViewGroup viewGroup, C15154g c15154g, C15151b c15151b, C15150a c15150a, C15152c c15152c, C15153d c15153d, Callback callback, ViewSelectionPredicate viewSelectionPredicate, int i, C15823e c15823e) {
        int i2 = i;
        this(viewGroup, (i2 & 2) != 0 ? new C15154g() : c15154g, (i2 & 4) != 0 ? new C15151b() : c15151b, (i2 & 8) != 0 ? new C15150a() : c15150a, (i2 & 16) != 0 ? new C15152c() : c15152c, (i2 & 32) != 0 ? new C15153d() : c15153d, (i2 & 64) != 0 ? new C16900e() : callback, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? new C16901f() : viewSelectionPredicate);
    }

    /* renamed from: a */
    private final void m62500a(View view) {
        this.f52069f.m57018a(view);
    }

    /* renamed from: a */
    private final View m62499a() {
        return this.f52069f.m57017a();
    }

    /* renamed from: a */
    public final void m62508a(@NotNull Callback callback) {
        C2668g.b(callback, "callback");
        this.f52070g = callback;
    }

    /* renamed from: a */
    public final void m62507a(@NotNull ViewSelectionPredicate viewSelectionPredicate) {
        C2668g.b(viewSelectionPredicate, "viewSelectionPredicate");
        this.f52071h = viewSelectionPredicate;
    }

    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "motionEvent");
        boolean z = false;
        if (!this.f52068e.m57016a(motionEvent)) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 6) {
            switch (actionMasked) {
                case 0:
                    z = m62501a(motionEvent);
                    break;
                case 1:
                    z = m62505c(motionEvent);
                    break;
                case 2:
                    z = m62506d(motionEvent);
                    break;
                case 3:
                    z = m62503b(motionEvent);
                    break;
                default:
                    break;
            }
        }
        z = m62502b();
        return z;
    }

    /* renamed from: a */
    private final boolean m62501a(MotionEvent motionEvent) {
        if (!this.f52071h.isEnabled()) {
            return false;
        }
        m62504c();
        View a = this.f52067d.m57012a(this.f52064a, motionEvent.getX(), motionEvent.getY());
        if (a == null) {
            return false;
        }
        m62500a(a);
        this.f52066c.m57014a(motionEvent.getX(), motionEvent.getY());
        this.f52065b.m57019a();
        this.f52065b.m57021a(motionEvent);
        this.f52070g.onViewSelected(a);
        return true;
    }

    /* renamed from: b */
    private final boolean m62503b(MotionEvent motionEvent) {
        motionEvent = m62499a();
        if (motionEvent == null) {
            return null;
        }
        this.f52070g.onSelectedViewDiscarded(motionEvent);
        this.f52066c.m57013a();
        this.f52065b.m57022b();
        m62500a((View) null);
        return true;
    }

    /* renamed from: c */
    private final boolean m62505c(MotionEvent motionEvent) {
        View a = m62499a();
        if (a == null) {
            return null;
        }
        this.f52065b.m57021a(motionEvent);
        this.f52065b.m57020a((int) AdError.NETWORK_ERROR_CODE);
        this.f52070g.onViewReleased(a, this.f52065b.m57023c(), this.f52065b.m57024d());
        this.f52065b.m57022b();
        this.f52066c.m57013a();
        m62500a((View) null);
        return true;
    }

    /* renamed from: d */
    private final boolean m62506d(MotionEvent motionEvent) {
        View a = m62499a();
        if (a == null) {
            return null;
        }
        PointF b = this.f52066c.m57015b();
        float x = motionEvent.getX() - b.x;
        float y = motionEvent.getY() - b.y;
        this.f52070g.onViewDragged(a, x, y, b.x, b.y);
        this.f52065b.m57021a(motionEvent);
        return true;
    }

    /* renamed from: b */
    private final boolean m62502b() {
        View a = m62499a();
        if (a == null) {
            return false;
        }
        this.f52070g.onSelectedViewDiscarded(a);
        this.f52066c.m57013a();
        this.f52065b.m57022b();
        m62500a((View) null);
        return true;
    }

    /* renamed from: c */
    private final void m62504c() {
        if ((m62499a() == null ? 1 : null) == null) {
            throw new IllegalStateException("Check Implementation, Selected View should be null".toString());
        }
    }
}
