package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationWithTarget;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>, AnnotationWithTarget> {
    private final AnnotationDeserializer annotationDeserializer = new AnnotationDeserializer(this.module, this.notFoundClasses);
    private final ModuleDescriptor module;
    private final NotFoundClasses notFoundClasses;

    public BinaryClassAnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses, @NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder) {
        C2668g.b(moduleDescriptor, "module");
        C2668g.b(notFoundClasses, "notFoundClasses");
        C2668g.b(storageManager, "storageManager");
        C2668g.b(kotlinClassFinder, "kotlinClassFinder");
        super(storageManager, kotlinClassFinder);
        this.module = moduleDescriptor;
        this.notFoundClasses = notFoundClasses;
    }

    @NotNull
    protected AnnotationDescriptor loadTypeAnnotation(@NotNull Annotation annotation, @NotNull NameResolver nameResolver) {
        C2668g.b(annotation, "proto");
        C2668g.b(nameResolver, "nameResolver");
        return this.annotationDeserializer.deserializeAnnotation(annotation, nameResolver);
    }

    @Nullable
    protected ConstantValue<?> loadConstant(@NotNull String str, @NotNull Object obj) {
        C2668g.b(str, "desc");
        C2668g.b(obj, "initializer");
        boolean z = false;
        if (C19298r.m68786b((CharSequence) "ZBCS", (CharSequence) str, false, 2, null)) {
            obj = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode != 83) {
                if (hashCode != 90) {
                    switch (hashCode) {
                        case 66:
                            if (str.equals("B")) {
                                obj = Byte.valueOf((byte) obj);
                                break;
                            }
                            break;
                        case 67:
                            if (str.equals("C")) {
                                obj = Character.valueOf((char) obj);
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                } else if (str.equals("Z")) {
                    if (obj != null) {
                        z = true;
                    }
                    obj = Boolean.valueOf(z);
                }
            } else if (str.equals("S")) {
                obj = Short.valueOf((short) obj);
            }
            throw ((Throwable) new AssertionError(str));
        }
        return ConstantValueFactory.INSTANCE.createConstantValue(obj);
    }

    @NotNull
    protected List<AnnotationWithTarget> loadPropertyAnnotations(@NotNull List<? extends AnnotationDescriptor> list, @NotNull List<? extends AnnotationDescriptor> list2, @NotNull AnnotationUseSiteTarget annotationUseSiteTarget) {
        C2668g.b(list, "propertyAnnotations");
        C2668g.b(list2, "fieldAnnotations");
        C2668g.b(annotationUseSiteTarget, "fieldUseSiteTarget");
        Iterable<AnnotationDescriptor> iterable = list;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (AnnotationDescriptor annotationWithTarget : iterable) {
            arrayList.add(new AnnotationWithTarget(annotationWithTarget, null));
        }
        arrayList = (List) arrayList;
        Iterable<AnnotationDescriptor> iterable2 = list2;
        Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
        for (AnnotationDescriptor annotationWithTarget2 : iterable2) {
            arrayList2.add(new AnnotationWithTarget(annotationWithTarget2, annotationUseSiteTarget));
        }
        return C19299w.m68809b(arrayList, (Iterable) (List) arrayList2);
    }

    @NotNull
    protected List<AnnotationWithTarget> transformAnnotations(@NotNull List<? extends AnnotationDescriptor> list) {
        C2668g.b(list, "annotations");
        Iterable<AnnotationDescriptor> iterable = list;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (AnnotationDescriptor annotationWithTarget : iterable) {
            arrayList.add(new AnnotationWithTarget(annotationWithTarget, null));
        }
        return (List) arrayList;
    }

    @Nullable
    protected AnnotationArgumentVisitor loadAnnotation(@NotNull ClassId classId, @NotNull SourceElement sourceElement, @NotNull List<AnnotationDescriptor> list) {
        C2668g.b(classId, "annotationClassId");
        C2668g.b(sourceElement, "source");
        C2668g.b(list, "result");
        return new BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1(this, resolveClass(classId), list, sourceElement);
    }

    private final ClassDescriptor resolveClass(ClassId classId) {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.module, classId, this.notFoundClasses);
    }
}
