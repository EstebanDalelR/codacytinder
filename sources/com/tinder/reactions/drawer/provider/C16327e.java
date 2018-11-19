package com.tinder.reactions.drawer.provider;

import android.view.View;
import com.tinder.chat.injection.scope.ChatActivityScope;
import com.tinder.data.ObservingProvider;
import com.tinder.reactions.drawer.provider.event.DrawerState;
import com.tinder.reactions.drawer.provider.event.DrawerState.EventType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016J\f\u0010\u0019\u001a\u00020\u0016*\u00020\u0016H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R2\u0010\u0006\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/reactions/drawer/provider/DrawerStateProvider;", "Lcom/tinder/data/ObservingProvider;", "Lcom/tinder/reactions/drawer/provider/event/DrawerState;", "()V", "previousEvent", "Lcom/tinder/reactions/drawer/provider/event/DrawerState$EventType;", "subject", "Lrx/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "get", "observe", "Lrx/Observable;", "onDrawerClosed", "", "view", "Landroid/view/View;", "onDrawerOpened", "onDrawerSlide", "slideOffset", "", "onDrawerStateChanged", "newState", "", "update", "drawerState", "toState", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.drawer.provider.e */
public final class C16327e implements ObservingProvider<DrawerState> {
    /* renamed from: a */
    private final C19785a<DrawerState> f50809a = C19785a.w();
    /* renamed from: b */
    private EventType f50810b = EventType.CLOSED;

    public /* synthetic */ Object get() {
        return m61609a();
    }

    public /* synthetic */ void update(Object obj) {
        m61613a((DrawerState) obj);
    }

    @NotNull
    /* renamed from: a */
    public DrawerState m61609a() {
        C19785a c19785a = this.f50809a;
        C2668g.a(c19785a, "subject");
        Object A = c19785a.A();
        C2668g.a(A, "subject.value");
        return (DrawerState) A;
    }

    @NotNull
    public Observable<DrawerState> observe() {
        Observable<DrawerState> e = this.f50809a.e();
        C2668g.a(e, "subject.asObservable()");
        return e;
    }

    /* renamed from: a */
    public void m61613a(@NotNull DrawerState drawerState) {
        C2668g.b(drawerState, "drawerState");
        C19785a c19785a = this.f50809a;
        C2668g.a(c19785a, "subject");
        if (!C2668g.a(drawerState, (DrawerState) c19785a.A())) {
            this.f50809a.onNext(drawerState);
        }
    }

    /* renamed from: a */
    public final void m61612a(@NotNull View view, float f) {
        C2668g.b(view, "view");
        m61613a(new DrawerState(EventType.SLIDE, view, f, this.f50810b));
        this.f50810b = EventType.SLIDE;
    }

    /* renamed from: a */
    public final void m61611a(@NotNull View view) {
        C2668g.b(view, "view");
        m61613a(new DrawerState(EventType.OPENED, view, this.f50810b));
        this.f50810b = EventType.OPENED;
    }

    /* renamed from: b */
    public final void m61614b(@NotNull View view) {
        C2668g.b(view, "view");
        m61613a(new DrawerState(EventType.CLOSED, view, this.f50810b));
        this.f50810b = EventType.CLOSED;
    }

    /* renamed from: a */
    public final void m61610a(int i) {
        m61613a(new DrawerState(EventType.STATE_CHANGED, null, m61608b(i), this.f50810b));
        this.f50810b = EventType.STATE_CHANGED;
    }

    /* renamed from: b */
    private final int m61608b(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                throw ((Throwable) new IllegalArgumentException("State not supported"));
        }
    }
}
