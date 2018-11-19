package retrofit;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import retrofit.C19383g.C19382a;
import retrofit.Profiler.C19352a;
import retrofit.client.C19368b;
import retrofit.client.C19369d;
import retrofit.client.C19370e;
import retrofit.client.Client;
import retrofit.client.Client.Provider;
import retrofit.converter.Converter;
import retrofit.mime.C19390b;
import retrofit.mime.C19544d;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

public class RestAdapter {
    /* renamed from: a */
    final Endpoint f60442a;
    /* renamed from: b */
    final Executor f60443b;
    /* renamed from: c */
    final Executor f60444c;
    /* renamed from: d */
    final RequestInterceptor f60445d;
    /* renamed from: e */
    final Converter f60446e;
    /* renamed from: f */
    final Log f60447f;
    /* renamed from: g */
    final ErrorHandler f60448g;
    /* renamed from: h */
    volatile LogLevel f60449h;
    /* renamed from: i */
    private final Map<Class<?>, Map<Method, RestMethodInfo>> f60450i;
    /* renamed from: j */
    private final Provider f60451j;
    /* renamed from: k */
    private final Profiler f60452k;
    /* renamed from: l */
    private C19383g f60453l;

    public interface Log {
        /* renamed from: b */
        public static final Log f60429b = new C195171();

        /* renamed from: retrofit.RestAdapter$Log$1 */
        static class C195171 implements Log {
            public void log(String str) {
            }

            C195171() {
            }
        }

        void log(String str);
    }

    public enum LogLevel {
        NONE,
        BASIC,
        HEADERS,
        HEADERS_AND_ARGS,
        FULL;

        public boolean log() {
            return this != NONE;
        }
    }

    /* renamed from: retrofit.RestAdapter$a */
    public static class C19356a {
        /* renamed from: a */
        private Endpoint f60430a;
        /* renamed from: b */
        private Provider f60431b;
        /* renamed from: c */
        private Executor f60432c;
        /* renamed from: d */
        private Executor f60433d;
        /* renamed from: e */
        private RequestInterceptor f60434e;
        /* renamed from: f */
        private Converter f60435f;
        /* renamed from: g */
        private Profiler f60436g;
        /* renamed from: h */
        private ErrorHandler f60437h;
        /* renamed from: i */
        private Log f60438i;
        /* renamed from: j */
        private LogLevel f60439j = LogLevel.NONE;

        /* renamed from: a */
        public C19356a m69498a(String str) {
            if (str != null) {
                if (str.trim().length() != 0) {
                    this.f60430a = C19363b.m69542a(str);
                    return this;
                }
            }
            throw new NullPointerException("Endpoint may not be blank.");
        }

        /* renamed from: a */
        public C19356a m69500a(final Client client) {
            if (client != null) {
                return m69499a(new Provider(this) {
                    /* renamed from: b */
                    final /* synthetic */ C19356a f61016b;

                    public Client get() {
                        return client;
                    }
                });
            }
            throw new NullPointerException("Client may not be null.");
        }

        /* renamed from: a */
        public C19356a m69499a(Provider provider) {
            if (provider == null) {
                throw new NullPointerException("Client provider may not be null.");
            }
            this.f60431b = provider;
            return this;
        }

        /* renamed from: a */
        public C19356a m69501a(Converter converter) {
            if (converter == null) {
                throw new NullPointerException("Converter may not be null.");
            }
            this.f60435f = converter;
            return this;
        }

        /* renamed from: a */
        public RestAdapter m69502a() {
            if (this.f60430a == null) {
                throw new IllegalArgumentException("Endpoint may not be null.");
            }
            m69497b();
            return new RestAdapter(this.f60430a, this.f60431b, this.f60432c, this.f60433d, this.f60434e, this.f60435f, this.f60436g, this.f60437h, this.f60438i, this.f60439j);
        }

