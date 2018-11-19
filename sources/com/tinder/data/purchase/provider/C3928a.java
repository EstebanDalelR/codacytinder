package com.tinder.data.purchase.provider;

import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.profile.model.ProfileOption.Purchase;
import com.tinder.domain.profile.model.ProfileV2Experiment;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.BackpressureStrategy;
import java8.util.Optional;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\nH\u0017J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000RJ\u0010\u0007\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t \u000b*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/data/purchase/provider/SubscriptionDataProvider;", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "profileV2Experiment", "Lcom/tinder/domain/profile/model/ProfileV2Experiment;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "(Lcom/tinder/domain/profile/model/ProfileV2Experiment;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;)V", "subject", "Lrx/subjects/BehaviorSubject;", "Ljava8/util/Optional;", "Lcom/tinder/domain/common/model/Subscription;", "kotlin.jvm.PlatformType", "get", "observe", "Lrx/Observable;", "update", "", "subscription", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.purchase.provider.a */
public final class C3928a implements SubscriptionProvider {
    /* renamed from: a */
    private final C19785a<Optional<Subscription>> f12279a = C19785a.f(Optional.a());
    /* renamed from: b */
    private final ProfileV2Experiment f12280b;
    /* renamed from: c */
    private final LoadProfileOptionData f12281c;

    public C3928a(@NotNull ProfileV2Experiment profileV2Experiment, @NotNull LoadProfileOptionData loadProfileOptionData) {
        C2668g.m10309b(profileV2Experiment, "profileV2Experiment");
        C2668g.m10309b(loadProfileOptionData, "loadProfileOptionData");
        this.f12280b = profileV2Experiment;
        this.f12281c = loadProfileOptionData;
    }

    @NotNull
    @Deprecated(message = "This class and method should not be used after profile V2/meta V2 is enabled.Instead use ProfileRepository#loadProfileOption(ProfileOption.PURCHASE)")
    public Subscription get() {
        if (this.f12280b.isEnabledForRevenue()) {
            Object blockingFirst = this.f12281c.execute(Purchase.INSTANCE).blockingFirst();
            C2668g.m10305a(blockingFirst, "loadProfileOptionData.ex…         .blockingFirst()");
            return (Subscription) blockingFirst;
        }
        blockingFirst = this.f12279a;
        C2668g.m10305a(blockingFirst, "subject");
        blockingFirst = blockingFirst.A();
        C2668g.m10305a(blockingFirst, "subject.value");
        if (((Optional) blockingFirst).c()) {
            blockingFirst = this.f12279a;
            C2668g.m10305a(blockingFirst, "subject");
            blockingFirst = (Subscription) ((Optional) blockingFirst.A()).b();
        } else {
            blockingFirst = C8768b.a();
        }
        C2668g.m10305a(blockingFirst, "if (subject.value.isPres…UBSCRIPTION\n            }");
        return blockingFirst;
    }

    @NotNull
    public Observable<Subscription> observe() {
        if (this.f12280b.isEnabledForRevenue()) {
            return RxJavaInteropExtKt.toV1Observable(this.f12281c.execute(Purchase.INSTANCE), BackpressureStrategy.BUFFER);
        }
        Object e = this.f12279a.g().f(a$a.f41696a).k(a$b.f41697a).e();
        C2668g.m10305a(e, "subject.distinctUntilCha…          .asObservable()");
        return e;
    }

    @Deprecated(message = "We do not want to give access to updating once profile V2 is enabledUse SyncProfileData#execute() to update value from backend")
    public void update(@NotNull Subscription subscription) {
        C2668g.m10309b(subscription, "subscription");
        if (this.f12280b.isEnabledForRevenue()) {
            C0001a.m31d("Method is deprecated for profile V2. Use SyncProfileData#execute() to update value", new Object[0]);
        } else {
            this.f12279a.onNext(Optional.a(subscription));
        }
    }
}
