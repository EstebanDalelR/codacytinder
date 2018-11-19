package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Visibility {
    private final boolean isPublicAPI;
    @NotNull
    private final String name;

    public abstract boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor);

    @NotNull
    public Visibility normalize() {
        return this;
    }

    protected Visibility(@NotNull String str, boolean z) {
        C2668g.b(str, "name");
        this.name = str;
        this.isPublicAPI = z;
    }

    public final boolean isPublicAPI() {
        return this.isPublicAPI;
    }

    @Nullable
    protected Integer compareTo(@NotNull Visibility visibility) {
        C2668g.b(visibility, "visibility");
        return Visibilities.compareLocal(this, visibility);
    }

    @NotNull
    public String getDisplayName() {
        return this.name;
    }

    @NotNull
    public final String toString() {
        return getDisplayName();
    }
}
