package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import com.tinder.api.ManagerWebServices;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

final class CapitalizeDecapitalizeKt$decapitalizeSmart$2 extends Lambda implements Function1<String, String> {
    final /* synthetic */ boolean $asciiOnly;

    CapitalizeDecapitalizeKt$decapitalizeSmart$2(boolean z) {
        this.$asciiOnly = z;
        super(1);
    }

    @NotNull
    public final String invoke(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TEASER_STRING);
        if (this.$asciiOnly) {
            return CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(str);
        }
        str = str.toLowerCase();
        C2668g.a(str, "(this as java.lang.String).toLowerCase()");
        return str;
    }
}
