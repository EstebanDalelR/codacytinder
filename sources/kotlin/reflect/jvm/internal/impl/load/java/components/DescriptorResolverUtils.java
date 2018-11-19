package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.C15813i;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DescriptorResolverUtils {
    @NotNull
    public static <D extends CallableMemberDescriptor> Collection<D> resolveOverridesForNonStaticMembers(@NotNull Name name, @NotNull Collection<D> collection, @NotNull Collection<D> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull ErrorReporter errorReporter) {
        return resolveOverrides(name, collection, collection2, classDescriptor, errorReporter, false);
    }

    @NotNull
    public static <D extends CallableMemberDescriptor> Collection<D> resolveOverridesForStaticMembers(@NotNull Name name, @NotNull Collection<D> collection, @NotNull Collection<D> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull ErrorReporter errorReporter) {
        return resolveOverrides(name, collection, collection2, classDescriptor, errorReporter, true);
    }

    @NotNull
    private static <D extends CallableMemberDescriptor> Collection<D> resolveOverrides(@NotNull Name name, @NotNull Collection<D> collection, @NotNull Collection<D> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull final ErrorReporter errorReporter, final boolean z) {
        final Collection linkedHashSet = new LinkedHashSet();
        OverridingUtil.generateOverridesInFunctionGroup(name, collection, collection2, classDescriptor, new NonReportingOverrideStrategy() {

            /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils$1$1 */
            class C184821 implements Function1<CallableMemberDescriptor, C15813i> {
                C184821() {
                }

                public C15813i invoke(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
                    errorReporter.reportCannotInferVisibility(callableMemberDescriptor);
                    return C15813i.f49016a;
                }
            }

            public void conflict(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
            }

            public void addFakeOverride(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
                OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, new C184821());
                linkedHashSet.add(callableMemberDescriptor);
            }

            public void setOverriddenDescriptors(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Collection<? extends CallableMemberDescriptor> collection) {
                if (!z || callableMemberDescriptor.getKind() == Kind.FAKE_OVERRIDE) {
                    super.setOverriddenDescriptors(callableMemberDescriptor, collection);
                }
            }
        });
        return linkedHashSet;
    }

    @Nullable
    public static ValueParameterDescriptor getAnnotationParameterByName(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
        classDescriptor = classDescriptor.getConstructors();
        if (classDescriptor.size() != 1) {
            return null;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : ((ClassConstructorDescriptor) classDescriptor.iterator().next()).getValueParameters()) {
            if (valueParameterDescriptor.getName().equals(name)) {
                return valueParameterDescriptor;
            }
        }
        return null;
    }

    public static boolean isObjectMethodInInterface(@NotNull JavaMember javaMember) {
        return (javaMember.getContainingClass().isInterface() && (javaMember instanceof JavaMethod) && isObjectMethod((JavaMethod) javaMember) != null) ? true : null;
    }

    public static boolean isObjectMethod(@NotNull JavaMethod javaMethod) {
        String asString = javaMethod.getName().asString();
        if (!asString.equals("toString")) {
            if (!asString.equals("hashCode")) {
                return asString.equals("equals") ? isMethodWithOneParameterWithFqName(javaMethod, "java.lang.Object") : null;
            }
        }
        return javaMethod.getValueParameters().isEmpty();
    }

    private static boolean isMethodWithOneParameterWithFqName(@NotNull JavaMethod javaMethod, @NotNull String str) {
        javaMethod = javaMethod.getValueParameters();
        boolean z = true;
        if (javaMethod.size() == 1) {
            javaMethod = ((JavaValueParameter) javaMethod.get(0)).getType();
            if (javaMethod instanceof JavaClassifierType) {
                javaMethod = ((JavaClassifierType) javaMethod).getClassifier();
                if (javaMethod instanceof JavaClass) {
                    javaMethod = ((JavaClass) javaMethod).getFqName();
                    if (javaMethod == null || javaMethod.asString().equals(str) == null) {
                        z = false;
                    }
                    return z;
                }
            }
        }
        return false;
    }
}
