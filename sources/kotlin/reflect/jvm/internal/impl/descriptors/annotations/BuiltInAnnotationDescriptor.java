package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(BuiltInAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/KotlinType;"))};
    @NotNull
    private final Map<Name, ConstantValue<?>> allValueArguments;
    private final KotlinBuiltIns builtIns;
    @NotNull
    private final FqName fqName;
    @NotNull
    private final Lazy type$delegate = C15810e.m59832a(LazyThreadSafetyMode.PUBLICATION, (Function0) new BuiltInAnnotationDescriptor$type$2(this));

    @NotNull
    public KotlinType getType() {
        Lazy lazy = this.type$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (KotlinType) lazy.getValue();
    }

    public BuiltInAnnotationDescriptor(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull FqName fqName, @NotNull Map<Name, ? extends ConstantValue<?>> map) {
        C2668g.b(kotlinBuiltIns, "builtIns");
        C2668g.b(fqName, "fqName");
        C2668g.b(map, "allValueArguments");
        this.builtIns = kotlinBuiltIns;
        this.fqName = fqName;
        this.allValueArguments = map;
    }

    @NotNull
    public FqName getFqName() {
        return this.fqName;
    }

    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return this.allValueArguments;
    }

    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        C2668g.a(sourceElement, "SourceElement.NO_SOURCE");
        return sourceElement;
    }
}
