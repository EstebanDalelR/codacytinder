package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;

public interface PackagePartProvider {
    @NotNull
    List<String> findPackageParts(@NotNull String str);
}
