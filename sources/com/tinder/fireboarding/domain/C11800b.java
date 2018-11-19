package com.tinder.fireboarding.domain;

import com.tinder.domain.common.reactivex.usecase.SingleResultUseCase;
import io.reactivex.C3960g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/fireboarding/domain/AreAllLevelsComplete;", "Lcom/tinder/domain/common/reactivex/usecase/SingleResultUseCase;", "", "completedLevelRepository", "Lcom/tinder/fireboarding/domain/CompletedLevelRepository;", "(Lcom/tinder/fireboarding/domain/CompletedLevelRepository;)V", "execute", "Lio/reactivex/Single;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.domain.b */
public final class C11800b implements SingleResultUseCase<Boolean> {
    /* renamed from: a */
    private final CompletedLevelRepository f38519a;

    public C11800b(@NotNull CompletedLevelRepository completedLevelRepository) {
        C2668g.b(completedLevelRepository, "completedLevelRepository");
        this.f38519a = completedLevelRepository;
    }

    @NotNull
    public C3960g<Boolean> execute() {
        Set completedLevels = this.f38519a.getCompletedLevels();
        boolean z = true;
        for (Object contains : Level.values()) {
            if (!completedLevels.contains(contains)) {
                z = false;
            }
        }
        C3960g<Boolean> a = C3960g.a(Boolean.valueOf(z));
        C2668g.a(a, "Single.just(areAllLevelsComplete)");
        return a;
    }
}
