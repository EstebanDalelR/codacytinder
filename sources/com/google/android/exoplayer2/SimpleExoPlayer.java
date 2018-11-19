package com.google.android.exoplayer2;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.exoplayer2.ExoPlayer.C2006a;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.Player.TextComponent;
import com.google.android.exoplayer2.Player.VideoComponent;
import com.google.android.exoplayer2.PlayerMessage.Target;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.C3587a;
import com.google.android.exoplayer2.analytics.C3587a.C2010a;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.C2026a;
import com.google.android.exoplayer2.decoder.C2037c;
import com.google.android.exoplayer2.drm.C3604c;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.C2255e;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

@TargetApi(16)
public class SimpleExoPlayer implements ExoPlayer, TextComponent, VideoComponent {
    /* renamed from: a */
    protected final Renderer[] f13540a;
    /* renamed from: b */
    private final ExoPlayer f13541b;
    /* renamed from: c */
    private final Handler f13542c;
    /* renamed from: d */
    private final C3586a f13543d;
    /* renamed from: e */
    private final CopyOnWriteArraySet<com.google.android.exoplayer2.video.VideoListener> f13544e;
    /* renamed from: f */
    private final CopyOnWriteArraySet<TextOutput> f13545f;
    /* renamed from: g */
    private final CopyOnWriteArraySet<MetadataOutput> f13546g;
    /* renamed from: h */
    private final CopyOnWriteArraySet<VideoRendererEventListener> f13547h;
    /* renamed from: i */
    private final CopyOnWriteArraySet<AudioRendererEventListener> f13548i;
    /* renamed from: j */
    private final C3587a f13549j;
    /* renamed from: k */
    private Format f13550k;
    /* renamed from: l */
    private Format f13551l;
    /* renamed from: m */
    private Surface f13552m;
    /* renamed from: n */
    private boolean f13553n;
    /* renamed from: o */
    private int f13554o;
    /* renamed from: p */
    private SurfaceHolder f13555p;
    /* renamed from: q */
    private TextureView f13556q;
    /* renamed from: r */
    private C2037c f13557r;
    /* renamed from: s */
    private C2037c f13558s;
    /* renamed from: t */
    private int f13559t;
    /* renamed from: u */
    private C2026a f13560u;
    /* renamed from: v */
    private float f13561v;
    /* renamed from: w */
    private MediaSource f13562w;
    /* renamed from: x */
    private List<Cue> f13563x;

    @Deprecated
    public interface VideoListener extends com.google.android.exoplayer2.video.VideoListener {
    }

    /* renamed from: com.google.android.exoplayer2.SimpleExoPlayer$a */
    private final class C3586a implements Callback, SurfaceTextureListener, AudioRendererEventListener, MetadataOutput, TextOutput, VideoRendererEventListener {
        /* renamed from: a */
        final /* synthetic */ SimpleExoPlayer f10697a;

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        private C3586a(SimpleExoPlayer simpleExoPlayer) {
            this.f10697a = simpleExoPlayer;
        }

        public void onVideoEnabled(C2037c c2037c) {
            this.f10697a.f13557r = c2037c;
            Iterator it = this.f10697a.f13547h.iterator();
            while (it.hasNext()) {
                ((VideoRendererEventListener) it.next()).onVideoEnabled(c2037c);
            }
        }

        public void onVideoDecoderInitialized(String str, long j, long j2) {
            Iterator it = this.f10697a.f13547h.iterator();
            while (it.hasNext()) {
                ((VideoRendererEventListener) it.next()).onVideoDecoderInitialized(str, j, j2);
            }
        }

        public void onVideoInputFormatChanged(Format format) {
            this.f10697a.f13550k = format;
            Iterator it = this.f10697a.f13547h.iterator();
            while (it.hasNext()) {
                ((VideoRendererEventListener) it.next()).onVideoInputFormatChanged(format);
            }
        }

