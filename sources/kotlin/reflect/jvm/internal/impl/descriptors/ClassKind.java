package kotlin.reflect.jvm.internal.impl.descriptors;

public enum ClassKind {
    CLASS,
    INTERFACE,
    ENUM_CLASS,
    ENUM_ENTRY,
    ANNOTATION_CLASS,
    OBJECT;

    public boolean isSingleton() {
        if (this != OBJECT) {
            if (this != ENUM_ENTRY) {
                return false;
            }
        }
        return true;
    }
}
