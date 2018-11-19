package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.internal.C15908c;

/* renamed from: okhttp3.internal.http.c */
public final class C15924c {
    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f49350a = new C159231();
    /* renamed from: b */
    private static final String[] f49351b = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    /* renamed from: c */
    private static final DateFormat[] f49352c = new DateFormat[f49351b.length];

    /* renamed from: okhttp3.internal.http.c$1 */
    class C159231 extends ThreadLocal<DateFormat> {
        C159231() {
        }

        protected /* synthetic */ Object initialValue() {
            return m60257a();
        }

        /* renamed from: a */
        protected DateFormat m60257a() {
            DateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C15908c.f49251g);
            return simpleDateFormat;
        }
    }

    /* renamed from: a */
    public static Date m60259a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f49350a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f49351b) {
            int length = f49351b.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f49352c[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f49351b[i], Locale.US);
                    dateFormat.setTimeZone(C15908c.f49251g);
                    f49352c[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m60258a(Date date) {
        return ((DateFormat) f49350a.get()).format(date);
    }
}
