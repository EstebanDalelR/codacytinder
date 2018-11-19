package dagger.internal;

import dagger.releasablereferences.ReleasableReferenceManager;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Queue;

@GwtIncompatible
public final class ReferenceReleasingProviderManager implements ReleasableReferenceManager {
    /* renamed from: a */
    private final Class<? extends Annotation> f52951a;
    /* renamed from: b */
    private final Queue<WeakReference<C17282j<?>>> f52952b;

    private enum Operation {
        RELEASE {
            void execute(C17282j<?> c17282j) {
                c17282j.m63232a();
            }
        },
        RESTORE {
            void execute(C17282j<?> c17282j) {
                c17282j.m63233b();
            }
        };

        abstract void execute(C17282j<?> c17282j);
    }

    public Class<? extends Annotation> scope() {
        return this.f52951a;
    }

    public void releaseStrongReferences() {
        m63227a(Operation.RELEASE);
    }

    public void restoreStrongReferences() {
        m63227a(Operation.RESTORE);
    }

    /* renamed from: a */
    private void m63227a(Operation operation) {
        Iterator it = this.f52952b.iterator();
        while (it.hasNext()) {
            C17282j c17282j = (C17282j) ((WeakReference) it.next()).get();
            if (c17282j == null) {
                it.remove();
            } else {
                operation.execute(c17282j);
            }
        }
    }
}
