package com.tinder.fireboarding.p253a;

import com.tinder.fireboarding.domain.C11804j;
import com.tinder.fireboarding.domain.FireboardingGame.GameListener;
import com.tinder.fireboarding.domain.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/fireboarding/data/RecsInjectionFireboardingGameListener;", "Lcom/tinder/fireboarding/domain/FireboardingGame$GameListener;", "injectFireboardingRec", "Lcom/tinder/fireboarding/domain/InjectFireboardingRec;", "(Lcom/tinder/fireboarding/domain/InjectFireboardingRec;)V", "onGameCompleted", "", "onLevelCompleted", "level", "Lcom/tinder/fireboarding/domain/Level;", "onNextLevelAvailable", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.a.e */
public final class C11783e implements GameListener {
    /* renamed from: a */
    private final C11804j f38499a;

    public void onGameCompleted() {
    }

    public void onLevelCompleted(@NotNull Level level) {
        C2668g.b(level, "level");
    }

    public C11783e(@NotNull C11804j c11804j) {
        C2668g.b(c11804j, "injectFireboardingRec");
        this.f38499a = c11804j;
    }

    public void onNextLevelAvailable(@NotNull Level level) {
        C2668g.b(level, "level");
        if (level != Level.LIKE_AND_PASS) {
            this.f38499a.m47721a(level).d();
        }
    }
}
