package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaAnnotationDescriptor implements AnnotationDescriptor {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    @Nullable
    private final JavaAnnotationArgument firstArgument;
    @NotNull
    private final FqName fqName;
    @NotNull
    private final SourceElement source;
    @NotNull
    private final NotNullLazyValue type$delegate;

    @NotNull
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.type$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public JavaAnnotationDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @Nullable JavaAnnotation javaAnnotation, @NotNull FqName fqName) {
        C2668g.b(lazyJavaResolverContext, "c");
        C2668g.b(fqName, "fqName");
        this.fqName = fqName;
        if (javaAnnotation != null) {
            fqName = lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaAnnotation);
            if (fqName != null) {
                fqName = (SourceElement) fqName;
                this.source = fqName;
                this.type$delegate = lazyJavaResolverContext.getStorageManager().createLazyValue(new JavaAnnotationDescriptor$type$2(this, lazyJavaResolverContext));
                if (javaAnnotation != null) {
                    lazyJavaResolverContext = javaAnnotation.getArguments();
                    if (lazyJavaResolverContext != null) {
                        lazyJavaResolverContext = (JavaAnnotationArgument) C19299w.m68812c((Iterable) lazyJavaResolverContext);
                        this.firstArgument = lazyJavaResolverContext;
                    }
                }
                lazyJavaResolverContext = null;
                this.firstArgument = lazyJavaResolverContext;
            }
        }
        fqName = SourceElement.NO_SOURCE;
        C2668g.a(fqName, "SourceElement.NO_SOURCE");
        this.source = fqName;
        this.type$delegate = lazyJavaResolverContext.getStorageManager().createLazyValue(new JavaAnnotationDescriptor$type$2(this, lazyJavaResolverContext));
        if (javaAnnotation != null) {
            lazyJavaResolverContext = javaAnnotation.getArguments();
            if (lazyJavaResolverContext != null) {
                lazyJavaResolverContext = (JavaAnnotationArgument) C19299w.m68812c((Iterable) lazyJavaResolverContext);
                this.firstArgument = lazyJavaResolverContext;
            }
        }
        lazyJavaResolverContext = null;
        this.firstArgument = lazyJavaResolverContext;
    }

    @NotNull
    public FqName getFqName() {
        return this.fqName;
    }

    @NotNull
    public SourceElement getSource() {
        return this.source;
    }

    @Nullable
    protected final JavaAnnotationArgument getFirstArgument() {
        return this.firstArgument;
    }

    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return ah.m66884a();
    }
}
