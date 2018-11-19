package io.reactivex.internal.operators.completable;

import io.reactivex.C3956a;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Cancellable;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicReference;

public final class CompletableCreate extends C3956a {
    /* renamed from: a */
    final CompletableOnSubscribe f56807a;

    static final class Emitter extends AtomicReference<Disposable> implements CompletableEmitter, Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        /* renamed from: a */
        final CompletableObserver f53182a;

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onComplete() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0026 in list [B:7:0x001b]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = r2.get();
            r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            if (r0 == r1) goto L_0x0026;
        L_0x0008:
            r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            r0 = r2.getAndSet(r0);
            r0 = (io.reactivex.disposables.Disposable) r0;
            r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            if (r0 == r1) goto L_0x0026;
        L_0x0014:
            r1 = r2.f53182a;	 Catch:{ all -> 0x001f }
            r1.onComplete();	 Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0026;
        L_0x001b:
            r0.dispose();
            goto L_0x0026;
        L_0x001f:
            r1 = move-exception;
            if (r0 == 0) goto L_0x0025;
        L_0x0022:
            r0.dispose();
        L_0x0025:
            throw r1;
        L_0x0026:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.completable.CompletableCreate.Emitter.onComplete():void");
        }

        Emitter(CompletableObserver completableObserver) {
            this.f53182a = completableObserver;
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                C2667a.a(th);
            }
        }

        public boolean tryOnError(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() != DisposableHelper.DISPOSED) {
                Disposable disposable = (Disposable) getAndSet(DisposableHelper.DISPOSED);
                if (disposable != DisposableHelper.DISPOSED) {
                    try {
                        this.f53182a.onError(th);
                        return true;
                    } finally {
                        if (disposable != null) {
                            disposable.dispose();
                        }
                    }
                }
            }
            return null;
        }

        public void setDisposable(Disposable disposable) {
            DisposableHelper.set(this, disposable);
        }

        public void setCancellable(Cancellable cancellable) {
            setDisposable(new CancellableDisposable(cancellable));
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }
    }

    public CompletableCreate(CompletableOnSubscribe completableOnSubscribe) {
        this.f56807a = completableOnSubscribe;
    }

    /* renamed from: a */
    protected void m66384a(CompletableObserver completableObserver) {
        Emitter emitter = new Emitter(completableObserver);
        completableObserver.onSubscribe(emitter);
        try {
            this.f56807a.subscribe(emitter);
        } catch (CompletableObserver completableObserver2) {
            C15678a.m58850b(completableObserver2);
            emitter.onError(completableObserver2);
        }
    }
}
