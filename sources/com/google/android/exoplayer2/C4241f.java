package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C2165q.C2163a;
import com.google.android.exoplayer2.C2165q.C2164b;
import com.google.android.exoplayer2.ExoPlayer.C2006a;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Player.TextComponent;
import com.google.android.exoplayer2.Player.VideoComponent;
import com.google.android.exoplayer2.PlayerMessage.Target;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C2255e;
import com.google.android.exoplayer2.trackselection.C2256f;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import com.google.android.exoplayer2.util.Clock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.exoplayer2.f */
final class C4241f implements ExoPlayer {
    /* renamed from: a */
    private final Renderer[] f13586a;
    /* renamed from: b */
    private final TrackSelector f13587b;
    /* renamed from: c */
    private final C2256f f13588c;
    /* renamed from: d */
    private final Handler f13589d;
    /* renamed from: e */
    private final C4242g f13590e;
    /* renamed from: f */
    private final Handler f13591f;
    /* renamed from: g */
    private final CopyOnWriteArraySet<EventListener> f13592g;
    /* renamed from: h */
    private final C2164b f13593h;
    /* renamed from: i */
    private final C2163a f13594i;
    /* renamed from: j */
    private boolean f13595j;
    /* renamed from: k */
    private int f13596k;
    /* renamed from: l */
    private boolean f13597l;
    /* renamed from: m */
    private int f13598m;
    /* renamed from: n */
    private boolean f13599n;
    /* renamed from: o */
    private boolean f13600o;
    /* renamed from: p */
    private C2153n f13601p;
    @Nullable
    /* renamed from: q */
    private ExoPlaybackException f13602q;
    /* renamed from: r */
    private C2126m f13603r;
    /* renamed from: s */
    private int f13604s;
    /* renamed from: t */
    private int f13605t;
    /* renamed from: u */
    private long f13606u;

    public TextComponent getTextComponent() {
        return null;
    }

    public VideoComponent getVideoComponent() {
        return null;
    }