        /* renamed from: b */
        private void m69497b() {
            if (this.f60435f == null) {
                this.f60435f = C19378d.m69556a().mo14656b();
            }
            if (this.f60431b == null) {
                this.f60431b = C19378d.m69556a().mo14657c();
            }
            if (this.f60432c == null) {
                this.f60432c = C19378d.m69556a().mo14658d();
            }
            if (this.f60433d == null) {
                this.f60433d = C19378d.m69556a().mo14659e();
            }
            if (this.f60437h == null) {
                this.f60437h = ErrorHandler.f60419a;
            }
            if (this.f60438i == null) {
                this.f60438i = C19378d.m69556a().mo14660f();
            }
            if (this.f60434e == null) {
                this.f60434e = RequestInterceptor.f60425a;
            }
        }
    }

    /* renamed from: retrofit.RestAdapter$b */
    private class C19357b implements InvocationHandler {
        /* renamed from: a */
        final /* synthetic */ RestAdapter f60440a;
        /* renamed from: b */
        private final Map<Method, RestMethodInfo> f60441b;

        C19357b(RestAdapter restAdapter, Map<Method, RestMethodInfo> map) {
            this.f60440a = restAdapter;
            this.f60441b = map;
        }

        public Object invoke(Object obj, Method method, final Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            final RestMethodInfo a = RestAdapter.m69506a(this.f60441b, method);
            if (a.f60459d != null) {
                try {
                    return m69503a(this.f60440a.f60445d, a, objArr);
                } catch (Object obj2) {
                    method = this.f60440a.f60448g.handleError(obj2);
                    if (method == null) {
                        throw new IllegalStateException("Error handler returned null for wrapped exception.", obj2);
                    }
                    throw method;
                }
            }
            if (this.f60440a.f60443b != null) {
                if (this.f60440a.f60444c != null) {
                    if (a.f60460e != null) {
                        if (this.f60440a.f60453l == null) {
                            if (C19378d.f60507a != null) {
                                this.f60440a.f60453l = new C19383g(this.f60440a.f60443b, this.f60440a.f60448g, this.f60440a.f60445d);
                            } else {
                                throw new IllegalStateException("Observable method found but no RxJava on classpath.");
                            }
                        }
                        return this.f60440a.f60453l.m69572a(new C19382a(this) {
                            /* renamed from: c */
                            final /* synthetic */ C19357b f61019c;

                            /* renamed from: a */
                            public C19380f mo14642a(RequestInterceptor requestInterceptor) {
                                return (C19380f) this.f61019c.m69503a(requestInterceptor, a, objArr);
                            }
                        });
                    }
                    final Object requestInterceptorTape = new RequestInterceptorTape();
                    this.f60440a.f60445d.intercept(requestInterceptorTape);
                    final Object[] objArr2 = objArr;
                    this.f60440a.f60443b.execute(new C19362a(this, (Callback) objArr[objArr.length - 1], this.f60440a.f60444c, this.f60440a.f60448g) {
                        /* renamed from: d */
                        final /* synthetic */ C19357b f61023d;

                        /* renamed from: a */
                        public C19380f mo14643a() {
                            return (C19380f) this.f61023d.m69503a(requestInterceptorTape, a, objArr2);
                        }
                    });
                    return null;
                }
            }
            throw new IllegalStateException("Asynchronous invocation requires calling setExecutors.");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        private java.lang.Object m69503a(retrofit.RequestInterceptor r13, retrofit.RestMethodInfo r14, java.lang.Object[] r15) {
            /*
            r12 = this;
            r0 = 0;
            r14.m69532a();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x01ac, Throwable -> 0x0196 }
            r1 = r12.f60440a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x01ac, Throwable -> 0x0196 }
            r1 = r1.f60442a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x01ac, Throwable -> 0x0196 }
            r1 = r1.getUrl();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x01ac, Throwable -> 0x0196 }
            r2 = new retrofit.e;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x01ac, Throwable -> 0x0196 }
            r3 = r12.f60440a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x01ac, Throwable -> 0x0196 }
            r3 = r3.f60446e;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x01ac, Throwable -> 0x0196 }
            r2.<init>(r1, r14, r3);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x01ac, Throwable -> 0x0196 }
            r2.m70522a(r15);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x01ac, Throwable -> 0x0196 }
            r13.intercept(r2);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x01ac, Throwable -> 0x0196 }
            r13 = r2.m70521a();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x01ac, Throwable -> 0x0196 }
            r2 = r13.m69547b();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x01ac, Throwable -> 0x0196 }
            r3 = r14.f60459d;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            if (r3 != 0) goto L_0x0058;
        L_0x0027:
            r3 = "?";
            r4 = r1.length();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r3 = r2.indexOf(r3, r4);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r4 = -1;
            if (r3 != r4) goto L_0x0038;
        L_0x0034:
            r3 = r2.length();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
        L_0x0038:
            r4 = java.lang.Thread.currentThread();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r5 = new java.lang.StringBuilder;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r5.<init>();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r6 = "Retrofit-";
            r5.append(r6);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r6 = r1.length();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r3 = r2.substring(r6, r3);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r5.append(r3);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r3 = r5.toString();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r4.setName(r3);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
        L_0x0058:
            r3 = r12.f60440a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r3 = r3.f60449h;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r3 = r3.log();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            if (r3 == 0) goto L_0x006a;
        L_0x0062:
            r3 = r12.f60440a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r4 = "HTTP";
            r13 = r3.m69517a(r4, r13, r15);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
        L_0x006a:
            r15 = r12.f60440a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r15 = r15.f60452k;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            if (r15 == 0) goto L_0x007e;
        L_0x0072:
            r15 = r12.f60440a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r15 = r15.f60452k;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r15 = r15.beforeCall();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r8 = r15;
            goto L_0x007f;
        L_0x007e:
            r8 = r0;
        L_0x007f:
            r3 = java.lang.System.nanoTime();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r15 = r12.f60440a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r15 = r15.f60451j;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r15 = r15.get();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r15 = r15.execute(r13);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r5 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r6 = java.lang.System.nanoTime();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r9 = 0;
            r9 = r6 - r3;
            r9 = r5.toMillis(r9);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r11 = r15.m69551b();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r3 = r12.f60440a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r3 = r3.f60452k;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            if (r3 == 0) goto L_0x00b9;
        L_0x00aa:
            r4 = retrofit.RestAdapter.m69513b(r1, r14, r13);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r13 = r12.f60440a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r3 = r13.f60452k;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r5 = r9;
            r7 = r11;
            r3.afterCall(r4, r5, r7, r8);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
        L_0x00b9:
            r13 = r12.f60440a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r13 = r13.f60449h;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r13 = r13.log();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            if (r13 == 0) goto L_0x00c9;
        L_0x00c3:
            r13 = r12.f60440a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r15 = r13.m69507a(r2, r15, r9);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
        L_0x00c9:
            r13 = r14.f60461f;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
            if (r11 < r1) goto L_0x0183;
        L_0x00cf:
            r1 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
            if (r11 >= r1) goto L_0x0183;
        L_0x00d3:
            r1 = retrofit.client.C19370e.class;
            r1 = r13.equals(r1);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            if (r1 == 0) goto L_0x0108;
        L_0x00db:
            r13 = r14.f60470o;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            if (r13 != 0) goto L_0x00e3;
        L_0x00df:
            r15 = retrofit.C19389i.m69589a(r15);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
        L_0x00e3:
            r13 = r14.f60459d;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            if (r13 == 0) goto L_0x00f5;
        L_0x00e7:
            r13 = r14.f60459d;
            if (r13 != 0) goto L_0x00f4;
        L_0x00eb:
            r13 = java.lang.Thread.currentThread();
            r14 = "Retrofit-Idle";
            r13.setName(r14);
        L_0x00f4:
            return r15;
        L_0x00f5:
            r13 = new retrofit.f;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r13.<init>(r15, r15);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r14 = r14.f60459d;
            if (r14 != 0) goto L_0x0107;
        L_0x00fe:
            r14 = java.lang.Thread.currentThread();
            r15 = "Retrofit-Idle";
            r14.setName(r15);
        L_0x0107:
            return r13;
        L_0x0108:
            r1 = r15.m69554e();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            if (r1 != 0) goto L_0x0133;
        L_0x010e:
            r13 = r14.f60459d;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            if (r13 == 0) goto L_0x0120;
        L_0x0112:
            r13 = r14.f60459d;
            if (r13 != 0) goto L_0x011f;
        L_0x0116:
            r13 = java.lang.Thread.currentThread();
            r14 = "Retrofit-Idle";
            r13.setName(r14);
        L_0x011f:
            return r0;
        L_0x0120:
            r13 = new retrofit.f;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r13.<init>(r15, r0);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r14 = r14.f60459d;
            if (r14 != 0) goto L_0x0132;
        L_0x0129:
            r14 = java.lang.Thread.currentThread();
            r15 = "Retrofit-Idle";
            r14.setName(r15);
        L_0x0132:
            return r13;
        L_0x0133:
            r3 = new retrofit.c;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r3.<init>(r1);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r4 = r12.f60440a;	 Catch:{ ConversionException -> 0x016a }
            r4 = r4.f60446e;	 Catch:{ ConversionException -> 0x016a }
            r4 = r4.fromBody(r3, r13);	 Catch:{ ConversionException -> 0x016a }
            r5 = r12.f60440a;	 Catch:{ ConversionException -> 0x016a }
            r5.m69512a(r1, r4);	 Catch:{ ConversionException -> 0x016a }
            r1 = r14.f60459d;	 Catch:{ ConversionException -> 0x016a }
            if (r1 == 0) goto L_0x0157;
        L_0x0149:
            r13 = r14.f60459d;
            if (r13 != 0) goto L_0x0156;
        L_0x014d:
            r13 = java.lang.Thread.currentThread();
            r14 = "Retrofit-Idle";
            r13.setName(r14);
        L_0x0156:
            return r4;
        L_0x0157:
            r1 = new retrofit.f;	 Catch:{ ConversionException -> 0x016a }
            r1.<init>(r15, r4);	 Catch:{ ConversionException -> 0x016a }
            r13 = r14.f60459d;
            if (r13 != 0) goto L_0x0169;
        L_0x0160:
            r13 = java.lang.Thread.currentThread();
            r14 = "Retrofit-Idle";
            r13.setName(r14);
        L_0x0169:
            return r1;
        L_0x016a:
            r1 = move-exception;
            r4 = r3.m70491b();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            if (r4 == 0) goto L_0x0176;
        L_0x0171:
            r13 = r3.m70490a();	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            throw r13;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
        L_0x0176:
            r15 = retrofit.C19389i.m69590a(r15, r0);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r0 = r12.f60440a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r0 = r0.f60446e;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r13 = retrofit.RetrofitError.m69536a(r2, r15, r0, r13, r1);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            throw r13;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
        L_0x0183:
            r15 = retrofit.C19389i.m69589a(r15);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r0 = r12.f60440a;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r0 = r0.f60446e;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            r13 = retrofit.RetrofitError.m69535a(r2, r15, r0, r13);	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
            throw r13;	 Catch:{ RetrofitError -> 0x01c2, IOException -> 0x0192, Throwable -> 0x0190 }
        L_0x0190:
            r13 = move-exception;
            goto L_0x0198;
        L_0x0192:
            r13 = move-exception;
            goto L_0x01ae;
        L_0x0194:
            r13 = move-exception;
            goto L_0x01c4;
        L_0x0196:
            r13 = move-exception;
            r2 = r0;
        L_0x0198:
            r15 = r12.f60440a;	 Catch:{ all -> 0x0194 }
            r15 = r15.f60449h;	 Catch:{ all -> 0x0194 }
            r15 = r15.log();	 Catch:{ all -> 0x0194 }
            if (r15 == 0) goto L_0x01a7;
        L_0x01a2:
            r15 = r12.f60440a;	 Catch:{ all -> 0x0194 }
            r15.m69518a(r13, r2);	 Catch:{ all -> 0x0194 }
        L_0x01a7:
            r13 = retrofit.RetrofitError.m69534a(r2, r13);	 Catch:{ all -> 0x0194 }
            throw r13;	 Catch:{ all -> 0x0194 }
        L_0x01ac:
            r13 = move-exception;
            r2 = r0;
        L_0x01ae:
            r15 = r12.f60440a;	 Catch:{ all -> 0x0194 }
            r15 = r15.f60449h;	 Catch:{ all -> 0x0194 }
            r15 = r15.log();	 Catch:{ all -> 0x0194 }
            if (r15 == 0) goto L_0x01bd;
        L_0x01b8:
            r15 = r12.f60440a;	 Catch:{ all -> 0x0194 }
            r15.m69518a(r13, r2);	 Catch:{ all -> 0x0194 }
        L_0x01bd:
            r13 = retrofit.RetrofitError.m69533a(r2, r13);	 Catch:{ all -> 0x0194 }
            throw r13;	 Catch:{ all -> 0x0194 }
        L_0x01c2:
            r13 = move-exception;
            throw r13;	 Catch:{ all -> 0x0194 }
        L_0x01c4:
            r14 = r14.f60459d;
            if (r14 != 0) goto L_0x01d1;
        L_0x01c8:
            r14 = java.lang.Thread.currentThread();
            r15 = "Retrofit-Idle";
            r14.setName(r15);
        L_0x01d1:
            throw r13;
            */
            throw new UnsupportedOperationException("Method not decompiled: retrofit.RestAdapter.b.a(retrofit.RequestInterceptor, retrofit.RestMethodInfo, java.lang.Object[]):java.lang.Object");
        }
    }

