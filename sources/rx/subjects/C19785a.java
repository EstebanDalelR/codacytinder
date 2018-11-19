package rx.subjects;

import java.util.ArrayList;
import java.util.List;
import rx.Observable.OnSubscribe;
import rx.exceptions.C19410a;
import rx.functions.Action1;
import rx.internal.operators.NotificationLite;
import rx.subjects.SubjectSubscriptionManager.C19622b;

/* renamed from: rx.subjects.a */
public final class C19785a<T> extends C19623c<T, T> {
    /* renamed from: b */
    private static final Object[] f61869b = new Object[0];
    /* renamed from: c */
    private final SubjectSubscriptionManager<T> f61870c;

    /* renamed from: w */
    public static <T> C19785a<T> m71080w() {
        return C19785a.m71078a(null, false);
    }

    /* renamed from: f */
    public static <T> C19785a<T> m71079f(T t) {
        return C19785a.m71078a(t, true);
    }

    /* renamed from: a */
    private static <T> C19785a<T> m71078a(T t, boolean z) {
        final Object subjectSubscriptionManager = new SubjectSubscriptionManager();
        if (z) {
            subjectSubscriptionManager.m71655a(NotificationLite.m69885a((Object) t));
        }
        subjectSubscriptionManager.f62349d = new Action1<C19622b<T>>() {
            public /* synthetic */ void call(Object obj) {
                m71484a((C19622b) obj);
            }

            /* renamed from: a */
            public void m71484a(C19622b<T> c19622b) {
                c19622b.m70660b(subjectSubscriptionManager.m71654a());
            }
        };
        subjectSubscriptionManager.f62350e = subjectSubscriptionManager.f62349d;
        return new C19785a(subjectSubscriptionManager, subjectSubscriptionManager);
    }

    protected C19785a(OnSubscribe<T> onSubscribe, SubjectSubscriptionManager<T> subjectSubscriptionManager) {
        super(onSubscribe);
        this.f61870c = subjectSubscriptionManager;
    }

    public void onCompleted() {
        if (this.f61870c.m71654a() == null || this.f61870c.f62347b) {
            Object a = NotificationLite.m69884a();
            for (C19622b a2 : this.f61870c.m71661c(a)) {
                a2.m70658a(a);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f61870c.m71654a() == null || this.f61870c.f62347b) {
            th = NotificationLite.m69886a(th);
            List list = null;
            for (C19622b a : this.f61870c.m71661c(th)) {
                try {
                    a.m70658a(th);
                } catch (Throwable th2) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(th2);
                }
            }
            C19410a.m69873a(list);
        }
    }

    public void onNext(T t) {
        if (this.f61870c.m71654a() == null || this.f61870c.f62347b) {
            Object a = NotificationLite.m69885a((Object) t);
            for (C19622b a2 : this.f61870c.m71660b(a)) {
                a2.m70658a(a);
            }
        }
    }

    /* renamed from: x */
    public boolean m71082x() {
        return NotificationLite.m69890d(this.f61870c.m71654a());
    }

    /* renamed from: y */
    public boolean m71083y() {
        return NotificationLite.m69889c(this.f61870c.m71654a());
    }

    /* renamed from: z */
    public boolean m71084z() {
        return NotificationLite.m69888b(this.f61870c.m71654a());
    }

    /* renamed from: A */
    public T m71081A() {
        Object a = this.f61870c.m71654a();
        return NotificationLite.m69890d(a) ? NotificationLite.m69891e(a) : null;
    }
}
