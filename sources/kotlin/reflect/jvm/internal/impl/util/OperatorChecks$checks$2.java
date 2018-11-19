package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class OperatorChecks$checks$2 extends Lambda implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$2 INSTANCE = new OperatorChecks$checks$2();

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2$1 */
    static final class C191511 extends Lambda implements Function1<DeclarationDescriptor, Boolean> {
        public static final C191511 INSTANCE = new C191511();

        C191511() {
            super(1);
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((DeclarationDescriptor) obj));
        }

        public final boolean invoke(@NotNull DeclarationDescriptor declarationDescriptor) {
            C2668g.b(declarationDescriptor, "$receiver");
            return (!(declarationDescriptor instanceof ClassDescriptor) || KotlinBuiltIns.isAny((ClassDescriptor) declarationDescriptor) == null) ? null : true;
        }
    }

    OperatorChecks$checks$2() {
        super(1);
    }

    @Nullable
    public final String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "$receiver");
        C191511 c191511 = C191511.INSTANCE;
        OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
        DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        C2668g.a(containingDeclaration, "containingDeclaration");
        boolean invoke = c191511.invoke(containingDeclaration);
        Object obj = 1;
        if (!invoke) {
            functionDescriptor = functionDescriptor.getOverriddenDescriptors();
            C2668g.a(functionDescriptor, "overriddenDescriptors");
            Iterable<FunctionDescriptor> iterable = (Iterable) functionDescriptor;
            if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                for (FunctionDescriptor functionDescriptor2 : iterable) {
                    C191511 c1915112 = C191511.INSTANCE;
                    C2668g.a(functionDescriptor2, "it");
                    DeclarationDescriptor containingDeclaration2 = functionDescriptor2.getContainingDeclaration();
                    C2668g.a(containingDeclaration2, "it.containingDeclaration");
                    if (c1915112.invoke(containingDeclaration2)) {
                        functionDescriptor = true;
                        break;
                    }
                }
            }
            functionDescriptor = null;
            if (functionDescriptor == null) {
                obj = null;
            }
        }
        return obj == null ? "must override ''equals()'' in Any" : null;
    }
}
