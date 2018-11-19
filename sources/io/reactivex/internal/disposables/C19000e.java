package io.reactivex.internal.disposables;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.queue.C18423a;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.disposables.e */
public final class C19000e<T> extends C18342b implements Disposable {
    /* renamed from: b */
    final Observer<? super T> f58780b;
    /* renamed from: c */
    final C18423a<Object> f58781c;
    /* renamed from: d */
    volatile Disposable f58782d = EmptyDisposable.INSTANCE;
    /* renamed from: e */
    Disposable f58783e;
    /* renamed from: f */
    volatile boolean f58784f;

    public C19000e(Observer<? super T> observer, Disposable disposable, int i) {
        this.f58780b = observer;
        this.f58783e = disposable;
        this.f58781c = new C18423a(i);
    }

    public void dispose() {
        if (!this.f58784f) {
            this.f58784f = true;
            m67541a();
        }
    }

    public boolean isDisposed() {
        Disposable disposable = this.f58783e;
        return disposable != null ? disposable.isDisposed() : this.f58784f;
    }

    /* renamed from: a */
    void m67541a() {
        Disposable disposable = this.f58783e;
        this.f58783e = null;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: a */
    public boolean m67543a(Disposable disposable) {
        if (this.f58784f) {
            return null;
        }
        this.f58781c.offer(this.f58782d, NotificationLite.disposable(disposable));
        m67545b();
        return true;
    }

    /* renamed from: a */
    public boolean m67544a(T t, Disposable disposable) {
        if (this.f58784f) {
            return null;
        }
        this.f58781c.offer(disposable, NotificationLite.next(t));
        m67545b();
        return true;
    }

    /* renamed from: a */
    public void m67542a(Throwable th, Disposable disposable) {
        if (this.f58784f) {
            C2667a.a(th);
            return;
        }
        this.f58781c.offer(disposable, NotificationLite.error(th));
        m67545b();
    }

    /* renamed from: b */
    public void m67546b(Disposable disposable) {
        this.f58781c.offer(disposable, NotificationLite.complete());
        m67545b();
    }

    /* renamed from: b */
    void m67545b() {
        if (this.a.getAndIncrement() == 0) {
            C18423a c18423a = this.f58781c;
            Observer observer = this.f58780b;
            int i = 1;
            while (true) {
                Disposable poll = c18423a.poll();
                if (poll == null) {
                    i = this.a.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    Object poll2 = c18423a.poll();
                    if (poll == this.f58782d) {
                        if (NotificationLite.isDisposable(poll2)) {
                            poll = NotificationLite.getDisposable(poll2);
                            this.f58782d.dispose();
                            if (this.f58784f) {
                                poll.dispose();
                            } else {
                                this.f58782d = poll;
                            }
                        } else if (NotificationLite.isError(poll2)) {
                            c18423a.clear();
                            m67541a();
                            Throwable error = NotificationLite.getError(poll2);
                            if (this.f58784f) {
                                C2667a.a(error);
                            } else {
                                this.f58784f = true;
                                observer.onError(error);
                            }
                        } else if (NotificationLite.isComplete(poll2)) {
                            c18423a.clear();
                            m67541a();
                            if (!this.f58784f) {
                                this.f58784f = true;
                                observer.onComplete();
                            }
                        } else {
                            observer.onNext(NotificationLite.getValue(poll2));
                        }
                    }
                }
            }
        }
    }
}
