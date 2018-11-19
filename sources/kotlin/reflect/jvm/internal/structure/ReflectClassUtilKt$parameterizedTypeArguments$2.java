package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.C19066k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "it", "Ljava/lang/reflect/ParameterizedType;", "invoke"}, k = 3, mv = {1, 1, 10})
final class ReflectClassUtilKt$parameterizedTypeArguments$2 extends Lambda implements Function1<ParameterizedType, Sequence<? extends Type>> {
    public static final ReflectClassUtilKt$parameterizedTypeArguments$2 INSTANCE = new ReflectClassUtilKt$parameterizedTypeArguments$2();

    ReflectClassUtilKt$parameterizedTypeArguments$2() {
        super(1);
    }

    @NotNull
    public final Sequence<Type> invoke(@NotNull ParameterizedType parameterizedType) {
        C2668g.b(parameterizedType, "it");
        parameterizedType = parameterizedType.getActualTypeArguments();
        C2668g.a(parameterizedType, "it.actualTypeArguments");
        return C19066k.m68012n(parameterizedType);
    }
}
