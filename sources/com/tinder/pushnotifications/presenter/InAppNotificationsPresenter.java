package com.tinder.pushnotifications.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tinder.domain.injection.qualifiers.ComputationScheduler;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import com.tinder.pushnotifications.InAppNotificationsPredicateHost;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.p381b.C14551a;
import com.tinder.pushnotifications.target.InAppNotificationsTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.C19571c;
import rx.C2671a;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p500e.C19573b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/pushnotifications/presenter/InAppNotificationsPresenter;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "inAppNotificationProvider", "Lcom/tinder/pushnotifications/provider/InAppNotificationProvider;", "computationScheduler", "Lrx/Scheduler;", "mainThreadScheduler", "(Lcom/tinder/pushnotifications/provider/InAppNotificationProvider;Lrx/Scheduler;Lrx/Scheduler;)V", "subscription", "Lrx/subscriptions/CompositeSubscription;", "target", "Lcom/tinder/pushnotifications/target/InAppNotificationsTarget;", "describeContents", "", "dropTarget", "", "subscribeToInAppNotifications", "host", "Lcom/tinder/pushnotifications/InAppNotificationsPredicateHost;", "takeTarget", "writeToParcel", "flags", "CREATOR", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class InAppNotificationsPresenter implements Parcelable {
    public static final C14570a CREATOR = new C14570a();
    private final C2671a computationScheduler;
    private final C14551a inAppNotificationProvider;
    private final C2671a mainThreadScheduler;
    private C19573b subscription;
    private InAppNotificationsTarget target;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/pushnotifications/presenter/InAppNotificationsPresenter$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/tinder/pushnotifications/presenter/InAppNotificationsPresenter;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/tinder/pushnotifications/presenter/InAppNotificationsPresenter;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.presenter.InAppNotificationsPresenter$a */
    public static final class C14570a implements Creator<InAppNotificationsPresenter> {
        private C14570a() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m55601a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m55602a(i);
        }

        @NotNull
        /* renamed from: a */
        public InAppNotificationsPresenter m55601a(@NotNull Parcel parcel) {
            C2668g.b(parcel, "parcel");
            return new InAppNotificationsPresenter(parcel);
        }

        @NotNull
        /* renamed from: a */
        public InAppNotificationsPresenter[] m55602a(int i) {
            return new InAppNotificationsPresenter[i];
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/pushnotifications/model/TinderNotification;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.presenter.InAppNotificationsPresenter$b */
    static final class C17882b<T, R> implements Func1<TinderNotification, Boolean> {
        /* renamed from: a */
        final /* synthetic */ InAppNotificationsPredicateHost f55768a;

        C17882b(InAppNotificationsPredicateHost inAppNotificationsPredicateHost) {
            this.f55768a = inAppNotificationsPredicateHost;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65166a((TinderNotification) obj));
        }

        /* renamed from: a */
        public final boolean m65166a(TinderNotification tinderNotification) {
            return this.f55768a.getNotificationPredicate().test(tinderNotification);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/tinder/pushnotifications/presenter/InAppNotificationsPresenter$subscribeToInAppNotifications$2", "Lrx/Subscriber;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "(Lcom/tinder/pushnotifications/presenter/InAppNotificationsPresenter;)V", "onCompleted", "", "onError", "e", "", "onNext", "t", "onStart", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.presenter.InAppNotificationsPresenter$c */
    public static final class C17883c extends C19571c<TinderNotification> {
        /* renamed from: a */
        final /* synthetic */ InAppNotificationsPresenter f55769a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.pushnotifications.presenter.InAppNotificationsPresenter$c$a */
        static final class C18650a<T> implements Action1<Long> {
            /* renamed from: a */
            final /* synthetic */ C17883c f58118a;
            /* renamed from: b */
            final /* synthetic */ C17883c f58119b;

            C18650a(C17883c c17883c, C17883c c17883c2) {
                this.f58118a = c17883c;
                this.f58119b = c17883c2;
            }

            public /* synthetic */ void call(Object obj) {
                m67089a((Long) obj);
            }

            /* renamed from: a */
            public final void m67089a(Long l) {
                l = this.f58118a.f55769a.target;
                if (l != null) {
                    l.hideInAppNotification();
                }
                this.f58119b.request(1);
            }
        }

        public void onCompleted() {
        }

        C17883c(InAppNotificationsPresenter inAppNotificationsPresenter) {
            this.f55769a = inAppNotificationsPresenter;
        }

        public /* synthetic */ void onNext(Object obj) {
            m65168a((TinderNotification) obj);
        }

        public void onStart() {
            request(1);
        }

        /* renamed from: a */
        public void m65168a(@NotNull TinderNotification tinderNotification) {
            C2668g.b(tinderNotification, "t");
            InAppNotificationsTarget access$getTarget$p = this.f55769a.target;
            if (access$getTarget$p != null) {
                access$getTarget$p.showInAppNotification(tinderNotification);
            }
            this.f55769a.subscription.a(Observable.b(2, C14571a.m55603a(), this.f55769a.computationScheduler).a(this.f55769a.mainThreadScheduler).d(new C18650a(this, this)));
        }

        public void onError(@Nullable Throwable th) {
            C0001a.c(th, "InAppNotifications subject just died!!!", new Object[0]);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C2668g.b(parcel, "parcel");
    }

    @Inject
    public InAppNotificationsPresenter(@NotNull C14551a c14551a, @NotNull @ComputationScheduler C2671a c2671a, @NotNull @MainThreadScheduler C2671a c2671a2) {
        C2668g.b(c14551a, "inAppNotificationProvider");
        C2668g.b(c2671a, "computationScheduler");
        C2668g.b(c2671a2, "mainThreadScheduler");
        this.inAppNotificationProvider = c14551a;
        this.computationScheduler = c2671a;
        this.mainThreadScheduler = c2671a2;
        this.subscription = new C19573b();
    }

    public InAppNotificationsPresenter(@NotNull Parcel parcel) {
        C2668g.b(parcel, "parcel");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("An operation is not implemented: ");
        stringBuilder.append("inAppNotificationProvider");
        throw new NotImplementedError(stringBuilder.toString());
    }

    public final void takeTarget(@NotNull InAppNotificationsTarget inAppNotificationsTarget) {
        C2668g.b(inAppNotificationsTarget, "target");
        this.target = inAppNotificationsTarget;
    }

    public final void dropTarget() {
        InAppNotificationsTarget inAppNotificationsTarget = this.target;
        if (inAppNotificationsTarget != null) {
            inAppNotificationsTarget.stopAnimationsAndRemoveView();
        }
        this.subscription.a();
        this.target = (InAppNotificationsTarget) null;
    }

    public final void subscribeToInAppNotifications(@NotNull InAppNotificationsPredicateHost inAppNotificationsPredicateHost) {
        C2668g.b(inAppNotificationsPredicateHost, "host");
        this.subscription.a(this.inAppNotificationProvider.m55574a().f(new C17882b(inAppNotificationsPredicateHost)).a(this.mainThreadScheduler).b(new C17883c(this)));
    }
}