    @SuppressLint({"HandlerLeak"})
    public C4241f(Renderer[] rendererArr, TrackSelector trackSelector, LoadControl loadControl, Clock clock) {
        Object obj = rendererArr;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Init ");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" [");
        stringBuilder.append("ExoPlayerLib/2.8.1");
        stringBuilder.append("] [");
        stringBuilder.append(C2314v.f6960e);
        stringBuilder.append("]");
        Log.i("ExoPlayerImpl", stringBuilder.toString());
        C2289a.m8313b(obj.length > 0);
        r11.f13586a = (Renderer[]) C2289a.m8309a(obj);
        r11.f13587b = (TrackSelector) C2289a.m8309a((Object) trackSelector);
        r11.f13595j = false;
        r11.f13596k = 0;
        r11.f13597l = false;
        r11.f13592g = new CopyOnWriteArraySet();
        r11.f13588c = new C2256f(new C2154o[obj.length], new TrackSelection[obj.length], null);
        r11.f13593h = new C2164b();
        r11.f13594i = new C2163a();
        r11.f13601p = C2153n.f6151a;
        r11.f13589d = new Handler(r11, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()) {
            /* renamed from: a */
            final /* synthetic */ C4241f f6043a;

            public void handleMessage(Message message) {
                this.f6043a.m16861a(message);
            }
        };
        r11.f13603r = new C2126m(C2165q.f6219a, 0, TrackGroupArray.EMPTY, r11.f13588c);
        r11.f13590e = new C4242g(obj, trackSelector, r11.f13588c, loadControl, r11.f13595j, r11.f13596k, r11.f13597l, r11.f13589d, r11, clock);
        r11.f13591f = new Handler(r11.f13590e.m16925b());
    }

    public Looper getPlaybackLooper() {
        return this.f13590e.m16925b();
    }

    public void addListener(EventListener eventListener) {
        this.f13592g.add(eventListener);
    }

    public void removeListener(EventListener eventListener) {
        this.f13592g.remove(eventListener);
    }

    public int getPlaybackState() {
        return this.f13603r.f6102f;
    }

    @Nullable
    public ExoPlaybackException getPlaybackError() {
        return this.f13602q;
    }

    public void prepare(MediaSource mediaSource) {
        prepare(mediaSource, true, true);
    }

    public void prepare(MediaSource mediaSource, boolean z, boolean z2) {
        this.f13602q = null;
        C2126m a = m16857a(z, z2, 2);
        this.f13599n = true;
        this.f13598m++;
        this.f13590e.m16923a(mediaSource, z, z2);
        m16859a(a, false, 4, 1, false);
    }

    public void setPlayWhenReady(boolean z) {
        if (this.f13595j != z) {
            this.f13595j = z;
            this.f13590e.m16924a(z);
            C2126m c2126m = this.f13603r;
            Iterator it = this.f13592g.iterator();
            while (it.hasNext()) {
                ((EventListener) it.next()).onPlayerStateChanged(z, c2126m.f6102f);
            }
        }
    }

    public boolean getPlayWhenReady() {
        return this.f13595j;
    }

    public void setRepeatMode(int i) {
        if (this.f13596k != i) {
            this.f13596k = i;
            this.f13590e.m16918a(i);
            Iterator it = this.f13592g.iterator();
            while (it.hasNext()) {
                ((EventListener) it.next()).onRepeatModeChanged(i);
            }
        }
    }

    public int getRepeatMode() {
        return this.f13596k;
    }

    public void setShuffleModeEnabled(boolean z) {
        if (this.f13597l != z) {
            this.f13597l = z;
            this.f13590e.m16926b(z);
            Iterator it = this.f13592g.iterator();
            while (it.hasNext()) {
                ((EventListener) it.next()).onShuffleModeEnabledChanged(z);
            }
        }
    }

    public boolean getShuffleModeEnabled() {
        return this.f13597l;
    }

    public boolean isLoading() {
        return this.f13603r.f6103g;
    }

    public void seekToDefaultPosition() {
        seekToDefaultPosition(getCurrentWindowIndex());
    }

    public void seekToDefaultPosition(int i) {
        seekTo(i, -9223372036854775807L);
    }

    public void seekTo(long j) {
        seekTo(getCurrentWindowIndex(), j);
    }

    public void seekTo(int i, long j) {
        C2165q c2165q = this.f13603r.f6097a;
        if (i >= 0) {
            if (c2165q.m7802a() || i < c2165q.mo2318b()) {
                this.f13600o = true;
                this.f13598m++;
                if (isPlayingAd()) {
                    Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    this.f13589d.obtainMessage(0, 1, -1, this.f13603r).sendToTarget();
                    return;
                }
                this.f13604s = i;
                if (c2165q.m7802a()) {
                    this.f13606u = j == -9223372036854775807L ? 0 : j;
                    this.f13605t = 0;
                } else {
                    long b = j == -9223372036854775807L ? c2165q.m7799a(i, this.f13593h).m7788b() : C2005C.m7216b(j);
                    Pair a = c2165q.m7795a(this.f13593h, this.f13594i, i, b);
                    this.f13606u = C2005C.m7215a(b);
                    this.f13605t = ((Integer) a.first).intValue();
                }
                this.f13590e.m16921a(c2165q, i, C2005C.m7216b(j));
                i = this.f13592g.iterator();
                while (i.hasNext() != null) {
                    ((EventListener) i.next()).onPositionDiscontinuity(1);
                }
                return;
            }
        }
        throw new IllegalSeekPositionException(c2165q, i, j);
    }

    public void setPlaybackParameters(@Nullable C2153n c2153n) {
        if (c2153n == null) {
            c2153n = C2153n.f6151a;
        }
        this.f13590e.m16919a(c2153n);
    }

    public C2153n getPlaybackParameters() {
        return this.f13601p;
    }

    public void setSeekParameters(@Nullable C2162p c2162p) {
        if (c2162p == null) {
            c2162p = C2162p.f6200e;
        }
        this.f13590e.m16920a(c2162p);
    }

    @Nullable
    public Object getCurrentTag() {
        int currentWindowIndex = getCurrentWindowIndex();
        if (currentWindowIndex > this.f13603r.f6097a.mo2318b()) {
            return null;
        }
        return this.f13603r.f6097a.m7800a(currentWindowIndex, this.f13593h, true).f6209a;
    }

    public void stop() {
        stop(false);
    }

    public void stop(boolean z) {
        if (z) {
            this.f13602q = null;
        }
        C2126m a = m16857a(z, z, 1);
        this.f13598m++;
        this.f13590e.m16927c(z);
        m16859a(a, false, 4, 1, false);
    }

    public void release() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Release ");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" [");
        stringBuilder.append("ExoPlayerLib/2.8.1");
        stringBuilder.append("] [");
        stringBuilder.append(C2314v.f6960e);
        stringBuilder.append("] [");
        stringBuilder.append(C2121h.m7579a());
        stringBuilder.append("]");
        Log.i("ExoPlayerImpl", stringBuilder.toString());
        this.f13590e.m16917a();
        this.f13589d.removeCallbacksAndMessages(null);
    }

    public void sendMessages(C2006a... c2006aArr) {
        for (C2006a c2006a : c2006aArr) {
            createMessage(c2006a.f5451a).m7222a(c2006a.f5452b).m7223a(c2006a.f5453c).m7233i();
        }
    }

    public PlayerMessage createMessage(Target target) {
        return new PlayerMessage(this.f13590e, target, this.f13603r.f6097a, getCurrentWindowIndex(), this.f13591f);
    }

    public void blockingSendMessages(com.google.android.exoplayer2.ExoPlayer.C2006a... r8) {
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
        r7 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r8.length;
        r2 = 0;
        r3 = 0;
    L_0x0008:
        if (r3 >= r1) goto L_0x0028;
    L_0x000a:
        r4 = r8[r3];
        r5 = r4.f5451a;
        r5 = r7.createMessage(r5);
        r6 = r4.f5452b;
        r5 = r5.m7222a(r6);
        r4 = r4.f5453c;
        r4 = r5.m7223a(r4);
        r4 = r4.m7233i();
        r0.add(r4);
        r3 = r3 + 1;
        goto L_0x0008;
    L_0x0028:
        r8 = r0.iterator();
        r0 = 0;
    L_0x002d:
        r1 = r8.hasNext();
        if (r1 == 0) goto L_0x0047;
    L_0x0033:
        r1 = r8.next();
        r1 = (com.google.android.exoplayer2.PlayerMessage) r1;
        r3 = 1;
        r4 = r0;
        r0 = 1;
    L_0x003c:
        if (r0 == 0) goto L_0x0045;
    L_0x003e:
        r1.m7235k();	 Catch:{ InterruptedException -> 0x0043 }
        r0 = 0;
        goto L_0x003c;
    L_0x0043:
        r4 = 1;
        goto L_0x003c;
    L_0x0045:
        r0 = r4;
        goto L_0x002d;
    L_0x0047:
        if (r0 == 0) goto L_0x0050;
    L_0x0049:
        r8 = java.lang.Thread.currentThread();
        r8.interrupt();
    L_0x0050:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.f.blockingSendMessages(com.google.android.exoplayer2.ExoPlayer$a[]):void");
    }

    public int getCurrentPeriodIndex() {
        if (m16860a()) {
            return this.f13605t;
        }
        return this.f13603r.f6099c.f6223a;
    }

    public int getCurrentWindowIndex() {
        if (m16860a()) {
            return this.f13604s;
        }
        return this.f13603r.f6097a.m7797a(this.f13603r.f6099c.f6223a, this.f13594i).f6205c;
    }

    public int getNextWindowIndex() {
        C2165q c2165q = this.f13603r.f6097a;
        if (c2165q.m7802a()) {
            return -1;
        }
        return c2165q.mo2334a(getCurrentWindowIndex(), this.f13596k, this.f13597l);
    }

    public int getPreviousWindowIndex() {
        C2165q c2165q = this.f13603r.f6097a;
        if (c2165q.m7802a()) {
            return -1;
        }
        return c2165q.mo2336b(getCurrentWindowIndex(), this.f13596k, this.f13597l);
    }

    public long getDuration() {
        C2165q c2165q = this.f13603r.f6097a;
        if (c2165q.m7802a()) {
            return -9223372036854775807L;
        }
        if (!isPlayingAd()) {
            return c2165q.m7799a(getCurrentWindowIndex(), this.f13593h).m7789c();
        }
        C2166a c2166a = this.f13603r.f6099c;
        c2165q.m7797a(c2166a.f6223a, this.f13594i);
        return C2005C.m7215a(this.f13594i.m7781c(c2166a.f6224b, c2166a.f6225c));
    }

    public long getCurrentPosition() {
        if (m16860a()) {
            return this.f13606u;
        }
        return m16856a(this.f13603r.f6106j);
    }

    public long getBufferedPosition() {
        if (m16860a()) {
            return this.f13606u;
        }
        return m16856a(this.f13603r.f6107k);
    }

    public int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == -9223372036854775807L) {
            return 0;
        }
        if (duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return C2314v.m8456a((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    public boolean isCurrentWindowDynamic() {
        C2165q c2165q = this.f13603r.f6097a;
        return !c2165q.m7802a() && c2165q.m7799a(getCurrentWindowIndex(), this.f13593h).f6213e;
    }

    public boolean isCurrentWindowSeekable() {
        C2165q c2165q = this.f13603r.f6097a;
        return !c2165q.m7802a() && c2165q.m7799a(getCurrentWindowIndex(), this.f13593h).f6212d;
    }

    public boolean isPlayingAd() {
        return !m16860a() && this.f13603r.f6099c.m7821a();
    }

    public int getCurrentAdGroupIndex() {
        return isPlayingAd() ? this.f13603r.f6099c.f6224b : -1;
    }

    public int getCurrentAdIndexInAdGroup() {
        return isPlayingAd() ? this.f13603r.f6099c.f6225c : -1;
    }

    public long getContentPosition() {
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        this.f13603r.f6097a.m7797a(this.f13603r.f6099c.f6223a, this.f13594i);
        return this.f13594i.m7778b() + C2005C.m7215a(this.f13603r.f6101e);
    }

    public int getRendererCount() {
        return this.f13586a.length;
    }

    public int getRendererType(int i) {
        return this.f13586a[i].getTrackType();
    }

    public TrackGroupArray getCurrentTrackGroups() {
        return this.f13603r.f6104h;
    }

    public C2255e getCurrentTrackSelections() {
        return this.f13603r.f6105i.f6690c;
    }

    public C2165q getCurrentTimeline() {
        return this.f13603r.f6097a;
    }

    public Object getCurrentManifest() {
        return this.f13603r.f6098b;
    }

    /* renamed from: a */
    void m16861a(Message message) {
        Iterator it;
        switch (message.what) {
            case 0:
                m16858a((C2126m) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C2153n c2153n = (C2153n) message.obj;
                if (!this.f13601p.equals(c2153n)) {
                    this.f13601p = c2153n;
                    it = this.f13592g.iterator();
                    while (it.hasNext()) {
                        ((EventListener) it.next()).onPlaybackParametersChanged(c2153n);
                    }
                    return;
                }
                return;
            case 2:
                ExoPlaybackException exoPlaybackException = (ExoPlaybackException) message.obj;
                this.f13602q = exoPlaybackException;
                it = this.f13592g.iterator();
                while (it.hasNext()) {
                    ((EventListener) it.next()).onPlayerError(exoPlaybackException);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private void m16858a(C2126m c2126m, int i, boolean z, int i2) {
        this.f13598m -= i;
        if (this.f13598m == 0) {
            if (c2126m.f6100d == -9223372036854775807L) {
                c2126m = c2126m.m7636a(c2126m.f6099c, 0, c2126m.f6101e);
            }
            C2126m c2126m2 = c2126m;
            if ((this.f13603r.f6097a.m7802a() == null || this.f13599n != null) && c2126m2.f6097a.m7802a() != null) {
                this.f13605t = 0;
                this.f13604s = 0;
                this.f13606u = 0;
            }
            int i3 = this.f13599n != null ? 0 : 2;
            boolean z2 = this.f13600o;
            this.f13599n = false;
            this.f13600o = false;
            m16859a(c2126m2, z, i2, i3, z2);
        }
    }

    /* renamed from: a */
    private C2126m m16857a(boolean z, boolean z2, int i) {
        C4241f c4241f = this;
        if (z) {
            c4241f.f13604s = 0;
            c4241f.f13605t = 0;
            c4241f.f13606u = 0;
        } else {
            c4241f.f13604s = getCurrentWindowIndex();
            c4241f.f13605t = getCurrentPeriodIndex();
            c4241f.f13606u = getCurrentPosition();
        }
        return new C2126m(z2 ? C2165q.f6219a : c4241f.f13603r.f6097a, z2 ? null : c4241f.f13603r.f6098b, c4241f.f13603r.f6099c, c4241f.f13603r.f6100d, c4241f.f13603r.f6101e, i, false, z2 ? TrackGroupArray.EMPTY : c4241f.f13603r.f6104h, z2 ? c4241f.f13588c : c4241f.f13603r.f6105i);
    }

    /* renamed from: a */
    private void m16859a(C2126m c2126m, boolean z, int i, int i2, boolean z2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4 = 1;
        if (this.f13603r.f6097a == c2126m.f6097a) {
            if (this.f13603r.f6098b == c2126m.f6098b) {
                obj = null;
                obj2 = this.f13603r.f6102f == c2126m.f6102f ? 1 : null;
                obj3 = this.f13603r.f6103g == c2126m.f6103g ? 1 : null;
                if (this.f13603r.f6105i != c2126m.f6105i) {
                    obj4 = null;
                }
                this.f13603r = c2126m;
                if (obj != null || i2 == 0) {
                    c2126m = this.f13592g.iterator();
                    while (c2126m.hasNext()) {
                        ((EventListener) c2126m.next()).onTimelineChanged(this.f13603r.f6097a, this.f13603r.f6098b, i2);
                    }
                }
                if (z) {
                    c2126m = this.f13592g.iterator();
                    while (c2126m.hasNext()) {
                        ((EventListener) c2126m.next()).onPositionDiscontinuity(i);
                    }
                }
                if (obj4 != null) {
                    this.f13587b.mo2391a(this.f13603r.f6105i.f6691d);
                    c2126m = this.f13592g.iterator();
                    while (c2126m.hasNext()) {
                        ((EventListener) c2126m.next()).onTracksChanged(this.f13603r.f6104h, this.f13603r.f6105i.f6690c);
                    }
                }
                if (obj3 != null) {
                    c2126m = this.f13592g.iterator();
                    while (c2126m.hasNext()) {
                        ((EventListener) c2126m.next()).onLoadingChanged(this.f13603r.f6103g);
                    }
                }
                if (obj2 != null) {
                    c2126m = this.f13592g.iterator();
                    while (c2126m.hasNext()) {
                        ((EventListener) c2126m.next()).onPlayerStateChanged(this.f13595j, this.f13603r.f6102f);
                    }
                }
                if (z2) {
                    c2126m = this.f13592g.iterator();
                    while (c2126m.hasNext()) {
                        ((EventListener) c2126m.next()).onSeekProcessed();
                    }
                }
            }
        }
        obj = 1;
        if (this.f13603r.f6102f == c2126m.f6102f) {
        }
        if (this.f13603r.f6103g == c2126m.f6103g) {
        }
        if (this.f13603r.f6105i != c2126m.f6105i) {
            obj4 = null;
        }
        this.f13603r = c2126m;
        c2126m = this.f13592g.iterator();
        while (c2126m.hasNext()) {
            ((EventListener) c2126m.next()).onTimelineChanged(this.f13603r.f6097a, this.f13603r.f6098b, i2);
        }
        if (z) {
            c2126m = this.f13592g.iterator();
            while (c2126m.hasNext()) {
                ((EventListener) c2126m.next()).onPositionDiscontinuity(i);
            }
        }
        if (obj4 != null) {
            this.f13587b.mo2391a(this.f13603r.f6105i.f6691d);
            c2126m = this.f13592g.iterator();
            while (c2126m.hasNext()) {
                ((EventListener) c2126m.next()).onTracksChanged(this.f13603r.f6104h, this.f13603r.f6105i.f6690c);
            }
        }
        if (obj3 != null) {
            c2126m = this.f13592g.iterator();
            while (c2126m.hasNext()) {
                ((EventListener) c2126m.next()).onLoadingChanged(this.f13603r.f6103g);
            }
        }
        if (obj2 != null) {
            c2126m = this.f13592g.iterator();
            while (c2126m.hasNext()) {
                ((EventListener) c2126m.next()).onPlayerStateChanged(this.f13595j, this.f13603r.f6102f);
            }
        }
        if (z2) {
            c2126m = this.f13592g.iterator();
            while (c2126m.hasNext()) {
                ((EventListener) c2126m.next()).onSeekProcessed();
            }
        }
    }

    /* renamed from: a */
    private long m16856a(long j) {
        j = C2005C.m7215a(j);
        if (this.f13603r.f6099c.m7821a()) {
            return j;
        }
        this.f13603r.f6097a.m7797a(this.f13603r.f6099c.f6223a, this.f13594i);
        return j + this.f13594i.m7778b();
    }

    /* renamed from: a */
    private boolean m16860a() {
        if (!this.f13603r.f6097a.m7802a()) {
            if (this.f13598m <= 0) {
                return false;
            }
        }
        return true;
    }
}
