package com.google.android.exoplayer2.upstream.cache;

public interface ContentMetadata {
    boolean contains(String str);

    long get(String str, long j);

    String get(String str, String str2);

    byte[] get(String str, byte[] bArr);
}
