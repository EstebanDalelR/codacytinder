package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.functions.Predicate;
import org.reactivestreams.Subscriber;

public class AppendOnlyLinkedArrayList<T> {
    /* renamed from: a */
    final int f48651a;
    /* renamed from: b */
    final Object[] f48652b;
    /* renamed from: c */
    Object[] f48653c = this.f48652b;
    /* renamed from: d */
    int f48654d;

    public interface NonThrowingPredicate<T> extends Predicate<T> {
        boolean test(T t);
    }

    public AppendOnlyLinkedArrayList(int i) {
        this.f48651a = i;
        this.f48652b = new Object[(i + 1)];
    }

    /* renamed from: a */
    public void m58956a(T t) {
        int i = this.f48651a;
        int i2 = this.f48654d;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.f48653c[i] = objArr;
            this.f48653c = objArr;
            i2 = 0;
        }
        this.f48653c[i2] = t;
        this.f48654d = i2 + 1;
    }

    /* renamed from: b */
    public void m58959b(T t) {
        this.f48652b[0] = t;
    }

    /* renamed from: a */
    public void m58955a(NonThrowingPredicate<? super T> nonThrowingPredicate) {
        int i = this.f48651a;
        for (Object[] objArr = this.f48652b; objArr != null; objArr = (Object[]) objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object obj = objArr[i2];
                if (obj == null) {
                    break;
                } else if (nonThrowingPredicate.test(obj)) {
                    break;
                } else {
                    i2++;
                }
            }
        }
    }

    /* renamed from: a */
    public <U> boolean m58958a(Subscriber<? super U> subscriber) {
        Object[] objArr = this.f48652b;
        int i = this.f48651a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object obj = objArr[i2];
                if (obj == null) {
                    break;
                } else if (NotificationLite.acceptFull(obj, (Subscriber) subscriber)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = (Object[]) objArr[i];
        }
    }

    /* renamed from: a */
    public <U> boolean m58957a(Observer<? super U> observer) {
        Object[] objArr = this.f48652b;
        int i = this.f48651a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object obj = objArr[i2];
                if (obj == null) {
                    break;
                } else if (NotificationLite.acceptFull(obj, (Observer) observer)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = (Object[]) objArr[i];
        }
    }
}
