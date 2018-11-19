package com.tinder.reactions.drawer.provider;

import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.data.ObservingProvider;
import com.tinder.reactions.drawer.provider.event.DrawerState;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R2\u0010\u0010\u001a&\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00020\u0002 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00110\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/tinder/reactions/drawer/provider/DrawerEventProvider;", "Lcom/tinder/data/ObservingProvider;", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$Event;", "drawerStateProvider", "Lcom/tinder/reactions/drawer/provider/DrawerStateProvider;", "(Lcom/tinder/reactions/drawer/provider/DrawerStateProvider;)V", "dragOccurred", "", "drawerEventSubscriptionCount", "", "drawerStateSubscription", "Lrx/Subscription;", "startingEventType", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$EventType;", "startingVisibleDrawerState", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$DrawerVisibleState;", "subject", "Lrx/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "get", "handleClosedEvent", "", "handleOpenedEvent", "handleStateChanged", "drawerState", "Lcom/tinder/reactions/drawer/provider/event/DrawerState;", "observe", "Lrx/Observable;", "subscribeToDrawerState", "update", "event", "DrawerVisibleState", "Event", "EventType", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
public final class DrawerEventProvider implements ObservingProvider<C14636a> {
    /* renamed from: a */
    private final C19785a<C14636a> f50802a = C19785a.w();
    /* renamed from: b */
    private Subscription f50803b;
    /* renamed from: c */
    private int f50804c;
    /* renamed from: d */
    private DrawerVisibleState f50805d = DrawerVisibleState.UNINITIALIZED;
    /* renamed from: e */
    private EventType f50806e = EventType.UNINITIALIZED;
    /* renamed from: f */
    private boolean f50807f;
    /* renamed from: g */
    private final C16327e f50808g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$DrawerVisibleState;", "", "(Ljava/lang/String;I)V", "UNINITIALIZED", "OPENED", "CLOSED", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum DrawerVisibleState {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$EventType;", "", "(Ljava/lang/String;I)V", "UNINITIALIZED", "OPENED", "CLOSED", "OPENING_STARTED", "CLOSING_STARTED", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum EventType {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$Event;", "", "eventType", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$EventType;", "startingVisibleDrawerState", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$DrawerVisibleState;", "dragOccurred", "", "(Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$EventType;Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$DrawerVisibleState;Z)V", "getDragOccurred", "()Z", "getEventType", "()Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$EventType;", "getStartingVisibleDrawerState", "()Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$DrawerVisibleState;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.provider.DrawerEventProvider$a */
    public static final class C14636a {
        @NotNull
        /* renamed from: a */
        private final EventType f46156a;
        @NotNull
        /* renamed from: b */
        private final DrawerVisibleState f46157b;
        /* renamed from: c */
        private final boolean f46158c;

        @NotNull
        /* renamed from: c */
        public final EventType m55822c() {
            return this.f46156a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C14636a) {
                C14636a c14636a = (C14636a) obj;
                if (C2668g.a(this.f46156a, c14636a.f46156a) && C2668g.a(this.f46157b, c14636a.f46157b)) {
                    if ((this.f46158c == c14636a.f46158c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            EventType eventType = this.f46156a;
            int i = 0;
            int hashCode = (eventType != null ? eventType.hashCode() : 0) * 31;
            DrawerVisibleState drawerVisibleState = this.f46157b;
            if (drawerVisibleState != null) {
                i = drawerVisibleState.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            i = this.f46158c;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Event(eventType=");
            stringBuilder.append(this.f46156a);
            stringBuilder.append(", startingVisibleDrawerState=");
            stringBuilder.append(this.f46157b);
            stringBuilder.append(", dragOccurred=");
            stringBuilder.append(this.f46158c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14636a(@NotNull EventType eventType, @NotNull DrawerVisibleState drawerVisibleState, boolean z) {
            C2668g.b(eventType, "eventType");
            C2668g.b(drawerVisibleState, "startingVisibleDrawerState");
            this.f46156a = eventType;
            this.f46157b = drawerVisibleState;
            this.f46158c = z;
        }

        @NotNull
        /* renamed from: a */
        public final EventType m55820a() {
            return this.f46156a;
        }

        /* renamed from: b */
        public final boolean m55821b() {
            return this.f46158c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "drawerState", "Lcom/tinder/reactions/drawer/provider/event/DrawerState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.provider.DrawerEventProvider$d */
    static final class C17967d<T, R> implements Func1<DrawerState, Boolean> {
        /* renamed from: a */
        public static final C17967d f55900a = new C17967d();

        C17967d() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65304a((DrawerState) obj));
        }

        /* renamed from: a */
        public final boolean m65304a(DrawerState drawerState) {
            return drawerState.m55825a() != com.tinder.reactions.drawer.provider.event.DrawerState.EventType.SLIDE ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.provider.DrawerEventProvider$b */
    static final class C18722b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ DrawerEventProvider f58205a;

        C18722b(DrawerEventProvider drawerEventProvider) {
            this.f58205a = drawerEventProvider;
        }

        public final void call() {
            this.f58205a.m61600b();
            DrawerEventProvider drawerEventProvider = this.f58205a;
            drawerEventProvider.f50804c = drawerEventProvider.f50804c + 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.provider.DrawerEventProvider$c */
    static final class C18723c implements Action0 {
        /* renamed from: a */
        final /* synthetic */ DrawerEventProvider f58206a;

        C18723c(DrawerEventProvider drawerEventProvider) {
            this.f58206a = drawerEventProvider;
        }

        public final void call() {
            if (this.f58206a.f50804c <= 1) {
                RxUtils.b(this.f58206a.f50803b);
                this.f58206a.f50804c = 0;
                return;
            }
            DrawerEventProvider drawerEventProvider = this.f58206a;
            drawerEventProvider.f50804c = drawerEventProvider.f50804c - 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "drawerState", "Lcom/tinder/reactions/drawer/provider/event/DrawerState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.provider.DrawerEventProvider$e */
    static final class C18724e<T> implements Action1<DrawerState> {
        /* renamed from: a */
        final /* synthetic */ DrawerEventProvider f58207a;

        C18724e(DrawerEventProvider drawerEventProvider) {
            this.f58207a = drawerEventProvider;
        }

        public /* synthetic */ void call(Object obj) {
            m67147a((DrawerState) obj);
        }

        /* renamed from: a */
        public final void m67147a(DrawerState drawerState) {
            switch (C14638c.f46160a[drawerState.m55825a().ordinal()]) {
                case 1:
                    this.f58207a.m61602c();
                    return;
                case 2:
                    this.f58207a.m61603d();
                    return;
                case 3:
                    DrawerEventProvider drawerEventProvider = this.f58207a;
                    C2668g.a(drawerState, "drawerState");
                    drawerEventProvider.m61598a(drawerState);
                    return;
                default:
                    return;
            }
        }
    }

    @Inject
    public DrawerEventProvider(@NotNull C16327e c16327e) {
        C2668g.b(c16327e, "drawerStateProvider");
        this.f50808g = c16327e;
        m61607a(new C14636a(this.f50806e, this.f50805d, this.f50807f));
    }

    public /* synthetic */ Object get() {
        return m61606a();
    }

    public /* synthetic */ void update(Object obj) {
        m61607a((C14636a) obj);
    }

    @NotNull
    /* renamed from: a */
    public C14636a m61606a() {
        C19785a c19785a = this.f50802a;
        C2668g.a(c19785a, "subject");
        Object A = c19785a.A();
        C2668g.a(A, "subject.value");
        return (C14636a) A;
    }

    @NotNull
    public Observable<C14636a> observe() {
        Observable<C14636a> d = this.f50802a.e().b(new C18722b(this)).d(new C18723c(this));
        C2668g.a(d, "subject.asObservable()\n …          }\n            }");
        return d;
    }

    /* renamed from: a */
    public void m61607a(@NotNull C14636a c14636a) {
        C2668g.b(c14636a, "event");
        C19785a c19785a = this.f50802a;
        C2668g.a(c19785a, "subject");
        if (!C2668g.a(c14636a, (C14636a) c19785a.A())) {
            this.f50802a.onNext(c14636a);
        }
    }

    /* renamed from: b */
    private final void m61600b() {
        if (!RxUtils.a(this.f50803b)) {
            this.f50803b = this.f50808g.observe().f(C17967d.f55900a).d(new C18724e(this));
        }
    }

    /* renamed from: c */
    private final void m61602c() {
        m61607a(new C14636a(EventType.OPENED, this.f50805d, this.f50807f));
        this.f50805d = DrawerVisibleState.OPENED;
        this.f50807f = false;
    }

    /* renamed from: d */
    private final void m61603d() {
        m61607a(new C14636a(EventType.CLOSED, this.f50805d, this.f50807f));
        this.f50805d = DrawerVisibleState.CLOSED;
        this.f50807f = false;
    }

    /* renamed from: a */
    private final void m61598a(DrawerState drawerState) {
        if (drawerState.m55827c() == 1 && this.f50807f == null) {
            this.f50807f = true;
        }
        if (this.f50805d == DrawerVisibleState.OPENED) {
            m61607a(new C14636a(EventType.CLOSING_STARTED, this.f50805d, this.f50807f));
        } else if (this.f50805d == DrawerVisibleState.CLOSED) {
            m61607a(new C14636a(EventType.OPENING_STARTED, this.f50805d, this.f50807f));
        }
    }
}
