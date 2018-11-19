package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements JavaCallableMemberDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Boolean hasStableParameterNames = null;
    private Boolean hasSynthesizedParameterNames = null;

    protected JavaClassConstructorDescriptor(@NotNull ClassDescriptor classDescriptor, @Nullable JavaClassConstructorDescriptor javaClassConstructorDescriptor, @NotNull Annotations annotations, boolean z, @NotNull Kind kind, @NotNull SourceElement sourceElement) {
        super(classDescriptor, javaClassConstructorDescriptor, annotations, z, kind, sourceElement);
    }

    @NotNull
    public static JavaClassConstructorDescriptor createJavaConstructor(@NotNull ClassDescriptor classDescriptor, @NotNull Annotations annotations, boolean z, @NotNull SourceElement sourceElement) {
        return new JavaClassConstructorDescriptor(classDescriptor, null, annotations, z, Kind.DECLARATION, sourceElement);
    }

    public boolean hasStableParameterNames() {
        return this.hasStableParameterNames.booleanValue();
    }

    public void setHasStableParameterNames(boolean z) {
        this.hasStableParameterNames = Boolean.valueOf(z);
    }

    public boolean hasSynthesizedParameterNames() {
        return this.hasSynthesizedParameterNames.booleanValue();
    }

    public void setHasSynthesizedParameterNames(boolean z) {
        this.hasSynthesizedParameterNames = Boolean.valueOf(z);
    }

    @NotNull
    protected JavaClassConstructorDescriptor createSubstitutedCopy(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable FunctionDescriptor functionDescriptor, @NotNull Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        if (kind == Kind.DECLARATION || kind == Kind.SYNTHESIZED) {
            declarationDescriptor = createDescriptor((ClassDescriptor) declarationDescriptor, (JavaClassConstructorDescriptor) functionDescriptor, kind, sourceElement, annotations);
            declarationDescriptor.setHasStableParameterNames(hasStableParameterNames());
            declarationDescriptor.setHasSynthesizedParameterNames(hasSynthesizedParameterNames());
            return declarationDescriptor;
        }
        name = new StringBuilder();
        name.append("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
        name.append(this);
        name.append("\n");
        name.append("newOwner: ");
        name.append(declarationDescriptor);
        name.append("\n");
        name.append("kind: ");
        name.append(kind);
        throw new IllegalStateException(name.toString());
    }

    @NotNull
    protected JavaClassConstructorDescriptor createDescriptor(@NotNull ClassDescriptor classDescriptor, @Nullable JavaClassConstructorDescriptor javaClassConstructorDescriptor, @NotNull Kind kind, @NotNull SourceElement sourceElement, @NotNull Annotations annotations) {
        return new JavaClassConstructorDescriptor(classDescriptor, javaClassConstructorDescriptor, annotations, this.isPrimary, kind, sourceElement);
    }

    @NotNull
    public JavaClassConstructorDescriptor enhance(@Nullable KotlinType kotlinType, @NotNull List<ValueParameterData> list, @NotNull KotlinType kotlinType2) {
        JavaClassConstructorDescriptor createSubstitutedCopy = createSubstitutedCopy(getContainingDeclaration(), null, getKind(), null, getAnnotations(), getSource());
        JavaClassConstructorDescriptor javaClassConstructorDescriptor = createSubstitutedCopy;
        KotlinType kotlinType3 = kotlinType;
        KotlinType kotlinType4 = kotlinType2;
        javaClassConstructorDescriptor.initialize(kotlinType3, getDispatchReceiverParameter(), getTypeParameters(), UtilKt.copyValueParameters(list, getValueParameters(), createSubstitutedCopy), kotlinType4, getModality(), getVisibility());
        return createSubstitutedCopy;
    }
}
