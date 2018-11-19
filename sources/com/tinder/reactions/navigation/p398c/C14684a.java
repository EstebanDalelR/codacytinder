package com.tinder.reactions.navigation.p398c;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.reactions.common.C14613b;
import com.tinder.reactions.drawer.provider.DrawerEventProvider;
import com.tinder.reactions.drawer.provider.DrawerEventProvider.C14636a;
import com.tinder.reactions.navigation.target.GestureNavigationLoadingTarget;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\u0010H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/tinder/reactions/navigation/presenter/GestureNavigationLoadingPresenter;", "", "cacheStateProvider", "Lcom/tinder/reactions/common/ReactionCompositionCacheStateProvider;", "drawerEventProvider", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider;", "(Lcom/tinder/reactions/common/ReactionCompositionCacheStateProvider;Lcom/tinder/reactions/drawer/provider/DrawerEventProvider;)V", "drawerStateSubscription", "Lrx/Subscription;", "target", "Lcom/tinder/reactions/navigation/target/GestureNavigationLoadingTarget;", "getTarget$Tinder_release", "()Lcom/tinder/reactions/navigation/target/GestureNavigationLoadingTarget;", "setTarget$Tinder_release", "(Lcom/tinder/reactions/navigation/target/GestureNavigationLoadingTarget;)V", "observeDrawerState", "", "onDrop", "onTake", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.navigation.c.a */
public final class C14684a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public GestureNavigationLoadingTarget f46265a;
    /* renamed from: b */
    private Subscription f46266b;
    /* renamed from: c */
    private final C14613b f46267c;
    /* renamed from: d */
    private final DrawerEventProvider f46268d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.c.a$a */
    static final class C18752a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C14684a f58251a;

        C18752a(C14684a c14684a) {
            this.f58251a = c14684a;
        }

        public final void call() {
            this.f58251a.m55937a().hideReactionsLoadingView();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$Event;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.c.a$b */
    static final class C18753b<T> implements Action1<C14636a> {
        /* renamed from: a */
        final /* synthetic */ C14684a f58252a;

        C18753b(C14684a c14684a) {
            this.f58252a = c14684a;
        }

        public /* synthetic */ void call(Object obj) {
            m67190a((C14636a) obj);
        }

        /* renamed from: a */
        public final void m67190a(C14636a c14636a) {
            switch (C14685b.f46269a[c14636a.m55820a().ordinal()]) {
                case 1:
                    this.f58252a.m55937a().showReactionsLoadingView();
                    return;
                case 2:
                    this.f58252a.m55937a().hideReactionsLoadingView();
                    return;
                default:
                    C0001a.b("Reactions Loading View state -> Do nothing for other events", new Object[0]);
                    return;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.c.a$c */
    static final class C18754c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18754c f58253a = new C18754c();

        C18754c() {
        }

        public /* synthetic */ void call(Object obj) {
            m67191a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67191a(Throwable th) {
            C0001a.c(th, "Failed to observe drawer state", new Object[0]);
        }
    }

    @Inject
    public C14684a(@NotNull C14613b c14613b, @NotNull DrawerEventProvider drawerEventProvider) {
        C2668g.b(c14613b, "cacheStateProvider");
        C2668g.b(drawerEventProvider, "drawerEventProvider");
        this.f46267c = c14613b;
        this.f46268d = drawerEventProvider;
    }

    @NotNull
    /* renamed from: a */
    public final GestureNavigationLoadingTarget m55937a() {
        GestureNavigationLoadingTarget gestureNavigationLoadingTarget = this.f46265a;
        if (gestureNavigationLoadingTarget == null) {
            C2668g.b("target");
        }
        return gestureNavigationLoadingTarget;
    }

    @Take
    /* renamed from: b */
    public final void m55938b() {
        m55936d();
    }

    @Drop
    /* renamed from: c */
    public final void m55939c() {
        RxUtils.b(this.f46266b);
    }

    /* renamed from: d */
    private final void m55936d() {
        this.f46266b = this.f46268d.observe().j(this.f46267c.m55765b().a()).a(C19397a.a()).c(new C18752a(this)).a(new C18753b(this), C18754c.f58253a);
    }
}
