package kotlin.reflect.jvm.internal.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19066k;
import kotlin.jvm.C15820a;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\f\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\r\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0001H\u0002J$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002J\u001a\u0010\u0018\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectClassStructure;", "", "()V", "loadClassAnnotations", "", "klass", "Ljava/lang/Class;", "visitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationVisitor;", "loadConstructorAnnotations", "memberVisitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$MemberVisitor;", "loadFieldAnnotations", "loadMethodAnnotations", "processAnnotation", "annotation", "", "processAnnotationArgumentValue", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationArgumentVisitor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "value", "processAnnotationArguments", "annotationType", "visitMembers", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
final class ReflectClassStructure {
    public static final ReflectClassStructure INSTANCE = new ReflectClassStructure();

    private ReflectClassStructure() {
    }

    public final void loadClassAnnotations(@NotNull Class<?> cls, @NotNull AnnotationVisitor annotationVisitor) {
        C2668g.b(cls, "klass");
        C2668g.b(annotationVisitor, "visitor");
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            C2668g.a(annotation, "annotation");
            processAnnotation(annotationVisitor, annotation);
        }
        annotationVisitor.visitEnd();
    }

    public final void visitMembers(@NotNull Class<?> cls, @NotNull MemberVisitor memberVisitor) {
        C2668g.b(cls, "klass");
        C2668g.b(memberVisitor, "memberVisitor");
        loadMethodAnnotations(cls, memberVisitor);
        loadConstructorAnnotations(cls, memberVisitor);
        loadFieldAnnotations(cls, memberVisitor);
    }

    private final void loadMethodAnnotations(Class<?> cls, MemberVisitor memberVisitor) {
        ReflectClassStructure reflectClassStructure;
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method[] methodArr;
            Method method = declaredMethods[i];
            C2668g.a(method, "method");
            Name identifier = Name.identifier(method.getName());
            C2668g.a(identifier, "Name.identifier(method.name)");
            MethodAnnotationVisitor visitMethod = memberVisitor.visitMethod(identifier, SignatureSerializer.INSTANCE.methodDesc(method));
            if (visitMethod != null) {
                int i2;
                for (Annotation annotation : method.getDeclaredAnnotations()) {
                    AnnotationVisitor annotationVisitor = visitMethod;
                    C2668g.a(annotation, "annotation");
                    processAnnotation(annotationVisitor, annotation);
                }
                reflectClassStructure = this;
                Object parameterAnnotations = method.getParameterAnnotations();
                C2668g.a(parameterAnnotations, "method.parameterAnnotations");
                int length2 = parameterAnnotations.length;
                for (i2 = 0; i2 < length2; i2++) {
                    Annotation[] annotationArr = parameterAnnotations[i2];
                    int length3 = annotationArr.length;
                    int i3 = 0;
                    while (i3 < length3) {
                        Annotation annotation2 = annotationArr[i3];
                        Class a = C15820a.m59849a(C15820a.m59851a(annotation2));
                        ClassId classId = ReflectClassUtilKt.getClassId(a);
                        methodArr = declaredMethods;
                        C2668g.a(annotation2, "annotation");
                        AnnotationArgumentVisitor visitParameterAnnotation = visitMethod.visitParameterAnnotation(i2, classId, new ReflectAnnotationSource(annotation2));
                        if (visitParameterAnnotation != null) {
                            INSTANCE.processAnnotationArguments(visitParameterAnnotation, annotation2, a);
                        }
                        i3++;
                        declaredMethods = methodArr;
                    }
                    methodArr = declaredMethods;
                }
                methodArr = declaredMethods;
                visitMethod.visitEnd();
            } else {
                reflectClassStructure = this;
                methodArr = declaredMethods;
            }
            i++;
            declaredMethods = methodArr;
        }
        reflectClassStructure = this;
    }

    private final void loadConstructorAnnotations(Class<?> cls, MemberVisitor memberVisitor) {
        ReflectClassStructure reflectClassStructure;
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i = 0;
        while (i < length) {
            Constructor[] constructorArr;
            int i2;
            Constructor constructor = declaredConstructors[i];
            Name special = Name.special("<init>");
            C2668g.a(special, "Name.special(\"<init>\")");
            SignatureSerializer signatureSerializer = SignatureSerializer.INSTANCE;
            C2668g.a(constructor, "constructor");
            MethodAnnotationVisitor visitMethod = memberVisitor.visitMethod(special, signatureSerializer.constructorDesc(constructor));
            if (visitMethod != null) {
                int i3;
                int length2;
                for (Annotation annotation : constructor.getDeclaredAnnotations()) {
                    AnnotationVisitor annotationVisitor = visitMethod;
                    C2668g.a(annotation, "annotation");
                    processAnnotation(annotationVisitor, annotation);
                }
                reflectClassStructure = this;
                Object parameterAnnotations = constructor.getParameterAnnotations();
                C2668g.a(parameterAnnotations, "parameterAnnotations");
                Object[] objArr = (Object[]) parameterAnnotations;
                if (((objArr.length == 0 ? 1 : 0) ^ 1) != 0) {
                    int length3 = constructor.getParameterTypes().length - objArr.length;
                    length2 = parameterAnnotations.length;
                    for (i3 = 0; i3 < length2; i3++) {
                        int i4;
                        Annotation[] annotationArr = parameterAnnotations[i3];
                        int length4 = annotationArr.length;
                        int i5 = 0;
                        while (i5 < length4) {
                            Annotation annotation2 = annotationArr[i5];
                            Class a = C15820a.m59849a(C15820a.m59851a(annotation2));
                            int i6 = i3 + length3;
                            constructorArr = declaredConstructors;
                            ClassId classId = ReflectClassUtilKt.getClassId(a);
                            i2 = length;
                            i4 = length3;
                            C2668g.a(annotation2, "annotation");
                            AnnotationArgumentVisitor visitParameterAnnotation = visitMethod.visitParameterAnnotation(i6, classId, new ReflectAnnotationSource(annotation2));
                            if (visitParameterAnnotation != null) {
                                INSTANCE.processAnnotationArguments(visitParameterAnnotation, annotation2, a);
                            }
                            i5++;
                            declaredConstructors = constructorArr;
                            length = i2;
                            length3 = i4;
                        }
                        constructorArr = declaredConstructors;
                        i2 = length;
                        i4 = length3;
                    }
                }
                constructorArr = declaredConstructors;
                i2 = length;
                visitMethod.visitEnd();
            } else {
                reflectClassStructure = this;
                constructorArr = declaredConstructors;
                i2 = length;
            }
            i++;
            declaredConstructors = constructorArr;
            length = i2;
        }
        reflectClassStructure = this;
    }

    private final void loadFieldAnnotations(Class<?> cls, MemberVisitor memberVisitor) {
        for (Field field : cls.getDeclaredFields()) {
            C2668g.a(field, "field");
            Name identifier = Name.identifier(field.getName());
            C2668g.a(identifier, "Name.identifier(field.name)");
            AnnotationVisitor visitField = memberVisitor.visitField(identifier, SignatureSerializer.INSTANCE.fieldDesc(field), null);
            if (visitField != null) {
                for (Annotation annotation : field.getDeclaredAnnotations()) {
                    C2668g.a(annotation, "annotation");
                    processAnnotation(visitField, annotation);
                }
                visitField.visitEnd();
            }
        }
    }

    private final void processAnnotation(AnnotationVisitor annotationVisitor, Annotation annotation) {
        Class a = C15820a.m59849a(C15820a.m59851a(annotation));
        annotationVisitor = annotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(a), new ReflectAnnotationSource(annotation));
        if (annotationVisitor != null) {
            INSTANCE.processAnnotationArguments(annotationVisitor, annotation, a);
        }
    }

    private final void processAnnotationArguments(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor r7, java.lang.annotation.Annotation r8, java.lang.Class<?> r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r9 = r9.getDeclaredMethods();
        r0 = r9.length;
        r1 = 0;
        r2 = 0;
    L_0x0007:
        if (r2 >= r0) goto L_0x002e;
    L_0x0009:
        r3 = r9[r2];
        r4 = new java.lang.Object[r1];	 Catch:{ IllegalAccessException -> 0x002b }
        r4 = r3.invoke(r8, r4);	 Catch:{ IllegalAccessException -> 0x002b }
        if (r4 != 0) goto L_0x0016;	 Catch:{ IllegalAccessException -> 0x002b }
    L_0x0013:
        kotlin.jvm.internal.C2668g.a();	 Catch:{ IllegalAccessException -> 0x002b }
    L_0x0016:
        r5 = "method";
        kotlin.jvm.internal.C2668g.a(r3, r5);
        r3 = r3.getName();
        r3 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(r3);
        r5 = "Name.identifier(method.name)";
        kotlin.jvm.internal.C2668g.a(r3, r5);
        r6.processAnnotationArgumentValue(r7, r3, r4);
    L_0x002b:
        r2 = r2 + 1;
        goto L_0x0007;
    L_0x002e:
        r7.visitEnd();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.components.ReflectClassStructure.processAnnotationArguments(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass$AnnotationArgumentVisitor, java.lang.annotation.Annotation, java.lang.Class):void");
    }

    private final void processAnnotationArgumentValue(AnnotationArgumentVisitor annotationArgumentVisitor, Name name, Object obj) {
        Class cls = obj.getClass();
        if (ReflectKotlinClassKt.TYPES_ELIGIBLE_FOR_SIMPLE_VISIT.contains(cls)) {
            annotationArgumentVisitor.visit(name, obj);
        } else if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            C2668g.a(cls, "(if (clazz.isEnum) clazz…lse clazz.enclosingClass)");
            ClassId classId = ReflectClassUtilKt.getClassId(cls);
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Enum<*>");
            }
            obj = Name.identifier(((Enum) obj).name());
            C2668g.a(obj, "Name.identifier((value as Enum<*>).name)");
            annotationArgumentVisitor.visitEnum(name, classId, obj);
        } else if (Annotation.class.isAssignableFrom(cls)) {
            Object interfaces = cls.getInterfaces();
            C2668g.a(interfaces, "clazz.interfaces");
            cls = (Class) C19066k.m68003f((Object[]) interfaces);
            C2668g.a(cls, "annotationClass");
            annotationArgumentVisitor = annotationArgumentVisitor.visitAnnotation(name, ReflectClassUtilKt.getClassId(cls));
            if (annotationArgumentVisitor == null) {
                return;
            }
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Annotation");
            }
            processAnnotationArguments(annotationArgumentVisitor, (Annotation) obj, cls);
        } else if (cls.isArray()) {
            annotationArgumentVisitor = annotationArgumentVisitor.visitArray(name);
            if (annotationArgumentVisitor != null) {
                name = cls.getComponentType();
                C2668g.a(name, "componentType");
                int i = 0;
                Object[] objArr;
                if (name.isEnum()) {
                    name = ReflectClassUtilKt.getClassId(name);
                    if (obj == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                    }
                    objArr = (Object[]) obj;
                    int length = objArr.length;
                    while (i < length) {
                        Object obj2 = objArr[i];
                        if (obj2 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Enum<*>");
                        }
                        Name identifier = Name.identifier(((Enum) obj2).name());
                        C2668g.a(identifier, "Name.identifier((element as Enum<*>).name)");
                        annotationArgumentVisitor.visitEnum(name, identifier);
                        i++;
                    }
                } else if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                } else {
                    objArr = (Object[]) obj;
                    name = objArr.length;
                    while (i < name) {
                        annotationArgumentVisitor.visit(objArr[i]);
                        i++;
                    }
                }
                annotationArgumentVisitor.visitEnd();
            }
        } else {
            name = new StringBuilder();
            name.append("Unsupported annotation argument value (");
            name.append(cls);
            name.append("): ");
            name.append(obj);
            throw ((Throwable) new UnsupportedOperationException(name.toString()));
        }
    }
}
