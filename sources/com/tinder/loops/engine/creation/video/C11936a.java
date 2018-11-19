package com.tinder.loops.engine.creation.video;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.view.Surface;
import com.tinder.exception.LoopsEngineCreationException;
import com.tinder.loops.engine.common.p272a.C9769a;
import com.tinder.loops.engine.common.p273b.C9770a;
import com.tinder.loops.engine.creation.p274a.C9775a;
import com.tinder.loops.engine.creation.p276c.C9777a;
import com.tinder.loops.engine.creation.p276c.C9778c;
import com.tinder.loops.engine.creation.p277d.C9781a;
import com.tinder.loops.engine.creation.p277d.C9784d;
import com.tinder.loops.engine.creation.p278e.C9785a;
import com.tinder.loops.engine.extraction.p279a.C9790a;
import com.tinder.p260i.C9706a;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0012H\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u001aH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/tinder/loops/engine/creation/video/VideoCreatorEngine;", "Lcom/tinder/loops/engine/creation/video/VideoCreator;", "mediaMuxerFactory", "Lcom/tinder/loops/engine/creation/factory/MediaMuxerFactory;", "mediaFormatFactory", "Lcom/tinder/loops/engine/creation/factory/MediaFormatFactory;", "mediaCodecFactory", "Lcom/tinder/loops/engine/extraction/codec/MediaCodecFactory;", "codecInputSurface", "Lcom/tinder/loops/engine/creation/opengl/CodecInputSurface;", "(Lcom/tinder/loops/engine/creation/factory/MediaMuxerFactory;Lcom/tinder/loops/engine/creation/factory/MediaFormatFactory;Lcom/tinder/loops/engine/extraction/codec/MediaCodecFactory;Lcom/tinder/loops/engine/creation/opengl/CodecInputSurface;)V", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "muxer", "Landroid/media/MediaMuxer;", "muxerStarted", "", "trackIndex", "", "videoEncoder", "Landroid/media/MediaCodec;", "convertFramesIntoVideo", "Lio/reactivex/Completable;", "videoCreationRequest", "Lcom/tinder/loops/engine/creation/model/VideoCreationRequest;", "createVideo", "", "drainEncoder", "isEndOfStream", "handleMuxingEncodedData", "encoderStatus", "handleOutputFormatChanged", "prepare", "prepareEncoder", "prepareInputSurface", "croppingRectangle", "Lcom/tinder/loops/engine/creation/model/CroppingRectangle;", "prepareMuxer", "outputFilePath", "", "release", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.creation.video.a */
public final class C11936a implements VideoCreator {
    /* renamed from: a */
    private final BufferInfo f38842a = new BufferInfo();
    /* renamed from: b */
    private boolean f38843b;
    /* renamed from: c */
    private int f38844c;
    /* renamed from: d */
    private MediaCodec f38845d;
    /* renamed from: e */
    private MediaMuxer f38846e;
    /* renamed from: f */
    private final C9778c f38847f;
    /* renamed from: g */
    private final C9777a f38848g;
    /* renamed from: h */
    private final C9790a f38849h;
    /* renamed from: i */
    private final C9785a f38850i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.engine.creation.video.a$a */
    static final class C9789a<V> implements Callable<Object> {
        /* renamed from: a */
        final /* synthetic */ C11936a f32450a;
        /* renamed from: b */
        final /* synthetic */ C9784d f32451b;

        C9789a(C11936a c11936a, C9784d c9784d) {
            this.f32450a = c11936a;
            this.f32451b = c9784d;
        }

