package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler;
import org.jetbrains.annotations.NotNull;

public final class JvmBuiltInsSettings$getJdkMethodStatus$2 extends AbstractNodeHandler<ClassDescriptor, JDKMemberStatus> {
    final /* synthetic */ String $jvmDescriptor;
    final /* synthetic */ ObjectRef $result;

    JvmBuiltInsSettings$getJdkMethodStatus$2(String str, ObjectRef objectRef) {
        this.$jvmDescriptor = str;
        this.$result = objectRef;
    }

    public boolean beforeChildren(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "javaClassDescriptor");
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String str = this.$jvmDescriptor;
        C2668g.a(str, "jvmDescriptor");
        classDescriptor = signatureBuildingComponents.signature(classDescriptor, str);
        if (JvmBuiltInsSettings.Companion.getBLACK_LIST_METHOD_SIGNATURES().contains(classDescriptor)) {
            this.$result.f49022a = JDKMemberStatus.BLACK_LIST;
        } else if (JvmBuiltInsSettings.Companion.getWHITE_LIST_METHOD_SIGNATURES().contains(classDescriptor)) {
            this.$result.f49022a = JDKMemberStatus.WHITE_LIST;
        } else if (JvmBuiltInsSettings.Companion.getDROP_LIST_METHOD_SIGNATURES().contains(classDescriptor) != null) {
            this.$result.f49022a = JDKMemberStatus.DROP;
        }
        return ((JDKMemberStatus) this.$result.f49022a) == null ? true : null;
    }

    @NotNull
    public JDKMemberStatus result() {
        JDKMemberStatus jDKMemberStatus = (JDKMemberStatus) this.$result.f49022a;
        return jDKMemberStatus != null ? jDKMemberStatus : JDKMemberStatus.NOT_CONSIDERED;
    }
}
