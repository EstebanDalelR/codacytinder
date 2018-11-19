package com.tinder.provider;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/tinder/provider/RxProvider;", "T", "", "observe", "Lrx/Observable;", "base_release"}, k = 1, mv = {1, 1, 10})
public interface RxProvider<T> {
    @NotNull
    Observable<T> observe();
}
