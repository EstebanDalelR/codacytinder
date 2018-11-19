package com.tinder.superlikeable.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.domain.recs.model.Swipe.Method;
import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.superlikeable.view.DefaultViewDragDetector.ViewSelectionPredicate;
import com.tinder.superlikeable.view.SuperLikeableViewDragHelper.DragStateChangeCallback;
import com.tinder.superlikeable.view.ViewDragDetector.Callback;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003JKLB\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u001e\b\u0002\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012j\u0002`\u0016\u0012\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00150\u0018j\u0002`\u0019\u0012\u0012\b\u0002\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u00150\u001bj\u0002`\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\b\u00100\u001a\u00020\u0015H\u0002J\b\u00101\u001a\u00020\u0015H\u0002J\f\u00102\u001a\u000603j\u0002`4H\u0002J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0014\u00109\u001a\u00020\u00152\n\u0010:\u001a\u000603j\u0002`4H\u0016J\u000e\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020=J\u0010\u0010>\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u0013H\u0016J\u000e\u0010@\u001a\u0002062\u0006\u0010<\u001a\u00020=J0\u0010A\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u00132\u0006\u0010B\u001a\u0002082\u0006\u0010C\u001a\u0002082\u0006\u0010D\u001a\u0002082\u0006\u0010E\u001a\u000208H\u0016J \u0010F\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u00132\u0006\u0010G\u001a\u0002082\u0006\u0010H\u001a\u000208H\u0016J\u0010\u0010I\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u0013H\u0016R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R$\u0010 \u001a\f\u0012\u0004\u0012\u00020\u00150\u001bj\u0002`!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R0\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012j\u0002`\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00150\u0018j\u0002`\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u00150\u001bj\u0002`\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableGridLayoutController;", "Lcom/tinder/superlikeable/view/ViewDragDetector$Callback;", "Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper$DragStateChangeCallback;", "superLikeableViewGroup", "Landroid/view/ViewGroup;", "clickThreshold", "", "superLikeableFlingDetector", "Lcom/tinder/superlikeable/view/SuperLikeableFlingDetector;", "superLikeableViewDragHelper", "Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper;", "viewDragDetector", "Lcom/tinder/superlikeable/view/DefaultViewDragDetector;", "viewSelectionPredicate", "Lcom/tinder/superlikeable/view/SuperLikeableGridLayoutController$ViewSelectionPredicate;", "currentDragStateHolder", "Lcom/tinder/superlikeable/view/SuperLikeableGridLayoutController$CurrentDragStateHolder;", "onViewFlingListener", "Lkotlin/Function2;", "Landroid/view/View;", "Lcom/tinder/domain/recs/model/Swipe$Method;", "", "Lcom/tinder/superlikeable/view/OnViewFlingListener;", "onViewSelectedListener", "Lkotlin/Function1;", "Lcom/tinder/superlikeable/view/OnViewSelectedListener;", "onViewUnselectedListener", "Lkotlin/Function0;", "Lcom/tinder/superlikeable/view/OnViewUnselectedListener;", "clickDetector", "Lcom/tinder/superlikeable/view/SuperLikeableGridLayoutController$ClickDetector;", "(Landroid/view/ViewGroup;ILcom/tinder/superlikeable/view/SuperLikeableFlingDetector;Lcom/tinder/superlikeable/view/SuperLikeableViewDragHelper;Lcom/tinder/superlikeable/view/DefaultViewDragDetector;Lcom/tinder/superlikeable/view/SuperLikeableGridLayoutController$ViewSelectionPredicate;Lcom/tinder/superlikeable/view/SuperLikeableGridLayoutController$CurrentDragStateHolder;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/tinder/superlikeable/view/SuperLikeableGridLayoutController$ClickDetector;)V", "onFlingCompleteListener", "Lcom/tinder/superlikeable/view/OnFlingCompleteListener;", "getOnFlingCompleteListener", "()Lkotlin/jvm/functions/Function0;", "setOnFlingCompleteListener", "(Lkotlin/jvm/functions/Function0;)V", "getOnViewFlingListener", "()Lkotlin/jvm/functions/Function2;", "setOnViewFlingListener", "(Lkotlin/jvm/functions/Function2;)V", "getOnViewSelectedListener", "()Lkotlin/jvm/functions/Function1;", "setOnViewSelectedListener", "(Lkotlin/jvm/functions/Function1;)V", "getOnViewUnselectedListener", "setOnViewUnselectedListener", "checkStateIdle", "checkStateSelectedOrDrag", "currentDragState", "", "Lcom/tinder/superlikeable/view/DragState;", "isDirectionUpward", "", "translationY", "", "onDragStateChange", "dragState", "onInterceptTouchEvent", "motionEvent", "Landroid/view/MotionEvent;", "onSelectedViewDiscarded", "view", "onTouchEvent", "onViewDragged", "dx", "dy", "startX", "startY", "onViewReleased", "velocityX", "velocityY", "onViewSelected", "ClickDetector", "CurrentDragStateHolder", "ViewSelectionPredicate", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.view.b */
public final class C16907b implements DragStateChangeCallback, Callback {
    @NotNull
    /* renamed from: a */
    private Function0<C15813i> f52096a;
    /* renamed from: b */
    private final int f52097b;
    /* renamed from: c */
    private final C16905a f52098c;
    /* renamed from: d */
    private final SuperLikeableViewDragHelper f52099d;
    /* renamed from: e */
    private final DefaultViewDragDetector f52100e;
    /* renamed from: f */
    private final C16906c f52101f;
    /* renamed from: g */
    private final C15174b f52102g;
    @NotNull
    /* renamed from: h */
    private Function2<? super View, ? super Method, C15813i> f52103h;
    @NotNull
    /* renamed from: i */
    private Function1<? super View, C15813i> f52104i;
    @NotNull
    /* renamed from: j */
    private Function0<C15813i> f52105j;
    /* renamed from: k */
    private final C15173a f52106k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\nJ\f\u0010\u0012\u001a\u00020\b*\u00020\u0003H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableGridLayoutController$ClickDetector;", "", "clickThreshold", "", "trackingStateHolder", "Lcom/tinder/superlikeable/view/SuperLikeableGridLayoutController$ClickDetector$TrackingStateHolder;", "(FLcom/tinder/superlikeable/view/SuperLikeableGridLayoutController$ClickDetector$TrackingStateHolder;)V", "squaredThreshold", "", "onViewDragged", "", "selectedView", "Landroid/view/View;", "deltaX", "deltaY", "onViewReleased", "onViewSelected", "stopTracking", "squared", "TrackingStateHolder", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.b$a */
    public static final class C15173a {
        /* renamed from: a */
        private final double f47199a;
        /* renamed from: b */
        private final C15172a f47200b;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableGridLayoutController$ClickDetector$TrackingStateHolder;", "", "()V", "selectedView", "Landroid/view/View;", "getSelectedView", "()Landroid/view/View;", "setSelectedView", "(Landroid/view/View;)V", "isTracking", "", "stopTracking", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.superlikeable.view.b$a$a */
        public static final class C15172a {
            @Nullable
            /* renamed from: a */
            private View f47198a;

            @Nullable
            /* renamed from: a */
            public final View m57056a() {
                return this.f47198a;
            }

            /* renamed from: a */
            public final void m57057a(@Nullable View view) {
                this.f47198a = view;
            }

            /* renamed from: b */
            public final void m57058b() {
                this.f47198a = (View) null;
            }

            /* renamed from: c */
            public final boolean m57059c() {
                return this.f47198a != null;
            }
        }

        public C15173a(float f, @NotNull C15172a c15172a) {
            C2668g.b(c15172a, "trackingStateHolder");
            this.f47200b = c15172a;
            this.f47199a = m57060a(f);
        }

        public /* synthetic */ C15173a(float f, C15172a c15172a, int i, C15823e c15823e) {
            if ((i & 2) != 0) {
                c15172a = new C15172a();
            }
            this(f, c15172a);
        }

        /* renamed from: a */
        public final void m57062a(@NotNull View view) {
            C2668g.b(view, "selectedView");
            this.f47200b.m57057a(view);
        }

        /* renamed from: b */
        public final void m57064b(@NotNull View view) {
            C2668g.b(view, "selectedView");
            if (!this.f47200b.m57059c()) {
                return;
            }
            if (C2668g.a(this.f47200b.m57056a(), view)) {
                if (m57060a(view.getTranslationX()) + m57060a(view.getTranslationY()) < this.f47199a) {
                    view.performClick();
                }
                this.f47200b.m57058b();
                return;
            }
            throw new IllegalStateException("Selected View not equal to Released view".toString());
        }

        /* renamed from: a */
        public final void m57063a(@NotNull View view, float f, float f2) {
            C2668g.b(view, "selectedView");
            if (!this.f47200b.m57059c()) {
                return;
            }
            if (C2668g.a(this.f47200b.m57056a(), view) == null) {
                throw ((Throwable) new IllegalStateException("Selected View not equal to Dragged view".toString()));
            }
            if (m57060a(f) + m57060a(f2) >= this.f47199a) {
                this.f47200b.m57058b();
            }
        }

        /* renamed from: a */
        public final void m57061a() {
            this.f47200b.m57058b();
        }

        /* renamed from: a */
        private final double m57060a(float f) {
            return Math.pow((double) f, 2.0d);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableGridLayoutController$CurrentDragStateHolder;", "", "()V", "dragState", "", "Lcom/tinder/superlikeable/view/DragState;", "getDragState", "()B", "setDragState", "(B)V", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.b$b */
    public static final class C15174b {
        /* renamed from: a */
        private byte f47201a;

        /* renamed from: a */
        public final byte m57065a() {
            return this.f47201a;
        }

        /* renamed from: a */
        public final void m57066a(byte b) {
            this.f47201a = b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/superlikeable/view/SuperLikeableGridLayoutController$ViewSelectionPredicate;", "Lcom/tinder/superlikeable/view/DefaultViewDragDetector$ViewSelectionPredicate;", "()V", "isSelectionEnabled", "", "()Z", "setSelectionEnabled", "(Z)V", "isEnabled", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.b$c */
    public static final class C16906c implements ViewSelectionPredicate {
        /* renamed from: a */
        private boolean f52095a = true;

        /* renamed from: a */
        public final void m62540a(boolean z) {
            this.f52095a = z;
        }

        public boolean isEnabled() {
            return this.f52095a;
        }
    }

    /* renamed from: a */
    private final boolean m62541a(float f) {
        return f < ((float) null);
    }

    public C16907b(@NotNull ViewGroup viewGroup, int i, @NotNull C16905a c16905a, @NotNull SuperLikeableViewDragHelper superLikeableViewDragHelper, @NotNull DefaultViewDragDetector defaultViewDragDetector, @NotNull C16906c c16906c, @NotNull C15174b c15174b, @NotNull Function2<? super View, ? super Method, C15813i> function2, @NotNull Function1<? super View, C15813i> function1, @NotNull Function0<C15813i> function0, @NotNull C15173a c15173a) {
        C2668g.b(viewGroup, "superLikeableViewGroup");
        C2668g.b(c16905a, "superLikeableFlingDetector");
        C2668g.b(superLikeableViewDragHelper, "superLikeableViewDragHelper");
        C2668g.b(defaultViewDragDetector, "viewDragDetector");
        C2668g.b(c16906c, "viewSelectionPredicate");
        C2668g.b(c15174b, "currentDragStateHolder");
        C2668g.b(function2, "onViewFlingListener");
        C2668g.b(function1, "onViewSelectedListener");
        C2668g.b(function0, "onViewUnselectedListener");
        C2668g.b(c15173a, "clickDetector");
        this.f52097b = i;
        this.f52098c = c16905a;
        this.f52099d = superLikeableViewDragHelper;
        this.f52100e = defaultViewDragDetector;
        this.f52101f = c16906c;
        this.f52102g = c15174b;
        this.f52103h = function2;
        this.f52104i = function1;
        this.f52105j = function0;
        this.f52106k = c15173a;
        this.f52096a = (Function0) SuperLikeableGridLayoutController$onFlingCompleteListener$1.f58607a;
        this.f52099d.m57051a((DragStateChangeCallback) this);
        this.f52100e.m62508a((Callback) this);
        this.f52100e.m62507a((ViewSelectionPredicate) this.f52101f);
    }

    public /* synthetic */ C16907b(ViewGroup viewGroup, int i, C16905a c16905a, SuperLikeableViewDragHelper superLikeableViewDragHelper, DefaultViewDragDetector defaultViewDragDetector, C16906c c16906c, C15174b c15174b, Function2 function2, Function1 function1, Function0 function0, C15173a c15173a, int i2, C15823e c15823e) {
        int i3;
        C15173a c15173a2;
        int i4 = i2;
        DefaultViewDragDetector defaultViewDragDetector2 = (i4 & 16) != 0 ? new DefaultViewDragDetector(viewGroup, null, null, null, null, null, null, null, 254, null) : defaultViewDragDetector;
        C16906c c16906c2 = (i4 & 32) != 0 ? new C16906c() : c16906c;
        C15174b c15174b2 = (i4 & 64) != 0 ? new C15174b() : c15174b;
        Function2 a = (i4 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? C15175c.m57067a() : function2;
        Function1 function12 = (i4 & 256) != 0 ? SuperLikeableGridLayoutController$1.f58605a : function1;
        Function0 function02 = (i4 & 512) != 0 ? SuperLikeableGridLayoutController$2.f58606a : function0;
        if ((i4 & 1024) != 0) {
            i3 = i;
            c15173a2 = new C15173a((float) i3, null, 2, null);
        } else {
            i3 = i;
            c15173a2 = c15173a;
        }
        this(viewGroup, i3, c16905a, superLikeableViewDragHelper, defaultViewDragDetector2, c16906c2, c15174b2, a, function12, function02, c15173a2);
    }

    @NotNull
    /* renamed from: a */
    public final Function2<View, Method, C15813i> m62545a() {
        return this.f52103h;
    }

    /* renamed from: a */
    public final void m62548a(@NotNull Function2<? super View, ? super Method, C15813i> function2) {
        C2668g.b(function2, "<set-?>");
        this.f52103h = function2;
    }

    /* renamed from: a */
    public final void m62547a(@NotNull Function1<? super View, C15813i> function1) {
        C2668g.b(function1, "<set-?>");
        this.f52104i = function1;
    }

    /* renamed from: b */
    public final void m62550b(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "<set-?>");
        this.f52105j = function0;
    }

    /* renamed from: a */
    public final void m62546a(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "<set-?>");
        this.f52096a = function0;
    }

    /* renamed from: a */
    public final boolean m62549a(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "motionEvent");
        return this.f52100e.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public final boolean m62551b(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "motionEvent");
        boolean z = true;
        if (motionEvent.getActionIndex() != null) {
            return true;
        }
        if (m62542b() == null) {
            z = false;
        }
        return z;
    }

    public void onDragStateChange(byte b) {
        this.f52102g.m57066a(b);
        this.f52101f.m62540a(b == (byte) 0);
        if (b == (byte) 5) {
            this.f52096a.invoke();
        }
    }

    public void onViewSelected(@NotNull View view) {
        C2668g.b(view, "view");
        m62544d();
        this.f52104i.invoke(view);
        this.f52099d.m57048a(view);
        this.f52106k.m57062a(view);
    }

    public void onSelectedViewDiscarded(@NotNull View view) {
        C2668g.b(view, "view");
        m62543c();
        this.f52105j.invoke();
        this.f52099d.m57053b(view);
        this.f52106k.m57061a();
    }

    public void onViewReleased(@NotNull View view, float f, float f2) {
        C2668g.b(view, "view");
        m62543c();
        if (m62541a(view.getTranslationY()) && this.f52098c.isFling(f, f2)) {
            this.f52099d.m57049a(view, f, f2);
            this.f52103h.invoke(view, SwipeMethod.CARD);
            this.f52106k.m57061a();
            return;
        }
        this.f52106k.m57064b(view);
        this.f52099d.m57053b(view);
    }

    public void onViewDragged(@NotNull View view, float f, float f2, float f3, float f4) {
        C2668g.b(view, "view");
        m62543c();
        this.f52099d.m57050a(view, f, f2, f3, f4);
        this.f52106k.m57063a(view, f, f2);
    }

    /* renamed from: b */
    private final byte m62542b() {
        return this.f52102g.m57065a();
    }

    /* renamed from: c */
    private final void m62543c() {
        Object obj = 1;
        if (m62542b() != (byte) 1) {
            if (m62542b() != (byte) 3) {
                obj = null;
            }
        }
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Check implementation, state should be STATE_SELECTED || STATE_DRAG, ");
            stringBuilder.append("curr = ");
            stringBuilder.append(C15178e.m57069a(m62542b()));
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
    }

    /* renamed from: d */
    private final void m62544d() {
        if ((m62542b() == (byte) 0 ? 1 : null) == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Check implementation, state should be STATE_IDLE, curr = ");
            stringBuilder.append(C15178e.m57069a(m62542b()));
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
    }
}
