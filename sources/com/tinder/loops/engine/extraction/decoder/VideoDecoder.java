package com.tinder.loops.engine.extraction.decoder;

import android.graphics.Bitmap;
import com.tinder.loops.engine.extraction.p281c.C9792a;
import com.tinder.loops.engine.extraction.p281c.C9795c;
import com.tinder.loops.engine.extraction.p281c.C9796d;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¨\u0006\u000f"}, d2 = {"Lcom/tinder/loops/engine/extraction/decoder/VideoDecoder;", "", "bindFrameExtractionParameters", "", "frameExtractionRequest", "Lcom/tinder/loops/engine/extraction/model/FrameExtractionRequest;", "copyCurrentDecodedFrame", "Landroid/graphics/Bitmap;", "observeExtractedFrameInfo", "Lio/reactivex/Single;", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameInfo;", "release", "startDecodingFrames", "Lio/reactivex/Flowable;", "Lcom/tinder/loops/engine/extraction/model/DecodedFrameInfo;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
public interface VideoDecoder {
    void bindFrameExtractionParameters(@NotNull C9796d c9796d);

    @NotNull
    Bitmap copyCurrentDecodedFrame();

    @NotNull
    C3960g<C9795c> observeExtractedFrameInfo();

    void release();

    @NotNull
    C3957b<C9792a> startDecodingFrames();
}
