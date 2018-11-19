package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15819j;
import kotlin.Pair;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class UtilKt {
    @NotNull
    public static final List<ValueParameterDescriptor> copyValueParameters(@NotNull Collection<ValueParameterData> collection, @NotNull Collection<? extends ValueParameterDescriptor> collection2, @NotNull CallableDescriptor callableDescriptor) {
        Collection<ValueParameterData> collection3 = collection;
        Collection<? extends ValueParameterDescriptor> collection4 = collection2;
        CallableDescriptor callableDescriptor2 = callableDescriptor;
        C2668g.b(collection3, "newValueParametersTypes");
        C2668g.b(collection4, "oldValueParameters");
        C2668g.b(callableDescriptor2, "newOwner");
        Object obj = collection.size() == collection2.size() ? 1 : null;
        if (C15819j.f49018a && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Different value parameters sizes: Enhanced = ");
            stringBuilder.append(collection.size());
            stringBuilder.append(", Old = ");
            stringBuilder.append(collection2.size());
            throw new AssertionError(stringBuilder.toString());
        }
        Iterable<Pair> c = C19299w.m68815c((Iterable) collection3, (Iterable) collection4);
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) c, 10));
        for (Pair pair : c) {
            ValueParameterData valueParameterData = (ValueParameterData) pair.m59805c();
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.m59806d();
            int index = valueParameterDescriptor.getIndex();
            Annotations annotations = valueParameterDescriptor.getAnnotations();
            Name name = valueParameterDescriptor.getName();
            C2668g.a(name, "oldParameter.name");
            KotlinType type = valueParameterData.getType();
            boolean hasDefaultValue = valueParameterData.getHasDefaultValue();
            boolean isCrossinline = valueParameterDescriptor.isCrossinline();
            boolean isNoinline = valueParameterDescriptor.isNoinline();
            KotlinType arrayElementType = valueParameterDescriptor.getVarargElementType() != null ? DescriptorUtilsKt.getModule(callableDescriptor2).getBuiltIns().getArrayElementType(valueParameterData.getType()) : null;
            SourceElement source = valueParameterDescriptor.getSource();
            C2668g.a(source, "oldParameter.source");
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor2, null, index, annotations, name, type, hasDefaultValue, isCrossinline, isNoinline, arrayElementType, source));
        }
        return (List) arrayList;
    }

    @Nullable
    public static final LazyJavaStaticClassScope getParentJavaStaticClassScope(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "$receiver");
        classDescriptor = DescriptorUtilsKt.getSuperClassNotAny(classDescriptor);
        if (classDescriptor == null) {
            return null;
        }
        MemberScope staticScope = classDescriptor.getStaticScope();
        if (staticScope instanceof LazyJavaStaticClassScope) {
            return (LazyJavaStaticClassScope) staticScope;
        }
        return getParentJavaStaticClassScope(classDescriptor);
    }

    @Nullable
    public static final JvmClassName getImplClassNameForDeserialized(@NotNull DeserializedMemberDescriptor deserializedMemberDescriptor) {
        C2668g.b(deserializedMemberDescriptor, "$receiver");
        deserializedMemberDescriptor = deserializedMemberDescriptor.getContainerSource();
        if (!(deserializedMemberDescriptor instanceof JvmPackagePartSource)) {
            deserializedMemberDescriptor = null;
        }
        JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) deserializedMemberDescriptor;
        return jvmPackagePartSource != null ? jvmPackagePartSource.getClassName() : null;
    }

    @Nullable
    public static final AnnotationDefaultValue getDefaultValueFromAnnotation(@NotNull ValueParameterDescriptor valueParameterDescriptor) {
        C2668g.b(valueParameterDescriptor, "$receiver");
        Annotations annotations = valueParameterDescriptor.getAnnotations();
        FqName fqName = JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME;
        C2668g.a(fqName, "JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME");
        AnnotationDescriptor findAnnotation = annotations.findAnnotation(fqName);
        if (findAnnotation != null) {
            ConstantValue firstArgument = DescriptorUtilsKt.firstArgument(findAnnotation);
            if (firstArgument != null) {
                if (!(firstArgument instanceof StringValue)) {
                    firstArgument = null;
                }
                StringValue stringValue = (StringValue) firstArgument;
                if (stringValue != null) {
                    String str = (String) stringValue.getValue();
                    if (str != null) {
                        return (AnnotationDefaultValue) new StringDefaultValue(str);
                    }
                }
            }
        }
        valueParameterDescriptor = valueParameterDescriptor.getAnnotations();
        FqName fqName2 = JvmAnnotationNames.DEFAULT_NULL_FQ_NAME;
        C2668g.a(fqName2, "JvmAnnotationNames.DEFAULT_NULL_FQ_NAME");
        if (valueParameterDescriptor.hasAnnotation(fqName2) != null) {
            return (AnnotationDefaultValue) NullDefaultValue.INSTANCE;
        }
        return null;
    }
}
