package com.tinder.scarlet;

import java.lang.reflect.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0001\bJ\u001b\u0010\u0004\u001a\u00028\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/scarlet/StreamAdapter;", "T", "R", "", "adapt", "stream", "Lcom/tinder/scarlet/Stream;", "(Lcom/tinder/scarlet/Stream;)Ljava/lang/Object;", "Factory", "scarlet-core"}, k = 1, mv = {1, 1, 9})
public interface StreamAdapter<T, R> {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/scarlet/StreamAdapter$Factory;", "", "create", "Lcom/tinder/scarlet/StreamAdapter;", "type", "Ljava/lang/reflect/Type;", "scarlet-core"}, k = 1, mv = {1, 1, 9})
    public interface Factory {
        @NotNull
        StreamAdapter<Object, Object> create(@NotNull Type type);
    }

    R adapt(@NotNull Stream<T> stream);
}
