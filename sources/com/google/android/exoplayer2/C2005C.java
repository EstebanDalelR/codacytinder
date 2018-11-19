package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.C2314v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.C */
public final class C2005C {
    /* renamed from: a */
    public static final int f5443a = (C2314v.f6956a < 23 ? 1020 : 6396);
    /* renamed from: b */
    public static final UUID f5444b = new UUID(0, 0);
    /* renamed from: c */
    public static final UUID f5445c = new UUID(1186680826959645954L, -5988876978535335093L);
    /* renamed from: d */
    public static final UUID f5446d = new UUID(-2129748144642739255L, 8654423357094679310L);
    /* renamed from: e */
    public static final UUID f5447e = new UUID(-1301668207276963122L, -6645017420763422227L);
    /* renamed from: f */
    public static final UUID f5448f = new UUID(-7348484286925749626L, -6083546864340672619L);

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$AudioContentType */
    public @interface AudioContentType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$AudioFlags */
    public @interface AudioFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$AudioUsage */
    public @interface AudioUsage {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$BufferFlags */
    public @interface BufferFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$ColorRange */
    public @interface ColorRange {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$ColorSpace */
    public @interface ColorSpace {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$ColorTransfer */
    public @interface ColorTransfer {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$ContentType */
    public @interface ContentType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$CryptoMode */
    public @interface CryptoMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$Encoding */
    public @interface Encoding {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$PcmEncoding */
    public @interface PcmEncoding {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$SelectionFlags */
    public @interface SelectionFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$StereoMode */
    public @interface StereoMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$StreamType */
    public @interface StreamType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.C$VideoScalingMode */
    public @interface VideoScalingMode {
    }

    /* renamed from: b */
    public static long m7216b(long j) {
        return j != -9223372036854775807L ? j == Long.MIN_VALUE ? j : j * 1000 : j;
    }

    /* renamed from: a */
    public static long m7215a(long j) {
        if (j != -9223372036854775807L) {
            return j == Long.MIN_VALUE ? j : j / 1000;
        } else {
            return j;
        }
    }
}
