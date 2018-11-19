package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TypeMappingConfigurationImpl implements TypeMappingConfiguration<JvmType> {
    public static final TypeMappingConfigurationImpl INSTANCE = new TypeMappingConfigurationImpl();

    @Nullable
    public String getPredefinedInternalNameForClass(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "classDescriptor");
        return null;
    }

    @Nullable
    public Void getPredefinedTypeForClass(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "classDescriptor");
        return null;
    }

    public void processErrorType(@NotNull KotlinType kotlinType, @NotNull ClassDescriptor classDescriptor) {
        C2668g.b(kotlinType, "kotlinType");
        C2668g.b(classDescriptor, "descriptor");
    }

    private TypeMappingConfigurationImpl() {
    }

    @NotNull
    public KotlinType commonSupertype(@NotNull Collection<? extends KotlinType> collection) {
        C2668g.b(collection, "types");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("There should be no intersection type in existing descriptors, but found: ");
        stringBuilder.append(C19299w.m68797a(collection, null, null, null, 0, null, null, 63, null));
        throw new AssertionError(stringBuilder.toString());
    }
}
