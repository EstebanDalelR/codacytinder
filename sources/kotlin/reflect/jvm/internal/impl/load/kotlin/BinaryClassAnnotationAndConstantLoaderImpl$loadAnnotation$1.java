package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 implements AnnotationArgumentVisitor {
    final /* synthetic */ ClassDescriptor $annotationClass;
    final /* synthetic */ List $result;
    final /* synthetic */ SourceElement $source;
    private final HashMap<Name, ConstantValue<?>> arguments = new HashMap();
    final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl this$0;

    BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, ClassDescriptor classDescriptor, List list, SourceElement sourceElement) {
        this.this$0 = binaryClassAnnotationAndConstantLoaderImpl;
        this.$annotationClass = classDescriptor;
        this.$result = list;
        this.$source = sourceElement;
    }

    public void visit(@Nullable Name name, @Nullable Object obj) {
        if (name != null) {
            this.arguments.put(name, createConstant(name, obj));
        }
    }

    public void visitEnum(@NotNull Name name, @NotNull ClassId classId, @NotNull Name name2) {
        C2668g.b(name, "name");
        C2668g.b(classId, "enumClassId");
        C2668g.b(name2, "enumEntryName");
        this.arguments.put(name, new EnumValue(classId, name2));
    }

    @Nullable
    public AnnotationArrayArgumentVisitor visitArray(@NotNull Name name) {
        C2668g.b(name, "name");
        return new C17589xfa5093a1(this, name);
    }

    @Nullable
    public AnnotationArgumentVisitor visitAnnotation(@NotNull Name name, @NotNull ClassId classId) {
        C2668g.b(name, "name");
        C2668g.b(classId, "classId");
        ArrayList arrayList = new ArrayList();
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = this.this$0;
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        C2668g.a(sourceElement, "SourceElement.NO_SOURCE");
        classId = binaryClassAnnotationAndConstantLoaderImpl.loadAnnotation(classId, sourceElement, arrayList);
        if (classId == null) {
            C2668g.a();
        }
        return new C17588xe59bb5e1(this, classId, name, arrayList);
    }

    public void visitEnd() {
        this.$result.add(new AnnotationDescriptorImpl(this.$annotationClass.getDefaultType(), this.arguments, this.$source));
    }

    private final ConstantValue<?> createConstant(Name name, Object obj) {
        obj = ConstantValueFactory.INSTANCE.createConstantValue(obj);
        if (obj != null) {
            return obj;
        }
        obj = ErrorValue.Companion;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported annotation argument: ");
        stringBuilder.append(name);
        return obj.create(stringBuilder.toString());
    }
}
