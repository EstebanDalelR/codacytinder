package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NewCapturedType extends SimpleType {
    @NotNull
    private final Annotations annotations;
    @NotNull
    private final CaptureStatus captureStatus;
    @NotNull
    private final NewCapturedTypeConstructor constructor;
    private final boolean isMarkedNullable;
    @Nullable
    private final UnwrappedType lowerType;

    @NotNull
    public NewCapturedTypeConstructor getConstructor() {
        return this.constructor;
    }

    @Nullable
    public final UnwrappedType getLowerType() {
        return this.lowerType;
    }

    public /* synthetic */ NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, Annotations annotations, boolean z, int i, C15823e c15823e) {
        if ((i & 8) != null) {
            annotations = Annotations.Companion.getEMPTY();
        }
        this(captureStatus, newCapturedTypeConstructor, unwrappedType, annotations, (i & 16) != null ? false : z);
    }

    @NotNull
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    public NewCapturedType(@NotNull CaptureStatus captureStatus, @NotNull NewCapturedTypeConstructor newCapturedTypeConstructor, @Nullable UnwrappedType unwrappedType, @NotNull Annotations annotations, boolean z) {
        C2668g.b(captureStatus, "captureStatus");
        C2668g.b(newCapturedTypeConstructor, "constructor");
        C2668g.b(annotations, "annotations");
        this.captureStatus = captureStatus;
        this.constructor = newCapturedTypeConstructor;
        this.lowerType = unwrappedType;
        this.annotations = annotations;
        this.isMarkedNullable = z;
    }

    public NewCapturedType(@NotNull CaptureStatus captureStatus, @Nullable UnwrappedType unwrappedType, @NotNull TypeProjection typeProjection) {
        C2668g.b(captureStatus, "captureStatus");
        C2668g.b(typeProjection, "projection");
        this(captureStatus, new NewCapturedTypeConstructor(typeProjection, null, 2, null), unwrappedType, null, false, 24, null);
    }

    @NotNull
    public List<TypeProjection> getArguments() {
        return C17554o.m64195a();
    }

    @NotNull
    public MemberScope getMemberScope() {
        MemberScope createErrorScope = ErrorUtils.createErrorScope("No member resolution should be done on captured type!", true);
        C2668g.a(createErrorScope, "ErrorUtils.createErrorSc…on captured type!\", true)");
        return createErrorScope;
    }

    @NotNull
    public NewCapturedType replaceAnnotations(@NotNull Annotations annotations) {
        C2668g.b(annotations, "newAnnotations");
        return new NewCapturedType(this.captureStatus, getConstructor(), this.lowerType, annotations, isMarkedNullable());
    }

    @NotNull
    public NewCapturedType makeNullableAsSpecified(boolean z) {
        return new NewCapturedType(this.captureStatus, getConstructor(), this.lowerType, getAnnotations(), z);
    }
}
