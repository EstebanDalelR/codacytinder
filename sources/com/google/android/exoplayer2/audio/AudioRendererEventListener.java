package com.google.android.exoplayer2.audio;

import android.os.Handler;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.C2037c;
import com.google.android.exoplayer2.util.C2289a;

public interface AudioRendererEventListener {

    /* renamed from: com.google.android.exoplayer2.audio.AudioRendererEventListener$a */
    public static final class C2020a {
        @Nullable
        /* renamed from: a */
        private final Handler f5514a;
        @Nullable
        /* renamed from: b */
        private final AudioRendererEventListener f5515b;

        public C2020a(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener) {
            this.f5514a = audioRendererEventListener != null ? (Handler) C2289a.m8309a((Object) handler) : null;
            this.f5515b = audioRendererEventListener;
        }

        /* renamed from: a */
        public void m7267a(final C2037c c2037c) {
            if (this.f5515b != null) {
                this.f5514a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2020a f5499b;

                    public void run() {
                        this.f5499b.f5515b.onAudioEnabled(c2037c);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7268a(String str, long j, long j2) {
            if (this.f5515b != null) {
                final String str2 = str;
                final long j3 = j;
                final long j4 = j2;
                this.f5514a.post(new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C2020a f5503d;

                    public void run() {
                        this.f5503d.f5515b.onAudioDecoderInitialized(str2, j3, j4);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7266a(final Format format) {
            if (this.f5515b != null) {
                this.f5514a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2020a f5505b;

                    public void run() {
                        this.f5505b.f5515b.onAudioInputFormatChanged(format);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7265a(int i, long j, long j2) {
            if (this.f5515b != null) {
                final int i2 = i;
                final long j3 = j;
                final long j4 = j2;
                this.f5514a.post(new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C2020a f5509d;

                    public void run() {
                        this.f5509d.f5515b.onAudioSinkUnderrun(i2, j3, j4);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m7269b(final C2037c c2037c) {
            if (this.f5515b != null) {
                this.f5514a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2020a f5511b;

                    public void run() {
                        c2037c.m7353a();
                        this.f5511b.f5515b.onAudioDisabled(c2037c);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m7264a(final int i) {
            if (this.f5515b != null) {
                this.f5514a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2020a f5513b;

                    public void run() {
                        this.f5513b.f5515b.onAudioSessionId(i);
                    }
                });
            }
        }
    }

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDisabled(C2037c c2037c);

    void onAudioEnabled(C2037c c2037c);

    void onAudioInputFormatChanged(Format format);

    void onAudioSessionId(int i);

    void onAudioSinkUnderrun(int i, long j, long j2);
}
