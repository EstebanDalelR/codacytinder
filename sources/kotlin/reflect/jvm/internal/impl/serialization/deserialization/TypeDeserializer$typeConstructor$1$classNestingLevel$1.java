package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class TypeDeserializer$typeConstructor$1$classNestingLevel$1 extends FunctionReference implements Function1<ClassId, ClassId> {
    public static final TypeDeserializer$typeConstructor$1$classNestingLevel$1 INSTANCE = new TypeDeserializer$typeConstructor$1$classNestingLevel$1();

    TypeDeserializer$typeConstructor$1$classNestingLevel$1() {
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
