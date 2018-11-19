package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

public interface DeserializationConfiguration {

    public static final class DefaultImpls {
        public static boolean getReportErrorsOnPreReleaseDependencies(DeserializationConfiguration deserializationConfiguration) {
            return false;
        }

        public static boolean getSkipMetadataVersionCheck(DeserializationConfiguration deserializationConfiguration) {
            return false;
        }

        public static boolean getTypeAliasesAllowed(DeserializationConfiguration deserializationConfiguration) {
            return true;
        }

        public static boolean isJvmPackageNameSupported(DeserializationConfiguration deserializationConfiguration) {
            return true;
        }
    }

    public static final class Default implements DeserializationConfiguration {
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        public boolean getReportErrorsOnPreReleaseDependencies() {
            return DefaultImpls.getReportErrorsOnPreReleaseDependencies(this);
        }

        public boolean getSkipMetadataVersionCheck() {
            return DefaultImpls.getSkipMetadataVersionCheck(this);
        }

        public boolean getTypeAliasesAllowed() {
            return DefaultImpls.getTypeAliasesAllowed(this);
        }

        public boolean isJvmPackageNameSupported() {
            return DefaultImpls.isJvmPackageNameSupported(this);
        }
    }

    boolean getReportErrorsOnPreReleaseDependencies();

    boolean getSkipMetadataVersionCheck();

    boolean getTypeAliasesAllowed();

    boolean isJvmPackageNameSupported();
}
