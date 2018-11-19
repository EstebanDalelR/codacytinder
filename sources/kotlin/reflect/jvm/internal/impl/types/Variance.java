package kotlin.reflect.jvm.internal.impl.types;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

public enum Variance {
    ;
    
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;
    @NotNull
    private final String label;
    private final int superpositionFactor;

    protected Variance(String str, boolean z, @NotNull boolean z2, int i) {
        C2668g.b(str, "label");
        this.label = str;
        this.allowsInPosition = z;
        this.allowsOutPosition = z2;
        this.superpositionFactor = i;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    public final boolean allowsPosition(@NotNull Variance variance) {
        C2668g.b(variance, "position");
        switch (variance) {
            case IN_VARIANCE:
                return this.allowsInPosition;
            case OUT_VARIANCE:
                return this.allowsOutPosition;
            case INVARIANT:
                return (this.allowsInPosition == null || this.allowsOutPosition == null) ? null : true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public final Variance opposite() {
        switch (this) {
            case INVARIANT:
                return INVARIANT;
            case IN_VARIANCE:
                return OUT_VARIANCE;
            case OUT_VARIANCE:
                return IN_VARIANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public String toString() {
        return this.label;
    }
}
