package retrofit.mime;

/* renamed from: retrofit.mime.e */
public class C19648e extends C19544d {
    public C19648e(String str) {
        super("text/plain; charset=UTF-8", C19648e.m70869a(str));
    }

    /* renamed from: a */
    private static byte[] m70869a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (String str2) {
            throw new RuntimeException(str2);
        }
    }

    public java.lang.String toString() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r0.<init>();	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r1 = "TypedString[";	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r0.append(r1);	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r1 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r2 = r4.m70530a();	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r3 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r1.<init>(r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r0.append(r1);	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r1 = "]";	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r0.append(r1);	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        r0 = r0.toString();	 Catch:{ UnsupportedEncodingException -> 0x0022 }
        return r0;
    L_0x0022:
        r0 = new java.lang.AssertionError;
        r1 = "Must be able to decode UTF-8";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit.mime.e.toString():java.lang.String");
    }
}
