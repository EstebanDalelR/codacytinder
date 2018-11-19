package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {
    private final LazyJavaPackageFragment packageFragment;

    public KotlinJvmBinaryPackageSourceElement(@NotNull LazyJavaPackageFragment lazyJavaPackageFragment) {
        C2668g.b(lazyJavaPackageFragment, "packageFragment");
        this.packageFragment = lazyJavaPackageFragment;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.packageFragment);
        stringBuilder.append(": ");
        stringBuilder.append(this.packageFragment.getBinaryClasses$descriptors_jvm().keySet());
        return stringBuilder.toString();
    }

    @NotNull
    public SourceFile getContainingFile() {
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        C2668g.a(sourceFile, "SourceFile.NO_SOURCE_FILE");
        return sourceFile;
    }

    @Nullable
    public final KotlinJvmBinaryClass getContainingBinaryClass(@NotNull DeserializedMemberDescriptor deserializedMemberDescriptor) {
        C2668g.b(deserializedMemberDescriptor, "descriptor");
        deserializedMemberDescriptor = UtilKt.getImplClassNameForDeserialized(deserializedMemberDescriptor);
        return deserializedMemberDescriptor != null ? (KotlinJvmBinaryClass) this.packageFragment.getBinaryClasses$descriptors_jvm().get(deserializedMemberDescriptor.getInternalName()) : null;
    }
}
