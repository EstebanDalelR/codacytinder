package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C15811g;
import kotlin.Pair;
import kotlin.collections.C15808y;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.NonExtensions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class LazyJavaScope extends MemberScopeImpl {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    private final NotNullLazyValue<Collection<DeclarationDescriptor>> allDescriptors = this.f59340c.getStorageManager().createRecursionTolerantLazyValue(new LazyJavaScope$allDescriptors$1(this), C17554o.m64195a());
    @NotNull
    /* renamed from: c */
    private final LazyJavaResolverContext f59340c;
    private final NotNullLazyValue classNamesLazy$delegate = this.f59340c.getStorageManager().createLazyValue(new LazyJavaScope$classNamesLazy$2(this));
    @NotNull
    private final NotNullLazyValue<DeclaredMemberIndex> declaredMemberIndex = this.f59340c.getStorageManager().createLazyValue(new LazyJavaScope$declaredMemberIndex$1(this));
    private final NotNullLazyValue functionNamesLazy$delegate = this.f59340c.getStorageManager().createLazyValue(new LazyJavaScope$functionNamesLazy$2(this));
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> functions = this.f59340c.getStorageManager().createMemoizedFunction(new LazyJavaScope$functions$1(this));
    private final MemoizedFunctionToNotNull<Name, List<PropertyDescriptor>> properties = this.f59340c.getStorageManager().createMemoizedFunction(new LazyJavaScope$properties$1(this));
    private final NotNullLazyValue propertyNamesLazy$delegate = this.f59340c.getStorageManager().createLazyValue(new LazyJavaScope$propertyNamesLazy$2(this));

    protected static final class MethodSignatureData {
        @NotNull
        private final List<String> errors;
        private final boolean hasStableParameterNames;
        @Nullable
        private final KotlinType receiverType;
        @NotNull
        private final KotlinType returnType;
        @NotNull
        private final List<TypeParameterDescriptor> typeParameters;
        @NotNull
        private final List<ValueParameterDescriptor> valueParameters;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MethodSignatureData) {
                MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
                if (C2668g.a(this.returnType, methodSignatureData.returnType) && C2668g.a(this.receiverType, methodSignatureData.receiverType) && C2668g.a(this.valueParameters, methodSignatureData.valueParameters) && C2668g.a(this.typeParameters, methodSignatureData.typeParameters)) {
                    return (this.hasStableParameterNames == methodSignatureData.hasStableParameterNames ? 1 : null) != null && C2668g.a(this.errors, methodSignatureData.errors);
                }
            }
        }

        public int hashCode() {
            KotlinType kotlinType = this.returnType;
            int i = 0;
            int hashCode = (kotlinType != null ? kotlinType.hashCode() : 0) * 31;
            KotlinType kotlinType2 = this.receiverType;
            hashCode = (hashCode + (kotlinType2 != null ? kotlinType2.hashCode() : 0)) * 31;
            List list = this.valueParameters;
            hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            list = this.typeParameters;
            hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            int i2 = this.hasStableParameterNames;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (hashCode + i2) * 31;
            list = this.errors;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MethodSignatureData(returnType=");
            stringBuilder.append(this.returnType);
            stringBuilder.append(", receiverType=");
            stringBuilder.append(this.receiverType);
            stringBuilder.append(", valueParameters=");
            stringBuilder.append(this.valueParameters);
            stringBuilder.append(", typeParameters=");
            stringBuilder.append(this.typeParameters);
            stringBuilder.append(", hasStableParameterNames=");
            stringBuilder.append(this.hasStableParameterNames);
            stringBuilder.append(", errors=");
            stringBuilder.append(this.errors);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public MethodSignatureData(@NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull List<? extends ValueParameterDescriptor> list, @NotNull List<? extends TypeParameterDescriptor> list2, boolean z, @NotNull List<String> list3) {
            C2668g.b(kotlinType, "returnType");
            C2668g.b(list, "valueParameters");
            C2668g.b(list2, "typeParameters");
            C2668g.b(list3, "errors");
            this.returnType = kotlinType;
            this.receiverType = kotlinType2;
            this.valueParameters = list;
            this.typeParameters = list2;
            this.hasStableParameterNames = z;
            this.errors = list3;
        }

        @NotNull
        public final KotlinType getReturnType() {
            return this.returnType;
        }

        @Nullable
        public final KotlinType getReceiverType() {
            return this.receiverType;
        }

        @NotNull
        public final List<ValueParameterDescriptor> getValueParameters() {
            return this.valueParameters;
        }

        @NotNull
        public final List<TypeParameterDescriptor> getTypeParameters() {
            return this.typeParameters;
        }

        public final boolean getHasStableParameterNames() {
            return this.hasStableParameterNames;
        }

        @NotNull
        public final List<String> getErrors() {
            return this.errors;
        }
    }

    protected static final class ResolvedValueParameters {
        @NotNull
        private final List<ValueParameterDescriptor> descriptors;
        private final boolean hasSynthesizedNames;

        public ResolvedValueParameters(@NotNull List<? extends ValueParameterDescriptor> list, boolean z) {
            C2668g.b(list, "descriptors");
            this.descriptors = list;
            this.hasSynthesizedNames = z;
        }

        @NotNull
        public final List<ValueParameterDescriptor> getDescriptors() {
            return this.descriptors;
        }

        public final boolean getHasSynthesizedNames() {
            return this.hasSynthesizedNames;
        }
    }

    private final Set<Name> getFunctionNamesLazy() {
        return (Set) StorageKt.getValue(this.functionNamesLazy$delegate, (Object) this, $$delegatedProperties[0]);
    }

    private final Set<Name> getPropertyNamesLazy() {
        return (Set) StorageKt.getValue(this.propertyNamesLazy$delegate, (Object) this, $$delegatedProperties[1]);
    }

    @NotNull
    protected abstract Set<Name> computeClassNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @NotNull
    protected abstract Set<Name> computeFunctionNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @NotNull
    protected abstract DeclaredMemberIndex computeMemberIndex();

    protected abstract void computeNonDeclaredFunctions(@NotNull Collection<SimpleFunctionDescriptor> collection, @NotNull Name name);

    protected abstract void computeNonDeclaredProperties(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection);

    @NotNull
    protected abstract Set<Name> computePropertyNames(@NotNull DescriptorKindFilter descriptorKindFilter, @Nullable Function1<? super Name, Boolean> function1);

    @Nullable
    protected abstract ReceiverParameterDescriptor getDispatchReceiverParameter();

    @NotNull
    protected abstract DeclarationDescriptor getOwnerDescriptor();

    protected boolean isVisibleAsFunction(@NotNull JavaMethodDescriptor javaMethodDescriptor) {
        C2668g.b(javaMethodDescriptor, "$receiver");
        return true;
    }

    @NotNull
    protected abstract MethodSignatureData resolveMethodSignature(@NotNull JavaMethod javaMethod, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> list2);

    public LazyJavaScope(@NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        C2668g.b(lazyJavaResolverContext, "c");
        this.f59340c = lazyJavaResolverContext;
    }

    @NotNull
    protected final LazyJavaResolverContext getC() {
        return this.f59340c;
    }

    @NotNull
    protected final NotNullLazyValue<DeclaredMemberIndex> getDeclaredMemberIndex() {
        return this.declaredMemberIndex;
    }

    @NotNull
    protected final JavaMethodDescriptor resolveMethodToFunctionDescriptor(@NotNull JavaMethod javaMethod) {
        C2668g.b(javaMethod, "method");
        JavaMethodDescriptor createJavaMethod = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(this.f59340c, javaMethod), javaMethod.getName(), this.f59340c.getComponents().getSourceElementFactory().source(javaMethod));
        LazyJavaResolverContext lazyJavaResolverContext = this.f59340c;
        C2668g.a(createJavaMethod, "functionDescriptorImpl");
        lazyJavaResolverContext = ContextKt.childForMethod$default(lazyJavaResolverContext, createJavaMethod, javaMethod, 0, 4, null);
        Iterable<JavaTypeParameter> typeParameters = javaMethod.getTypeParameters();
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) typeParameters, 10));
        for (JavaTypeParameter resolveTypeParameter : typeParameters) {
            TypeParameterDescriptor resolveTypeParameter2 = lazyJavaResolverContext.getTypeParameterResolver().resolveTypeParameter(resolveTypeParameter);
            if (resolveTypeParameter2 == null) {
                C2668g.a();
            }
            arrayList.add(resolveTypeParameter2);
        }
        List list = (List) arrayList;
        ResolvedValueParameters resolveValueParameters = resolveValueParameters(lazyJavaResolverContext, createJavaMethod, javaMethod.getValueParameters());
        MethodSignatureData resolveMethodSignature = resolveMethodSignature(javaMethod, list, computeMethodReturnType(javaMethod, lazyJavaResolverContext), resolveValueParameters.getDescriptors());
        KotlinType receiverType = resolveMethodSignature.getReceiverType();
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        List typeParameters2 = resolveMethodSignature.getTypeParameters();
        List valueParameters = resolveMethodSignature.getValueParameters();
        KotlinType returnType = resolveMethodSignature.getReturnType();
        Modality convertFromFlags = Modality.Companion.convertFromFlags(javaMethod.isAbstract(), javaMethod.isFinal() ^ 1);
        Visibility visibility = javaMethod.getVisibility();
        if (resolveMethodSignature.getReceiverType() != null) {
            javaMethod = ag.m64174a((Pair) C15811g.m59834a(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, C19299w.m68829f(resolveValueParameters.getDescriptors())));
        } else {
            javaMethod = ah.m66884a();
        }
        createJavaMethod.initialize(receiverType, dispatchReceiverParameter, typeParameters2, valueParameters, returnType, convertFromFlags, visibility, javaMethod);
        createJavaMethod.setParameterNamesStatus(resolveMethodSignature.getHasStableParameterNames(), resolveValueParameters.getHasSynthesizedNames());
        if ((resolveMethodSignature.getErrors().isEmpty() ^ 1) != null) {
            lazyJavaResolverContext.getComponents().getSignaturePropagator().reportSignatureErrors(createJavaMethod, resolveMethodSignature.getErrors());
        }
        return createJavaMethod;
    }

    @NotNull
    protected final KotlinType computeMethodReturnType(@NotNull JavaMethod javaMethod, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        C2668g.b(javaMethod, "method");
        C2668g.b(lazyJavaResolverContext, "c");
        return lazyJavaResolverContext.getTypeResolver().transformJavaType(javaMethod.getReturnType(), JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, javaMethod.getContainingClass().isAnnotationType(), null, 2, null));
    }

    @NotNull
    protected final ResolvedValueParameters resolveValueParameters(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull FunctionDescriptor functionDescriptor, @NotNull List<? extends JavaValueParameter> list) {
        LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaResolverContext;
        FunctionDescriptor functionDescriptor2 = functionDescriptor;
        List<? extends JavaValueParameter> list2 = list;
        C2668g.b(lazyJavaResolverContext2, "c");
        C2668g.b(functionDescriptor2, "function");
        C2668g.b(list2, "jValueParameters");
        Set linkedHashSet = new LinkedHashSet();
        Iterable<C15808y> o = C19299w.m68843o(list2);
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) o, 10));
        boolean z = false;
        boolean z2 = false;
        for (C15808y c15808y : o) {
            String str;
            boolean z3;
            Pair a;
            JavaType type;
            JavaArrayType javaArrayType;
            KotlinType kotlinType;
            KotlinType kotlinType2;
            Name identifier;
            CallableDescriptor callableDescriptor;
            KotlinType kotlinType3;
            Name name;
            ValueParameterDescriptorImpl valueParameterDescriptorImpl;
            ValueParameterDescriptorImpl valueParameterDescriptorImpl2;
            int c = c15808y.m59830c();
            JavaValueParameter javaValueParameter = (JavaValueParameter) c15808y.m59831d();
            Annotations resolveAnnotations = LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext2, javaValueParameter);
            TypeParameterDescriptor typeParameterDescriptor = null;
            JavaTypeAttributes toAttributes$default = JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, z, null, 3, null);
            FqName fqName = JvmAnnotationNames.PARAMETER_NAME_FQ_NAME;
            C2668g.a(fqName, "JvmAnnotationNames.PARAMETER_NAME_FQ_NAME");
            AnnotationDescriptor findAnnotation = resolveAnnotations.findAnnotation(fqName);
            if (findAnnotation != null) {
                ConstantValue firstArgument = DescriptorUtilsKt.firstArgument(findAnnotation);
                if (firstArgument != null) {
                    if (!(firstArgument instanceof StringValue)) {
                        firstArgument = null;
                    }
                    StringValue stringValue = (StringValue) firstArgument;
                    if (stringValue != null) {
                        str = (String) stringValue.getValue();
                        z3 = true;
                        if (javaValueParameter.isVararg()) {
                            a = C15811g.m59834a(lazyJavaResolverContext.getTypeResolver().transformJavaType(javaValueParameter.getType(), toAttributes$default), null);
                        } else {
                            type = javaValueParameter.getType();
                            if (!(type instanceof JavaArrayType)) {
                                typeParameterDescriptor = type;
                            }
                            javaArrayType = (JavaArrayType) typeParameterDescriptor;
                            if (javaArrayType == null) {
                                KotlinType transformArrayType = lazyJavaResolverContext.getTypeResolver().transformArrayType(javaArrayType, toAttributes$default, true);
                                a = C15811g.m59834a(transformArrayType, lazyJavaResolverContext.getModule().getBuiltIns().getArrayElementType(transformArrayType));
                            } else {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Vararg parameter should be an array: ");
                                stringBuilder.append(javaValueParameter);
                                throw new AssertionError(stringBuilder.toString());
                            }
                        }
                        kotlinType = (KotlinType) a.m59805c();
                        kotlinType2 = (KotlinType) a.m59806d();
                        if (!C2668g.a(functionDescriptor.getName().asString(), "equals") && list.size() == 1 && C2668g.a(lazyJavaResolverContext.getModule().getBuiltIns().getNullableAnyType(), kotlinType)) {
                            identifier = Name.identifier("other");
                        } else {
                            if (str != null) {
                                if ((((CharSequence) str).length() <= 0 ? 1 : null) != null && linkedHashSet.add(str)) {
                                    identifier = Name.identifier(str);
                                }
                            }
                            identifier = javaValueParameter.getName();
                            if (identifier == null) {
                                z3 = z2;
                            }
                            if (identifier == null) {
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append('p');
                                stringBuilder2.append(c);
                                identifier = Name.identifier(stringBuilder2.toString());
                            }
                            z2 = z3;
                        }
                        callableDescriptor = functionDescriptor2;
                        C2668g.a(identifier, "name");
                        kotlinType3 = kotlinType;
                        name = identifier;
                        valueParameterDescriptorImpl = valueParameterDescriptorImpl2;
                        valueParameterDescriptorImpl2 = new ValueParameterDescriptorImpl(callableDescriptor, null, c, resolveAnnotations, name, kotlinType3, false, false, false, kotlinType2, lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaValueParameter));
                        arrayList.add(valueParameterDescriptorImpl);
                        z = false;
                    }
                }
            }
            str = null;
            z3 = true;
            if (javaValueParameter.isVararg()) {
                a = C15811g.m59834a(lazyJavaResolverContext.getTypeResolver().transformJavaType(javaValueParameter.getType(), toAttributes$default), null);
            } else {
                type = javaValueParameter.getType();
                if (!(type instanceof JavaArrayType)) {
                    typeParameterDescriptor = type;
                }
                javaArrayType = (JavaArrayType) typeParameterDescriptor;
                if (javaArrayType == null) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Vararg parameter should be an array: ");
                    stringBuilder3.append(javaValueParameter);
                    throw new AssertionError(stringBuilder3.toString());
                }
                KotlinType transformArrayType2 = lazyJavaResolverContext.getTypeResolver().transformArrayType(javaArrayType, toAttributes$default, true);
                a = C15811g.m59834a(transformArrayType2, lazyJavaResolverContext.getModule().getBuiltIns().getArrayElementType(transformArrayType2));
            }
            kotlinType = (KotlinType) a.m59805c();
            kotlinType2 = (KotlinType) a.m59806d();
            if (!C2668g.a(functionDescriptor.getName().asString(), "equals")) {
            }
            if (str != null) {
                if (((CharSequence) str).length() <= 0) {
                }
                identifier = Name.identifier(str);
                callableDescriptor = functionDescriptor2;
                C2668g.a(identifier, "name");
                kotlinType3 = kotlinType;
                name = identifier;
                valueParameterDescriptorImpl = valueParameterDescriptorImpl2;
                valueParameterDescriptorImpl2 = new ValueParameterDescriptorImpl(callableDescriptor, null, c, resolveAnnotations, name, kotlinType3, false, false, false, kotlinType2, lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaValueParameter));
                arrayList.add(valueParameterDescriptorImpl);
                z = false;
            }
            identifier = javaValueParameter.getName();
            if (identifier == null) {
                z3 = z2;
            }
            if (identifier == null) {
                StringBuilder stringBuilder22 = new StringBuilder();
                stringBuilder22.append('p');
                stringBuilder22.append(c);
                identifier = Name.identifier(stringBuilder22.toString());
            }
            z2 = z3;
            callableDescriptor = functionDescriptor2;
            C2668g.a(identifier, "name");
            kotlinType3 = kotlinType;
            name = identifier;
            valueParameterDescriptorImpl = valueParameterDescriptorImpl2;
            valueParameterDescriptorImpl2 = new ValueParameterDescriptorImpl(callableDescriptor, null, c, resolveAnnotations, name, kotlinType3, false, false, false, kotlinType2, lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaValueParameter));
            arrayList.add(valueParameterDescriptorImpl);
            z = false;
        }
        return new ResolvedValueParameters(C19299w.m68840l((List) arrayList), z2);
    }

    @NotNull
    public Set<Name> getFunctionNames() {
        return getFunctionNamesLazy();
    }

    @NotNull
    public Set<Name> getVariableNames() {
        return getPropertyNamesLazy();
    }

    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        if (getFunctionNames().contains(name) == null) {
            return C17554o.m64195a();
        }
        return (Collection) this.functions.invoke(name);
    }

    private final PropertyDescriptor resolveProperty(JavaField javaField) {
        PropertyDescriptorImpl createPropertyDescriptor = createPropertyDescriptor(javaField);
        createPropertyDescriptor.initialize(null, null);
        createPropertyDescriptor.setType(getPropertyType(javaField), C17554o.m64195a(), getDispatchReceiverParameter(), (KotlinType) null);
        if (DescriptorUtils.shouldRecordInitializerForProperty(createPropertyDescriptor, createPropertyDescriptor.getType())) {
            createPropertyDescriptor.setCompileTimeInitializer(this.f59340c.getStorageManager().createNullableLazyValue(new LazyJavaScope$resolveProperty$1(this, javaField, createPropertyDescriptor)));
        }
        PropertyDescriptor propertyDescriptor = createPropertyDescriptor;
        this.f59340c.getComponents().getJavaResolverCache().recordField(javaField, propertyDescriptor);
        return propertyDescriptor;
    }

    private final PropertyDescriptorImpl createPropertyDescriptor(JavaField javaField) {
        boolean isFinal = javaField.isFinal() ^ 1;
        javaField = JavaPropertyDescriptor.create(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(this.f59340c, javaField), Modality.FINAL, javaField.getVisibility(), isFinal, javaField.getName(), this.f59340c.getComponents().getSourceElementFactory().source(javaField), isFinalStatic(javaField));
        C2668g.a(javaField, "JavaPropertyDescriptor.c…d.isFinalStatic\n        )");
        return (PropertyDescriptorImpl) javaField;
    }

    private final boolean isFinalStatic(@NotNull JavaField javaField) {
        return (!javaField.isFinal() || javaField.isStatic() == null) ? null : true;
    }

    private final KotlinType getPropertyType(JavaField javaField) {
        boolean z = false;
        KotlinType transformJavaType = this.f59340c.getTypeResolver().transformJavaType(javaField.getType(), JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null));
        if ((KotlinBuiltIns.isPrimitiveType(transformJavaType) || KotlinBuiltIns.isString(transformJavaType)) && isFinalStatic(javaField) && javaField.getHasConstantNotNullInitializer() != null) {
            z = true;
        }
        if (!z) {
            return transformJavaType;
        }
        javaField = TypeUtils.makeNotNullable(transformJavaType);
        C2668g.a(javaField, "TypeUtils.makeNotNullable(propertyType)");
        return javaField;
    }

    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        if (getVariableNames().contains(name) == null) {
            return C17554o.m64195a();
        }
        return (Collection) this.properties.invoke(name);
    }

    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        C2668g.b(function1, "nameFilter");
        return (Collection) this.allDescriptors.invoke();
    }

    @NotNull
    protected final List<DeclarationDescriptor> computeDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1, @NotNull LookupLocation lookupLocation) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        C2668g.b(function1, "nameFilter");
        C2668g.b(lookupLocation, "location");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
            for (Name name : computeClassNames(descriptorKindFilter, function1)) {
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    CollectionsKt.addIfNotNull(linkedHashSet, getContributedClassifier(name, lookupLocation));
                }
            }
        }
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !descriptorKindFilter.getExcludes().contains(NonExtensions.INSTANCE)) {
            for (Name name2 : computeFunctionNames(descriptorKindFilter, function1)) {
                if (((Boolean) function1.invoke(name2)).booleanValue()) {
                    linkedHashSet.addAll(getContributedFunctions(name2, lookupLocation));
                }
            }
        }
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !descriptorKindFilter.getExcludes().contains(NonExtensions.INSTANCE)) {
            for (Name name3 : computePropertyNames(descriptorKindFilter, function1)) {
                if (((Boolean) function1.invoke(name3)).booleanValue()) {
                    linkedHashSet.addAll(getContributedVariables(name3, lookupLocation));
                }
            }
        }
        return C19299w.m68840l(linkedHashSet);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lazy scope for ");
        stringBuilder.append(getOwnerDescriptor());
        return stringBuilder.toString();
    }
}
