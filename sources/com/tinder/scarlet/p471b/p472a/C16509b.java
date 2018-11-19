package com.tinder.scarlet.p471b.p472a;

import com.tinder.scarlet.Stream;
import com.tinder.scarlet.StreamAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/scarlet/streamadapter/builtin/IdentityStreamAdapter;", "T", "Lcom/tinder/scarlet/StreamAdapter;", "Lcom/tinder/scarlet/Stream;", "()V", "adapt", "stream", "scarlet-stream-adapter-builtin"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.b.a.b */
public final class C16509b<T> implements StreamAdapter<T, Stream<T>> {
    @NotNull
    /* renamed from: a */
    public Stream<T> m61929a(@NotNull Stream<T> stream) {
        C2668g.b(stream, "stream");
        return stream;
    }

    public /* synthetic */ Object adapt(Stream stream) {
        return m61929a(stream);
    }
}
