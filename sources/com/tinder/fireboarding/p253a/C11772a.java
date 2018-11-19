package com.tinder.fireboarding.p253a;

import com.tinder.fireboarding.domain.C11820s;
import com.tinder.fireboarding.domain.CompletedLevelRepository;
import com.tinder.fireboarding.domain.FireboardingGame.GameListener;
import com.tinder.fireboarding.domain.Level;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.collections.C19282g;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/fireboarding/data/CompleteGameFireboardingListener;", "Lcom/tinder/fireboarding/domain/FireboardingGame$GameListener;", "completedLevelRepository", "Lcom/tinder/fireboarding/domain/CompletedLevelRepository;", "removeInjectedFireboardingRec", "Lcom/tinder/fireboarding/domain/RemoveInjectedFireboardingRec;", "(Lcom/tinder/fireboarding/domain/CompletedLevelRepository;Lcom/tinder/fireboarding/domain/RemoveInjectedFireboardingRec;)V", "onGameCompleted", "", "onLevelCompleted", "level", "Lcom/tinder/fireboarding/domain/Level;", "onNextLevelAvailable", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.a.a */
public final class C11772a implements GameListener {
    /* renamed from: a */
    private final CompletedLevelRepository f38480a;
    /* renamed from: b */
    private final C11820s f38481b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/tinder/fireboarding/domain/Level;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.a.a$a */
    static final class C11769a<T, R> implements Function<Level, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C11772a f38477a;

        C11769a(C11772a c11772a) {
            this.f38477a = c11772a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47684a((Level) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m47684a(@NotNull Level level) {
            C2668g.b(level, "it");
            return this.f38477a.f38480a.completeLevel(level);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.a.a$b */
    static final class C11770b implements Action {
        /* renamed from: a */
        public static final C11770b f38478a = new C11770b();

        C11770b() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.a.a$c */
    static final class C11771c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11771c f38479a = new C11771c();

        C11771c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47685a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47685a(Throwable th) {
            C0001a.c(th, "Error completing game", new Object[0]);
        }
    }

    public void onLevelCompleted(@NotNull Level level) {
        C2668g.b(level, "level");
    }

    public void onNextLevelAvailable(@NotNull Level level) {
        C2668g.b(level, "level");
    }

    public C11772a(@NotNull CompletedLevelRepository completedLevelRepository, @NotNull C11820s c11820s) {
        C2668g.b(completedLevelRepository, "completedLevelRepository");
        C2668g.b(c11820s, "removeInjectedFireboardingRec");
        this.f38480a = completedLevelRepository;
        this.f38481b = c11820s;
    }

    public void onGameCompleted() {
        C3959e.fromIterable(C19282g.m(Level.values())).flatMapCompletable(new C11769a(this)).b(this.f38481b.execute()).a(C11770b.f38478a, C11771c.f38479a);
    }
}
