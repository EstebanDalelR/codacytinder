package com.tinder.toppicks.p433e;

import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.domain.common.reactivex.RxUtils;
import com.tinder.toppicks.domain.worker.C15253e;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/toppicks/usecase/TopPicksWorkerRegistryCoordinator;", "", "appVisibilityTracker", "Lcom/tinder/app/AppVisibilityTracker;", "topPicksWorkerRegistry", "Lcom/tinder/toppicks/domain/worker/TopPicksWorkerRegistry;", "(Lcom/tinder/app/AppVisibilityTracker;Lcom/tinder/toppicks/domain/worker/TopPicksWorkerRegistry;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "start", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.e.a */
public final class C15254a {
    /* renamed from: a */
    private Disposable f47358a;
    /* renamed from: b */
    private final AppVisibilityTracker f47359b;
    /* renamed from: c */
    private final C15253e f47360c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "visibility", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.e.a$a */
    static final class C17014a<T> implements Consumer<AppVisibilityTracker$Visibility> {
        /* renamed from: a */
        final /* synthetic */ C15254a f52437a;

        C17014a(C15254a c15254a) {
            this.f52437a = c15254a;
        }

        public /* synthetic */ void accept(Object obj) {
            m62793a((AppVisibilityTracker$Visibility) obj);
        }

        /* renamed from: a */
        public final void m62793a(AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
            if (appVisibilityTracker$Visibility != null) {
                switch (C15255b.f47361a[appVisibilityTracker$Visibility.ordinal()]) {
                    case 1:
                        this.f52437a.f47360c.m57339a();
                        return;
                    case 2:
                        this.f52437a.f47360c.m57340b();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.e.a$b */
    static final class C17015b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17015b f52438a = new C17015b();

        C17015b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62794a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62794a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error subscribing to App lifecycle changes: ");
            stringBuilder.append(th.getMessage());
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Inject
    public C15254a(@NotNull AppVisibilityTracker appVisibilityTracker, @NotNull C15253e c15253e) {
        C2668g.b(appVisibilityTracker, "appVisibilityTracker");
        C2668g.b(c15253e, "topPicksWorkerRegistry");
        this.f47359b = appVisibilityTracker;
        this.f47360c = c15253e;
    }

    /* renamed from: a */
    public final void m57342a() {
        if (!RxUtils.INSTANCE.isSubscribed(this.f47358a)) {
            this.f47358a = this.f47359b.trackVisibility().subscribeOn(C15756a.m59010b()).distinctUntilChanged().subscribe(new C17014a(this), C17015b.f52438a);
        }
    }
}
