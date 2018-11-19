package com.tinder.loops.engine.extraction.decoder.filter;

import com.tinder.loops.engine.extraction.p281c.C9792a;
import com.tinder.loops.engine.extraction.p281c.C9796d;
import io.reactivex.FlowableTransformer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/loops/engine/extraction/decoder/filter/DecodedFrameFilter;", "Lio/reactivex/FlowableTransformer;", "Lcom/tinder/loops/engine/extraction/model/DecodedFrameInfo;", "bindExtractionParameters", "", "frameExtractionRequest", "Lcom/tinder/loops/engine/extraction/model/FrameExtractionRequest;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
public interface DecodedFrameFilter extends FlowableTransformer<C9792a, C9792a> {
    void bindExtractionParameters(@NotNull C9796d c9796d);
}
