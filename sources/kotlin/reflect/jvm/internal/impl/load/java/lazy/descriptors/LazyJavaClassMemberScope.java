package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C15819j;
import kotlin.Pair;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19291t;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LazyJavaClassMemberScope extends LazyJavaScope {
    @NotNull
    private final NotNullLazyValue<List<ClassConstructorDescriptor>> constructors;
    private final NotNullLazyValue<Map<Name, JavaField>> enumEntryIndex;
    private final JavaClass jClass;
    private final NotNullLazyValue<Set<Name>> nestedClassIndex;
    private final MemoizedFunctionToNullable<Name, ClassDescriptorBase> nestedClasses;
    @NotNull
    private final ClassDescriptor ownerDescriptor;

    @NotNull
    protected ClassDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }

    public LazyJavaClassMemberScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull JavaClass javaClass) {
        C2668g.b(lazyJavaResolverContext, "c");
        C2668g.b(classDescriptor, "ownerDescriptor");
        C2668g.b(javaClass, "jClass");
        super(lazyJavaResolverContext);
        this.ownerDescriptor = classDescriptor;
        this.jClass = javaClass;
        this.constructors = lazyJavaResolverContext.getStorageManager().createLazyValue((Function0) new LazyJavaClassMemberScope$constructors$1(this, lazyJavaResolverContext));
        this.nestedClassIndex = lazyJavaResolverContext.getStorageManager().createLazyValue((Function0) new LazyJavaClassMemberScope$nestedClassIndex$1(this));
        this.enumEntryIndex = lazyJavaResolverContext.getStorageManager().createLazyValue((Function0) new LazyJavaClassMemberScope$enumEntryIndex$1(this));
        this.nestedClasses = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues((Function1) new LazyJavaClassMemberScope$nestedClasses$1(this, lazyJavaResolverContext));
    }

    @NotNull
    protected ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.jClass, LazyJavaClassMemberScope$computeMemberIndex$1.INSTANCE);
    }

    @NotNull
    protected HashSet<Name> computeFunctionNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        C2668g.a(typeConstructor, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        C2668g.a(supertypes, "ownerDescriptor.typeConstructor.supertypes");
        Collection hashSet = new HashSet();
        for (KotlinType memberScope : supertypes) {
            C19291t.m68635a(hashSet, (Iterable) memberScope.getMemberScope().getFunctionNames());
        }
        HashSet<Name> hashSet2 = (HashSet) hashSet;
        hashSet2.addAll(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getMethodNames());
        hashSet2.addAll(computeClassNames(descriptorKindFilter, function1));
        return hashSet2;
    }

    @NotNull
    public final NotNullLazyValue<List<ClassConstructorDescriptor>> getConstructors$descriptors_jvm() {
        return this.constructors;
    }

    protected boolean isVisibleAsFunction(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        C2668g.b(javaMethodDescriptor, "$receiver");
        if (this.jClass.isAnnotationType()) {
            return null;
        }
        return isVisibleAsFunctionInCurrentClass(javaMethodDescriptor);
    }

    private final boolean isVisibleAsFunctionInCurrentClass(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Object obj;
        Name name = simpleFunctionDescriptor.getName();
        C2668g.a(name, "function.name");
        Iterable<Name> propertyNamesCandidatesByAccessorName = PropertiesConventionUtilKt.getPropertyNamesCandidatesByAccessorName(name);
        boolean z = true;
        if (!((propertyNamesCandidatesByAccessorName instanceof Collection) && ((Collection) propertyNamesCandidatesByAccessorName).isEmpty())) {
            for (Name propertiesFromSupertypes : propertyNamesCandidatesByAccessorName) {
                Object obj2;
                Iterable<PropertyDescriptor> propertiesFromSupertypes2 = getPropertiesFromSupertypes(propertiesFromSupertypes);
                if (!((propertiesFromSupertypes2 instanceof Collection) && ((Collection) propertiesFromSupertypes2).isEmpty())) {
                    for (PropertyDescriptor propertyDescriptor : propertiesFromSupertypes2) {
                        Object obj3;
                        if (!doesClassOverridesProperty(propertyDescriptor, new C19090xb5a47a0f(this, simpleFunctionDescriptor)) || (!propertyDescriptor.isVar() && JvmAbi.isSetterName(simpleFunctionDescriptor.getName().asString()))) {
                            obj3 = null;
                            continue;
                        } else {
                            obj3 = 1;
                            continue;
                        }
                        if (obj3 != null) {
                            obj2 = 1;
                            continue;
                            break;
                        }
                    }
                }
                obj2 = null;
                continue;
                if (obj2 != null) {
                    obj = 1;
                    break;
                }
            }
        }
        obj = null;
        if (obj != null) {
            return false;
        }
        if (doesOverrideRenamedBuiltins(simpleFunctionDescriptor) || shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters(simpleFunctionDescriptor) != null) {
            z = false;
        }
        return z;
    }

    private final boolean shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name = simpleFunctionDescriptor.getName();
        C2668g.a(name, "name");
        boolean sameAsBuiltinMethodWithErasedValueParameters = builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name);
        boolean z = false;
        if (!sameAsBuiltinMethodWithErasedValueParameters) {
            return false;
        }
        Name name2 = simpleFunctionDescriptor.getName();
        C2668g.a(name2, "name");
        Collection arrayList = new ArrayList();
        for (SimpleFunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava : getFunctionsFromSupertypes(name2)) {
            FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava2 = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(overriddenBuiltinFunctionWithErasedValueParametersInJava);
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava2 != null) {
                arrayList.add(overriddenBuiltinFunctionWithErasedValueParametersInJava2);
            }
        }
        Iterable<FunctionDescriptor> iterable = (List) arrayList;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (FunctionDescriptor hasSameJvmDescriptorButDoesNotOverride : iterable) {
                if (hasSameJvmDescriptorButDoesNotOverride(simpleFunctionDescriptor, hasSameJvmDescriptorButDoesNotOverride)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    private final Collection<SimpleFunctionDescriptor> searchMethodsByNameWithoutBuiltinMagic(Name name) {
        Iterable<JavaMethod> findMethodsByName = ((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).findMethodsByName(name);
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) findMethodsByName, 10));
        for (JavaMethod resolveMethodToFunctionDescriptor : findMethodsByName) {
            arrayList.add(resolveMethodToFunctionDescriptor(resolveMethodToFunctionDescriptor));
        }
        return (List) arrayList;
    }

    private final Collection<SimpleFunctionDescriptor> searchMethodsInSupertypesWithoutBuiltinMagic(Name name) {
        Collection arrayList = new ArrayList();
        for (Object next : getFunctionsFromSupertypes(name)) {
            Object obj;
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) next;
            if (!SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(simpleFunctionDescriptor)) {
                if (BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor) == null) {
                    obj = null;
                    if (obj == null) {
                        arrayList.add(next);
                    }
                }
            }
            obj = 1;
            if (obj == null) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    private final boolean doesOverrideRenamedBuiltins(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName = BuiltinMethodsWithDifferentJvmName.INSTANCE;
        Name name = simpleFunctionDescriptor.getName();
        C2668g.a(name, "name");
        Iterable<Name> builtinFunctionNamesByJvmName = builtinMethodsWithDifferentJvmName.getBuiltinFunctionNamesByJvmName(name);
        if ((builtinFunctionNamesByJvmName instanceof Collection) && ((Collection) builtinFunctionNamesByJvmName).isEmpty()) {
            return false;
        }
        for (Name name2 : builtinFunctionNamesByJvmName) {
            Object obj;
            Collection arrayList = new ArrayList();
            for (Object next : getFunctionsFromSupertypes(name2)) {
                if (SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName((SimpleFunctionDescriptor) next)) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            if (!list.isEmpty()) {
                SimpleFunctionDescriptor createRenamedCopy = createRenamedCopy(simpleFunctionDescriptor, name2);
                Iterable<SimpleFunctionDescriptor> iterable = list;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (SimpleFunctionDescriptor doesOverrideRenamedDescriptor : iterable) {
                        if (doesOverrideRenamedDescriptor(doesOverrideRenamedDescriptor, createRenamedCopy)) {
                            obj = 1;
                            continue;
                            break;
                        }
                    }
                }
            }
            obj = null;
            continue;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    private final SimpleFunctionDescriptor createRenamedCopy(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor, Name name) {
        simpleFunctionDescriptor = simpleFunctionDescriptor.newCopyBuilder();
        simpleFunctionDescriptor.setName(name);
        simpleFunctionDescriptor.setSignatureChange();
        simpleFunctionDescriptor.setPreserveSourceElement();
        simpleFunctionDescriptor = simpleFunctionDescriptor.build();
        if (simpleFunctionDescriptor == null) {
            C2668g.a();
        }
        return simpleFunctionDescriptor;
    }

    private final boolean doesOverrideRenamedDescriptor(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        if (BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor)) {
            functionDescriptor = functionDescriptor.getOriginal();
        }
        C2668g.a(functionDescriptor, "subDescriptorToCheck");
        return doesOverride(functionDescriptor, simpleFunctionDescriptor);
    }

    private final boolean doesOverride(@NotNull CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverrideCompatibilityInfo isOverridableByWithoutExternalConditions = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptor2, callableDescriptor, true);
        C2668g.a(isOverridableByWithoutExternalConditions, "OverridingUtil.DEFAULT.i…erDescriptor, this, true)");
        if (isOverridableByWithoutExternalConditions.getResult() == Result.OVERRIDABLE && JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(callableDescriptor2, callableDescriptor) == null) {
            return true;
        }
        return false;
    }

    private final SimpleFunctionDescriptor findGetterOverride(@NotNull PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        String str = null;
        getter = getter != null ? (PropertyGetterDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(getter) : null;
        if (getter != null) {
            str = BuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(getter);
        }
        if (str != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(getOwnerDescriptor(), getter)) {
            return findGetterByName(propertyDescriptor, str, function1);
        }
        String str2 = JvmAbi.getterName(propertyDescriptor.getName().asString());
        C2668g.a(str2, "JvmAbi.getterName(name.asString())");
        return findGetterByName(propertyDescriptor, str2, function1);
    }

    private final SimpleFunctionDescriptor findGetterByName(@NotNull PropertyDescriptor propertyDescriptor, String str, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        str = Name.identifier(str);
        C2668g.a(str, "Name.identifier(getterName)");
        str = ((Iterable) function1.invoke(str)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (str.hasNext() == null) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) str.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() != 0) {
                continue;
            } else {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType != null ? kotlinTypeChecker.isSubtypeOf(returnType, propertyDescriptor.getType()) : false) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final SimpleFunctionDescriptor findSetterOverride(@NotNull PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Name identifier = Name.identifier(JvmAbi.setterName(propertyDescriptor.getName().asString()));
        C2668g.a(identifier, "Name.identifier(JvmAbi.s…terName(name.asString()))");
        function1 = ((Iterable) function1.invoke(identifier)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!function1.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) function1.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() != 1) {
                continue;
            } else {
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType == null) {
                    continue;
                } else if (KotlinBuiltIns.isUnit(returnType)) {
                    KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                    List valueParameters = simpleFunctionDescriptor2.getValueParameters();
                    C2668g.a(valueParameters, "descriptor.valueParameters");
                    Object j = C19299w.m68836j(valueParameters);
                    C2668g.a(j, "descriptor.valueParameters.single()");
                    if (kotlinTypeChecker.equalTypes(((ValueParameterDescriptor) j).getType(), propertyDescriptor.getType())) {
                        simpleFunctionDescriptor = simpleFunctionDescriptor2;
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final boolean doesClassOverridesProperty(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        boolean z = false;
        if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor findGetterOverride = findGetterOverride(propertyDescriptor, function1);
        function1 = findSetterOverride(propertyDescriptor, function1);
        if (findGetterOverride == null) {
            return false;
        }
        if (propertyDescriptor.isVar() == null) {
            return true;
        }
        if (function1 != null && function1.getModality() == findGetterOverride.getModality()) {
            z = true;
        }
        return z;
    }

    protected void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name) {
        C2668g.b(collection, "result");
        C2668g.b(name, "name");
        Set functionsFromSupertypes = getFunctionsFromSupertypes(name);
        if (BuiltinMethodsWithDifferentJvmName.INSTANCE.getSameAsRenamedInJvmBuiltin(name) || BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            SmartSet create = SmartSet.Companion.create();
            Collection resolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, functionsFromSupertypes, C17554o.m64195a(), getOwnerDescriptor(), ErrorReporter.DO_NOTHING);
            C2668g.a(resolveOverridesForNonStaticMembers, "mergedFunctionFromSuperTypes");
            LazyJavaClassMemberScope lazyJavaClassMemberScope = this;
            Name name2 = name;
            Collection<SimpleFunctionDescriptor> collection2 = collection;
            Collection collection3 = resolveOverridesForNonStaticMembers;
            addOverriddenBuiltinMethods(name2, collection2, collection3, collection, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$2(lazyJavaClassMemberScope));
            addOverriddenBuiltinMethods(name2, collection2, collection3, create, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(lazyJavaClassMemberScope));
            resolveOverridesForNonStaticMembers = new ArrayList();
            for (Object next : functionsFromSupertypes) {
                if (isVisibleAsFunctionInCurrentClass((SimpleFunctionDescriptor) next)) {
                    resolveOverridesForNonStaticMembers.add(next);
                }
            }
            addFunctionFromSupertypes(collection, name, C19299w.m68809b((Collection) (List) resolveOverridesForNonStaticMembers, (Iterable) create), true);
            return;
        }
        Collection arrayList = new ArrayList();
        for (Object next2 : functionsFromSupertypes) {
            if (isVisibleAsFunctionInCurrentClass((SimpleFunctionDescriptor) next2)) {
                arrayList.add(next2);
            }
        }
        addFunctionFromSupertypes(collection, name, (List) arrayList, false);
    }

    private final void addFunctionFromSupertypes(Collection<SimpleFunctionDescriptor> collection, Name name, Collection<? extends SimpleFunctionDescriptor> collection2, boolean z) {
        name = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, collection2, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter());
        if (z) {
            C2668g.a(name, "additionalOverrides");
            Iterable<Object> iterable = (Iterable) name;
            collection2 = C19299w.m68809b((Collection) collection, (Iterable) iterable);
            Collection collection3 = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (Object obj : iterable) {
                Object obj2;
                SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenSpecialBuiltin((CallableMemberDescriptor) obj2);
                if (simpleFunctionDescriptor != null) {
                    C2668g.a(obj2, "resolvedOverride");
                    obj2 = createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(obj2, simpleFunctionDescriptor, collection2);
                }
                collection3.add(obj2);
            }
            collection.addAll((List) collection3);
            return;
        }
        C2668g.a(name, "additionalOverrides");
        collection.addAll(name);
    }

    private final void addOverriddenBuiltinMethods(Name name, Collection<? extends SimpleFunctionDescriptor> collection, Collection<? extends SimpleFunctionDescriptor> collection2, Collection<SimpleFunctionDescriptor> collection3, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (SimpleFunctionDescriptor overriddenBuiltinWithDifferentJvmName : collection2) {
            SimpleFunctionDescriptor overriddenBuiltinWithDifferentJvmName2 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(overriddenBuiltinWithDifferentJvmName2);
            if (overriddenBuiltinWithDifferentJvmName2 != null) {
                String jvmMethodNameIfSpecial = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(overriddenBuiltinWithDifferentJvmName2);
                if (jvmMethodNameIfSpecial == null) {
                    C2668g.a();
                }
                Name identifier = Name.identifier(jvmMethodNameIfSpecial);
                C2668g.a(identifier, "Name.identifier(nameInJava)");
                for (SimpleFunctionDescriptor createRenamedCopy : (Collection) function1.invoke(identifier)) {
                    SimpleFunctionDescriptor createRenamedCopy2 = createRenamedCopy(createRenamedCopy2, name);
                    if (doesOverrideRenamedDescriptor(overriddenBuiltinWithDifferentJvmName2, createRenamedCopy2)) {
                        collection3.add(createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(createRenamedCopy2, overriddenBuiltinWithDifferentJvmName2, collection));
                        break;
                    }
                }
            }
        }
        for (SimpleFunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava : collection2) {
            collection2 = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(overriddenBuiltinFunctionWithErasedValueParametersInJava);
            if (collection2 != null) {
                SimpleFunctionDescriptor createOverrideForBuiltinFunctionWithErasedParameterIfNeeded = createOverrideForBuiltinFunctionWithErasedParameterIfNeeded(collection2, function1);
                if (createOverrideForBuiltinFunctionWithErasedParameterIfNeeded != null && isVisibleAsFunctionInCurrentClass(createOverrideForBuiltinFunctionWithErasedParameterIfNeeded)) {
                    collection3.add(createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(createOverrideForBuiltinFunctionWithErasedParameterIfNeeded, (CallableDescriptor) collection2, collection));
                }
            }
        }
    }

    private final SimpleFunctionDescriptor createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor, CallableDescriptor callableDescriptor, Collection<? extends SimpleFunctionDescriptor> collection) {
        Iterable<SimpleFunctionDescriptor> iterable = collection;
        int i = 1;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : iterable) {
                Object obj;
                if ((C2668g.a(simpleFunctionDescriptor, simpleFunctionDescriptor2) ^ 1) != 0 && simpleFunctionDescriptor2.getInitialSignatureDescriptor() == null && doesOverride(simpleFunctionDescriptor2, callableDescriptor)) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    i = 0;
                    break;
                }
            }
        }
        if (i != 0) {
            return simpleFunctionDescriptor;
        }
        simpleFunctionDescriptor = simpleFunctionDescriptor.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
        if (simpleFunctionDescriptor == null) {
            C2668g.a();
        }
        return simpleFunctionDescriptor;
    }

    private final SimpleFunctionDescriptor createOverrideForBuiltinFunctionWithErasedParameterIfNeeded(FunctionDescriptor functionDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        Name name = functionDescriptor.getName();
        C2668g.a(name, "overridden.name");
        for (Object next : (Iterable) function1.invoke(name)) {
            if (hasSameJvmDescriptorButDoesNotOverride((SimpleFunctionDescriptor) next, functionDescriptor)) {
                break;
            }
        }
        Object next2 = null;
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) next2;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        function1 = simpleFunctionDescriptor.newCopyBuilder();
        List valueParameters = functionDescriptor.getValueParameters();
        C2668g.a(valueParameters, "overridden.valueParameters");
        Iterable<ValueParameterDescriptor> iterable = valueParameters;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (ValueParameterDescriptor valueParameterDescriptor : iterable) {
            C2668g.a(valueParameterDescriptor, "it");
            KotlinType type = valueParameterDescriptor.getType();
            C2668g.a(type, "it.type");
            arrayList.add(new ValueParameterData(type, valueParameterDescriptor.declaresDefaultValue()));
        }
        arrayList = (List) arrayList;
        List valueParameters2 = simpleFunctionDescriptor.getValueParameters();
        C2668g.a(valueParameters2, "override.valueParameters");
        function1.setValueParameters(UtilKt.copyValueParameters(arrayList, valueParameters2, functionDescriptor));
        function1.setSignatureChange();
        function1.setPreserveSourceElement();
        return (SimpleFunctionDescriptor) function1.build();
    }

    private final Set<SimpleFunctionDescriptor> getFunctionsFromSupertypes(Name name) {
        TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        C2668g.a(typeConstructor, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        C2668g.a(supertypes, "ownerDescriptor.typeConstructor.supertypes");
        Collection linkedHashSet = new LinkedHashSet();
        for (KotlinType memberScope : supertypes) {
            C19291t.m68635a(linkedHashSet, (Iterable) memberScope.getMemberScope().getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return (Set) linkedHashSet;
    }

    protected void computeNonDeclaredProperties(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
        C2668g.b(name, "name");
        C2668g.b(collection, "result");
        if (this.jClass.isAnnotationType()) {
            computeAnnotationProperties(name, collection);
        }
        Set propertiesFromSupertypes = getPropertiesFromSupertypes(name);
        if (!propertiesFromSupertypes.isEmpty()) {
            SmartSet create = SmartSet.Companion.create();
            addPropertyOverrideByMethod(propertiesFromSupertypes, collection, new LazyJavaClassMemberScope$computeNonDeclaredProperties$1(this));
            addPropertyOverrideByMethod(propertiesFromSupertypes, create, new LazyJavaClassMemberScope$computeNonDeclaredProperties$2(this));
            name = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, an.m66899a(propertiesFromSupertypes, (Iterable) create), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter());
            C2668g.a(name, "resolveOverridesForNonSt…components.errorReporter)");
            collection.addAll(name);
        }
    }

    private final void addPropertyOverrideByMethod(Set<? extends PropertyDescriptor> set, Collection<PropertyDescriptor> collection, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        for (PropertyDescriptor createPropertyDescriptorByMethods : set) {
            JavaPropertyDescriptor createPropertyDescriptorByMethods2 = createPropertyDescriptorByMethods(createPropertyDescriptorByMethods, function1);
            if (createPropertyDescriptorByMethods2 != null) {
                collection.add(createPropertyDescriptorByMethods2);
                return;
            }
        }
    }

    private final void computeAnnotationProperties(Name name, Collection<PropertyDescriptor> collection) {
        JavaMethod javaMethod = (JavaMethod) C19299w.m68830g((Iterable) ((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).findMethodsByName(name));
        if (javaMethod != null) {
            collection.add(createPropertyDescriptorWithDefaultGetter$default(this, javaMethod, null, Modality.FINAL, 2, null));
        }
    }

    static /* synthetic */ JavaPropertyDescriptor createPropertyDescriptorWithDefaultGetter$default(LazyJavaClassMemberScope lazyJavaClassMemberScope, JavaMethod javaMethod, KotlinType kotlinType, Modality modality, int i, Object obj) {
        if ((i & 2) != 0) {
            kotlinType = null;
        }
        return lazyJavaClassMemberScope.createPropertyDescriptorWithDefaultGetter(javaMethod, kotlinType, modality);
    }

    private final JavaPropertyDescriptor createPropertyDescriptorWithDefaultGetter(JavaMethod javaMethod, KotlinType kotlinType, Modality modality) {
        modality = JavaPropertyDescriptor.create(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaMethod), modality, javaMethod.getVisibility(), false, javaMethod.getName(), getC().getComponents().getSourceElementFactory().source(javaMethod), false);
        PropertyGetterDescriptorImpl createDefaultGetter = DescriptorFactory.createDefaultGetter((PropertyDescriptor) modality, Annotations.Companion.getEMPTY());
        modality.initialize(createDefaultGetter, null);
        if (kotlinType == null) {
            LazyJavaResolverContext c = getC();
            C2668g.a(modality, "propertyDescriptor");
            kotlinType = computeMethodReturnType(javaMethod, ContextKt.childForMethod$default(c, (DeclarationDescriptor) modality, javaMethod, 0, 4, null));
        }
        modality.setType(kotlinType, (List) C17554o.m64195a(), getDispatchReceiverParameter(), (KotlinType) null);
        createDefaultGetter.initialize(kotlinType);
        C2668g.a(modality, "propertyDescriptor");
        return modality;
    }

    private final JavaPropertyDescriptor createPropertyDescriptorByMethods(PropertyDescriptor propertyDescriptor, Function1<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        JavaPropertyDescriptor javaPropertyDescriptor = null;
        if (!doesClassOverridesProperty(propertyDescriptor, function1)) {
            return null;
        }
        Object obj;
        KotlinType returnType;
        PropertyDescriptor propertyDescriptor2;
        PropertyGetterDescriptorImpl createGetter;
        SimpleFunctionDescriptor findGetterOverride = findGetterOverride(propertyDescriptor, function1);
        if (findGetterOverride == null) {
            C2668g.a();
        }
        if (propertyDescriptor.isVar()) {
            function1 = findSetterOverride(propertyDescriptor, function1);
            if (function1 == null) {
                C2668g.a();
            }
        } else {
            function1 = null;
        }
        if (function1 != null) {
            if (function1.getModality() != findGetterOverride.getModality()) {
                obj = null;
                if (C15819j.f49018a || r4 != null) {
                    propertyDescriptor = JavaPropertyDescriptor.create(getOwnerDescriptor(), Annotations.Companion.getEMPTY(), findGetterOverride.getModality(), findGetterOverride.getVisibility(), function1 == null, propertyDescriptor.getName(), findGetterOverride.getSource(), false);
                    returnType = findGetterOverride.getReturnType();
                    if (returnType == null) {
                        C2668g.a();
                    }
                    propertyDescriptor.setType(returnType, C17554o.m64195a(), getDispatchReceiverParameter(), (KotlinType) null);
                    propertyDescriptor2 = propertyDescriptor;
                    createGetter = DescriptorFactory.createGetter(propertyDescriptor2, findGetterOverride.getAnnotations(), false, false, false, findGetterOverride.getSource());
                    createGetter.setInitialSignatureDescriptor(findGetterOverride);
                    C2668g.a(propertyDescriptor, "propertyDescriptor");
                    createGetter.initialize(propertyDescriptor.getType());
                    if (function1 != null) {
                        javaPropertyDescriptor = DescriptorFactory.createSetter(propertyDescriptor2, function1.getAnnotations(), false, false, false, function1.getVisibility(), function1.getSource());
                        javaPropertyDescriptor.setInitialSignatureDescriptor((FunctionDescriptor) function1);
                    }
                    propertyDescriptor.initialize(createGetter, (PropertySetterDescriptor) javaPropertyDescriptor);
                    return propertyDescriptor;
                }
                Object modality;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Different accessors modalities when creating overrides for ");
                stringBuilder.append(propertyDescriptor);
                stringBuilder.append(" in ");
                stringBuilder.append(getOwnerDescriptor());
                stringBuilder.append("for getter is ");
                stringBuilder.append(findGetterOverride.getModality());
                stringBuilder.append(", but for setter is ");
                if (function1 != null) {
                    modality = function1.getModality();
                }
                stringBuilder.append(modality);
                throw ((Throwable) new AssertionError(stringBuilder.toString()));
            }
        }
        obj = 1;
        if (C15819j.f49018a) {
        }
        if (function1 == null) {
        }
        propertyDescriptor = JavaPropertyDescriptor.create(getOwnerDescriptor(), Annotations.Companion.getEMPTY(), findGetterOverride.getModality(), findGetterOverride.getVisibility(), function1 == null, propertyDescriptor.getName(), findGetterOverride.getSource(), false);
        returnType = findGetterOverride.getReturnType();
        if (returnType == null) {
            C2668g.a();
        }
        propertyDescriptor.setType(returnType, C17554o.m64195a(), getDispatchReceiverParameter(), (KotlinType) null);
        propertyDescriptor2 = propertyDescriptor;
        createGetter = DescriptorFactory.createGetter(propertyDescriptor2, findGetterOverride.getAnnotations(), false, false, false, findGetterOverride.getSource());
        createGetter.setInitialSignatureDescriptor(findGetterOverride);
        C2668g.a(propertyDescriptor, "propertyDescriptor");
        createGetter.initialize(propertyDescriptor.getType());
        if (function1 != null) {
            javaPropertyDescriptor = DescriptorFactory.createSetter(propertyDescriptor2, function1.getAnnotations(), false, false, false, function1.getVisibility(), function1.getSource());
            javaPropertyDescriptor.setInitialSignatureDescriptor((FunctionDescriptor) function1);
        }
        propertyDescriptor.initialize(createGetter, (PropertySetterDescriptor) javaPropertyDescriptor);
        return propertyDescriptor;
    }

    private final Set<PropertyDescriptor> getPropertiesFromSupertypes(Name name) {
        TypeConstructor typeConstructor = getOwnerDescriptor().getTypeConstructor();
        C2668g.a(typeConstructor, "ownerDescriptor.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        C2668g.a(supertypes, "ownerDescriptor.typeConstructor.supertypes");
        Collection arrayList = new ArrayList();
        for (KotlinType memberScope : supertypes) {
            Iterable<PropertyDescriptor> contributedVariables = memberScope.getMemberScope().getContributedVariables(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) contributedVariables, 10));
            for (PropertyDescriptor add : contributedVariables) {
                arrayList2.add(add);
            }
            C19291t.m68635a(arrayList, (Iterable) (List) arrayList2);
        }
        return C19299w.m68842n((List) arrayList);
    }

    @NotNull
    protected MethodSignatureData resolveMethodSignature(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> list2) {
        C2668g.b(javaMethod, "method");
        C2668g.b(list, "methodTypeParameters");
        C2668g.b(kotlinType, "returnType");
        C2668g.b(list2, "valueParameters");
        javaMethod = getC().getComponents().getSignaturePropagator().resolvePropagatedSignature(javaMethod, getOwnerDescriptor(), kotlinType, null, list2, list);
        C2668g.a(javaMethod, "propagated");
        KotlinType returnType = javaMethod.getReturnType();
        C2668g.a(returnType, "propagated.returnType");
        KotlinType receiverType = javaMethod.getReceiverType();
        List valueParameters = javaMethod.getValueParameters();
        C2668g.a(valueParameters, "propagated.valueParameters");
        List typeParameters = javaMethod.getTypeParameters();
        C2668g.a(typeParameters, "propagated.typeParameters");
        boolean hasStableParameterNames = javaMethod.hasStableParameterNames();
        List errors = javaMethod.getErrors();
        C2668g.a(errors, "propagated.errors");
        return new MethodSignatureData(returnType, receiverType, valueParameters, typeParameters, hasStableParameterNames, errors);
    }

    private final boolean hasSameJvmDescriptorButDoesNotOverride(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String computeJvmDescriptor = MethodSignatureMappingKt.computeJvmDescriptor(simpleFunctionDescriptor, false);
        FunctionDescriptor original = functionDescriptor.getOriginal();
        C2668g.a(original, "builtinWithErasedParameters.original");
        return C2668g.a(computeJvmDescriptor, MethodSignatureMappingKt.computeJvmDescriptor(original, false)) && doesOverride(simpleFunctionDescriptor, functionDescriptor) == null;
    }

    private final JavaClassConstructorDescriptor resolveConstructor(JavaConstructor javaConstructor) {
        ClassDescriptor ownerDescriptor = getOwnerDescriptor();
        JavaElement javaElement = javaConstructor;
        JavaClassConstructorDescriptor createJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(getC(), javaConstructor), false, getC().getComponents().getSourceElementFactory().source(javaElement));
        LazyJavaResolverContext c = getC();
        C2668g.a(createJavaConstructor, "constructorDescriptor");
        c = ContextKt.childForMethod(c, createJavaConstructor, javaConstructor, ownerDescriptor.getDeclaredTypeParameters().size());
        ResolvedValueParameters resolveValueParameters = resolveValueParameters(c, createJavaConstructor, javaConstructor.getValueParameters());
        List declaredTypeParameters = ownerDescriptor.getDeclaredTypeParameters();
        C2668g.a(declaredTypeParameters, "classDescriptor.declaredTypeParameters");
        Collection collection = declaredTypeParameters;
        Iterable<JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) typeParameters, 10));
        for (JavaTypeParameter resolveTypeParameter : typeParameters) {
            TypeParameterDescriptor resolveTypeParameter2 = c.getTypeParameterResolver().resolveTypeParameter(resolveTypeParameter);
            if (resolveTypeParameter2 == null) {
                C2668g.a();
            }
            arrayList.add(resolveTypeParameter2);
        }
        createJavaConstructor.initialize(resolveValueParameters.getDescriptors(), javaConstructor.getVisibility(), C19299w.m68809b(collection, (Iterable) (List) arrayList));
        createJavaConstructor.setHasStableParameterNames(false);
        createJavaConstructor.setHasSynthesizedParameterNames(resolveValueParameters.getHasSynthesizedNames());
        createJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        c.getComponents().getJavaResolverCache().recordConstructor(javaElement, createJavaConstructor);
        return createJavaConstructor;
    }

    private final ClassConstructorDescriptor createDefaultConstructor() {
        boolean isAnnotationType = this.jClass.isAnnotationType();
        if (this.jClass.isInterface() && !isAnnotationType) {
            return null;
        }
        List createAnnotationConstructorParameters;
        ClassDescriptor ownerDescriptor = getOwnerDescriptor();
        JavaClassConstructorDescriptor createJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, Annotations.Companion.getEMPTY(), true, getC().getComponents().getSourceElementFactory().source(this.jClass));
        if (isAnnotationType) {
            C2668g.a(createJavaConstructor, "constructorDescriptor");
            createAnnotationConstructorParameters = createAnnotationConstructorParameters(createJavaConstructor);
        } else {
            createAnnotationConstructorParameters = Collections.emptyList();
        }
        createJavaConstructor.setHasSynthesizedParameterNames(false);
        createJavaConstructor.initialize(createAnnotationConstructorParameters, getConstructorVisibility(ownerDescriptor));
        createJavaConstructor.setHasStableParameterNames(true);
        C2668g.a(createJavaConstructor, "constructorDescriptor");
        createJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        getC().getComponents().getJavaResolverCache().recordConstructor(this.jClass, createJavaConstructor);
        return createJavaConstructor;
    }

    private final Visibility getConstructorVisibility(ClassDescriptor classDescriptor) {
        classDescriptor = classDescriptor.getVisibility();
        if (C2668g.a(classDescriptor, JavaVisibilities.PROTECTED_STATIC_VISIBILITY)) {
            classDescriptor = JavaVisibilities.PROTECTED_AND_PACKAGE;
            C2668g.a(classDescriptor, "JavaVisibilities.PROTECTED_AND_PACKAGE");
            return classDescriptor;
        }
        C2668g.a(classDescriptor, "visibility");
        return classDescriptor;
    }

    private final List<ValueParameterDescriptor> createAnnotationConstructorParameters(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        Collection methods = this.jClass.getMethods();
        ArrayList arrayList = new ArrayList(methods.size());
        JavaTypeAttributes toAttributes$default = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, true, null, 2, null);
        Iterable iterable = methods;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : iterable) {
            if (C2668g.a(((JavaMethod) next).getName(), JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list = (List) pair.m59805c();
        List<JavaMethod> list2 = (List) pair.m59806d();
        int i = 0;
        Object obj = list.size() <= 1 ? 1 : null;
        if (C15819j.f49018a && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("There can't be more than one method named 'value' in annotation class: ");
            stringBuilder.append(r7.jClass);
            throw new AssertionError(stringBuilder.toString());
        }
        JavaMethod javaMethod = (JavaMethod) C19299w.m68831g(list);
        if (javaMethod != null) {
            Pair pair2;
            JavaType returnType = javaMethod.getReturnType();
            if (returnType instanceof JavaArrayType) {
                JavaArrayType javaArrayType = (JavaArrayType) returnType;
                pair2 = new Pair(getC().getTypeResolver().transformArrayType(javaArrayType, toAttributes$default, true), getC().getTypeResolver().transformJavaType(javaArrayType.getComponentType(), toAttributes$default));
            } else {
                pair2 = new Pair(getC().getTypeResolver().transformJavaType(returnType, toAttributes$default), null);
            }
            addAnnotationValueParameter(arrayList, classConstructorDescriptorImpl, 0, javaMethod, (KotlinType) pair2.m59805c(), (KotlinType) pair2.m59806d());
        }
        int i2 = javaMethod != null ? 1 : 0;
        for (JavaMethod javaMethod2 : list2) {
            addAnnotationValueParameter(arrayList, classConstructorDescriptorImpl, i + i2, javaMethod2, getC().getTypeResolver().transformJavaType(javaMethod2.getReturnType(), toAttributes$default), null);
            i++;
        }
        return arrayList;
    }

    private final void addAnnotationValueParameter(@NotNull List<ValueParameterDescriptor> list, ConstructorDescriptor constructorDescriptor, int i, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        CallableDescriptor callableDescriptor = constructorDescriptor;
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = javaMethod.getName();
        KotlinType makeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        C2668g.a(makeNotNullable, "TypeUtils.makeNotNullable(returnType)");
        list.add(new ValueParameterDescriptorImpl(callableDescriptor, null, i, empty, name, makeNotNullable, javaMethod.getHasAnnotationParameterDefaultValue(), false, false, kotlinType2 != null ? TypeUtils.makeNotNullable(kotlinType2) : null, getC().getComponents().getSourceElementFactory().source(javaMethod)));
    }

    @Nullable
    protected ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return DescriptorUtils.getDispatchReceiverParameterIfNeeded(getOwnerDescriptor());
    }

    @Nullable
    public ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        recordLookup(name, lookupLocation);
        return (ClassifierDescriptor) this.nestedClasses.invoke(name);
    }

    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        recordLookup(name, lookupLocation);
        return super.getContributedFunctions(name, lookupLocation);
    }

    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        recordLookup(name, lookupLocation);
        return super.getContributedVariables(name, lookupLocation);
    }

    @NotNull
    protected Set<Name> computeClassNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        return an.m66899a((Set) this.nestedClassIndex.invoke(), (Iterable) ((Map) this.enumEntryIndex.invoke()).keySet());
    }

    @NotNull
    protected Set<Name> computePropertyNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        if (this.jClass.isAnnotationType() != null) {
            return getFunctionNames();
        }
        descriptorKindFilter = new LinkedHashSet(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getFieldNames());
        function1 = getOwnerDescriptor().getTypeConstructor();
        C2668g.a(function1, "ownerDescriptor.typeConstructor");
        function1 = function1.getSupertypes();
        C2668g.a(function1, "ownerDescriptor.typeConstructor.supertypes");
        for (KotlinType memberScope : (Iterable) function1) {
            C19291t.m68635a((Collection) descriptorKindFilter, (Iterable) memberScope.getMemberScope().getVariableNames());
        }
        return (Set) ((Collection) descriptorKindFilter);
    }

    public void recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, getOwnerDescriptor(), name);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lazy Java member scope for ");
        stringBuilder.append(this.jClass.getFqName());
        return stringBuilder.toString();
    }
}
