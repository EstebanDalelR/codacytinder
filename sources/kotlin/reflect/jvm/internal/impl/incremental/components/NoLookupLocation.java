package kotlin.reflect.jvm.internal.impl.incremental.components;

import org.jetbrains.annotations.Nullable;

public enum NoLookupLocation implements LookupLocation {
    ;

    @Nullable
    public LocationInfo getLocation() {
        return null;
    }
}
