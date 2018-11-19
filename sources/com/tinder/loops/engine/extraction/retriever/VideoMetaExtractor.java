package com.tinder.loops.engine.extraction.retriever;

import com.tinder.loops.engine.extraction.p281c.C9798f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/loops/engine/extraction/retriever/VideoMetaExtractor;", "", "extractVideoInfo", "Lcom/tinder/loops/engine/extraction/model/VideoMeta;", "videoUriString", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
public interface VideoMetaExtractor {
    @NotNull
    C9798f extractVideoInfo(@NotNull String str);
}