package kotlin.reflect.jvm.internal;

import com.spotify.sdk.android.authentication.AuthenticationRequest.QueryParams;
import com.tinder.api.ManagerWebServices;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal;
import kotlin.reflect.jvm.internal.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import kotlin.text.C19296q;
import kotlin.text.C19298r;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0005\b \u0018\u0000 ?2\u00020\u0001:\u0003?@AB\u0005¢\u0006\u0002\u0010\u0002J*\u0010\f\u001a\u00020\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001c\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0013J\u001c\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0013J(\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013J\u0016\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011J \u0010#\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0013J\u0016\u0010$\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u00042\u0006\u0010\u001e\u001a\u00020&H&J\u0012\u0010'\u001a\u0004\u0018\u00010\u00172\u0006\u0010(\u001a\u00020)H&J\"\u0010*\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0\u00042\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0004J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u001e\u001a\u00020&H&J\u001a\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t022\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u00103\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u00104\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020)H\u0002J@\u00107\u001a\u0004\u0018\u00010\u001d*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0010\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t022\n\u00109\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J0\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019*\u0006\u0012\u0002\b\u00030\t2\u0010\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t022\u0006\u0010;\u001a\u00020\u0013H\u0002JE\u0010<\u001a\u0004\u0018\u00010\u001d*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001e\u001a\u00020\u00112\u0010\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0=2\n\u00109\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010;\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010>R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8TX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006B"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "()V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "methodOwner", "Ljava/lang/Class;", "getMethodOwner", "()Ljava/lang/Class;", "addParametersAndMasks", "", "result", "", "desc", "", "isConstructor", "", "createProperty", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "findConstructorBySignature", "Ljava/lang/reflect/Constructor;", "isPublic", "findDefaultConstructor", "findDefaultMethod", "Ljava/lang/reflect/Method;", "name", "isMember", "findFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "signature", "findMethodBySignature", "findPropertyDescriptor", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "index", "", "getMembers", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "belonginess", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "getProperties", "loadParameterTypes", "", "loadReturnType", "parseType", "begin", "end", "lookupMethod", "parameterTypes", "returnType", "tryGetConstructor", "declared", "tryGetMethod", "", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "Companion", "Data", "MemberBelonginess", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {
    public static final Companion Companion = new Companion();
    private static final Class<?> DEFAULT_CONSTRUCTOR_MARKER = Class.forName("kotlin.jvm.internal.e");
    @NotNull
    private static final Regex LOCAL_PROPERTY_SIGNATURE = new Regex("<v#(\\d+)>");

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "()V", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection", "()Lkotlin/text/Regex;", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Regex getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection() {
            return KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b¦\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "moduleData", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "getModuleData", "()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "moduleData$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public abstract class Data {
        static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Data.class), "moduleData", "getModuleData()Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;"))};
        @NotNull
        private final LazySoftVal moduleData$delegate = ReflectProperties.lazySoft((Function0) new KDeclarationContainerImpl$Data$moduleData$2(this));

        @NotNull
        public final RuntimeModuleData getModuleData() {
            return (RuntimeModuleData) this.moduleData$delegate.getValue(this, $$delegatedProperties[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "(Ljava/lang/String;I)V", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    protected enum MemberBelonginess {
        ;

        public final boolean accept(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
            C2668g.b(callableMemberDescriptor, "member");
            callableMemberDescriptor = callableMemberDescriptor.getKind();
            C2668g.a(callableMemberDescriptor, "member.kind");
            return callableMemberDescriptor.isReal() == (((MemberBelonginess) this) == DECLARED ? true : null);
        }
    }

    @NotNull
    public abstract Collection<ConstructorDescriptor> getConstructorDescriptors();

    @NotNull
    public abstract Collection<FunctionDescriptor> getFunctions(@NotNull Name name);

    @Nullable
    public abstract PropertyDescriptor getLocalProperty(int i);

    @NotNull
    public abstract Collection<PropertyDescriptor> getProperties(@NotNull Name name);

    @NotNull
    protected Class<?> getMethodOwner() {
        return getJClass();
    }

    @NotNull
    protected final Collection<KCallableImpl<?>> getMembers(@NotNull MemberScope memberScope, @NotNull MemberBelonginess memberBelonginess) {
        C2668g.b(memberScope, QueryParams.SCOPE);
        C2668g.b(memberBelonginess, "belonginess");
        KDeclarationContainerImpl$getMembers$visitor$1 kDeclarationContainerImpl$getMembers$visitor$1 = new KDeclarationContainerImpl$getMembers$visitor$1(this);
        Collection arrayList = new ArrayList();
        for (DeclarationDescriptor declarationDescriptor : DefaultImpls.getContributedDescriptors$default(memberScope, null, null, 3, null)) {
            Object obj;
            if (declarationDescriptor instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) declarationDescriptor;
                if ((C2668g.a(callableMemberDescriptor.getVisibility(), Visibilities.INVISIBLE_FAKE) ^ 1) != 0 && memberBelonginess.accept(callableMemberDescriptor)) {
                    obj = (KCallableImpl) declarationDescriptor.accept(kDeclarationContainerImpl$getMembers$visitor$1, C15813i.f49016a);
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
            }
            obj = null;
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return C19299w.m68840l((List) arrayList);
    }

    private final KPropertyImpl<?> createProperty(PropertyDescriptor propertyDescriptor) {
        int i = 0;
        int i2 = propertyDescriptor.getDispatchReceiverParameter() != null ? 1 : 0;
        if (propertyDescriptor.getExtensionReceiverParameter() != null) {
            i = 1;
        }
        i2 += i;
        if (!propertyDescriptor.isVar()) {
            switch (i2) {
                case 0:
                    return new KProperty0Impl(this, propertyDescriptor);
                case 1:
                    return new KProperty1Impl(this, propertyDescriptor);
                case 2:
                    return new KProperty2Impl(this, propertyDescriptor);
                default:
                    break;
            }
        }
        switch (i2) {
            case 0:
                return new KMutableProperty0Impl(this, propertyDescriptor);
            case 1:
                return new KMutableProperty1Impl(this, propertyDescriptor);
            case 2:
                return new KMutableProperty2Impl(this, propertyDescriptor);
            default:
                break;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported property: ");
        stringBuilder.append(propertyDescriptor);
        throw new KotlinReflectionInternalError(stringBuilder.toString());
    }

    @NotNull
    public final PropertyDescriptor findPropertyDescriptor(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "name");
        C2668g.b(str2, ManagerWebServices.PARAM_SIGNATURE);
        MatchResult b = LOCAL_PROPERTY_SIGNATURE.m59923b(str2);
        if (b != null) {
            str = (String) b.getDestructured().m59914a().getGroupValues().get(1);
            str2 = getLocalProperty(Integer.parseInt(str));
            if (str2 != null) {
                return str2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Local property #");
            stringBuilder.append(str);
            stringBuilder.append(" not found in ");
            stringBuilder.append(getJClass());
            throw ((Throwable) new KotlinReflectionInternalError(stringBuilder.toString()));
        }
        Name identifier = Name.identifier(str);
        C2668g.a(identifier, "Name.identifier(name)");
        Collection arrayList = new ArrayList();
        for (Object next : getProperties(identifier)) {
            if (C2668g.a(RuntimeTypeMapper.INSTANCE.mapPropertySignature((PropertyDescriptor) next).asString(), str2)) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        StringBuilder stringBuilder2;
        if (list.isEmpty()) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Property '");
            stringBuilder2.append(str);
            stringBuilder2.append("' (JVM signature: ");
            stringBuilder2.append(str2);
            stringBuilder2.append(") not resolved in ");
            stringBuilder2.append(this);
            throw new KotlinReflectionInternalError(stringBuilder2.toString());
        } else if (list.size() == 1) {
            return (PropertyDescriptor) C19299w.m68836j(list);
        } else {
            Map linkedHashMap = new LinkedHashMap();
            for (Object next2 : list) {
                Visibility visibility = ((PropertyDescriptor) next2).getVisibility();
                ArrayList arrayList2 = linkedHashMap.get(visibility);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(visibility, arrayList2);
                }
                arrayList2.add(next2);
            }
            Collection values = ag.m64175a(linkedHashMap, C15845x62283bb.INSTANCE).values();
            C2668g.a(values, "properties\n             …                }).values");
            List list2 = (List) C19299w.m68819d((Iterable) values);
            if (list2.size() == 1) {
                C2668g.a(list2, "mostVisibleProperties");
                return (PropertyDescriptor) C19299w.m68829f(list2);
            }
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("");
            stringBuilder2.append(list.size());
            stringBuilder2.append(" properties '");
            stringBuilder2.append(str);
            stringBuilder2.append("' (JVM signature: ");
            stringBuilder2.append(str2);
            stringBuilder2.append(") resolved in ");
            stringBuilder2.append(this);
            stringBuilder2.append(": ");
            stringBuilder2.append(list);
            throw new KotlinReflectionInternalError(stringBuilder2.toString());
        }
    }

    @NotNull
    public final FunctionDescriptor findFunctionDescriptor(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "name");
        C2668g.b(str2, ManagerWebServices.PARAM_SIGNATURE);
        Collection l;
        if (C2668g.a(str, "<init>")) {
            l = C19299w.m68840l(getConstructorDescriptors());
        } else {
            Name identifier = Name.identifier(str);
            C2668g.a(identifier, "Name.identifier(name)");
            l = getFunctions(identifier);
        }
        Collection arrayList = new ArrayList();
        for (Object next : r0) {
            if (C2668g.a(RuntimeTypeMapper.INSTANCE.mapSignature((FunctionDescriptor) next).asString(), str2)) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        if (list.size() == 1) {
            return (FunctionDescriptor) C19299w.m68836j(list);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\'');
        stringBuilder.append(str);
        stringBuilder.append("' (JVM signature: ");
        stringBuilder.append(str2);
        stringBuilder.append(')');
        str = stringBuilder.toString();
        if (list.isEmpty()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Function ");
            stringBuilder.append(str);
            stringBuilder.append(" not resolved in ");
            stringBuilder.append(this);
            str = stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(list.size());
            stringBuilder.append(" functions ");
            stringBuilder.append(str);
            stringBuilder.append(" resolved in ");
            stringBuilder.append(this);
            stringBuilder.append(": ");
            stringBuilder.append(list);
            str = stringBuilder.toString();
        }
        throw ((Throwable) new KotlinReflectionInternalError(str));
    }

    private final Method lookupMethod(@NotNull Class<?> cls, String str, List<? extends Class<?>> list, Class<?> cls2, boolean z) {
        Collection collection = list;
        if (collection == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        }
        list = collection.toArray(new Class[0]);
        if (list == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Class[] clsArr = (Class[]) list;
        if (z) {
            return tryGetMethod(cls, str, clsArr, cls2, false);
        }
        while (cls != null) {
            z = tryGetMethod(cls, str, clsArr, cls2, true);
            if (z) {
                return z;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    private final java.lang.reflect.Method tryGetMethod(@org.jetbrains.annotations.NotNull java.lang.Class<?> r7, java.lang.String r8, java.lang.Class<?>[] r9, java.lang.Class<?> r10, boolean r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = 0;
        if (r11 == 0) goto L_0x000f;
    L_0x0003:
        r1 = r9.length;	 Catch:{ NoSuchMethodException -> 0x0074 }
        r1 = java.util.Arrays.copyOf(r9, r1);	 Catch:{ NoSuchMethodException -> 0x0074 }
        r1 = (java.lang.Class[]) r1;	 Catch:{ NoSuchMethodException -> 0x0074 }
        r1 = r7.getDeclaredMethod(r8, r1);	 Catch:{ NoSuchMethodException -> 0x0074 }
        goto L_0x001a;	 Catch:{ NoSuchMethodException -> 0x0074 }
    L_0x000f:
        r1 = r9.length;	 Catch:{ NoSuchMethodException -> 0x0074 }
        r1 = java.util.Arrays.copyOf(r9, r1);	 Catch:{ NoSuchMethodException -> 0x0074 }
        r1 = (java.lang.Class[]) r1;	 Catch:{ NoSuchMethodException -> 0x0074 }
        r1 = r7.getMethod(r8, r1);	 Catch:{ NoSuchMethodException -> 0x0074 }
    L_0x001a:
        r2 = "result";	 Catch:{ NoSuchMethodException -> 0x0074 }
        kotlin.jvm.internal.C2668g.a(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0074 }
        r2 = r1.getReturnType();	 Catch:{ NoSuchMethodException -> 0x0074 }
        r2 = kotlin.jvm.internal.C2668g.a(r2, r10);	 Catch:{ NoSuchMethodException -> 0x0074 }
        if (r2 == 0) goto L_0x002b;	 Catch:{ NoSuchMethodException -> 0x0074 }
    L_0x0029:
        r0 = r1;	 Catch:{ NoSuchMethodException -> 0x0074 }
        goto L_0x0074;	 Catch:{ NoSuchMethodException -> 0x0074 }
    L_0x002b:
        if (r11 == 0) goto L_0x0032;	 Catch:{ NoSuchMethodException -> 0x0074 }
    L_0x002d:
        r7 = r7.getDeclaredMethods();	 Catch:{ NoSuchMethodException -> 0x0074 }
        goto L_0x0036;	 Catch:{ NoSuchMethodException -> 0x0074 }
    L_0x0032:
        r7 = r7.getMethods();	 Catch:{ NoSuchMethodException -> 0x0074 }
    L_0x0036:
        r11 = "allMethods";	 Catch:{ NoSuchMethodException -> 0x0074 }
        kotlin.jvm.internal.C2668g.a(r7, r11);	 Catch:{ NoSuchMethodException -> 0x0074 }
        r11 = r7.length;	 Catch:{ NoSuchMethodException -> 0x0074 }
        r1 = 0;	 Catch:{ NoSuchMethodException -> 0x0074 }
        r2 = 0;	 Catch:{ NoSuchMethodException -> 0x0074 }
    L_0x003e:
        if (r2 >= r11) goto L_0x0074;	 Catch:{ NoSuchMethodException -> 0x0074 }
    L_0x0040:
        r3 = r7[r2];	 Catch:{ NoSuchMethodException -> 0x0074 }
        r4 = "method";	 Catch:{ NoSuchMethodException -> 0x0074 }
        kotlin.jvm.internal.C2668g.a(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0074 }
        r4 = r3.getName();	 Catch:{ NoSuchMethodException -> 0x0074 }
        r4 = kotlin.jvm.internal.C2668g.a(r4, r8);	 Catch:{ NoSuchMethodException -> 0x0074 }
        if (r4 == 0) goto L_0x006c;	 Catch:{ NoSuchMethodException -> 0x0074 }
    L_0x0051:
        r4 = r3.getReturnType();	 Catch:{ NoSuchMethodException -> 0x0074 }
        r4 = kotlin.jvm.internal.C2668g.a(r4, r10);	 Catch:{ NoSuchMethodException -> 0x0074 }
        if (r4 == 0) goto L_0x006c;	 Catch:{ NoSuchMethodException -> 0x0074 }
    L_0x005b:
        r4 = r3.getParameterTypes();	 Catch:{ NoSuchMethodException -> 0x0074 }
        r5 = "method.parameterTypes";	 Catch:{ NoSuchMethodException -> 0x0074 }
        kotlin.jvm.internal.C2668g.a(r4, r5);	 Catch:{ NoSuchMethodException -> 0x0074 }
        r4 = java.util.Arrays.equals(r4, r9);	 Catch:{ NoSuchMethodException -> 0x0074 }
        if (r4 == 0) goto L_0x006c;
    L_0x006a:
        r4 = 1;
        goto L_0x006d;
    L_0x006c:
        r4 = 0;
    L_0x006d:
        if (r4 == 0) goto L_0x0071;
    L_0x006f:
        r0 = r3;
        goto L_0x0074;
    L_0x0071:
        r2 = r2 + 1;
        goto L_0x003e;
    L_0x0074:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetMethod(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class, boolean):java.lang.reflect.Method");
    }

    private final java.lang.reflect.Constructor<?> tryGetConstructor(@org.jetbrains.annotations.NotNull java.lang.Class<?> r2, java.util.List<? extends java.lang.Class<?>> r3, boolean r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = 0;
        if (r4 == 0) goto L_0x002d;
    L_0x0003:
        r3 = (java.util.Collection) r3;	 Catch:{ NoSuchMethodException -> 0x0057 }
        if (r3 != 0) goto L_0x000f;	 Catch:{ NoSuchMethodException -> 0x0057 }
    L_0x0007:
        r2 = new kotlin.TypeCastException;	 Catch:{ NoSuchMethodException -> 0x0057 }
        r3 = "null cannot be cast to non-null type java.util.Collection<T>";	 Catch:{ NoSuchMethodException -> 0x0057 }
        r2.<init>(r3);	 Catch:{ NoSuchMethodException -> 0x0057 }
        throw r2;	 Catch:{ NoSuchMethodException -> 0x0057 }
    L_0x000f:
        r4 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0057 }
        r3 = r3.toArray(r4);	 Catch:{ NoSuchMethodException -> 0x0057 }
        if (r3 != 0) goto L_0x001f;	 Catch:{ NoSuchMethodException -> 0x0057 }
    L_0x0017:
        r2 = new kotlin.TypeCastException;	 Catch:{ NoSuchMethodException -> 0x0057 }
        r3 = "null cannot be cast to non-null type kotlin.Array<T>";	 Catch:{ NoSuchMethodException -> 0x0057 }
        r2.<init>(r3);	 Catch:{ NoSuchMethodException -> 0x0057 }
        throw r2;	 Catch:{ NoSuchMethodException -> 0x0057 }
    L_0x001f:
        r3 = (java.lang.Class[]) r3;	 Catch:{ NoSuchMethodException -> 0x0057 }
        r4 = r3.length;	 Catch:{ NoSuchMethodException -> 0x0057 }
        r3 = java.util.Arrays.copyOf(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0057 }
        r3 = (java.lang.Class[]) r3;	 Catch:{ NoSuchMethodException -> 0x0057 }
        r2 = r2.getDeclaredConstructor(r3);	 Catch:{ NoSuchMethodException -> 0x0057 }
        goto L_0x0058;	 Catch:{ NoSuchMethodException -> 0x0057 }
    L_0x002d:
        r3 = (java.util.Collection) r3;	 Catch:{ NoSuchMethodException -> 0x0057 }
        if (r3 != 0) goto L_0x0039;	 Catch:{ NoSuchMethodException -> 0x0057 }
    L_0x0031:
        r2 = new kotlin.TypeCastException;	 Catch:{ NoSuchMethodException -> 0x0057 }
        r3 = "null cannot be cast to non-null type java.util.Collection<T>";	 Catch:{ NoSuchMethodException -> 0x0057 }
        r2.<init>(r3);	 Catch:{ NoSuchMethodException -> 0x0057 }
        throw r2;	 Catch:{ NoSuchMethodException -> 0x0057 }
    L_0x0039:
        r4 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0057 }
        r3 = r3.toArray(r4);	 Catch:{ NoSuchMethodException -> 0x0057 }
        if (r3 != 0) goto L_0x0049;	 Catch:{ NoSuchMethodException -> 0x0057 }
    L_0x0041:
        r2 = new kotlin.TypeCastException;	 Catch:{ NoSuchMethodException -> 0x0057 }
        r3 = "null cannot be cast to non-null type kotlin.Array<T>";	 Catch:{ NoSuchMethodException -> 0x0057 }
        r2.<init>(r3);	 Catch:{ NoSuchMethodException -> 0x0057 }
        throw r2;	 Catch:{ NoSuchMethodException -> 0x0057 }
    L_0x0049:
        r3 = (java.lang.Class[]) r3;	 Catch:{ NoSuchMethodException -> 0x0057 }
        r4 = r3.length;	 Catch:{ NoSuchMethodException -> 0x0057 }
        r3 = java.util.Arrays.copyOf(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0057 }
        r3 = (java.lang.Class[]) r3;	 Catch:{ NoSuchMethodException -> 0x0057 }
        r2 = r2.getConstructor(r3);	 Catch:{ NoSuchMethodException -> 0x0057 }
        goto L_0x0058;
    L_0x0057:
        r2 = 0;
    L_0x0058:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.tryGetConstructor(java.lang.Class, java.util.List, boolean):java.lang.reflect.Constructor<?>");
    }

    @Nullable
    public final Method findMethodBySignature(@NotNull String str, @NotNull String str2, boolean z) {
        C2668g.b(str, "name");
        C2668g.b(str2, "desc");
        if (C2668g.a(str, "<init>")) {
            return null;
        }
        return lookupMethod(getMethodOwner(), str, loadParameterTypes(str2), loadReturnType(str2), z);
    }

    @Nullable
    public final Method findDefaultMethod(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        C2668g.b(str, "name");
        C2668g.b(str2, "desc");
        if (C2668g.a(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(getJClass());
        }
        List list = arrayList;
        addParametersAndMasks(list, str2, false);
        Class methodOwner = getMethodOwner();
        z = new StringBuilder();
        z.append(str);
        z.append("$default");
        return lookupMethod(methodOwner, z.toString(), list, loadReturnType(str2), z2);
    }

    @Nullable
    public final Constructor<?> findConstructorBySignature(@NotNull String str, boolean z) {
        C2668g.b(str, "desc");
        return tryGetConstructor(getJClass(), loadParameterTypes(str), z ^ 1);
    }

    @Nullable
    public final Constructor<?> findDefaultConstructor(@NotNull String str, boolean z) {
        C2668g.b(str, "desc");
        List arrayList = new ArrayList();
        addParametersAndMasks(arrayList, str, true);
        return tryGetConstructor(getJClass(), arrayList, z ^ true);
    }

    private final void addParametersAndMasks(List<Class<?>> list, String str, boolean z) {
        str = loadParameterTypes(str);
        list.addAll((Collection) str);
        str = ((str.size() + 32) - 1) / 32;
        for (int i = 0; i < str; i++) {
            Class cls = Integer.TYPE;
            C2668g.a(cls, "Integer.TYPE");
            list.add(cls);
        }
        str = z ? DEFAULT_CONSTRUCTOR_MARKER : Object.class;
        C2668g.a(str, "if (isConstructor) DEFAU…RKER else Any::class.java");
        list.add(str);
    }

    private final List<Class<?>> loadParameterTypes(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char charAt = str.charAt(i2);
            if (C19298r.m68784b((CharSequence) "VZCBSIFJD", charAt, false, 2, null)) {
                i2++;
            } else if (charAt == 'L') {
                i2 = C19298r.m68740a((CharSequence) str, ';', i, false, 4, null) + 1;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown type prefix in the method signature: ");
                stringBuilder.append(str);
                throw new KotlinReflectionInternalError(stringBuilder.toString());
            }
            arrayList.add(parseType(str, i, i2));
            i = i2;
        }
        return arrayList;
    }

    private final Class<?> parseType(String str, int i, int i2) {
        switch (str.charAt(i)) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            case 'F':
                return Float.TYPE;
            case 'I':
                return Integer.TYPE;
            case 'J':
                return Long.TYPE;
            case 'L':
                ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(getJClass());
                i++;
                i2--;
                if (str == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                String substring = str.substring(i, i2);
                C2668g.a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                str = safeClassLoader.loadClass(C19296q.m68670a(substring, '/', '.', false, 4, null));
                C2668g.a(str, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
                return str;
            case 'S':
                return Short.TYPE;
            case 'V':
                str = Void.TYPE;
                C2668g.a(str, "Void.TYPE");
                return str;
            case 'Z':
                return Boolean.TYPE;
            case '[':
                return ReflectClassUtilKt.createArrayType(parseType(str, i + 1, i2));
            default:
                i2 = new StringBuilder();
                i2.append("Unknown type prefix in the method signature: ");
                i2.append(str);
                throw ((Throwable) new KotlinReflectionInternalError(i2.toString()));
        }
    }

    private final Class<?> loadReturnType(String str) {
        return parseType(str, C19298r.m68740a((CharSequence) str, ')', 0, false, 6, null) + 1, str.length());
    }
}
