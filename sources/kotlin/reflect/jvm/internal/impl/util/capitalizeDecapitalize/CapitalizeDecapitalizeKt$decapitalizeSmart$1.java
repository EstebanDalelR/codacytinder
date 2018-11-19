package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class CapitalizeDecapitalizeKt$decapitalizeSmart$1 extends Lambda implements Function1<Integer, Boolean> {
    final /* synthetic */ boolean $asciiOnly;
    final /* synthetic */ String receiver$0;

    CapitalizeDecapitalizeKt$decapitalizeSmart$1(String str, boolean z) {
        this.receiver$0 = str;
        this.$asciiOnly = z;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke(((Number) obj).intValue()));
    }

    public final boolean invoke(int i) {
        i = this.receiver$0.charAt(i);
        if (!this.$asciiOnly) {
            return Character.isUpperCase(i);
        }
        if (65 <= i) {
            if (90 >= i) {
                return true;
            }
        }
        return false;
    }
}
