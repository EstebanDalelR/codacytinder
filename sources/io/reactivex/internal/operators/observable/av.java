package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableOperator;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.p079d.C2667a;

public final class av<R, T> extends C18394a<T, R> {
    /* renamed from: b */
    final ObservableOperator<? extends R, ? super T> f59027b;

    public av(ObservableSource<T> observableSource, ObservableOperator<? extends R, ? super T> observableOperator) {
        super(observableSource);
        this.f59027b = observableOperator;
    }

    public void subscribeActual(Observer<? super R> observer) {
        try {
            Object apply = this.f59027b.apply(observer);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Operator ");
            stringBuilder.append(this.f59027b);
            stringBuilder.append(" returned a null Observer");
            this.a.subscribe((Observer) C15684a.m58895a(apply, stringBuilder.toString()));
        } catch (Observer<? super R> observer2) {
            throw observer2;
        } catch (Observer<? super R> observer22) {
            C15678a.m58850b(observer22);
            C2667a.a(observer22);
            new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(observer22);
        }
    }
}
