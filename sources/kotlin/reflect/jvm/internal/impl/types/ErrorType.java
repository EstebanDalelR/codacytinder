package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

public class ErrorType extends SimpleType {
    @NotNull
    private final List<TypeProjection> arguments;
    @NotNull
    private final TypeConstructor constructor;
    private final boolean isMarkedNullable;
    @NotNull
    private final MemberScope memberScope;

    @JvmOverloads
    public ErrorType(@NotNull TypeConstructor typeConstructor, @NotNull MemberScope memberScope) {
        this(typeConstructor, memberScope, null, false, 12, null);
    }

    @NotNull
    public TypeConstructor getConstructor() {
        return this.constructor;
    }

    @NotNull
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    @JvmOverloads
    public /* synthetic */ ErrorType(TypeConstructor typeConstructor, MemberScope memberScope, List list, boolean z, int i, C15823e c15823e) {
        if ((i & 4) != null) {
            list = C17554o.m64195a();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        this(typeConstructor, memberScope, list, z);
    }

    @NotNull
    public List<TypeProjection> getArguments() {
        return this.arguments;
    }

    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @JvmOverloads
    public ErrorType(@NotNull TypeConstructor typeConstructor, @NotNull MemberScope memberScope, @NotNull List<? extends TypeProjection> list, boolean z) {
        C2668g.b(typeConstructor, "constructor");
        C2668g.b(memberScope, "memberScope");
        C2668g.b(list, "arguments");
        this.constructor = typeConstructor;
        this.memberScope = memberScope;
        this.arguments = list;
        this.isMarkedNullable = z;
    }

    @NotNull
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getConstructor().toString());
        stringBuilder.append(getArguments().isEmpty() ? "" : C19299w.m68796a(getArguments(), ", ", "<", ">", -1, "...", null));
        return stringBuilder.toString();
    }

    @NotNull
    public SimpleType replaceAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "newAnnotations");
        return this;
    }

    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z) {
        return new ErrorType(getConstructor(), getMemberScope(), getArguments(), z);
    }
}
