package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.C15820a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C15829m;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal;
import kotlin.reflect.jvm.internal.ReflectProperties.LazyVal;
import kotlin.reflect.jvm.internal.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import kotlin.text.C19296q;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001^B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010M\u001a\u00020%2\b\u0010N\u001a\u0004\u0018\u00010\u0002H\u0002J\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u00132\u0006\u0010Q\u001a\u00020RH\u0016J\u0012\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010U\u001a\u00020VH\u0016J\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020T0\u00132\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010X\u001a\u00020VH\u0016J\u0012\u0010Y\u001a\u00020%2\b\u0010Z\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010[\u001a\u00020\\H\u0002J\b\u0010]\u001a\u00020<H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R3\u0010\u001a\u001a$\u0012 \u0012\u001e \u001d*\u000e\u0018\u00010\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&R\u0014\u0010'\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008@X\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001e\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0016R\u001e\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0016R\u0016\u00108\u001a\u0004\u0018\u00018\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010;\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0016\u0010?\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010>R\u0014\u0010A\u001a\u0002008@X\u0004¢\u0006\u0006\u001a\u0004\bB\u00102R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\n8VX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\rR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\n8VX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\rR\u0016\u0010I\u001a\u0004\u0018\u00010J8VX\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006_"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "getData", "()Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "isAbstract", "", "()Z", "isCompanion", "isData", "isFinal", "isInner", "isOpen", "isSealed", "getJClass", "()Ljava/lang/Class;", "memberScope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "simpleName", "getSimpleName", "staticScope", "getStaticScope$kotlin_reflection", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", "", "getProperties", "hashCode", "isInstance", "value", "reportUnresolvedClass", "", "toString", "Data", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
public final class KClassImpl<T> extends KDeclarationContainerImpl implements KClass<T>, KClassifierImpl {
    @NotNull
    private final LazyVal<Data> data = ReflectProperties.lazy((Function0) new KClassImpl$data$1(this));
    @NotNull
    private final Class<T> jClass;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010K\u001a\u00020<2\n\u0010L\u001a\u0006\u0012\u0002\b\u00030MH\u0002R%\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR%\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R-\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00058FX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\bR%\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\bR%\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b!\u0010\bR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\bR\u001b\u0010&\u001a\u00020'8FX\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)R%\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b,\u0010\bR%\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b/\u0010\bR%\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003020\u00058FX\u0002¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b3\u0010\bR#\u00105\u001a\u0004\u0018\u00018\u00008FX\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u00108R\u001d\u0010;\u001a\u0004\u0018\u00010<8FX\u0002¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b=\u0010>R\u001d\u0010@\u001a\u0004\u0018\u00010<8FX\u0002¢\u0006\f\n\u0004\bB\u0010\n\u001a\u0004\bA\u0010>R!\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u00128FX\u0002¢\u0006\f\n\u0004\bF\u0010\n\u001a\u0004\bE\u0010\u0015R!\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00128FX\u0002¢\u0006\f\n\u0004\bJ\u0010\n\u001a\u0004\bI\u0010\u0015¨\u0006N"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "allMembers", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getAllMembers", "()Ljava/util/Collection;", "allMembers$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "allNonStaticMembers", "getAllNonStaticMembers", "allNonStaticMembers$delegate", "allStaticMembers", "getAllStaticMembers", "allStaticMembers$delegate", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "constructors", "Lkotlin/reflect/KFunction;", "constructors$annotations", "()V", "getConstructors", "constructors$delegate", "declaredMembers", "getDeclaredMembers", "declaredMembers$delegate", "declaredNonStaticMembers", "getDeclaredNonStaticMembers", "declaredNonStaticMembers$delegate", "declaredStaticMembers", "getDeclaredStaticMembers", "declaredStaticMembers$delegate", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor$delegate", "inheritedNonStaticMembers", "getInheritedNonStaticMembers", "inheritedNonStaticMembers$delegate", "inheritedStaticMembers", "getInheritedStaticMembers", "inheritedStaticMembers$delegate", "nestedClasses", "Lkotlin/reflect/KClass;", "getNestedClasses", "nestedClasses$delegate", "objectInstance", "objectInstance$annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "qualifiedName$delegate", "simpleName", "getSimpleName", "simpleName$delegate", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes$delegate", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters$delegate", "calculateLocalClassName", "jClass", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public final class Data extends kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data {
        static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "annotations", "getAnnotations()Ljava/util/List;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "simpleName", "getSimpleName()Ljava/lang/String;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "constructors", "getConstructors()Ljava/util/Collection;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "supertypes", "getSupertypes()Ljava/util/List;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        @NotNull
        private final LazySoftVal allMembers$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$allMembers$2(this));
        @NotNull
        private final LazySoftVal allNonStaticMembers$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$allNonStaticMembers$2(this));
        @NotNull
        private final LazySoftVal allStaticMembers$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$allStaticMembers$2(this));
        @NotNull
        private final LazySoftVal annotations$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$annotations$2(this));
        @NotNull
        private final LazySoftVal constructors$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$constructors$2(this));
        @NotNull
        private final LazySoftVal declaredMembers$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$declaredMembers$2(this));
        @NotNull
        private final LazySoftVal declaredNonStaticMembers$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$declaredNonStaticMembers$2(this));
        @NotNull
        private final LazySoftVal declaredStaticMembers$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$declaredStaticMembers$2(this));
        @NotNull
        private final LazySoftVal descriptor$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$descriptor$2(this));
        @NotNull
        private final LazySoftVal inheritedNonStaticMembers$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$inheritedNonStaticMembers$2(this));
        @NotNull
        private final LazySoftVal inheritedStaticMembers$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$inheritedStaticMembers$2(this));
        @NotNull
        private final LazySoftVal nestedClasses$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$nestedClasses$2(this));
        @Nullable
        private final LazyVal objectInstance$delegate = ReflectProperties.lazy((Function0) new KClassImpl$Data$objectInstance$2(this));
        @Nullable
        private final LazySoftVal qualifiedName$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$qualifiedName$2(this));
        @Nullable
        private final LazySoftVal simpleName$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$simpleName$2(this));
        @NotNull
        private final LazySoftVal supertypes$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$supertypes$2(this));
        @NotNull
        private final LazySoftVal typeParameters$delegate = ReflectProperties.lazySoft((Function0) new KClassImpl$Data$typeParameters$2(this));

        @NotNull
        public final Collection<KCallableImpl<?>> getAllMembers() {
            return (Collection) this.allMembers$delegate.getValue(this, $$delegatedProperties[16]);
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getAllNonStaticMembers() {
            return (Collection) this.allNonStaticMembers$delegate.getValue(this, $$delegatedProperties[13]);
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getAllStaticMembers() {
            return (Collection) this.allStaticMembers$delegate.getValue(this, $$delegatedProperties[14]);
        }

        @NotNull
        public final List<Annotation> getAnnotations() {
            return (List) this.annotations$delegate.getValue(this, $$delegatedProperties[1]);
        }

        @NotNull
        public final Collection<KFunction<T>> getConstructors() {
            return (Collection) this.constructors$delegate.getValue(this, $$delegatedProperties[4]);
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getDeclaredMembers() {
            return (Collection) this.declaredMembers$delegate.getValue(this, $$delegatedProperties[15]);
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getDeclaredNonStaticMembers() {
            return (Collection) this.declaredNonStaticMembers$delegate.getValue(this, $$delegatedProperties[9]);
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getDeclaredStaticMembers() {
            return (Collection) this.declaredStaticMembers$delegate.getValue(this, $$delegatedProperties[10]);
        }

        @NotNull
        public final ClassDescriptor getDescriptor() {
            return (ClassDescriptor) this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getInheritedNonStaticMembers() {
            return (Collection) this.inheritedNonStaticMembers$delegate.getValue(this, $$delegatedProperties[11]);
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getInheritedStaticMembers() {
            return (Collection) this.inheritedStaticMembers$delegate.getValue(this, $$delegatedProperties[12]);
        }

        @NotNull
        public final Collection<KClass<?>> getNestedClasses() {
            return (Collection) this.nestedClasses$delegate.getValue(this, $$delegatedProperties[5]);
        }

        @Nullable
        public final T getObjectInstance() {
            return this.objectInstance$delegate.getValue(this, $$delegatedProperties[6]);
        }

        @Nullable
        public final String getQualifiedName() {
            return (String) this.qualifiedName$delegate.getValue(this, $$delegatedProperties[3]);
        }

        @Nullable
        public final String getSimpleName() {
            return (String) this.simpleName$delegate.getValue(this, $$delegatedProperties[2]);
        }

        @NotNull
        public final List<KType> getSupertypes() {
            return (List) this.supertypes$delegate.getValue(this, $$delegatedProperties[8]);
        }

        @NotNull
        public final List<KTypeParameter> getTypeParameters() {
            return (List) this.typeParameters$delegate.getValue(this, $$delegatedProperties[7]);
        }

        public Data() {
            super();
        }

        private final String calculateLocalClassName(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                C2668g.a(simpleName, "name");
                cls = new StringBuilder();
                cls.append(enclosingMethod.getName());
                cls.append("$");
                return C19298r.m68779b(simpleName, (String) cls.toString(), null, 2, null);
            }
            cls = cls.getEnclosingConstructor();
            if (cls != null) {
                C2668g.a(simpleName, "name");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(cls.getName());
                stringBuilder.append("$");
                return C19298r.m68779b(simpleName, (String) stringBuilder.toString(), null, 2, null);
            }
            C2668g.a(simpleName, "name");
            return C19298r.m68777b(simpleName, '$', null, 2, null);
        }
    }

    public KClassImpl(@NotNull Class<T> cls) {
        C2668g.b(cls, "jClass");
        this.jClass = cls;
    }

    @NotNull
    public Class<T> getJClass() {
        return this.jClass;
    }

    @NotNull
    public final LazyVal<Data> getData() {
        return this.data;
    }

    @NotNull
    public ClassDescriptor getDescriptor() {
        return ((Data) this.data.invoke()).getDescriptor();
    }

    @NotNull
    public List<Annotation> getAnnotations() {
        return ((Data) this.data.invoke()).getAnnotations();
    }

    private final ClassId getClassId() {
        return RuntimeTypeMapper.INSTANCE.mapJvmClassToKotlinClassId(getJClass());
    }

    @NotNull
    public final MemberScope getMemberScope$kotlin_reflection() {
        return getDescriptor().getDefaultType().getMemberScope();
    }

    @NotNull
    public final MemberScope getStaticScope$kotlin_reflection() {
        MemberScope staticScope = getDescriptor().getStaticScope();
        C2668g.a(staticScope, "descriptor.staticScope");
        return staticScope;
    }

    @NotNull
    public Collection<KCallable<?>> getMembers() {
        return ((Data) this.data.invoke()).getAllMembers();
    }

    @NotNull
    public Collection<ConstructorDescriptor> getConstructorDescriptors() {
        ClassDescriptor descriptor = getDescriptor();
        if (descriptor.getKind() != ClassKind.INTERFACE) {
            if (descriptor.getKind() != ClassKind.OBJECT) {
                Collection<ConstructorDescriptor> constructors = descriptor.getConstructors();
                C2668g.a(constructors, "descriptor.constructors");
                return constructors;
            }
        }
        return C17554o.m64195a();
    }

    @NotNull
    public Collection<PropertyDescriptor> getProperties(@NotNull Name name) {
        C2668g.b(name, "name");
        return C19299w.m68809b(getMemberScope$kotlin_reflection().getContributedVariables(name, NoLookupLocation.FROM_REFLECTION), (Iterable) getStaticScope$kotlin_reflection().getContributedVariables(name, NoLookupLocation.FROM_REFLECTION));
    }

    @NotNull
    public Collection<FunctionDescriptor> getFunctions(@NotNull Name name) {
        C2668g.b(name, "name");
        return C19299w.m68809b(getMemberScope$kotlin_reflection().getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION), (Iterable) getStaticScope$kotlin_reflection().getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION));
    }

    @Nullable
    public PropertyDescriptor getLocalProperty(int i) {
        if (C2668g.a(getJClass().getSimpleName(), "DefaultImpls")) {
            Class declaringClass = getJClass().getDeclaringClass();
            if (declaringClass != null && declaringClass.isInterface()) {
                KClass a = C15820a.m59850a(declaringClass);
                if (a != null) {
                    return ((KClassImpl) a).getLocalProperty(i);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            }
        }
        ClassDescriptor descriptor = getDescriptor();
        PropertyDescriptor propertyDescriptor = null;
        if (!(descriptor instanceof DeserializedClassDescriptor)) {
            descriptor = null;
        }
        DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) descriptor;
        if (deserializedClassDescriptor != null) {
            Property property = (Property) deserializedClassDescriptor.getClassProto().getExtension(JvmProtoBuf.classLocalVariable, i);
            propertyDescriptor = (PropertyDescriptor) UtilKt.deserializeToDescriptor(getJClass(), property, deserializedClassDescriptor.getC().getNameResolver(), deserializedClassDescriptor.getC().getTypeTable(), KClassImpl$getLocalProperty$2$1.INSTANCE);
        }
        return propertyDescriptor;
    }

    @Nullable
    public String getSimpleName() {
        return ((Data) this.data.invoke()).getSimpleName();
    }

    @Nullable
    public String getQualifiedName() {
        return ((Data) this.data.invoke()).getQualifiedName();
    }

    @NotNull
    public Collection<KFunction<T>> getConstructors() {
        return ((Data) this.data.invoke()).getConstructors();
    }

    @NotNull
    public Collection<KClass<?>> getNestedClasses() {
        return ((Data) this.data.invoke()).getNestedClasses();
    }

    @Nullable
    public T getObjectInstance() {
        return ((Data) this.data.invoke()).getObjectInstance();
    }

    public boolean isInstance(@Nullable Object obj) {
        Integer functionClassArity = ReflectClassUtilKt.getFunctionClassArity(getJClass());
        if (functionClassArity != null) {
            return C15829m.m59878a(obj, functionClassArity.intValue());
        }
        Class wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        if (wrapperByPrimitive == null) {
            wrapperByPrimitive = getJClass();
        }
        return wrapperByPrimitive.isInstance(obj);
    }

    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        return ((Data) this.data.invoke()).getTypeParameters();
    }

    @NotNull
    public List<KType> getSupertypes() {
        return ((Data) this.data.invoke()).getSupertypes();
    }

    @Nullable
    public KVisibility getVisibility() {
        Visibility visibility = getDescriptor().getVisibility();
        C2668g.a(visibility, "descriptor.visibility");
        return UtilKt.toKVisibility(visibility);
    }

    public boolean isFinal() {
        return getDescriptor().getModality() == Modality.FINAL;
    }

    public boolean isOpen() {
        return getDescriptor().getModality() == Modality.OPEN;
    }

    public boolean isAbstract() {
        return getDescriptor().getModality() == Modality.ABSTRACT;
    }

    public boolean isSealed() {
        return getDescriptor().getModality() == Modality.SEALED;
    }

    public boolean isData() {
        return getDescriptor().isData();
    }

    public boolean isInner() {
        return getDescriptor().isInner();
    }

    public boolean isCompanion() {
        return getDescriptor().isCompanionObject();
    }

    public boolean equals(@Nullable Object obj) {
        return (!(obj instanceof KClassImpl) || C2668g.a(C15820a.m59853c(this), C15820a.m59853c((KClass) obj)) == null) ? null : true;
    }

    public int hashCode() {
        return C15820a.m59853c(this).hashCode();
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("class ");
        ClassId classId = getClassId();
        FqName packageFqName = classId.getPackageFqName();
        C2668g.a(packageFqName, "packageFqName");
        if (packageFqName.isRoot()) {
            str = "";
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(packageFqName.asString());
            stringBuilder.append(".");
            str = stringBuilder.toString();
        }
        String asString = classId.getRelativeClassName().asString();
        C2668g.a(asString, "classId.relativeClassName.asString()");
        String a = C19296q.m68670a(asString, '.', '$', false, 4, null);
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(a);
        stringBuilder2.append(stringBuilder.toString());
        return stringBuilder2.toString();
    }

    private final Void reportUnresolvedClass() {
        Kind kind;
        StringBuilder stringBuilder;
        ReflectKotlinClass create = ReflectKotlinClass.Factory.create(getJClass());
        if (create != null) {
            KotlinClassHeader classHeader = create.getClassHeader();
            if (classHeader != null) {
                kind = classHeader.getKind();
                if (kind == null) {
                    switch (kind) {
                        case FILE_FACADE:
                        case MULTIFILE_CLASS:
                        case MULTIFILE_CLASS_PART:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Packages and file facades are not yet supported in Kotlin reflection. ");
                            stringBuilder.append("Meanwhile please use Java reflection to inspect this class: ");
                            stringBuilder.append(getJClass());
                            throw new UnsupportedOperationException(stringBuilder.toString());
                        case SYNTHETIC_CLASS:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection ");
                            stringBuilder.append("library has no idea what declarations does it have. Please use Java reflection to inspect this class: ");
                            stringBuilder.append(getJClass());
                            throw new UnsupportedOperationException(stringBuilder.toString());
                        case UNKNOWN:
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Unknown class: ");
                            stringBuilder2.append(getJClass());
                            stringBuilder2.append(" (kind = ");
                            stringBuilder2.append(kind);
                            stringBuilder2.append(')');
                            throw new KotlinReflectionInternalError(stringBuilder2.toString());
                        case CLASS:
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unresolved class: ");
                stringBuilder.append(getJClass());
                throw new KotlinReflectionInternalError(stringBuilder.toString());
            }
        }
        kind = null;
        if (kind == null) {
            switch (kind) {
                case FILE_FACADE:
                case MULTIFILE_CLASS:
                case MULTIFILE_CLASS_PART:
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Packages and file facades are not yet supported in Kotlin reflection. ");
                    stringBuilder.append("Meanwhile please use Java reflection to inspect this class: ");
                    stringBuilder.append(getJClass());
                    throw new UnsupportedOperationException(stringBuilder.toString());
                case SYNTHETIC_CLASS:
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection ");
                    stringBuilder.append("library has no idea what declarations does it have. Please use Java reflection to inspect this class: ");
                    stringBuilder.append(getJClass());
                    throw new UnsupportedOperationException(stringBuilder.toString());
                case UNKNOWN:
                    StringBuilder stringBuilder22 = new StringBuilder();
                    stringBuilder22.append("Unknown class: ");
                    stringBuilder22.append(getJClass());
                    stringBuilder22.append(" (kind = ");
                    stringBuilder22.append(kind);
                    stringBuilder22.append(')');
                    throw new KotlinReflectionInternalError(stringBuilder22.toString());
                case CLASS:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unresolved class: ");
        stringBuilder.append(getJClass());
        throw new KotlinReflectionInternalError(stringBuilder.toString());
    }
}
