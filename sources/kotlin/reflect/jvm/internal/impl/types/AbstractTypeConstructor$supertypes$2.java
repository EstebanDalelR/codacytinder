package kotlin.reflect.jvm.internal.impl.types;

import kotlin.collections.C15807n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

final class AbstractTypeConstructor$supertypes$2 extends Lambda implements Function1<Boolean, Supertypes> {
    public static final AbstractTypeConstructor$supertypes$2 INSTANCE = new AbstractTypeConstructor$supertypes$2();

    AbstractTypeConstructor$supertypes$2() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return invoke(((Boolean) obj).booleanValue());
    }

    @NotNull
    public final Supertypes invoke(boolean z) {
        return new Supertypes(C15807n.m59826a(ErrorUtils.ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES));
    }
}
