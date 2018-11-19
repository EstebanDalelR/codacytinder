package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationWithTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import org.jetbrains.annotations.NotNull;

final class TypeDeserializer$simpleType$annotations$1 extends Lambda implements Function0<List<? extends AnnotationWithTarget>> {
    final /* synthetic */ Annotations $additionalAnnotations;
    final /* synthetic */ Type $proto;
    final /* synthetic */ TypeDeserializer this$0;

    TypeDeserializer$simpleType$annotations$1(TypeDeserializer typeDeserializer, Type type, Annotations annotations) {
        this.this$0 = typeDeserializer;
        this.$proto = type;
        this.$additionalAnnotations = annotations;
        super(0);
    }

    @NotNull
    public final List<AnnotationWithTarget> invoke() {
        Iterable<AnnotationDescriptor> loadTypeAnnotations = this.this$0.f49043c.getComponents().getAnnotationAndConstantLoader().loadTypeAnnotations(this.$proto, this.this$0.f49043c.getNameResolver());
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) loadTypeAnnotations, 10));
        for (AnnotationDescriptor annotationWithTarget : loadTypeAnnotations) {
            arrayList.add(new AnnotationWithTarget(annotationWithTarget, null));
        }
        return C19299w.m68840l(C19299w.m68809b((Collection) (List) arrayList, (Iterable) this.$additionalAnnotations.getAllAnnotations()));
    }
}
