package com.tinder.recs.presenter;

import com.tinder.recs.target.DiscoveryOffTarget;
import com.tinder.recs.target.DiscoveryOffTarget_Stub;

public class DiscoveryOffPresenter_Holder {
    public static void takeAll(DiscoveryOffPresenter discoveryOffPresenter, DiscoveryOffTarget discoveryOffTarget) {
        discoveryOffPresenter.target = discoveryOffTarget;
    }

    public static void dropAll(DiscoveryOffPresenter discoveryOffPresenter) {
        discoveryOffPresenter.target = new DiscoveryOffTarget_Stub();
    }
}
