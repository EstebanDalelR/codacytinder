package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: okio.a */
public class C17701a extends C15982q {
    /* renamed from: a */
    private static final long f55094a = TimeUnit.SECONDS.toMillis(60);
    @Nullable
    /* renamed from: b */
    static C17701a f55095b;
    /* renamed from: d */
    private static final long f55096d = TimeUnit.MILLISECONDS.toNanos(f55094a);
    /* renamed from: e */
    private boolean f55097e;
    @Nullable
    /* renamed from: f */
    private C17701a f55098f;
    /* renamed from: g */
    private long f55099g;

    /* renamed from: okio.a$a */
    private static final class C15971a extends Thread {
        C15971a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
        L_0x0000:
            r0 = okio.C17701a.class;	 Catch:{ InterruptedException -> 0x0000 }
            monitor-enter(r0);	 Catch:{ InterruptedException -> 0x0000 }
            r1 = okio.C17701a.m64448e();	 Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x000b;	 Catch:{ all -> 0x0019 }
        L_0x0009:
            monitor-exit(r0);	 Catch:{ all -> 0x0019 }
            goto L_0x0000;	 Catch:{ all -> 0x0019 }
        L_0x000b:
            r2 = okio.C17701a.f55095b;	 Catch:{ all -> 0x0019 }
            if (r1 != r2) goto L_0x0014;	 Catch:{ all -> 0x0019 }
        L_0x000f:
            r1 = 0;	 Catch:{ all -> 0x0019 }
            okio.C17701a.f55095b = r1;	 Catch:{ all -> 0x0019 }
            monitor-exit(r0);	 Catch:{ all -> 0x0019 }
            return;	 Catch:{ all -> 0x0019 }
        L_0x0014:
            monitor-exit(r0);	 Catch:{ all -> 0x0019 }
            r1.mo13893a();	 Catch:{ InterruptedException -> 0x0000 }
            goto L_0x0000;
        L_0x0019:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0019 }
            throw r1;	 Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.a.a.run():void");
        }
    }

    /* renamed from: a */
    protected void mo13893a() {
    }

    /* renamed from: c */
    public final void m64455c() {
        if (this.f55097e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long n_ = n_();
        boolean o_ = o_();
        if (n_ != 0 || o_) {
            this.f55097e = true;
            C17701a.m64445a(this, n_, o_);
        }
    }

    /* renamed from: a */
    private static synchronized void m64445a(C17701a c17701a, long j, boolean z) {
        synchronized (C17701a.class) {
            if (f55095b == null) {
                f55095b = new C17701a();
                new C15971a().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                c17701a.f55099g = nanoTime + Math.min(j, c17701a.mo13438d() - nanoTime);
            } else if (j != 0) {
                c17701a.f55099g = nanoTime + j;
            } else if (z) {
                c17701a.f55099g = c17701a.mo13438d();
            } else {
                throw new AssertionError();
            }
            j = c17701a.m64447b(nanoTime);
            z = f55095b;
            while (z.f55098f != null) {
                if (j < z.f55098f.m64447b(nanoTime)) {
                    break;
                }
                z = z.f55098f;
            }
            c17701a.f55098f = z.f55098f;
            z.f55098f = c17701a;
            if (z == f55095b) {
                C17701a.class.notify();
            }
        }
    }

    public final boolean k_() {
        if (!this.f55097e) {
            return false;
        }
        this.f55097e = false;
        return C17701a.m64446a(this);
    }

    /* renamed from: a */
    private static synchronized boolean m64446a(C17701a c17701a) {
        synchronized (C17701a.class) {
            for (C17701a c17701a2 = f55095b; c17701a2 != null; c17701a2 = c17701a2.f55098f) {
                if (c17701a2.f55098f == c17701a) {
                    c17701a2.f55098f = c17701a.f55098f;
                    c17701a.f55098f = null;
                    return null;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    private long m64447b(long j) {
        return this.f55099g - j;
    }

    /* renamed from: a */
    public final Sink m64450a(final Sink sink) {
        return new Sink(this) {
            /* renamed from: b */
            final /* synthetic */ C17701a f55091b;

            public void write(C18549c c18549c, long j) throws IOException {
                C15983r.m60641a(c18549c.f57797b, 0, j);
                while (true) {
                    long j2 = 0;
                    if (j > 0) {
                        C15980o c15980o = c18549c.f57796a;
                        while (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                            long j3 = j2 + ((long) (c15980o.f49613c - c15980o.f49612b));
                            if (j3 >= j) {
                                j2 = j;
                                break;
                            } else {
                                c15980o = c15980o.f49616f;
                                j2 = j3;
                            }
                        }
                        this.f55091b.m64455c();
                        try {
                            sink.write(c18549c, j2);
                            long j4 = j - j2;
                            this.f55091b.m64453a((boolean) 1);
                            j = j4;
                        } catch (IOException e) {
                            throw this.f55091b.m64454b(e);
                        } catch (Throwable th) {
                            this.f55091b.m64453a(false);
                        }
                    } else {
                        return;
                    }
                }
            }

            public void flush() throws IOException {
                this.f55091b.m64455c();
                try {
                    sink.flush();
                    this.f55091b.m64453a(true);
                } catch (IOException e) {
                    throw this.f55091b.m64454b(e);
                } catch (Throwable th) {
                    this.f55091b.m64453a(false);
                }
            }

            public void close() throws IOException {
                this.f55091b.m64455c();
                try {
                    sink.close();
                    this.f55091b.m64453a(true);
                } catch (IOException e) {
                    throw this.f55091b.m64454b(e);
                } catch (Throwable th) {
                    this.f55091b.m64453a(false);
                }
            }

            public C15982q timeout() {
                return this.f55091b;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AsyncTimeout.sink(");
                stringBuilder.append(sink);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        };
    }

    /* renamed from: a */
    public final Source m64451a(final Source source) {
        return new Source(this) {
            /* renamed from: b */
            final /* synthetic */ C17701a f55093b;

            public long read(C18549c c18549c, long j) throws IOException {
                this.f55093b.m64455c();
                try {
                    c18549c = source.read(c18549c, j);
                    this.f55093b.m64453a(true);
                    return c18549c;
                } catch (IOException e) {
                    throw this.f55093b.m64454b(e);
                } catch (Throwable th) {
                    this.f55093b.m64453a(false);
                }
            }

            public void close() throws IOException {
                try {
                    source.close();
                    this.f55093b.m64453a(true);
                } catch (IOException e) {
                    throw this.f55093b.m64454b(e);
                } catch (Throwable th) {
                    this.f55093b.m64453a(false);
                }
            }

            public C15982q timeout() {
                return this.f55093b;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AsyncTimeout.source(");
                stringBuilder.append(source);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        };
    }

    /* renamed from: a */
    final void m64453a(boolean z) throws IOException {
        if (k_() && z) {
            throw mo13892a((IOException) false);
        }
    }

    /* renamed from: b */
    final IOException m64454b(IOException iOException) throws IOException {
        if (k_()) {
            return mo13892a(iOException);
        }
        return iOException;
    }

    /* renamed from: a */
    protected IOException mo13892a(@Nullable IOException iOException) {
        IOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Nullable
    /* renamed from: e */
    static C17701a m64448e() throws InterruptedException {
        C17701a c17701a = f55095b.f55098f;
        C17701a c17701a2 = null;
        if (c17701a == null) {
            long nanoTime = System.nanoTime();
            C17701a.class.wait(f55094a);
            if (f55095b.f55098f == null && System.nanoTime() - nanoTime >= f55096d) {
                c17701a2 = f55095b;
            }
            return c17701a2;
        }
        nanoTime = c17701a.m64447b(System.nanoTime());
        if (nanoTime > 0) {
            long j = nanoTime / 1000000;
            C17701a.class.wait(j, (int) (nanoTime - (1000000 * j)));
            return null;
        }
        f55095b.f55098f = c17701a.f55098f;
        c17701a.f55098f = null;
        return c17701a;
    }
}
