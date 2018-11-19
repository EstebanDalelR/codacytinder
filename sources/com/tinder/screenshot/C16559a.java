package com.tinder.screenshot;

import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.screenshotty.C14830c;
import io.reactivex.C3959e;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/screenshot/MonitorForScreenshots;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "screenshotty", "Lcom/tinder/screenshotty/Screenshotty;", "appVisibilityTracker", "Lcom/tinder/app/AppVisibilityTracker;", "(Lcom/tinder/screenshotty/Screenshotty;Lcom/tinder/app/AppVisibilityTracker;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "execute", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.screenshot.a */
public final class C16559a implements SimpleVoidUseCase {
    /* renamed from: a */
    private Disposable f51246a;
    /* renamed from: b */
    private final C14830c f51247b;
    /* renamed from: c */
    private final AppVisibilityTracker f51248c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "visibility", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.screenshot.a$a */
    static final class C16557a<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16559a f51244a;

        C16557a(C16559a c16559a) {
            this.f51244a = c16559a;
        }

        public /* synthetic */ Object apply(Object obj) {
            m61986a((AppVisibilityTracker$Visibility) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m61986a(@NotNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
            C2668g.b(appVisibilityTracker$Visibility, "visibility");
            switch (C14825b.f46425a[appVisibilityTracker$Visibility.ordinal()]) {
                case 1:
                    C0001a.b("Stop monitoring for screenshots", new Object[0]);
                    this.f51244a.f51247b.m56189b();
                    return;
                case 2:
                    C0001a.b("Start monitoring for screenshots", new Object[0]);
                    this.f51244a.f51247b.m56188a();
                    return;
                default:
                    return;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.screenshot.a$b */
    static final class C16558b<T> implements Consumer<C15813i> {
        /* renamed from: a */
        public static final C16558b f51245a = new C16558b();

        C16558b() {
        }

        /* renamed from: a */
        public final void m61987a(C15813i c15813i) {
        }

        public /* synthetic */ void accept(Object obj) {
            m61987a((C15813i) obj);
        }
    }

    @Inject
    public C16559a(@NotNull C14830c c14830c, @NotNull AppVisibilityTracker appVisibilityTracker) {
        C2668g.b(c14830c, "screenshotty");
        C2668g.b(appVisibilityTracker, "appVisibilityTracker");
        this.f51247b = c14830c;
        this.f51248c = appVisibilityTracker;
    }

    public void execute() {
        Disposable disposable = this.f51246a;
        if (disposable != null) {
            disposable.dispose();
        }
        C3959e map = this.f51248c.trackVisibility().subscribeOn(C15756a.m59010b()).map(new C16557a(this));
        Consumer consumer = C16558b.f51245a;
        Function1 function1 = MonitorForScreenshots$execute$3.f59395a;
        if (function1 != null) {
            function1 = new C16568c(function1);
        }
        this.f51246a = map.subscribe(consumer, (Consumer) function1);
    }
}
