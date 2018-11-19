package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.collections.C17554o;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorSimpleFunctionDescriptorImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ErrorUtils {
    private static final ErrorClassDescriptor ERROR_CLASS = new ErrorClassDescriptor(Name.special("<ERROR CLASS>"));
    private static final ModuleDescriptor ERROR_MODULE = new C191451();
    private static final PropertyDescriptor ERROR_PROPERTY = createErrorProperty();
    private static final Set<PropertyDescriptor> ERROR_PROPERTY_GROUP = Collections.singleton(ERROR_PROPERTY);
    private static final KotlinType ERROR_PROPERTY_TYPE = createErrorType("<ERROR PROPERTY TYPE>");
    public static final SimpleType ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES = createErrorType("<LOOP IN SUPERTYPES>");

    public static class UninferredParameterTypeConstructor implements TypeConstructor {
        private final TypeConstructor errorTypeConstructor;
        private final TypeParameterDescriptor typeParameterDescriptor;

        @NotNull
        public TypeParameterDescriptor getTypeParameterDescriptor() {
            return this.typeParameterDescriptor;
        }

        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return this.errorTypeConstructor.getParameters();
        }

        @NotNull
        public Collection<KotlinType> getSupertypes() {
            return this.errorTypeConstructor.getSupertypes();
        }

        public boolean isDenotable() {
            return this.errorTypeConstructor.isDenotable();
        }

        @Nullable
        public ClassifierDescriptor getDeclarationDescriptor() {
            return this.errorTypeConstructor.getDeclarationDescriptor();
        }

        @NotNull
        public KotlinBuiltIns getBuiltIns() {
            return DescriptorUtilsKt.getBuiltIns(this.typeParameterDescriptor);
        }
    }

    public static class ErrorScope implements MemberScope {
        private final String debugMessage;

        private ErrorScope(@NotNull String str) {
            this.debugMessage = str;
        }

        @Nullable
        public ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            return ErrorUtils.createErrorClass(name.asString());
        }

        @NotNull
        public Set getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            return ErrorUtils.ERROR_PROPERTY_GROUP;
        }

        @NotNull
        public Set getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            return Collections.singleton(ErrorUtils.createErrorFunction(this));
        }

        @NotNull
        public Set<Name> getFunctionNames() {
            return Collections.emptySet();
        }

        @NotNull
        public Set<Name> getVariableNames() {
            return Collections.emptySet();
        }

        @NotNull
        public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
            return Collections.emptyList();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ErrorScope{");
            stringBuilder.append(this.debugMessage);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    private static class ThrowingScope implements MemberScope {
        private final String debugMessage;

        private ThrowingScope(@NotNull String str) {
            this.debugMessage = str;
        }

        @Nullable
        public ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.debugMessage);
            stringBuilder.append(", required name: ");
            stringBuilder.append(name);
            throw new IllegalStateException(stringBuilder.toString());
        }

        @NotNull
        public Collection getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.debugMessage);
            stringBuilder.append(", required name: ");
            stringBuilder.append(name);
            throw new IllegalStateException(stringBuilder.toString());
        }

        @NotNull
        public Collection getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.debugMessage);
            stringBuilder.append(", required name: ");
            stringBuilder.append(name);
            throw new IllegalStateException(stringBuilder.toString());
        }

        @NotNull
        public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
            throw new IllegalStateException(this.debugMessage);
        }

        @NotNull
        public Set<Name> getFunctionNames() {
            throw new IllegalStateException();
        }

        @NotNull
        public Set<Name> getVariableNames() {
            throw new IllegalStateException();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ThrowingScope{");
            stringBuilder.append(this.debugMessage);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.ErrorUtils$1 */
    static class C191451 implements ModuleDescriptor {
        public <R, D> R accept(@NotNull DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
            return null;
        }

        @Nullable
        public DeclarationDescriptor getContainingDeclaration() {
            return null;
        }

        @NotNull
        public DeclarationDescriptor getOriginal() {
            return this;
        }

        public boolean shouldSeeInternalsOf(@NotNull ModuleDescriptor moduleDescriptor) {
            return false;
        }

        C191451() {
        }

        @NotNull
        public Annotations getAnnotations() {
            return Annotations.Companion.getEMPTY();
        }

        @NotNull
        public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1) {
            return C17554o.m64195a();
        }

        @NotNull
        public Name getName() {
            return Name.special("<ERROR MODULE>");
        }

        @NotNull
        public PackageViewDescriptor getPackage(@NotNull FqName fqName) {
            throw new IllegalStateException("Should not be called!");
        }

        @NotNull
        public KotlinBuiltIns getBuiltIns() {
            return DefaultBuiltIns.getInstance();
        }
    }

    private static class ErrorClassDescriptor extends ClassDescriptorImpl {
        @NotNull
        public ClassDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
            return this;
        }

        public ErrorClassDescriptor(@NotNull Name name) {
            super(ErrorUtils.getErrorModule(), name, Modality.OPEN, ClassKind.CLASS, Collections.emptyList(), SourceElement.NO_SOURCE, false);
            name = ClassConstructorDescriptorImpl.create(this, Annotations.Companion.getEMPTY(), true, SourceElement.NO_SOURCE);
            name.initialize(Collections.emptyList(), Visibilities.INTERNAL);
            MemberScope createErrorScope = ErrorUtils.createErrorScope(getName().asString());
            name.setReturnType(new ErrorType(ErrorUtils.createErrorTypeConstructorWithCustomDebugName("<ERROR>", this), createErrorScope));
            initialize(createErrorScope, Collections.singleton(name), name);
        }

        public String toString() {
            return getName().asString();
        }

        @NotNull
        public MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error scope for class ");
            stringBuilder.append(getName());
            stringBuilder.append(" with arguments: ");
            stringBuilder.append(typeSubstitution);
            return ErrorUtils.createErrorScope(stringBuilder.toString());
        }
    }

    @NotNull
    public static ClassDescriptor createErrorClass(@NotNull String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<ERROR CLASS: ");
        stringBuilder.append(str);
        stringBuilder.append(">");
        return new ErrorClassDescriptor(Name.special(stringBuilder.toString()));
    }

    @NotNull
    public static MemberScope createErrorScope(@NotNull String str) {
        return createErrorScope(str, false);
    }

    @NotNull
    public static MemberScope createErrorScope(@NotNull String str, boolean z) {
        if (z) {
            return new ThrowingScope(str);
        }
        return new ErrorScope(str);
    }

    @NotNull
    private static PropertyDescriptorImpl createErrorProperty() {
        PropertyDescriptorImpl create = PropertyDescriptorImpl.create(ERROR_CLASS, Annotations.Companion.getEMPTY(), Modality.OPEN, Visibilities.PUBLIC, true, Name.special("<ERROR PROPERTY>"), Kind.DECLARATION, SourceElement.NO_SOURCE, false, false, false, false, false, false);
        create.setType(ERROR_PROPERTY_TYPE, Collections.emptyList(), null, (KotlinType) null);
        return create;
    }

    @NotNull
    private static SimpleFunctionDescriptor createErrorFunction(@NotNull ErrorScope errorScope) {
        SimpleFunctionDescriptor errorSimpleFunctionDescriptorImpl = new ErrorSimpleFunctionDescriptorImpl(ERROR_CLASS, errorScope);
        errorSimpleFunctionDescriptorImpl.initialize(null, null, Collections.emptyList(), Collections.emptyList(), createErrorType("<ERROR FUNCTION RETURN TYPE>"), Modality.OPEN, Visibilities.PUBLIC);
        return errorSimpleFunctionDescriptorImpl;
    }

    @NotNull
    public static SimpleType createErrorType(@NotNull String str) {
        return createErrorTypeWithArguments(str, Collections.emptyList());
    }

    @NotNull
    public static SimpleType createErrorTypeWithCustomDebugName(@NotNull String str) {
        return createErrorTypeWithCustomConstructor(str, createErrorTypeConstructorWithCustomDebugName(str));
    }

    @NotNull
    public static SimpleType createErrorTypeWithCustomConstructor(@NotNull String str, @NotNull TypeConstructor typeConstructor) {
        return new ErrorType(typeConstructor, createErrorScope(str));
    }

    @NotNull
    public static SimpleType createErrorTypeWithArguments(@NotNull String str, @NotNull List<TypeProjection> list) {
        return new ErrorType(createErrorTypeConstructor(str), createErrorScope(str), list, false);
    }

    @NotNull
    public static TypeConstructor createErrorTypeConstructor(@NotNull String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ERROR : ");
        stringBuilder.append(str);
        stringBuilder.append("]");
        return createErrorTypeConstructorWithCustomDebugName(stringBuilder.toString(), ERROR_CLASS);
    }

    @NotNull
    public static TypeConstructor createErrorTypeConstructorWithCustomDebugName(@NotNull String str) {
        return createErrorTypeConstructorWithCustomDebugName(str, ERROR_CLASS);
    }

    @NotNull
    private static TypeConstructor createErrorTypeConstructorWithCustomDebugName(@NotNull final String str, @NotNull final ErrorClassDescriptor errorClassDescriptor) {
        return new TypeConstructor() {
            public boolean isDenotable() {
                return false;
            }

            @NotNull
            public List<TypeParameterDescriptor> getParameters() {
                return C17554o.m64195a();
            }

            @NotNull
            public Collection<KotlinType> getSupertypes() {
                return C17554o.m64195a();
            }

            @Nullable
            public ClassifierDescriptor getDeclarationDescriptor() {
                return errorClassDescriptor;
            }

            @NotNull
            public KotlinBuiltIns getBuiltIns() {
                return DefaultBuiltIns.getInstance();
            }

            public String toString() {
                return str;
            }
        };
    }

    public static boolean isError(@Nullable DeclarationDescriptor declarationDescriptor) {
        boolean z = false;
        if (declarationDescriptor == null) {
            return false;
        }
        if (isErrorClass(declarationDescriptor) || isErrorClass(declarationDescriptor.getContainingDeclaration()) || declarationDescriptor == ERROR_MODULE) {
            z = true;
        }
        return z;
    }

    private static boolean isErrorClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor instanceof ErrorClassDescriptor;
    }

    @NotNull
    public static ModuleDescriptor getErrorModule() {
        return ERROR_MODULE;
    }

    public static boolean isUninferredParameter(@Nullable KotlinType kotlinType) {
        return (kotlinType == null || (kotlinType.getConstructor() instanceof UninferredParameterTypeConstructor) == null) ? null : true;
    }
}
