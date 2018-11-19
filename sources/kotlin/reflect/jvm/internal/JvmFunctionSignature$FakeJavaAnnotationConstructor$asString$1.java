package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1 extends Lambda implements Function1<Method, String> {
    public static final JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1 INSTANCE = new JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1();

    JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1() {
        super(1);
    }

    @NotNull
    public final String invoke(Method method) {
        C2668g.a(method, "it");
        method = method.getReturnType();
        C2668g.a(method, "it.returnType");
        return ReflectClassUtilKt.getDesc(method);
    }
}
