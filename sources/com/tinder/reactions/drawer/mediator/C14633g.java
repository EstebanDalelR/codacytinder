package com.tinder.reactions.drawer.mediator;

import android.view.View;
import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.reactions.common.view.DynamicSlidingViewInterface;
import com.tinder.reactions.common.view.SlidingViewInterface;
import com.tinder.reactions.drawer.model.C14635a;
import com.tinder.reactions.drawer.model.SlideType;
import com.tinder.reactions.drawer.provider.C16327e;
import com.tinder.reactions.drawer.provider.event.DrawerState;
import com.tinder.reactions.drawer.provider.event.DrawerState.EventType;
import com.tinder.reactions.drawer.view.DragHandleView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u0006\u0010\u0013\u001a\u00020\u000eJ\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J,\u0010\u0017\u001a\u00020\u000e*\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/reactions/drawer/mediator/SlideMediator;", "", "drawerStateUpdatesProvider", "Lcom/tinder/reactions/drawer/provider/DrawerStateProvider;", "(Lcom/tinder/reactions/drawer/provider/DrawerStateProvider;)V", "compositeSubscriptions", "Lrx/subscriptions/CompositeSubscription;", "dynamicSlidingViews", "", "Lcom/tinder/reactions/drawer/model/SlidingView;", "slidingViews", "addDynamicSlidingView", "dynamicSlidingViewInterface", "Lcom/tinder/reactions/common/view/DynamicSlidingViewInterface;", "", "slidingView", "addSlidingView", "slidingViewInterface", "Lcom/tinder/reactions/common/view/SlidingViewInterface;", "onDestroy", "slideAllViews", "slideOffset", "", "slide", "Landroid/view/View;", "slideType", "Lcom/tinder/reactions/drawer/model/SlideType;", "yStartingPosition", "yOpenPosition", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.drawer.mediator.g */
public final class C14633g {
    /* renamed from: a */
    private final C19573b f46148a = new C19573b();
    /* renamed from: b */
    private List<C14635a> f46149b = new ArrayList();
    /* renamed from: c */
    private List<C14635a> f46150c = new ArrayList();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "event", "Lcom/tinder/reactions/drawer/provider/event/DrawerState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.g$1 */
    static final class C179651<T, R> implements Func1<DrawerState, Boolean> {
        /* renamed from: a */
        public static final C179651 f55898a = new C179651();

