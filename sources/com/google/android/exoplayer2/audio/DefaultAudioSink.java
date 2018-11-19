package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.exoplayer2.C2005C;
import com.google.android.exoplayer2.C2153n;
import com.google.android.exoplayer2.audio.AudioSink.ConfigurationException;
import com.google.android.exoplayer2.audio.AudioSink.InitializationException;
import com.google.android.exoplayer2.audio.AudioSink.Listener;
import com.google.android.exoplayer2.audio.AudioSink.WriteException;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.model.GlobalConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public final class DefaultAudioSink implements AudioSink {
    /* renamed from: a */
    public static boolean f10707a = false;
    /* renamed from: b */
    public static boolean f10708b = false;
    /* renamed from: A */
    private C2153n f10709A;
    /* renamed from: B */
    private long f10710B;
    /* renamed from: C */
    private long f10711C;
    @Nullable
    /* renamed from: D */
    private ByteBuffer f10712D;
    /* renamed from: E */
    private int f10713E;
    /* renamed from: F */
    private int f10714F;
    /* renamed from: G */
    private long f10715G;
    /* renamed from: H */
    private long f10716H;
    /* renamed from: I */
    private int f10717I;
    /* renamed from: J */
    private long f10718J;
    /* renamed from: K */
    private long f10719K;
    /* renamed from: L */
    private int f10720L;
    /* renamed from: M */
    private int f10721M;
    /* renamed from: N */
    private long f10722N;
    /* renamed from: O */
    private float f10723O;
    /* renamed from: P */
    private AudioProcessor[] f10724P;
    /* renamed from: Q */
    private ByteBuffer[] f10725Q;
    @Nullable
    /* renamed from: R */
    private ByteBuffer f10726R;
    @Nullable
    /* renamed from: S */
    private ByteBuffer f10727S;
    /* renamed from: T */
    private byte[] f10728T;
    /* renamed from: U */
    private int f10729U;
    /* renamed from: V */
    private int f10730V;
    /* renamed from: W */
    private boolean f10731W;
    /* renamed from: X */
    private boolean f10732X;
    /* renamed from: Y */
    private int f10733Y;
    /* renamed from: Z */
    private boolean f10734Z;
    private long aa;
    @Nullable
    /* renamed from: c */
    private final C2027b f10735c;
    /* renamed from: d */
    private final AudioProcessorChain f10736d;
    /* renamed from: e */
    private final boolean f10737e;
    /* renamed from: f */
    private final C3591d f10738f;
    /* renamed from: g */
    private final C3597l f10739g;
    /* renamed from: h */
    private final AudioProcessor[] f10740h;
    /* renamed from: i */
    private final AudioProcessor[] f10741i;
    /* renamed from: j */
    private final ConditionVariable f10742j;
    /* renamed from: k */
    private final AudioTrackPositionTracker f10743k;
    /* renamed from: l */
    private final ArrayDeque<C2023b> f10744l;
    @Nullable
    /* renamed from: m */
    private Listener f10745m;
    @Nullable
    /* renamed from: n */
    private AudioTrack f10746n;
    /* renamed from: o */
    private AudioTrack f10747o;
    /* renamed from: p */
    private boolean f10748p;
    /* renamed from: q */
    private boolean f10749q;
    /* renamed from: r */
    private int f10750r;
    /* renamed from: s */
    private int f10751s;
    /* renamed from: t */
    private int f10752t;
    /* renamed from: u */
    private int f10753u;
    /* renamed from: v */
    private C2026a f10754v;
    /* renamed from: w */
    private boolean f10755w;
    /* renamed from: x */
    private boolean f10756x;
    /* renamed from: y */
    private int f10757y;
    @Nullable
    /* renamed from: z */
    private C2153n f10758z;

    public interface AudioProcessorChain {
        C2153n applyPlaybackParameters(C2153n c2153n);

        AudioProcessor[] getAudioProcessors();

        long getMediaDuration(long j);

        long getSkippedOutputFrameCount();
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$b */
    private static final class C2023b {
        /* renamed from: a */
        private final C2153n f5547a;
        /* renamed from: b */
        private final long f5548b;
        /* renamed from: c */
        private final long f5549c;

        private C2023b(C2153n c2153n, long j, long j2) {
            this.f5547a = c2153n;
            this.f5548b = j;
            this.f5549c = j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$a */
    public static class C3589a implements AudioProcessorChain {
        /* renamed from: a */
        private final AudioProcessor[] f10703a;
        /* renamed from: b */
        private final C3595i f10704b = new C3595i();
        /* renamed from: c */
        private final C3596k f10705c = new C3596k();

        public C3589a(AudioProcessor... audioProcessorArr) {
            this.f10703a = (AudioProcessor[]) Arrays.copyOf(audioProcessorArr, audioProcessorArr.length + 2);
            this.f10703a[audioProcessorArr.length] = this.f10704b;
            this.f10703a[audioProcessorArr.length + 1] = this.f10705c;
        }

        public AudioProcessor[] getAudioProcessors() {
            return this.f10703a;
        }

        public C2153n applyPlaybackParameters(C2153n c2153n) {
            this.f10704b.m13507a(c2153n.f6154d);
            return new C2153n(this.f10705c.m13508a(c2153n.f6152b), this.f10705c.m13510b(c2153n.f6153c), c2153n.f6154d);
        }

        public long getMediaDuration(long j) {
            return this.f10705c.m13509a(j);
        }

        public long getSkippedOutputFrameCount() {
            return this.f10704b.m13506a();
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$c */
    private final class C3590c implements AudioTrackPositionTracker.Listener {
        /* renamed from: a */
        final /* synthetic */ DefaultAudioSink f10706a;

        private C3590c(DefaultAudioSink defaultAudioSink) {
            this.f10706a = defaultAudioSink;
        }

        public void onPositionFramesMismatch(long j, long j2, long j3, long j4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Spurious audio timestamp (frame position mismatch): ");
            stringBuilder.append(j);
            stringBuilder.append(", ");
            stringBuilder.append(j2);
            stringBuilder.append(", ");
            stringBuilder.append(j3);
            stringBuilder.append(", ");
            stringBuilder.append(j4);
            stringBuilder.append(", ");
            stringBuilder.append(this.f10706a.m13489h());
            stringBuilder.append(", ");
            stringBuilder.append(this.f10706a.m13490i());
            j = stringBuilder.toString();
            if (DefaultAudioSink.f10708b) {
                throw new InvalidAudioTrackTimestampException(j);
            }
            Log.w("AudioTrack", j);
        }

        public void onSystemTimeUsMismatch(long j, long j2, long j3, long j4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Spurious audio timestamp (system clock mismatch): ");
            stringBuilder.append(j);
            stringBuilder.append(", ");
            stringBuilder.append(j2);
            stringBuilder.append(", ");
            stringBuilder.append(j3);
            stringBuilder.append(", ");
            stringBuilder.append(j4);
            stringBuilder.append(", ");
            stringBuilder.append(this.f10706a.m13489h());
            stringBuilder.append(", ");
            stringBuilder.append(this.f10706a.m13490i());
            j = stringBuilder.toString();
            if (DefaultAudioSink.f10708b) {
                throw new InvalidAudioTrackTimestampException(j);
            }
            Log.w("AudioTrack", j);
        }

        public void onInvalidLatency(long j) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring impossibly large audio latency: ");
            stringBuilder.append(j);
            Log.w("AudioTrack", stringBuilder.toString());
        }

        public void onUnderrun(int i, long j) {
            if (this.f10706a.f10745m != null) {
                this.f10706a.f10745m.onUnderrun(i, j, SystemClock.elapsedRealtime() - this.f10706a.aa);
            }
        }
    }

    public DefaultAudioSink(@Nullable C2027b c2027b, AudioProcessor[] audioProcessorArr) {
        this(c2027b, audioProcessorArr, false);
    }

    public DefaultAudioSink(@Nullable C2027b c2027b, AudioProcessor[] audioProcessorArr, boolean z) {
        this(c2027b, new C3589a(audioProcessorArr), z);
    }

    public DefaultAudioSink(@Nullable C2027b c2027b, AudioProcessorChain audioProcessorChain, boolean z) {
        this.f10735c = c2027b;
        this.f10736d = (AudioProcessorChain) C2289a.m8309a((Object) audioProcessorChain);
        this.f10737e = z;
        this.f10742j = new ConditionVariable(true);
        this.f10743k = new AudioTrackPositionTracker(new C3590c());
        this.f10738f = new C3591d();
        this.f10739g = new C3597l();
        c2027b = new ArrayList();
        Collections.addAll(c2027b, new AudioProcessor[]{new C3594h(), this.f10738f, this.f10739g});
        Collections.addAll(c2027b, audioProcessorChain.getAudioProcessors());
        this.f10740h = (AudioProcessor[]) c2027b.toArray(new AudioProcessor[c2027b.size()]);
        this.f10741i = new AudioProcessor[]{new C3592f()};
        this.f10723O = 1.0f;
        this.f10721M = 0;
        this.f10754v = C2026a.f5553a;
        this.f10733Y = 0;
        this.f10709A = C2153n.f6151a;
        this.f10730V = -1;
        this.f10724P = new AudioProcessor[0];
        this.f10725Q = new ByteBuffer[0];
        this.f10744l = new ArrayDeque();
    }

    public void setListener(Listener listener) {
        this.f10745m = listener;
    }

    public boolean isEncodingSupported(int i) {
        boolean z = true;
        if (C2314v.m8490c(i)) {
            if (i == 4) {
                if (C2314v.f6956a < 21) {
                    z = false;
                }
            }
            return z;
        }
        if (this.f10735c == null || this.f10735c.m7297a(i) == 0) {
            z = false;
        }
        return z;
    }

    public long getCurrentPositionUs(boolean z) {
        if (m13488g()) {
            if (this.f10721M != 0) {
                return this.f10722N + m13477c(m13473b(Math.min(this.f10743k.m7279a(z), m13483e(m13490i()))));
            }
        }
        return Long.MIN_VALUE;
    }

    public void configure(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, int i6) throws ConfigurationException {
        this.f10750r = i3;
        this.f10748p = C2314v.m8490c(i);
        boolean z = true;
        boolean z2 = this.f10737e && isEncodingSupported(1073741824) && C2314v.m8494d(i);
        this.f10749q = z2;
        if (this.f10748p) {
            this.f10714F = C2314v.m8483b(i, i2);
        }
        int i7 = 4;
        z2 = this.f10748p && i != 4;
        boolean z3 = z2 && !this.f10749q;
        this.f10756x = z3;
        if (z2) {
            this.f10739g.m13511a(i5, i6);
            this.f10738f.m13494a(iArr);
            iArr = m13493l();
            i5 = iArr.length;
            int i8 = i;
            i6 = i3;
            i = 0;
            i3 = 0;
            while (i < i5) {
                AudioProcessor audioProcessor = iArr[i];
                try {
                    i3 |= audioProcessor.configure(i6, i2, i8);
                    if (audioProcessor.isActive()) {
                        i2 = audioProcessor.getOutputChannelCount();
                        i6 = audioProcessor.getOutputSampleRateHz();
                        i8 = audioProcessor.getOutputEncoding();
                    }
                    i++;
                } catch (Throwable e) {
                    throw new ConfigurationException(e);
                }
            }
            i = i8;
        } else {
            i6 = i3;
            i3 = 0;
        }
        iArr = 12;
        i5 = 252;
        switch (i2) {
            case 1:
                break;
            case 2:
                i7 = 12;
                break;
            case 3:
                i7 = 28;
                break;
            case 4:
                i7 = 204;
                break;
            case 5:
                i7 = 220;
                break;
            case 6:
                i7 = 252;
                break;
            case 7:
                i7 = 1276;
                break;
            case 8:
                i7 = C2005C.f5443a;
                break;
            default:
                i3 = new StringBuilder();
                i3.append("Unsupported channel count: ");
                i3.append(i2);
                throw new ConfigurationException(i3.toString());
        }
        if (C2314v.f6956a <= 23 && "foster".equals(C2314v.f6957b) && "NVIDIA".equals(C2314v.f6958c)) {
            if (!(i2 == 3 || i2 == 5)) {
                if (i2 == 7) {
                    i5 = C2005C.f5443a;
                }
            }
            if (C2314v.f6956a <= 25 || !"fugu".equals(C2314v.f6957b) || this.f10748p || i2 != 1) {
                iArr = i5;
            }
            if (i3 == 0 || m13488g() == 0 || this.f10753u != i || this.f10751s != i6 || this.f10752t != iArr) {
                reset();
                this.f10755w = z2;
                this.f10751s = i6;
                this.f10752t = iArr;
                this.f10753u = i;
                this.f10717I = this.f10748p == 0 ? C2314v.m8483b(this.f10753u, i2) : -1;
                if (i4 != 0) {
                    this.f10757y = i4;
                } else if (this.f10748p == 0) {
                    i = AudioTrack.getMinBufferSize(i6, iArr, this.f10753u);
                    if (i != -2) {
                        z = false;
                    }
                    C2289a.m8313b(z);
                    this.f10757y = C2314v.m8456a(i * 4, ((int) m13486f(250000)) * this.f10717I, (int) Math.max((long) i, m13486f(750000) * ((long) this.f10717I)));
                } else {
                    if (this.f10753u != 5) {
                        if (this.f10753u == 6) {
                            if (this.f10753u != 7) {
                                this.f10757y = 49152;
                            } else {
                                this.f10757y = 294912;
                            }
                        }
                    }
                    this.f10757y = 20480;
                }
            }
            return;
        }
        i5 = i7;
        if (C2314v.f6956a <= 25) {
        }
        iArr = i5;
        if (i3 == 0) {
        }
        reset();
        this.f10755w = z2;
        this.f10751s = i6;
        this.f10752t = iArr;
        this.f10753u = i;
        if (this.f10748p == 0) {
        }
        this.f10717I = this.f10748p == 0 ? C2314v.m8483b(this.f10753u, i2) : -1;
        if (i4 != 0) {
            this.f10757y = i4;
        } else if (this.f10748p == 0) {
            if (this.f10753u != 5) {
                if (this.f10753u == 6) {
                    if (this.f10753u != 7) {
                        this.f10757y = 294912;
                    } else {
                        this.f10757y = 49152;
                    }
                }
            }
            this.f10757y = 20480;
        } else {
            i = AudioTrack.getMinBufferSize(i6, iArr, this.f10753u);
            if (i != -2) {
                z = false;
            }
            C2289a.m8313b(z);
            this.f10757y = C2314v.m8456a(i * 4, ((int) m13486f(250000)) * this.f10717I, (int) Math.max((long) i, m13486f(750000) * ((long) this.f10717I)));
        }
    }

    /* renamed from: a */
    private void m13469a() {
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : m13493l()) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.f10724P = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.f10725Q = new ByteBuffer[size];
        m13475b();
    }

    /* renamed from: b */
    private void m13475b() {
        for (int i = 0; i < this.f10724P.length; i++) {
            AudioProcessor audioProcessor = this.f10724P[i];
            audioProcessor.flush();
            this.f10725Q[i] = audioProcessor.getOutput();
        }
    }

    /* renamed from: c */
    private void m13479c() throws InitializationException {
        this.f10742j.block();
        this.f10747o = m13491j();
        int audioSessionId = this.f10747o.getAudioSessionId();
        if (f10707a && C2314v.f6956a < 21) {
            if (!(this.f10746n == null || audioSessionId == this.f10746n.getAudioSessionId())) {
                m13487f();
            }
            if (this.f10746n == null) {
                this.f10746n = m13467a(audioSessionId);
            }
        }
        if (this.f10733Y != audioSessionId) {
            this.f10733Y = audioSessionId;
            if (this.f10745m != null) {
                this.f10745m.onAudioSessionId(audioSessionId);
            }
        }
        this.f10709A = this.f10756x ? this.f10736d.applyPlaybackParameters(this.f10709A) : C2153n.f6151a;
        m13469a();
        this.f10743k.m7281a(this.f10747o, this.f10753u, this.f10717I, this.f10757y);
        m13485e();
    }

    public void play() {
        this.f10732X = true;
        if (m13488g()) {
            this.f10743k.m7280a();
            this.f10747o.play();
        }
    }

    public void handleDiscontinuity() {
        if (this.f10721M == 1) {
            this.f10721M = 2;
        }
    }

    public boolean handleBuffer(ByteBuffer byteBuffer, long j) throws InitializationException, WriteException {
        boolean z;
        long d;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        if (this.f10726R != null) {
            if (byteBuffer2 != r0.f10726R) {
                z = false;
                C2289a.m8311a(z);
                if (!m13488g()) {
                    m13479c();
                    if (r0.f10732X) {
                        play();
                    }
                }
                if (!r0.f10743k.m7282a(m13490i())) {
                    return false;
                }
                if (r0.f10726R == null) {
                    if (!byteBuffer.hasRemaining()) {
                        return true;
                    }
                    if (!r0.f10748p && r0.f10720L == 0) {
                        r0.f10720L = m13464a(r0.f10753u, byteBuffer2);
                        if (r0.f10720L == 0) {
                            return true;
                        }
                    }
                    if (r0.f10758z != null) {
                        if (!m13482d()) {
                            return false;
                        }
                        C2153n c2153n = r0.f10758z;
                        r0.f10758z = null;
                        r0.f10744l.add(new C2023b(r0.f10736d.applyPlaybackParameters(c2153n), Math.max(0, j2), m13483e(m13490i())));
                        m13469a();
                    }
                    if (r0.f10721M != 0) {
                        r0.f10722N = Math.max(0, j2);
                        r0.f10721M = 1;
                    } else {
                        d = r0.f10722N + m13480d(m13489h());
                        if (r0.f10721M == 1 && Math.abs(d - j2) > 200000) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Discontinuity detected [expected ");
                            stringBuilder.append(d);
                            stringBuilder.append(", got ");
                            stringBuilder.append(j2);
                            stringBuilder.append("]");
                            Log.e("AudioTrack", stringBuilder.toString());
                            r0.f10721M = 2;
                        }
                        if (r0.f10721M == 2) {
                            r0.f10722N += j2 - d;
                            r0.f10721M = 1;
                            if (r0.f10745m != null) {
                                r0.f10745m.onPositionDiscontinuity();
                            }
                        }
                    }
                    if (r0.f10748p) {
                        r0.f10716H += (long) r0.f10720L;
                    } else {
                        r0.f10715G += (long) byteBuffer.remaining();
                    }
                    r0.f10726R = byteBuffer2;
                }
                if (r0.f10755w) {
                    m13472a(r0.f10726R, j2);
                } else {
                    m13470a(j2);
                }
                if (!r0.f10726R.hasRemaining()) {
                    r0.f10726R = null;
                    return true;
                } else if (r0.f10743k.m7286c(m13490i())) {
                    return false;
                } else {
                    Log.w("AudioTrack", "Resetting stalled audio track");
                    reset();
                    return true;
                }
            }
        }
        z = true;
        C2289a.m8311a(z);
        if (m13488g()) {
            m13479c();
            if (r0.f10732X) {
                play();
            }
        }
        if (!r0.f10743k.m7282a(m13490i())) {
            return false;
        }
        if (r0.f10726R == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            r0.f10720L = m13464a(r0.f10753u, byteBuffer2);
            if (r0.f10720L == 0) {
                return true;
            }
            if (r0.f10758z != null) {
                if (!m13482d()) {
                    return false;
                }
                C2153n c2153n2 = r0.f10758z;
                r0.f10758z = null;
                r0.f10744l.add(new C2023b(r0.f10736d.applyPlaybackParameters(c2153n2), Math.max(0, j2), m13483e(m13490i())));
                m13469a();
            }
            if (r0.f10721M != 0) {
                d = r0.f10722N + m13480d(m13489h());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Discontinuity detected [expected ");
                stringBuilder2.append(d);
                stringBuilder2.append(", got ");
                stringBuilder2.append(j2);
                stringBuilder2.append("]");
                Log.e("AudioTrack", stringBuilder2.toString());
                r0.f10721M = 2;
                if (r0.f10721M == 2) {
                    r0.f10722N += j2 - d;
                    r0.f10721M = 1;
                    if (r0.f10745m != null) {
                        r0.f10745m.onPositionDiscontinuity();
                    }
                }
            } else {
                r0.f10722N = Math.max(0, j2);
                r0.f10721M = 1;
            }
            if (r0.f10748p) {
                r0.f10716H += (long) r0.f10720L;
            } else {
                r0.f10715G += (long) byteBuffer.remaining();
            }
            r0.f10726R = byteBuffer2;
        }
        if (r0.f10755w) {
            m13472a(r0.f10726R, j2);
        } else {
            m13470a(j2);
        }
        if (!r0.f10726R.hasRemaining()) {
            r0.f10726R = null;
            return true;
        } else if (r0.f10743k.m7286c(m13490i())) {
            return false;
        } else {
            Log.w("AudioTrack", "Resetting stalled audio track");
            reset();
            return true;
        }
    }

    /* renamed from: a */
    private void m13470a(long j) throws WriteException {
        int length = this.f10724P.length;
        int i = length;
        while (i >= 0) {
            ByteBuffer byteBuffer = i > 0 ? this.f10725Q[i - 1] : this.f10726R != null ? this.f10726R : AudioProcessor.f5497a;
            if (i == length) {
                m13472a(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.f10724P[i];
                audioProcessor.queueInput(byteBuffer);
                ByteBuffer output = audioProcessor.getOutput();
                this.f10725Q[i] = output;
                if (output.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m13472a(ByteBuffer byteBuffer, long j) throws WriteException {
        if (byteBuffer.hasRemaining()) {
            int remaining;
            boolean z = true;
            int i = 0;
            if (this.f10727S != null) {
                C2289a.m8311a(this.f10727S == byteBuffer);
            } else {
                this.f10727S = byteBuffer;
                if (C2314v.f6956a < 21) {
                    remaining = byteBuffer.remaining();
                    if (this.f10728T == null || this.f10728T.length < remaining) {
                        this.f10728T = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f10728T, 0, remaining);
                    byteBuffer.position(position);
                    this.f10729U = 0;
                }
            }
            remaining = byteBuffer.remaining();
            if (C2314v.f6956a < 21) {
                j = this.f10743k.m7283b(this.f10718J);
                if (j > null) {
                    i = this.f10747o.write(this.f10728T, this.f10729U, Math.min(remaining, j));
                    if (i > 0) {
                        this.f10729U += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                }
            } else if (this.f10734Z) {
                if (j == -9223372036854775807L) {
                    z = false;
                }
                C2289a.m8313b(z);
                i = m13466a(this.f10747o, byteBuffer, remaining, j);
            } else {
                i = m13465a(this.f10747o, byteBuffer, remaining);
            }
            this.aa = SystemClock.elapsedRealtime();
            if (i < 0) {
                throw new WriteException(i);
            }
            if (this.f10748p != null) {
                this.f10718J += (long) i;
            }
            if (i == remaining) {
                if (this.f10748p == null) {
                    this.f10719K += (long) this.f10720L;
                }
                this.f10727S = null;
            }
        }
    }

    public void playToEndOfStream() throws WriteException {
        if (!this.f10731W) {
            if (m13488g()) {
                if (m13482d()) {
                    this.f10743k.m7288d(m13490i());
                    this.f10747o.stop();
                    this.f10713E = 0;
                    this.f10731W = true;
                }
            }
        }
    }

    /* renamed from: d */
    private boolean m13482d() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r8 = this;
        r0 = r8.f10730V;
        r1 = -1;
        r2 = 1;
        r3 = 0;
        if (r0 != r1) goto L_0x0014;
    L_0x0007:
        r0 = r8.f10755w;
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        r0 = 0;
        goto L_0x0010;
    L_0x000d:
        r0 = r8.f10724P;
        r0 = r0.length;
    L_0x0010:
        r8.f10730V = r0;
    L_0x0012:
        r0 = 1;
        goto L_0x0015;
    L_0x0014:
        r0 = 0;
    L_0x0015:
        r4 = r8.f10730V;
        r5 = r8.f10724P;
        r5 = r5.length;
        r6 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        if (r4 >= r5) goto L_0x003c;
    L_0x0021:
        r4 = r8.f10724P;
        r5 = r8.f10730V;
        r4 = r4[r5];
        if (r0 == 0) goto L_0x002c;
    L_0x0029:
        r4.queueEndOfStream();
    L_0x002c:
        r8.m13470a(r6);
        r0 = r4.isEnded();
        if (r0 != 0) goto L_0x0036;
    L_0x0035:
        return r3;
    L_0x0036:
        r0 = r8.f10730V;
        r0 = r0 + r2;
        r8.f10730V = r0;
        goto L_0x0012;
    L_0x003c:
        r0 = r8.f10727S;
        if (r0 == 0) goto L_0x004a;
    L_0x0040:
        r0 = r8.f10727S;
        r8.m13472a(r0, r6);
        r0 = r8.f10727S;
        if (r0 == 0) goto L_0x004a;
    L_0x0049:
        return r3;
    L_0x004a:
        r8.f10730V = r1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.d():boolean");
    }

    public boolean isEnded() {
        if (m13488g()) {
            if (!this.f10731W || hasPendingData()) {
                return false;
            }
        }
        return true;
    }

    public boolean hasPendingData() {
        return m13488g() && this.f10743k.m7289e(m13490i());
    }

    public C2153n setPlaybackParameters(C2153n c2153n) {
        if (!m13488g() || this.f10756x) {
            Object a = this.f10758z != null ? this.f10758z : !this.f10744l.isEmpty() ? ((C2023b) this.f10744l.getLast()).f5547a : this.f10709A;
            if (!c2153n.equals(a)) {
                if (m13488g()) {
                    this.f10758z = c2153n;
                } else {
                    this.f10709A = this.f10736d.applyPlaybackParameters(c2153n);
                }
            }
            return this.f10709A;
        }
        this.f10709A = C2153n.f6151a;
        return this.f10709A;
    }

    public C2153n getPlaybackParameters() {
        return this.f10709A;
    }

    public void setAudioAttributes(C2026a c2026a) {
        if (!this.f10754v.equals(c2026a)) {
            this.f10754v = c2026a;
            if (this.f10734Z == null) {
                reset();
                this.f10733Y = null;
            }
        }
    }

    public void setAudioSessionId(int i) {
        if (this.f10733Y != i) {
            this.f10733Y = i;
            reset();
        }
    }

    public void enableTunnelingV21(int i) {
        C2289a.m8313b(C2314v.f6956a >= 21);
        if (!this.f10734Z || this.f10733Y != i) {
            this.f10734Z = true;
            this.f10733Y = i;
            reset();
        }
    }

    public void disableTunneling() {
        if (this.f10734Z) {
            this.f10734Z = false;
            this.f10733Y = 0;
            reset();
        }
    }

    public void setVolume(float f) {
        if (this.f10723O != f) {
            this.f10723O = f;
            m13485e();
        }
    }

    /* renamed from: e */
    private void m13485e() {
        if (!m13488g()) {
            return;
        }
        if (C2314v.f6956a >= 21) {
            m13471a(this.f10747o, this.f10723O);
        } else {
            m13476b(this.f10747o, this.f10723O);
        }
    }

    public void pause() {
        this.f10732X = false;
        if (m13488g() && this.f10743k.m7285c()) {
            this.f10747o.pause();
        }
    }

    public void reset() {
        if (m13488g()) {
            this.f10715G = 0;
            this.f10716H = 0;
            this.f10718J = 0;
            this.f10719K = 0;
            this.f10720L = 0;
            if (this.f10758z != null) {
                this.f10709A = this.f10758z;
                this.f10758z = null;
            } else if (!this.f10744l.isEmpty()) {
                this.f10709A = ((C2023b) this.f10744l.getLast()).f5547a;
            }
            this.f10744l.clear();
            this.f10710B = 0;
            this.f10711C = 0;
            this.f10726R = null;
            this.f10727S = null;
            m13475b();
            this.f10731W = false;
            this.f10730V = -1;
            this.f10712D = null;
            this.f10713E = 0;
            this.f10721M = 0;
            if (this.f10743k.m7284b()) {
                this.f10747o.pause();
            }
            final AudioTrack audioTrack = this.f10747o;
            this.f10747o = null;
            this.f10743k.m7287d();
            this.f10742j.close();
            new Thread(this) {
                /* renamed from: b */
                final /* synthetic */ DefaultAudioSink f5544b;

                public void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        this.f5544b.f10742j.open();
                    }
                }
            }.start();
        }
    }

    public void release() {
        reset();
        m13487f();
        for (AudioProcessor reset : this.f10740h) {
            reset.reset();
        }
        for (AudioProcessor reset2 : this.f10741i) {
            reset2.reset();
        }
        this.f10733Y = 0;
        this.f10732X = false;
    }

    /* renamed from: f */
    private void m13487f() {
        if (this.f10746n != null) {
            final AudioTrack audioTrack = this.f10746n;
            this.f10746n = null;
            new Thread(this) {
                /* renamed from: b */
                final /* synthetic */ DefaultAudioSink f5546b;

                public void run() {
                    audioTrack.release();
                }
            }.start();
        }
    }

    /* renamed from: b */
    private long m13473b(long j) {
        C2023b c2023b = null;
        while (!this.f10744l.isEmpty() && j >= ((C2023b) this.f10744l.getFirst()).f5549c) {
            c2023b = (C2023b) this.f10744l.remove();
        }
        if (c2023b != null) {
            this.f10709A = c2023b.f5547a;
            this.f10711C = c2023b.f5549c;
            this.f10710B = c2023b.f5548b - this.f10722N;
        }
        if (this.f10709A.f6152b == 1.0f) {
            return (j + this.f10710B) - this.f10711C;
        }
        if (this.f10744l.isEmpty()) {
            return this.f10710B + this.f10736d.getMediaDuration(j - this.f10711C);
        }
        return this.f10710B + C2314v.m8461a(j - this.f10711C, this.f10709A.f6152b);
    }

    /* renamed from: c */
    private long m13477c(long j) {
        return j + m13483e(this.f10736d.getSkippedOutputFrameCount());
    }

    /* renamed from: g */
    private boolean m13488g() {
        return this.f10747o != null;
    }

    /* renamed from: d */
    private long m13480d(long j) {
        return (j * 1000000) / ((long) this.f10750r);
    }

    /* renamed from: e */
    private long m13483e(long j) {
        return (j * 1000000) / ((long) this.f10751s);
    }

    /* renamed from: f */
    private long m13486f(long j) {
        return (j * ((long) this.f10751s)) / 1000000;
    }

    /* renamed from: h */
    private long m13489h() {
        return this.f10748p ? this.f10715G / ((long) this.f10714F) : this.f10716H;
    }

    /* renamed from: i */
    private long m13490i() {
        return this.f10748p ? this.f10718J / ((long) this.f10717I) : this.f10719K;
    }

    /* renamed from: j */
    private android.media.AudioTrack m13491j() throws com.google.android.exoplayer2.audio.AudioSink.InitializationException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r9 = this;
        r0 = com.google.android.exoplayer2.util.C2314v.f6956a;
        r1 = 21;
        if (r0 < r1) goto L_0x000b;
    L_0x0006:
        r0 = r9.m13492k();
        goto L_0x0038;
    L_0x000b:
        r0 = r9.f10754v;
        r0 = r0.f5556d;
        r2 = com.google.android.exoplayer2.util.C2314v.m8495e(r0);
        r0 = r9.f10733Y;
        if (r0 != 0) goto L_0x0027;
    L_0x0017:
        r0 = new android.media.AudioTrack;
        r3 = r9.f10751s;
        r4 = r9.f10752t;
        r5 = r9.f10753u;
        r6 = r9.f10757y;
        r7 = 1;
        r1 = r0;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        goto L_0x0038;
    L_0x0027:
        r0 = new android.media.AudioTrack;
        r3 = r9.f10751s;
        r4 = r9.f10752t;
        r5 = r9.f10753u;
        r6 = r9.f10757y;
        r7 = 1;
        r8 = r9.f10733Y;
        r1 = r0;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);
    L_0x0038:
        r1 = r0.getState();
        r2 = 1;
        if (r1 == r2) goto L_0x004e;
    L_0x003f:
        r0.release();	 Catch:{ Exception -> 0x0042 }
    L_0x0042:
        r0 = new com.google.android.exoplayer2.audio.AudioSink$InitializationException;
        r2 = r9.f10751s;
        r3 = r9.f10752t;
        r4 = r9.f10757y;
        r0.<init>(r1, r2, r3, r4);
        throw r0;
    L_0x004e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.j():android.media.AudioTrack");
    }

    @TargetApi(21)
    /* renamed from: k */
    private AudioTrack m13492k() {
        AudioAttributes build;
        if (this.f10734Z) {
            build = new Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            build = this.f10754v.m7294a();
        }
        return new AudioTrack(build, new AudioFormat.Builder().setChannelMask(this.f10752t).setEncoding(this.f10753u).setSampleRate(this.f10751s).build(), this.f10757y, 1, this.f10733Y != 0 ? this.f10733Y : 0);
    }

    /* renamed from: a */
    private AudioTrack m13467a(int i) {
        return new AudioTrack(3, GlobalConfig.DEFAULT_RECS_INTERVAL, 4, 2, 2, 0, i);
    }

    /* renamed from: l */
    private AudioProcessor[] m13493l() {
        return this.f10749q ? this.f10741i : this.f10740h;
    }

    /* renamed from: a */
    private static int m13464a(int i, ByteBuffer byteBuffer) {
        if (i != 7) {
            if (i != 8) {
                if (i == 5) {
                    return Ac3Util.m7253a();
                }
                if (i == 6) {
                    return Ac3Util.m7255a(byteBuffer);
                }
                if (i == 14) {
                    i = Ac3Util.m7260b(byteBuffer);
                    if (i == -1) {
                        i = 0;
                    } else {
                        i = Ac3Util.m7256a(byteBuffer, i) * 16;
                    }
                    return i;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected audio encoding: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return C2030e.m7310a(byteBuffer);
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m13465a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    /* renamed from: a */
    private int m13466a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.f10712D == null) {
            this.f10712D = ByteBuffer.allocate(16);
            this.f10712D.order(ByteOrder.BIG_ENDIAN);
            this.f10712D.putInt(1431633921);
        }
        if (this.f10713E == 0) {
            this.f10712D.putInt(4, i);
            this.f10712D.putLong(8, j * 1000);
            this.f10712D.position(0);
            this.f10713E = i;
        }
        j = this.f10712D.remaining();
        if (j > null) {
            int write = audioTrack.write(this.f10712D, j, 1);
            if (write < 0) {
                this.f10713E = 0;
                return write;
            } else if (write < j) {
                return 0;
            }
        }
        audioTrack = m13465a(audioTrack, byteBuffer, i);
        if (audioTrack < null) {
            this.f10713E = 0;
            return audioTrack;
        }
        this.f10713E -= audioTrack;
        return audioTrack;
    }

    @TargetApi(21)
    /* renamed from: a */
    private static void m13471a(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* renamed from: b */
    private static void m13476b(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }
}
