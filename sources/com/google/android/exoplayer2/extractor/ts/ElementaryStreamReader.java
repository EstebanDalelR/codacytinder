package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2302k;

public interface ElementaryStreamReader {
    void consume(C2302k c2302k) throws ParserException;

    void createTracks(ExtractorOutput extractorOutput, C2106c c2106c);

    void packetFinished();

    void packetStarted(long j, boolean z);

    void seek();
}
