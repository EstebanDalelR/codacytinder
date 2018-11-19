package com.tinder.design.togglenavigationview;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/design/togglenavigationview/ScrollDetector;", "", "container", "Lcom/tinder/design/togglenavigationview/ScrollingViewContainer;", "childViewFinder", "Lcom/tinder/design/togglenavigationview/ScrollDetector$ChildViewFinder;", "scrollStateHolder", "Lcom/tinder/design/togglenavigationview/ScrollDetector$ScrollStateHolder;", "(Lcom/tinder/design/togglenavigationview/ScrollingViewContainer;Lcom/tinder/design/togglenavigationview/ScrollDetector$ChildViewFinder;Lcom/tinder/design/togglenavigationview/ScrollDetector$ScrollStateHolder;)V", "handleOnActionDown", "", "event", "Landroid/view/MotionEvent;", "handleOnActionMove", "handleOnActionUp", "isScrolling", "", "isValidActionIndex", "onTouchEvent", "ev", "ChildViewFinder", "ScrollStateHolder", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
public final class ScrollDetector {
    /* renamed from: a */
    private final ScrollingViewContainer f30957a;
    /* renamed from: b */
    private final ChildViewFinder f30958b;
    /* renamed from: c */
    private final C8828a f30959c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/tinder/design/togglenavigationview/ScrollDetector$ChildViewFinder;", "", "findViewUnder", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "hitTest", "", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
    public interface ChildViewFinder {
        @Nullable
        View findViewUnder(@NotNull MotionEvent motionEvent);

        boolean hitTest(@NotNull MotionEvent motionEvent);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/tinder/design/togglenavigationview/ScrollDetector$ScrollStateHolder;", "", "()V", "isScrolling", "", "()Z", "setScrolling", "(Z)V", "startX", "", "getStartX", "()I", "setStartX", "(I)V", "totalScroll", "getTotalScroll", "setTotalScroll", "togglenavigationview_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.design.togglenavigationview.ScrollDetector$a */
    public static final class C8828a {
        /* renamed from: a */
        private int f30954a;
        /* renamed from: b */
        private int f30955b;
        /* renamed from: c */
        private boolean f30956c;

        /* renamed from: a */
        public final int m37560a() {
            return this.f30954a;
        }

        /* renamed from: a */
        public final void m37561a(int i) {
            this.f30954a = i;
        }

        /* renamed from: b */
        public final int m37563b() {
            return this.f30955b;
        }

        /* renamed from: b */
        public final void m37564b(int i) {
            this.f30955b = i;
        }

        /* renamed from: a */
        public final void m37562a(boolean z) {
            this.f30956c = z;
        }

        /* renamed from: c */
        public final boolean m37565c() {
            return this.f30956c;
        }
    }

    public ScrollDetector(@NotNull ScrollingViewContainer scrollingViewContainer, @NotNull ChildViewFinder childViewFinder, @NotNull C8828a c8828a) {
        C2668g.b(scrollingViewContainer, "container");
        C2668g.b(childViewFinder, "childViewFinder");
        C2668g.b(c8828a, "scrollStateHolder");
        this.f30957a = scrollingViewContainer;
        this.f30958b = childViewFinder;
        this.f30959c = c8828a;
    }

    public /* synthetic */ ScrollDetector(ScrollingViewContainer scrollingViewContainer, ChildViewFinder childViewFinder, C8828a c8828a, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            c8828a = new C8828a();
        }
        this(scrollingViewContainer, childViewFinder, c8828a);
    }

    /* renamed from: a */
    public final boolean m37571a() {
        return this.f30959c.m37565c();
    }

    /* renamed from: a */
    public final void m37570a(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "ev");
        int actionMasked = motionEvent.getActionMasked();
        if (m37569e(motionEvent)) {
            if (actionMasked != 6) {
                switch (actionMasked) {
                    case 0:
                        m37566b(motionEvent);
                        break;
                    case 1:
                    case 3:
                        break;
                    case 2:
                        m37567c(motionEvent);
                        break;
                    default:
                        break;
                }
            }
            m37568d(motionEvent);
        }
    }

    /* renamed from: b */
    private final void m37566b(MotionEvent motionEvent) {
        if ((this.f30959c.m37565c() ^ 1) == 0) {
            motionEvent = new StringBuilder();
            motionEvent.append("Check Implementation. Scrolling state should be false but is ");
            motionEvent.append(this.f30959c.m37565c());
            throw new IllegalStateException(motionEvent.toString().toString());
        } else if (this.f30958b.hitTest(motionEvent)) {
            this.f30959c.m37561a((int) motionEvent.getX());
            this.f30959c.m37562a(true);
            this.f30957a.onScrollStarted();
            this.f30957a.requestDisallowInterceptTouchEvent(true);
        } else {
            View findViewUnder = this.f30958b.findViewUnder(motionEvent);
            if (findViewUnder != null) {
                findViewUnder.dispatchTouchEvent(motionEvent);
            }
        }
    }

    /* renamed from: c */
    private final void m37567c(MotionEvent motionEvent) {
        if (this.f30959c.m37565c()) {
            motionEvent = this.f30957a.onPreScroll((((int) motionEvent.getX()) - this.f30959c.m37560a()) - this.f30959c.m37563b());
            this.f30957a.onScroll(motionEvent);
            C8828a c8828a = this.f30959c;
            c8828a.m37564b(c8828a.m37563b() + motionEvent);
        }
    }

    /* renamed from: d */
    private final void m37568d(MotionEvent motionEvent) {
        if (this.f30959c.m37565c()) {
            this.f30959c.m37561a(0);
            this.f30959c.m37564b(0);
            this.f30959c.m37562a(false);
            this.f30957a.onScrollFinished();
            this.f30957a.requestDisallowInterceptTouchEvent(false);
            return;
        }
        View findViewUnder = this.f30958b.findViewUnder(motionEvent);
        if (findViewUnder != null) {
            findViewUnder.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: e */
    private final boolean m37569e(MotionEvent motionEvent) {
        return motionEvent.getActionIndex() == null ? true : null;
    }
}
