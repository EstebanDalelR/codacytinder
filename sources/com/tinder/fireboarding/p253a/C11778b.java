package com.tinder.fireboarding.p253a;

import com.tinder.fireboarding.domain.AddProgressiveOnboardingUnlockEvent;
import com.tinder.fireboarding.domain.CompletedLevelRepository;
import com.tinder.fireboarding.domain.FireboardingGame.GameListener;
import com.tinder.fireboarding.domain.Level;
import com.tinder.recs.domain.usecase.IncrementRewindsAvailable;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/fireboarding/data/CompleteLevelFireboardingListener;", "Lcom/tinder/fireboarding/domain/FireboardingGame$GameListener;", "completedLevelRepository", "Lcom/tinder/fireboarding/domain/CompletedLevelRepository;", "incrementRewindsAvailable", "Lcom/tinder/recs/domain/usecase/IncrementRewindsAvailable;", "addProgressiveOnboardingUnlockEvent", "Lcom/tinder/fireboarding/domain/AddProgressiveOnboardingUnlockEvent;", "(Lcom/tinder/fireboarding/domain/CompletedLevelRepository;Lcom/tinder/recs/domain/usecase/IncrementRewindsAvailable;Lcom/tinder/fireboarding/domain/AddProgressiveOnboardingUnlockEvent;)V", "onGameCompleted", "", "onLevelCompleted", "level", "Lcom/tinder/fireboarding/domain/Level;", "onNextLevelAvailable", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.a.b */
public final class C11778b implements GameListener {
    /* renamed from: a */
    private final CompletedLevelRepository f38488a;
    /* renamed from: b */
    private final IncrementRewindsAvailable f38489b;
    /* renamed from: c */
    private final AddProgressiveOnboardingUnlockEvent f38490c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/fireboarding/domain/Level;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.a.b$a */
    static final class C11774a<T, R> implements Function<Level, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C11778b f38483a;
        /* renamed from: b */
        final /* synthetic */ Level f38484b;

        C11774a(C11778b c11778b, Level level) {
            this.f38483a = c11778b;
            this.f38484b = level;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47687a((Level) obj);
        }

        /* renamed from: a */
        public final CompletableSource m47687a(@NotNull Level level) {
            C2668g.b(level, "it");
            if (this.f38484b != Level.LIKE_AND_PASS) {
                return C3956a.a((Action) new Action() {
                    public final void run() {
                        this.f38483a.f38490c.m47701a(AddProgressiveOnboardingUnlockEvent.f38502a.m39858a(this.f38484b));
                    }
                });
            }
            return C3956a.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "isLevelRewind", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/CompletableSource;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.a.b$b */
    static final class C11775b<T, R> implements Function<Boolean, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C11778b f38485a;

        C11775b(C11778b c11778b) {
            this.f38485a = c11778b;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47688a((Boolean) obj);
        }

        /* renamed from: a */
        public final CompletableSource m47688a(@NotNull Boolean bool) {
            C2668g.b(bool, "isLevelRewind");
            if (bool.booleanValue() != null) {
                return this.f38485a.f38489b.execute();
            }
            return C3956a.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.a.b$c */
    static final class C11776c implements Action {
        /* renamed from: a */
        public static final C11776c f38486a = new C11776c();

        C11776c() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.a.b$d */
    static final class C11777d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11777d f38487a = new C11777d();

        C11777d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47689a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47689a(Throwable th) {
            C0001a.c(th, "Failed to complete level", new Object[0]);
        }
    }

    public void onGameCompleted() {
    }

    public void onNextLevelAvailable(@NotNull Level level) {
        C2668g.b(level, "level");
    }

    public C11778b(@NotNull CompletedLevelRepository completedLevelRepository, @NotNull IncrementRewindsAvailable incrementRewindsAvailable, @NotNull AddProgressiveOnboardingUnlockEvent addProgressiveOnboardingUnlockEvent) {
        C2668g.b(completedLevelRepository, "completedLevelRepository");
        C2668g.b(incrementRewindsAvailable, "incrementRewindsAvailable");
        C2668g.b(addProgressiveOnboardingUnlockEvent, "addProgressiveOnboardingUnlockEvent");
        this.f38488a = completedLevelRepository;
        this.f38489b = incrementRewindsAvailable;
        this.f38490c = addProgressiveOnboardingUnlockEvent;
    }

    public void onLevelCompleted(@NotNull Level level) {
        C2668g.b(level, "level");
        this.f38488a.completeLevel(level).b(C3960g.a(level).d(new C11774a(this, level))).b(C3960g.a(Boolean.valueOf(level == Level.REWIND ? true : null)).d(new C11775b(this))).a(C11776c.f38486a, C11777d.f38487a);
    }
}
