package rx.exceptions;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    /* renamed from: a */
    private final List<Throwable> f60584a;
    /* renamed from: b */
    private final String f60585b;
    /* renamed from: c */
    private Throwable f60586c;

    static final class CompositeExceptionCausalChain extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }

        CompositeExceptionCausalChain() {
        }
    }

    /* renamed from: rx.exceptions.CompositeException$a */
    static abstract class C19408a {
        /* renamed from: a */
        abstract Object mo14683a();

        /* renamed from: a */
        abstract void mo14684a(Object obj);

        C19408a() {
        }
    }

    /* renamed from: rx.exceptions.CompositeException$b */
    static final class C19578b extends C19408a {
        /* renamed from: a */
        private final PrintStream f61124a;

        C19578b(PrintStream printStream) {
            this.f61124a = printStream;
        }

        /* renamed from: a */
        Object mo14683a() {
            return this.f61124a;
        }

        /* renamed from: a */
        void mo14684a(Object obj) {
            this.f61124a.println(obj);
        }
    }

    /* renamed from: rx.exceptions.CompositeException$c */
    static final class C19579c extends C19408a {
        /* renamed from: a */
        private final PrintWriter f61125a;

        C19579c(PrintWriter printWriter) {
            this.f61125a = printWriter;
        }

        /* renamed from: a */
        Object mo14683a() {
            return this.f61125a;
        }

        /* renamed from: a */
        void mo14684a(Object obj) {
            this.f61125a.println(obj);
        }
    }

    @Deprecated
    public CompositeException(String str, Collection<? extends Throwable> collection) {
        str = new LinkedHashSet();
        List arrayList = new ArrayList();
        if (collection != null) {
            for (Throwable th : collection) {
                if (th instanceof CompositeException) {
                    str.addAll(((CompositeException) th).m69862a());
                } else if (th != null) {
                    str.add(th);
                } else {
                    str.add(new NullPointerException());
                }
            }
        } else {
            str.add(new NullPointerException());
        }
        arrayList.addAll(str);
        this.f60584a = Collections.unmodifiableList(arrayList);
        str = new StringBuilder();
        str.append(this.f60584a.size());
        str.append(" exceptions occurred. ");
        this.f60585b = str.toString();
    }

    public CompositeException(Collection<? extends Throwable> collection) {
        this(null, collection);
    }

    public CompositeException(Throwable... thArr) {
        Collection linkedHashSet = new LinkedHashSet();
        List arrayList = new ArrayList();
        if (thArr != null) {
            for (Object obj : thArr) {
                if (obj instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) obj).m69862a());
                } else if (obj != null) {
                    linkedHashSet.add(obj);
                } else {
                    linkedHashSet.add(new NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        this.f60584a = Collections.unmodifiableList(arrayList);
        thArr = new StringBuilder();
        thArr.append(this.f60584a.size());
        thArr.append(" exceptions occurred. ");
        this.f60585b = thArr.toString();
    }

    /* renamed from: a */
    public List<Throwable> m69862a() {
        return this.f60584a;
    }

    public String getMessage() {
        return this.f60585b;
    }

    public synchronized java.lang.Throwable getCause() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.f60586c;	 Catch:{ all -> 0x0060 }
        if (r0 != 0) goto L_0x005c;	 Catch:{ all -> 0x0060 }
    L_0x0005:
        r0 = new rx.exceptions.CompositeException$CompositeExceptionCausalChain;	 Catch:{ all -> 0x0060 }
        r0.<init>();	 Catch:{ all -> 0x0060 }
        r1 = new java.util.HashSet;	 Catch:{ all -> 0x0060 }
        r1.<init>();	 Catch:{ all -> 0x0060 }
        r2 = r8.f60584a;	 Catch:{ all -> 0x0060 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0060 }
        r3 = r0;	 Catch:{ all -> 0x0060 }
    L_0x0016:
        r4 = r2.hasNext();	 Catch:{ all -> 0x0060 }
        if (r4 == 0) goto L_0x005a;	 Catch:{ all -> 0x0060 }
    L_0x001c:
        r4 = r2.next();	 Catch:{ all -> 0x0060 }
        r4 = (java.lang.Throwable) r4;	 Catch:{ all -> 0x0060 }
        r5 = r1.contains(r4);	 Catch:{ all -> 0x0060 }
        if (r5 == 0) goto L_0x0029;	 Catch:{ all -> 0x0060 }
    L_0x0028:
        goto L_0x0016;	 Catch:{ all -> 0x0060 }
    L_0x0029:
        r1.add(r4);	 Catch:{ all -> 0x0060 }
        r5 = r8.m69858a(r4);	 Catch:{ all -> 0x0060 }
        r5 = r5.iterator();	 Catch:{ all -> 0x0060 }
    L_0x0034:
        r6 = r5.hasNext();	 Catch:{ all -> 0x0060 }
        if (r6 == 0) goto L_0x0052;	 Catch:{ all -> 0x0060 }
    L_0x003a:
        r6 = r5.next();	 Catch:{ all -> 0x0060 }
        r6 = (java.lang.Throwable) r6;	 Catch:{ all -> 0x0060 }
        r7 = r1.contains(r6);	 Catch:{ all -> 0x0060 }
        if (r7 == 0) goto L_0x004e;	 Catch:{ all -> 0x0060 }
    L_0x0046:
        r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0060 }
        r6 = "Duplicate found in causal chain so cropping to prevent loop ...";	 Catch:{ all -> 0x0060 }
        r4.<init>(r6);	 Catch:{ all -> 0x0060 }
        goto L_0x0034;	 Catch:{ all -> 0x0060 }
    L_0x004e:
        r1.add(r6);	 Catch:{ all -> 0x0060 }
        goto L_0x0034;
    L_0x0052:
        r3.initCause(r4);	 Catch:{ Throwable -> 0x0055 }
    L_0x0055:
        r3 = r8.m69861b(r3);	 Catch:{ all -> 0x0060 }
        goto L_0x0016;	 Catch:{ all -> 0x0060 }
    L_0x005a:
        r8.f60586c = r0;	 Catch:{ all -> 0x0060 }
    L_0x005c:
        r0 = r8.f60586c;	 Catch:{ all -> 0x0060 }
        monitor-exit(r8);
        return r0;
    L_0x0060:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.exceptions.CompositeException.getCause():java.lang.Throwable");
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        m69860a(new C19578b(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        m69860a(new C19579c(printWriter));
    }

    /* renamed from: a */
    private void m69860a(C19408a c19408a) {
        StringBuilder stringBuilder = new StringBuilder(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        stringBuilder.append(this);
        stringBuilder.append('\n');
        for (Object obj : getStackTrace()) {
            stringBuilder.append("\tat ");
            stringBuilder.append(obj);
            stringBuilder.append('\n');
        }
        int i = 1;
        for (Throwable th : this.f60584a) {
            stringBuilder.append("  ComposedException ");
            stringBuilder.append(i);
            stringBuilder.append(" :\n");
            m69859a(stringBuilder, th, "\t");
            i++;
        }
        synchronized (c19408a.mo14683a()) {
            c19408a.mo14684a(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private void m69859a(StringBuilder stringBuilder, Throwable th, String str) {
        stringBuilder.append(str);
        stringBuilder.append(th);
        stringBuilder.append('\n');
        for (Object obj : th.getStackTrace()) {
            stringBuilder.append("\t\tat ");
            stringBuilder.append(obj);
            stringBuilder.append('\n');
        }
        if (th.getCause() != null) {
            stringBuilder.append("\tCaused by: ");
            m69859a(stringBuilder, th.getCause(), "");
        }
    }

    /* renamed from: a */
    private List<Throwable> m69858a(Throwable th) {
        List<Throwable> arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null) {
            if (cause != th) {
                while (true) {
                    arrayList.add(cause);
                    th = cause.getCause();
                    if (th == null) {
                        break;
                    } else if (th == cause) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                }
                return arrayList;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private Throwable m69861b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            if (cause != th) {
                while (true) {
                    th = cause.getCause();
                    if (th == null) {
                        break;
                    } else if (th == cause) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                }
                return cause;
            }
        }
        return th;
    }
}
