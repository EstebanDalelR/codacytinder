package retrofit.mime;

import java.util.regex.Pattern;

/* renamed from: retrofit.mime.b */
public final class C19390b {
    /* renamed from: a */
    private static final Pattern f60526a = Pattern.compile("\\Wcharset=([^\\s;]+)", 2);

    /* renamed from: a */
    public static String m69593a(String str, String str2) {
        str = f60526a.matcher(str);
        return str.find() ? str.group(1).replaceAll("[\"\\\\]", "") : str2;
    }
}
