package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.util.C2310s;
import java.util.List;

public interface HlsExtractorFactory {
    /* renamed from: a */
    public static final HlsExtractorFactory f6350a = new C3692b();

    Pair<Extractor, Boolean> createExtractor(Extractor extractor, Uri uri, Format format, List<Format> list, DrmInitData drmInitData, C2310s c2310s);
}
