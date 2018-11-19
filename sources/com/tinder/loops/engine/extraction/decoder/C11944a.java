package com.tinder.loops.engine.extraction.decoder;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import com.tinder.exception.LoopsEngineExtractionException;
import com.tinder.loops.engine.common.p272a.C9769a;
import com.tinder.loops.engine.extraction.extractor.DecoderMediaExtractor;
import com.tinder.loops.engine.extraction.p279a.C9790a;
import com.tinder.loops.engine.extraction.p281c.C9792a;
import com.tinder.loops.engine.extraction.p281c.C9795c;
import com.tinder.loops.engine.extraction.p281c.C9796d;
import com.tinder.loops.engine.extraction.p281c.C9797e;
import com.tinder.loops.engine.extraction.p281c.C9798f;
import com.tinder.loops.engine.extraction.p282d.C9800a;
import com.tinder.loops.engine.extraction.p283e.C9803a;
import com.tinder.loops.engine.extraction.retriever.VideoMetaExtractor;
import com.tinder.p260i.C9706a;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.C19040a;
import java.nio.ByteBuffer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Subscription;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u000eH\u0002J\u0016\u0010*\u001a\u00020%2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130,H\u0002J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020!0.H\u0016J\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u000eH\u0002J\u0010\u00101\u001a\u00020%2\u0006\u0010)\u001a\u00020\u000eH\u0002J\u0016\u00102\u001a\u00020%2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130,H\u0002J\b\u00103\u001a\u00020%H\u0016J\b\u00104\u001a\u00020%H\u0002J\b\u00105\u001a\u00020%H\u0002J\b\u00106\u001a\u00020%H\u0002J\b\u00107\u001a\u00020%H\u0002J\u0010\u00108\u001a\u00020%2\u0006\u00100\u001a\u00020\u000eH\u0002J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0016\u0010:\u001a\u00020%2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130,H\u0002J\b\u0010;\u001a\u00020%H\u0002J \u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R2\u0010\u001f\u001a&\u0012\f\u0012\n \"*\u0004\u0018\u00010!0! \"*\u0012\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!\u0018\u00010 0 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/tinder/loops/engine/extraction/decoder/VideoFrameDecoder;", "Lcom/tinder/loops/engine/extraction/decoder/VideoDecoder;", "frameResolutionSelector", "Lcom/tinder/loops/engine/extraction/resolution/VideoFrameResolutionSelector;", "mediaExtractor", "Lcom/tinder/loops/engine/extraction/extractor/DecoderMediaExtractor;", "videoMetaDataExtractor", "Lcom/tinder/loops/engine/extraction/retriever/VideoMetaExtractor;", "mediaCodecFactory", "Lcom/tinder/loops/engine/extraction/codec/MediaCodecFactory;", "codecOutputSurface", "Lcom/tinder/loops/engine/extraction/opengl/CodecOutputSurface;", "(Lcom/tinder/loops/engine/extraction/resolution/VideoFrameResolutionSelector;Lcom/tinder/loops/engine/extraction/extractor/DecoderMediaExtractor;Lcom/tinder/loops/engine/extraction/retriever/VideoMetaExtractor;Lcom/tinder/loops/engine/extraction/codec/MediaCodecFactory;Lcom/tinder/loops/engine/extraction/opengl/CodecOutputSurface;)V", "currentDecoderMime", "", "decodeCount", "", "decodingFlowable", "Lio/reactivex/Flowable;", "Lcom/tinder/loops/engine/extraction/model/DecodedFrameInfo;", "frameExtractionRequest", "Lcom/tinder/loops/engine/extraction/model/FrameExtractionRequest;", "inputChunk", "isInputDone", "", "isMediaCodecDecoderReleased", "isOutputDone", "mediaCodecBufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "mediaCodecDecoder", "Landroid/media/MediaCodec;", "videoInfoSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/loops/engine/extraction/model/ExtractedFrameInfo;", "kotlin.jvm.PlatformType", "videoTrackIndex", "bindFrameExtractionParameters", "", "copyCurrentDecodedFrame", "Landroid/graphics/Bitmap;", "createNewDecoder", "requestedMime", "initAndStartDecodingFrames", "frameDecodedEventEmitter", "Lio/reactivex/FlowableEmitter;", "observeExtractedFrameInfo", "Lio/reactivex/Single;", "prepare", "videoUriString", "prepareDecoder", "processMediaCodecDecoderOutput", "release", "releaseCodecOutputSurface", "resetDecoderState", "resetVideoDecodingState", "sendMediaExtractorOutputToMediaCodecDecoder", "setupMediaExtractor", "startDecodingFrames", "startDecodingVideoFrames", "stop", "updateVideoInfo", "videoUri", "videoInfo", "Lcom/tinder/loops/engine/extraction/model/VideoMeta;", "selectedResolution", "Lcom/tinder/loops/engine/extraction/model/Resolution;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.decoder.a */
public final class C11944a implements VideoDecoder {
    /* renamed from: a */
    private int f38861a = -1;
    /* renamed from: b */
    private BufferInfo f38862b = new BufferInfo();
    /* renamed from: c */
    private int f38863c;
    /* renamed from: d */
    private int f38864d;
    /* renamed from: e */
    private boolean f38865e = true;
    /* renamed from: f */
    private boolean f38866f = true;
    /* renamed from: g */
    private C19040a<C9795c> f38867g = C19040a.a();
    /* renamed from: h */
    private final C3957b<C9792a> f38868h;
    /* renamed from: i */
    private String f38869i = "";
    /* renamed from: j */
    private boolean f38870j = true;
    /* renamed from: k */
    private C9796d f38871k;
    /* renamed from: l */
    private MediaCodec f38872l;
    /* renamed from: m */
    private final C9803a f38873m;
    /* renamed from: n */
    private final DecoderMediaExtractor f38874n;
    /* renamed from: o */
    private final VideoMetaExtractor f38875o;
    /* renamed from: p */
    private final C9790a f38876p;
    /* renamed from: q */
    private final C9800a f38877q;

