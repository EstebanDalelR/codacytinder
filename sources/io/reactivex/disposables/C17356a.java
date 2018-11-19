package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.util.C15740g;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;

/* renamed from: io.reactivex.disposables.a */
public final class C17356a implements Disposable, DisposableContainer {
    /* renamed from: a */
    C15740g<Disposable> f53091a;
    /* renamed from: b */
    volatile boolean f53092b;

    public void dispose() {
        if (!this.f53092b) {
            synchronized (this) {
                if (this.f53092b) {
                    return;
                }
                this.f53092b = true;
                C15740g c15740g = this.f53091a;
                this.f53091a = null;
                m63447a(c15740g);
            }
        }
    }

    public boolean isDisposed() {
        return this.f53092b;
    }

    public boolean add(@NonNull Disposable disposable) {
        C15684a.m58895a((Object) disposable, "d is null");
        if (!this.f53092b) {
            synchronized (this) {
                if (!this.f53092b) {
                    C15740g c15740g = this.f53091a;
                    if (c15740g == null) {
                        c15740g = new C15740g();
                        this.f53091a = c15740g;
                    }
                    c15740g.m58990a((Object) disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return null;
    }

    /* renamed from: a */
    public boolean m63448a(@NonNull Disposable... disposableArr) {
        C15684a.m58895a((Object) disposableArr, "ds is null");
        int i = 0;
        if (!this.f53092b) {
            synchronized (this) {
                if (!this.f53092b) {
                    C15740g c15740g = this.f53091a;
                    if (c15740g == null) {
                        c15740g = new C15740g(disposableArr.length + 1);
                        this.f53091a = c15740g;
                    }
                    int length = disposableArr.length;
                    while (i < length) {
                        Object obj = disposableArr[i];
                        C15684a.m58895a(obj, "d is null");
                        c15740g.m58990a(obj);
                        i++;
                    }
                    return true;
                }
            }
        }
        for (Disposable dispose : disposableArr) {
            dispose.dispose();
        }
        return false;
    }

    public boolean remove(@NonNull Disposable disposable) {
        if (!delete(disposable)) {
            return null;
        }
        disposable.dispose();
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean delete(@io.reactivex.annotations.NonNull io.reactivex.disposables.Disposable r3) {
        /*
        r2 = this;
        r0 = "Disposable item is null";
        io.reactivex.internal.functions.C15684a.m58895a(r3, r0);
        r0 = r2.f53092b;
        r1 = 0;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return r1;
    L_0x000b:
        monitor-enter(r2);
        r0 = r2.f53092b;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x0012;
    L_0x0010:
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        return r1;
    L_0x0012:
        r0 = r2.f53091a;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x0020;
    L_0x0016:
        r3 = r0.m58991b(r3);	 Catch:{ all -> 0x0022 }
        if (r3 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x0020;
    L_0x001d:
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        r3 = 1;
        return r3;
    L_0x0020:
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        return r1;
    L_0x0022:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.disposables.a.delete(io.reactivex.disposables.Disposable):boolean");
    }

    /* renamed from: a */
    public void m63446a() {
        if (!this.f53092b) {
            synchronized (this) {
                if (this.f53092b) {
                    return;
                }
                C15740g c15740g = this.f53091a;
                this.f53091a = null;
                m63447a(c15740g);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public int m63449b() {
        /*
        r2 = this;
        r0 = r2.f53092b;
        r1 = 0;
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        monitor-enter(r2);
        r0 = r2.f53092b;	 Catch:{ all -> 0x0017 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        return r1;
    L_0x000d:
        r0 = r2.f53091a;	 Catch:{ all -> 0x0017 }
        if (r0 == 0) goto L_0x0015;
    L_0x0011:
        r1 = r0.m58993c();	 Catch:{ all -> 0x0017 }
    L_0x0015:
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        return r1;
    L_0x0017:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.disposables.a.b():int");
    }

    /* renamed from: a */
    void m63447a(C15740g<Disposable> c15740g) {
        if (c15740g != null) {
            Iterable iterable = null;
            for (Object obj : c15740g.m58992b()) {
                if (obj instanceof Disposable) {
                    try {
                        ((Disposable) obj).dispose();
                    } catch (Throwable th) {
                        C15678a.m58850b(th);
                        if (iterable == null) {
                            iterable = new ArrayList();
                        }
                        iterable.add(th);
                    }
                }
            }
            if (iterable == null) {
                return;
            }
            if (iterable.size() == 1) {
                throw ExceptionHelper.m58962a((Throwable) iterable.get(0));
            }
            throw new CompositeException(iterable);
        }
    }
}
