package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import java.util.List;
import kotlin.C15813i;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.Nullable;

public class MemberComparator implements Comparator<DeclarationDescriptor> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final MemberComparator INSTANCE = new MemberComparator();
    private static final DescriptorRenderer RENDERER = DescriptorRenderer.Companion.withOptions(new C185201());

    public static class NameAndTypeMemberComparator implements Comparator<DeclarationDescriptor> {
        public static final NameAndTypeMemberComparator INSTANCE = new NameAndTypeMemberComparator();

        private NameAndTypeMemberComparator() {
        }

        private static int getDeclarationPriority(DeclarationDescriptor declarationDescriptor) {
            if (DescriptorUtils.isEnumEntry(declarationDescriptor)) {
                return 8;
            }
            if (declarationDescriptor instanceof ConstructorDescriptor) {
                return 7;
            }
            if (declarationDescriptor instanceof PropertyDescriptor) {
                return ((PropertyDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null ? 6 : 5;
            } else {
                if (declarationDescriptor instanceof FunctionDescriptor) {
                    return ((FunctionDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null ? 4 : 3;
                } else {
                    if (declarationDescriptor instanceof ClassDescriptor) {
                        return 2;
                    }
                    return (declarationDescriptor instanceof TypeAliasDescriptor) != null ? 1 : null;
                }
            }
        }

        public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            declarationDescriptor = compareInternal(declarationDescriptor, declarationDescriptor2);
            return declarationDescriptor != null ? declarationDescriptor.intValue() : null;
        }

        @Nullable
        private static Integer compareInternal(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            int declarationPriority = getDeclarationPriority(declarationDescriptor2) - getDeclarationPriority(declarationDescriptor);
            if (declarationPriority != 0) {
                return Integer.valueOf(declarationPriority);
            }
            if (DescriptorUtils.isEnumEntry(declarationDescriptor) && DescriptorUtils.isEnumEntry(declarationDescriptor2)) {
                return Integer.valueOf(null);
            }
            declarationDescriptor = declarationDescriptor.getName().compareTo(declarationDescriptor2.getName());
            return declarationDescriptor != null ? Integer.valueOf(declarationDescriptor) : null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.MemberComparator$1 */
    static class C185201 implements Function1<DescriptorRendererOptions, C15813i> {
        C185201() {
        }

        public C15813i invoke(DescriptorRendererOptions descriptorRendererOptions) {
            descriptorRendererOptions.setWithDefinedIn(false);
            descriptorRendererOptions.setVerbose(true);
            descriptorRendererOptions.setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
            return C15813i.f49016a;
        }
    }

    private MemberComparator() {
    }

    public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        Integer access$000 = NameAndTypeMemberComparator.compareInternal(declarationDescriptor, declarationDescriptor2);
        if (access$000 != null) {
            return access$000.intValue();
        }
        int compareTo;
        if ((declarationDescriptor instanceof TypeAliasDescriptor) && (declarationDescriptor2 instanceof TypeAliasDescriptor)) {
            compareTo = RENDERER.renderType(((TypeAliasDescriptor) declarationDescriptor).getUnderlyingType()).compareTo(RENDERER.renderType(((TypeAliasDescriptor) declarationDescriptor2).getUnderlyingType()));
            if (compareTo != 0) {
                return compareTo;
            }
        } else if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            int compareTo2;
            int i;
            CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor;
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) declarationDescriptor2;
            ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
            ReceiverParameterDescriptor extensionReceiverParameter2 = callableDescriptor2.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                compareTo2 = RENDERER.renderType(extensionReceiverParameter.getType()).compareTo(RENDERER.renderType(extensionReceiverParameter2.getType()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            List valueParameters = callableDescriptor.getValueParameters();
            List valueParameters2 = callableDescriptor2.getValueParameters();
            for (i = 0; i < Math.min(valueParameters.size(), valueParameters2.size()); i++) {
                int compareTo3 = RENDERER.renderType(((ValueParameterDescriptor) valueParameters.get(i)).getType()).compareTo(RENDERER.renderType(((ValueParameterDescriptor) valueParameters2.get(i)).getType()));
                if (compareTo3 != 0) {
                    return compareTo3;
                }
            }
            compareTo2 = valueParameters.size() - valueParameters2.size();
            if (compareTo2 != 0) {
                return compareTo2;
            }
            valueParameters = callableDescriptor.getTypeParameters();
            valueParameters2 = callableDescriptor2.getTypeParameters();
            for (i = 0; i < Math.min(valueParameters.size(), valueParameters2.size()); i++) {
                List upperBounds = ((TypeParameterDescriptor) valueParameters.get(i)).getUpperBounds();
                List upperBounds2 = ((TypeParameterDescriptor) valueParameters2.get(i)).getUpperBounds();
                int size = upperBounds.size() - upperBounds2.size();
                if (size != 0) {
                    return size;
                }
                for (size = 0; size < upperBounds.size(); size++) {
                    int compareTo4 = RENDERER.renderType((KotlinType) upperBounds.get(size)).compareTo(RENDERER.renderType((KotlinType) upperBounds2.get(size)));
                    if (compareTo4 != 0) {
                        return compareTo4;
                    }
                }
            }
            int size2 = valueParameters.size() - valueParameters2.size();
            if (size2 != 0) {
                return size2;
            }
            if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof CallableMemberDescriptor)) {
                compareTo = ((CallableMemberDescriptor) callableDescriptor).getKind().ordinal() - ((CallableMemberDescriptor) callableDescriptor2).getKind().ordinal();
                if (compareTo != 0) {
                    return compareTo;
                }
            }
        } else {
            int i2 = 1;
            if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
                ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
                ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor2;
                if (classDescriptor.getKind().ordinal() != classDescriptor2.getKind().ordinal()) {
                    return classDescriptor.getKind().ordinal() - classDescriptor2.getKind().ordinal();
                }
                if (classDescriptor.isCompanionObject() != classDescriptor2.isCompanionObject()) {
                    if (classDescriptor.isCompanionObject() == null) {
                        i2 = -1;
                    }
                    return i2;
                }
            }
            throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", new Object[]{declarationDescriptor, declarationDescriptor.getClass(), declarationDescriptor2, declarationDescriptor2.getClass()}));
        }
        compareTo = RENDERER.render(declarationDescriptor).compareTo(RENDERER.render(declarationDescriptor2));
        if (compareTo != 0) {
            return compareTo;
        }
        return DescriptorUtils.getContainingModule(declarationDescriptor).getName().compareTo(DescriptorUtils.getContainingModule(declarationDescriptor2).getName());
    }
}
