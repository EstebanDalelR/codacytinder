package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15819j;
import kotlin.TypeCastException;
import kotlin.collections.C15808y;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {
    public static final Factory Factory = new Factory();

    public static final class Factory {
        private Factory() {
        }

        @NotNull
        public final FunctionInvokeDescriptor create(@NotNull FunctionClassDescriptor functionClassDescriptor, boolean z) {
            C2668g.b(functionClassDescriptor, "functionClass");
            List declaredTypeParameters = functionClassDescriptor.getDeclaredTypeParameters();
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClassDescriptor, null, Kind.DECLARATION, z);
            ReceiverParameterDescriptor thisAsReceiverParameter = functionClassDescriptor.getThisAsReceiverParameter();
            List a = C17554o.m64195a();
            Iterable iterable = declaredTypeParameters;
            z = new ArrayList();
            for (Object next : iterable) {
                if ((((TypeParameterDescriptor) next).getVariance() == Variance.IN_VARIANCE ? 1 : null) == null) {
                    break;
                }
                z.add(next);
            }
            FunctionClassDescriptor<C15808y> o = C19299w.m68843o((List) z);
            Collection collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) o, 10));
            for (C15808y c15808y : o) {
                collection.add(FunctionInvokeDescriptor.Factory.createValueParameter(functionInvokeDescriptor, c15808y.m59828a(), (TypeParameterDescriptor) c15808y.m59829b()));
            }
            functionInvokeDescriptor.initialize(null, thisAsReceiverParameter, a, (List) collection, (KotlinType) ((TypeParameterDescriptor) C19299w.m68832h(declaredTypeParameters)).getDefaultType(), Modality.ABSTRACT, Visibilities.PUBLIC);
            functionInvokeDescriptor.setHasSynthesizedParameterNames(true);
            return functionInvokeDescriptor;
        }

        private final ValueParameterDescriptor createValueParameter(FunctionInvokeDescriptor functionInvokeDescriptor, int i, TypeParameterDescriptor typeParameterDescriptor) {
            CallableDescriptor callableDescriptor;
            Annotations empty;
            Name identifier;
            SimpleType defaultType;
            KotlinType kotlinType;
            SourceElement sourceElement;
            String asString = typeParameterDescriptor.getName().asString();
            int hashCode = asString.hashCode();
            if (hashCode != 69) {
                if (hashCode == 84) {
                    if (asString.equals("T")) {
                        asString = "instance";
                        callableDescriptor = functionInvokeDescriptor;
                        empty = Annotations.Companion.getEMPTY();
                        identifier = Name.identifier(asString);
                        C2668g.a(identifier, "Name.identifier(name)");
                        defaultType = typeParameterDescriptor.getDefaultType();
                        C2668g.a(defaultType, "typeParameter.defaultType");
                        kotlinType = defaultType;
                        sourceElement = SourceElement.NO_SOURCE;
                        C2668g.a(sourceElement, "SourceElement.NO_SOURCE");
                        return new ValueParameterDescriptorImpl(callableDescriptor, null, i, empty, identifier, kotlinType, false, false, false, null, sourceElement);
                    }
                }
            } else if (asString.equals("E")) {
                asString = "receiver";
                callableDescriptor = functionInvokeDescriptor;
                empty = Annotations.Companion.getEMPTY();
                identifier = Name.identifier(asString);
                C2668g.a(identifier, "Name.identifier(name)");
                defaultType = typeParameterDescriptor.getDefaultType();
                C2668g.a(defaultType, "typeParameter.defaultType");
                kotlinType = defaultType;
                sourceElement = SourceElement.NO_SOURCE;
                C2668g.a(sourceElement, "SourceElement.NO_SOURCE");
                return new ValueParameterDescriptorImpl(callableDescriptor, null, i, empty, identifier, kotlinType, false, false, false, null, sourceElement);
            }
            C2668g.a(asString, "typeParameterName");
            if (asString == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            asString = asString.toLowerCase();
            C2668g.a(asString, "(this as java.lang.String).toLowerCase()");
            callableDescriptor = functionInvokeDescriptor;
            empty = Annotations.Companion.getEMPTY();
            identifier = Name.identifier(asString);
            C2668g.a(identifier, "Name.identifier(name)");
            defaultType = typeParameterDescriptor.getDefaultType();
            C2668g.a(defaultType, "typeParameter.defaultType");
            kotlinType = defaultType;
            sourceElement = SourceElement.NO_SOURCE;
            C2668g.a(sourceElement, "SourceElement.NO_SOURCE");
            return new ValueParameterDescriptorImpl(callableDescriptor, null, i, empty, identifier, kotlinType, false, false, false, null, sourceElement);
        }
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isTailrec() {
        return false;
    }

    private FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, Kind kind, boolean z) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.Companion.getEMPTY(), OperatorNameConventions.INVOKE, kind, SourceElement.NO_SOURCE);
        setOperator(true);
        setSuspend(z);
        setHasStableParameterNames(null);
    }

    @Nullable
    protected FunctionDescriptor doSubstitute(@NotNull CopyConfiguration copyConfiguration) {
        C2668g.b(copyConfiguration, "configuration");
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.doSubstitute(copyConfiguration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List valueParameters = functionInvokeDescriptor.getValueParameters();
        C2668g.a(valueParameters, "substituted.valueParameters");
        Iterable<ValueParameterDescriptor> iterable = valueParameters;
        Object obj = 1;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (ValueParameterDescriptor valueParameterDescriptor : iterable) {
                Object obj2;
                C2668g.a(valueParameterDescriptor, "it");
                KotlinType type = valueParameterDescriptor.getType();
                C2668g.a(type, "it.type");
                if (FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type) != null) {
                    obj2 = 1;
                    continue;
                } else {
                    obj2 = null;
                    continue;
                }
                if (obj2 != null) {
                    obj = null;
                    break;
                }
            }
        }
        if (obj != null) {
            return functionInvokeDescriptor;
        }
        valueParameters = functionInvokeDescriptor.getValueParameters();
        C2668g.a(valueParameters, "substituted.valueParameters");
        iterable = valueParameters;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (ValueParameterDescriptor valueParameterDescriptor2 : iterable) {
            C2668g.a(valueParameterDescriptor2, "it");
            KotlinType type2 = valueParameterDescriptor2.getType();
            C2668g.a(type2, "it.type");
            arrayList.add(FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type2));
        }
        return functionInvokeDescriptor.replaceParameterNames((List) arrayList);
    }

    @NotNull
    protected FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        C2668g.b(declarationDescriptor, "newOwner");
        C2668g.b(kind, "kind");
        C2668g.b(annotations, "annotations");
        C2668g.b(sourceElement, "source");
        return (FunctionDescriptorImpl) new FunctionInvokeDescriptor(declarationDescriptor, (FunctionInvokeDescriptor) functionDescriptor, kind, isSuspend());
    }

    private final FunctionDescriptor replaceParameterNames(List<Name> list) {
        Object obj;
        List valueParameters;
        Iterable<ValueParameterDescriptor> iterable;
        Collection arrayList;
        Name name;
        int i;
        Name name2;
        List list2;
        CopyConfiguration newCopyBuilder;
        Iterable<Name> iterable2;
        int size = getValueParameters().size() - list.size();
        boolean z = false;
        if (size != 0) {
            if (size != 1) {
                obj = null;
                if (C15819j.f49018a || r3 != null) {
                    valueParameters = getValueParameters();
                    C2668g.a(valueParameters, "valueParameters");
                    iterable = valueParameters;
                    arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                    for (ValueParameterDescriptor valueParameterDescriptor : iterable) {
                        C2668g.a(valueParameterDescriptor, "it");
                        name = valueParameterDescriptor.getName();
                        int index = valueParameterDescriptor.getIndex();
                        i = index - size;
                        if (i >= 0) {
                            name2 = (Name) list.get(i);
                            if (name2 != null) {
                                name = name2;
                            }
                        }
                        CallableDescriptor callableDescriptor = this;
                        C2668g.a(name, "newName");
                        arrayList.add(valueParameterDescriptor.copy(callableDescriptor, name, index));
                    }
                    list2 = (List) arrayList;
                    newCopyBuilder = newCopyBuilder(TypeSubstitutor.EMPTY);
                    iterable2 = list;
                    if ((iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        for (Name name3 : iterable2) {
                            if (name3 != null) {
                                obj = 1;
                                continue;
                            } else {
                                obj = null;
                                continue;
                            }
                            if (obj != null) {
                                z = true;
                                break;
                            }
                        }
                    }
                    list = super.doSubstitute(newCopyBuilder.setHasSynthesizedParameterNames(z).setValueParameters(list2).setOriginal(getOriginal()));
                    if (list == null) {
                        C2668g.a();
                    }
                    return list;
                }
                throw new AssertionError("Assertion failed");
            }
        }
        obj = 1;
        if (C15819j.f49018a) {
        }
        valueParameters = getValueParameters();
        C2668g.a(valueParameters, "valueParameters");
        iterable = valueParameters;
        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (ValueParameterDescriptor valueParameterDescriptor2 : iterable) {
            C2668g.a(valueParameterDescriptor2, "it");
            name = valueParameterDescriptor2.getName();
            int index2 = valueParameterDescriptor2.getIndex();
            i = index2 - size;
            if (i >= 0) {
                name2 = (Name) list.get(i);
                if (name2 != null) {
                    name = name2;
                }
            }
            CallableDescriptor callableDescriptor2 = this;
            C2668g.a(name, "newName");
            arrayList.add(valueParameterDescriptor2.copy(callableDescriptor2, name, index2));
        }
        list2 = (List) arrayList;
        newCopyBuilder = newCopyBuilder(TypeSubstitutor.EMPTY);
        iterable2 = list;
        if (iterable2 instanceof Collection) {
        }
        while (list.hasNext()) {
            if (name3 != null) {
                obj = null;
                continue;
            } else {
                obj = 1;
                continue;
            }
            if (obj != null) {
                z = true;
                break;
            }
        }
        list = super.doSubstitute(newCopyBuilder.setHasSynthesizedParameterNames(z).setValueParameters(list2).setOriginal(getOriginal()));
        if (list == null) {
            C2668g.a();
        }
        return list;
    }
}
