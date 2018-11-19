package com.google.android.exoplayer2.extractor;

import java.io.IOException;

public interface Extractor {
    void init(ExtractorOutput extractorOutput);

    int read(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException;

    void release();

    void seek(long j, long j2);

    boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException;
}
