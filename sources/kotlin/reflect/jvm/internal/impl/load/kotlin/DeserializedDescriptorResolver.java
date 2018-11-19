package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializedDescriptorResolver {
    public static final Companion Companion = new Companion();
    private static final JvmMetadataVersion KOTLIN_1_1_EAP_METADATA_VERSION = new JvmMetadataVersion(1, 1, 2);
    @NotNull
    private static final Set<Kind> KOTLIN_CLASS = al.m59817a(Kind.CLASS);
    private static final Set<Kind> KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART = am.m64178a((Object[]) new Kind[]{Kind.FILE_FACADE, Kind.MULTIFILE_CLASS_PART});
    @NotNull
    public DeserializationComponents components;

    public static final class Companion {
        private Companion() {
        }
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            C2668g.b("components");
        }
        return deserializationComponents;
    }

    public final void setComponents(@NotNull DeserializationComponentsForJava deserializationComponentsForJava) {
        C2668g.b(deserializationComponentsForJava, "components");
        this.components = deserializationComponentsForJava.getComponents();
    }

    private final boolean getSkipMetadataVersionCheck() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            C2668g.b("components");
        }
        return deserializationComponents.getConfiguration().getSkipMetadataVersionCheck();
    }

    @Nullable
    public final ClassDescriptor resolveClass(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        C2668g.b(kotlinJvmBinaryClass, "kotlinClass");
        ClassData readClassData$descriptors_jvm = readClassData$descriptors_jvm(kotlinJvmBinaryClass);
        if (readClassData$descriptors_jvm == null) {
            return null;
        }
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            C2668g.b("components");
        }
        return deserializationComponents.getClassDeserializer().deserializeClass(kotlinJvmBinaryClass.getClassId(), readClassData$descriptors_jvm);
    }

    @Nullable
    public final ClassData readClassData$descriptors_jvm(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        C2668g.b(kotlinJvmBinaryClass, "kotlinClass");
        String[] readData$descriptors_jvm = readData$descriptors_jvm(kotlinJvmBinaryClass, KOTLIN_CLASS);
        if (readData$descriptors_jvm == null) {
            return null;
        }
        String[] strings = kotlinJvmBinaryClass.getClassHeader().getStrings();
        if (strings == null) {
            return null;
        }
        Pair readClassDataFrom;
        try {
            readClassDataFrom = JvmProtoBufUtil.readClassDataFrom(readData$descriptors_jvm, strings);
        } catch (InvalidProtocolBufferException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not read data from ");
            stringBuilder.append(kotlinJvmBinaryClass.getLocation());
            throw new IllegalStateException(stringBuilder.toString(), e);
        } catch (Throwable th) {
            if (!getSkipMetadataVersionCheck()) {
                if (!kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible()) {
                    readClassDataFrom = null;
                }
            }
        }
        if (readClassDataFrom == null) {
            return null;
        }
        return new ClassData((JvmNameResolver) readClassDataFrom.m59805c(), (Class) readClassDataFrom.m59806d(), new KotlinJvmBinarySourceElement(kotlinJvmBinaryClass, getIncompatibility(kotlinJvmBinaryClass), isPreReleaseInvisible(kotlinJvmBinaryClass)));
    }

    @Nullable
    public final MemberScope createKotlinPackagePartScope(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        C2668g.b(packageFragmentDescriptor, "descriptor");
        C2668g.b(kotlinJvmBinaryClass, "kotlinClass");
        String[] readData$descriptors_jvm = readData$descriptors_jvm(kotlinJvmBinaryClass, KOTLIN_FILE_FACADE_OR_MULTIFILE_CLASS_PART);
        if (readData$descriptors_jvm == null) {
            return null;
        }
        String[] strings = kotlinJvmBinaryClass.getClassHeader().getStrings();
        if (strings == null) {
            return null;
        }
        Pair readPackageDataFrom;
        try {
            readPackageDataFrom = JvmProtoBufUtil.readPackageDataFrom(readData$descriptors_jvm, strings);
        } catch (InvalidProtocolBufferException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not read data from ");
            stringBuilder.append(kotlinJvmBinaryClass.getLocation());
            throw new IllegalStateException(stringBuilder.toString(), e);
        } catch (Throwable th) {
            if (!getSkipMetadataVersionCheck()) {
                if (!kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible()) {
                    readPackageDataFrom = null;
                }
            }
        }
        if (readPackageDataFrom == null) {
            return null;
        }
        JvmNameResolver jvmNameResolver = (JvmNameResolver) readPackageDataFrom.m59805c();
        Package packageR = (Package) readPackageDataFrom.m59806d();
        NameResolver nameResolver = jvmNameResolver;
        DeserializedContainerSource jvmPackagePartSource = new JvmPackagePartSource(kotlinJvmBinaryClass, packageR, nameResolver, getIncompatibility(kotlinJvmBinaryClass), isPreReleaseInvisible(kotlinJvmBinaryClass));
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            C2668g.b("components");
        }
        return (MemberScope) new DeserializedPackageMemberScope(packageFragmentDescriptor, packageR, nameResolver, jvmPackagePartSource, deserializationComponents, DeserializedDescriptorResolver$createKotlinPackagePartScope$2.INSTANCE);
    }

    private final IncompatibleVersionErrorData<JvmMetadataVersion> getIncompatibility(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (!getSkipMetadataVersionCheck()) {
            if (!kotlinJvmBinaryClass.getClassHeader().getMetadataVersion().isCompatible()) {
                return new IncompatibleVersionErrorData(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), JvmMetadataVersion.INSTANCE, kotlinJvmBinaryClass.getLocation(), kotlinJvmBinaryClass.getClassId());
            }
        }
        return null;
    }

    private final boolean isPreReleaseInvisible(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents == null) {
            C2668g.b("components");
        }
        return (!deserializationComponents.getConfiguration().getReportErrorsOnPreReleaseDependencies() || (!kotlinJvmBinaryClass.getClassHeader().isPreRelease() && C2668g.a(kotlinJvmBinaryClass.getClassHeader().getMetadataVersion(), KOTLIN_1_1_EAP_METADATA_VERSION) == null)) ? null : true;
    }

    @Nullable
    public final String[] readData$descriptors_jvm(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass, @NotNull Set<? extends Kind> set) {
        C2668g.b(kotlinJvmBinaryClass, "kotlinClass");
        C2668g.b(set, "expectedKinds");
        kotlinJvmBinaryClass = kotlinJvmBinaryClass.getClassHeader();
        String[] data = kotlinJvmBinaryClass.getData();
        if (data == null) {
            data = kotlinJvmBinaryClass.getIncompatibleData();
        }
        return (data == null || set.contains(kotlinJvmBinaryClass.getKind()) == null) ? null : data;
    }
}
