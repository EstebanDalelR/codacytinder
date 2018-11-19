package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import org.jetbrains.annotations.NotNull;

final class LazyJavaPackageFragment$partToFacade$2 extends Lambda implements Function0<HashMap<JvmClassName, JvmClassName>> {
    final /* synthetic */ LazyJavaPackageFragment this$0;

    LazyJavaPackageFragment$partToFacade$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.this$0 = lazyJavaPackageFragment;
        super(0);
    }

    @NotNull
    public final HashMap<JvmClassName, JvmClassName> invoke() {
        HashMap<JvmClassName, JvmClassName> hashMap = new HashMap();
        for (Entry entry : this.this$0.getBinaryClasses$descriptors_jvm().entrySet()) {
            String str = (String) entry.getKey();
            KotlinJvmBinaryClass kotlinJvmBinaryClass = (KotlinJvmBinaryClass) entry.getValue();
            JvmClassName byInternalName = JvmClassName.byInternalName(str);
            KotlinClassHeader classHeader = kotlinJvmBinaryClass.getClassHeader();
            switch (classHeader.getKind()) {
                case MULTIFILE_CLASS_PART:
                    Map map = hashMap;
                    C2668g.a(byInternalName, "partName");
                    String multifileClassName = classHeader.getMultifileClassName();
                    if (multifileClassName == null) {
                        break;
                    }
                    JvmClassName byInternalName2 = JvmClassName.byInternalName(multifileClassName);
                    C2668g.a(byInternalName2, "JvmClassName.byInternalN…: continue@kotlinClasses)");
                    map.put(byInternalName, byInternalName2);
                    break;
                case FILE_FACADE:
                    Map map2 = hashMap;
                    C2668g.a(byInternalName, "partName");
                    map2.put(byInternalName, byInternalName);
                    break;
                default:
                    break;
            }
        }
        return hashMap;
    }
}
