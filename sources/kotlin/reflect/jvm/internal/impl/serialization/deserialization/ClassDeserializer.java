package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.VersionRequirementTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ClassDeserializer {
    @NotNull
    private static final Set<ClassId> BLACK_LIST = al.m59817a(ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.cloneable.toSafe()));
    public static final Companion Companion = new Companion();
    private final Function1<ClassKey, ClassDescriptor> classes = this.components.getStorageManager().createMemoizedFunctionWithNullableValues(new ClassDeserializer$classes$1(this));
    private final DeserializationComponents components;

    private static final class ClassKey {
        @Nullable
        private final ClassData classData;
        @NotNull
        private final ClassId classId;

        public ClassKey(@NotNull ClassId classId, @Nullable ClassData classData) {
            C2668g.b(classId, "classId");
            this.classId = classId;
            this.classData = classData;
        }

        @Nullable
        public final ClassData getClassData() {
            return this.classData;
        }

        @NotNull
        public final ClassId getClassId() {
            return this.classId;
        }

        public boolean equals(@Nullable Object obj) {
            return (!(obj instanceof ClassKey) || C2668g.a(this.classId, ((ClassKey) obj).classId) == null) ? null : true;
        }

        public int hashCode() {
            return this.classId.hashCode();
        }
    }

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Set<ClassId> getBLACK_LIST() {
            return ClassDeserializer.BLACK_LIST;
        }
    }

    public ClassDeserializer(@NotNull DeserializationComponents deserializationComponents) {
        C2668g.b(deserializationComponents, "components");
        this.components = deserializationComponents;
    }

    @Nullable
    public static /* synthetic */ ClassDescriptor deserializeClass$default(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i, Object obj) {
        if ((i & 2) != 0) {
            classData = null;
        }
        return classDeserializer.deserializeClass(classId, classData);
    }

    @Nullable
    public final ClassDescriptor deserializeClass(@NotNull ClassId classId, @Nullable ClassData classData) {
        C2668g.b(classId, "classId");
        return (ClassDescriptor) this.classes.invoke(new ClassKey(classId, classData));
    }

    private final ClassDescriptor createClass(ClassKey classKey) {
        ClassId classId = classKey.getClassId();
        for (ClassDescriptorFactory createClass : this.components.getFictitiousClassDescriptorFactories()) {
            ClassDescriptor createClass2 = createClass.createClass(classId);
            if (createClass2 != null) {
                return createClass2;
            }
        }
        if (BLACK_LIST.contains(classId)) {
            return null;
        }
        classKey = classKey.getClassData();
        if (classKey == null) {
            classKey = this.components.getClassDataFinder().findClassData(classId);
        }
        if (classKey == null) {
            return null;
        }
        DeserializationContext c;
        NameResolver component1 = classKey.component1();
        Class component2 = classKey.component2();
        classKey = classKey.component3();
        ClassId outerClassId = classId.getOuterClassId();
        if (outerClassId != null) {
            ClassDescriptor deserializeClass$default = deserializeClass$default(this, outerClassId, null, 2, null);
            if (!(deserializeClass$default instanceof DeserializedClassDescriptor)) {
                deserializeClass$default = null;
            }
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) deserializeClass$default;
            if (deserializedClassDescriptor == null) {
                return null;
            }
            Name shortClassName = classId.getShortClassName();
            C2668g.a(shortClassName, "classId.shortClassName");
            if (!deserializedClassDescriptor.hasNestedClass$deserialization(shortClassName)) {
                return null;
            }
            c = deserializedClassDescriptor.getC();
        } else {
            PackageFragmentProvider packageFragmentProvider = this.components.getPackageFragmentProvider();
            FqName packageFqName = classId.getPackageFqName();
            C2668g.a(packageFqName, "classId.packageFqName");
            for (Object next : packageFragmentProvider.getPackageFragments(packageFqName)) {
                Object obj;
                PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) next;
                if (packageFragmentDescriptor instanceof DeserializedPackageFragment) {
                    DeserializedPackageFragment deserializedPackageFragment = (DeserializedPackageFragment) packageFragmentDescriptor;
                    Name shortClassName2 = classId.getShortClassName();
                    C2668g.a(shortClassName2, "classId.shortClassName");
                    if (!deserializedPackageFragment.hasTopLevelClass(shortClassName2)) {
                        obj = null;
                        continue;
                        if (obj != null) {
                            break;
                        }
                    }
                }
                obj = 1;
                continue;
                if (obj != null) {
                    break;
                }
            }
            Object next2 = null;
            PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) next2;
            if (packageFragmentDescriptor2 == null) {
                return null;
            }
            DeserializationComponents deserializationComponents = this.components;
            TypeTable typeTable = component2.getTypeTable();
            C2668g.a(typeTable, "classProto.typeTable");
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable2 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable);
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
            ProtoBuf.VersionRequirementTable versionRequirementTable = component2.getVersionRequirementTable();
            C2668g.a(versionRequirementTable, "classProto.versionRequirementTable");
            c = deserializationComponents.createContext(packageFragmentDescriptor2, component1, typeTable2, companion.create(versionRequirementTable), null);
        }
        return new DeserializedClassDescriptor(c, component2, component1, classKey);
    }
}
