package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1$visitAnnotation$1 */
public final class C17588xe59bb5e1 implements AnnotationArgumentVisitor {
    private final /* synthetic */ AnnotationArgumentVisitor $$delegate_0;
    final /* synthetic */ ArrayList $list;
    final /* synthetic */ Name $name;
    final /* synthetic */ AnnotationArgumentVisitor $visitor;
    final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 this$0;

    public void visit(@Nullable Name name, @Nullable Object obj) {
        this.$$delegate_0.visit(name, obj);
    }

    @Nullable
    public AnnotationArgumentVisitor visitAnnotation(@NotNull Name name, @NotNull ClassId classId) {
        C2668g.b(name, "name");
        C2668g.b(classId, "classId");
        return this.$$delegate_0.visitAnnotation(name, classId);
    }

    @Nullable
    public AnnotationArrayArgumentVisitor visitArray(@NotNull Name name) {
        C2668g.b(name, "name");
        return this.$$delegate_0.visitArray(name);
    }

    public void visitEnum(@NotNull Name name, @NotNull ClassId classId, @NotNull Name name2) {
        C2668g.b(name, "name");
        C2668g.b(classId, "enumClassId");
        C2668g.b(name2, "enumEntryName");
        this.$$delegate_0.visitEnum(name, classId, name2);
    }

    C17588xe59bb5e1(BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 binaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1, AnnotationArgumentVisitor annotationArgumentVisitor, Name name, ArrayList arrayList) {
        this.this$0 = binaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1;
        this.$visitor = annotationArgumentVisitor;
        this.$name = name;
        this.$list = arrayList;
        this.$$delegate_0 = annotationArgumentVisitor;
    }

    public void visitEnd() {
        this.$visitor.visitEnd();
        this.this$0.arguments.put(this.$name, new AnnotationValue((AnnotationDescriptor) C19299w.m68836j((List) this.$list)));
    }
}
