package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationWithTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.sequences.C19155k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DeserializedAnnotationsWithPossibleTargets implements Annotations {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(DeserializedAnnotationsWithPossibleTargets.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    private final NotNullLazyValue annotations$delegate;

    private final List<AnnotationWithTarget> getAnnotations() {
        return (List) StorageKt.getValue(this.annotations$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public DeserializedAnnotationsWithPossibleTargets(@NotNull StorageManager storageManager, @NotNull Function0<? extends List<AnnotationWithTarget>> function0) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(function0, "compute");
        this.annotations$delegate = storageManager.createLazyValue(function0);
    }

    public boolean hasAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return DefaultImpls.hasAnnotation(this, fqName);
    }

    public boolean isEmpty() {
        return getAnnotations().isEmpty();
    }

    @Nullable
    public AnnotationDescriptor findAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        for (Object next : getAnnotations()) {
            Object obj;
            AnnotationWithTarget annotationWithTarget = (AnnotationWithTarget) next;
            AnnotationDescriptor component1 = annotationWithTarget.component1();
            if (annotationWithTarget.component2() == null && C2668g.a(component1.getFqName(), fqName)) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                break;
            }
        }
        Object next2 = null;
        AnnotationWithTarget annotationWithTarget2 = (AnnotationWithTarget) next2;
        if (annotationWithTarget2 != null) {
            return annotationWithTarget2.getAnnotation();
        }
        return null;
    }

    @NotNull
    public List<AnnotationWithTarget> getUseSiteTargetedAnnotations() {
        Collection arrayList = new ArrayList();
        for (Object next : getAnnotations()) {
            if ((((AnnotationWithTarget) next).getTarget() != null ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    @NotNull
    public List<AnnotationWithTarget> getAllAnnotations() {
        return getAnnotations();
    }

    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return C19155k.m68032e(C19155k.m68024a(C19299w.m68846r(getAnnotations()), (Function1) DeserializedAnnotationsWithPossibleTargets$iterator$1.INSTANCE), DeserializedAnnotationsWithPossibleTargets$iterator$2.INSTANCE).iterator();
    }
}
