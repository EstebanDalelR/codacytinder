package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TypeParameterDescriptorImpl extends AbstractTypeParameterDescriptor {
    private boolean initialized = false;
    @Nullable
    private final Function1<KotlinType, Void> reportCycleError;
    private final List<KotlinType> upperBounds = new ArrayList(1);

    @NotNull
    public static TypeParameterDescriptor createWithDefaultBound(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z, @NotNull Variance variance, @NotNull Name name, int i) {
        annotations = createForFurtherModification(declarationDescriptor, annotations, z, variance, name, i, SourceElement.NO_SOURCE);
        annotations.addUpperBound(DescriptorUtilsKt.getBuiltIns(declarationDescriptor).getDefaultBound());
        annotations.setInitialized();
        return annotations;
    }

    public static TypeParameterDescriptorImpl createForFurtherModification(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z, @NotNull Variance variance, @NotNull Name name, int i, @NotNull SourceElement sourceElement) {
        return createForFurtherModification(declarationDescriptor, annotations, z, variance, name, i, sourceElement, null, EMPTY.INSTANCE);
    }

    public static TypeParameterDescriptorImpl createForFurtherModification(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z, @NotNull Variance variance, @NotNull Name name, int i, @NotNull SourceElement sourceElement, @Nullable Function1<KotlinType, Void> function1, @NotNull SupertypeLoopChecker supertypeLoopChecker) {
        return new TypeParameterDescriptorImpl(declarationDescriptor, annotations, z, variance, name, i, sourceElement, function1, supertypeLoopChecker);
    }

    private TypeParameterDescriptorImpl(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull Annotations annotations, boolean z, @NotNull Variance variance, @NotNull Name name, int i, @NotNull SourceElement sourceElement, @Nullable Function1<KotlinType, Void> function1, @NotNull SupertypeLoopChecker supertypeLoopChecker) {
        super(LockBasedStorageManager.NO_LOCKS, declarationDescriptor, annotations, name, variance, z, i, sourceElement, supertypeLoopChecker);
        this.reportCycleError = function1;
    }

    private void checkInitialized() {
        if (!this.initialized) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Type parameter descriptor is not initialized: ");
            stringBuilder.append(nameForAssertions());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private void checkUninitialized() {
        if (this.initialized) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Type parameter descriptor is already initialized: ");
            stringBuilder.append(nameForAssertions());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private String nameForAssertions() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getName());
        stringBuilder.append(" declared in ");
        stringBuilder.append(DescriptorUtils.getFqName(getContainingDeclaration()));
        return stringBuilder.toString();
    }

    public void setInitialized() {
        checkUninitialized();
        this.initialized = true;
    }

    public void addUpperBound(@NotNull KotlinType kotlinType) {
        checkUninitialized();
        doAddUpperBound(kotlinType);
    }

    private void doAddUpperBound(KotlinType kotlinType) {
        if (!KotlinTypeKt.isError(kotlinType)) {
            this.upperBounds.add(kotlinType);
        }
    }

    protected void reportSupertypeLoopError(@NotNull KotlinType kotlinType) {
        if (this.reportCycleError != null) {
            this.reportCycleError.invoke(kotlinType);
        }
    }

    @NotNull
    protected List<KotlinType> resolveUpperBounds() {
        checkInitialized();
        return this.upperBounds;
    }
}
