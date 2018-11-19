package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C2122i;
import com.google.android.exoplayer2.C4237a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2297h;
import java.util.Collections;
import java.util.List;

public final class TextRenderer extends C4237a implements Callback {
    /* renamed from: a */
    private final Handler f14468a;
    /* renamed from: b */
    private final TextOutput f14469b;
    /* renamed from: c */
    private final SubtitleDecoderFactory f14470c;
    /* renamed from: d */
    private final C2122i f14471d;
    /* renamed from: e */
    private boolean f14472e;
    /* renamed from: f */
    private boolean f14473f;
    /* renamed from: g */
    private int f14474g;
    /* renamed from: h */
    private Format f14475h;
    /* renamed from: i */
    private SubtitleDecoder f14476i;
    /* renamed from: j */
    private C4259c f14477j;
    /* renamed from: k */
    private C4260d f14478k;
    /* renamed from: l */
    private C4260d f14479l;
    /* renamed from: m */
    private int f14480m;

    @Deprecated
    public interface Output extends TextOutput {
    }

    public boolean isReady() {
        return true;
    }

    public TextRenderer(TextOutput textOutput, Looper looper) {
        this(textOutput, looper, SubtitleDecoderFactory.f6451a);
    }

    public TextRenderer(TextOutput textOutput, Looper looper, SubtitleDecoderFactory subtitleDecoderFactory) {
        super(3);
        this.f14469b = (TextOutput) C2289a.m8309a((Object) textOutput);
        if (looper == null) {
            textOutput = null;
        } else {
            textOutput = new Handler(looper, this);
        }
        this.f14468a = textOutput;
        this.f14470c = subtitleDecoderFactory;
        this.f14471d = new C2122i();
    }

    public int supportsFormat(Format format) {
        if (!this.f14470c.supportsFormat(format)) {
            return C2297h.m8344c(format.sampleMimeType) != null ? 1 : null;
        } else {
            return C4237a.m16837a(null, (DrmInitData) format.drmInitData) != null ? 4 : 2;
        }
    }

    /* renamed from: a */
    protected void mo3726a(Format[] formatArr, long j) throws ExoPlaybackException {
        this.f14475h = formatArr[0];
        if (this.f14476i != null) {
            this.f14474g = 1;
        } else {
            this.f14476i = this.f14470c.createDecoder(this.f14475h);
        }
    }

    /* renamed from: a */
    protected void mo3718a(long j, boolean z) {
        m18035l();
        this.f14472e = false;
        this.f14473f = false;
        if (this.f14474g != null) {
            m18033j();
            return;
        }
        m18031h();
        this.f14476i.flush();
    }

    public void render(long j, long j2) throws ExoPlaybackException {
        if (this.f14473f == null) {
            if (this.f14479l == null) {
                this.f14476i.setPositionUs(j);
                try {
                    this.f14479l = (C4260d) this.f14476i.dequeueOutputBuffer();
                } catch (long j3) {
                    throw ExoPlaybackException.m7218a(j3, m16848f());
                }
            }
            if (getState() == 2) {
                if (this.f14478k != null) {
                    long k = m18034k();
                    j2 = null;
                    while (k <= j3) {
                        this.f14480m++;
                        k = m18034k();
                        j2 = 1;
                    }
                } else {
                    j2 = null;
                }
                if (this.f14479l != null) {
                    if (this.f14479l.m7344c()) {
                        if (j2 == null && m18034k() == Format.OFFSET_SAMPLE_RELATIVE) {
                            if (this.f14474g == 2) {
                                m18033j();
                            } else {
                                m18031h();
                                this.f14473f = true;
                            }
                        }
                    } else if (this.f14479l.a <= j3) {
                        if (this.f14478k != null) {
                            this.f14478k.mo3739e();
                        }
                        this.f14478k = this.f14479l;
                        this.f14479l = null;
                        this.f14480m = this.f14478k.getNextEventTimeIndex(j3);
                        j2 = 1;
                    }
                }
                if (j2 != null) {
                    m18029a(this.f14478k.getCues(j3));
                }
                if (this.f14474g != 2) {
                    while (this.f14472e == null) {
                        try {
                            if (this.f14477j == null) {
                                this.f14477j = (C4259c) this.f14476i.dequeueInputBuffer();
                                if (this.f14477j == null) {
                                    return;
                                }
                            }
                            if (this.f14474g == 1) {
                                this.f14477j.m7340a(4);
                                this.f14476i.queueInputBuffer(this.f14477j);
                                this.f14477j = null;
                                this.f14474g = 2;
                                return;
                            }
                            j3 = m16839a(this.f14471d, this.f14477j, false);
                            if (j3 == -4) {
                                if (this.f14477j.m7344c() != null) {
                                    this.f14472e = true;
                                } else {
                                    this.f14477j.f13794d = this.f14471d.f6062a.subsampleOffsetUs;
                                    this.f14477j.m13521h();
                                }
                                this.f14476i.queueInputBuffer(this.f14477j);
                                this.f14477j = null;
                            } else if (j3 == -3) {
                                return;
                            }
                        } catch (long j32) {
                            throw ExoPlaybackException.m7218a(j32, m16848f());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    protected void mo3721c() {
        this.f14475h = null;
        m18035l();
        m18032i();
    }

    public boolean isEnded() {
        return this.f14473f;
    }

    /* renamed from: h */
    private void m18031h() {
        this.f14477j = null;
        this.f14480m = -1;
        if (this.f14478k != null) {
            this.f14478k.mo3739e();
            this.f14478k = null;
        }
        if (this.f14479l != null) {
            this.f14479l.mo3739e();
            this.f14479l = null;
        }
    }

    /* renamed from: i */
    private void m18032i() {
        m18031h();
        this.f14476i.release();
        this.f14476i = null;
        this.f14474g = 0;
    }

    /* renamed from: j */
    private void m18033j() {
        m18032i();
        this.f14476i = this.f14470c.createDecoder(this.f14475h);
    }

    /* renamed from: k */
    private long m18034k() {
        if (this.f14480m != -1) {
            if (this.f14480m < this.f14478k.getEventTimeCount()) {
                return this.f14478k.getEventTime(this.f14480m);
            }
        }
        return Format.OFFSET_SAMPLE_RELATIVE;
    }

    /* renamed from: a */
    private void m18029a(List<Cue> list) {
        if (this.f14468a != null) {
            this.f14468a.obtainMessage(0, list).sendToTarget();
        } else {
            m18030b(list);
        }
    }

    /* renamed from: l */
    private void m18035l() {
        m18029a(Collections.emptyList());
    }

    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        m18030b((List) message.obj);
        return true;
    }

    /* renamed from: b */
    private void m18030b(List<Cue> list) {
        this.f14469b.onCues(list);
    }
}