    private RestAdapter(Endpoint endpoint, Provider provider, Executor executor, Executor executor2, RequestInterceptor requestInterceptor, Converter converter, Profiler profiler, ErrorHandler errorHandler, Log log, LogLevel logLevel) {
        this.f60450i = new LinkedHashMap();
        this.f60442a = endpoint;
        this.f60451j = provider;
        this.f60443b = executor;
        this.f60444c = executor2;
        this.f60445d = requestInterceptor;
        this.f60446e = converter;
        this.f60452k = profiler;
        this.f60448g = errorHandler;
        this.f60447f = log;
        this.f60449h = logLevel;
    }

    /* renamed from: a */
    public <T> T m69516a(Class<T> cls) {
        C19389i.m69591a((Class) cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C19357b(this, m69519b((Class) cls)));
    }

    /* renamed from: b */
    Map<Method, RestMethodInfo> m69519b(Class<?> cls) {
        Map<Method, RestMethodInfo> map;
        synchronized (this.f60450i) {
            map = (Map) this.f60450i.get(cls);
            if (map == null) {
                map = new LinkedHashMap();
                this.f60450i.put(cls, map);
            }
        }
        return map;
    }

    /* renamed from: a */
    static RestMethodInfo m69506a(Map<Method, RestMethodInfo> map, Method method) {
        RestMethodInfo restMethodInfo;
        synchronized (map) {
            restMethodInfo = (RestMethodInfo) map.get(method);
            if (restMethodInfo == null) {
                restMethodInfo = new RestMethodInfo(method);
                map.put(method, restMethodInfo);
            }
        }
        return restMethodInfo;
    }

