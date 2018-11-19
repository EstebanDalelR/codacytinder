package kotlin.reflect.jvm.internal.impl.renderer;

public enum AnnotationArgumentsRenderingPolicy {
    ;
    
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    protected AnnotationArgumentsRenderingPolicy(boolean z, boolean z2) {
        this.includeAnnotationArguments = z;
        this.includeEmptyAnnotationArguments = z2;
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }
}
