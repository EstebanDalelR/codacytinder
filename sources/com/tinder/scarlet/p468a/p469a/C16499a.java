package com.tinder.scarlet.p468a.p469a;

import com.tinder.scarlet.MessageAdapter;
import com.tinder.scarlet.MessageAdapter.Factory;
import com.tinder.scarlet.utils.C14821e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/scarlet/messageadapter/builtin/BuiltInMessageAdapterFactory;", "Lcom/tinder/scarlet/MessageAdapter$Factory;", "()V", "create", "Lcom/tinder/scarlet/MessageAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lcom/tinder/scarlet/MessageAdapter;", "scarlet-message-adapter-builtin"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.a.a.a */
public final class C16499a implements Factory {
    @NotNull
    public MessageAdapter<?> create(@NotNull Type type, @NotNull Annotation[] annotationArr) {
        C2668g.b(type, "type");
        C2668g.b(annotationArr, "annotations");
        annotationArr = C14821e.m56167a(type);
        if (C2668g.a(annotationArr, String.class)) {
            return (MessageAdapter) new C16501c();
        }
        if (C2668g.a(annotationArr, byte[].class) != null) {
            return (MessageAdapter) new C16500b();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type is not supported by this MessageAdapterFactory: ");
        stringBuilder.append(type);
        throw ((Throwable) new IllegalArgumentException(stringBuilder.toString()));
    }
}