    /* renamed from: a */
    C19369d m69517a(String str, C19369d c19369d, Object[] objArr) throws IOException {
        this.f60447f.log(String.format("---> %s %s %s", new Object[]{str, c19369d.m69546a(), c19369d.m69547b()}));
        if (this.f60449h.ordinal() >= LogLevel.HEADERS.ordinal()) {
            for (C19368b c19368b : c19369d.m69548c()) {
                this.f60447f.log(c19368b.toString());
            }
            String str2 = "no";
            TypedOutput d = c19369d.m69549d();
            if (d != null) {
                Log log;
                StringBuilder stringBuilder;
                str2 = d.mimeType();
                if (str2 != null) {
                    log = this.f60447f;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Content-Type: ");
                    stringBuilder.append(str2);
                    log.log(stringBuilder.toString());
                }
                long length = d.length();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(length);
                stringBuilder2.append("-byte");
                str2 = stringBuilder2.toString();
                if (length != -1) {
                    log = this.f60447f;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Content-Length: ");
                    stringBuilder.append(length);
                    log.log(stringBuilder.toString());
                }
                if (this.f60449h.ordinal() >= LogLevel.FULL.ordinal()) {
                    if (c19369d.m69548c().isEmpty() == null) {
                        this.f60447f.log("");
                    }
                    if ((d instanceof C19544d) == null) {
                        c19369d = C19389i.m69588a(c19369d);
                        d = c19369d.m69549d();
                    }
                    this.f60447f.log(new String(((C19544d) d).m70530a(), C19390b.m69593a(d.mimeType(), "UTF-8")));
                } else if (this.f60449h.ordinal() >= LogLevel.HEADERS_AND_ARGS.ordinal()) {
                    if (!c19369d.m69548c().isEmpty()) {
                        this.f60447f.log("---> REQUEST:");
                    }
                    for (int i = 0; i < objArr.length; i++) {
                        log = this.f60447f;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("#");
                        stringBuilder.append(i);
                        stringBuilder.append(": ");
                        stringBuilder.append(objArr[i]);
                        log.log(stringBuilder.toString());
                    }
                }
            }
            this.f60447f.log(String.format("---> END %s (%s body)", new Object[]{str, str2}));
        }
        return c19369d;
    }

