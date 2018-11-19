package retrofit.converter;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.OutputStream;
import retrofit.mime.TypedOutput;

/* renamed from: retrofit.converter.a */
public class C19532a implements Converter {
    /* renamed from: a */
    private final Gson f61040a;
    /* renamed from: b */
    private String f61041b;

    /* renamed from: retrofit.converter.a$a */
    private static class C19531a implements TypedOutput {
        /* renamed from: a */
        private final byte[] f61038a;
        /* renamed from: b */
        private final String f61039b;

        public String fileName() {
            return null;
        }

        C19531a(byte[] bArr, String str) {
            this.f61038a = bArr;
            bArr = new StringBuilder();
            bArr.append("application/json; charset=");
            bArr.append(str);
            this.f61039b = bArr.toString();
        }

        public String mimeType() {
            return this.f61039b;
        }

        public long length() {
            return (long) this.f61038a.length;
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(this.f61038a);
        }
    }

    public C19532a(Gson gson) {
        this(gson, "UTF-8");
    }

    public C19532a(Gson gson, String str) {
        this.f61040a = gson;
        this.f61041b = str;
    }

    public java.lang.Object fromBody(retrofit.mime.TypedInput r4, java.lang.reflect.Type r5) throws retrofit.converter.ConversionException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f61041b;
        r1 = r4.mimeType();
        if (r1 == 0) goto L_0x0010;
    L_0x0008:
        r1 = r4.mimeType();
        r0 = retrofit.mime.C19390b.m69593a(r1, r0);
    L_0x0010:
        r1 = 0;
        r2 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x0038, JsonParseException -> 0x0031 }
        r4 = r4.in();	 Catch:{ IOException -> 0x0038, JsonParseException -> 0x0031 }
        r2.<init>(r4, r0);	 Catch:{ IOException -> 0x0038, JsonParseException -> 0x0031 }
        r4 = r3.f61040a;	 Catch:{ IOException -> 0x002c, JsonParseException -> 0x0029, all -> 0x0026 }
        r4 = r4.fromJson(r2, r5);	 Catch:{ IOException -> 0x002c, JsonParseException -> 0x0029, all -> 0x0026 }
        if (r2 == 0) goto L_0x0025;
    L_0x0022:
        r2.close();	 Catch:{ IOException -> 0x0025 }
    L_0x0025:
        return r4;
    L_0x0026:
        r4 = move-exception;
        r1 = r2;
        goto L_0x003f;
    L_0x0029:
        r4 = move-exception;
        r1 = r2;
        goto L_0x0032;
    L_0x002c:
        r4 = move-exception;
        r1 = r2;
        goto L_0x0039;
    L_0x002f:
        r4 = move-exception;
        goto L_0x003f;
    L_0x0031:
        r4 = move-exception;
    L_0x0032:
        r5 = new retrofit.converter.ConversionException;	 Catch:{ all -> 0x002f }
        r5.<init>(r4);	 Catch:{ all -> 0x002f }
        throw r5;	 Catch:{ all -> 0x002f }
    L_0x0038:
        r4 = move-exception;	 Catch:{ all -> 0x002f }
    L_0x0039:
        r5 = new retrofit.converter.ConversionException;	 Catch:{ all -> 0x002f }
        r5.<init>(r4);	 Catch:{ all -> 0x002f }
        throw r5;	 Catch:{ all -> 0x002f }
    L_0x003f:
        if (r1 == 0) goto L_0x0044;
    L_0x0041:
        r1.close();	 Catch:{ IOException -> 0x0044 }
    L_0x0044:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit.converter.a.fromBody(retrofit.mime.TypedInput, java.lang.reflect.Type):java.lang.Object");
    }

    public TypedOutput toBody(Object obj) {
        try {
            return new C19531a(this.f61040a.toJson(obj).getBytes(this.f61041b), this.f61041b);
        } catch (Object obj2) {
            throw new AssertionError(obj2);
        }
    }
}
