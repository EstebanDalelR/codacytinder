package rx;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import rx.Emitter.BackpressureMode;
import rx.exceptions.C19410a;
import rx.exceptions.OnErrorFailedException;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.functions.C19411a;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.Func5;
import rx.functions.FuncN;
import rx.internal.operators.C19879h;
import rx.internal.operators.C19880i;
import rx.internal.operators.C19881j;
import rx.internal.operators.C19882k;
import rx.internal.operators.C19883l;
import rx.internal.operators.C19884m;
import rx.internal.operators.C19885n;
import rx.internal.operators.C19886o;
import rx.internal.operators.C19887p;
import rx.internal.operators.C19888q;
import rx.internal.operators.C19890s;
import rx.internal.operators.C19891t;
import rx.internal.operators.C19892u;
import rx.internal.operators.C19893v;
import rx.internal.operators.C19894w;
import rx.internal.operators.C19895x;
import rx.internal.operators.C19897y;
import rx.internal.operators.C19899z;
import rx.internal.operators.EmptyObservableHolder;
import rx.internal.operators.OnSubscribeCombineLatest;
import rx.internal.operators.OnSubscribeCreate;
import rx.internal.operators.OnSubscribeFlatMapCompletable;
import rx.internal.operators.OnSubscribeFlatMapSingle;
import rx.internal.operators.OnSubscribeFromArray;
import rx.internal.operators.OnSubscribeFromIterable;
import rx.internal.operators.OnSubscribeRange;
import rx.internal.operators.OperatorMerge;
import rx.internal.operators.OperatorOnBackpressureLatest;
import rx.internal.operators.OperatorPublish;
import rx.internal.operators.OperatorReplay;
import rx.internal.operators.OperatorZip;
import rx.internal.operators.ab;
import rx.internal.operators.ac;
import rx.internal.operators.ad;
import rx.internal.operators.ae;
import rx.internal.operators.af;
import rx.internal.operators.ag;
import rx.internal.operators.ah;
import rx.internal.operators.ai;
import rx.internal.operators.aj;
import rx.internal.operators.ak;
import rx.internal.operators.al;
import rx.internal.operators.am;
import rx.internal.operators.an;
import rx.internal.operators.ao;
import rx.internal.operators.ap;
import rx.internal.operators.aq;
import rx.internal.operators.ar;
import rx.internal.operators.as;
import rx.internal.operators.at;
import rx.internal.operators.au;
import rx.internal.operators.av;
import rx.internal.operators.aw;
import rx.internal.operators.ax;
import rx.internal.operators.ay;
import rx.internal.operators.az;
import rx.internal.operators.ba;
import rx.internal.operators.bb;
import rx.internal.operators.bc;
import rx.internal.util.C19609a;
import rx.internal.util.C19613g;
import rx.internal.util.C19775b;
import rx.internal.util.C19776d;
import rx.internal.util.InternalObservableUtils;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.UtilityFunctions;
import rx.observers.C19780c;
import rx.p497b.C19398a;
import rx.p497b.C19565b;
import rx.p498c.C19401c;
import rx.schedulers.Schedulers;

public class Observable<T> {
    /* renamed from: a */
    final OnSubscribe<T> f60543a;

    public interface Operator<R, T> extends Func1<C19571c<? super R>, C19571c<? super T>> {
    }

    public interface OnSubscribe<T> extends Action1<C19571c<? super T>> {
    }

    protected Observable(OnSubscribe<T> onSubscribe) {
        this.f60543a = onSubscribe;
    }

    @Deprecated
    /* renamed from: a */
    public static <T> Observable<T> m69620a(OnSubscribe<T> onSubscribe) {
        return new Observable(C19401c.m69802a((OnSubscribe) onSubscribe));
    }

    /* renamed from: a */
    public static <T> Observable<T> m69627a(Action1<Emitter<T>> action1, BackpressureMode backpressureMode) {
        return m69634b(new OnSubscribeCreate(action1, backpressureMode));
    }

    /* renamed from: b */
    public static <T> Observable<T> m69634b(OnSubscribe<T> onSubscribe) {
        return new Observable(C19401c.m69802a((OnSubscribe) onSubscribe));
    }

    /* renamed from: a */
    public final <R> Observable<R> m69648a(Operator<? extends R, ? super T> operator) {
        return m69634b(new C19885n(this.f60543a, operator));
    }

