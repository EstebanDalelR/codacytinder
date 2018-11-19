package com.tinder.scarlet;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\nJ\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/tinder/scarlet/MessageAdapter;", "T", "", "fromMessage", "message", "Lcom/tinder/scarlet/Message;", "(Lcom/tinder/scarlet/Message;)Ljava/lang/Object;", "toMessage", "data", "(Ljava/lang/Object;)Lcom/tinder/scarlet/Message;", "Factory", "scarlet-core"}, k = 1, mv = {1, 1, 9})
public interface MessageAdapter<T> {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/tinder/scarlet/MessageAdapter$Factory;", "", "create", "Lcom/tinder/scarlet/MessageAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lcom/tinder/scarlet/MessageAdapter;", "scarlet-core"}, k = 1, mv = {1, 1, 9})
    public interface Factory {
        @NotNull
        MessageAdapter<?> create(@NotNull Type type, @NotNull Annotation[] annotationArr);
    }

    T fromMessage(@NotNull C14789c c14789c);

    @NotNull
    C14789c toMessage(T t);
}
