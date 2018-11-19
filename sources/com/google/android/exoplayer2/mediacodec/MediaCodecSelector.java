package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;

public interface MediaCodecSelector {
    /* renamed from: a */
    public static final MediaCodecSelector f6112a = new C36631();

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecSelector$1 */
    static class C36631 implements MediaCodecSelector {
        C36631() {
        }

        public C2130a getDecoderInfo(String str, boolean z) throws DecoderQueryException {
            return MediaCodecUtil.m7650a(str, z);
        }

        public C2130a getPassthroughDecoderInfo() throws DecoderQueryException {
            return MediaCodecUtil.m7649a();
        }
    }

    C2130a getDecoderInfo(String str, boolean z) throws DecoderQueryException;

    C2130a getPassthroughDecoderInfo() throws DecoderQueryException;
}
