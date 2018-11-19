package com.tinder.domain.fastmatch.newCount;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\b\u0010\f\u001a\u00020\u0006H&J\b\u0010\r\u001a\u00020\u0006H&¨\u0006\u000f"}, d2 = {"Lcom/tinder/domain/fastmatch/newCount/NewCountFetcher;", "", "fetchCount", "Lrx/Single;", "", "initFetch", "", "token", "", "observeState", "Lrx/Observable;", "Lcom/tinder/domain/fastmatch/newCount/NewCountFetcher$State;", "rescheduleState", "resetState", "State", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface NewCountFetcher {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/fastmatch/newCount/NewCountFetcher$State;", "", "(Ljava/lang/String;I)V", "UNINITIALIZED", "INITIALIZED", "RESCHEDULED", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum State {
    }

    @NotNull
    Single<Integer> fetchCount();

    void initFetch(@NotNull String str);

    @NotNull
    Observable<State> observeState();

    void rescheduleState();

    void resetState();
}
