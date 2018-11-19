package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;

public final class AbbreviatedType extends DelegatingSimpleType {
    @NotNull
    private final SimpleType abbreviation;
    @NotNull
    private final SimpleType delegate;

    public AbbreviatedType(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        C2668g.b(simpleType, "delegate");
        C2668g.b(simpleType2, "abbreviation");
        this.delegate = simpleType;
        this.abbreviation = simpleType2;
    }

    @NotNull
    public final SimpleType getAbbreviation() {
        return this.abbreviation;
    }

    @NotNull
    protected SimpleType getDelegate() {
        return this.delegate;
    }

    @NotNull
    public final SimpleType getExpandedType() {
        return getDelegate();
    }

    @NotNull
    public AbbreviatedType replaceAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "newAnnotations");
        return new AbbreviatedType(getDelegate().replaceAnnotations(annotations), this.abbreviation);
    }

    @NotNull
    public AbbreviatedType makeNullableAsSpecified(boolean z) {
        return new AbbreviatedType(getDelegate().makeNullableAsSpecified(z), this.abbreviation.makeNullableAsSpecified(z));
    }
}
