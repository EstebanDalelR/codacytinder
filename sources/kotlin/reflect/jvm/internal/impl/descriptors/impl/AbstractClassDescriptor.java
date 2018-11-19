package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractClassDescriptor implements ClassDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected final NotNullLazyValue<SimpleType> defaultType;
    private final Name name;
    private final NotNullLazyValue<ReceiverParameterDescriptor> thisAsReceiverParameter;
    private final NotNullLazyValue<MemberScope> unsubstitutedInnerClassesScope;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$1 */
    class C184701 implements Function0<SimpleType> {
        C184701() {
        }

        public SimpleType invoke() {
            return TypeUtils.makeUnsubstitutedType(AbstractClassDescriptor.this, AbstractClassDescriptor.this.getUnsubstitutedMemberScope());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$2 */
    class C184712 implements Function0<MemberScope> {
        C184712() {
        }

        public MemberScope invoke() {
            return new InnerClassesScopeWrapper(AbstractClassDescriptor.this.getUnsubstitutedMemberScope());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$3 */
    class C184723 implements Function0<ReceiverParameterDescriptor> {
        C184723() {
        }

        public ReceiverParameterDescriptor invoke() {
            return new LazyClassReceiverParameterDescriptor(AbstractClassDescriptor.this);
        }
    }

    @NotNull
    public ClassDescriptor getOriginal() {
        return this;
    }

    public AbstractClassDescriptor(@NotNull StorageManager storageManager, @NotNull Name name) {
        this.name = name;
        this.defaultType = storageManager.createLazyValue(new C184701());
        this.unsubstitutedInnerClassesScope = storageManager.createLazyValue(new C184712());
        this.thisAsReceiverParameter = storageManager.createLazyValue(new C184723());
    }

    @NotNull
    public Name getName() {
        return this.name;
    }

    @NotNull
    public MemberScope getUnsubstitutedInnerClassesScope() {
        return (MemberScope) this.unsubstitutedInnerClassesScope.invoke();
    }

    @NotNull
    public ReceiverParameterDescriptor getThisAsReceiverParameter() {
        return (ReceiverParameterDescriptor) this.thisAsReceiverParameter.invoke();
    }

    @NotNull
    public MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution.isEmpty()) {
            return getUnsubstitutedMemberScope();
        }
        return new SubstitutingScope(getUnsubstitutedMemberScope(), TypeSubstitutor.create(typeSubstitution));
    }

    @NotNull
    public ClassDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor.isEmpty()) {
            return this;
        }
        return new LazySubstitutingClassDescriptor(this, typeSubstitutor);
    }

    @NotNull
    public SimpleType getDefaultType() {
        return (SimpleType) this.defaultType.invoke();
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d);
    }
}