    @Inject
    public C11944a(@NotNull C9803a c9803a, @NotNull DecoderMediaExtractor decoderMediaExtractor, @NotNull VideoMetaExtractor videoMetaExtractor, @NotNull C9790a c9790a, @NotNull C9800a c9800a) {
        C2668g.b(c9803a, "frameResolutionSelector");
        C2668g.b(decoderMediaExtractor, "mediaExtractor");
        C2668g.b(videoMetaExtractor, "videoMetaDataExtractor");
        C2668g.b(c9790a, "mediaCodecFactory");
        C2668g.b(c9800a, "codecOutputSurface");
        this.f38873m = c9803a;
        this.f38874n = decoderMediaExtractor;
        this.f38875o = videoMetaExtractor;
        this.f38876p = c9790a;
        this.f38877q = c9800a;
        c9803a = C3957b.a((FlowableOnSubscribe) new FlowableOnSubscribe<T>() {
            public final void subscribe(@NotNull FlowableEmitter<C9792a> flowableEmitter) {
                C2668g.b(flowableEmitter, "frameDecodedEventEmitter");
                this.m47966a((FlowableEmitter) flowableEmitter);
            }
        }, BackpressureStrategy.LATEST).a((Action) new Action() {
            public final void run() {
                this.m47973c();
                this.m47977d();
                this.m47963a();
            }
        }).b((Consumer) new Consumer<Subscription>() {
            public /* synthetic */ void accept(Object obj) {
                m47962a((Subscription) obj);
            }

            /* renamed from: a */
            public final void m47962a(Subscription subscription) {
                this.m47969b();
            }
        });
        C2668g.a(c9803a, "Flowable.create<DecodedF…DecodingState()\n        }");
        this.f38868h = c9803a;
    }

    public void bindFrameExtractionParameters(@NotNull C9796d c9796d) {
        C2668g.b(c9796d, "frameExtractionRequest");
        this.f38871k = c9796d;
    }

    @NotNull
    public C3957b<C9792a> startDecodingFrames() {
        return this.f38868h;
    }

    @NotNull
    public C3960g<C9795c> observeExtractedFrameInfo() {
        C3960g<C9795c> firstOrError = this.f38867g.hide().firstOrError();
        C2668g.a(firstOrError, "videoInfoSubject.hide().firstOrError()");
        return firstOrError;
    }

