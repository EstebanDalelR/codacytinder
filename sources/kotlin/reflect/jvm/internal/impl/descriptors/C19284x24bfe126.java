package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 */
final class C19284x24bfe126 extends FunctionReference implements Function1<ClassId, ClassId> {
    public static final C19284x24bfe126 INSTANCE = new C19284x24bfe126();

    C19284x24bfe126() {
        super(1);
    }

    public final String getName() {
        return "getOuterClassId";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(ClassId.class);
    }

    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Nullable
    public final ClassId invoke(@NotNull ClassId classId) {
        C2668g.b(classId, "p1");
        return classId.getOuterClassId();
    }
}
