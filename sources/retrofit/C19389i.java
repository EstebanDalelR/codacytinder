package retrofit;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import retrofit.client.C19369d;
import retrofit.client.C19370e;
import retrofit.mime.C19544d;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

/* renamed from: retrofit.i */
final class C19389i {

    /* renamed from: retrofit.i$a */
    static class C19388a implements Executor {
        C19388a() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    static byte[] m69592a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (inputStream != null) {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    static C19369d m69588a(C19369d c19369d) throws IOException {
        TypedOutput d = c19369d.m69549d();
        if (d != null) {
            if (!(d instanceof C19544d)) {
                String mimeType = d.mimeType();
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                d.writeTo(byteArrayOutputStream);
                return new C19369d(c19369d.m69546a(), c19369d.m69547b(), c19369d.m69548c(), new C19544d(mimeType, byteArrayOutputStream.toByteArray()));
            }
        }
        return c19369d;
    }

    /* renamed from: a */
    static retrofit.client.C19370e m69589a(retrofit.client.C19370e r4) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r4.m69554e();
        if (r0 == 0) goto L_0x002d;
    L_0x0006:
        r1 = r0 instanceof retrofit.mime.C19544d;
        if (r1 == 0) goto L_0x000b;
    L_0x000a:
        goto L_0x002d;
    L_0x000b:
        r1 = r0.mimeType();
        r0 = r0.in();
        r2 = retrofit.C19389i.m69592a(r0);	 Catch:{ all -> 0x0026 }
        r3 = new retrofit.mime.d;	 Catch:{ all -> 0x0026 }
        r3.<init>(r1, r2);	 Catch:{ all -> 0x0026 }
        r4 = retrofit.C19389i.m69590a(r4, r3);	 Catch:{ all -> 0x0026 }
        if (r0 == 0) goto L_0x0025;
    L_0x0022:
        r0.close();	 Catch:{ IOException -> 0x0025 }
    L_0x0025:
        return r4;
    L_0x0026:
        r4 = move-exception;
        if (r0 == 0) goto L_0x002c;
    L_0x0029:
        r0.close();	 Catch:{ IOException -> 0x002c }
    L_0x002c:
        throw r4;
    L_0x002d:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit.i.a(retrofit.client.e):retrofit.client.e");
    }

    /* renamed from: a */
    static C19370e m69590a(C19370e c19370e, TypedInput typedInput) {
        return new C19370e(c19370e.m69550a(), c19370e.m69551b(), c19370e.m69552c(), c19370e.m69553d(), typedInput);
    }

    /* renamed from: a */
    static <T> void m69591a(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("Only interface endpoint definitions are supported.");
        } else if (cls.getInterfaces().length > null) {
            throw new IllegalArgumentException("Interface definitions must not extend other interfaces.");
        }
    }
}
