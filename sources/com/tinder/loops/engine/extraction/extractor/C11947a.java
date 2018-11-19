package com.tinder.loops.engine.extraction.extractor;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import com.tinder.injection.ForApplication;
import com.tinder.loops.engine.extraction.p280b.C9791a;
import java.nio.ByteBuffer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u000eH\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, d2 = {"Lcom/tinder/loops/engine/extraction/extractor/VideoDecoderExtractor;", "Lcom/tinder/loops/engine/extraction/extractor/DecoderMediaExtractor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "isReleased", "", "loadedMediaUri", "Landroid/net/Uri;", "mediaExtractor", "Landroid/media/MediaExtractor;", "sampleTimeUs", "", "getSampleTimeUs", "()J", "sampleTrackIndex", "", "getSampleTrackIndex", "()I", "advance", "getTrackFormat", "Landroid/media/MediaFormat;", "trackIndex", "readSampleData", "byteBuf", "Ljava/nio/ByteBuffer;", "offset", "release", "", "resetMediaExtractor", "seekToPreviousKeyFrame", "presentationTimeUs", "selectFirstVideoTrack", "setDataSource", "mediaUriString", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.extractor.a */
public final class C11947a implements DecoderMediaExtractor {
    /* renamed from: a */
    private MediaExtractor f38880a;
    /* renamed from: b */
    private boolean f38881b;
    /* renamed from: c */
    private Uri f38882c;
    @NotNull
    /* renamed from: d */
    private final Context f38883d;

    @Inject
    public C11947a(@NotNull @ForApplication Context context) {
        C2668g.b(context, "context");
        this.f38883d = context;
    }

    public long getSampleTimeUs() {
        MediaExtractor mediaExtractor = this.f38880a;
        if (mediaExtractor == null) {
            C2668g.b("mediaExtractor");
        }
        return mediaExtractor.getSampleTime();
    }

    public int getSampleTrackIndex() {
        MediaExtractor mediaExtractor = this.f38880a;
        if (mediaExtractor == null) {
            C2668g.b("mediaExtractor");
        }
        return mediaExtractor.getSampleTrackIndex();
    }

    /* renamed from: a */
    private final void m47983a() {
        if (!(this.f38880a == null || this.f38881b)) {
            release();
        }
        this.f38880a = new MediaExtractor();
        this.f38881b = false;
    }

    public void setDataSource(@NotNull String str) {
        C2668g.b(str, "mediaUriString");
        str = Uri.parse(str);
        if (!this.f38881b) {
            if ((((C11947a) this).f38880a != null ? 1 : null) != null) {
                Uri uri = this.f38882c;
                if (uri == null) {
                    C2668g.b("loadedMediaUri");
                }
                if ((C2668g.a(uri, str) ^ 1) == 0) {
                    return;
                }
            }
        }
        m47983a();
        MediaExtractor mediaExtractor = this.f38880a;
        if (mediaExtractor == null) {
            C2668g.b("mediaExtractor");
        }
        mediaExtractor.setDataSource(this.f38883d, str, null);
        C2668g.a(str, "mediaUri");
        this.f38882c = str;
    }

    public int selectFirstVideoTrack() {
        MediaExtractor mediaExtractor = this.f38880a;
        if (mediaExtractor == null) {
            C2668g.b("mediaExtractor");
        }
        int a = C9791a.m40376a(mediaExtractor);
        MediaExtractor mediaExtractor2 = this.f38880a;
        if (mediaExtractor2 == null) {
            C2668g.b("mediaExtractor");
        }
        mediaExtractor2.selectTrack(a);
        return a;
    }

    public int readSampleData(@NotNull ByteBuffer byteBuffer, int i) {
        C2668g.b(byteBuffer, "byteBuf");
        MediaExtractor mediaExtractor = this.f38880a;
        if (mediaExtractor == null) {
            C2668g.b("mediaExtractor");
        }
        return mediaExtractor.readSampleData(byteBuffer, i);
    }

    public boolean advance() {
        MediaExtractor mediaExtractor = this.f38880a;
        if (mediaExtractor == null) {
            C2668g.b("mediaExtractor");
        }
        return mediaExtractor.advance();
    }

    public void seekToPreviousKeyFrame(long j) {
        MediaExtractor mediaExtractor = this.f38880a;
        if (mediaExtractor == null) {
            C2668g.b("mediaExtractor");
        }
        mediaExtractor.seekTo(j, 0);
    }

    @NotNull
    public MediaFormat getTrackFormat(int i) {
        MediaExtractor mediaExtractor = this.f38880a;
        if (mediaExtractor == null) {
            C2668g.b("mediaExtractor");
        }
        i = mediaExtractor.getTrackFormat(i);
        C2668g.a(i, "mediaExtractor.getTrackFormat(trackIndex)");
        return i;
    }

    public void release() {
        if (this.f38880a != null) {
            MediaExtractor mediaExtractor = this.f38880a;
            if (mediaExtractor == null) {
                C2668g.b("mediaExtractor");
            }
            mediaExtractor.release();
            this.f38881b = true;
        }
    }
}
