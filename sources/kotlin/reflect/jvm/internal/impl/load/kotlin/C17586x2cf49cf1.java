package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 */
public final class C17586x2cf49cf1 implements MemberVisitor {
    final /* synthetic */ HashMap $memberAnnotations;
    final /* synthetic */ HashMap $propertyConstants;
    final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader this$0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$MemberAnnotationVisitor */
    public class MemberAnnotationVisitor implements AnnotationVisitor {
        private final ArrayList<A> result = new ArrayList();
        @NotNull
        private final MemberSignature signature;
        final /* synthetic */ C17586x2cf49cf1 this$0;

        public MemberAnnotationVisitor(C17586x2cf49cf1 c17586x2cf49cf1, @NotNull MemberSignature memberSignature) {
            C2668g.b(memberSignature, ManagerWebServices.PARAM_SIGNATURE);
            this.this$0 = c17586x2cf49cf1;
            this.signature = memberSignature;
        }

        @NotNull
        protected final MemberSignature getSignature() {
            return this.signature;
        }

        @Nullable
        public AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId, @NotNull SourceElement sourceElement) {
            C2668g.b(classId, "classId");
            C2668g.b(sourceElement, "source");
            return this.this$0.this$0.loadAnnotationIfNotSpecial(classId, sourceElement, this.result);
        }

        public void visitEnd() {
            if ((this.result.isEmpty() ^ 1) != 0) {
                this.this$0.$memberAnnotations.put(this.signature, this.result);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$AnnotationVisitorForMethod */
    public final class AnnotationVisitorForMethod extends MemberAnnotationVisitor implements MethodAnnotationVisitor {
        final /* synthetic */ C17586x2cf49cf1 this$0;

        public AnnotationVisitorForMethod(C17586x2cf49cf1 c17586x2cf49cf1, @NotNull MemberSignature memberSignature) {
            C2668g.b(memberSignature, ManagerWebServices.PARAM_SIGNATURE);
            this.this$0 = c17586x2cf49cf1;
            super(c17586x2cf49cf1, memberSignature);
        }

        @Nullable
        public AnnotationArgumentVisitor visitParameterAnnotation(int i, @NotNull ClassId classId, @NotNull SourceElement sourceElement) {
            C2668g.b(classId, "classId");
            C2668g.b(sourceElement, "source");
            i = MemberSignature.Companion.fromMethodSignatureAndParameterIndex(getSignature(), i);
            List list = (List) this.this$0.$memberAnnotations.get(i);
            if (list == null) {
                list = new ArrayList();
                this.this$0.$memberAnnotations.put(i, list);
            }
            return this.this$0.this$0.loadAnnotationIfNotSpecial(classId, sourceElement, list);
        }
    }

    C17586x2cf49cf1(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, HashMap hashMap, HashMap hashMap2) {
        this.this$0 = abstractBinaryClassAnnotationAndConstantLoader;
        this.$memberAnnotations = hashMap;
        this.$propertyConstants = hashMap2;
    }

    @Nullable
    public MethodAnnotationVisitor visitMethod(@NotNull Name name, @NotNull String str) {
        C2668g.b(name, "name");
        C2668g.b(str, "desc");
        Companion companion = MemberSignature.Companion;
        name = name.asString();
        C2668g.a(name, "name.asString()");
        return new AnnotationVisitorForMethod(this, companion.fromMethodNameAndDesc(name, str));
    }

    @Nullable
    public AnnotationVisitor visitField(@NotNull Name name, @NotNull String str, @Nullable Object obj) {
        C2668g.b(name, "name");
        C2668g.b(str, "desc");
        Companion companion = MemberSignature.Companion;
        name = name.asString();
        C2668g.a(name, "name.asString()");
        name = companion.fromFieldNameAndDesc(name, str);
        if (obj != null) {
            str = this.this$0.loadConstant(str, obj);
            if (str != null) {
                ((Map) this.$propertyConstants).put(name, str);
            }
        }
        return (AnnotationVisitor) new MemberAnnotationVisitor(this, name);
    }
}
