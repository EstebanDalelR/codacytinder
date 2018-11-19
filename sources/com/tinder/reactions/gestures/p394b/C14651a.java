package com.tinder.reactions.gestures.p394b;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.reactions.drawer.provider.C16327e;
import com.tinder.reactions.drawer.provider.event.DrawerState;
import com.tinder.reactions.drawer.provider.event.DrawerState.EventType;
import com.tinder.reactions.gestures.p395c.C16347e;
import com.tinder.reactions.gestures.p395c.C16347e.C14659a;
import com.tinder.reactions.gestures.target.FlingableLottieAnimationTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\r\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0018H\u0001¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/tinder/reactions/gestures/presenter/FlingableLottieAnimationPresenter;", "", "drawerStateProvider", "Lcom/tinder/reactions/drawer/provider/DrawerStateProvider;", "positionProvider", "Lcom/tinder/reactions/gestures/provider/GesturePositionProvider;", "(Lcom/tinder/reactions/drawer/provider/DrawerStateProvider;Lcom/tinder/reactions/gestures/provider/GesturePositionProvider;)V", "drawerStateSubscription", "Lrx/Subscription;", "drawerWasClosed", "", "target", "Lcom/tinder/reactions/gestures/target/FlingableLottieAnimationTarget;", "getTarget$Tinder_release", "()Lcom/tinder/reactions/gestures/target/FlingableLottieAnimationTarget;", "setTarget$Tinder_release", "(Lcom/tinder/reactions/gestures/target/FlingableLottieAnimationTarget;)V", "isCurrentPageFlingableGesture", "positionInfo", "Lcom/tinder/reactions/gestures/provider/GesturePositionProvider$PositionEvent;", "isDrawerOpening", "drawerState", "Lcom/tinder/reactions/drawer/provider/event/DrawerState$EventType;", "resetViewOnDrawerEvent", "", "resetViewOnDrawerEvent$Tinder_release", "unsubscribe", "unsubscribe$Tinder_release", "updateDrawerWasClosed", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.b.a */
public final class C14651a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public FlingableLottieAnimationTarget f46200a;
    /* renamed from: b */
    private Subscription f46201b;
    /* renamed from: c */
    private boolean f46202c = true;
    /* renamed from: d */
    private final C16327e f46203d;
    /* renamed from: e */
    private final C16347e f46204e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/reactions/drawer/provider/event/DrawerState$EventType;", "drawerState", "Lcom/tinder/reactions/drawer/provider/event/DrawerState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.b.a$a */
    static final class C17980a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17980a f55911a = new C17980a();

        C17980a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65327a((DrawerState) obj);
        }

        @NotNull
        /* renamed from: a */
        public final EventType m65327a(DrawerState drawerState) {
            return drawerState.m55825a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "drawerStateEvent", "Lcom/tinder/reactions/drawer/provider/event/DrawerState$EventType;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.b.a$b */
    static final class C18737b<T> implements Action1<EventType> {
        /* renamed from: a */
        final /* synthetic */ C14651a f58227a;

        C18737b(C14651a c14651a) {
            this.f58227a = c14651a;
        }

        public /* synthetic */ void call(Object obj) {
            m67161a((EventType) obj);
        }

        /* renamed from: a */
        public final void m67161a(EventType eventType) {
            C14651a c14651a = this.f58227a;
            C2668g.a(eventType, "drawerStateEvent");
            c14651a.m55857a(eventType);
            if (this.f58227a.m55861b(eventType) != null && this.f58227a.m55860a(this.f58227a.f46204e.m61660a()) != null) {
                this.f58227a.m55863a().reset();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.b.a$c */
    static final class C18738c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18738c f58228a = new C18738c();

        C18738c() {
        }

        public /* synthetic */ void call(Object obj) {
            m67162a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67162a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Inject
    public C14651a(@NotNull C16327e c16327e, @NotNull C16347e c16347e) {
        C2668g.b(c16327e, "drawerStateProvider");
        C2668g.b(c16347e, "positionProvider");
        this.f46203d = c16327e;
        this.f46204e = c16347e;
    }

    @NotNull
    /* renamed from: a */
    public final FlingableLottieAnimationTarget m55863a() {
        FlingableLottieAnimationTarget flingableLottieAnimationTarget = this.f46200a;
        if (flingableLottieAnimationTarget == null) {
            C2668g.b("target");
        }
        return flingableLottieAnimationTarget;
    }

    /* renamed from: b */
    public final void m55864b() {
        this.f46203d.observe().k(C17980a.f55911a).a(C19397a.a()).a(new C18737b(this), C18738c.f58228a);
    }

    @Drop
    /* renamed from: c */
    public final void m55865c() {
        Subscription subscription = this.f46201b;
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }

    /* renamed from: a */
    private final void m55857a(EventType eventType) {
        if (eventType == EventType.CLOSED) {
            this.f46202c = true;
        } else if (eventType == EventType.OPENED) {
            this.f46202c = null;
        }
    }

    /* renamed from: a */
    private final boolean m55860a(C14659a c14659a) {
        return c14659a.m55889c() == GrandGestureType.MARTINI ? true : null;
    }

    /* renamed from: b */
    private final boolean m55861b(EventType eventType) {
        return (this.f46202c && eventType == EventType.SLIDE) ? true : null;
    }
}
