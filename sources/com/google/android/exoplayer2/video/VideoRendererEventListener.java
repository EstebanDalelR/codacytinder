package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.C2037c;
import com.google.android.exoplayer2.util.C2289a;

public interface VideoRendererEventListener {

    /* renamed from: com.google.android.exoplayer2.video.VideoRendererEventListener$a */
    public static final class C2326a {
        @Nullable
        /* renamed from: a */
        private final Handler f6990a;
        @Nullable
        /* renamed from: b */
        private final VideoRendererEventListener f6991b;

        public C2326a(@Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener) {
            this.f6990a = videoRendererEventListener != null ? (Handler) C2289a.m8309a((Object) handler) : null;
            this.f6991b = videoRendererEventListener;
        }

        /* renamed from: a */
        public void m8518a(final C2037c c2037c) {
            if (this.f6991b != null) {
                this.f6990a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2326a f6971b;

                    public void run() {
                        this.f6971b.f6991b.onVideoEnabled(c2037c);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8519a(String str, long j, long j2) {
            if (this.f6991b != null) {
                final String str2 = str;
                final long j3 = j;
                final long j4 = j2;
                this.f6990a.post(new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C2326a f6975d;

                    public void run() {
                        this.f6975d.f6991b.onVideoDecoderInitialized(str2, j3, j4);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8517a(final Format format) {
            if (this.f6991b != null) {
                this.f6990a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2326a f6977b;

                    public void run() {
                        this.f6977b.f6991b.onVideoInputFormatChanged(format);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8515a(final int i, final long j) {
            if (this.f6991b != null) {
                this.f6990a.post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ C2326a f6980c;

                    public void run() {
                        this.f6980c.f6991b.onDroppedFrames(i, j);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8514a(int i, int i2, int i3, float f) {
            if (this.f6991b != null) {
                final int i4 = i;
                final int i5 = i2;
                final int i6 = i3;
                final float f2 = f;
                this.f6990a.post(new Runnable(this) {
                    /* renamed from: e */
                    final /* synthetic */ C2326a f6985e;

                    public void run() {
                        this.f6985e.f6991b.onVideoSizeChanged(i4, i5, i6, f2);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m8516a(final Surface surface) {
            if (this.f6991b != null) {
                this.f6990a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2326a f6987b;

                    public void run() {
                        this.f6987b.f6991b.onRenderedFirstFrame(surface);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m8520b(final C2037c c2037c) {
            if (this.f6991b != null) {
                this.f6990a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2326a f6989b;

                    public void run() {
                        c2037c.m7353a();
                        this.f6989b.f6991b.onVideoDisabled(c2037c);
                    }
                });
            }
        }
    }

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(Surface surface);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void onVideoDisabled(C2037c c2037c);

    void onVideoEnabled(C2037c c2037c);

    void onVideoInputFormatChanged(Format format);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
