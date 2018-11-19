package com.tinder.loops.engine.extraction.retriever;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.tinder.exception.LoopsEngineExtractionException;
import com.tinder.injection.ForApplication;
import com.tinder.loops.engine.extraction.p281c.C9797e;
import com.tinder.loops.engine.extraction.p281c.C9798f;
import com.tinder.p260i.C9706a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/loops/engine/extraction/retriever/VideoMetaRetriever;", "Lcom/tinder/loops/engine/extraction/retriever/VideoMetaExtractor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "extractVideoInfo", "Lcom/tinder/loops/engine/extraction/model/VideoMeta;", "videoUriString", "", "getFileSizeFromCursor", "", "cursor", "Landroid/database/Cursor;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.engine.extraction.retriever.a */
public final class C11948a implements VideoMetaExtractor {
    /* renamed from: a */
    private final Context f38884a;

    @Inject
    public C11948a(@NotNull @ForApplication Context context) {
        C2668g.b(context, "context");
        this.f38884a = context;
    }

    @NotNull
    public C9798f extractVideoInfo(@NotNull String str) {
        C2668g.b(str, "videoUriString");
        str = Uri.parse(str);
        Cursor query = this.f38884a.getContentResolver().query(str, null, null, null, null);
        long a = query != null ? m47984a(query) : 0;
        AssetFileDescriptor openAssetFileDescriptor = this.f38884a.getContentResolver().openAssetFileDescriptor(str, "r");
        C9706a.m40168a(openAssetFileDescriptor != null, (Exception) new LoopsEngineExtractionException("Error could not fetch meta info for video"));
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(this.f38884a, str);
        str = mediaMetadataRetriever.extractMetadata(19);
        C2668g.a(str, "mediaMetadataRetriever.e…ETADATA_KEY_VIDEO_HEIGHT)");
        str = Integer.parseInt(str);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
        C2668g.a(extractMetadata, "mediaMetadataRetriever.e…METADATA_KEY_VIDEO_WIDTH)");
        int parseInt = Integer.parseInt(extractMetadata);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(9);
        C2668g.a(extractMetadata2, "mediaMetadataRetriever.e…er.METADATA_KEY_DURATION)");
        long parseLong = Long.parseLong(extractMetadata2);
        extractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
        C2668g.a(extractMetadata2, "mediaMetadataRetriever.e…ADATA_KEY_VIDEO_ROTATION)");
        int parseInt2 = Integer.parseInt(extractMetadata2);
        extractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
        C2668g.a(extractMetadata2, "mediaMetadataRetriever.e…ver.METADATA_KEY_BITRATE)");
        int parseInt3 = Integer.parseInt(extractMetadata2);
        openAssetFileDescriptor.close();
        mediaMetadataRetriever.release();
        return new C9798f(new C9797e(parseInt, str), parseInt3, parseLong, parseInt2, a);
    }

    /* renamed from: a */
    private final long m47984a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("_size");
        cursor.moveToFirst();
        long j = cursor.getLong(columnIndex);
        cursor.close();
        return j;
    }
}