        public /* synthetic */ Object call() {
            m40373a();
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m40373a() {
            this.f32450a.m47945a(this.f32451b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.engine.creation.video.a$b */
    static final class C11935b implements Action {
        /* renamed from: a */
        final /* synthetic */ C11936a f38841a;

        C11935b(C11936a c11936a) {
            this.f38841a = c11936a;
        }

        public final void run() {
            this.f38841a.m47943a();
        }
    }

    @Inject
    public C11936a(@NotNull C9778c c9778c, @NotNull C9777a c9777a, @NotNull C9790a c9790a, @NotNull C9785a c9785a) {
        C2668g.b(c9778c, "mediaMuxerFactory");
        C2668g.b(c9777a, "mediaFormatFactory");
        C2668g.b(c9790a, "mediaCodecFactory");
        C2668g.b(c9785a, "codecInputSurface");
        this.f38847f = c9778c;
        this.f38848g = c9777a;
        this.f38849h = c9790a;
        this.f38850i = c9785a;
    }

    @NotNull
    public C3956a convertFramesIntoVideo(@NotNull C9784d c9784d) {
        C2668g.b(c9784d, "videoCreationRequest");
        c9784d = C3956a.a(new C9789a(this, c9784d)).e(new C11935b(this));
        C2668g.a(c9784d, "Completable.fromCallable…      release()\n        }");
        return c9784d;
    }

    /* renamed from: a */
    private final void m47945a(C9784d c9784d) {
        C9706a.m40168a(c9784d.m40350a().m40343c() > 0, (Exception) new LoopsEngineCreationException("Error encoding parameter frames per second must be greater than zero!"));
        m47952b(c9784d);
        int i = 0;
        for (C9770a c9770a : c9784d.m40351b()) {
            int i2 = i + 1;
            m47949a(false);
            this.f38850i.m40356a(c9770a.m40314a(), C9775a.m40329a(i, c9784d.m40350a().m40343c()));
            i = i2;
        }
        m47949a(true);
    }

    /* renamed from: a */
    private final void m47943a() {
        try {
            if (this.f38845d != null) {
                MediaCodec mediaCodec = this.f38845d;
                if (mediaCodec == null) {
                    C2668g.b("videoEncoder");
                }
                mediaCodec.stop();
                mediaCodec.release();
            }
            this.f38850i.m40355a();
            if (this.f38846e != null) {
                MediaMuxer mediaMuxer = this.f38846e;
                if (mediaMuxer == null) {
                    C2668g.b("muxer");
                }
                mediaMuxer.stop();
                mediaMuxer.release();
            }
        } catch (IllegalStateException e) {
            C0001a.c(e, "error releasing video creator resources", new Object[0]);
        }
    }

    /* renamed from: b */
    private final void m47952b(C9784d c9784d) {
        m47953c(c9784d);
        m47944a(c9784d.m40352c());
        m47948a(c9784d.m40350a().m40345e());
    }

    /* renamed from: c */
    private final void m47953c(C9784d c9784d) {
        MediaFormat a = this.f38848g.m40332a(c9784d.m40350a());
        c9784d = this.f38849h.m40375b(c9784d.m40350a().m40344d());
        c9784d.configure(a, null, null, 1);
        this.f38845d = c9784d;
    }

    /* renamed from: a */
    private final void m47944a(C9781a c9781a) {
        MediaCodec mediaCodec;
        try {
            C9785a c9785a = this.f38850i;
            mediaCodec = this.f38845d;
            if (mediaCodec == null) {
                C2668g.b("videoEncoder");
            }
            Surface createInputSurface = mediaCodec.createInputSurface();
            C2668g.a(createInputSurface, "videoEncoder.createInputSurface()");
            c9785a.m40357a(createInputSurface, c9781a);
            c9781a = this.f38845d;
            if (c9781a == null) {
                C2668g.b("videoEncoder");
            }
            c9781a.start();
        } catch (C9781a c9781a2) {
            String stringBuilder;
            MediaCodec mediaCodec2 = this.f38845d;
            if (mediaCodec2 == null) {
                C2668g.b("videoEncoder");
            }
            if (C9775a.m40330a(mediaCodec2)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Can't use input surface with software codec: ");
                mediaCodec = this.f38845d;
                if (mediaCodec == null) {
                    C2668g.b("videoEncoder");
                }
                MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                C2668g.a(codecInfo, "videoEncoder.codecInfo");
                stringBuilder2.append(codecInfo.getName());
                stringBuilder = stringBuilder2.toString();
            } else {
                stringBuilder = "Failed to create input surface";
            }
            throw new LoopsEngineCreationException(stringBuilder, (Throwable) c9781a2);
        }
    }

    /* renamed from: a */
    private final void m47948a(String str) {
        this.f38846e = this.f38847f.m40333a(str, 0);
        this.f38843b = false;
    }

    /* renamed from: a */
    private final void m47949a(boolean z) {
        MediaCodec mediaCodec;
        if (z) {
            mediaCodec = this.f38845d;
            if (mediaCodec == null) {
                C2668g.b("videoEncoder");
            }
            mediaCodec.signalEndOfInputStream();
        }
        while (true) {
            mediaCodec = this.f38845d;
            if (mediaCodec == null) {
                C2668g.b("videoEncoder");
            }
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(this.f38842a, 1000);
            if (dequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
            } else if (dequeueOutputBuffer == -2) {
                m47951b();
            } else if (dequeueOutputBuffer >= 0 && m47950a(dequeueOutputBuffer)) {
                return;
            }
        }
    }

    /* renamed from: b */
    private final void m47951b() {
        C9706a.m40169a(this.f38843b ^ true, (Function0) VideoCreatorEngine$handleOutputFormatChanged$1.f44512a);
        MediaCodec mediaCodec = this.f38845d;
        if (mediaCodec == null) {
            C2668g.b("videoEncoder");
        }
        MediaFormat outputFormat = mediaCodec.getOutputFormat();
        MediaMuxer mediaMuxer = this.f38846e;
        if (mediaMuxer == null) {
            C2668g.b("muxer");
        }
        this.f38844c = mediaMuxer.addTrack(outputFormat);
        MediaMuxer mediaMuxer2 = this.f38846e;
        if (mediaMuxer2 == null) {
            C2668g.b("muxer");
        }
        mediaMuxer2.start();
        this.f38843b = true;
    }

    /* renamed from: a */
    private final boolean m47950a(int i) {
        MediaCodec mediaCodec = this.f38845d;
        if (mediaCodec == null) {
            C2668g.b("videoEncoder");
        }
        ByteBuffer b = C9769a.m40313b(mediaCodec, i);
        boolean z = b != null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Encoder OutputBuffer at index ");
        stringBuilder.append(i);
        stringBuilder.append(" was null");
        C9706a.m40168a(z, (Exception) new LoopsEngineCreationException(stringBuilder.toString()));
        if ((this.f38842a.flags & 2) != 0) {
            this.f38842a.size = 0;
        }
        if (this.f38842a.size != 0) {
            C9706a.m40169a(this.f38843b, (Function0) VideoCreatorEngine$handleMuxingEncodedData$1.f44511a);
            if (b == null) {
                C2668g.a();
            }
            b.position(this.f38842a.offset);
            b.limit(this.f38842a.offset + this.f38842a.size);
            MediaMuxer mediaMuxer = this.f38846e;
            if (mediaMuxer == null) {
                C2668g.b("muxer");
            }
            mediaMuxer.writeSampleData(this.f38844c, b, this.f38842a);
        }
        mediaCodec = this.f38845d;
        if (mediaCodec == null) {
            C2668g.b("videoEncoder");
        }
        mediaCodec.releaseOutputBuffer(i, false);
        if ((this.f38842a.flags & 4) != 0) {
            return true;
        }
        return false;
    }
}
