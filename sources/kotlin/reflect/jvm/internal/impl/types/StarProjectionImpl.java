package kotlin.reflect.jvm.internal.impl.types;

import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;

public final class StarProjectionImpl extends TypeProjectionBase {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(StarProjectionImpl.class), "_type", "get_type()Lorg/jetbrains/kotlin/types/KotlinType;"))};
    private final Lazy _type$delegate = C15810e.m59832a(LazyThreadSafetyMode.PUBLICATION, new StarProjectionImpl$_type$2(this));
    private final TypeParameterDescriptor typeParameter;

    private final KotlinType get_type() {
        Lazy lazy = this._type$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (KotlinType) lazy.getValue();
    }

    public boolean isStarProjection() {
        return true;
    }

    public StarProjectionImpl(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        C2668g.b(typeParameterDescriptor, "typeParameter");
        this.typeParameter = typeParameterDescriptor;
    }

    @NotNull
    public Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    @NotNull
    public KotlinType getType() {
        return get_type();
    }
}
