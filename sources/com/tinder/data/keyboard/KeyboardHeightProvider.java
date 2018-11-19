package com.tinder.data.keyboard;

import io.reactivex.C3959e;
import io.reactivex.C3960g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/keyboard/KeyboardHeightProvider;", "", "observe", "Lio/reactivex/Single;", "", "observeCurrent", "Lio/reactivex/Observable;", "data_release"}, k = 1, mv = {1, 1, 10})
public interface KeyboardHeightProvider {
    @NotNull
    C3960g<Integer> observe();

    @NotNull
    C3959e<Integer> observeCurrent();
}
