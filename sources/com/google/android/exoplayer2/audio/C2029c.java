package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2314v;

/* renamed from: com.google.android.exoplayer2.audio.c */
final class C2029c {
    @Nullable
    /* renamed from: a */
    private final C2028a f5566a;
    /* renamed from: b */
    private int f5567b;
    /* renamed from: c */
    private long f5568c;
    /* renamed from: d */
    private long f5569d;
    /* renamed from: e */
    private long f5570e;
    /* renamed from: f */
    private long f5571f;

    @TargetApi(19)
    /* renamed from: com.google.android.exoplayer2.audio.c$a */
    private static final class C2028a {
        /* renamed from: a */
        private final AudioTrack f5561a;
        /* renamed from: b */
        private final AudioTimestamp f5562b = new AudioTimestamp();
        /* renamed from: c */
        private long f5563c;
        /* renamed from: d */
        private long f5564d;
        /* renamed from: e */
        private long f5565e;

        public C2028a(AudioTrack audioTrack) {
            this.f5561a = audioTrack;
        }

        /* renamed from: a */
        public boolean m7298a() {
            boolean timestamp = this.f5561a.getTimestamp(this.f5562b);
            if (timestamp) {
                long j = this.f5562b.framePosition;
                if (this.f5564d > j) {
                    this.f5563c++;
                }
                this.f5564d = j;
                this.f5565e = j + (this.f5563c << 32);
            }
            return timestamp;
        }

        /* renamed from: b */
        public long m7299b() {
            return this.f5562b.nanoTime / 1000;
        }

        /* renamed from: c */
        public long m7300c() {
            return this.f5565e;
        }
    }

    public C2029c(AudioTrack audioTrack) {
        if (C2314v.f6956a >= 19) {
            this.f5566a = new C2028a(audioTrack);
            m7307e();
            return;
        }
        this.f5566a = null;
        m7301a(3);
    }

    /* renamed from: a */
    public boolean m7303a(long j) {
        if (this.f5566a != null) {
            if (j - this.f5570e >= this.f5569d) {
                this.f5570e = j;
                boolean a = this.f5566a.m7298a();
                switch (this.f5567b) {
                    case 0:
                        if (!a) {
                            if (j - this.f5568c > 500000) {
                                m7301a((int) 3);
                                break;
                            }
                        } else if (this.f5566a.m7299b() < this.f5568c) {
                            a = false;
                            break;
                        } else {
                            this.f5571f = this.f5566a.m7300c();
                            m7301a((int) 1);
                            break;
                        }
                        break;
                    case 1:
                        if (a) {
                            if (this.f5566a.m7300c() > this.f5571f) {
                                m7301a((int) 2);
                                break;
                            }
                        }
                        m7307e();
                        break;
                        break;
                    case 2:
                        if (!a) {
                            m7307e();
                            break;
                        }
                        break;
                    case 3:
                        if (a) {
                            m7307e();
                            break;
                        }
                        break;
                    case 4:
                        break;
                    default:
                        throw new IllegalStateException();
                }
                return a;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m7302a() {
        m7301a(4);
    }

    /* renamed from: b */
    public void m7304b() {
        if (this.f5567b == 4) {
            m7307e();
        }
    }

    /* renamed from: c */
    public boolean m7305c() {
        if (this.f5567b != 1) {
            return this.f5567b == 2;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    public boolean m7306d() {
        return this.f5567b == 2;
    }

    /* renamed from: e */
    public void m7307e() {
        if (this.f5566a != null) {
            m7301a(0);
        }
    }

    /* renamed from: f */
    public long m7308f() {
        return this.f5566a != null ? this.f5566a.m7299b() : -9223372036854775807L;
    }

    /* renamed from: g */
    public long m7309g() {
        return this.f5566a != null ? this.f5566a.m7300c() : -1;
    }

    /* renamed from: a */
    private void m7301a(int i) {
        this.f5567b = i;
        switch (i) {
            case 0:
                this.f5570e = 0;
                this.f5571f = -1;
                this.f5568c = System.nanoTime() / 1000;
                this.f5569d = 5000;
                return;
            case 1:
                this.f5569d = 5000;
                return;
            case 2:
            case 3:
                this.f5569d = 10000000;
                return;
            case 4:
                this.f5569d = 500000;
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