        C179651() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65300a((DrawerState) obj));
        }

        /* renamed from: a */
        public final boolean m65300a(DrawerState drawerState) {
            return drawerState.m55825a() == EventType.SLIDE ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "slidingView", "Lcom/tinder/reactions/drawer/model/SlidingView;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.g$a */
    static final class C18718a<T> implements Action1<C14635a> {
        /* renamed from: a */
        final /* synthetic */ C14633g f58201a;

        C18718a(C14633g c14633g) {
            this.f58201a = c14633g;
        }

        public /* synthetic */ void call(Object obj) {
            m67144a((C14635a) obj);
        }

        /* renamed from: a */
        public final void m67144a(C14635a c14635a) {
            C14633g c14633g = this.f58201a;
            C2668g.a(c14635a, "slidingView");
            c14633g.m55811b(c14635a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "slidingView", "Lcom/tinder/reactions/drawer/model/SlidingView;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.g$b */
    static final class C18719b<T> implements Action1<C14635a> {
        /* renamed from: a */
        final /* synthetic */ C14633g f58202a;

        C18719b(C14633g c14633g) {
            this.f58202a = c14633g;
        }

        public /* synthetic */ void call(Object obj) {
            m67145a((C14635a) obj);
        }

        /* renamed from: a */
        public final void m67145a(C14635a c14635a) {
            C14633g c14633g = this.f58202a;
            C2668g.a(c14635a, "slidingView");
            c14633g.m55809a(c14635a);
        }
    }

    @Inject
    public C14633g(@NotNull C16327e c16327e) {
        C2668g.b(c16327e, "drawerStateUpdatesProvider");
        C19573b c19573b = this.f46148a;
        c16327e = c16327e.observe().f(C179651.f55898a).a(C19397a.a());
        Action1 c187172 = new Action1<DrawerState>() {
            public /* synthetic */ void call(Object obj) {
                m67143a((DrawerState) obj);
            }

            /* renamed from: a */
            public final void m67143a(DrawerState drawerState) {
                this.m55805a(drawerState.m55826b());
            }
        };
        Function1 function1 = SlideMediator$3.f59375a;
        if (function1 != null) {
            function1 = new C18720i(function1);
        }
        c19573b.a(c16327e.a(c187172, (Action1) function1));
    }

    @NotNull
    /* renamed from: a */
    public final C14633g m55813a(@NotNull SlidingViewInterface slidingViewInterface) {
        C2668g.b(slidingViewInterface, "slidingViewInterface");
        C19573b c19573b = this.f46148a;
        slidingViewInterface = slidingViewInterface.getSlidingViewSingle().a(C19397a.a());
        Action1 c18719b = new C18719b(this);
        Function1 function1 = SlideMediator$addSlidingView$2.f59377a;
        if (function1 != null) {
            function1 = new C18720i(function1);
        }
        c19573b.a(slidingViewInterface.a(c18719b, (Action1) function1));
        return this;
    }

    @NotNull
    /* renamed from: a */
    public final C14633g m55812a(@NotNull DynamicSlidingViewInterface dynamicSlidingViewInterface) {
        C2668g.b(dynamicSlidingViewInterface, "dynamicSlidingViewInterface");
        C19573b c19573b = this.f46148a;
        dynamicSlidingViewInterface = dynamicSlidingViewInterface.getSlidingViewObservable().a(C19397a.a());
        Action1 c18718a = new C18718a(this);
        Function1 function1 = SlideMediator$addDynamicSlidingView$2.f59376a;
        if (function1 != null) {
            function1 = new C18720i(function1);
        }
        c19573b.a(dynamicSlidingViewInterface.a(c18718a, (Action1) function1));
        return this;
    }

    /* renamed from: a */
    public final void m55814a() {
        this.f46148a.a();
    }

    /* renamed from: a */
    private final void m55809a(C14635a c14635a) {
        Collection arrayList = new ArrayList();
        for (Object next : this.f46149b) {
            if ((C2668g.a(((C14635a) next).m55815a(), c14635a.m55815a()) ^ 1) != 0) {
                arrayList.add(next);
            }
        }
        this.f46149b = C19299w.m68823d((Collection) (List) arrayList);
        this.f46149b.add(c14635a);
    }

    /* renamed from: b */
    private final void m55811b(C14635a c14635a) {
        Collection arrayList = new ArrayList();
        for (Object next : this.f46150c) {
            if ((C2668g.a(((C14635a) next).m55815a(), c14635a.m55815a()) ^ 1) != 0) {
                arrayList.add(next);
            }
        }
        this.f46150c = C19299w.m68823d((Collection) (List) arrayList);
        this.f46150c.add(c14635a);
    }

    /* renamed from: a */
    private final void m55805a(float f) {
        for (C14635a c14635a : this.f46149b) {
            m55806a(c14635a.m55816b(), f, c14635a.m55817c(), c14635a.m55818d(), c14635a.m55819e());
        }
        for (C14635a c14635a2 : this.f46150c) {
            m55806a(c14635a2.m55816b(), f, c14635a2.m55817c(), c14635a2.m55818d(), c14635a2.m55819e());
        }
    }

    /* renamed from: a */
    private final void m55806a(@NotNull View view, float f, SlideType slideType, float f2, float f3) {
        switch (C14634h.f46151a[slideType.ordinal()]) {
            case 1:
                f = f2 - (((f2 - f3) * f) * ((float) 4.2E-45f));
                if (f > f2) {
                    view.setY(f2);
                    return;
                } else if (f < f3) {
                    view.setY(f3);
                    return;
                } else {
                    view.setY(f);
                    return;
                }
            case 2:
                slideType = (((f3 - f2) * f) * ((float) 8.4E-45f)) + f2;
                if (slideType > f3) {
                    view.setY(f3);
                    return;
                } else if (f2 > slideType) {
                    view.setY(f2);
                    return;
                } else {
                    view.setY(slideType);
                    return;
                }
            case 3:
                slideType = f2 - (((f2 - f3) * f) * f);
                if (slideType > f2) {
                    view.setY(f2);
                } else if (slideType < f3) {
                    view.setY(f3);
                } else {
                    view.setY(slideType);
                }
                view.setAlpha(f);
                return;
            case 4:
                if (view == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.reactions.drawer.view.DragHandleView");
                }
                ((DragHandleView) view).m61617a(f);
                return;
            default:
                return;
        }
    }
}
