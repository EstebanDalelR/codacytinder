package com.tinder.loops.engine.extraction.extractor;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H&J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0007H&J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/tinder/loops/engine/extraction/extractor/DecoderMediaExtractor;", "", "sampleTimeUs", "", "getSampleTimeUs", "()J", "sampleTrackIndex", "", "getSampleTrackIndex", "()I", "advance", "", "getTrackFormat", "Landroid/media/MediaFormat;", "trackIndex", "readSampleData", "byteBuf", "Ljava/nio/ByteBuffer;", "offset", "release", "", "seekToPreviousKeyFrame", "presentationTimeUs", "selectFirstVideoTrack", "setDataSource", "mediaUriString", "", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
public interface DecoderMediaExtractor {
    boolean advance();

    long getSampleTimeUs();

    int getSampleTrackIndex();

    @NotNull
    MediaFormat getTrackFormat(int i);

    int readSampleData(@NotNull ByteBuffer byteBuffer, int i);

    void release();

    void seekToPreviousKeyFrame(long j);

    int selectFirstVideoTrack();

    void setDataSource(@NotNull String str);
}
