package com.tinder.fireboarding.domain;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.sj;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.C15756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/fireboarding/domain/AddProgressiveOnboardingUnlockEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/fireboarding/domain/AddProgressiveOnboardingUnlockEvent$FeatureUnlocked;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "request", "Companion", "FeatureUnlocked", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
public final class AddProgressiveOnboardingUnlockEvent implements VoidUseCase<FeatureUnlocked> {
    /* renamed from: a */
    public static final C9560a f38502a = new C9560a();
    /* renamed from: b */
    private final C2630h f38503b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/fireboarding/domain/AddProgressiveOnboardingUnlockEvent$FeatureUnlocked;", "", "anayticsValue", "", "(Ljava/lang/String;II)V", "getAnayticsValue", "()I", "REWIND", "SUPERLIKE", "BOOST", "GOLD", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    public enum FeatureUnlocked {
        ;
        
        private final int anayticsValue;

        protected FeatureUnlocked(int i) {
            this.anayticsValue = i;
        }

        public final int getAnayticsValue() {
            return this.anayticsValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/fireboarding/domain/AddProgressiveOnboardingUnlockEvent$Companion;", "", "()V", "createFeatureUnlockedFromLevel", "Lcom/tinder/fireboarding/domain/AddProgressiveOnboardingUnlockEvent$FeatureUnlocked;", "level", "Lcom/tinder/fireboarding/domain/Level;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.AddProgressiveOnboardingUnlockEvent$a */
    public static final class C9560a {
        private C9560a() {
        }

        @NotNull
        /* renamed from: a */
        public final FeatureUnlocked m39858a(@NotNull Level level) {
            C2668g.b(level, "level");
            switch (C9561a.f31963a[level.ordinal()]) {
                case 1:
                    return FeatureUnlocked.REWIND;
                case 2:
                    return FeatureUnlocked.SUPERLIKE;
                case 3:
                    return FeatureUnlocked.BOOST;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Cannot create Feature unlocked from level: ");
                    stringBuilder.append(level);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.AddProgressiveOnboardingUnlockEvent$b */
    static final class C11784b implements Action {
        /* renamed from: a */
        final /* synthetic */ AddProgressiveOnboardingUnlockEvent f38500a;
        /* renamed from: b */
        final /* synthetic */ FeatureUnlocked f38501b;

        C11784b(AddProgressiveOnboardingUnlockEvent addProgressiveOnboardingUnlockEvent, FeatureUnlocked featureUnlocked) {
            this.f38500a = addProgressiveOnboardingUnlockEvent;
            this.f38501b = featureUnlocked;
        }

        public final void run() {
            this.f38500a.f38503b.a(sj.m46131a().m38709a(Integer.valueOf(this.f38501b.getAnayticsValue())).m38710a());
        }
    }

    public AddProgressiveOnboardingUnlockEvent(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f38503b = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m47701a((FeatureUnlocked) obj);
    }

    /* renamed from: a */
    public void m47701a(@NotNull FeatureUnlocked featureUnlocked) {
        C2668g.b(featureUnlocked, "request");
        C3956a.a(new C11784b(this, featureUnlocked)).b(C15756a.b()).d();
    }
}
