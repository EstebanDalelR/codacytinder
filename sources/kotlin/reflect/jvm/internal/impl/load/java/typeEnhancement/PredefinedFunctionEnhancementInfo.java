package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PredefinedFunctionEnhancementInfo {
    @NotNull
    private final List<TypeEnhancementInfo> parametersInfo;
    @Nullable
    private final TypeEnhancementInfo returnTypeInfo;

    public PredefinedFunctionEnhancementInfo() {
        this(null, null, 3, null);
    }

    public PredefinedFunctionEnhancementInfo(@Nullable TypeEnhancementInfo typeEnhancementInfo, @NotNull List<TypeEnhancementInfo> list) {
        C2668g.b(list, "parametersInfo");
        this.returnTypeInfo = typeEnhancementInfo;
        this.parametersInfo = list;
    }

    public /* synthetic */ PredefinedFunctionEnhancementInfo(TypeEnhancementInfo typeEnhancementInfo, List list, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            typeEnhancementInfo = null;
        }
        if ((i & 2) != 0) {
            list = C17554o.m64195a();
        }
        this(typeEnhancementInfo, list);
    }

    @Nullable
    public final TypeEnhancementInfo getReturnTypeInfo() {
        return this.returnTypeInfo;
    }

    @NotNull
    public final List<TypeEnhancementInfo> getParametersInfo() {
        return this.parametersInfo;
    }
}
