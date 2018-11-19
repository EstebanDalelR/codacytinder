package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ProtoContainer {
    @NotNull
    private final NameResolver nameResolver;
    @Nullable
    private final SourceElement source;
    @NotNull
    private final TypeTable typeTable;

    public static final class Class extends ProtoContainer {
        @NotNull
        private final ClassId classId;
        @NotNull
        private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classProto;
        private final boolean isInner;
        @NotNull
        private final Kind kind;
        @Nullable
        private final Class outerClass;

        @NotNull
        public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getClassProto() {
            return this.classProto;
        }

        @Nullable
        public final Class getOuterClass() {
            return this.outerClass;
        }

        public Class(@NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class classR, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement, @Nullable Class classR2) {
            C2668g.b(classR, "classProto");
            C2668g.b(nameResolver, "nameResolver");
            C2668g.b(typeTable, "typeTable");
            super(nameResolver, typeTable, sourceElement);
            this.classProto = classR;
            this.outerClass = classR2;
            this.classId = NameResolverUtilKt.getClassId(nameResolver, this.classProto.getFqName());
            classR = (Kind) Flags.CLASS_KIND.get(this.classProto.getFlags());
            if (classR == null) {
                classR = Kind.CLASS;
            }
            this.kind = classR;
            classR = Flags.IS_INNER.get(this.classProto.getFlags());
            C2668g.a(classR, "Flags.IS_INNER.get(classProto.flags)");
            this.isInner = classR.booleanValue();
        }

        @NotNull
        public final ClassId getClassId() {
            return this.classId;
        }

        @NotNull
        public final Kind getKind() {
            return this.kind;
        }

        public final boolean isInner() {
            return this.isInner;
        }

        @NotNull
        public FqName debugFqName() {
            FqName asSingleFqName = this.classId.asSingleFqName();
            C2668g.a(asSingleFqName, "classId.asSingleFqName()");
            return asSingleFqName;
        }
    }

    public static final class Package extends ProtoContainer {
        @NotNull
        private final FqName fqName;

        public Package(@NotNull FqName fqName, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement) {
            C2668g.b(fqName, "fqName");
            C2668g.b(nameResolver, "nameResolver");
            C2668g.b(typeTable, "typeTable");
            super(nameResolver, typeTable, sourceElement);
            this.fqName = fqName;
        }

        @NotNull
        public FqName debugFqName() {
            return this.fqName;
        }
    }

    @NotNull
    public abstract FqName debugFqName();

    private ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
        this.nameResolver = nameResolver;
        this.typeTable = typeTable;
        this.source = sourceElement;
    }

    @NotNull
    public final NameResolver getNameResolver() {
        return this.nameResolver;
    }

    @NotNull
    public final TypeTable getTypeTable() {
        return this.typeTable;
    }

    @Nullable
    public final SourceElement getSource() {
        return this.source;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append(debugFqName());
        return stringBuilder.toString();
    }
}