    /* renamed from: a */
    private C19370e m69507a(String str, C19370e c19370e, long j) throws IOException {
        this.f60447f.log(String.format("<--- HTTP %s %s (%sms)", new Object[]{Integer.valueOf(c19370e.m69551b()), str, Long.valueOf(j)}));
        if (this.f60449h.ordinal() >= LogLevel.HEADERS.ordinal()) {
            for (C19368b c19368b : c19370e.m69553d()) {
                this.f60447f.log(c19368b.toString());
            }
            j = 0;
            str = c19370e.m69554e();
            if (str != null) {
                j = str.length();
                if (this.f60449h.ordinal() >= LogLevel.FULL.ordinal()) {
                    if (c19370e.m69553d().isEmpty() == null) {
                        this.f60447f.log("");
                    }
                    if ((str instanceof C19544d) == null) {
                        c19370e = C19389i.m69589a(c19370e);
                        str = c19370e.m69554e();
                    }
                    j = ((C19544d) str).m70530a();
                    long length = (long) j.length;
                    this.f60447f.log(new String(j, C19390b.m69593a(str.mimeType(), "UTF-8")));
                    j = length;
                }
            }
            this.f60447f.log(String.format("<--- END HTTP (%s-byte body)", new Object[]{Long.valueOf(j)}));
        }
        return c19370e;
    }

    /* renamed from: a */
    private void m69512a(TypedInput typedInput, Object obj) {
        if (this.f60449h.ordinal() == LogLevel.HEADERS_AND_ARGS.ordinal()) {
            this.f60447f.log("<--- BODY:");
            this.f60447f.log(obj.toString());
        }
    }

    /* renamed from: a */
    void m69518a(Throwable th, String str) {
        Log log = this.f60447f;
        String str2 = "---- ERROR %s";
        Object[] objArr = new Object[1];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        log.log(String.format(str2, objArr));
        str = new StringWriter();
        th.printStackTrace(new PrintWriter(str));
        this.f60447f.log(str.toString());
        this.f60447f.log("---- END ERROR");
    }

    /* renamed from: b */
    private static C19352a m69513b(String str, RestMethodInfo restMethodInfo, C19369d c19369d) {
        long length;
        c19369d = c19369d.m69549d();
        if (c19369d != null) {
            length = c19369d.length();
            c19369d = c19369d.mimeType();
        } else {
            length = 0;
            c19369d = null;
        }
        return new C19352a(restMethodInfo.f60463h, str, restMethodInfo.f60465j, length, c19369d);
    }
}
