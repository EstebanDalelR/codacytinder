package com.tinder.scarlet.p471b.p473b;

import com.tinder.scarlet.Stream;
import com.tinder.scarlet.StreamAdapter;
import io.reactivex.C3957b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/scarlet/streamadapter/rxjava2/FlowableStreamAdapter;", "T", "Lcom/tinder/scarlet/StreamAdapter;", "Lio/reactivex/Flowable;", "()V", "adapt", "stream", "Lcom/tinder/scarlet/Stream;", "scarlet-stream-adapter-rxjava2"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.b.b.a */
public final class C16510a<T> implements StreamAdapter<T, C3957b<T>> {
    public /* synthetic */ Object adapt(Stream stream) {
        return m61930a(stream);
    }

    @NotNull
    /* renamed from: a */
    public C3957b<T> m61930a(@NotNull Stream<T> stream) {
        C2668g.b(stream, "stream");
        stream = C3957b.a(stream);
        C2668g.a(stream, "Flowable.fromPublisher(stream)");
        return stream;
    }
}
