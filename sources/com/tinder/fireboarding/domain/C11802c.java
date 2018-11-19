package com.tinder.fireboarding.domain;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/fireboarding/domain/CompleteFireboardingLevel;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/fireboarding/domain/Level;", "fireboardingGame", "Lcom/tinder/fireboarding/domain/FireboardingGame;", "(Lcom/tinder/fireboarding/domain/FireboardingGame;)V", "execute", "Lio/reactivex/Completable;", "request", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.c */
public final class C11802c implements CompletableUseCase<Level> {
    /* renamed from: a */
    private final FireboardingGame f38522a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.c$a */
    static final class C11801a implements Action {
        /* renamed from: a */
        final /* synthetic */ C11802c f38520a;
        /* renamed from: b */
        final /* synthetic */ Level f38521b;

        C11801a(C11802c c11802c, Level level) {
            this.f38520a = c11802c;
            this.f38521b = level;
        }

        public final void run() {
            this.f38520a.f38522a.m39866a(this.f38521b);
        }
    }

    public C11802c(@NotNull FireboardingGame fireboardingGame) {
        C2668g.b(fireboardingGame, "fireboardingGame");
        this.f38522a = fireboardingGame;
    }

    public /* synthetic */ C3956a execute(Object obj) {
        return m47717a((Level) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3956a m47717a(@NotNull Level level) {
        C2668g.b(level, "request");
        level = C3956a.a(new C11801a(this, level));
        C2668g.a(level, "Completable.fromAction {…eLevel(request)\n        }");
        return level;
    }
}
