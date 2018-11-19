package io.reactivex.exceptions;

import com.tinder.domain.config.model.ProfileEditingConfig;
import io.reactivex.annotations.NonNull;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    /* renamed from: a */
    private final List<Throwable> f48534a;
    /* renamed from: b */
    private final String f48535b;
    /* renamed from: c */
    private Throwable f48536c;

    static final class CompositeExceptionCausalChain extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }

        CompositeExceptionCausalChain() {
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$a */
    static abstract class C15677a {
        /* renamed from: a */
        abstract void mo12876a(Object obj);

        C15677a() {
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$b */
    static final class C17357b extends C15677a {
        /* renamed from: a */
        private final PrintStream f53093a;

        C17357b(PrintStream printStream) {
            this.f53093a = printStream;
        }

        /* renamed from: a */
        void mo12876a(Object obj) {
            this.f53093a.println(obj);
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$c */
    static final class C17358c extends C15677a {
        /* renamed from: a */
        private final PrintWriter f53094a;

        C17358c(PrintWriter printWriter) {
            this.f53094a = printWriter;
        }

        /* renamed from: a */
        void mo12876a(Object obj) {
            this.f53094a.println(obj);
        }
    }

    public CompositeException(@NonNull Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    public CompositeException(@NonNull Iterable<? extends Throwable> iterable) {
        Collection linkedHashSet = new LinkedHashSet();
        List arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).m58848a());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty() != null) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        this.f48534a = Collections.unmodifiableList(arrayList);
        iterable = new StringBuilder();
        iterable.append(this.f48534a.size());
        iterable.append(" exceptions occurred. ");
        this.f48535b = iterable.toString();
    }

    @NonNull
    /* renamed from: a */
    public List<Throwable> m58848a() {
        return this.f48534a;
    }

    @NonNull
    public String getMessage() {
        return this.f48535b;
    }

    @io.reactivex.annotations.NonNull
    public synchronized java.lang.Throwable getCause() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.f48536c;	 Catch:{ all -> 0x0060 }
        if (r0 != 0) goto L_0x005c;	 Catch:{ all -> 0x0060 }
    L_0x0005:
        r0 = new io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain;	 Catch:{ all -> 0x0060 }
        r0.<init>();	 Catch:{ all -> 0x0060 }
        r1 = new java.util.HashSet;	 Catch:{ all -> 0x0060 }
        r1.<init>();	 Catch:{ all -> 0x0060 }
        r2 = r8.f48534a;	 Catch:{ all -> 0x0060 }
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
        r5 = r8.m58844a(r4);	 Catch:{ all -> 0x0060 }
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
        r3 = r8.m58847b(r3);	 Catch:{ all -> 0x0060 }
        goto L_0x0016;	 Catch:{ all -> 0x0060 }
    L_0x005a:
        r8.f48536c = r0;	 Catch:{ all -> 0x0060 }
    L_0x005c:
        r0 = r8.f48536c;	 Catch:{ all -> 0x0060 }
        monitor-exit(r8);
        return r0;
    L_0x0060:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.exceptions.CompositeException.getCause():java.lang.Throwable");
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        m58845a(new C17357b(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        m58845a(new C17358c(printWriter));
    }

    /* renamed from: a */
    private void m58845a(C15677a c15677a) {
        StringBuilder stringBuilder = new StringBuilder(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        stringBuilder.append(this);
        stringBuilder.append('\n');
        for (Object obj : getStackTrace()) {
            stringBuilder.append("\tat ");
            stringBuilder.append(obj);
            stringBuilder.append('\n');
        }
        int i = 1;
        for (Throwable th : this.f48534a) {
            stringBuilder.append("  ComposedException ");
            stringBuilder.append(i);
            stringBuilder.append(" :\n");
            m58846a(stringBuilder, th, "\t");
            i++;
        }
        c15677a.mo12876a(stringBuilder.toString());
    }

    /* renamed from: a */
    private void m58846a(StringBuilder stringBuilder, Throwable th, String str) {
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
            m58846a(stringBuilder, th.getCause(), "");
        }
    }

    /* renamed from: a */
    private List<Throwable> m58844a(Throwable th) {
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
                        cause = th;
                    }
                }
                return arrayList;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private Throwable m58847b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            if (this.f48536c != cause) {
                while (true) {
                    th = cause.getCause();
                    if (th == null) {
                        break;
                    } else if (th == cause) {
                        break;
                    } else {
                        cause = th;
                    }
                }
                return cause;
            }
        }
        return th;
    }
}
