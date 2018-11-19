package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19293u;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import org.jetbrains.annotations.NotNull;

public interface ClassifierNamePolicy {

    public static final class FULLY_QUALIFIED implements ClassifierNamePolicy {
        public static final FULLY_QUALIFIED INSTANCE = new FULLY_QUALIFIED();

        private FULLY_QUALIFIED() {
        }

        @NotNull
        public String renderClassifier(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer) {
            C2668g.b(classifierDescriptor, "classifier");
            C2668g.b(descriptorRenderer, "renderer");
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                classifierDescriptor = ((TypeParameterDescriptor) classifierDescriptor).getName();
                C2668g.a(classifierDescriptor, "classifier.name");
                return descriptorRenderer.renderName(classifierDescriptor);
            }
            classifierDescriptor = DescriptorUtils.getFqName(classifierDescriptor);
            C2668g.a(classifierDescriptor, "DescriptorUtils.getFqName(classifier)");
            return descriptorRenderer.renderFqName(classifierDescriptor);
        }
    }

    public static final class SHORT implements ClassifierNamePolicy {
        public static final SHORT INSTANCE = new SHORT();

        private SHORT() {
        }

        @NotNull
        public String renderClassifier(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer) {
            C2668g.b(classifierDescriptor, "classifier");
            C2668g.b(descriptorRenderer, "renderer");
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                classifierDescriptor = ((TypeParameterDescriptor) classifierDescriptor).getName();
                C2668g.a(classifierDescriptor, "classifier.name");
                return descriptorRenderer.renderName(classifierDescriptor);
            }
            descriptorRenderer = new ArrayList();
            classifierDescriptor = classifierDescriptor;
            do {
                descriptorRenderer.add(classifierDescriptor.getName());
                classifierDescriptor = classifierDescriptor.getContainingDeclaration();
            } while (classifierDescriptor instanceof ClassDescriptor);
            return RenderingUtilsKt.renderFqName(C19293u.m68667d((List) descriptorRenderer));
        }
    }

    public static final class SOURCE_CODE_QUALIFIED implements ClassifierNamePolicy {
        public static final SOURCE_CODE_QUALIFIED INSTANCE = new SOURCE_CODE_QUALIFIED();

        private SOURCE_CODE_QUALIFIED() {
        }

        @NotNull
        public String renderClassifier(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer) {
            C2668g.b(classifierDescriptor, "classifier");
            C2668g.b(descriptorRenderer, "renderer");
            return qualifiedNameForSourceCode(classifierDescriptor);
        }

        private final String qualifiedNameForSourceCode(ClassifierDescriptor classifierDescriptor) {
            Name name = classifierDescriptor.getName();
            C2668g.a(name, "descriptor.name");
            String render = RenderingUtilsKt.render(name);
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                return render;
            }
            classifierDescriptor = classifierDescriptor.getContainingDeclaration();
            C2668g.a(classifierDescriptor, "descriptor.containingDeclaration");
            classifierDescriptor = qualifierName(classifierDescriptor);
            if (!(classifierDescriptor == null || (C2668g.a(classifierDescriptor, "") ^ 1) == 0)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(classifierDescriptor);
                stringBuilder.append(".");
                stringBuilder.append(render);
                render = stringBuilder.toString();
            }
            return render;
        }

        private final String qualifierName(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                return qualifiedNameForSourceCode((ClassifierDescriptor) declarationDescriptor);
            }
            if (!(declarationDescriptor instanceof PackageFragmentDescriptor)) {
                return null;
            }
            FqNameUnsafe toUnsafe = ((PackageFragmentDescriptor) declarationDescriptor).getFqName().toUnsafe();
            C2668g.a(toUnsafe, "descriptor.fqName.toUnsafe()");
            return RenderingUtilsKt.render(toUnsafe);
        }
    }

    @NotNull
    String renderClassifier(@NotNull ClassifierDescriptor classifierDescriptor, @NotNull DescriptorRenderer descriptorRenderer);
}
