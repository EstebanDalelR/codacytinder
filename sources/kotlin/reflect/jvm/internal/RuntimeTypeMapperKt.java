package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.C19066k;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"signature", "", "Ljava/lang/reflect/Method;", "getSignature", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "kotlin-reflection"}, k = 2, mv = {1, 1, 10})
public final class RuntimeTypeMapperKt {
    private static final String getSignature(@NotNull Method method) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(method.getName());
        Object parameterTypes = method.getParameterTypes();
        C2668g.a(parameterTypes, "parameterTypes");
        stringBuilder.append(C19066k.m67968a(parameterTypes, "", "(", ")", 0, null, RuntimeTypeMapperKt$signature$1.INSTANCE, 24, null));
        method = method.getReturnType();
        C2668g.a(method, "returnType");
        stringBuilder.append(ReflectClassUtilKt.getDesc(method));
        return stringBuilder.toString();
    }
}