        public void onDroppedFrames(int i, long j) {
            Iterator it = this.f10697a.f13547h.iterator();
            while (it.hasNext()) {
                ((VideoRendererEventListener) it.next()).onDroppedFrames(i, j);
            }
        }

        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            Iterator it = this.f10697a.f13544e.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.video.VideoListener) it.next()).onVideoSizeChanged(i, i2, i3, f);
            }
            it = this.f10697a.f13547h.iterator();
            while (it.hasNext()) {
                ((VideoRendererEventListener) it.next()).onVideoSizeChanged(i, i2, i3, f);
            }
        }

        public void onRenderedFirstFrame(Surface surface) {
            Iterator it;
            if (this.f10697a.f13552m == surface) {
                it = this.f10697a.f13544e.iterator();
                while (it.hasNext()) {
                    ((com.google.android.exoplayer2.video.VideoListener) it.next()).onRenderedFirstFrame();
                }
            }
            it = this.f10697a.f13547h.iterator();
            while (it.hasNext()) {
                ((VideoRendererEventListener) it.next()).onRenderedFirstFrame(surface);
            }
        }

        public void onVideoDisabled(C2037c c2037c) {
            Iterator it = this.f10697a.f13547h.iterator();
            while (it.hasNext()) {
                ((VideoRendererEventListener) it.next()).onVideoDisabled(c2037c);
            }
            this.f10697a.f13550k = null;
            this.f10697a.f13557r = null;
        }

        public void onAudioEnabled(C2037c c2037c) {
            this.f10697a.f13558s = c2037c;
            Iterator it = this.f10697a.f13548i.iterator();
            while (it.hasNext()) {
                ((AudioRendererEventListener) it.next()).onAudioEnabled(c2037c);
            }
        }

        public void onAudioSessionId(int i) {
            this.f10697a.f13559t = i;
            Iterator it = this.f10697a.f13548i.iterator();
            while (it.hasNext()) {
                ((AudioRendererEventListener) it.next()).onAudioSessionId(i);
            }
        }

        public void onAudioDecoderInitialized(String str, long j, long j2) {
            Iterator it = this.f10697a.f13548i.iterator();
            while (it.hasNext()) {
                ((AudioRendererEventListener) it.next()).onAudioDecoderInitialized(str, j, j2);
            }
        }

        public void onAudioInputFormatChanged(Format format) {
            this.f10697a.f13551l = format;
            Iterator it = this.f10697a.f13548i.iterator();
            while (it.hasNext()) {
                ((AudioRendererEventListener) it.next()).onAudioInputFormatChanged(format);
            }
        }

        public void onAudioSinkUnderrun(int i, long j, long j2) {
            Iterator it = this.f10697a.f13548i.iterator();
            while (it.hasNext()) {
                ((AudioRendererEventListener) it.next()).onAudioSinkUnderrun(i, j, j2);
            }
        }

        public void onAudioDisabled(C2037c c2037c) {
            Iterator it = this.f10697a.f13548i.iterator();
            while (it.hasNext()) {
                ((AudioRendererEventListener) it.next()).onAudioDisabled(c2037c);
            }
            this.f10697a.f13551l = null;
            this.f10697a.f13558s = null;
            this.f10697a.f13559t = 0;
        }

        public void onCues(List<Cue> list) {
            this.f10697a.f13563x = list;
            Iterator it = this.f10697a.f13545f.iterator();
            while (it.hasNext()) {
                ((TextOutput) it.next()).onCues(list);
            }
        }

        public void onMetadata(Metadata metadata) {
            Iterator it = this.f10697a.f13546g.iterator();
            while (it.hasNext()) {
                ((MetadataOutput) it.next()).onMetadata(metadata);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f10697a.m16818a((Surface) surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f10697a.m16818a(null, false);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            this.f10697a.m16818a((Surface) new Surface(surfaceTexture), true);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f10697a.m16818a(null, true);
            return true;
        }
    }

    public TextComponent getTextComponent() {
        return this;
    }

    public VideoComponent getVideoComponent() {
        return this;
    }

    protected SimpleExoPlayer(RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl, @Nullable DrmSessionManager<C3604c> drmSessionManager) {
        this(renderersFactory, trackSelector, loadControl, drmSessionManager, new C2010a());
    }

    protected SimpleExoPlayer(RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl, @Nullable DrmSessionManager<C3604c> drmSessionManager, C2010a c2010a) {
        this(renderersFactory, trackSelector, loadControl, drmSessionManager, c2010a, Clock.f6878a);
    }

    protected SimpleExoPlayer(RenderersFactory renderersFactory, TrackSelector trackSelector, LoadControl loadControl, @Nullable DrmSessionManager<C3604c> drmSessionManager, C2010a c2010a, Clock clock) {
        this.f13543d = new C3586a();
        this.f13544e = new CopyOnWriteArraySet();
        this.f13545f = new CopyOnWriteArraySet();
        this.f13546g = new CopyOnWriteArraySet();
        this.f13547h = new CopyOnWriteArraySet();
        this.f13548i = new CopyOnWriteArraySet();
        this.f13542c = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f13540a = renderersFactory.createRenderers(this.f13542c, this.f13543d, this.f13543d, this.f13543d, this.f13543d, drmSessionManager);
        this.f13561v = 1.0f;
        this.f13559t = null;
        this.f13560u = C2026a.f5553a;
        this.f13554o = 1;
        this.f13563x = Collections.emptyList();
        this.f13541b = m16829a(this.f13540a, trackSelector, loadControl, clock);
        this.f13549j = c2010a.m7236a(this.f13541b, clock);
        addListener(this.f13549j);
        this.f13547h.add(this.f13549j);
        this.f13548i.add(this.f13549j);
        m16833a(this.f13549j);
        if ((drmSessionManager instanceof DefaultDrmSessionManager) != null) {
            ((DefaultDrmSessionManager) drmSessionManager).m13565a(this.f13542c, this.f13549j);
        }
    }

    public void setVideoScalingMode(int i) {
        this.f13554o = i;
        for (Target target : this.f13540a) {
            if (target.getTrackType() == 2) {
                this.f13541b.createMessage(target).m7222a(4).m7223a(Integer.valueOf(i)).m7233i();
            }
        }
    }

    public int getVideoScalingMode() {
        return this.f13554o;
    }

    public void clearVideoSurface() {
        setVideoSurface(null);
    }

    public void setVideoSurface(Surface surface) {
        m16825d();
        m16818a(surface, false);
    }

    public void clearVideoSurface(Surface surface) {
        if (surface != null && surface == this.f13552m) {
            setVideoSurface(null);
        }
    }

    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        m16825d();
        this.f13555p = surfaceHolder;
        if (surfaceHolder == null) {
            m16818a(null, false);
            return;
        }
        surfaceHolder.addCallback(this.f13543d);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            surface = null;
        }
        m16818a(surface, false);
    }

    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null && surfaceHolder == this.f13555p) {
            setVideoSurfaceHolder(null);
        }
    }

    public void setVideoSurfaceView(SurfaceView surfaceView) {
        setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    public void setVideoTextureView(TextureView textureView) {
        m16825d();
        this.f13556q = textureView;
        Surface surface = null;
        if (textureView == null) {
            m16818a(null, true);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f13543d);
        textureView = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (textureView != null) {
            surface = new Surface(textureView);
        }
        m16818a(surface, true);
    }

    public void clearVideoTextureView(TextureView textureView) {
        if (textureView != null && textureView == this.f13556q) {
            setVideoTextureView(null);
        }
    }

    /* renamed from: a */
    public void m16832a(AnalyticsListener analyticsListener) {
        this.f13549j.m13461a(analyticsListener);
    }

    /* renamed from: b */
    public void m16835b(AnalyticsListener analyticsListener) {
        this.f13549j.m13463b(analyticsListener);
    }

    /* renamed from: a */
    public void m16830a(float f) {
        this.f13561v = f;
        for (Target target : this.f13540a) {
            if (target.getTrackType() == 1) {
                this.f13541b.createMessage(target).m7222a(2).m7223a(Float.valueOf(f)).m7233i();
            }
        }
    }

    /* renamed from: a */
    public float m16828a() {
        return this.f13561v;
    }

    /* renamed from: b */
    public Format m16834b() {
        return this.f13551l;
    }

    /* renamed from: c */
    public int m16836c() {
        return this.f13559t;
    }

    public void addVideoListener(com.google.android.exoplayer2.video.VideoListener videoListener) {
        this.f13544e.add(videoListener);
    }

    public void removeVideoListener(com.google.android.exoplayer2.video.VideoListener videoListener) {
        this.f13544e.remove(videoListener);
    }

    @Deprecated
    /* renamed from: a */
    public void m16831a(VideoListener videoListener) {
        this.f13544e.clear();
        if (videoListener != null) {
            addVideoListener(videoListener);
        }
    }

    public void addTextOutput(TextOutput textOutput) {
        if (!this.f13563x.isEmpty()) {
            textOutput.onCues(this.f13563x);
        }
        this.f13545f.add(textOutput);
    }

    public void removeTextOutput(TextOutput textOutput) {
        this.f13545f.remove(textOutput);
    }

    /* renamed from: a */
    public void m16833a(MetadataOutput metadataOutput) {
        this.f13546g.add(metadataOutput);
    }

    public Looper getPlaybackLooper() {
        return this.f13541b.getPlaybackLooper();
    }

    public void addListener(EventListener eventListener) {
        this.f13541b.addListener(eventListener);
    }

    public void removeListener(EventListener eventListener) {
        this.f13541b.removeListener(eventListener);
    }

    public int getPlaybackState() {
        return this.f13541b.getPlaybackState();
    }

    public ExoPlaybackException getPlaybackError() {
        return this.f13541b.getPlaybackError();
    }

    public void prepare(MediaSource mediaSource) {
        prepare(mediaSource, true, true);
    }

    public void prepare(MediaSource mediaSource, boolean z, boolean z2) {
        if (this.f13562w != mediaSource) {
            if (this.f13562w != null) {
                this.f13562w.removeEventListener(this.f13549j);
                this.f13549j.m13462b();
            }
            mediaSource.addEventListener(this.f13542c, this.f13549j);
            this.f13562w = mediaSource;
        }
        this.f13541b.prepare(mediaSource, z, z2);
    }

    public void setPlayWhenReady(boolean z) {
        this.f13541b.setPlayWhenReady(z);
    }

    public boolean getPlayWhenReady() {
        return this.f13541b.getPlayWhenReady();
    }

    public int getRepeatMode() {
        return this.f13541b.getRepeatMode();
    }

    public void setRepeatMode(int i) {
        this.f13541b.setRepeatMode(i);
    }

    public void setShuffleModeEnabled(boolean z) {
        this.f13541b.setShuffleModeEnabled(z);
    }

    public boolean getShuffleModeEnabled() {
        return this.f13541b.getShuffleModeEnabled();
    }

    public boolean isLoading() {
        return this.f13541b.isLoading();
    }

    public void seekToDefaultPosition() {
        this.f13549j.m13460a();
        this.f13541b.seekToDefaultPosition();
    }

    public void seekToDefaultPosition(int i) {
        this.f13549j.m13460a();
        this.f13541b.seekToDefaultPosition(i);
    }

    public void seekTo(long j) {
        this.f13549j.m13460a();
        this.f13541b.seekTo(j);
    }

    public void seekTo(int i, long j) {
        this.f13549j.m13460a();
        this.f13541b.seekTo(i, j);
    }

    public void setPlaybackParameters(@Nullable C2153n c2153n) {
        this.f13541b.setPlaybackParameters(c2153n);
    }

    public C2153n getPlaybackParameters() {
        return this.f13541b.getPlaybackParameters();
    }

    public void setSeekParameters(@Nullable C2162p c2162p) {
        this.f13541b.setSeekParameters(c2162p);
    }

    @Nullable
    public Object getCurrentTag() {
        return this.f13541b.getCurrentTag();
    }

    public void stop() {
        stop(false);
    }

    public void stop(boolean z) {
        this.f13541b.stop(z);
        if (this.f13562w) {
            this.f13562w.removeEventListener(this.f13549j);
            this.f13562w = false;
            this.f13549j.m13462b();
        }
        this.f13563x = Collections.emptyList();
    }

    public void release() {
        this.f13541b.release();
        m16825d();
        if (this.f13552m != null) {
            if (this.f13553n) {
                this.f13552m.release();
            }
            this.f13552m = null;
        }
        if (this.f13562w != null) {
            this.f13562w.removeEventListener(this.f13549j);
        }
        this.f13563x = Collections.emptyList();
    }

    public void sendMessages(C2006a... c2006aArr) {
        this.f13541b.sendMessages(c2006aArr);
    }

    public PlayerMessage createMessage(Target target) {
        return this.f13541b.createMessage(target);
    }

    public void blockingSendMessages(C2006a... c2006aArr) {
        this.f13541b.blockingSendMessages(c2006aArr);
    }

    public int getRendererCount() {
        return this.f13541b.getRendererCount();
    }

    public int getRendererType(int i) {
        return this.f13541b.getRendererType(i);
    }

    public TrackGroupArray getCurrentTrackGroups() {
        return this.f13541b.getCurrentTrackGroups();
    }

    public C2255e getCurrentTrackSelections() {
        return this.f13541b.getCurrentTrackSelections();
    }

    public C2165q getCurrentTimeline() {
        return this.f13541b.getCurrentTimeline();
    }

    public Object getCurrentManifest() {
        return this.f13541b.getCurrentManifest();
    }

    public int getCurrentPeriodIndex() {
        return this.f13541b.getCurrentPeriodIndex();
    }

    public int getCurrentWindowIndex() {
        return this.f13541b.getCurrentWindowIndex();
    }

    public int getNextWindowIndex() {
        return this.f13541b.getNextWindowIndex();
    }

    public int getPreviousWindowIndex() {
        return this.f13541b.getPreviousWindowIndex();
    }

    public long getDuration() {
        return this.f13541b.getDuration();
    }

    public long getCurrentPosition() {
        return this.f13541b.getCurrentPosition();
    }

    public long getBufferedPosition() {
        return this.f13541b.getBufferedPosition();
    }

    public int getBufferedPercentage() {
        return this.f13541b.getBufferedPercentage();
    }

    public boolean isCurrentWindowDynamic() {
        return this.f13541b.isCurrentWindowDynamic();
    }

    public boolean isCurrentWindowSeekable() {
        return this.f13541b.isCurrentWindowSeekable();
    }

    public boolean isPlayingAd() {
        return this.f13541b.isPlayingAd();
    }

    public int getCurrentAdGroupIndex() {
        return this.f13541b.getCurrentAdGroupIndex();
    }

    public int getCurrentAdIndexInAdGroup() {
        return this.f13541b.getCurrentAdIndexInAdGroup();
    }

    public long getContentPosition() {
        return this.f13541b.getContentPosition();
    }

    /* renamed from: a */
    protected ExoPlayer m16829a(Renderer[] rendererArr, TrackSelector trackSelector, LoadControl loadControl, Clock clock) {
        return new C4241f(rendererArr, trackSelector, loadControl, clock);
    }

    /* renamed from: d */
    private void m16825d() {
        if (this.f13556q != null) {
            if (this.f13556q.getSurfaceTextureListener() != this.f13543d) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f13556q.setSurfaceTextureListener(null);
            }
            this.f13556q = null;
        }
        if (this.f13555p != null) {
            this.f13555p.removeCallback(this.f13543d);
            this.f13555p = null;
        }
    }

    /* renamed from: a */
    private void m16818a(android.view.Surface r8, boolean r9) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r7 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r7.f13540a;
        r2 = r1.length;
        r3 = 0;
    L_0x0009:
        if (r3 >= r2) goto L_0x002d;
    L_0x000b:
        r4 = r1[r3];
        r5 = r4.getTrackType();
        r6 = 2;
        if (r5 != r6) goto L_0x002a;
    L_0x0014:
        r5 = r7.f13541b;
        r4 = r5.createMessage(r4);
        r5 = 1;
        r4 = r4.m7222a(r5);
        r4 = r4.m7223a(r8);
        r4 = r4.m7233i();
        r0.add(r4);
    L_0x002a:
        r3 = r3 + 1;
        goto L_0x0009;
    L_0x002d:
        r1 = r7.f13552m;
        if (r1 == 0) goto L_0x0059;
    L_0x0031:
        r1 = r7.f13552m;
        if (r1 == r8) goto L_0x0059;
    L_0x0035:
        r0 = r0.iterator();	 Catch:{ InterruptedException -> 0x0049 }
    L_0x0039:
        r1 = r0.hasNext();	 Catch:{ InterruptedException -> 0x0049 }
        if (r1 == 0) goto L_0x0050;	 Catch:{ InterruptedException -> 0x0049 }
    L_0x003f:
        r1 = r0.next();	 Catch:{ InterruptedException -> 0x0049 }
        r1 = (com.google.android.exoplayer2.PlayerMessage) r1;	 Catch:{ InterruptedException -> 0x0049 }
        r1.m7235k();	 Catch:{ InterruptedException -> 0x0049 }
        goto L_0x0039;
    L_0x0049:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0050:
        r0 = r7.f13553n;
        if (r0 == 0) goto L_0x0059;
    L_0x0054:
        r0 = r7.f13552m;
        r0.release();
    L_0x0059:
        r7.f13552m = r8;
        r7.f13553n = r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.SimpleExoPlayer.a(android.view.Surface, boolean):void");
    }
}
