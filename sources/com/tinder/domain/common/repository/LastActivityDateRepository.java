package com.tinder.domain.common.repository;

import io.reactivex.C3956a;
import io.reactivex.C3958c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tinder/domain/common/repository/LastActivityDateRepository;", "", "lastActivityDate", "Lio/reactivex/Maybe;", "Lorg/joda/time/DateTime;", "getLastActivityDate", "()Lio/reactivex/Maybe;", "clearLastActivityDate", "Lio/reactivex/Completable;", "updateLastActivityDate", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface LastActivityDateRepository {
    @NotNull
    C3956a clearLastActivityDate();

    @NotNull
    C3958c<DateTime> getLastActivityDate();

    @NotNull
    C3956a updateLastActivityDate(@NotNull DateTime dateTime);
}
