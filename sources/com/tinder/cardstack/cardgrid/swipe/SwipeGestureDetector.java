package com.tinder.cardstack.cardgrid.swipe;

import android.view.MotionEvent;
import com.tinder.cardstack.cardgrid.swipe.PointerTracker.Listener;
import com.tinder.cardstack.cardgrid.swipe.p186a.C8378a;
import com.tinder.cardstack.model.SwipeDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0007#$%&'()B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\"R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector;", "", "touchInterceptPredicate", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$TouchInterceptPredicate;", "swipeActionRecognizer", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$SwipeActionRecognizer;", "clickActionRecognizer", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$ClickActionRecognizer;", "(Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$TouchInterceptPredicate;Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$SwipeActionRecognizer;Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$ClickActionRecognizer;)V", "actionRecognizer", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$ActionRecognizer;", "getClickActionRecognizer$cardstack_release", "()Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$ClickActionRecognizer;", "onGestureListener", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$OnGestureListener;", "getOnGestureListener$cardstack_release", "()Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$OnGestureListener;", "setOnGestureListener$cardstack_release", "(Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$OnGestureListener;)V", "pointerTracker", "Lcom/tinder/cardstack/cardgrid/swipe/PointerTracker;", "getSwipeActionRecognizer$cardstack_release", "()Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$SwipeActionRecognizer;", "getTouchInterceptPredicate$cardstack_release", "()Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$TouchInterceptPredicate;", "touchInterceptor", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$TouchInterceptor;", "handleTouchEvent", "", "event", "Landroid/view/MotionEvent;", "handleTouchEvent$cardstack_release", "shouldInterceptTouchEvent", "", "shouldInterceptTouchEvent$cardstack_release", "Action", "ActionRecognizer", "ClickActionRecognizer", "OnGestureListener", "SwipeActionRecognizer", "TouchInterceptPredicate", "TouchInterceptor", "cardstack_release"}, k = 1, mv = {1, 1, 9})
public final class SwipeGestureDetector {
    @Nullable
    /* renamed from: a */
    private OnGestureListener f29742a;
    /* renamed from: b */
    private final PointerTracker f29743b = new PointerTracker();
    /* renamed from: c */
    private final C10468c f29744c = new C10468c(this);
    /* renamed from: d */
    private final C10467b f29745d = new C10467b(this);
    @NotNull
    /* renamed from: e */
    private final TouchInterceptPredicate f29746e;
    @NotNull
    /* renamed from: f */
    private final SwipeActionRecognizer f29747f;
    @NotNull
    /* renamed from: g */
    private final ClickActionRecognizer f29748g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$ClickActionRecognizer;", "", "isClick", "", "pointer", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    public interface ClickActionRecognizer {
        boolean isClick(@NotNull C8378a c8378a);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$OnGestureListener;", "", "onClick", "", "pointer", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "onMove", "onRecover", "onSwipe", "swipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    public interface OnGestureListener {
        void onClick(@NotNull C8378a c8378a);

        void onMove(@NotNull C8378a c8378a);

        void onRecover(@NotNull C8378a c8378a);

        void onSwipe(@NotNull C8378a c8378a, @NotNull SwipeDirection swipeDirection);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$SwipeActionRecognizer;", "", "findSwipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "pointer", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    public interface SwipeActionRecognizer {
        @NotNull
        SwipeDirection findSwipeDirection(@NotNull C8378a c8378a);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$TouchInterceptPredicate;", "", "shouldIntercept", "", "pointer", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    public interface TouchInterceptPredicate {
        boolean shouldIntercept(@NotNull C8378a c8378a);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$Action;", "", "()V", "CLICK", "RECOVER", "SWIPE", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$Action$SWIPE;", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$Action$CLICK;", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$Action$RECOVER;", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector$a */
    private static abstract class C8377a {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$Action$CLICK;", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$Action;", "()V", "cardstack_release"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector$a$a */
        public static final class C10464a extends C8377a {
            /* renamed from: a */
            public static final C10464a f34070a = new C10464a();

            private C10464a() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$Action$RECOVER;", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$Action;", "()V", "cardstack_release"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector$a$b */
        public static final class C10465b extends C8377a {
            /* renamed from: a */
            public static final C10465b f34071a = new C10465b();

            private C10465b() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$Action$SWIPE;", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$Action;", "swipeDirection", "Lcom/tinder/cardstack/model/SwipeDirection;", "(Lcom/tinder/cardstack/model/SwipeDirection;)V", "getSwipeDirection", "()Lcom/tinder/cardstack/model/SwipeDirection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "cardstack_release"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector$a$c */
        public static final class C10466c extends C8377a {
            @NotNull
            /* renamed from: a */
            private final SwipeDirection f34072a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C10466c) {
                        if (C2668g.a(this.f34072a, ((C10466c) obj).f34072a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                SwipeDirection swipeDirection = this.f34072a;
                return swipeDirection != null ? swipeDirection.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SWIPE(swipeDirection=");
                stringBuilder.append(this.f34072a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C10466c(@NotNull SwipeDirection swipeDirection) {
                C2668g.b(swipeDirection, "swipeDirection");
                super();
                this.f34072a = swipeDirection;
            }

            @NotNull
            /* renamed from: a */
            public final SwipeDirection m42333a() {
                return this.f34072a;
            }
        }

        private C8377a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u000b"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$ActionRecognizer;", "Lcom/tinder/cardstack/cardgrid/swipe/PointerTracker$Listener;", "(Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector;)V", "onPointerDown", "", "pointer", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "onPointerMove", "onPointerUp", "recognizeAction", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$Action;", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector$b */
    private final class C10467b implements Listener {
        /* renamed from: a */
        final /* synthetic */ SwipeGestureDetector f34073a;

        public void onPointerDown(@NotNull C8378a c8378a) {
            C2668g.b(c8378a, "pointer");
        }

        public C10467b(SwipeGestureDetector swipeGestureDetector) {
            this.f34073a = swipeGestureDetector;
        }

        public void onPointerMove(@NotNull C8378a c8378a) {
            C2668g.b(c8378a, "pointer");
            OnGestureListener a = this.f34073a.m35718a();
            if (a != null) {
                a.onMove(c8378a);
            }
        }

        public void onPointerUp(@NotNull C8378a c8378a) {
            C2668g.b(c8378a, "pointer");
            C8377a a = m42334a(c8378a);
            OnGestureListener a2;
            if (a instanceof C10464a) {
                a2 = this.f34073a.m35718a();
                if (a2 != null) {
                    a2.onClick(c8378a);
                }
            } else if (a instanceof C10466c) {
                OnGestureListener a3 = this.f34073a.m35718a();
                if (a3 != null) {
                    a3.onSwipe(c8378a, ((C10466c) a).m42333a());
                }
            } else {
                a2 = this.f34073a.m35718a();
                if (a2 != null) {
                    a2.onRecover(c8378a);
                }
            }
        }

        /* renamed from: a */
        private final C8377a m42334a(C8378a c8378a) {
            if (this.f34073a.m35724d().isClick(c8378a)) {
                return (C8377a) C10464a.f34070a;
            }
            c8378a = this.f34073a.m35723c().findSwipeDirection(c8378a);
            if ((C2668g.a(c8378a, SwipeDirection.NONE) ^ 1) != 0) {
                return new C10466c(c8378a);
            }
            return (C8377a) C10465b.f34071a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$TouchInterceptor;", "Lcom/tinder/cardstack/cardgrid/swipe/PointerTracker$Listener;", "(Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector;)V", "isInterceptingTouchEvent", "", "isInterceptingTouchEvent$cardstack_release", "()Z", "setInterceptingTouchEvent$cardstack_release", "(Z)V", "onPointerDown", "", "pointer", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "onPointerMove", "onPointerUp", "startInterceptingIfNeeded", "stopInterceptingIfNeeded", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector$c */
    private final class C10468c implements Listener {
        /* renamed from: a */
        final /* synthetic */ SwipeGestureDetector f34074a;
        /* renamed from: b */
        private boolean f34075b;

        public void onPointerDown(@NotNull C8378a c8378a) {
            C2668g.b(c8378a, "pointer");
        }

        public C10468c(SwipeGestureDetector swipeGestureDetector) {
            this.f34074a = swipeGestureDetector;
        }

        /* renamed from: a */
        public final boolean m42337a() {
            return this.f34075b;
        }

        public void onPointerMove(@NotNull C8378a c8378a) {
            C2668g.b(c8378a, "pointer");
            m42335a(c8378a);
            if (this.f34075b) {
                this.f34074a.f29745d.onPointerMove(c8378a);
            }
        }

        public void onPointerUp(@NotNull C8378a c8378a) {
            C2668g.b(c8378a, "pointer");
            if (this.f34075b) {
                this.f34074a.f29745d.onPointerUp(c8378a);
            }
            m42336b();
        }

        /* renamed from: a */
        private final void m42335a(C8378a c8378a) {
            if (!this.f34075b && this.f34074a.m35721b().shouldIntercept(c8378a) != null) {
                this.f34075b = true;
            }
        }

        /* renamed from: b */
        private final void m42336b() {
            if (this.f34074a.f29743b.m35712a().isEmpty()) {
                this.f34075b = false;
                this.f34074a.f29743b.m35715b();
            }
        }
    }

    public SwipeGestureDetector(@NotNull TouchInterceptPredicate touchInterceptPredicate, @NotNull SwipeActionRecognizer swipeActionRecognizer, @NotNull ClickActionRecognizer clickActionRecognizer) {
        C2668g.b(touchInterceptPredicate, "touchInterceptPredicate");
        C2668g.b(swipeActionRecognizer, "swipeActionRecognizer");
        C2668g.b(clickActionRecognizer, "clickActionRecognizer");
        this.f29746e = touchInterceptPredicate;
        this.f29747f = swipeActionRecognizer;
        this.f29748g = clickActionRecognizer;
        this.f29743b.m35714a((Listener) this.f29744c);
    }

    @NotNull
    /* renamed from: b */
    public final TouchInterceptPredicate m35721b() {
        return this.f29746e;
    }

    @NotNull
    /* renamed from: c */
    public final SwipeActionRecognizer m35723c() {
        return this.f29747f;
    }

    @NotNull
    /* renamed from: d */
    public final ClickActionRecognizer m35724d() {
        return this.f29748g;
    }

    @Nullable
    /* renamed from: a */
    public final OnGestureListener m35718a() {
        return this.f29742a;
    }

    /* renamed from: a */
    public final void m35719a(@Nullable OnGestureListener onGestureListener) {
        this.f29742a = onGestureListener;
    }

    /* renamed from: a */
    public final boolean m35720a(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        m35722b(motionEvent);
        return this.f29744c.m42337a();
    }

    /* renamed from: b */
    public final void m35722b(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        this.f29743b.m35713a(motionEvent);
    }
}
