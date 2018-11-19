package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.model.Tutorial;
import io.reactivex.C3956a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewedStatus;", "", "execute", "Lio/reactivex/Completable;", "request", "Lcom/tinder/domain/profile/model/Tutorial;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface ConfirmTutorialsViewedStatus {
    @NotNull
    C3956a execute(@NotNull Tutorial tutorial);
}
