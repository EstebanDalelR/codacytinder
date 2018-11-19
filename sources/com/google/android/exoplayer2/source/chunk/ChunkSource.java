package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.C2162p;
import java.io.IOException;
import java.util.List;

public interface ChunkSource {
    long getAdjustedSeekPositionUs(long j, C2162p c2162p);

    void getNextChunk(C4249g c4249g, long j, long j2, C2191d c2191d);

    int getPreferredQueueSize(long j, List<? extends C4249g> list);

    void maybeThrowError() throws IOException;

    void onChunkLoadCompleted(C3680c c3680c);

    boolean onChunkLoadError(C3680c c3680c, boolean z, Exception exception);
}
