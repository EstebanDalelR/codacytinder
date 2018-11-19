package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function0;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DeserializedAnnotations implements Annotations {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(DeserializedAnnotations.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    private final NotNullLazyValue annotations$delegate;

    private final List<AnnotationDescriptor> getAnnotations() {
        return (List) StorageKt.getValue(this.annotations$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public DeserializedAnnotations(@NotNull StorageManager storageManager, @NotNull Function0<? extends List<? extends AnnotationDescriptor>> function0) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(function0, "compute");
        this.annotations$delegate = storageManager.createLazyValue(function0);
    }

    @Nullable
    public AnnotationDescriptor findAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return DefaultImpls.findAnnotation(this, fqName);
    }

    public boolean hasAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return DefaultImpls.hasAnnotation(this, fqName);
    }

    public boolean isEmpty() {
        return getAnnotations().isEmpty();
    }

    @NotNull
    public List<AnnotationWithTarget> getUseSiteTargetedAnnotations() {
        return C17554o.m64195a();
    }

    @NotNull
    public List<AnnotationWithTarget> getAllAnnotations() {
        Iterable<AnnotationDescriptor> annotations = getAnnotations();
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) annotations, 10));
        for (AnnotationDescriptor annotationWithTarget : annotations) {
            arrayList.add(new AnnotationWithTarget(annotationWithTarget, null));
        }
        return (List) arrayList;
    }

    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return getAnnotations().iterator();
    }
}
