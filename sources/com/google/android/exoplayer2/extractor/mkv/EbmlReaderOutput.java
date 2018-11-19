package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

interface EbmlReaderOutput {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ElementType {
    }

    /* renamed from: a */
    int mo2279a(int i);

    /* renamed from: a */
    void mo2280a(int i, double d) throws ParserException;

    /* renamed from: a */
    void mo2281a(int i, int i2, ExtractorInput extractorInput) throws IOException, InterruptedException;

    /* renamed from: a */
    void mo2282a(int i, long j) throws ParserException;

    /* renamed from: a */
    void mo2283a(int i, long j, long j2) throws ParserException;

    /* renamed from: a */
    void mo2284a(int i, String str) throws ParserException;

    /* renamed from: b */
    boolean mo2285b(int i);

    /* renamed from: c */
    void mo2286c(int i) throws ParserException;
}
