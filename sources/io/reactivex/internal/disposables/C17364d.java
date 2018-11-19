package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.reactivex.internal.disposables.d */
public final class C17364d implements Disposable, DisposableContainer {
    /* renamed from: a */
    List<Disposable> f53109a;
    /* renamed from: b */
    volatile boolean f53110b;

    public void dispose() {
        if (!this.f53110b) {
            synchronized (this) {
                if (this.f53110b) {
                    return;
                }
                this.f53110b = true;
                List list = this.f53109a;
                this.f53109a = null;
                m63459a(list);
            }
        }
    }

    public boolean isDisposed() {
        return this.f53110b;
    }

    public boolean add(Disposable disposable) {
        C15684a.m58895a((Object) disposable, "d is null");
        if (!this.f53110b) {
            synchronized (this) {
                if (!this.f53110b) {
                    List list = this.f53109a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f53109a = list;
                    }
                    list.add(disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return null;
    }

    public boolean remove(Disposable disposable) {
        if (!delete(disposable)) {
            return null;
        }
        disposable.dispose();
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean delete(io.reactivex.disposables.Disposable r3) {
        /*
        r2 = this;
        r0 = "Disposable item is null";
        io.reactivex.internal.functions.C15684a.m58895a(r3, r0);
        r0 = r2.f53110b;
        r1 = 0;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return r1;
    L_0x000b:
        monitor-enter(r2);
        r0 = r2.f53110b;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x0012;
    L_0x0010:
        monitor-exit(r2);	 Catch:{ all -> 0x0022 }
        return r1;
    L_0x0012:
        r0 = r2.f53109a;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x0020;
    L_0x0016:
        r3 = r0.remove(r3);	 Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.disposables.d.delete(io.reactivex.disposables.Disposable):boolean");
    }

    /* renamed from: a */
    void m63459a(List<Disposable> list) {
        if (list != null) {
            Iterable iterable = null;
            for (Disposable dispose : list) {
                try {
                    dispose.dispose();
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    if (iterable == null) {
                        iterable = new ArrayList();
                    }
                    iterable.add(th);
                }
            }
            if (iterable == null) {
                return;
            }
            if (iterable.size() == 1) {
                throw ExceptionHelper.m58962a((Throwable) iterable.get(null));
            }
            throw new CompositeException(iterable);
        }
    }
}
