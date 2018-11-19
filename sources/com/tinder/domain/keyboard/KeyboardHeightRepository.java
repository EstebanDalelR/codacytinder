package com.tinder.domain.keyboard;

import io.reactivex.C3959e;
import io.reactivex.C3960g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/keyboard/KeyboardHeightRepository;", "", "clear", "", "observe", "Lio/reactivex/Single;", "", "observeCurrent", "Lio/reactivex/Observable;", "update", "height", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface KeyboardHeightRepository {
    void clear();

    @NotNull
    C3960g<Integer> observe();

    @NotNull
    C3959e<Integer> observeCurrent();

    void update(int i);
}
