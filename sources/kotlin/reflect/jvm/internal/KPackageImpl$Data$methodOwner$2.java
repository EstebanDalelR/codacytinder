package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.text.C19296q;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class KPackageImpl$Data$methodOwner$2 extends Lambda implements Function0<Class<?>> {
    final /* synthetic */ Data this$0;

    KPackageImpl$Data$methodOwner$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    public final Class<?> invoke() {
        String multifileClassName;
        String str;
        ReflectKotlinClass access$getKotlinClass$p = this.this$0.getKotlinClass();
        if (access$getKotlinClass$p != null) {
            KotlinClassHeader classHeader = access$getKotlinClass$p.getClassHeader();
            if (classHeader != null) {
                multifileClassName = classHeader.getMultifileClassName();
                str = multifileClassName;
                if (str != null) {
                    if ((((CharSequence) str).length() <= 0 ? 1 : null) != null) {
                        return this.this$0.this$0.getJClass().getClassLoader().loadClass(C19296q.m68670a(str, '/', '.', false, 4, null));
                    }
                }
                return this.this$0.this$0.getJClass();
            }
        }
        multifileClassName = null;
        str = multifileClassName;
        if (str != null) {
            if (((CharSequence) str).length() <= 0) {
            }
            if ((((CharSequence) str).length() <= 0 ? 1 : null) != null) {
                return this.this$0.this$0.getJClass().getClassLoader().loadClass(C19296q.m68670a(str, '/', '.', false, 4, null));
            }
        }
        return this.this$0.this$0.getJClass();
    }
}
