package com.tinder.ads.tracking;

import kotlin.Metadata;
import okhttp3.C15963q.C15962a;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 7})
final class TrackingClient$ping$1 implements Action0 {
    final /* synthetic */ String $url;
    final /* synthetic */ TrackingClient this$0;

    TrackingClient$ping$1(TrackingClient trackingClient, String str) {
        this.this$0 = trackingClient;
        this.$url = str;
    }

    public final void call() {
        this.this$0.okHttpClient.newCall(new C15962a().a(this.$url).a().d()).execute();
    }
}
