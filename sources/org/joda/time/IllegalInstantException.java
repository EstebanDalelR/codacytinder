package org.joda.time;

import org.joda.time.format.C19315a;

public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(String str) {
        super(str);
    }

    public IllegalInstantException(long j, String str) {
        super(m68935a(j, str));
    }

    /* renamed from: a */
    private static String m68935a(long j, String str) {
        String stringBuilder;
        j = C19315a.m69151a("yyyy-MM-dd'T'HH:mm:ss.SSS").m69160a(new Instant(j));
        if (str != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(" (");
            stringBuilder2.append(str);
            stringBuilder2.append(")");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        str = new StringBuilder();
        str.append("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ");
        str.append(j);
        str.append(stringBuilder);
        return str.toString();
    }
}
