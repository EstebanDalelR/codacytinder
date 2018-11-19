package kotlin.reflect.jvm.internal.impl.util;

import com.tinder.api.ManagerWebServices;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.NotNull;

public interface ModuleVisibilityHelper {

    public static final class EMPTY implements ModuleVisibilityHelper {
        public static final EMPTY INSTANCE = new EMPTY();

        public boolean isInFriendModule(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2) {
            C2668g.b(declarationDescriptor, "what");
            C2668g.b(declarationDescriptor2, ManagerWebServices.PARAM_FROM);
            return true;
        }

        private EMPTY() {
        }
    }

    boolean isInFriendModule(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull DeclarationDescriptor declarationDescriptor2);
}
