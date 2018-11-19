package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JvmPackagePartSource implements DeserializedContainerSource {
    @NotNull
    private final JvmClassName className;
    @Nullable
    private final JvmClassName facadeClassName;
    @Nullable
    private final IncompatibleVersionErrorData<JvmMetadataVersion> incompatibility;
    private final boolean isPreReleaseInvisible;
    @Nullable
    private final KotlinJvmBinaryClass knownJvmBinaryClass;
    @NotNull
    private final String moduleName;

    public JvmPackagePartSource(@NotNull JvmClassName jvmClassName, @Nullable JvmClassName jvmClassName2, @NotNull Package packageR, @NotNull NameResolver nameResolver, @Nullable IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z, @Nullable KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        C2668g.b(jvmClassName, "className");
        C2668g.b(packageR, "packageProto");
        C2668g.b(nameResolver, "nameResolver");
        this.className = jvmClassName;
        this.facadeClassName = jvmClassName2;
        this.incompatibility = incompatibleVersionErrorData;
        this.isPreReleaseInvisible = z;
        this.knownJvmBinaryClass = kotlinJvmBinaryClass;
        ExtendableMessage extendableMessage = packageR;
        jvmClassName = JvmProtoBuf.packageModuleName;
        C2668g.a(jvmClassName, "JvmProtoBuf.packageModuleName");
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(extendableMessage, jvmClassName);
        if (num != null) {
            jvmClassName = nameResolver.getString(num.intValue());
            if (jvmClassName != null) {
                this.moduleName = jvmClassName;
            }
        }
        jvmClassName = "main";
        this.moduleName = jvmClassName;
    }

    @NotNull
    public final JvmClassName getClassName() {
        return this.className;
    }

    @Nullable
    public final JvmClassName getFacadeClassName() {
        return this.facadeClassName;
    }

    @Nullable
    public final KotlinJvmBinaryClass getKnownJvmBinaryClass() {
        return this.knownJvmBinaryClass;
    }

    public JvmPackagePartSource(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass, @NotNull Package packageR, @NotNull NameResolver nameResolver, @Nullable IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z) {
        C2668g.b(kotlinJvmBinaryClass, "kotlinClass");
        C2668g.b(packageR, "packageProto");
        C2668g.b(nameResolver, "nameResolver");
        JvmClassName byClassId = JvmClassName.byClassId(kotlinJvmBinaryClass.getClassId());
        C2668g.a(byClassId, "JvmClassName.byClassId(kotlinClass.classId)");
        String multifileClassName = kotlinJvmBinaryClass.getClassHeader().getMultifileClassName();
        JvmClassName jvmClassName = null;
        if (multifileClassName != null) {
            if ((((CharSequence) multifileClassName).length() > 0 ? 1 : null) != null) {
                jvmClassName = JvmClassName.byInternalName(multifileClassName);
            }
        }
        this(byClassId, jvmClassName, packageR, nameResolver, incompatibleVersionErrorData, z, kotlinJvmBinaryClass);
    }

    @NotNull
    public final Name getSimpleName() {
        String internalName = this.className.getInternalName();
        C2668g.a(internalName, "className.internalName");
        Name identifier = Name.identifier(C19298r.m68788c(internalName, '/', null, 2, null));
        C2668g.a(identifier, "Name.identifier(classNam….substringAfterLast('/'))");
        return identifier;
    }

    @NotNull
    public final ClassId getClassId() {
        return new ClassId(this.className.getPackageFqName(), getSimpleName());
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append(this.className);
        return stringBuilder.toString();
    }

    @NotNull
    public SourceFile getContainingFile() {
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        C2668g.a(sourceFile, "SourceFile.NO_SOURCE_FILE");
        return sourceFile;
    }
}
