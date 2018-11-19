package rx.exceptions;

import java.util.Collection;
import java.util.List;
import rx.C19566b;
import rx.Observer;

/* renamed from: rx.exceptions.a */
public final class C19410a {
    /* renamed from: a */
    public static RuntimeException m69867a(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: b */
    public static void m69874b(Throwable th) {
        if (th instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th);
        } else if (th instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th);
        } else if (th instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th);
        } else if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: a */
    public static void m69868a(java.lang.Throwable r4, java.lang.Throwable r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new java.util.HashSet;
        r0.<init>();
        r1 = 0;
    L_0x0006:
        r2 = r4.getCause();
        if (r2 == 0) goto L_0x002b;
    L_0x000c:
        r2 = r1 + 1;
        r3 = 25;
        if (r1 < r3) goto L_0x0013;
    L_0x0012:
        return;
    L_0x0013:
        r4 = r4.getCause();
        r1 = r4.getCause();
        r1 = r0.contains(r1);
        if (r1 == 0) goto L_0x0022;
    L_0x0021:
        goto L_0x002b;
    L_0x0022:
        r1 = r4.getCause();
        r0.add(r1);
        r1 = r2;
        goto L_0x0006;
    L_0x002b:
        r4.initCause(r5);	 Catch:{ Throwable -> 0x002e }
    L_0x002e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.exceptions.a.a(java.lang.Throwable, java.lang.Throwable):void");
    }

    /* renamed from: c */
    public static Throwable m69875c(Throwable th) {
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th = th.getCause();
            i = i2;
        }
        return th;
    }

    /* renamed from: a */
    public static void m69873a(List<? extends Throwable> list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                Throwable th = (Throwable) list.get(0);
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                } else if (th instanceof Error) {
                    throw ((Error) th);
                } else {
                    throw new RuntimeException(th);
                }
            }
            throw new CompositeException((Collection) list);
        }
    }

    /* renamed from: a */
    public static void m69870a(Throwable th, Observer<?> observer, Object obj) {
        C19410a.m69874b(th);
        observer.onError(OnErrorThrowable.m69866a(th, obj));
    }

    /* renamed from: a */
    public static void m69872a(Throwable th, C19566b<?> c19566b, Object obj) {
        C19410a.m69874b(th);
        c19566b.onError(OnErrorThrowable.m69866a(th, obj));
    }

    /* renamed from: a */
    public static void m69869a(Throwable th, Observer<?> observer) {
        C19410a.m69874b(th);
        observer.onError(th);
    }

    /* renamed from: a */
    public static void m69871a(Throwable th, C19566b<?> c19566b) {
        C19410a.m69874b(th);
        c19566b.onError(th);
    }
}
