package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import kotlin.C15813i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;

final class SignatureEnhancement$SignatureParts$toIndexed$1 extends Lambda implements Function2<KotlinType, LazyJavaResolverContext, C15813i> {
    final /* synthetic */ ArrayList $list;

    SignatureEnhancement$SignatureParts$toIndexed$1(ArrayList arrayList) {
        this.$list = arrayList;
        super(2);
    }

    public final void invoke(@NotNull KotlinType kotlinType, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        C2668g.b(kotlinType, "type");
        C2668g.b(lazyJavaResolverContext, "ownerContext");
        lazyJavaResolverContext = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, kotlinType.getAnnotations());
        ArrayList arrayList = this.$list;
        JavaTypeQualifiersByElementType defaultTypeQualifiers = lazyJavaResolverContext.getDefaultTypeQualifiers();
        arrayList.add(new TypeAndDefaultQualifiers(kotlinType, defaultTypeQualifiers != null ? defaultTypeQualifiers.get(QualifierApplicabilityType.TYPE_USE) : null));
        for (TypeProjection typeProjection : kotlinType.getArguments()) {
            KotlinType type;
            if (typeProjection.isStarProjection()) {
                ArrayList arrayList2 = this.$list;
                type = typeProjection.getType();
                C2668g.a(type, "arg.type");
                arrayList2.add(new TypeAndDefaultQualifiers(type, null));
            } else {
                SignatureEnhancement$SignatureParts$toIndexed$1 signatureEnhancement$SignatureParts$toIndexed$1 = this;
                type = typeProjection.getType();
                C2668g.a(type, "arg.type");
                invoke(type, lazyJavaResolverContext);
            }
        }
    }
}
