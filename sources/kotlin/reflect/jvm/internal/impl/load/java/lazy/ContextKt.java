package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.TypeQualifierWithApplicability;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ContextKt {
    @NotNull
    public static final LazyJavaResolverContext child(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull TypeParameterResolver typeParameterResolver) {
        C2668g.b(lazyJavaResolverContext, "$receiver");
        C2668g.b(typeParameterResolver, "typeParameterResolver");
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), typeParameterResolver, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    @Nullable
    public static final JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Annotations annotations) {
        C2668g.b(lazyJavaResolverContext, "$receiver");
        C2668g.b(annotations, "additionalAnnotations");
        if (lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver().getDisabled()) {
            return lazyJavaResolverContext.getDefaultTypeQualifiers();
        }
        Collection arrayList = new ArrayList();
        for (AnnotationDescriptor extractDefaultNullabilityQualifier : annotations) {
            NullabilityQualifierWithApplicability extractDefaultNullabilityQualifier2 = extractDefaultNullabilityQualifier(lazyJavaResolverContext, extractDefaultNullabilityQualifier);
            if (extractDefaultNullabilityQualifier2 != null) {
                arrayList.add(extractDefaultNullabilityQualifier2);
            }
        }
        List<NullabilityQualifierWithApplicability> list = (List) arrayList;
        if (list.isEmpty() != null) {
            return lazyJavaResolverContext.getDefaultTypeQualifiers();
        }
        EnumMap enumMap;
        NullabilityQualifierWithMigrationStatus component1;
        annotations = lazyJavaResolverContext.getDefaultTypeQualifiers();
        if (annotations != null) {
            annotations = annotations.getNullabilityQualifiers$descriptors_jvm();
            if (annotations != null) {
                enumMap = new EnumMap(annotations);
                annotations = null;
                for (NullabilityQualifierWithApplicability nullabilityQualifierWithApplicability : list) {
                    component1 = nullabilityQualifierWithApplicability.component1();
                    for (QualifierApplicabilityType put : nullabilityQualifierWithApplicability.component2()) {
                        enumMap.put(put, component1);
                        boolean z = true;
                    }
                }
                return annotations != null ? lazyJavaResolverContext.getDefaultTypeQualifiers() : new JavaTypeQualifiersByElementType(enumMap);
            }
        }
        enumMap = new EnumMap(QualifierApplicabilityType.class);
        annotations = null;
        for (NullabilityQualifierWithApplicability nullabilityQualifierWithApplicability2 : list) {
            component1 = nullabilityQualifierWithApplicability2.component1();
            while (r2.hasNext()) {
                enumMap.put(put, component1);
                boolean z2 = true;
            }
        }
        if (annotations != null) {
        }
        return annotations != null ? lazyJavaResolverContext.getDefaultTypeQualifiers() : new JavaTypeQualifiersByElementType(enumMap);
    }

    private static final NullabilityQualifierWithApplicability extractDefaultNullabilityQualifier(@NotNull LazyJavaResolverContext lazyJavaResolverContext, AnnotationDescriptor annotationDescriptor) {
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver();
        NullabilityQualifierWithApplicability resolveQualifierBuiltInDefaultAnnotation = annotationTypeQualifierResolver.resolveQualifierBuiltInDefaultAnnotation(annotationDescriptor);
        if (resolveQualifierBuiltInDefaultAnnotation != null) {
            return resolveQualifierBuiltInDefaultAnnotation;
        }
        TypeQualifierWithApplicability resolveTypeQualifierDefaultAnnotation = annotationTypeQualifierResolver.resolveTypeQualifierDefaultAnnotation(annotationDescriptor);
        if (resolveTypeQualifierDefaultAnnotation == null) {
            return null;
        }
        AnnotationDescriptor component1 = resolveTypeQualifierDefaultAnnotation.component1();
        List component2 = resolveTypeQualifierDefaultAnnotation.component2();
        annotationDescriptor = annotationTypeQualifierResolver.resolveJsr305CustomState(annotationDescriptor);
        if (annotationDescriptor == null) {
            annotationDescriptor = annotationTypeQualifierResolver.resolveJsr305AnnotationState(component1);
        }
        if (annotationDescriptor.isIgnore()) {
            return null;
        }
        lazyJavaResolverContext = lazyJavaResolverContext.getComponents().getSignatureEnhancement().extractNullability(component1);
        if (lazyJavaResolverContext != null) {
            lazyJavaResolverContext = NullabilityQualifierWithMigrationStatus.copy$default(lazyJavaResolverContext, null, annotationDescriptor.isWarning(), 1, null);
            if (lazyJavaResolverContext != null) {
                return new NullabilityQualifierWithApplicability(lazyJavaResolverContext, component2);
            }
        }
        return null;
    }

    @NotNull
    public static final LazyJavaResolverContext replaceComponents(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaResolverComponents javaResolverComponents) {
        C2668g.b(lazyJavaResolverContext, "$receiver");
        C2668g.b(javaResolverComponents, "components");
        return new LazyJavaResolverContext(javaResolverComponents, lazyJavaResolverContext.getTypeParameterResolver(), lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    private static final LazyJavaResolverContext child(@NotNull LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, Lazy<JavaTypeQualifiersByElementType> lazy) {
        TypeParameterResolver lazyJavaTypeParameterResolver;
        JavaResolverComponents components = lazyJavaResolverContext.getComponents();
        if (javaTypeParameterListOwner != null) {
            lazyJavaTypeParameterResolver = new LazyJavaTypeParameterResolver(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i);
        } else {
            lazyJavaTypeParameterResolver = lazyJavaResolverContext.getTypeParameterResolver();
        }
        return new LazyJavaResolverContext(components, lazyJavaTypeParameterResolver, lazy);
    }

    @NotNull
    public static /* synthetic */ LazyJavaResolverContext childForMethod$default(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForMethod(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i);
    }

    @NotNull
    public static final LazyJavaResolverContext childForMethod(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        C2668g.b(lazyJavaResolverContext, "$receiver");
        C2668g.b(declarationDescriptor, "containingDeclaration");
        C2668g.b(javaTypeParameterListOwner, "typeParameterOwner");
        return child(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    @NotNull
    public static /* synthetic */ LazyJavaResolverContext childForClassOrPackage$default(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i, int i2, Object obj) {
        if ((i2 & 2) != null) {
            javaTypeParameterListOwner = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForClassOrPackage(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i);
    }

    @NotNull
    public static final LazyJavaResolverContext childForClassOrPackage(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, @Nullable JavaTypeParameterListOwner javaTypeParameterListOwner, int i) {
        C2668g.b(lazyJavaResolverContext, "$receiver");
        C2668g.b(classOrPackageFragmentDescriptor, "containingDeclaration");
        return child(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i, C15810e.m59832a(LazyThreadSafetyMode.NONE, new ContextKt$childForClassOrPackage$1(lazyJavaResolverContext, classOrPackageFragmentDescriptor)));
    }

    @NotNull
    public static final LazyJavaResolverContext copyWithNewDefaultTypeQualifiers(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Annotations annotations) {
        C2668g.b(lazyJavaResolverContext, "$receiver");
        C2668g.b(annotations, "additionalAnnotations");
        return annotations.isEmpty() ? lazyJavaResolverContext : new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), lazyJavaResolverContext.getTypeParameterResolver(), C15810e.m59832a(LazyThreadSafetyMode.NONE, new ContextKt$copyWithNewDefaultTypeQualifiers$1(lazyJavaResolverContext, annotations)));
    }
}
