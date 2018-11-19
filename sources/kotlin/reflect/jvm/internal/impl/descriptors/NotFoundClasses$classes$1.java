package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

final class NotFoundClasses$classes$1 extends Lambda implements Function1<ClassRequest, MockClassDescriptor> {
    final /* synthetic */ NotFoundClasses this$0;

    NotFoundClasses$classes$1(NotFoundClasses notFoundClasses) {
        this.this$0 = notFoundClasses;
        super(1);
    }

    @NotNull
    public final MockClassDescriptor invoke(@NotNull ClassRequest classRequest) {
        C2668g.b(classRequest, "<name for destructuring parameter 0>");
        ClassId component1 = classRequest.component1();
        classRequest = classRequest.component2();
        if (component1.isLocal()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unresolved local class: ");
            stringBuilder.append(component1);
            throw ((Throwable) new UnsupportedOperationException(stringBuilder.toString()));
        }
        ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor;
        boolean isNestedClass;
        StorageManager access$getStorageManager$p;
        DeclarationDescriptor declarationDescriptor;
        Name shortClassName;
        Integer num;
        ClassId outerClassId = component1.getOuterClassId();
        if (outerClassId != null) {
            NotFoundClasses notFoundClasses = this.this$0;
            C2668g.a(outerClassId, "outerClassId");
            ClassDescriptor classDescriptor = notFoundClasses.getClass(outerClassId, C19299w.m68814c((Iterable) classRequest, 1));
            if (classDescriptor != null) {
                classOrPackageFragmentDescriptor = classDescriptor;
                isNestedClass = component1.isNestedClass();
                access$getStorageManager$p = this.this$0.storageManager;
                declarationDescriptor = classOrPackageFragmentDescriptor;
                shortClassName = component1.getShortClassName();
                C2668g.a(shortClassName, "classId.shortClassName");
                num = (Integer) C19299w.m68831g((List) classRequest);
                return new MockClassDescriptor(access$getStorageManager$p, declarationDescriptor, shortClassName, isNestedClass, num == null ? num.intValue() : 0);
            }
        }
        MemoizedFunctionToNotNull access$getPackageFragments$p = this.this$0.packageFragments;
        FqName packageFqName = component1.getPackageFqName();
        C2668g.a(packageFqName, "classId.packageFqName");
        classOrPackageFragmentDescriptor = (ClassOrPackageFragmentDescriptor) access$getPackageFragments$p.invoke(packageFqName);
        isNestedClass = component1.isNestedClass();
        access$getStorageManager$p = this.this$0.storageManager;
        declarationDescriptor = classOrPackageFragmentDescriptor;
        shortClassName = component1.getShortClassName();
        C2668g.a(shortClassName, "classId.shortClassName");
        num = (Integer) C19299w.m68831g((List) classRequest);
        if (num == null) {
        }
        return new MockClassDescriptor(access$getStorageManager$p, declarationDescriptor, shortClassName, isNestedClass, num == null ? num.intValue() : 0);
    }
}
