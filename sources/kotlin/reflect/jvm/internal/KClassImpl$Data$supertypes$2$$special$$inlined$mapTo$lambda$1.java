package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.C19066k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke", "kotlin/reflect/jvm/internal/KClassImpl$Data$supertypes$2$1$1"}, k = 3, mv = {1, 1, 10})
final class KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1 extends Lambda implements Function0<Type> {
    final /* synthetic */ KotlinType $kotlinType;
    final /* synthetic */ KClassImpl$Data$supertypes$2 this$0;

    KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1(KotlinType kotlinType, KClassImpl$Data$supertypes$2 kClassImpl$Data$supertypes$2) {
        this.$kotlinType = kotlinType;
        this.this$0 = kClassImpl$Data$supertypes$2;
        super(0);
    }

    @NotNull
    public final Type invoke() {
        ClassifierDescriptor declarationDescriptor = this.$kotlinType.getConstructor().getDeclarationDescriptor();
        StringBuilder stringBuilder;
        if (declarationDescriptor instanceof ClassDescriptor) {
            Class toJavaClass = UtilKt.toJavaClass((ClassDescriptor) declarationDescriptor);
            if (toJavaClass == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported superclass of ");
                stringBuilder.append(this.this$0.this$0);
                stringBuilder.append(": ");
                stringBuilder.append(declarationDescriptor);
                throw new KotlinReflectionInternalError(stringBuilder.toString());
            } else if (C2668g.a(this.this$0.this$0.this$0.getJClass().getSuperclass(), toJavaClass)) {
                r0 = this.this$0.this$0.this$0.getJClass().getGenericSuperclass();
                C2668g.a(r0, "jClass.genericSuperclass");
                return r0;
            } else {
                Object interfaces = this.this$0.this$0.this$0.getJClass().getInterfaces();
                C2668g.a(interfaces, "jClass.interfaces");
                int b = C19066k.m67982b((Object[]) interfaces, (Object) toJavaClass);
                if (b < 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("No superclass of ");
                    stringBuilder.append(this.this$0.this$0);
                    stringBuilder.append(" in Java reflection for ");
                    stringBuilder.append(declarationDescriptor);
                    throw new KotlinReflectionInternalError(stringBuilder.toString());
                }
                r0 = this.this$0.this$0.this$0.getJClass().getGenericInterfaces()[b];
                C2668g.a(r0, "jClass.genericInterfaces[index]");
                return r0;
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Supertype not a class: ");
        stringBuilder.append(declarationDescriptor);
        throw new KotlinReflectionInternalError(stringBuilder.toString());
    }
}
