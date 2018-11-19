package com.google.android.exoplayer2.audio;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2153n;
import java.nio.ByteBuffer;

public interface AudioSink {

    public static final class ConfigurationException extends Exception {
        public ConfigurationException(Throwable th) {
            super(th);
        }

        public ConfigurationException(String str) {
            super(str);
        }
    }

    public static final class InitializationException extends Exception {
        /* renamed from: a */
        public final int f5516a;

        public InitializationException(int i, int i2, int i3, int i4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioTrack init failed: ");
            stringBuilder.append(i);
            stringBuilder.append(", Config(");
            stringBuilder.append(i2);
            stringBuilder.append(", ");
            stringBuilder.append(i3);
            stringBuilder.append(", ");
            stringBuilder.append(i4);
            stringBuilder.append(")");
            super(stringBuilder.toString());
            this.f5516a = i;
        }
    }

    public interface Listener {
        void onAudioSessionId(int i);

        void onPositionDiscontinuity();

        void onUnderrun(int i, long j, long j2);
    }

    public static final class WriteException extends Exception {
        /* renamed from: a */
        public final int f5517a;

        public WriteException(int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioTrack write failed: ");
            stringBuilder.append(i);
            super(stringBuilder.toString());
            this.f5517a = i;
        }
    }

    void configure(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, int i6) throws ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21(int i);

    long getCurrentPositionUs(boolean z);

    C2153n getPlaybackParameters();

    boolean handleBuffer(ByteBuffer byteBuffer, long j) throws InitializationException, WriteException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEncodingSupported(int i);

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    void release();

    void reset();

    void setAudioAttributes(C2026a c2026a);

    void setAudioSessionId(int i);

    void setListener(Listener listener);

    C2153n setPlaybackParameters(C2153n c2153n);

    void setVolume(float f);
}
