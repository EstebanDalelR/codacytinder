package com.facebook.ads.internal;

/* renamed from: com.facebook.ads.internal.i */
public enum C1432i {
    REWARDED_VIDEO_COMPLETE("com.facebook.ads.rewarded_video.completed"),
    REWARDED_VIDEO_COMPLETE_WITHOUT_REWARD("com.facebook.ads.rewarded_video.completed.without.reward"),
    REWARDED_VIDEO_END_ACTIVITY("com.facebook.ads.rewarded_video.error"),
    REWARDED_VIDEO_ERROR("com.facebook.ads.rewarded_video.error"),
    REWARDED_VIDEO_AD_CLICK("com.facebook.ads.rewarded_video.ad_click"),
    REWARDED_VIDEO_IMPRESSION("com.facebook.ads.rewarded_video.ad_impression"),
    REWARDED_VIDEO_CLOSED("com.facebook.ads.rewarded_video.closed"),
    REWARD_SERVER_SUCCESS("com.facebook.ads.rewarded_video.server_reward_success"),
    REWARD_SERVER_FAILED("com.facebook.ads.rewarded_video.server_reward_failed");
    
    /* renamed from: j */
    private String f3960j;

    private C1432i(String str) {
        this.f3960j = str;
    }

    /* renamed from: a */
    public String m5005a() {
        return this.f3960j;
    }

    /* renamed from: a */
    public String m5006a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f3960j);
        stringBuilder.append(":");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
