package com.tinder.domain.boost.repository;

import io.reactivex.C3956a;
import io.reactivex.C3960g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/tinder/domain/boost/repository/BoostCursorRepository;", "", "boostCursor", "Lio/reactivex/Single;", "", "getBoostCursor", "()Lio/reactivex/Single;", "setBoostCursor", "Lio/reactivex/Completable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface BoostCursorRepository {
    @NotNull
    C3960g<String> getBoostCursor();

    @NotNull
    C3956a setBoostCursor(@NotNull String str);
}
