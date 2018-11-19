package com.tinder.scarlet.p471b.p472a;

import com.tinder.scarlet.Stream;
import com.tinder.scarlet.StreamAdapter;
import com.tinder.scarlet.StreamAdapter.Factory;
import com.tinder.scarlet.utils.C14821e;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/scarlet/streamadapter/builtin/BuiltInStreamAdapterFactory;", "Lcom/tinder/scarlet/StreamAdapter$Factory;", "()V", "create", "Lcom/tinder/scarlet/StreamAdapter;", "", "type", "Ljava/lang/reflect/Type;", "scarlet-stream-adapter-builtin"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.b.a.a */
public final class C16508a implements Factory {
    @NotNull
    public StreamAdapter<Object, Object> create(@NotNull Type type) {
        C2668g.b(type, "type");
        if (C2668g.a(C14821e.m56167a(type), Stream.class)) {
            return (StreamAdapter) new C16509b();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(type);
        stringBuilder.append(" is not supported.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
