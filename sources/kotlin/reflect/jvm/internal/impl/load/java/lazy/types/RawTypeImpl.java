package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Collection;
import java.util.List;
import kotlin.C15819j;
import kotlin.Pair;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class RawTypeImpl extends FlexibleType implements RawType {
    public RawTypeImpl(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        C2668g.b(simpleType, "lowerBound");
        C2668g.b(simpleType2, "upperBound");
        super(simpleType, simpleType2);
        boolean isSubtypeOf = KotlinTypeChecker.DEFAULT.isSubtypeOf(simpleType, simpleType2);
        if (C15819j.f49018a && !isSubtypeOf) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Lower bound ");
            stringBuilder.append(simpleType);
            stringBuilder.append(" of a flexible type must be a subtype of the upper bound ");
            stringBuilder.append(simpleType2);
            throw ((Throwable) new AssertionError(stringBuilder.toString()));
        }
    }

    @NotNull
    public SimpleType getDelegate() {
        return getLowerBound();
    }

    @NotNull
    public MemberScope getMemberScope() {
        ClassifierDescriptor declarationDescriptor = getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof ClassDescriptor)) {
            declarationDescriptor = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        if (classDescriptor != null) {
            MemberScope memberScope = classDescriptor.getMemberScope(RawSubstitution.INSTANCE);
            C2668g.a(memberScope, "classDescriptor.getMemberScope(RawSubstitution)");
            return memberScope;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Incorrect classifier: ");
        stringBuilder.append(getConstructor().getDeclarationDescriptor());
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    @NotNull
    public RawTypeImpl replaceAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "newAnnotations");
        return new RawTypeImpl(getLowerBound().replaceAnnotations(annotations), getUpperBound().replaceAnnotations(annotations));
    }

    @NotNull
    public RawTypeImpl makeNullableAsSpecified(boolean z) {
        return new RawTypeImpl(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }

    @NotNull
    public String render(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions) {
        C2668g.b(descriptorRenderer, "renderer");
        C2668g.b(descriptorRendererOptions, "options");
        RawTypeImpl$render$1 rawTypeImpl$render$1 = RawTypeImpl$render$1.INSTANCE;
        RawTypeImpl$render$2 rawTypeImpl$render$2 = new RawTypeImpl$render$2(descriptorRenderer);
        RawTypeImpl$render$3 rawTypeImpl$render$3 = RawTypeImpl$render$3.INSTANCE;
        String renderType = descriptorRenderer.renderType(getLowerBound());
        String renderType2 = descriptorRenderer.renderType(getUpperBound());
        if (descriptorRendererOptions.getDebugMode() != null) {
            descriptorRenderer = new StringBuilder();
            descriptorRenderer.append("raw (");
            descriptorRenderer.append(renderType);
            descriptorRenderer.append("..");
            descriptorRenderer.append(renderType2);
            descriptorRenderer.append(')');
            return descriptorRenderer.toString();
        } else if (getUpperBound().getArguments().isEmpty() != null) {
            return descriptorRenderer.renderFlexibleType(renderType, renderType2, TypeUtilsKt.getBuiltIns(this));
        } else {
            descriptorRendererOptions = rawTypeImpl$render$2.invoke((KotlinType) getLowerBound());
            List invoke = rawTypeImpl$render$2.invoke((KotlinType) getUpperBound());
            Iterable iterable = (Iterable) descriptorRendererOptions;
            String a = C19299w.m68797a(iterable, ", ", null, null, 0, null, RawTypeImpl$render$newArgs$1.INSTANCE, 30, null);
            Iterable<Pair> c = C19299w.m68815c(iterable, (Iterable) invoke);
            Object obj = 1;
            if (!(c instanceof Collection) || !((Collection) c).isEmpty()) {
                for (Pair pair : c) {
                    if (!RawTypeImpl$render$1.INSTANCE.invoke((String) pair.m59803a(), (String) pair.m59804b())) {
                        obj = null;
                        break;
                    }
                }
            }
            if (obj != null) {
                renderType2 = rawTypeImpl$render$3.invoke(renderType2, a);
            }
            descriptorRendererOptions = rawTypeImpl$render$3.invoke(renderType, a);
            if (C2668g.a(descriptorRendererOptions, renderType2)) {
                return descriptorRendererOptions;
            }
            return descriptorRenderer.renderFlexibleType(descriptorRendererOptions, renderType2, TypeUtilsKt.getBuiltIns(this));
        }
    }
}
