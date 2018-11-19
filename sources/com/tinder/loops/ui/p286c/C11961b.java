package com.tinder.loops.ui.p286c;

import android.arch.paging.DataSource;
import android.arch.paging.DataSource.C0033a;
import com.tinder.loops.engine.common.p273b.C9770a;
import com.tinder.loops.engine.extraction.VideoFrameExtractor;
import com.tinder.loops.engine.extraction.retriever.VideoMetaExtractor;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/loops/ui/paging/FrameDataSourceFactory;", "Landroid/arch/paging/DataSource$Factory;", "", "Lcom/tinder/loops/engine/common/model/VideoFrame;", "videoFrameExtractor", "Lcom/tinder/loops/engine/extraction/VideoFrameExtractor;", "videoMetaExtractor", "Lcom/tinder/loops/engine/extraction/retriever/VideoMetaExtractor;", "url", "", "maxDimension", "", "(Lcom/tinder/loops/engine/extraction/VideoFrameExtractor;Lcom/tinder/loops/engine/extraction/retriever/VideoMetaExtractor;Ljava/lang/String;I)V", "create", "Landroid/arch/paging/DataSource;", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.loops.ui.c.b */
public final class C11961b extends C0033a<Long, C9770a> {
    /* renamed from: a */
    private final VideoFrameExtractor f38893a;
    /* renamed from: b */
    private final VideoMetaExtractor f38894b;
    /* renamed from: c */
    private final String f38895c;
    /* renamed from: d */
    private final int f38896d;

    public C11961b(@NotNull VideoFrameExtractor videoFrameExtractor, @NotNull VideoMetaExtractor videoMetaExtractor, @NotNull String str, int i) {
        C2668g.b(videoFrameExtractor, "videoFrameExtractor");
        C2668g.b(videoMetaExtractor, "videoMetaExtractor");
        C2668g.b(str, "url");
        this.f38893a = videoFrameExtractor;
        this.f38894b = videoMetaExtractor;
        this.f38895c = str;
        this.f38896d = i;
    }

    @NotNull
    /* renamed from: a */
    public DataSource<Long, C9770a> m47994a() {
        return new C14047a(this.f38893a, this.f38894b, this.f38895c, this.f38896d);
    }
}
