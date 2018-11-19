package com.tinder.domain.recs;

import com.tinder.domain.recs.model.Rec;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19786b;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016RN\u0010\u0004\u001aB\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007* \u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/domain/recs/GlobalRecsConsumptionEventMessenger;", "Lcom/tinder/domain/recs/GlobalRecsConsumptionEventObserver;", "Lcom/tinder/domain/recs/GlobalRecsConsumptionEventPublisher;", "()V", "subject", "Lrx/subjects/SerializedSubject;", "Lcom/tinder/domain/recs/model/Rec;", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "publish", "", "rec", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class GlobalRecsConsumptionEventMessenger implements GlobalRecsConsumptionEventObserver, GlobalRecsConsumptionEventPublisher {
    public static final GlobalRecsConsumptionEventMessenger INSTANCE = new GlobalRecsConsumptionEventMessenger();
    private static final C19786b<Rec, Rec> subject = PublishSubject.w().B();

    private GlobalRecsConsumptionEventMessenger() {
    }

    @NotNull
    public Observable<Rec> observe() {
        Observable<Rec> k = subject.e().k();
        C2668g.a(k, "subject.asObservable().onBackpressureBuffer()");
        return k;
    }

    public void publish(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        subject.onNext(rec);
    }
}
