package okhttp3.logging;

import com.google.android.exoplayer2.Format;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import okhttp3.C15957l;
import okhttp3.C15958m;
import okhttp3.C15963q;
import okhttp3.C15964r;
import okhttp3.C15966s;
import okhttp3.C15968t;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.http.C15925d;
import okhttp3.internal.p461b.C15904f;
import okio.BufferedSource;
import okio.C17707i;
import okio.C18549c;

public final class HttpLoggingInterceptor implements Interceptor {
    /* renamed from: a */
    private static final Charset f55024a = Charset.forName("UTF-8");
    /* renamed from: b */
    private final Logger f55025b;
    /* renamed from: c */
    private volatile Level f55026c;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        /* renamed from: a */
        public static final Logger f49509a = new C176891();

        /* renamed from: okhttp3.logging.HttpLoggingInterceptor$Logger$1 */
        class C176891 implements Logger {
            C176891() {
            }

            public void log(String str) {
                C15904f.m60134c().mo13338a(4, str, null);
            }
        }

        void log(String str);
    }

    public C15966s intercept(Chain chain) throws IOException {
        Throwable th;
        Chain chain2 = chain;
        Level level = this.f55026c;
        C15963q request = chain.request();
        if (level == Level.NONE) {
            return chain2.proceed(request);
        }
        Object obj;
        C15964r d;
        Connection connection;
        StringBuilder stringBuilder;
        String stringBuilder2;
        Logger logger;
        StringBuilder stringBuilder3;
        C15957l c;
        int a;
        int i;
        String a2;
        Logger logger2;
        C18549c c18549c;
        Charset charset;
        C15958m contentType;
        StringBuilder stringBuilder4;
        long nanoTime;
        C15966s proceed;
        C15968t h;
        long contentLength;
        String stringBuilder5;
        char c2;
        String stringBuilder6;
        StringBuilder stringBuilder7;
        String stringBuilder8;
        C15957l g;
        int a3;
        int i2;
        C18549c buffer;
        C17707i c17707i;
        Charset charset2;
        C15958m contentType2;
        Logger logger3;
        StringBuilder stringBuilder9;
        Object obj2 = 1;
        Object obj3 = level == Level.BODY ? 1 : null;
        if (obj3 == null) {
            if (level != Level.HEADERS) {
                obj = null;
                d = request.m60530d();
                if (d != null) {
                    obj2 = null;
                }
                connection = chain.connection();
                stringBuilder = new StringBuilder();
                stringBuilder.append("--> ");
                stringBuilder.append(request.m60527b());
                stringBuilder.append(' ');
                stringBuilder.append(request.m60526a());
                if (connection == null) {
                    StringBuilder stringBuilder10 = new StringBuilder();
                    stringBuilder10.append(" ");
                    stringBuilder10.append(connection.protocol());
                    stringBuilder2 = stringBuilder10.toString();
                } else {
                    stringBuilder2 = "";
                }
                stringBuilder.append(stringBuilder2);
                stringBuilder2 = stringBuilder.toString();
                if (obj == null && obj2 != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(stringBuilder2);
                    stringBuilder.append(" (");
                    stringBuilder.append(d.contentLength());
                    stringBuilder.append("-byte body)");
                    stringBuilder2 = stringBuilder.toString();
                }
                r1.f55025b.log(stringBuilder2);
                if (obj != null) {
                    if (obj2 != null) {
                        if (d.contentType() != null) {
                            logger = r1.f55025b;
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Content-Type: ");
                            stringBuilder3.append(d.contentType());
                            logger.log(stringBuilder3.toString());
                        }
                        if (d.contentLength() != -1) {
                            logger = r1.f55025b;
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Content-Length: ");
                            stringBuilder3.append(d.contentLength());
                            logger.log(stringBuilder3.toString());
                        }
                    }
                    c = request.m60529c();
                    a = c.m60473a();
                    for (i = 0; i < a; i++) {
                        a2 = c.m60474a(i);
                        if (!(ManagerWebServices.PARAM_CONTENT_TYPE.equalsIgnoreCase(a2) || "Content-Length".equalsIgnoreCase(a2))) {
                            logger2 = r1.f55025b;
                            StringBuilder stringBuilder11 = new StringBuilder();
                            stringBuilder11.append(a2);
                            stringBuilder11.append(": ");
                            stringBuilder11.append(c.m60476b(i));
                            logger2.log(stringBuilder11.toString());
                        }
                    }
                    if (obj3 != null) {
                        if (obj2 == null) {
                            if (m64373a(request.m60529c())) {
                                c18549c = new C18549c();
                                d.writeTo(c18549c);
                                charset = f55024a;
                                contentType = d.contentType();
                                if (contentType != null) {
                                    charset = contentType.m60481a(f55024a);
                                }
                                r1.f55025b.log("");
                                if (m64374a(c18549c)) {
                                    logger2 = r1.f55025b;
                                    stringBuilder4 = new StringBuilder();
                                    stringBuilder4.append("--> END ");
                                    stringBuilder4.append(request.m60527b());
                                    stringBuilder4.append(" (binary ");
                                    stringBuilder4.append(d.contentLength());
                                    stringBuilder4.append("-byte body omitted)");
                                    logger2.log(stringBuilder4.toString());
                                } else {
                                    r1.f55025b.log(c18549c.readString(charset));
                                    logger2 = r1.f55025b;
                                    stringBuilder4 = new StringBuilder();
                                    stringBuilder4.append("--> END ");
                                    stringBuilder4.append(request.m60527b());
                                    stringBuilder4.append(" (");
                                    stringBuilder4.append(d.contentLength());
                                    stringBuilder4.append("-byte body)");
                                    logger2.log(stringBuilder4.toString());
                                }
                            } else {
                                logger2 = r1.f55025b;
                                stringBuilder4 = new StringBuilder();
                                stringBuilder4.append("--> END ");
                                stringBuilder4.append(request.m60527b());
                                stringBuilder4.append(" (encoded body omitted)");
                                logger2.log(stringBuilder4.toString());
                            }
                        }
                    }
                    logger2 = r1.f55025b;
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("--> END ");
                    stringBuilder4.append(request.m60527b());
                    logger2.log(stringBuilder4.toString());
                }
                nanoTime = System.nanoTime();
                proceed = chain2.proceed(request);
                nanoTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                h = proceed.m60560h();
                contentLength = h.contentLength();
                if (contentLength == -1) {
                    StringBuilder stringBuilder12 = new StringBuilder();
                    stringBuilder12.append(contentLength);
                    stringBuilder12.append("-byte");
                    stringBuilder5 = stringBuilder12.toString();
                } else {
                    stringBuilder5 = "unknown-length";
                }
                Logger logger4 = r1.f55025b;
                stringBuilder = new StringBuilder();
                stringBuilder.append("<-- ");
                stringBuilder.append(proceed.m60555c());
                if (proceed.m60557e().isEmpty()) {
                    stringBuilder3 = new StringBuilder();
                    c2 = ' ';
                    stringBuilder3.append(' ');
                    stringBuilder3.append(proceed.m60557e());
                    stringBuilder6 = stringBuilder3.toString();
                } else {
                    stringBuilder6 = "";
                    c2 = ' ';
                }
                stringBuilder.append(stringBuilder6);
                stringBuilder.append(c2);
                stringBuilder.append(proceed.m60553a().m60526a());
                stringBuilder.append(" (");
                stringBuilder.append(nanoTime);
                stringBuilder.append("ms");
                if (obj != null) {
                    stringBuilder7 = new StringBuilder();
                    stringBuilder7.append(", ");
                    stringBuilder7.append(stringBuilder5);
                    stringBuilder7.append(" body");
                    stringBuilder8 = stringBuilder7.toString();
                } else {
                    stringBuilder8 = "";
                }
                stringBuilder.append(stringBuilder8);
                stringBuilder.append(')');
                logger4.log(stringBuilder.toString());
                if (obj != null) {
                    g = proceed.m60559g();
                    a3 = g.m60473a();
                    for (i2 = 0; i2 < a3; i2++) {
                        Logger logger5 = r1.f55025b;
                        StringBuilder stringBuilder13 = new StringBuilder();
                        stringBuilder13.append(g.m60474a(i2));
                        stringBuilder13.append(": ");
                        stringBuilder13.append(g.m60476b(i2));
                        logger5.log(stringBuilder13.toString());
                    }
                    if (obj3 != null) {
                        if (!C15925d.m60273d(proceed)) {
                            if (m64373a(proceed.m60559g())) {
                                BufferedSource source = h.source();
                                source.request(Format.OFFSET_SAMPLE_RELATIVE);
                                buffer = source.buffer();
                                C17707i c17707i2 = null;
                                if ("gzip".equalsIgnoreCase(g.m60475a("Content-Encoding"))) {
                                    obj = null;
                                } else {
                                    obj = Long.valueOf(buffer.m66945a());
                                    try {
                                        c17707i = new C17707i(buffer.m66965e());
                                        try {
                                            buffer = new C18549c();
                                            buffer.writeAll(c17707i);
                                            if (c17707i != null) {
                                                c17707i.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c17707i2 = c17707i;
                                            if (c17707i2 != null) {
                                                c17707i2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th22) {
                                        th = th22;
                                        if (c17707i2 != null) {
                                            c17707i2.close();
                                        }
                                        throw th;
                                    }
                                }
                                charset2 = f55024a;
                                contentType2 = h.contentType();
                                if (contentType2 != null) {
                                    charset2 = contentType2.m60481a(f55024a);
                                }
                                if (m64374a(buffer)) {
                                    r1.f55025b.log("");
                                    logger3 = r1.f55025b;
                                    stringBuilder9 = new StringBuilder();
                                    stringBuilder9.append("<-- END HTTP (binary ");
                                    stringBuilder9.append(buffer.m66945a());
                                    stringBuilder9.append("-byte body omitted)");
                                    logger3.log(stringBuilder9.toString());
                                    return proceed;
                                }
                                if (contentLength != 0) {
                                    r1.f55025b.log("");
                                    r1.f55025b.log(buffer.m66965e().readString(charset2));
                                }
                                if (obj == null) {
                                    Logger logger6 = r1.f55025b;
                                    stringBuilder7 = new StringBuilder();
                                    stringBuilder7.append("<-- END HTTP (");
                                    stringBuilder7.append(buffer.m66945a());
                                    stringBuilder7.append("-byte, ");
                                    stringBuilder7.append(obj);
                                    stringBuilder7.append("-gzipped-byte body)");
                                    logger6.log(stringBuilder7.toString());
                                } else {
                                    logger3 = r1.f55025b;
                                    stringBuilder9 = new StringBuilder();
                                    stringBuilder9.append("<-- END HTTP (");
                                    stringBuilder9.append(buffer.m66945a());
                                    stringBuilder9.append("-byte body)");
                                    logger3.log(stringBuilder9.toString());
                                }
                            } else {
                                r1.f55025b.log("<-- END HTTP (encoded body omitted)");
                            }
                        }
                    }
                    r1.f55025b.log("<-- END HTTP");
                }
                return proceed;
            }
        }
        obj = 1;
        d = request.m60530d();
        if (d != null) {
            obj2 = null;
        }
        connection = chain.connection();
        stringBuilder = new StringBuilder();
        stringBuilder.append("--> ");
        stringBuilder.append(request.m60527b());
        stringBuilder.append(' ');
        stringBuilder.append(request.m60526a());
        if (connection == null) {
            stringBuilder2 = "";
        } else {
            StringBuilder stringBuilder102 = new StringBuilder();
            stringBuilder102.append(" ");
            stringBuilder102.append(connection.protocol());
            stringBuilder2 = stringBuilder102.toString();
        }
        stringBuilder.append(stringBuilder2);
        stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(" (");
        stringBuilder.append(d.contentLength());
        stringBuilder.append("-byte body)");
        stringBuilder2 = stringBuilder.toString();
        r1.f55025b.log(stringBuilder2);
        if (obj != null) {
            if (obj2 != null) {
                if (d.contentType() != null) {
                    logger = r1.f55025b;
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Content-Type: ");
                    stringBuilder3.append(d.contentType());
                    logger.log(stringBuilder3.toString());
                }
                if (d.contentLength() != -1) {
                    logger = r1.f55025b;
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Content-Length: ");
                    stringBuilder3.append(d.contentLength());
                    logger.log(stringBuilder3.toString());
                }
            }
            c = request.m60529c();
            a = c.m60473a();
            for (i = 0; i < a; i++) {
                a2 = c.m60474a(i);
                logger2 = r1.f55025b;
                StringBuilder stringBuilder112 = new StringBuilder();
                stringBuilder112.append(a2);
                stringBuilder112.append(": ");
                stringBuilder112.append(c.m60476b(i));
                logger2.log(stringBuilder112.toString());
            }
            if (obj3 != null) {
                if (obj2 == null) {
                    if (m64373a(request.m60529c())) {
                        c18549c = new C18549c();
                        d.writeTo(c18549c);
                        charset = f55024a;
                        contentType = d.contentType();
                        if (contentType != null) {
                            charset = contentType.m60481a(f55024a);
                        }
                        r1.f55025b.log("");
                        if (m64374a(c18549c)) {
                            logger2 = r1.f55025b;
                            stringBuilder4 = new StringBuilder();
                            stringBuilder4.append("--> END ");
                            stringBuilder4.append(request.m60527b());
                            stringBuilder4.append(" (binary ");
                            stringBuilder4.append(d.contentLength());
                            stringBuilder4.append("-byte body omitted)");
                            logger2.log(stringBuilder4.toString());
                        } else {
                            r1.f55025b.log(c18549c.readString(charset));
                            logger2 = r1.f55025b;
                            stringBuilder4 = new StringBuilder();
                            stringBuilder4.append("--> END ");
                            stringBuilder4.append(request.m60527b());
                            stringBuilder4.append(" (");
                            stringBuilder4.append(d.contentLength());
                            stringBuilder4.append("-byte body)");
                            logger2.log(stringBuilder4.toString());
                        }
                    } else {
                        logger2 = r1.f55025b;
                        stringBuilder4 = new StringBuilder();
                        stringBuilder4.append("--> END ");
                        stringBuilder4.append(request.m60527b());
                        stringBuilder4.append(" (encoded body omitted)");
                        logger2.log(stringBuilder4.toString());
                    }
                }
            }
            logger2 = r1.f55025b;
            stringBuilder4 = new StringBuilder();
            stringBuilder4.append("--> END ");
            stringBuilder4.append(request.m60527b());
            logger2.log(stringBuilder4.toString());
        }
        nanoTime = System.nanoTime();
        try {
            proceed = chain2.proceed(request);
            nanoTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            h = proceed.m60560h();
            contentLength = h.contentLength();
            if (contentLength == -1) {
                stringBuilder5 = "unknown-length";
            } else {
                StringBuilder stringBuilder122 = new StringBuilder();
                stringBuilder122.append(contentLength);
                stringBuilder122.append("-byte");
                stringBuilder5 = stringBuilder122.toString();
            }
            Logger logger42 = r1.f55025b;
            stringBuilder = new StringBuilder();
            stringBuilder.append("<-- ");
            stringBuilder.append(proceed.m60555c());
            if (proceed.m60557e().isEmpty()) {
                stringBuilder3 = new StringBuilder();
                c2 = ' ';
                stringBuilder3.append(' ');
                stringBuilder3.append(proceed.m60557e());
                stringBuilder6 = stringBuilder3.toString();
            } else {
                stringBuilder6 = "";
                c2 = ' ';
            }
            stringBuilder.append(stringBuilder6);
            stringBuilder.append(c2);
            stringBuilder.append(proceed.m60553a().m60526a());
            stringBuilder.append(" (");
            stringBuilder.append(nanoTime);
            stringBuilder.append("ms");
            if (obj != null) {
                stringBuilder8 = "";
            } else {
                stringBuilder7 = new StringBuilder();
                stringBuilder7.append(", ");
                stringBuilder7.append(stringBuilder5);
                stringBuilder7.append(" body");
                stringBuilder8 = stringBuilder7.toString();
            }
            stringBuilder.append(stringBuilder8);
            stringBuilder.append(')');
            logger42.log(stringBuilder.toString());
            if (obj != null) {
                g = proceed.m60559g();
                a3 = g.m60473a();
                for (i2 = 0; i2 < a3; i2++) {
                    Logger logger52 = r1.f55025b;
                    StringBuilder stringBuilder132 = new StringBuilder();
                    stringBuilder132.append(g.m60474a(i2));
                    stringBuilder132.append(": ");
                    stringBuilder132.append(g.m60476b(i2));
                    logger52.log(stringBuilder132.toString());
                }
                if (obj3 != null) {
                    if (!C15925d.m60273d(proceed)) {
                        if (m64373a(proceed.m60559g())) {
                            BufferedSource source2 = h.source();
                            source2.request(Format.OFFSET_SAMPLE_RELATIVE);
                            buffer = source2.buffer();
                            C17707i c17707i22 = null;
                            if ("gzip".equalsIgnoreCase(g.m60475a("Content-Encoding"))) {
                                obj = null;
                            } else {
                                obj = Long.valueOf(buffer.m66945a());
                                c17707i = new C17707i(buffer.m66965e());
                                buffer = new C18549c();
                                buffer.writeAll(c17707i);
                                if (c17707i != null) {
                                    c17707i.close();
                                }
                            }
                            charset2 = f55024a;
                            contentType2 = h.contentType();
                            if (contentType2 != null) {
                                charset2 = contentType2.m60481a(f55024a);
                            }
                            if (m64374a(buffer)) {
                                if (contentLength != 0) {
                                    r1.f55025b.log("");
                                    r1.f55025b.log(buffer.m66965e().readString(charset2));
                                }
                                if (obj == null) {
                                    logger3 = r1.f55025b;
                                    stringBuilder9 = new StringBuilder();
                                    stringBuilder9.append("<-- END HTTP (");
                                    stringBuilder9.append(buffer.m66945a());
                                    stringBuilder9.append("-byte body)");
                                    logger3.log(stringBuilder9.toString());
                                } else {
                                    Logger logger62 = r1.f55025b;
                                    stringBuilder7 = new StringBuilder();
                                    stringBuilder7.append("<-- END HTTP (");
                                    stringBuilder7.append(buffer.m66945a());
                                    stringBuilder7.append("-byte, ");
                                    stringBuilder7.append(obj);
                                    stringBuilder7.append("-gzipped-byte body)");
                                    logger62.log(stringBuilder7.toString());
                                }
                            } else {
                                r1.f55025b.log("");
                                logger3 = r1.f55025b;
                                stringBuilder9 = new StringBuilder();
                                stringBuilder9.append("<-- END HTTP (binary ");
                                stringBuilder9.append(buffer.m66945a());
                                stringBuilder9.append("-byte body omitted)");
                                logger3.log(stringBuilder9.toString());
                                return proceed;
                            }
                        }
                        r1.f55025b.log("<-- END HTTP (encoded body omitted)");
                    }
                }
                r1.f55025b.log("<-- END HTTP");
            }
            return proceed;
        } catch (Exception e) {
            Logger logger7 = r1.f55025b;
            StringBuilder stringBuilder14 = new StringBuilder();
            stringBuilder14.append("<-- HTTP FAILED: ");
            stringBuilder14.append(e);
            logger7.log(stringBuilder14.toString());
            throw e;
        }
    }

    /* renamed from: a */
    static boolean m64374a(okio.C18549c r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r7 = new okio.c;	 Catch:{ EOFException -> 0x0040 }
        r7.<init>();	 Catch:{ EOFException -> 0x0040 }
        r1 = r8.m66945a();	 Catch:{ EOFException -> 0x0040 }
        r3 = 64;	 Catch:{ EOFException -> 0x0040 }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ EOFException -> 0x0040 }
        if (r5 >= 0) goto L_0x0016;	 Catch:{ EOFException -> 0x0040 }
    L_0x0010:
        r1 = r8.m66945a();	 Catch:{ EOFException -> 0x0040 }
        r5 = r1;	 Catch:{ EOFException -> 0x0040 }
        goto L_0x0017;	 Catch:{ EOFException -> 0x0040 }
    L_0x0016:
        r5 = r3;	 Catch:{ EOFException -> 0x0040 }
    L_0x0017:
        r3 = 0;	 Catch:{ EOFException -> 0x0040 }
        r1 = r8;	 Catch:{ EOFException -> 0x0040 }
        r2 = r7;	 Catch:{ EOFException -> 0x0040 }
        r1.m66953a(r2, r3, r5);	 Catch:{ EOFException -> 0x0040 }
        r8 = 0;	 Catch:{ EOFException -> 0x0040 }
    L_0x001f:
        r1 = 16;	 Catch:{ EOFException -> 0x0040 }
        if (r8 >= r1) goto L_0x003e;	 Catch:{ EOFException -> 0x0040 }
    L_0x0023:
        r1 = r7.exhausted();	 Catch:{ EOFException -> 0x0040 }
        if (r1 == 0) goto L_0x002a;	 Catch:{ EOFException -> 0x0040 }
    L_0x0029:
        goto L_0x003e;	 Catch:{ EOFException -> 0x0040 }
    L_0x002a:
        r1 = r7.readUtf8CodePoint();	 Catch:{ EOFException -> 0x0040 }
        r2 = java.lang.Character.isISOControl(r1);	 Catch:{ EOFException -> 0x0040 }
        if (r2 == 0) goto L_0x003b;	 Catch:{ EOFException -> 0x0040 }
    L_0x0034:
        r1 = java.lang.Character.isWhitespace(r1);	 Catch:{ EOFException -> 0x0040 }
        if (r1 != 0) goto L_0x003b;
    L_0x003a:
        return r0;
    L_0x003b:
        r8 = r8 + 1;
        goto L_0x001f;
    L_0x003e:
        r8 = 1;
        return r8;
    L_0x0040:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.a(okio.c):boolean");
    }

    /* renamed from: a */
    private boolean m64373a(C15957l c15957l) {
        c15957l = c15957l.m60475a("Content-Encoding");
        return (c15957l == null || c15957l.equalsIgnoreCase("identity") || c15957l.equalsIgnoreCase("gzip") != null) ? null : true;
    }
}
