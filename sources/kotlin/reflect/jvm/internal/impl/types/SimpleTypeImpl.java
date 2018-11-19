package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ErrorScope;
import org.jetbrains.annotations.NotNull;

final class SimpleTypeImpl extends SimpleType {
    @NotNull
    private final List<TypeProjection> arguments;
    @NotNull
    private final TypeConstructor constructor;
    private final boolean isMarkedNullable;
    @NotNull
    private final MemberScope memberScope;

    @NotNull
    public TypeConstructor getConstructor() {
        return this.constructor;
    }

    @NotNull
    public List<TypeProjection> getArguments() {
        return this.arguments;
    }

    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @NotNull
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    public SimpleTypeImpl(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope) {
        C2668g.b(typeConstructor, "constructor");
        C2668g.b(list, "arguments");
        C2668g.b(memberScope, "memberScope");
        this.constructor = typeConstructor;
        this.arguments = list;
        this.isMarkedNullable = z;
        this.memberScope = memberScope;
        if ((getMemberScope() instanceof ErrorScope) != null) {
            list = new StringBuilder();
            list.append("SimpleTypeImpl should not be created for error type: ");
            list.append(getMemberScope());
            list.append(true);
            list.append(getConstructor());
            throw ((Throwable) new IllegalStateException(list.toString()));
        }
    }

    @NotNull
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    @NotNull
    public SimpleType replaceAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "newAnnotations");
        if (annotations.isEmpty()) {
            return this;
        }
        return new AnnotatedSimpleType(this, annotations);
    }

    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z) {
        if (z == isMarkedNullable()) {
            return this;
        }
        if (z) {
            z = (DelegatingSimpleTypeImpl) new NullableSimpleType(this);
        } else {
            z = (DelegatingSimpleTypeImpl) new NotNullSimpleType(this);
        }
        return (SimpleType) z;
    }
}
