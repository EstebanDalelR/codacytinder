package kotlin.reflect.jvm.internal.components;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/components/SignatureSerializer;", "", "()V", "constructorDesc", "", "constructor", "Ljava/lang/reflect/Constructor;", "fieldDesc", "field", "Ljava/lang/reflect/Field;", "methodDesc", "method", "Ljava/lang/reflect/Method;", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
final class SignatureSerializer {
    public static final SignatureSerializer INSTANCE = new SignatureSerializer();

    private SignatureSerializer() {
    }

    @NotNull
    public final String methodDesc(@NotNull Method method) {
        C2668g.b(method, "method");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (Class cls : method.getParameterTypes()) {
            C2668g.a(cls, "parameterType");
            stringBuilder.append(ReflectClassUtilKt.getDesc(cls));
        }
        stringBuilder.append(")");
        method = method.getReturnType();
        C2668g.a(method, "method.returnType");
        stringBuilder.append(ReflectClassUtilKt.getDesc(method));
        method = stringBuilder.toString();
        C2668g.a(method, "sb.toString()");
        return method;
    }

    @NotNull
    public final String constructorDesc(@NotNull Constructor<?> constructor) {
        C2668g.b(constructor, "constructor");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (Class cls : constructor.getParameterTypes()) {
            C2668g.a(cls, "parameterType");
            stringBuilder.append(ReflectClassUtilKt.getDesc(cls));
        }
        stringBuilder.append(")V");
        constructor = stringBuilder.toString();
        C2668g.a(constructor, "sb.toString()");
        return constructor;
    }

    @NotNull
    public final String fieldDesc(@NotNull Field field) {
        C2668g.b(field, "field");
        field = field.getType();
        C2668g.a(field, "field.type");
        return ReflectClassUtilKt.getDesc(field);
    }
}
