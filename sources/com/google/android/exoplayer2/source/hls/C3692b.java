package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.ts.C3645a;
import com.google.android.exoplayer2.extractor.ts.C3648c;
import com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.C2297h;
import com.google.android.exoplayer2.util.C2310s;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.hls.b */
public final class C3692b implements HlsExtractorFactory {
    public Pair<Extractor, Boolean> createExtractor(Extractor extractor, Uri uri, Format format, List<Format> list, DrmInitData drmInitData, C2310s c2310s) {
        uri = uri.getLastPathSegment();
        if (uri == null) {
            uri = "";
        }
        boolean z = false;
        if (!("text/vtt".equals(format.sampleMimeType) || uri.endsWith(".webvtt"))) {
            if (!uri.endsWith(".vtt")) {
                if (uri.endsWith(".aac")) {
                    extractor = new C3648c();
                } else {
                    if (!uri.endsWith(".ac3")) {
                        if (!uri.endsWith(".ec3")) {
                            if (uri.endsWith(".mp3")) {
                                extractor = new Mp3Extractor(0, null);
                            } else {
                                if (extractor == null) {
                                    if (uri.endsWith(".mp4") == null && uri.startsWith(".m4", uri.length() - 4) == null) {
                                        if (uri.startsWith(".mp4", uri.length() - 5) == null) {
                                            extractor = 16;
                                            if (list != null) {
                                                extractor = 48;
                                            } else {
                                                list = Collections.emptyList();
                                            }
                                            uri = format.codecs;
                                            if (TextUtils.isEmpty(uri) == null) {
                                                if ("audio/mp4a-latm".equals(C2297h.m8346e(uri)) == null) {
                                                    extractor |= 2;
                                                }
                                                if ("video/avc".equals(C2297h.m8345d(uri)) == null) {
                                                    extractor |= 4;
                                                }
                                            }
                                            extractor = new TsExtractor(2, c2310s, new DefaultTsPayloadReaderFactory(extractor, list));
                                        }
                                    }
                                    if (list == null) {
                                        list = Collections.emptyList();
                                    }
                                    Extractor fragmentedMp4Extractor = new FragmentedMp4Extractor(0, c2310s, null, drmInitData, list);
                                }
                                return Pair.create(extractor, Boolean.valueOf(z));
                            }
                        }
                    }
                    extractor = new C3645a();
                }
                z = true;
                return Pair.create(extractor, Boolean.valueOf(z));
            }
        }
        extractor = new C3693f(format.language, c2310s);
        return Pair.create(extractor, Boolean.valueOf(z));
    }
}
