package com.tinder.scarlet.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u000e\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0001¨\u0006\t"}, d2 = {"getParameterUpperBound", "Ljava/lang/reflect/Type;", "Ljava/lang/reflect/ParameterizedType;", "index", "", "getRawType", "Ljava/lang/Class;", "hasUnresolvableType", "", "scarlet-core"}, k = 2, mv = {1, 1, 9})
@JvmName(name = "TypeUtils")
/* renamed from: com.tinder.scarlet.utils.e */
public final class C14821e {
    @NotNull
    /* renamed from: a */
    public static final Class<?> m56167a(@NotNull Type type) {
        C2668g.b(type, "$receiver");
        type = C14822f.m56170a(type);
        C2668g.a(type, "Utils.getRawType(this)");
        return type;
    }

    /* renamed from: b */
    public static final boolean m56169b(@NotNull Type type) {
        C2668g.b(type, "$receiver");
        return C14822f.m56173b(type);
    }

    @NotNull
    /* renamed from: a */
    public static final Type m56168a(@NotNull ParameterizedType parameterizedType, int i) {
        C2668g.b(parameterizedType, "$receiver");
        parameterizedType = C14822f.m56172a(i, parameterizedType);
        C2668g.a(parameterizedType, "Utils.getParameterUpperBound(index, this)");
        return parameterizedType;
    }
}
