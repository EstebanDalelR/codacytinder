package com.tinder.ads.presenter;

import android.support.annotation.NonNull;
import com.tinder.ads.analytics.AddAdCompleteEvent;
import com.tinder.ads.analytics.AddAdPlayEvent;
import com.tinder.ads.analytics.AddAdSelectEvent;
import com.tinder.ads.analytics.AddAdToggleAudioEvent;
import com.tinder.ads.analytics.AddAdViewEvent;
import com.tinder.ads.analytics.AddAdViewEvent.Request;
import com.tinder.ads.source.fan.FanAd;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import rx.schedulers.Schedulers;

public class FanAdPresenter {
    @NonNull
    private final AddAdCompleteEvent addAdCompleteEvent;
    @NonNull
    private final AddAdPlayEvent addAdPlayEvent;
    @NonNull
    private final AddAdSelectEvent addAdSelectEvent;
    @NonNull
    private final AddAdToggleAudioEvent addAdToggleAudioEvent;
    @NonNull
    private final AddAdViewEvent addAdViewEvent;

    @Inject
    public FanAdPresenter(@NonNull AddAdViewEvent addAdViewEvent, @NonNull AddAdToggleAudioEvent addAdToggleAudioEvent, @NonNull AddAdPlayEvent addAdPlayEvent, @NonNull AddAdCompleteEvent addAdCompleteEvent, @NonNull AddAdSelectEvent addAdSelectEvent) {
        this.addAdViewEvent = addAdViewEvent;
        this.addAdToggleAudioEvent = addAdToggleAudioEvent;
        this.addAdPlayEvent = addAdPlayEvent;
        this.addAdCompleteEvent = addAdCompleteEvent;
        this.addAdSelectEvent = addAdSelectEvent;
    }

    public void sendAdViewEvent(@NonNull FanAd fanAd) {
        this.addAdViewEvent.execute(Request.builder().build(), fanAd).b(Schedulers.io()).b(RxUtils.b());
    }

    public void sendAdSelectEvent(@NonNull FanAd fanAd, int i) {
        this.addAdSelectEvent.execute(AddAdSelectEvent.Request.builder().action(i).build(), fanAd).b(Schedulers.io()).b(RxUtils.b());
    }

    public void sendAdToggleAudioEvent(@NonNull FanAd fanAd) {
        this.addAdToggleAudioEvent.execute(AddAdToggleAudioEvent.Request.builder().build(), fanAd).b(Schedulers.io()).b(RxUtils.b());
    }

    public void sendAdPlayEvent(@NonNull FanAd fanAd) {
        this.addAdPlayEvent.execute(AddAdPlayEvent.Request.builder().build(), fanAd).b(Schedulers.io()).b(RxUtils.b());
    }

    public void sendAdCompleteEvent(@NonNull FanAd fanAd) {
        this.addAdCompleteEvent.execute(AddAdCompleteEvent.Request.builder().build(), fanAd).b(Schedulers.io()).b(RxUtils.b());
    }
}
