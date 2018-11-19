package kotlin.reflect.jvm.internal;

import com.tinder.api.ManagerWebServices;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C17554o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal;
import kotlin.reflect.jvm.internal.ReflectProperties.LazyVal;
import kotlin.reflect.jvm.internal.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001,B\u001d\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\b2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012 \u000f*\b\u0018\u00010\u000eR\u00020\u00000\u000eR\u00020\u00000\rX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00038TX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "jClass", "Ljava/lang/Class;", "usageModuleName", "", "(Ljava/lang/Class;Ljava/lang/String;)V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "kotlin.jvm.PlatformType", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "methodOwner", "getMethodOwner", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "getUsageModuleName", "()Ljava/lang/String;", "equals", "", "other", "", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", "", "getProperties", "hashCode", "toString", "Data", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
public final class KPackageImpl extends KDeclarationContainerImpl {
    private final LazyVal<Data> data;
    @NotNull
    private final Class<?> jClass;
    @Nullable
    private final String usageModuleName;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR%\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00108FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R)\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168FX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001e8FX\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PackageViewDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PackageViewDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlinClass", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "getKotlinClass", "()Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "kotlinClass$delegate", "members", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getMembers", "()Ljava/util/Collection;", "members$delegate", "metadata", "Lkotlin/Pair;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "getMetadata", "()Lkotlin/Pair;", "metadata$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "methodOwner$delegate", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    private final class Data extends kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data {
        static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "kotlinClass", "getKotlinClass()Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PackageViewDescriptor;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "methodOwner", "getMethodOwner()Ljava/lang/Class;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "metadata", "getMetadata()Lkotlin/Pair;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), ManagerWebServices.PARAM_GROUP_MEMBERS, "getMembers()Ljava/util/Collection;"))};
        @NotNull
        private final LazySoftVal descriptor$delegate = ReflectProperties.lazySoft((Function0) new KPackageImpl$Data$descriptor$2(this));
        private final LazySoftVal kotlinClass$delegate = ReflectProperties.lazySoft((Function0) new KPackageImpl$Data$kotlinClass$2(this));
        @NotNull
        private final LazySoftVal members$delegate = ReflectProperties.lazySoft((Function0) new KPackageImpl$Data$members$2(this));
        @Nullable
        private final LazyVal metadata$delegate = ReflectProperties.lazy((Function0) new KPackageImpl$Data$metadata$2(this));
        @NotNull
        private final LazyVal methodOwner$delegate = ReflectProperties.lazy((Function0) new KPackageImpl$Data$methodOwner$2(this));

        private final ReflectKotlinClass getKotlinClass() {
            return (ReflectKotlinClass) this.kotlinClass$delegate.getValue(this, $$delegatedProperties[0]);
        }

        @NotNull
        public final PackageViewDescriptor getDescriptor() {
            return (PackageViewDescriptor) this.descriptor$delegate.getValue(this, $$delegatedProperties[1]);
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getMembers() {
            return (Collection) this.members$delegate.getValue(this, $$delegatedProperties[4]);
        }

        @Nullable
        public final Pair<JvmNameResolver, Package> getMetadata() {
            return (Pair) this.metadata$delegate.getValue(this, $$delegatedProperties[3]);
        }

        @NotNull
        public final Class<?> getMethodOwner() {
            return (Class) this.methodOwner$delegate.getValue(this, $$delegatedProperties[2]);
        }

        public Data() {
            super();
        }
    }

    @NotNull
    public Class<?> getJClass() {
        return this.jClass;
    }

    public /* synthetic */ KPackageImpl(Class cls, String str, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            str = null;
        }
        this(cls, str);
    }

    public KPackageImpl(@NotNull Class<?> cls, @Nullable String str) {
        C2668g.b(cls, "jClass");
        this.jClass = cls;
        this.usageModuleName = str;
        this.data = ReflectProperties.lazy((Function0) new KPackageImpl$data$1(this));
    }

    @NotNull
    protected Class<?> getMethodOwner() {
        return ((Data) this.data.invoke()).getMethodOwner();
    }

    private final MemberScope getScope() {
        return ((Data) this.data.invoke()).getDescriptor().getMemberScope();
    }

    @NotNull
    public Collection<KCallable<?>> getMembers() {
        return ((Data) this.data.invoke()).getMembers();
    }

    @NotNull
    public Collection<ConstructorDescriptor> getConstructorDescriptors() {
        return C17554o.m64195a();
    }

    @NotNull
    public Collection<PropertyDescriptor> getProperties(@NotNull Name name) {
        C2668g.b(name, "name");
        return getScope().getContributedVariables(name, NoLookupLocation.FROM_REFLECTION);
    }

    @NotNull
    public Collection<FunctionDescriptor> getFunctions(@NotNull Name name) {
        C2668g.b(name, "name");
        return getScope().getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION);
    }

    @Nullable
    public PropertyDescriptor getLocalProperty(int i) {
        Pair metadata = ((Data) this.data.invoke()).getMetadata();
        if (metadata == null) {
            return 0;
        }
        JvmNameResolver jvmNameResolver = (JvmNameResolver) metadata.m59805c();
        Package packageR = (Package) metadata.m59806d();
        Property property = (Property) packageR.getExtension(JvmProtoBuf.packageLocalVariable, i);
        Class jClass = getJClass();
        MessageLite messageLite = property;
        NameResolver nameResolver = jvmNameResolver;
        TypeTable typeTable = packageR.getTypeTable();
        C2668g.a(typeTable, "packageProto.typeTable");
        return (PropertyDescriptor) UtilKt.deserializeToDescriptor(jClass, messageLite, nameResolver, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable), KPackageImpl$getLocalProperty$1$1.INSTANCE);
    }

    public boolean equals(@Nullable Object obj) {
        return (!(obj instanceof KPackageImpl) || C2668g.a(getJClass(), ((KPackageImpl) obj).getJClass()) == null) ? null : true;
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    @NotNull
    public String toString() {
        String str;
        FqName packageFqName = ReflectClassUtilKt.getClassId(getJClass()).getPackageFqName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("package ");
        C2668g.a(packageFqName, "fqName");
        if (packageFqName.isRoot()) {
            str = "<default>";
        } else {
            str = packageFqName.asString();
            C2668g.a(str, "fqName.asString()");
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
