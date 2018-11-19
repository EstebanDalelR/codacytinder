package com.tinder.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.common.navigation.Screen;
import com.tinder.common.navigation.Screen.C10682a;
import com.tinder.common.navigation.Screen.C10683b;
import com.tinder.common.navigation.Screen.C10684c;
import com.tinder.common.navigation.Screen.C10685d;
import com.tinder.common.navigation.Screen.C10686e;
import com.tinder.common.navigation.Screen.C10687f;
import com.tinder.common.navigation.Screen.C10688g;
import com.tinder.common.navigation.Screen.C10689h;
import com.tinder.common.navigation.Screen.C10690i;
import com.tinder.common.navigation.Screen.C10691j;
import com.tinder.common.navigation.Screen.C10692k;
import com.tinder.common.navigation.Screen.C10693l;
import com.tinder.common.navigation.Screen.Matches;
import com.tinder.common.reactivex.schedulers.Schedulers;
import com.tinder.discovery.analytics.C13147g;
import com.tinder.discovery.domain.DiscoverySegmentRepository;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.etl.event.wb;
import io.reactivex.C3960g;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0010\u001a\u00020\u0002H\u0002J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/analytics/AddStartSessionEvent;", "Lkotlin/Function0;", "", "currentScreenTracker", "Lcom/tinder/common/navigation/CurrentScreenTracker;", "discoverySegmentRepository", "Lcom/tinder/discovery/domain/DiscoverySegmentRepository;", "calculateTogglesAvailableBitwise", "Lcom/tinder/discovery/analytics/CalculateTogglesAvailableBitwise;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "schedulers", "Lcom/tinder/common/reactivex/schedulers/Schedulers;", "(Lcom/tinder/common/navigation/CurrentScreenTracker;Lcom/tinder/discovery/domain/DiscoverySegmentRepository;Lcom/tinder/discovery/analytics/CalculateTogglesAvailableBitwise;Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/common/reactivex/schedulers/Schedulers;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "invoke", "name", "", "Lcom/tinder/common/navigation/Screen;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.b */
public final class C8000b implements Function0<C15813i> {
    /* renamed from: a */
    private Disposable f28615a;
    /* renamed from: b */
    private final CurrentScreenTracker f28616b;
    /* renamed from: c */
    private final DiscoverySegmentRepository f28617c;
    /* renamed from: d */
    private final C13147g f28618d;
    /* renamed from: e */
    private final C2630h f28619e;
    /* renamed from: f */
    private final Schedulers f28620f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/tinder/common/navigation/Screen;", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "screen", "segments", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.analytics.b$a */
    static final class C7314a<T1, T2, R> implements BiFunction<Screen, List<? extends DiscoverySegment>, Pair<? extends Screen, ? extends List<? extends DiscoverySegment>>> {
        /* renamed from: a */
        public static final C7314a f26435a = new C7314a();

        C7314a() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m31215a((Screen) obj, (List) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final Pair<Screen, List<DiscoverySegment>> m31215a(@NotNull Screen screen, @NotNull List<? extends DiscoverySegment> list) {
            C2668g.b(screen, "screen");
            C2668g.b(list, "segments");
            return new Pair(screen, list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "request", "Lkotlin/Pair;", "Lcom/tinder/common/navigation/Screen;", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.analytics.b$b */
    static final class C7315b<T> implements Consumer<Pair<? extends Screen, ? extends List<? extends DiscoverySegment>>> {
        /* renamed from: a */
        final /* synthetic */ C8000b f26436a;

        C7315b(C8000b c8000b) {
            this.f26436a = c8000b;
        }

        public /* synthetic */ void accept(Object obj) {
            m31216a((Pair) obj);
        }

        /* renamed from: a */
        public final void m31216a(Pair<? extends Screen, ? extends List<? extends DiscoverySegment>> pair) {
            this.f26436a.f28619e.a(wb.a().a(this.f26436a.m33892a((Screen) pair.a())).a(this.f26436a.f28618d.a((List) pair.b())).a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.analytics.b$c */
    static final class C7316c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C7316c f26437a = new C7316c();

        C7316c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m31217a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m31217a(Throwable th) {
            C0001a.c(th, "Error executing AddStartSessionEvent", new Object[0]);
        }
    }

    @Inject
    public C8000b(@NotNull CurrentScreenTracker currentScreenTracker, @NotNull DiscoverySegmentRepository discoverySegmentRepository, @NotNull C13147g c13147g, @NotNull C2630h c2630h, @NotNull Schedulers schedulers) {
        C2668g.b(currentScreenTracker, "currentScreenTracker");
        C2668g.b(discoverySegmentRepository, "discoverySegmentRepository");
        C2668g.b(c13147g, "calculateTogglesAvailableBitwise");
        C2668g.b(c2630h, "fireworks");
        C2668g.b(schedulers, "schedulers");
        this.f28616b = currentScreenTracker;
        this.f28617c = discoverySegmentRepository;
        this.f28618d = c13147g;
        this.f28619e = c2630h;
        this.f28620f = schedulers;
    }

    public /* synthetic */ Object invoke() {
        m33894a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public void m33894a() {
        this.f28615a = C3960g.a(this.f28616b.observe().firstOrError(), this.f28617c.observeDiscoverySegments().f(), C7314a.f26435a).b(this.f28620f.io()).a(new C7315b(this), C7316c.f26437a);
    }

    /* renamed from: a */
    private final String m33892a(@NotNull Screen screen) {
        if (C2668g.a(screen, C10692k.f35033a)) {
            return "discovery";
        }
        if (C2668g.a(screen, C10684c.f35025a)) {
            return "chat";
        }
        if (C2668g.a(screen, C10691j.f35032a)) {
            return "home";
        }
        if (C2668g.a(screen, C10686e.f35027a)) {
            return "feed";
        }
        if (C2668g.a(screen, C10693l.f35034a)) {
            return "toppicks";
        }
        if (screen instanceof Matches) {
            switch (C6215c.f22778a[((Matches) screen).a().ordinal()]) {
                case 1:
                    return "matchlist";
                case 2:
                    return "feed";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (!C2668g.a(screen, C10689h.f35030a)) {
            if (!C2668g.a(screen, C10690i.f35031a)) {
                if (!C2668g.a(screen, C10687f.f35028a)) {
                    if (!C2668g.a(screen, C10683b.f35024a)) {
                        if (!C2668g.a(screen, C10685d.f35026a)) {
                            if (!C2668g.a(screen, C10688g.f35029a)) {
                                if (C2668g.a(screen, C10682a.f35023a) == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                    }
                }
                return "unknown";
            }
        }
        return "places";
    }
}
