package com.tinder.smsauth.sdk.analytics;

import com.tinder.smsauth.entity.Flow.C14974c;
import com.tinder.smsauth.entity.Flow.C14974c.C16739a;
import com.tinder.smsauth.entity.Flow.C14974c.C16740b;
import com.tinder.smsauth.entity.Flow.C14974c.C16744f;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/smsauth/entity/Flow$State;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class SmsAuthAnalyticsWorker$b<T> implements Consumer<C14974c> {
    /* renamed from: a */
    final /* synthetic */ SmsAuthAnalyticsWorker f51762a;

    SmsAuthAnalyticsWorker$b(SmsAuthAnalyticsWorker smsAuthAnalyticsWorker) {
        this.f51762a = smsAuthAnalyticsWorker;
    }

    public /* synthetic */ void accept(Object obj) {
        m62270a((C14974c) obj);
    }

    /* renamed from: a */
    public final void m62270a(C14974c c14974c) {
        SmsAuthAnalyticsWorker.a(this.f51762a).setRegionCode(c14974c.mo12366a().m56580a().m56576b());
        if (c14974c instanceof C16740b) {
            SmsAuthAnalyticsWorker.a(this.f51762a).firePhoneNumberViewed();
        } else if (c14974c instanceof C16744f) {
            SmsAuthAnalyticsWorker.a(this.f51762a).fireCountryListViewed();
        } else if ((c14974c instanceof C16739a) != null) {
            SmsAuthAnalyticsWorker.a(this.f51762a).fireOneTimePasswordViewed();
        }
    }
}
