package kotlin.reflect.jvm.internal.impl.resolve.scopes;

public abstract class DescriptorKindExclude {

    public static final class NonExtensions extends DescriptorKindExclude {
        public static final NonExtensions INSTANCE = new NonExtensions();
        private static final int fullyExcludedDescriptorKinds = (DescriptorKindFilter.Companion.getALL_KINDS_MASK() & ((DescriptorKindFilter.Companion.getFUNCTIONS_MASK() | DescriptorKindFilter.Companion.getVARIABLES_MASK()) ^ -1));

        private NonExtensions() {
        }

        public int getFullyExcludedDescriptorKinds() {
            return fullyExcludedDescriptorKinds;
        }
    }

    public static final class TopLevelPackages extends DescriptorKindExclude {
        public static final TopLevelPackages INSTANCE = new TopLevelPackages();

        public int getFullyExcludedDescriptorKinds() {
            return 0;
        }

        private TopLevelPackages() {
        }
    }

    public abstract int getFullyExcludedDescriptorKinds();

    public String toString() {
        return getClass().getSimpleName();
    }
}
