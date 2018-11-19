package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.drm.C3604c;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public class DefaultRenderersFactory implements RenderersFactory {
    /* renamed from: a */
    private final Context f10693a;
    @Nullable
    /* renamed from: b */
    private final DrmSessionManager<C3604c> f10694b;
    /* renamed from: c */
    private final int f10695c;
    /* renamed from: d */
    private final long f10696d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    /* renamed from: a */
    protected void m13447a(Context context, Handler handler, int i, ArrayList<Renderer> arrayList) {
    }

    public DefaultRenderersFactory(Context context) {
        this(context, 0);
    }

    public DefaultRenderersFactory(Context context, int i) {
        this(context, null, i, 5000);
    }

    @Deprecated
    public DefaultRenderersFactory(Context context, @Nullable DrmSessionManager<C3604c> drmSessionManager, int i, long j) {
        this.f10693a = context;
        this.f10695c = i;
        this.f10696d = j;
        this.f10694b = drmSessionManager;
    }

    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput, @Nullable DrmSessionManager<C3604c> drmSessionManager) {
        DrmSessionManager drmSessionManager2 = drmSessionManager == null ? this.f10694b : drmSessionManager;
        ArrayList arrayList = new ArrayList();
        DrmSessionManager drmSessionManager3 = drmSessionManager2;
        m13448a(r9.f10693a, drmSessionManager3, r9.f10696d, handler, videoRendererEventListener, r9.f10695c, arrayList);
        m13449a(r9.f10693a, drmSessionManager3, m13452a(), handler, audioRendererEventListener, r9.f10695c, arrayList);
        ArrayList arrayList2 = arrayList;
        m13451a(r9.f10693a, textOutput, handler.getLooper(), r9.f10695c, arrayList2);
        m13450a(r9.f10693a, metadataOutput, handler.getLooper(), r9.f10695c, arrayList2);
        m13447a(r9.f10693a, handler, r9.f10695c, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[arrayList.size()]);
    }

    /* renamed from: a */
    protected void m13448a(android.content.Context r15, @android.support.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionManager<com.google.android.exoplayer2.drm.C3604c> r16, long r17, android.os.Handler r19, com.google.android.exoplayer2.video.VideoRendererEventListener r20, int r21, java.util.ArrayList<com.google.android.exoplayer2.Renderer> r22) {
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
        r14 = this;
        r1 = r21;
        r2 = r22;
        r13 = new com.google.android.exoplayer2.video.c;
        r5 = com.google.android.exoplayer2.mediacodec.MediaCodecSelector.f6112a;
        r9 = 0;
        r12 = 50;
        r3 = r13;
        r4 = r15;
        r6 = r17;
        r8 = r16;
        r10 = r19;
        r11 = r20;
        r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12);
        r2.add(r13);
        if (r1 != 0) goto L_0x001e;
    L_0x001d:
        return;
    L_0x001e:
        r3 = r22.size();
        r4 = 2;
        if (r1 != r4) goto L_0x0027;
    L_0x0025:
        r3 = r3 + -1;
    L_0x0027:
        r1 = "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer";	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r5 = 5;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r6 = new java.lang.Class[r5];	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r7 = java.lang.Boolean.TYPE;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r8 = 0;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r6[r8] = r7;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r7 = java.lang.Long.TYPE;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r9 = 1;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r6[r9] = r7;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r7 = android.os.Handler.class;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r6[r4] = r7;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r7 = com.google.android.exoplayer2.video.VideoRendererEventListener.class;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r10 = 3;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r6[r10] = r7;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r7 = java.lang.Integer.TYPE;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r11 = 4;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r6[r11] = r7;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r1 = r1.getConstructor(r6);	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r5 = new java.lang.Object[r5];	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r6 = java.lang.Boolean.valueOf(r9);	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r5[r8] = r6;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r6 = java.lang.Long.valueOf(r17);	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r5[r9] = r6;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r5[r4] = r19;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r5[r10] = r20;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r4 = 50;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r5[r11] = r4;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r1 = r1.newInstance(r5);	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r1 = (com.google.android.exoplayer2.Renderer) r1;	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r2.add(r3, r1);	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r1 = "DefaultRenderersFactory";	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        r2 = "Loaded LibvpxVideoRenderer.";	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        android.util.Log.i(r1, r2);	 Catch:{ ClassNotFoundException -> 0x0081, Exception -> 0x0077 }
        goto L_0x0081;
    L_0x0077:
        r0 = move-exception;
        r1 = r0;
        r2 = new java.lang.RuntimeException;
        r3 = "Error instantiating VP9 extension";
        r2.<init>(r3, r1);
        throw r2;
    L_0x0081:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.DefaultRenderersFactory.a(android.content.Context, com.google.android.exoplayer2.drm.DrmSessionManager, long, android.os.Handler, com.google.android.exoplayer2.video.VideoRendererEventListener, int, java.util.ArrayList):void");
    }

    /* renamed from: a */
    protected void m13449a(android.content.Context r14, @android.support.annotation.Nullable com.google.android.exoplayer2.drm.DrmSessionManager<com.google.android.exoplayer2.drm.C3604c> r15, com.google.android.exoplayer2.audio.AudioProcessor[] r16, android.os.Handler r17, com.google.android.exoplayer2.audio.AudioRendererEventListener r18, int r19, java.util.ArrayList<com.google.android.exoplayer2.Renderer> r20) {
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
        r13 = this;
        r10 = r19;
        r11 = r20;
        r12 = new com.google.android.exoplayer2.audio.g;
        r3 = com.google.android.exoplayer2.mediacodec.MediaCodecSelector.f6112a;
        r8 = com.google.android.exoplayer2.audio.C2027b.m7295a(r14);
        r5 = 0;
        r1 = r12;
        r2 = r14;
        r4 = r15;
        r6 = r17;
        r7 = r18;
        r9 = r16;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r11.add(r12);
        if (r10 != 0) goto L_0x001f;
    L_0x001e:
        return;
    L_0x001f:
        r1 = r20.size();
        r2 = 2;
        if (r10 != r2) goto L_0x0028;
    L_0x0026:
        r1 = r1 + -1;
    L_0x0028:
        r3 = 0;
        r4 = 3;
        r5 = 1;
        r6 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer";	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r6 = java.lang.Class.forName(r6);	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r7 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r8 = android.os.Handler.class;	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r7[r3] = r8;	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r8 = com.google.android.exoplayer2.audio.AudioRendererEventListener.class;	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r7[r5] = r8;	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r8 = com.google.android.exoplayer2.audio.AudioProcessor[].class;	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r7[r2] = r8;	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r6 = r6.getConstructor(r7);	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r7 = new java.lang.Object[r4];	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r7[r3] = r17;	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r7[r5] = r18;	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r7[r2] = r16;	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r6 = r6.newInstance(r7);	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r6 = (com.google.android.exoplayer2.Renderer) r6;	 Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x005e }
        r7 = r1 + 1;
        r11.add(r1, r6);	 Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x005e }
        r1 = "DefaultRenderersFactory";	 Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x005e }
        r6 = "Loaded LibopusAudioRenderer.";	 Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x005e }
        android.util.Log.i(r1, r6);	 Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x005e }
        goto L_0x0069;
    L_0x005e:
        r0 = move-exception;
        r1 = r0;
        r2 = new java.lang.RuntimeException;
        r3 = "Error instantiating Opus extension";
        r2.<init>(r3, r1);
        throw r2;
    L_0x0068:
        r7 = r1;
    L_0x0069:
        r1 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer";	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r6 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r8 = android.os.Handler.class;	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r6[r3] = r8;	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r8 = com.google.android.exoplayer2.audio.AudioRendererEventListener.class;	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r6[r5] = r8;	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r8 = com.google.android.exoplayer2.audio.AudioProcessor[].class;	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r6[r2] = r8;	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r1 = r1.getConstructor(r6);	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r6 = new java.lang.Object[r4];	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r6[r3] = r17;	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r6[r5] = r18;	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r6[r2] = r16;	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r1 = r1.newInstance(r6);	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r1 = (com.google.android.exoplayer2.Renderer) r1;	 Catch:{ ClassNotFoundException -> 0x00a6, Exception -> 0x009c }
        r6 = r7 + 1;
        r11.add(r7, r1);	 Catch:{ ClassNotFoundException -> 0x00a7, Exception -> 0x009c }
        r1 = "DefaultRenderersFactory";	 Catch:{ ClassNotFoundException -> 0x00a7, Exception -> 0x009c }
        r7 = "Loaded LibflacAudioRenderer.";	 Catch:{ ClassNotFoundException -> 0x00a7, Exception -> 0x009c }
        android.util.Log.i(r1, r7);	 Catch:{ ClassNotFoundException -> 0x00a7, Exception -> 0x009c }
        goto L_0x00a7;
    L_0x009c:
        r0 = move-exception;
        r1 = r0;
        r2 = new java.lang.RuntimeException;
        r3 = "Error instantiating FLAC extension";
        r2.<init>(r3, r1);
        throw r2;
    L_0x00a6:
        r6 = r7;
    L_0x00a7:
        r1 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer";	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r7 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r8 = android.os.Handler.class;	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r7[r3] = r8;	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r8 = com.google.android.exoplayer2.audio.AudioRendererEventListener.class;	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r7[r5] = r8;	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r8 = com.google.android.exoplayer2.audio.AudioProcessor[].class;	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r7[r2] = r8;	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r1 = r1.getConstructor(r7);	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r4 = new java.lang.Object[r4];	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r4[r3] = r17;	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r4[r5] = r18;	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r4[r2] = r16;	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r1 = r1.newInstance(r4);	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r1 = (com.google.android.exoplayer2.Renderer) r1;	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r11.add(r6, r1);	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r1 = "DefaultRenderersFactory";	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        r2 = "Loaded FfmpegAudioRenderer.";	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        android.util.Log.i(r1, r2);	 Catch:{ ClassNotFoundException -> 0x00e2, Exception -> 0x00d8 }
        goto L_0x00e2;
    L_0x00d8:
        r0 = move-exception;
        r1 = r0;
        r2 = new java.lang.RuntimeException;
        r3 = "Error instantiating FFmpeg extension";
        r2.<init>(r3, r1);
        throw r2;
    L_0x00e2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.DefaultRenderersFactory.a(android.content.Context, com.google.android.exoplayer2.drm.DrmSessionManager, com.google.android.exoplayer2.audio.AudioProcessor[], android.os.Handler, com.google.android.exoplayer2.audio.AudioRendererEventListener, int, java.util.ArrayList):void");
    }

    /* renamed from: a */
    protected void m13451a(Context context, TextOutput textOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    /* renamed from: a */
    protected void m13450a(Context context, MetadataOutput metadataOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
    }

    /* renamed from: a */
    protected AudioProcessor[] m13452a() {
        return new AudioProcessor[0];
    }
}
