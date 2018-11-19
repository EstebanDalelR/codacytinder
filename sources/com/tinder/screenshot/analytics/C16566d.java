package com.tinder.screenshot.analytics;

import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.common.navigation.Screen;
import com.tinder.common.navigation.Screen.C10684c;
import com.tinder.common.navigation.Screen.C10687f;
import com.tinder.common.navigation.Screen.C10691j;
import com.tinder.common.navigation.Screen.C10692k;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.screenshot.analytics.C16562a.C14824a;
import com.tinder.screenshotty.C14830c;
import com.tinder.screenshotty.p401a.C14826a;
import com.tinder.screenshotty.p401a.C14826a.C16570a;
import io.reactivex.C3959e;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/screenshot/analytics/ObserveScreenshotsForAnalytics;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "screenshotty", "Lcom/tinder/screenshotty/Screenshotty;", "currentScreenTracker", "Lcom/tinder/common/navigation/CurrentScreenTracker;", "addAppScreenshotEvent", "Lcom/tinder/screenshot/analytics/AddAppScreenshotEvent;", "(Lcom/tinder/screenshotty/Screenshotty;Lcom/tinder/common/navigation/CurrentScreenTracker;Lcom/tinder/screenshot/analytics/AddAppScreenshotEvent;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "execute", "", "shouldAddEvent", "", "screen", "Lcom/tinder/common/navigation/Screen;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.screenshot.analytics.d */
public final class C16566d implements SimpleVoidUseCase {
    /* renamed from: a */
    private Disposable f51256a;
    /* renamed from: b */
    private final C14830c f51257b;
    /* renamed from: c */
    private final CurrentScreenTracker f51258c;
    /* renamed from: d */
    private final C16562a f51259d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "screenshot", "Lcom/tinder/screenshotty/model/Screenshot;", "screen", "Lcom/tinder/common/navigation/Screen;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.screenshot.analytics.d$a */
    static final class C16564a<T1, T2, R> implements BiFunction<C14826a, Screen, C15813i> {
        /* renamed from: a */
        final /* synthetic */ C16566d f51254a;

        C16564a(C16566d c16566d) {
            this.f51254a = c16566d;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            m61993a((C14826a) obj, (Screen) obj2);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m61993a(@NotNull C14826a c14826a, @NotNull Screen screen) {
            C2668g.b(c14826a, "screenshot");
            C2668g.b(screen, "screen");
            if (this.f51254a.m61996a(screen)) {
                this.f51254a.f51259d.m61992a(new C14824a(screen, null, null, c14826a instanceof C16570a));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.screenshot.analytics.d$b */
    static final class C16565b<T> implements Consumer<C15813i> {
        /* renamed from: a */
        public static final C16565b f51255a = new C16565b();

        C16565b() {
        }

        /* renamed from: a */
        public final void m61994a(C15813i c15813i) {
        }

        public /* synthetic */ void accept(Object obj) {
            m61994a((C15813i) obj);
        }
    }

    @Inject
    public C16566d(@NotNull C14830c c14830c, @NotNull CurrentScreenTracker currentScreenTracker, @NotNull C16562a c16562a) {
        C2668g.b(c14830c, "screenshotty");
        C2668g.b(currentScreenTracker, "currentScreenTracker");
        C2668g.b(c16562a, "addAppScreenshotEvent");
        this.f51257b = c14830c;
        this.f51258c = currentScreenTracker;
        this.f51259d = c16562a;
    }

    public void execute() {
        Disposable disposable = this.f51256a;
        if (disposable != null) {
            disposable.dispose();
        }
        C3959e withLatestFrom = this.f51257b.m56190c().withLatestFrom(this.f51258c.observe(), new C16564a(this));
        Consumer consumer = C16565b.f51255a;
        Function1 function1 = ObserveScreenshotsForAnalytics$execute$3.f59397a;
        if (function1 != null) {
            function1 = new C16567e(function1);
        }
        this.f51256a = withLatestFrom.subscribe(consumer, (Consumer) function1);
    }

    /* renamed from: a */
    private final boolean m61996a(Screen screen) {
        return ((C2668g.a(screen, C10692k.f35033a) ^ 1) == 0 || (C2668g.a(screen, C10691j.f35032a) ^ 1) == 0 || (C2668g.a(screen, C10684c.f35025a) ^ 1) == 0 || (C2668g.a(screen, C10687f.f35028a) ^ 1) == null) ? false : true;
    }
}
