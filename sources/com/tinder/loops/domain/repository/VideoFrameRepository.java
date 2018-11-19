package com.tinder.loops.domain.repository;

import android.arch.paging.C0054f;
import com.tinder.loops.engine.common.p273b.C9770a;
import io.reactivex.C3957b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/tinder/loops/domain/repository/VideoFrameRepository;", "", "requestFrames", "Lio/reactivex/Flowable;", "Landroid/arch/paging/PagedList;", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "url", "", "maxDimension", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
public interface VideoFrameRepository {
    @NotNull
    C3957b<C0054f<C9770a>> requestFrames(@NotNull String str, int i);
}
