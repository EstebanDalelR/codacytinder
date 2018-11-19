package retrofit;

import android.os.Build.VERSION;
import android.os.Process;
import com.google.gson.Gson;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import retrofit.C19389i.C19388a;
import retrofit.RestAdapter.Log;
import retrofit.client.C19528c;
import retrofit.client.C19530f;
import retrofit.client.Client;
import retrofit.client.Client.Provider;
import retrofit.converter.C19532a;
import retrofit.converter.Converter;
import retrofit.p493a.C19361c;
import retrofit.p493a.C19521b;
import retrofit.p493a.C19646a;
import retrofit.p502b.C19523a;

/* renamed from: retrofit.d */
abstract class C19378d {
    /* renamed from: a */
    static final boolean f60507a = C19378d.m69560j();
    /* renamed from: b */
    private static final C19378d f60508b = C19378d.m69558h();

    /* renamed from: retrofit.d$d */
    private static class C19377d {
        /* renamed from: a */
        static Client m69555a() {
            return new C19528c();
        }
    }

    /* renamed from: retrofit.d$a */
    private static class C19535a extends C19378d {

        /* renamed from: retrofit.d$a$2 */
        class C193742 implements ThreadFactory {
            /* renamed from: a */
            final /* synthetic */ C19535a f60503a;

            C193742(C19535a c19535a) {
                this.f60503a = c19535a;
            }

            public Thread newThread(final Runnable runnable) {
                return new Thread(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C193742 f60502b;

                    public void run() {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "Retrofit-Idle");
            }
        }

        private C19535a() {
        }

        /* renamed from: b */
        Converter mo14656b() {
            return new C19532a(new Gson());
        }

        /* renamed from: c */
        Provider mo14657c() {
            Client a;
            if (C19378d.m69559i()) {
                a = C19377d.m69555a();
            } else if (VERSION.SDK_INT < 9) {
                a = new C19646a();
            } else {
                a = new C19530f();
            }
            return new Provider(this) {
                /* renamed from: b */
                final /* synthetic */ C19535a f61043b;

                public Client get() {
                    return a;
                }
            };
        }

        /* renamed from: d */
        Executor mo14658d() {
            return Executors.newCachedThreadPool(new C193742(this));
        }

        /* renamed from: e */
        Executor mo14659e() {
            return new C19361c();
        }

        /* renamed from: f */
        Log mo14660f() {
            return new C19521b("Retrofit");
        }
    }

    /* renamed from: retrofit.d$c */
    private static class C19539c extends C19378d {

        /* renamed from: retrofit.d$c$2 */
        class C193762 implements ThreadFactory {
            /* renamed from: a */
            final /* synthetic */ C19539c f60506a;

            C193762(C19539c c19539c) {
                this.f60506a = c19539c;
            }

            public Thread newThread(final Runnable runnable) {
                return new Thread(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C193762 f60505b;

                    public void run() {
                        Thread.currentThread().setPriority(1);
                        runnable.run();
                    }
                }, "Retrofit-Idle");
            }
        }

        /* renamed from: retrofit.d$c$3 */
        class C195383 implements Log {
            /* renamed from: a */
            final /* synthetic */ C19539c f61048a;

            C195383(C19539c c19539c) {
                this.f61048a = c19539c;
            }

            public void log(String str) {
                System.out.println(str);
            }
        }

        private C19539c() {
        }

        /* renamed from: b */
        Converter mo14656b() {
            return new C19532a(new Gson());
        }

        /* renamed from: c */
        Provider mo14657c() {
            Client a;
            if (C19378d.m69559i()) {
                a = C19377d.m69555a();
            } else {
                a = new C19530f();
            }
            return new Provider(this) {
                /* renamed from: b */
                final /* synthetic */ C19539c f61047b;

                public Client get() {
                    return a;
                }
            };
        }

        /* renamed from: d */
        Executor mo14658d() {
            return Executors.newCachedThreadPool(new C193762(this));
        }

        /* renamed from: e */
        Executor mo14659e() {
            return new C19388a();
        }

        /* renamed from: f */
        Log mo14660f() {
            return new C195383(this);
        }
    }

    /* renamed from: retrofit.d$b */
    private static class C19647b extends C19539c {
        private C19647b() {
            super();
        }

        /* renamed from: c */
        Provider mo14657c() {
            final C19523a c19523a = new C19523a();
            return new Provider(this) {
                /* renamed from: b */
                final /* synthetic */ C19647b f61045b;

                public Client get() {
                    return c19523a;
                }
            };
        }
    }

    /* renamed from: b */
    abstract Converter mo14656b();

    /* renamed from: c */
    abstract Provider mo14657c();

    /* renamed from: d */
    abstract Executor mo14658d();

    /* renamed from: e */
    abstract Executor mo14659e();

    /* renamed from: f */
    abstract Log mo14660f();

    C19378d() {
    }

    /* renamed from: a */
    static C19378d m69556a() {
        return f60508b;
    }

    /* renamed from: h */
    private static retrofit.C19378d m69558h() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = "android.os.Build";	 Catch:{ ClassNotFoundException -> 0x0010 }
        java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0010 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ClassNotFoundException -> 0x0010 }
        if (r1 == 0) goto L_0x0010;	 Catch:{ ClassNotFoundException -> 0x0010 }
    L_0x000a:
        r1 = new retrofit.d$a;	 Catch:{ ClassNotFoundException -> 0x0010 }
        r1.<init>();	 Catch:{ ClassNotFoundException -> 0x0010 }
        return r1;
    L_0x0010:
        r1 = "com.google.appengine.runtime.version";
        r1 = java.lang.System.getProperty(r1);
        if (r1 == 0) goto L_0x001e;
    L_0x0018:
        r1 = new retrofit.d$b;
        r1.<init>();
        return r1;
    L_0x001e:
        r1 = new retrofit.d$c;
        r1.<init>();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit.d.h():retrofit.d");
    }

    /* renamed from: i */
    private static boolean m69559i() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "com.squareup.okhttp.p";	 Catch:{ ClassNotFoundException -> 0x0007 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0007 }
        r0 = 1;
        return r0;
    L_0x0007:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit.d.i():boolean");
    }

    /* renamed from: j */
    private static boolean m69560j() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "rx.Observable";	 Catch:{ ClassNotFoundException -> 0x0007 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0007 }
        r0 = 1;
        return r0;
    L_0x0007:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit.d.j():boolean");
    }
}
