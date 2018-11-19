package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/ScreenFloatValueRegEx;", "", "()V", "value", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.text.h */
final class C15878h {
    @NotNull
    @JvmField
    /* renamed from: a */
    public static final Regex f49055a;
    /* renamed from: b */
    public static final C15878h f49056b = new C15878h();

    static {
        String str = "(\\p{Digit}+)";
        String str2 = "(\\p{XDigit}+)";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[eE][+-]?");
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("(0[xX]");
        stringBuilder3.append(str2);
        stringBuilder3.append("(\\.)?)|");
        stringBuilder3.append("(0[xX]");
        stringBuilder3.append(str2);
        stringBuilder3.append("?(\\.)");
        stringBuilder3.append(str2);
        stringBuilder3.append(')');
        String stringBuilder4 = stringBuilder3.toString();
        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append('(');
        stringBuilder5.append(str);
        stringBuilder5.append("(\\.)?(");
        stringBuilder5.append(str);
        stringBuilder5.append("?)(");
        stringBuilder5.append(stringBuilder2);
        stringBuilder5.append(")?)|");
        stringBuilder5.append("(\\.(");
        stringBuilder5.append(str);
        stringBuilder5.append(")(");
        stringBuilder5.append(stringBuilder2);
        stringBuilder5.append(")?)|");
        stringBuilder5.append("((");
        stringBuilder5.append(stringBuilder4);
        stringBuilder5.append(")[pP][+-]?");
        stringBuilder5.append(str);
        stringBuilder5.append(')');
        str = stringBuilder5.toString();
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        stringBuilder6.append(str);
        stringBuilder6.append(")[fFdD]?))[\\x00-\\x20]*");
        f49055a = new Regex(stringBuilder6.toString());
    }

    private C15878h() {
    }
}
