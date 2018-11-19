package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Map;
import kotlin.C15811g;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaAnnotationMapper {
    @NotNull
    private static final Name DEPRECATED_ANNOTATION_MESSAGE = Name.identifier("message");
    public static final JavaAnnotationMapper INSTANCE = new JavaAnnotationMapper();
    private static final FqName JAVA_DEPRECATED_FQ_NAME = new FqName(Deprecated.class.getCanonicalName());
    private static final FqName JAVA_DOCUMENTED_FQ_NAME = new FqName(Documented.class.getCanonicalName());
    private static final FqName JAVA_REPEATABLE_FQ_NAME = new FqName("java.lang.annotation.Repeatable");
    private static final FqName JAVA_RETENTION_FQ_NAME = new FqName(Retention.class.getCanonicalName());
    private static final FqName JAVA_TARGET_FQ_NAME = new FqName(Target.class.getCanonicalName());
    @NotNull
    private static final Name RETENTION_ANNOTATION_VALUE = Name.identifier("value");
    @NotNull
    private static final Name TARGET_ANNOTATION_ALLOWED_TARGETS = Name.identifier("allowedTargets");
    @NotNull
    private static final Map<FqName, FqName> javaToKotlinNameMap = ah.m66889a(C15811g.m59834a(JAVA_TARGET_FQ_NAME, KotlinBuiltIns.FQ_NAMES.target), C15811g.m59834a(JAVA_RETENTION_FQ_NAME, KotlinBuiltIns.FQ_NAMES.retention), C15811g.m59834a(JAVA_DEPRECATED_FQ_NAME, KotlinBuiltIns.FQ_NAMES.deprecated), C15811g.m59834a(JAVA_REPEATABLE_FQ_NAME, KotlinBuiltIns.FQ_NAMES.repeatable), C15811g.m59834a(JAVA_DOCUMENTED_FQ_NAME, KotlinBuiltIns.FQ_NAMES.mustBeDocumented));
    private static final Map<FqName, FqName> kotlinToJavaNameMap = ah.m66889a(C15811g.m59834a(KotlinBuiltIns.FQ_NAMES.target, JAVA_TARGET_FQ_NAME), C15811g.m59834a(KotlinBuiltIns.FQ_NAMES.retention, JAVA_RETENTION_FQ_NAME), C15811g.m59834a(KotlinBuiltIns.FQ_NAMES.repeatable, JAVA_REPEATABLE_FQ_NAME), C15811g.m59834a(KotlinBuiltIns.FQ_NAMES.mustBeDocumented, JAVA_DOCUMENTED_FQ_NAME));

    private JavaAnnotationMapper() {
    }

    @NotNull
    public final Name getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm() {
        return DEPRECATED_ANNOTATION_MESSAGE;
    }

    @NotNull
    public final Name getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm() {
        return TARGET_ANNOTATION_ALLOWED_TARGETS;
    }

    @NotNull
    public final Name getRETENTION_ANNOTATION_VALUE$descriptors_jvm() {
        return RETENTION_ANNOTATION_VALUE;
    }

    @Nullable
    public final AnnotationDescriptor mapOrResolveJavaAnnotation(@NotNull JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        C2668g.b(javaAnnotation, "annotation");
        C2668g.b(lazyJavaResolverContext, "c");
        ClassId classId = javaAnnotation.getClassId();
        if (C2668g.a(classId, ClassId.topLevel(JAVA_TARGET_FQ_NAME))) {
            return new JavaTargetAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        if (C2668g.a(classId, ClassId.topLevel(JAVA_RETENTION_FQ_NAME))) {
            return new JavaRetentionAnnotationDescriptor(javaAnnotation, lazyJavaResolverContext);
        }
        FqName fqName;
        if (C2668g.a(classId, ClassId.topLevel(JAVA_REPEATABLE_FQ_NAME))) {
            fqName = KotlinBuiltIns.FQ_NAMES.repeatable;
            C2668g.a(fqName, "KotlinBuiltIns.FQ_NAMES.repeatable");
            return new JavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, fqName);
        } else if (C2668g.a(classId, ClassId.topLevel(JAVA_DOCUMENTED_FQ_NAME))) {
            fqName = KotlinBuiltIns.FQ_NAMES.mustBeDocumented;
            C2668g.a(fqName, "KotlinBuiltIns.FQ_NAMES.mustBeDocumented");
            return new JavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, fqName);
        } else if (C2668g.a(classId, ClassId.topLevel(JAVA_DEPRECATED_FQ_NAME))) {
            return null;
        } else {
            return new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation);
        }
    }

    @Nullable
    public final AnnotationDescriptor findMappedJavaAnnotation(@NotNull FqName fqName, @NotNull JavaAnnotationOwner javaAnnotationOwner, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        C2668g.b(fqName, "kotlinName");
        C2668g.b(javaAnnotationOwner, "annotationOwner");
        C2668g.b(lazyJavaResolverContext, "c");
        if (C2668g.a(fqName, KotlinBuiltIns.FQ_NAMES.deprecated)) {
            JavaAnnotation findAnnotation = javaAnnotationOwner.findAnnotation(JAVA_DEPRECATED_FQ_NAME);
            if (findAnnotation != null || javaAnnotationOwner.isDeprecatedInJavaDoc()) {
                return (AnnotationDescriptor) new JavaDeprecatedAnnotationDescriptor(findAnnotation, lazyJavaResolverContext);
            }
        }
        fqName = (FqName) kotlinToJavaNameMap.get(fqName);
        AnnotationDescriptor annotationDescriptor = null;
        if (fqName != null) {
            fqName = javaAnnotationOwner.findAnnotation(fqName);
            if (fqName != null) {
                annotationDescriptor = INSTANCE.mapOrResolveJavaAnnotation(fqName, lazyJavaResolverContext);
            }
        }
        return annotationDescriptor;
    }
}
