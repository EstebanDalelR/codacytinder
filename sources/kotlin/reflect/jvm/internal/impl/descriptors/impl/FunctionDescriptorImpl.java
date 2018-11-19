package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class FunctionDescriptorImpl extends DeclarationDescriptorNonRootImpl implements FunctionDescriptor {
    private ReceiverParameterDescriptor dispatchReceiverParameter;
    private ReceiverParameterDescriptor extensionReceiverParameter;
    private boolean hasStableParameterNames = true;
    private boolean hasSynthesizedParameterNames = false;
    @Nullable
    private FunctionDescriptor initialSignatureDescriptor = null;
    private boolean isActual = false;
    private boolean isExpect = false;
    private boolean isExternal = false;
    private boolean isHiddenForResolutionEverywhereBesideSupercalls = false;
    private boolean isHiddenToOvercomeSignatureClash = false;
    private boolean isInfix = false;
    private boolean isInline = false;
    private boolean isOperator = false;
    private boolean isSuspend = false;
    private boolean isTailrec = false;
    private final Kind kind;
    private volatile Function0<Collection<FunctionDescriptor>> lazyOverriddenFunctionsTask = null;
    private Modality modality;
    private final FunctionDescriptor original;
    private Collection<? extends FunctionDescriptor> overriddenFunctions = null;
    private List<TypeParameterDescriptor> typeParameters;
    private KotlinType unsubstitutedReturnType;
    private List<ValueParameterDescriptor> unsubstitutedValueParameters;
    protected Map<UserDataKey<?>, Object> userDataMap = null;
    private Visibility visibility = Visibilities.UNKNOWN;

    public class CopyConfiguration implements CopyBuilder<FunctionDescriptor> {
        private Annotations additionalAnnotations = null;
        protected boolean copyOverrides = true;
        @Nullable
        protected ReceiverParameterDescriptor dispatchReceiverParameter = FunctionDescriptorImpl.this.dispatchReceiverParameter;
        protected boolean dropOriginalInContainingParts = false;
        private boolean isHiddenForResolutionEverywhereBesideSupercalls = FunctionDescriptorImpl.this.isHiddenForResolutionEverywhereBesideSupercalls();
        private boolean isHiddenToOvercomeSignatureClash = FunctionDescriptorImpl.this.isHiddenToOvercomeSignatureClash();
        protected boolean justForTypeSubstitution = false;
        @NotNull
        protected Kind kind;
        @Nullable
        protected Name name;
        @Nullable
        protected KotlinType newExtensionReceiverParameterType;
        private Boolean newHasSynthesizedParameterNames = null;
        @NotNull
        protected Modality newModality;
        @NotNull
        protected DeclarationDescriptor newOwner;
        @NotNull
        protected KotlinType newReturnType;
        private List<TypeParameterDescriptor> newTypeParameters = null;
        @NotNull
        protected List<ValueParameterDescriptor> newValueParameterDescriptors;
        @NotNull
        protected Visibility newVisibility;
        @Nullable
        protected FunctionDescriptor original = null;
        protected boolean preserveSourceElement = false;
        protected boolean signatureChange = false;
        @NotNull
        protected TypeSubstitution substitution;
        private Map<UserDataKey<?>, Object> userDataMap = new LinkedHashMap();

        public CopyConfiguration(TypeSubstitution typeSubstitution, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull Modality modality, @NotNull Visibility visibility, @NotNull Kind kind, @NotNull List<ValueParameterDescriptor> list, @NotNull KotlinType kotlinType, @Nullable KotlinType kotlinType2, @NotNull Name name) {
            this.substitution = typeSubstitution;
            this.newOwner = declarationDescriptor;
            this.newModality = modality;
            this.newVisibility = visibility;
            this.kind = kind;
            this.newValueParameterDescriptors = list;
            this.newExtensionReceiverParameterType = kotlinType;
            this.newReturnType = kotlinType2;
            this.name = name;
        }

        @NotNull
        public CopyConfiguration setOwner(@NotNull DeclarationDescriptor declarationDescriptor) {
            this.newOwner = declarationDescriptor;
            return this;
        }

        @NotNull
        public CopyConfiguration setModality(@NotNull Modality modality) {
            this.newModality = modality;
            return this;
        }

        @NotNull
        public CopyConfiguration setVisibility(@NotNull Visibility visibility) {
            this.newVisibility = visibility;
            return this;
        }

        @NotNull
        public CopyConfiguration setKind(@NotNull Kind kind) {
            this.kind = kind;
            return this;
        }

        @NotNull
        public CopyConfiguration setCopyOverrides(boolean z) {
            this.copyOverrides = z;
            return this;
        }

        @NotNull
        public CopyConfiguration setName(@NotNull Name name) {
            this.name = name;
            return this;
        }

        @NotNull
        public CopyConfiguration setValueParameters(@NotNull List<ValueParameterDescriptor> list) {
            this.newValueParameterDescriptors = list;
            return this;
        }

        @NotNull
        public CopyConfiguration setTypeParameters(@NotNull List<TypeParameterDescriptor> list) {
            this.newTypeParameters = list;
            return this;
        }

        @NotNull
        public CopyConfiguration setReturnType(@NotNull KotlinType kotlinType) {
            this.newReturnType = kotlinType;
            return this;
        }

        @NotNull
        public CopyConfiguration setExtensionReceiverType(@Nullable KotlinType kotlinType) {
            this.newExtensionReceiverParameterType = kotlinType;
            return this;
        }

        @NotNull
        public CopyConfiguration setDispatchReceiverParameter(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.dispatchReceiverParameter = receiverParameterDescriptor;
            return this;
        }

        @NotNull
        public CopyConfiguration setOriginal(@Nullable CallableMemberDescriptor callableMemberDescriptor) {
            this.original = (FunctionDescriptor) callableMemberDescriptor;
            return this;
        }

        @NotNull
        public CopyConfiguration setSignatureChange() {
            this.signatureChange = true;
            return this;
        }

        @NotNull
        public CopyConfiguration setPreserveSourceElement() {
            this.preserveSourceElement = true;
            return this;
        }

        @NotNull
        public CopyConfiguration setDropOriginalInContainingParts() {
            this.dropOriginalInContainingParts = true;
            return this;
        }

        @NotNull
        public CopyConfiguration setHiddenToOvercomeSignatureClash() {
            this.isHiddenToOvercomeSignatureClash = true;
            return this;
        }

        @NotNull
        public CopyConfiguration setHiddenForResolutionEverywhereBesideSupercalls() {
            this.isHiddenForResolutionEverywhereBesideSupercalls = true;
            return this;
        }

        @NotNull
        public CopyConfiguration setAdditionalAnnotations(@NotNull Annotations annotations) {
            this.additionalAnnotations = annotations;
            return this;
        }

        public CopyConfiguration setHasSynthesizedParameterNames(boolean z) {
            this.newHasSynthesizedParameterNames = Boolean.valueOf(z);
            return this;
        }

        @NotNull
        public CopyConfiguration setSubstitution(@NotNull TypeSubstitution typeSubstitution) {
            this.substitution = typeSubstitution;
            return this;
        }

        @Nullable
        public FunctionDescriptor build() {
            return FunctionDescriptorImpl.this.doSubstitute(this);
        }

        @NotNull
        public CopyConfiguration setJustForTypeSubstitution(boolean z) {
            this.justForTypeSubstitution = z;
            return this;
        }
    }

    @NotNull
    protected abstract FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement);

    protected FunctionDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull Kind kind, @NotNull SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (functionDescriptor == null) {
            functionDescriptor = this;
        }
        this.original = functionDescriptor;
        this.kind = kind;
    }

    @NotNull
    public FunctionDescriptorImpl initialize(@Nullable KotlinType kotlinType, @Nullable ReceiverParameterDescriptor receiverParameterDescriptor, @NotNull List<? extends TypeParameterDescriptor> list, @NotNull List<ValueParameterDescriptor> list2, @Nullable KotlinType kotlinType2, @Nullable Modality modality, @NotNull Visibility visibility) {
        this.typeParameters = C19299w.m68840l(list);
        this.unsubstitutedValueParameters = C19299w.m68840l(list2);
        this.unsubstitutedReturnType = kotlinType2;
        this.modality = modality;
        this.visibility = visibility;
        this.extensionReceiverParameter = DescriptorFactory.createExtensionReceiverParameterForCallable(this, kotlinType);
        this.dispatchReceiverParameter = receiverParameterDescriptor;
        for (Modality modality2 = null; modality2 < list.size(); modality2++) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) list.get(modality2);
            if (typeParameterDescriptor.getIndex() != modality2) {
                list = new StringBuilder();
                list.append(typeParameterDescriptor);
                list.append(" index is ");
                list.append(typeParameterDescriptor.getIndex());
                list.append(" but position is ");
                list.append(modality2);
                throw new IllegalStateException(list.toString());
            }
        }
        for (kotlinType = null; kotlinType < list2.size(); kotlinType++) {
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) list2.get(kotlinType);
            if (valueParameterDescriptor.getIndex() != kotlinType + 0) {
                list2 = new StringBuilder();
                list2.append(valueParameterDescriptor);
                list2.append("index is ");
                list2.append(valueParameterDescriptor.getIndex());
                list2.append(" but position is ");
                list2.append(kotlinType);
                throw new IllegalStateException(list2.toString());
            }
        }
        return this;
    }

    public void setVisibility(@NotNull Visibility visibility) {
        this.visibility = visibility;
    }

    public void setOperator(boolean z) {
        this.isOperator = z;
    }

    public void setInfix(boolean z) {
        this.isInfix = z;
    }

    public void setExternal(boolean z) {
        this.isExternal = z;
    }

    public void setInline(boolean z) {
        this.isInline = z;
    }

    public void setTailrec(boolean z) {
        this.isTailrec = z;
    }

    public void setExpect(boolean z) {
        this.isExpect = z;
    }

    public void setActual(boolean z) {
        this.isActual = z;
    }

    private void setHiddenToOvercomeSignatureClash(boolean z) {
        this.isHiddenToOvercomeSignatureClash = z;
    }

    private void setHiddenForResolutionEverywhereBesideSupercalls(boolean z) {
        this.isHiddenForResolutionEverywhereBesideSupercalls = z;
    }

    public void setSuspend(boolean z) {
        this.isSuspend = z;
    }

    public void setReturnType(@NotNull KotlinType kotlinType) {
        KotlinType kotlinType2 = this.unsubstitutedReturnType;
        this.unsubstitutedReturnType = kotlinType;
    }

    public void setHasStableParameterNames(boolean z) {
        this.hasStableParameterNames = z;
    }

    public void setHasSynthesizedParameterNames(boolean z) {
        this.hasSynthesizedParameterNames = z;
    }

    @Nullable
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.extensionReceiverParameter;
    }

    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.dispatchReceiverParameter;
    }

    @NotNull
    public Collection<? extends FunctionDescriptor> getOverriddenDescriptors() {
        performOverriddenLazyCalculationIfNeeded();
        return this.overriddenFunctions != null ? this.overriddenFunctions : Collections.emptyList();
    }

    private void performOverriddenLazyCalculationIfNeeded() {
        Function0 function0 = this.lazyOverriddenFunctionsTask;
        if (function0 != null) {
            this.overriddenFunctions = (Collection) function0.invoke();
            this.lazyOverriddenFunctionsTask = null;
        }
    }

    @NotNull
    public Modality getModality() {
        return this.modality;
    }

    @NotNull
    public Visibility getVisibility() {
        return this.visibility;
    }

    public boolean isOperator() {
        if (this.isOperator) {
            return true;
        }
        for (FunctionDescriptor isOperator : getOriginal().getOverriddenDescriptors()) {
            if (isOperator.isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInfix() {
        if (this.isInfix) {
            return true;
        }
        for (FunctionDescriptor isInfix : getOriginal().getOverriddenDescriptors()) {
            if (isInfix.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isExternal() {
        return this.isExternal;
    }

    public boolean isInline() {
        return this.isInline;
    }

    public boolean isTailrec() {
        return this.isTailrec;
    }

    public boolean isSuspend() {
        return this.isSuspend;
    }

    public boolean isExpect() {
        return this.isExpect;
    }

    public boolean isActual() {
        return this.isActual;
    }

    public <V> V getUserData(UserDataKey<V> userDataKey) {
        if (this.userDataMap == null) {
            return null;
        }
        return this.userDataMap.get(userDataKey);
    }

    public boolean isHiddenToOvercomeSignatureClash() {
        return this.isHiddenToOvercomeSignatureClash;
    }

    public void setOverriddenDescriptors(@NotNull Collection<? extends CallableMemberDescriptor> collection) {
        this.overriddenFunctions = collection;
        collection = this.overriddenFunctions.iterator();
        while (collection.hasNext()) {
            if (((FunctionDescriptor) collection.next()).isHiddenForResolutionEverywhereBesideSupercalls()) {
                this.isHiddenForResolutionEverywhereBesideSupercalls = true;
                return;
            }
        }
    }

    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        return this.typeParameters;
    }

    @NotNull
    public List<ValueParameterDescriptor> getValueParameters() {
        return this.unsubstitutedValueParameters;
    }

    public boolean hasStableParameterNames() {
        return this.hasStableParameterNames;
    }

    public boolean hasSynthesizedParameterNames() {
        return this.hasSynthesizedParameterNames;
    }

    public KotlinType getReturnType() {
        return this.unsubstitutedReturnType;
    }

    @NotNull
    public FunctionDescriptor getOriginal() {
        return this.original == this ? this : this.original.getOriginal();
    }

    @NotNull
    public Kind getKind() {
        return this.kind;
    }

    public FunctionDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        return newCopyBuilder(typeSubstitutor).setOriginal(getOriginal()).setJustForTypeSubstitution(true).build();
    }

    @Nullable
    private KotlinType getExtensionReceiverParameterType() {
        if (this.extensionReceiverParameter == null) {
            return null;
        }
        return this.extensionReceiverParameter.getType();
    }

    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return this.isHiddenForResolutionEverywhereBesideSupercalls;
    }

    @NotNull
    public CopyBuilder<? extends FunctionDescriptor> newCopyBuilder() {
        return newCopyBuilder(TypeSubstitutor.EMPTY);
    }

    @NotNull
    protected CopyConfiguration newCopyBuilder(@NotNull TypeSubstitutor typeSubstitutor) {
        return new CopyConfiguration(typeSubstitutor.getSubstitution(), getContainingDeclaration(), getModality(), getVisibility(), getKind(), getValueParameters(), getExtensionReceiverParameterType(), getReturnType(), null);
    }

    @Nullable
    protected FunctionDescriptor doSubstitute(@NotNull CopyConfiguration copyConfiguration) {
        KotlinType kotlinType;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        CopyConfiguration copyConfiguration2 = copyConfiguration;
        boolean[] zArr = new boolean[1];
        FunctionDescriptor createSubstitutedCopy = createSubstitutedCopy(copyConfiguration2.newOwner, copyConfiguration2.original, copyConfiguration2.kind, copyConfiguration2.name, copyConfiguration.additionalAnnotations != null ? AnnotationsKt.composeAnnotations(getAnnotations(), copyConfiguration.additionalAnnotations) : getAnnotations(), getSourceToUseForCopy(copyConfiguration2.preserveSourceElement, copyConfiguration2.original));
        List typeParameters = copyConfiguration.newTypeParameters == null ? getTypeParameters() : copyConfiguration.newTypeParameters;
        zArr[0] = zArr[0] | (typeParameters.isEmpty() ^ 1);
        List arrayList = new ArrayList(typeParameters.size());
        TypeSubstitutor substituteTypeParameters = DescriptorSubstitutor.substituteTypeParameters(typeParameters, copyConfiguration2.substitution, createSubstitutedCopy, arrayList, zArr);
        if (copyConfiguration2.newExtensionReceiverParameterType != null) {
            KotlinType substitute = substituteTypeParameters.substitute(copyConfiguration2.newExtensionReceiverParameterType, Variance.IN_VARIANCE);
            if (substitute == null) {
                return null;
            }
            zArr[0] = zArr[0] | (substitute != copyConfiguration2.newExtensionReceiverParameterType ? 1 : 0);
            kotlinType = substitute;
        } else {
            kotlinType = null;
        }
        if (copyConfiguration2.dispatchReceiverParameter != null) {
            ReceiverParameterDescriptor substitute2 = copyConfiguration2.dispatchReceiverParameter.substitute(substituteTypeParameters);
            if (substitute2 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (substitute2 != copyConfiguration2.dispatchReceiverParameter ? 1 : 0);
            receiverParameterDescriptor = substitute2;
        } else {
            receiverParameterDescriptor = null;
        }
        typeParameters = getSubstitutedValueParameters(createSubstitutedCopy, copyConfiguration2.newValueParameterDescriptors, substituteTypeParameters, copyConfiguration2.dropOriginalInContainingParts, copyConfiguration2.preserveSourceElement, zArr);
        if (typeParameters == null) {
            return null;
        }
        KotlinType substitute3 = substituteTypeParameters.substitute(copyConfiguration2.newReturnType, Variance.OUT_VARIANCE);
        if (substitute3 == null) {
            return null;
        }
        zArr[0] = zArr[0] | (substitute3 != copyConfiguration2.newReturnType ? 1 : 0);
        if (!zArr[0] && copyConfiguration2.justForTypeSubstitution) {
            return r7;
        }
        final TypeSubstitutor typeSubstitutor = substituteTypeParameters;
        createSubstitutedCopy.initialize(kotlinType, receiverParameterDescriptor, arrayList, typeParameters, substitute3, copyConfiguration2.newModality, copyConfiguration2.newVisibility);
        createSubstitutedCopy.setOperator(r7.isOperator);
        createSubstitutedCopy.setInfix(r7.isInfix);
        createSubstitutedCopy.setExternal(r7.isExternal);
        createSubstitutedCopy.setInline(r7.isInline);
        createSubstitutedCopy.setTailrec(r7.isTailrec);
        createSubstitutedCopy.setSuspend(r7.isSuspend);
        createSubstitutedCopy.setExpect(r7.isExpect);
        createSubstitutedCopy.setActual(r7.isActual);
        createSubstitutedCopy.setHasStableParameterNames(r7.hasStableParameterNames);
        createSubstitutedCopy.setHiddenToOvercomeSignatureClash(copyConfiguration.isHiddenToOvercomeSignatureClash);
        createSubstitutedCopy.setHiddenForResolutionEverywhereBesideSupercalls(copyConfiguration.isHiddenForResolutionEverywhereBesideSupercalls);
        createSubstitutedCopy.setHasSynthesizedParameterNames(copyConfiguration.newHasSynthesizedParameterNames != null ? copyConfiguration.newHasSynthesizedParameterNames.booleanValue() : r7.hasSynthesizedParameterNames);
        if (!(copyConfiguration.userDataMap.isEmpty() && r7.userDataMap == null)) {
            Map access$600 = copyConfiguration.userDataMap;
            if (r7.userDataMap != null) {
                for (Entry entry : r7.userDataMap.entrySet()) {
                    if (!access$600.containsKey(entry.getKey())) {
                        access$600.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (access$600.size() == 1) {
                createSubstitutedCopy.userDataMap = Collections.singletonMap(access$600.keySet().iterator().next(), access$600.values().iterator().next());
            } else {
                createSubstitutedCopy.userDataMap = access$600;
            }
        }
        if (copyConfiguration2.signatureChange || getInitialSignatureDescriptor() != null) {
            createSubstitutedCopy.setInitialSignatureDescriptor((getInitialSignatureDescriptor() != null ? getInitialSignatureDescriptor() : r7).substitute(typeSubstitutor));
        }
        if (copyConfiguration2.copyOverrides && !getOriginal().getOverriddenDescriptors().isEmpty()) {
            if (copyConfiguration2.substitution.isEmpty()) {
                Function0 function0 = r7.lazyOverriddenFunctionsTask;
                if (function0 != null) {
                    createSubstitutedCopy.lazyOverriddenFunctionsTask = function0;
                } else {
                    createSubstitutedCopy.setOverriddenDescriptors(getOverriddenDescriptors());
                }
            } else {
                createSubstitutedCopy.lazyOverriddenFunctionsTask = new Function0<Collection<FunctionDescriptor>>() {
                    public Collection<FunctionDescriptor> invoke() {
                        Collection<FunctionDescriptor> smartList = new SmartList();
                        for (FunctionDescriptor substitute : FunctionDescriptorImpl.this.getOverriddenDescriptors()) {
                            smartList.add(substitute.substitute(typeSubstitutor));
                        }
                        return smartList;
                    }
                };
            }
        }
        return createSubstitutedCopy;
    }

    @NotNull
    public FunctionDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, Visibility visibility, Kind kind, boolean z) {
        return newCopyBuilder().setOwner(declarationDescriptor).setModality(modality).setVisibility(visibility).setKind(kind).setCopyOverrides(z).build();
    }

    @NotNull
    private SourceElement getSourceToUseForCopy(boolean z, @Nullable FunctionDescriptor functionDescriptor) {
        if (!z) {
            return SourceElement.NO_SOURCE;
        }
        if (functionDescriptor == null) {
            functionDescriptor = getOriginal();
        }
        return functionDescriptor.getSource();
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitFunctionDescriptor(this, d);
    }

    @Nullable
    public static List<ValueParameterDescriptor> getSubstitutedValueParameters(FunctionDescriptor functionDescriptor, @NotNull List<ValueParameterDescriptor> list, @NotNull TypeSubstitutor typeSubstitutor, boolean z, boolean z2, @Nullable boolean[] zArr) {
        TypeSubstitutor typeSubstitutor2 = typeSubstitutor;
        List<ValueParameterDescriptor> arrayList = new ArrayList(list.size());
        for (ValueParameterDescriptor valueParameterDescriptor : list) {
            KotlinType kotlinType;
            KotlinType substitute = typeSubstitutor2.substitute(valueParameterDescriptor.getType(), Variance.IN_VARIANCE);
            KotlinType varargElementType = valueParameterDescriptor.getVarargElementType();
            if (varargElementType == null) {
                kotlinType = null;
            } else {
                kotlinType = typeSubstitutor2.substitute(varargElementType, Variance.IN_VARIANCE);
            }
            if (substitute == null) {
                return null;
            }
            if (!((substitute == valueParameterDescriptor.getType() && varargElementType == kotlinType) || zArr == null)) {
                zArr[0] = true;
            }
            arrayList.add(new ValueParameterDescriptorImpl(functionDescriptor, z ? null : valueParameterDescriptor, valueParameterDescriptor.getIndex(), valueParameterDescriptor.getAnnotations(), valueParameterDescriptor.getName(), substitute, valueParameterDescriptor.declaresDefaultValue(), valueParameterDescriptor.isCrossinline(), valueParameterDescriptor.isNoinline(), kotlinType, z2 ? valueParameterDescriptor.getSource() : SourceElement.NO_SOURCE));
        }
        return arrayList;
    }

    @Nullable
    public FunctionDescriptor getInitialSignatureDescriptor() {
        return this.initialSignatureDescriptor;
    }

    private void setInitialSignatureDescriptor(@Nullable FunctionDescriptor functionDescriptor) {
        this.initialSignatureDescriptor = functionDescriptor;
    }

    public <V> void putInUserDataMap(UserDataKey<V> userDataKey, Object obj) {
        this.userDataMap.put(userDataKey, obj);
    }
}
