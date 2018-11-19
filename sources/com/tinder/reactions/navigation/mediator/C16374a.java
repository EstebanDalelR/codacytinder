package com.tinder.reactions.navigation.mediator;

import android.view.View;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.common.view.extension.C8587g;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.common.mediator.C14615a;
import com.tinder.reactions.common.p388b.C14612a;
import com.tinder.reactions.common.view.SlidingViewInterface;
import com.tinder.reactions.drawer.model.C14635a;
import com.tinder.reactions.drawer.model.SlideType;
import com.tinder.reactions.drawer.provider.DrawerEventProvider;
import com.tinder.reactions.drawer.provider.DrawerEventProvider.C14636a;
import com.tinder.reactions.drawer.provider.DrawerEventProvider.EventType;
import com.tinder.reactions.drawer.view.ReactionDrawer;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.navigation.view.GrandGestureNavigationView;
import com.tinder.reactions.navigation.viewmodel.GrandGestureNavigationItem;
import com.tinder.utils.RxUtils;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Single;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u0017J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001c\u0010\u001e\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170%H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R2\u0010\u000e\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/reactions/navigation/mediator/GestureNavigationMediator;", "Lcom/tinder/reactions/common/mediator/ViewMediator;", "Lcom/tinder/reactions/common/view/SlidingViewInterface;", "gestureNavigationView", "Lcom/tinder/reactions/navigation/view/GrandGestureNavigationView;", "reactionDrawer", "Lcom/tinder/reactions/drawer/view/ReactionDrawer;", "(Lcom/tinder/reactions/navigation/view/GrandGestureNavigationView;Lcom/tinder/reactions/drawer/view/ReactionDrawer;)V", "drawerStateUpdatesProvider", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider;", "getDrawerStateUpdatesProvider$Tinder_release", "()Lcom/tinder/reactions/drawer/provider/DrawerEventProvider;", "setDrawerStateUpdatesProvider$Tinder_release", "(Lcom/tinder/reactions/drawer/provider/DrawerEventProvider;)V", "slidingViewSubject", "Lrx/subjects/BehaviorSubject;", "Lcom/tinder/reactions/drawer/model/SlidingView;", "kotlin.jvm.PlatformType", "getSlidingViewSingle", "Lrx/Single;", "getView", "Landroid/view/View;", "handleDrawerEvent", "", "drawerEventType", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$EventType;", "onDestroy", "requestOrClearFocus", "shouldFocus", "", "setGrandGestures", "grandGestureItems", "", "Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem;", "gestureAnimationMediator", "Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "setupSlidingView", "Lrx/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.navigation.mediator.a */
public final class C16374a extends C14615a implements SlidingViewInterface {
    @Inject
    @NotNull
    /* renamed from: a */
    public DrawerEventProvider f50920a;
    /* renamed from: b */
    private final C19785a<C14635a> f50921b = C19785a.w();
    /* renamed from: c */
    private final GrandGestureNavigationView f50922c;
    /* renamed from: d */
    private final ReactionDrawer f50923d;

    /* renamed from: c */
    public final void m61753c() {
    }

    public C16374a(@NotNull GrandGestureNavigationView grandGestureNavigationView, @NotNull ReactionDrawer reactionDrawer) {
        C2668g.b(grandGestureNavigationView, "gestureNavigationView");
        C2668g.b(reactionDrawer, "reactionDrawer");
        super(grandGestureNavigationView);
        this.f50922c = grandGestureNavigationView;
        this.f50923d = reactionDrawer;
        grandGestureNavigationView = C14398a.m54830a(this.f50922c.getContext());
        if (grandGestureNavigationView == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) grandGestureNavigationView).provideChatActivityComponent().inject(this);
        grandGestureNavigationView = C14612a.f46118a.m55760e((View) this.f50922c);
        reactionDrawer = (Function1) GestureNavigationMediator$1.f59387a;
        if (reactionDrawer != null) {
            reactionDrawer = new C18757c(reactionDrawer);
        }
        grandGestureNavigationView.a((Action1) reactionDrawer).a(C19397a.a()).h((Func1) new Func1<T, Observable<? extends R>>() {
            public /* synthetic */ Object call(Object obj) {
                return m65367a((View) obj);
            }

            @NotNull
            /* renamed from: a */
            public final Observable<C15813i> m65367a(View view) {
                return this.m61750d();
            }
        }).h((Func1) new Func1<T, Observable<? extends R>>() {
            public /* synthetic */ Object call(Object obj) {
                return m65368a((C15813i) obj);
            }

            /* renamed from: a */
            public final Observable<C14636a> m65368a(C15813i c15813i) {
                return this.m61752b().observe().j(C14612a.f46118a.m55756a(this.f50922c));
            }
        }).d((Action1) new Action1<C14636a>() {
            public /* synthetic */ void call(Object obj) {
                m67192a((C14636a) obj);
            }

            /* renamed from: a */
            public final void m67192a(C14636a c14636a) {
                this.m61745a(c14636a.m55820a());
            }
        });
        C14612a.f46118a.m55763h((View) this.f50922c).a(RxUtils.a()).d((Action1) new Action1<View>() {
            public /* synthetic */ void call(Object obj) {
                m67193a((View) obj);
            }

            /* renamed from: a */
            public final void m67193a(View view) {
                this.f50923d.collapseDrawer();
            }
        });
    }

    @NotNull
    /* renamed from: b */
    public final DrawerEventProvider m61752b() {
        DrawerEventProvider drawerEventProvider = this.f50920a;
        if (drawerEventProvider == null) {
            C2668g.b("drawerStateUpdatesProvider");
        }
        return drawerEventProvider;
    }

    @NotNull
    public Single<C14635a> getSlidingViewSingle() {
        Single<C14635a> a = this.f50921b.a();
        C2668g.a(a, "slidingViewSubject.toSingle()");
        return a;
    }

    @NotNull
    public View getView() {
        return this.f50922c;
    }

    /* renamed from: a */
    public final void m61751a(@NotNull Set<GrandGestureNavigationItem> set, @NotNull C14641a c14641a) {
        C2668g.b(set, "grandGestureItems");
        C2668g.b(c14641a, "gestureAnimationMediator");
        this.f50922c.m55963a((Set) set, c14641a);
    }

    /* renamed from: d */
    private final Observable<C15813i> m61750d() {
        this.f50921b.onNext(new C14635a(this.f50922c, SlideType.NAVIGATOR, this.f50922c.getY() + (((float) this.f50922c.getHeight()) * 0.25f), this.f50922c.getY()));
        this.f50921b.onCompleted();
        Observable<C15813i> a = Observable.a(C15813i.f49016a);
        C2668g.a(a, "Observable.just(Unit)");
        return a;
    }

    /* renamed from: a */
    private final void m61745a(EventType eventType) {
        switch (C14689b.f46274a[eventType.ordinal()]) {
            case 1:
                C8587g.a((View) this.f50922c, false);
                m61747a(false);
                return;
            case 2:
                C8587g.a((View) this.f50922c, true);
                m61747a(true);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m61747a(boolean z) {
        this.f50922c.setFocusableInTouchMode(z);
        if (z) {
            this.f50922c.requestFocus();
        } else {
            this.f50922c.clearFocus();
        }
    }
}