    @NotNull
    public Bitmap copyCurrentDecodedFrame() {
        return this.f38877q.m40403a();
    }

    public void release() {
        if (!(this.f38872l == null || this.f38870j)) {
            MediaCodec mediaCodec = this.f38872l;
            if (mediaCodec == null) {
                C2668g.b("mediaCodecDecoder");
            }
            mediaCodec.stop();
            mediaCodec.release();
            this.f38870j = true;
        }
        this.f38874n.release();
    }

    /* renamed from: a */
    private final void m47963a() {
        boolean z = this.f38866f && this.f38865e;
        C9706a.m40168a(z, (Exception) new LoopsEngineExtractionException("Error releasing codec output surface before decoder is stopped"));
        this.f38877q.m40405b();
    }

    /* renamed from: a */
    private final void m47966a(FlowableEmitter<C9792a> flowableEmitter) {
        C9706a.m40168a(((C11944a) this).f38871k != null, (Exception) new LoopsEngineExtractionException("Error no Video Uri set, setDataSource never called"));
        C9796d c9796d = this.f38871k;
        if (c9796d == null) {
            C2668g.b("frameExtractionRequest");
        }
        m47967a(c9796d.m40388e());
        m47971b((FlowableEmitter) flowableEmitter);
    }

    /* renamed from: b */
    private final void m47969b() {
        boolean z = this.f38866f && this.f38865e;
        C9706a.m40168a(z, (Exception) new LoopsEngineExtractionException("Error resetting video decoding state while decoder is running"));
        this.f38861a = -1;
        this.f38862b = new BufferInfo();
        this.f38863c = 0;
        this.f38864d = 0;
        this.f38865e = false;
        this.f38866f = false;
    }

