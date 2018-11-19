package com.tinder.loops.domain.repository;

import com.tinder.loops.engine.extraction.p281c.C9794b;
import io.reactivex.C3960g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/tinder/loops/domain/repository/ExtractedFrameRepository;", "", "clear", "", "hasExtractedFrames", "", "observeExtractedFrames", "Lio/reactivex/Single;", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameContext;", "update", "extractedFrameContext", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
public interface ExtractedFrameRepository {
    void clear();

    boolean hasExtractedFrames();

    @NotNull
    C3960g<C9794b> observeExtractedFrames();

    void update(@NotNull C9794b c9794b);
}