    /* renamed from: a */
    public <R> Observable<R> m69649a(Observable$Transformer<? super T, ? extends R> observable$Transformer) {
        return (Observable) observable$Transformer.call(this);
    }

    /* renamed from: a */
    public Single<T> m69659a() {
        return new Single(C19890s.m71627a(this));
    }

    /* renamed from: b */
    public Completable m69666b() {
        return Completable.a(this);
    }

    /* renamed from: a */
    public static <T1, T2, R> Observable<R> m69626a(Observable<? extends T1> observable, Observable<? extends T2> observable2, Func2<? super T1, ? super T2, ? extends R> func2) {
        return m69618a(Arrays.asList(new Observable[]{observable, observable2}), C19411a.m69879a((Func2) func2));
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> Observable<R> m69625a(Observable<? extends T1> observable, Observable<? extends T2> observable2, Observable<? extends T3> observable3, Func3<? super T1, ? super T2, ? super T3, ? extends R> func3) {
        return m69618a(Arrays.asList(new Observable[]{observable, observable2, observable3}), C19411a.m69880a((Func3) func3));
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, R> Observable<R> m69624a(Observable<? extends T1> observable, Observable<? extends T2> observable2, Observable<? extends T3> observable3, Observable<? extends T4> observable4, Func4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func4) {
        return m69618a(Arrays.asList(new Observable[]{observable, observable2, observable3, observable4}), C19411a.m69881a((Func4) func4));
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, R> Observable<R> m69623a(Observable<? extends T1> observable, Observable<? extends T2> observable2, Observable<? extends T3> observable3, Observable<? extends T4> observable4, Observable<? extends T5> observable5, Func5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> func5) {
        return m69618a(Arrays.asList(new Observable[]{observable, observable2, observable3, observable4, observable5}), C19411a.m69882a((Func5) func5));
    }

    /* renamed from: a */
    public static <T, R> Observable<R> m69618a(List<? extends Observable<? extends T>> list, FuncN<? extends R> funcN) {
        return m69634b(new OnSubscribeCombineLatest(list, funcN));
    }

    /* renamed from: a */
    public static <T> Observable<T> m69621a(Observable<? extends Observable<? extends T>> observable) {
        return observable.m69683c(UtilityFunctions.m69918b());
    }

    /* renamed from: a */
    public static <T> Observable<T> m69622a(Observable<? extends T> observable, Observable<? extends T> observable2) {
        return m69621a(m69615a((Object) observable, (Object) observable2));
    }

    /* renamed from: a */
    public static <T> Observable<T> m69628a(Func0<Observable<T>> func0) {
        return m69634b(new C19880i(func0));
    }

    /* renamed from: c */
    public static <T> Observable<T> m69640c() {
        return EmptyObservableHolder.instance();
    }

    /* renamed from: a */
    public static <T> Observable<T> m69617a(Throwable th) {
        return m69634b(new C19892u(th));
    }

    /* renamed from: a */
    public static <T> Observable<T> m69613a(Iterable<? extends T> iterable) {
        return m69634b(new OnSubscribeFromIterable(iterable));
    }

    /* renamed from: a */
    public static <T> Observable<T> m69629a(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return m69640c();
        }
        if (length == 1) {
            return m69614a(tArr[0]);
        }
        return m69634b(new OnSubscribeFromArray(tArr));
    }

    /* renamed from: a */
    public static <T> Observable<T> m69619a(Callable<? extends T> callable) {
        return m69634b(new C19884m(callable));
    }

    /* renamed from: a */
    public static Observable<Long> m69611a(long j, TimeUnit timeUnit) {
        return m69610a(j, j, timeUnit, Schedulers.computation());
    }

    /* renamed from: a */
    public static Observable<Long> m69612a(long j, TimeUnit timeUnit, C2671a c2671a) {
        return m69610a(j, j, timeUnit, c2671a);
    }

    /* renamed from: a */
    public static Observable<Long> m69609a(long j, long j2, TimeUnit timeUnit) {
        return m69610a(j, j2, timeUnit, Schedulers.computation());
    }

    /* renamed from: a */
    public static Observable<Long> m69610a(long j, long j2, TimeUnit timeUnit, C2671a c2671a) {
        return m69634b(new C19895x(j, j2, timeUnit, c2671a));
    }

    /* renamed from: a */
    public static <T> Observable<T> m69614a(T t) {
        return ScalarSynchronousObservable.m70625f(t);
    }

    /* renamed from: a */
    public static <T> Observable<T> m69615a(T t, T t2) {
        return m69629a(new Object[]{t, t2});
    }

    /* renamed from: a */
    public static <T> Observable<T> m69616a(T t, T t2, T t3, T t4, T t5) {
        return m69629a(new Object[]{t, t2, t3, t4, t5});
    }

    /* renamed from: b */
    public static <T> Observable<T> m69635b(Observable<? extends Observable<? extends T>> observable) {
        if (observable.getClass() == ScalarSynchronousObservable.class) {
            return ((ScalarSynchronousObservable) observable).m70626a(UtilityFunctions.m69918b());
        }
        return observable.m69648a(OperatorMerge.m71423a(false));
    }

    /* renamed from: b */
    public static <T> Observable<T> m69636b(Observable<? extends T> observable, Observable<? extends T> observable2) {
        return m69630a(new Observable[]{observable, observable2});
    }

    /* renamed from: a */
    public static <T> Observable<T> m69630a(Observable<? extends T>[] observableArr) {
        return m69635b(m69629a((Object[]) observableArr));
    }

    /* renamed from: c */
    public static <T> Observable<T> m69641c(Observable<? extends Observable<? extends T>> observable) {
        return observable.m69648a(OperatorMerge.m71423a(true));
    }

    /* renamed from: c */
    public static <T> Observable<T> m69642c(Observable<? extends T> observable, Observable<? extends T> observable2) {
        return m69641c(m69615a((Object) observable, (Object) observable2));
    }

    /* renamed from: d */
    public final Observable<Observable<T>> m69685d() {
        return m69614a((Object) this);
    }

    /* renamed from: a */
    public static Observable<Integer> m69608a(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Count can not be negative");
        } else if (i2 == 0) {
            return m69640c();
        } else {
            if (i > (ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i2) + 1) {
                throw new IllegalArgumentException("start + count can not exceed Integer.MAX_VALUE");
            } else if (i2 == 1) {
                return m69614a(Integer.valueOf(i));
            } else {
                return m69634b(new OnSubscribeRange(i, (i2 - 1) + i));
            }
        }
    }

    /* renamed from: d */
    public static <T> Observable<T> m69643d(Observable<? extends Observable<? extends T>> observable) {
        return observable.m69648a(aw.m71463a(false));
    }

    /* renamed from: b */
    public static Observable<Long> m69632b(long j, TimeUnit timeUnit) {
        return m69633b(j, timeUnit, Schedulers.computation());
    }

    /* renamed from: b */
    public static Observable<Long> m69633b(long j, TimeUnit timeUnit, C2671a c2671a) {
        return m69634b(new C19894w(j, timeUnit, c2671a));
    }

    /* renamed from: b */
    public static <T1, T2, R> Observable<R> m69639b(Observable<? extends T1> observable, Observable<? extends T2> observable2, Func2<? super T1, ? super T2, ? extends R> func2) {
        return m69614a(new Observable[]{observable, observable2}).m69648a(new OperatorZip((Func2) func2));
    }

    /* renamed from: b */
    public static <T1, T2, T3, R> Observable<R> m69638b(Observable<? extends T1> observable, Observable<? extends T2> observable2, Observable<? extends T3> observable3, Func3<? super T1, ? super T2, ? super T3, ? extends R> func3) {
        return m69614a(new Observable[]{observable, observable2, observable3}).m69648a(new OperatorZip((Func3) func3));
    }

    /* renamed from: b */
    public static <T1, T2, T3, T4, R> Observable<R> m69637b(Observable<? extends T1> observable, Observable<? extends T2> observable2, Observable<? extends T3> observable3, Observable<? extends T4> observable4, Func4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func4) {
        return m69614a(new Observable[]{observable, observable2, observable3, observable4}).m69648a(new OperatorZip((Func4) func4));
    }

    /* renamed from: e */
    public final Observable<T> m69692e() {
        return m69648a(ab.m71429a());
    }

    /* renamed from: a */
    public final <R> Observable<R> m69645a(Class<R> cls) {
        return m69648a(new ac(cls));
    }

    /* renamed from: c */
    public final <R> Observable<R> m69683c(Func1<? super T, ? extends Observable<? extends R>> func1) {
        if (this instanceof ScalarSynchronousObservable) {
            return ((ScalarSynchronousObservable) this).m70626a(func1);
        }
        return m69634b(new C19879h(this, func1, 2, 0));
    }

    /* renamed from: d */
    public final <R> Observable<R> m69690d(Func1<? super T, ? extends Observable<? extends R>> func1) {
        if (this instanceof ScalarSynchronousObservable) {
            return ((ScalarSynchronousObservable) this).m70626a(func1);
        }
        return m69634b(new C19879h(this, func1, 2, 2));
    }

    /* renamed from: e */
    public final Observable<T> m69695e(Observable<? extends T> observable) {
        return m69622a(this, (Observable) observable);
    }

    /* renamed from: c */
    public final Observable<T> m69679c(long j, TimeUnit timeUnit) {
        return m69680c(j, timeUnit, Schedulers.computation());
    }

    /* renamed from: c */
    public final Observable<T> m69680c(long j, TimeUnit timeUnit, C2671a c2671a) {
        return m69648a(new ad(j, timeUnit, c2671a));
    }

    /* renamed from: b */
    public final Observable<T> m69670b(T t) {
        return m69701f(m69614a((Object) t));
    }

    /* renamed from: f */
    public final Observable<T> m69701f(Observable<? extends T> observable) {
        if (observable != null) {
            return m69634b(new C19891t(this, observable));
        }
        throw new NullPointerException("alternate is null");
    }

    /* renamed from: d */
    public final Observable<T> m69686d(long j, TimeUnit timeUnit) {
        return m69687d(j, timeUnit, Schedulers.computation());
    }

    /* renamed from: d */
    public final Observable<T> m69687d(long j, TimeUnit timeUnit, C2671a c2671a) {
        return m69648a(new ae(j, timeUnit, c2671a));
    }

    /* renamed from: g */
    public final <U> Observable<T> m69706g(Observable<U> observable) {
        if (observable != null) {
            return m69634b(new C19881j(this, observable));
        }
        throw new NullPointerException();
    }

    /* renamed from: f */
    public final Observable<T> m69698f() {
        return m69648a(af.m71434a());
    }

    /* renamed from: g */
    public final Observable<T> m69703g() {
        return m69648a(ag.m71436a());
    }

    /* renamed from: e */
    public final <U> Observable<T> m69696e(Func1<? super T, ? extends U> func1) {
        return m69648a(new ag(func1));
    }

    /* renamed from: a */
    public final Observable<T> m69655a(Action0 action0) {
        return m69634b(new C19882k(this, new C19609a(Actions.m69877a(), Actions.m69877a(), action0)));
    }

    /* renamed from: a */
    public final Observable<T> m69656a(Action1<? super Throwable> action1) {
        return m69634b(new C19882k(this, new C19609a(Actions.m69877a(), action1, Actions.m69877a())));
    }

    /* renamed from: b */
    public final Observable<T> m69675b(Action1<? super T> action1) {
        return m69634b(new C19882k(this, new C19609a(action1, Actions.m69877a(), Actions.m69877a())));
    }

    /* renamed from: b */
    public final Observable<T> m69674b(Action0 action0) {
        return m69648a(new ah(action0));
    }

    /* renamed from: c */
    public final Observable<T> m69682c(Action0 action0) {
        return m69634b(new C19882k(this, new C19609a(Actions.m69877a(), Actions.m69876a(action0), action0)));
    }

    /* renamed from: d */
    public final Observable<T> m69689d(Action0 action0) {
        return m69648a(new ai(action0));
    }

    /* renamed from: f */
    public final Observable<T> m69702f(Func1<? super T, Boolean> func1) {
        return m69634b(new C19883l(this, func1));
    }

    /* renamed from: h */
    public final Observable<T> m69708h() {
        return m69678c(1).m69734s();
    }

    /* renamed from: g */
    public final Observable<T> m69707g(Func1<? super T, Boolean> func1) {
        return m69731q(func1).m69734s();
    }

    /* renamed from: c */
    public final Observable<T> m69681c(T t) {
        return m69678c(1).m69688d((Object) t);
    }

    /* renamed from: a */
    public final Observable<T> m69646a(T t, Func1<? super T, Boolean> func1) {
        return m69731q(func1).m69688d((Object) t);
    }

    /* renamed from: h */
    public final <R> Observable<R> m69711h(Func1<? super T, ? extends Observable<? extends R>> func1) {
        if (getClass() == ScalarSynchronousObservable.class) {
            return ((ScalarSynchronousObservable) this).m70626a(func1);
        }
        return m69635b(m69719k(func1));
    }

    /* renamed from: i */
    public final Observable<T> m69714i(Func1<? super T, ? extends Completable> func1) {
        return m69657a((Func1) func1, false, (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    /* renamed from: a */
    public final Observable<T> m69657a(Func1<? super T, ? extends Completable> func1, boolean z, int i) {
        return m69634b(new OnSubscribeFlatMapCompletable(this, func1, z, i));
    }

    /* renamed from: j */
    public final <R> Observable<R> m69717j(Func1<? super T, ? extends Single<? extends R>> func1) {
        return m69676b((Func1) func1, false, (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    /* renamed from: b */
    public final <R> Observable<R> m69676b(Func1<? super T, ? extends Single<? extends R>> func1, boolean z, int i) {
        return m69634b(new OnSubscribeFlatMapSingle(this, func1, z, i));
    }

    /* renamed from: c */
    public final void m69684c(Action1<? super T> action1) {
        m69691d((Action1) action1);
    }

    /* renamed from: i */
    public final Observable<T> m69712i() {
        return m69648a(aj.m71441a());
    }

    /* renamed from: k */
    public final <R> Observable<R> m69719k(Func1<? super T, ? extends R> func1) {
        return m69634b(new C19886o(this, func1));
    }

    /* renamed from: j */
    public final Observable<Notification<T>> m69715j() {
        return m69648a(ak.m71443a());
    }

    /* renamed from: h */
    public final Observable<T> m69710h(Observable<? extends T> observable) {
        return m69636b(this, (Observable) observable);
    }

    /* renamed from: a */
    public final Observable<T> m69651a(C2671a c2671a) {
        return m69652a(c2671a, C19613g.f61292b);
    }

    /* renamed from: a */
    public final Observable<T> m69652a(C2671a c2671a, int i) {
        return m69654a(c2671a, false, i);
    }

    /* renamed from: a */
    public final Observable<T> m69654a(C2671a c2671a, boolean z, int i) {
        if (this instanceof ScalarSynchronousObservable) {
            return ((ScalarSynchronousObservable) this).m70627c(c2671a);
        }
        return m69648a(new al(c2671a, z, i));
    }

    /* renamed from: b */
    public final <R> Observable<R> m69668b(Class<R> cls) {
        return m69702f(InternalObservableUtils.isInstanceOf(cls)).m69645a((Class) cls);
    }

    /* renamed from: k */
    public final Observable<T> m69718k() {
        return m69648a(am.m71449a());
    }

    /* renamed from: l */
    public final Observable<T> m69720l() {
        return m69648a(an.m71451a());
    }

    /* renamed from: m */
    public final Observable<T> m69722m() {
        return m69648a(OperatorOnBackpressureLatest.m71425a());
    }

    /* renamed from: l */
    public final Observable<T> m69721l(Func1<? super Throwable, ? extends Observable<? extends T>> func1) {
        return m69648a(new ao(func1));
    }

    /* renamed from: m */
    public final Observable<T> m69723m(Func1<? super Throwable, ? extends T> func1) {
        return m69648a(ao.m71453a((Func1) func1));
    }

    /* renamed from: n */
    public final C19565b<T> m69725n() {
        return OperatorPublish.m70931k(this);
    }

    /* renamed from: a */
    public final <R> Observable<R> m69647a(R r, Func2<R, ? super T, R> func2) {
        return m69634b(new C19888q(this, r, func2));
    }

    /* renamed from: o */
    public final Observable<T> m69726o() {
        return C19887p.m71618b(this);
    }

    /* renamed from: n */
    public final Observable<T> m69724n(Func1<? super Observable<? extends Void>, ? extends Observable<?>> func1) {
        return C19887p.m71619b(this, InternalObservableUtils.createRepeatDematerializer(func1));
    }

    /* renamed from: p */
    public final C19565b<T> m69729p() {
        return OperatorReplay.m70952k(this);
    }

    /* renamed from: a */
    public final C19565b<T> m69664a(int i) {
        return OperatorReplay.m70948a(this, i);
    }

    /* renamed from: a */
    public final C19565b<T> m69665a(int i, long j, TimeUnit timeUnit, C2671a c2671a) {
        if (i >= 0) {
            return OperatorReplay.m70950a(this, j, timeUnit, c2671a, i);
        }
        throw new IllegalArgumentException("bufferSize < 0");
    }

    /* renamed from: e */
    public final C19565b<T> m69697e(long j, TimeUnit timeUnit, C2671a c2671a) {
        return OperatorReplay.m70949a(this, j, timeUnit, c2671a);
    }

    /* renamed from: q */
    public final Observable<T> m69730q() {
        return C19887p.m71614a(this);
    }

    /* renamed from: a */
    public final Observable<T> m69658a(Func2<Integer, Throwable, Boolean> func2) {
        return m69685d().m69648a(new ap(func2));
    }

    /* renamed from: o */
    public final Observable<T> m69727o(Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return C19887p.m71616a(this, InternalObservableUtils.createRetryDematerializer(func1));
    }

    /* renamed from: e */
    public final Observable<T> m69693e(long j, TimeUnit timeUnit) {
        return m69700f(j, timeUnit, Schedulers.computation());
    }

    /* renamed from: f */
    public final Observable<T> m69700f(long j, TimeUnit timeUnit, C2671a c2671a) {
        return m69648a(new ar(j, timeUnit, c2671a));
    }

    /* renamed from: i */
    public final <U> Observable<T> m69713i(Observable<U> observable) {
        return m69648a(new aq(observable));
    }

    /* renamed from: b */
    public final <R> Observable<R> m69671b(R r, Func2<R, ? super T, R> func2) {
        return m69648a(new as((Object) r, (Func2) func2));
    }

    /* renamed from: r */
    public final Observable<T> m69732r() {
        return m69725n().m70539w();
    }

    /* renamed from: s */
    public final Observable<T> m69734s() {
        return m69648a(at.m71460a());
    }

    /* renamed from: d */
    public final Observable<T> m69688d(T t) {
        return m69648a(new at(t));
    }

    /* renamed from: b */
    public final Observable<T> m69667b(int i) {
        return m69648a(new au(i));
    }

    /* renamed from: b */
    public final Observable<T> m69669b(Iterable<T> iterable) {
        return m69622a(m69613a((Iterable) iterable), this);
    }

    /* renamed from: e */
    public final Observable<T> m69694e(T t) {
        return m69622a(m69614a((Object) t), this);
    }

    /* renamed from: t */
    public final Subscription m69737t() {
        return m69677b(new C19775b(Actions.m69877a(), InternalObservableUtils.ERROR_NOT_IMPLEMENTED, Actions.m69877a()));
    }

    /* renamed from: d */
    public final Subscription m69691d(Action1<? super T> action1) {
        if (action1 != null) {
            return m69677b(new C19775b(action1, InternalObservableUtils.ERROR_NOT_IMPLEMENTED, Actions.m69877a()));
        }
        throw new IllegalArgumentException("onNext can not be null");
    }

    /* renamed from: a */
    public final Subscription m69662a(Action1<? super T> action1, Action1<Throwable> action12) {
        if (action1 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (action12 != null) {
            return m69677b(new C19775b(action1, action12, Actions.m69877a()));
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    /* renamed from: a */
    public final Subscription m69663a(Action1<? super T> action1, Action1<Throwable> action12, Action0 action0) {
        if (action1 == null) {
            throw new IllegalArgumentException("onNext can not be null");
        } else if (action12 == null) {
            throw new IllegalArgumentException("onError can not be null");
        } else if (action0 != null) {
            return m69677b(new C19775b(action1, action12, action0));
        } else {
            throw new IllegalArgumentException("onComplete can not be null");
        }
    }

    /* renamed from: a */
    public final Subscription m69660a(Observer<? super T> observer) {
        if (observer instanceof C19571c) {
            return m69677b((C19571c) observer);
        }
        if (observer != null) {
            return m69677b(new C19776d(observer));
        }
        throw new NullPointerException("observer is null");
    }

    /* renamed from: a */
    public final Subscription m69661a(C19571c<? super T> c19571c) {
        try {
            c19571c.onStart();
            C19401c.m69803a(this, this.f60543a).call(c19571c);
            return C19401c.m69807a((Subscription) c19571c);
        } catch (C19571c<? super T> c19571c2) {
            C19410a.m69874b(c19571c2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error occurred attempting to subscribe [");
            stringBuilder.append(th.getMessage());
            stringBuilder.append("] and then again while trying to pass to onError.");
            C19401c.m69817c(new OnErrorFailedException(stringBuilder.toString(), c19571c2));
        }
    }

    /* renamed from: b */
    public final Subscription m69677b(C19571c<? super T> c19571c) {
        return m69631a((C19571c) c19571c, this);
    }

    /* renamed from: a */
    static <T> Subscription m69631a(C19571c<? super T> c19571c, Observable<T> observable) {
        if (c19571c == null) {
            throw new IllegalArgumentException("subscriber can not be null");
        } else if (observable.f60543a == null) {
            throw new IllegalStateException("onSubscribe function can not be null.");
        } else {
            Subscription c19780c;
            c19571c.onStart();
            if (!(c19571c instanceof C19780c)) {
                c19780c = new C19780c(c19571c);
            }
            try {
                C19401c.m69803a((Observable) observable, observable.f60543a).call(c19780c);
                return C19401c.m69807a(c19780c);
            } catch (C19571c<? super T> c19571c2) {
                C19410a.m69874b(c19571c2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error occurred attempting to subscribe [");
                stringBuilder.append(th.getMessage());
                stringBuilder.append("] and then again while trying to pass to onError.");
                C19401c.m69817c(new OnErrorFailedException(stringBuilder.toString(), c19571c2));
            }
        }
    }

    /* renamed from: b */
    public final Observable<T> m69673b(C2671a c2671a) {
        return m69653a(c2671a, !(this.f60543a instanceof OnSubscribeCreate));
    }

    /* renamed from: a */
    public final Observable<T> m69653a(C2671a c2671a, boolean z) {
        if (this instanceof ScalarSynchronousObservable) {
            return ((ScalarSynchronousObservable) this).m70627c(c2671a);
        }
        return m69634b(new av(this, c2671a, z));
    }

    /* renamed from: p */
    public final <R> Observable<R> m69728p(Func1<? super T, ? extends Observable<? extends R>> func1) {
        return m69643d(m69719k(func1));
    }

    /* renamed from: c */
    public final Observable<T> m69678c(int i) {
        return m69648a(new ax(i));
    }

    /* renamed from: q */
    public final Observable<T> m69731q(Func1<? super T, Boolean> func1) {
        return m69702f((Func1) func1).m69678c(1);
    }

    /* renamed from: j */
    public final <E> Observable<T> m69716j(Observable<? extends E> observable) {
        return m69648a(new ay(observable));
    }

    /* renamed from: r */
    public final Observable<T> m69733r(Func1<? super T, Boolean> func1) {
        return m69648a(new az(func1));
    }

    /* renamed from: f */
    public final Observable<T> m69699f(long j, TimeUnit timeUnit) {
        return m69705g(j, timeUnit, Schedulers.computation());
    }

    /* renamed from: g */
    public final Observable<T> m69705g(long j, TimeUnit timeUnit, C2671a c2671a) {
        return m69648a(new ba(j, timeUnit, c2671a));
    }

    /* renamed from: g */
    public final Observable<T> m69704g(long j, TimeUnit timeUnit) {
        return m69693e(j, timeUnit);
    }

    /* renamed from: h */
    public final Observable<T> m69709h(long j, TimeUnit timeUnit) {
        return m69644a(j, timeUnit, null, Schedulers.computation());
    }

    /* renamed from: a */
    public final Observable<T> m69644a(long j, TimeUnit timeUnit, Observable<? extends T> observable, C2671a c2671a) {
        return m69634b(new C19893v(this, j, timeUnit, c2671a, observable));
    }

    /* renamed from: u */
    public final C19398a<T> m69738u() {
        return C19398a.m69787a(this);
    }

    /* renamed from: v */
    public final Observable<List<T>> m69739v() {
        return m69648a(bb.m71469a());
    }

    /* renamed from: s */
    public final <K> Observable<Map<K, T>> m69735s(Func1<? super T, ? extends K> func1) {
        return m69634b(new C19897y(this, func1, UtilityFunctions.m69918b()));
    }

    /* renamed from: t */
    public final <K> Observable<Map<K, Collection<T>>> m69736t(Func1<? super T, ? extends K> func1) {
        return m69634b(new C19899z(this, func1, UtilityFunctions.m69918b()));
    }

    /* renamed from: a */
    public final <U, R> Observable<R> m69650a(Observable<? extends U> observable, Func2<? super T, ? super U, ? extends R> func2) {
        return m69648a(new bc(observable, func2));
    }

    /* renamed from: b */
    public final <T2, R> Observable<R> m69672b(Observable<? extends T2> observable, Func2<? super T, ? super T2, ? extends R> func2) {
        return m69639b(this, (Observable) observable, (Func2) func2);
    }
}