    /* renamed from: a */
    private final void m47967a(String str) {
        C11944a c11944a = this;
        boolean z = true;
        C9706a.m40168a(c11944a.f38871k != null, (Exception) new LoopsEngineExtractionException("Error no frame extraction parameters bound!"));
        C9798f extractVideoInfo = this.f38875o.extractVideoInfo(str);
        m47979d(str);
        DecoderMediaExtractor decoderMediaExtractor = this.f38874n;
        C9796d c9796d = this.f38871k;
        if (c9796d == null) {
            C2668g.b("frameExtractionRequest");
        }
        decoderMediaExtractor.seekToPreviousKeyFrame(c9796d.m40384a());
        MediaFormat trackFormat = this.f38874n.getTrackFormat(this.f38861a);
        C9803a c9803a = this.f38873m;
        C9797e a = extractVideoInfo.m40391a();
        C9796d c9796d2 = this.f38871k;
        if (c9796d2 == null) {
            C2668g.b("frameExtractionRequest");
        }
        C9797e a2 = c9803a.m40425a(a, c9796d2.m40387d());
        m47968a(str, extractVideoInfo, a2);
        this.f38877q.m40404a(a2, extractVideoInfo.m40394d());
        str = trackFormat.getString("mime");
        C2668g.a(str, "mime");
        m47972b(str);
        if (c11944a.f38872l == null) {
            z = false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error Media Codec Initialization Failed Mime Type: ");
        stringBuilder.append(str);
        C9706a.m40168a(z, (Exception) new LoopsEngineExtractionException(stringBuilder.toString()));
        str = this.f38872l;
        if (str == null) {
            C2668g.b("mediaCodecDecoder");
        }
        str.configure(trackFormat, this.f38877q.m40406c(), null, 0);
        str.start();
    }

    /* renamed from: b */
    private final void m47972b(String str) {
        int i = 1;
        if ((C2668g.a(this.f38869i, str) ^ 1) == 0) {
            if ((((C11944a) this).f38872l != null ? 1 : null) != null) {
                if (!this.f38870j) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            m47976c(str);
        }
    }

    /* renamed from: c */
    private final void m47973c() {
        this.f38866f = true;
        this.f38865e = true;
    }

    /* renamed from: d */
    private final void m47977d() {
        if (this.f38872l != null) {
            MediaCodec mediaCodec = this.f38872l;
            if (mediaCodec == null) {
                C2668g.b("mediaCodecDecoder");
            }
            if (VERSION.SDK_INT >= 21) {
                mediaCodec.reset();
            } else {
                mediaCodec.stop();
            }
        }
    }

    /* renamed from: c */
    private final void m47976c(String str) {
        if (!(this.f38872l == null || this.f38870j)) {
            MediaCodec mediaCodec = this.f38872l;
            if (mediaCodec == null) {
                C2668g.b("mediaCodecDecoder");
            }
            mediaCodec.release();
        }
        this.f38872l = this.f38876p.m40374a(str);
        this.f38869i = str;
        this.f38870j = null;
    }

    /* renamed from: d */
    private final void m47979d(String str) {
        this.f38874n.setDataSource(str);
        this.f38861a = this.f38874n.selectFirstVideoTrack();
        C9706a.m40168a(this.f38861a >= null ? true : null, (Exception) new LoopsEngineExtractionException("Error selecting video track index from DecoderMediaExtractor"));
    }

    /* renamed from: a */
    private final void m47968a(String str, C9798f c9798f, C9797e c9797e) {
        this.f38867g.onNext(new C9795c(str, c9797e, c9798f.m40392b()));
    }

    /* renamed from: b */
    private final void m47971b(FlowableEmitter<C9792a> flowableEmitter) {
        C9706a.m40168a(((C11944a) this).f38872l != null, (Exception) new LoopsEngineExtractionException("Error media codec decoder is not initialized"));
        while (!this.f38865e) {
            if (!this.f38866f) {
                m47980e();
            }
            if (!this.f38865e) {
                m47975c((FlowableEmitter) flowableEmitter);
            }
        }
        flowableEmitter.onComplete();
    }

    /* renamed from: c */
    private final void m47975c(FlowableEmitter<C9792a> flowableEmitter) {
        MediaCodec mediaCodec = this.f38872l;
        if (mediaCodec == null) {
            C2668g.b("mediaCodecDecoder");
        }
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(this.f38862b, 1000);
        if (dequeueOutputBuffer >= 0) {
            boolean z = true;
            if ((this.f38862b.flags & 4) != 0) {
                this.f38865e = true;
            }
            if (this.f38862b.size == 0) {
                z = false;
            }
            MediaCodec mediaCodec2 = this.f38872l;
            if (mediaCodec2 == null) {
                C2668g.b("mediaCodecDecoder");
            }
            mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer, z);
            if (z) {
                flowableEmitter.onNext(new C9792a(this.f38862b.presentationTimeUs));
            }
        }
    }

    /* renamed from: e */
    private final void m47980e() {
        MediaCodec mediaCodec = this.f38872l;
        if (mediaCodec == null) {
            C2668g.b("mediaCodecDecoder");
        }
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(1000);
        if (dequeueInputBuffer >= 0) {
            mediaCodec = this.f38872l;
            if (mediaCodec == null) {
                C2668g.b("mediaCodecDecoder");
            }
            ByteBuffer a = C9769a.m40312a(mediaCodec, dequeueInputBuffer);
            boolean z = a != null;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Decoder Input Buffer Was Null At Index ");
            stringBuilder.append(dequeueInputBuffer);
            C9706a.m40168a(z, (Exception) new LoopsEngineExtractionException(stringBuilder.toString()));
            DecoderMediaExtractor decoderMediaExtractor = this.f38874n;
            if (a == null) {
                C2668g.a();
            }
            int readSampleData = decoderMediaExtractor.readSampleData(a, 0);
            MediaCodec mediaCodec2;
            if (readSampleData < 0) {
                mediaCodec2 = this.f38872l;
                if (mediaCodec2 == null) {
                    C2668g.b("mediaCodecDecoder");
                }
                mediaCodec2.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                this.f38866f = true;
                return;
            }
            long sampleTimeUs = this.f38874n.getSampleTimeUs();
            mediaCodec2 = this.f38872l;
            if (mediaCodec2 == null) {
                C2668g.b("mediaCodecDecoder");
            }
            mediaCodec2.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, sampleTimeUs, 0);
            this.f38863c++;
            this.f38874n.advance();
        }
    }
}
