package com.spotify.sdk.android.player;

import android.os.Handler;
import com.spotify.sdk.android.player.NativePlayer.AudioDeliveredCallback;
import com.spotify.sdk.android.player.NativePlayer.AudioFlushCallback;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Player implements ConnectionStateCallback, AudioDeliveredCallback, AudioFlushCallback, ExecutorService {
    /* renamed from: a */
    private static Thread f25926a;
    /* renamed from: b */
    private final AudioController f25927b;
    /* renamed from: c */
    private final Object f25928c;
    /* renamed from: d */
    private final Object f25929d;
    /* renamed from: e */
    private final Object f25930e;
    /* renamed from: f */
    private final Handler f25931f;
    /* renamed from: g */
    private InitializationState f25932g;
    /* renamed from: h */
    private final List<Runnable> f25933h;
    /* renamed from: i */
    private final Set<ConnectionStateCallback> f25934i;
    /* renamed from: j */
    private volatile boolean f25935j;
    /* renamed from: k */
    private boolean f25936k;

    public interface InitializationObserver {
        void onError(Throwable th);

        void onInitialized(Player player);
    }

    private enum InitializationState {
        PENDING,
        TERMINATED,
        INITIALIZED
    }

    public void execute(Runnable runnable) throws RejectedExecutionException {
        m30826a();
        synchronized (this.f25930e) {
            this.f25933h.add(runnable);
        }
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        throw new UnsupportedOperationException();
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        throw new UnsupportedOperationException();
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private <T> RunnableFuture<T> m30825a(Callable callable) {
        return new FutureTask(callable);
    }

    /* renamed from: a */
    private <T> RunnableFuture<T> m30824a(Runnable runnable, T t) {
        return new FutureTask(runnable, t);
    }

    public Future<?> submit(Runnable runnable) throws RejectedExecutionException {
        m30826a();
        Future a = m30824a(runnable, null);
        synchronized (this.f25930e) {
            this.f25933h.add(runnable);
        }
        return a;
    }

    public <T> Future<T> submit(Runnable runnable, T t) throws RejectedExecutionException {
        m30826a();
        runnable = m30824a(runnable, t);
        synchronized (this.f25930e) {
            this.f25933h.add(runnable);
        }
        return runnable;
    }

    public <T> Future<T> submit(Callable<T> callable) throws RejectedExecutionException {
        m30826a();
        callable = m30825a(callable);
        synchronized (this.f25930e) {
            this.f25933h.add(callable);
        }
        return callable;
    }

    /* renamed from: a */
    private void m30826a() throws RejectedExecutionException {
        if (isShutdown()) {
            throw new RejectedExecutionException("Player is shut down");
        }
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        timeUnit.timedJoin(f25926a, j);
        return isTerminated();
    }

    public boolean isTerminated() {
        boolean z;
        synchronized (this.f25928c) {
            z = this.f25932g == InitializationState.TERMINATED;
        }
        return z;
    }

    public boolean isShutdown() {
        boolean z;
        synchronized (this.f25928c) {
            z = this.f25935j;
        }
        return z;
    }

    public List<Runnable> shutdownNow() {
        List linkedList;
        shutdown();
        synchronized (this.f25930e) {
            linkedList = new LinkedList(this.f25933h);
            this.f25933h.clear();
        }
        return linkedList;
    }

    public void shutdown() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f25928c;
        monitor-enter(r0);
        r1 = r3.f25932g;	 Catch:{ all -> 0x001b }
        r2 = com.spotify.sdk.android.player.Player.InitializationState.PENDING;	 Catch:{ all -> 0x001b }
        if (r1 != r2) goto L_0x0016;
    L_0x0009:
        r1 = r3.f25928c;	 Catch:{ InterruptedException -> 0x000f }
        r1.wait();	 Catch:{ InterruptedException -> 0x000f }
        goto L_0x0016;
    L_0x000f:
        r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x001b }
        r1.interrupt();	 Catch:{ all -> 0x001b }
    L_0x0016:
        r1 = 1;	 Catch:{ all -> 0x001b }
        r3.f25935j = r1;	 Catch:{ all -> 0x001b }
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        return;	 Catch:{ all -> 0x001b }
    L_0x001b:
        r1 = move-exception;	 Catch:{ all -> 0x001b }
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.sdk.android.player.Player.shutdown():void");
    }

    public void onLoggedIn() {
        synchronized (this.f25929d) {
            this.f25936k = true;
        }
        for (final ConnectionStateCallback connectionStateCallback : this.f25934i) {
            this.f25931f.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ Player f21798b;

                public void run() {
                    connectionStateCallback.onLoggedIn();
                }
            });
        }
    }

    public void onLoggedOut() {
        synchronized (this.f25929d) {
            this.f25936k = false;
        }
        for (final ConnectionStateCallback connectionStateCallback : this.f25934i) {
            this.f25931f.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ Player f21800b;

                public void run() {
                    connectionStateCallback.onLoggedOut();
                }
            });
        }
    }

    public void onLoginFailed(final Throwable th) {
        for (final ConnectionStateCallback connectionStateCallback : this.f25934i) {
            this.f25931f.post(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ Player f21791c;

                public void run() {
                    connectionStateCallback.onLoginFailed(th);
                }
            });
        }
    }

    public void onTemporaryError() {
        for (final ConnectionStateCallback connectionStateCallback : this.f25934i) {
            this.f25931f.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ Player f21793b;

                public void run() {
                    connectionStateCallback.onTemporaryError();
                }
            });
        }
    }

    public void onConnectionMessage(final String str) {
        for (final ConnectionStateCallback connectionStateCallback : this.f25934i) {
            this.f25931f.post(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ Player f21796c;

                public void run() {
                    connectionStateCallback.onConnectionMessage(str);
                }
            });
        }
    }

    public int onAudioDelivered(short[] sArr, int i, int i2, int i3) {
        return this.f25927b.onAudioDataDelivered(sArr, i, i2, i3);
    }

    public void onAudioFlush() {
        this.f25927b.onAudioFlush();
    }
}
