package com.tinder.fireboarding.domain;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/fireboarding/domain/CompletedLevelsProgressiveOnboardingAdapter;", "", "orderedFireboardingLevels", "", "Lcom/tinder/fireboarding/domain/Level;", "(Ljava/util/List;)V", "adapt", "Lcom/tinder/fireboarding/domain/ProgressiveOnboarding;", "completedLevels", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.d */
public final class C9562d {
    /* renamed from: a */
    private final List<Level> f31964a;

    public C9562d(@NotNull List<? extends Level> list) {
        C2668g.b(list, "orderedFireboardingLevels");
        this.f31964a = list;
    }

    @NotNull
    /* renamed from: a */
    public final ProgressiveOnboarding m39869a(@NotNull Set<? extends Level> set) {
        C2668g.b(set, "completedLevels");
        if (set.isEmpty()) {
            return ProgressiveOnboarding.IN_ONBOARDING_NOTHING_UNLOCKED;
        }
        for (Level level : C19301m.i(this.f31964a)) {
            if (set.contains(level)) {
                switch (C9563e.f31965a[level.ordinal()]) {
                    case 1:
                        set = ProgressiveOnboarding.IN_ONBOARDING_NOTHING_UNLOCKED;
                        break;
                    case 2:
                        set = ProgressiveOnboarding.UNLOCKED_REWIND;
                        break;
                    case 3:
                        set = ProgressiveOnboarding.UNLOCKED_SUPERLIKE;
                        break;
                    case 4:
                        set = ProgressiveOnboarding.UNLOCKED_BOOST;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return set;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot create progressive onboarding from levels ");
        stringBuilder.append(set);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
