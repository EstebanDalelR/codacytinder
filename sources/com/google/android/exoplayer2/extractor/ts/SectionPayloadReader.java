package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2106c;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2310s;

public interface SectionPayloadReader {
    void consume(C2302k c2302k);

    void init(C2310s c2310s, ExtractorOutput extractorOutput, C2106c c2106c);
}
