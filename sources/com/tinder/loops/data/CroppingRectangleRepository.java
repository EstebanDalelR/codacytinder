package com.tinder.loops.data;

import com.tinder.loops.engine.creation.p277d.C9781a;
import io.reactivex.C3957b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/tinder/loops/data/CroppingRectangleRepository;", "", "clear", "", "observeCroppingRectangle", "Lio/reactivex/Flowable;", "Lcom/tinder/loops/engine/creation/model/CroppingRectangle;", "update", "croppingRectangle", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
public interface CroppingRectangleRepository {
    void clear();

    @NotNull
    C3957b<C9781a> observeCroppingRectangle();

    void update(@NotNull C9781a c9781a);
}
