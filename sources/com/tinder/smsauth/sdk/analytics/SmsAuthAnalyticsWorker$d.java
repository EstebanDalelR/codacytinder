package com.tinder.smsauth.sdk.analytics;

import com.tinder.smsauth.entity.Flow.C14972a;
import com.tinder.smsauth.entity.Flow.C14972a.C16726b;
import com.tinder.smsauth.entity.Flow.C14972a.C16728d;
import com.tinder.smsauth.entity.Flow.C14972a.C16729e;
import com.tinder.smsauth.entity.Flow.C14972a.C16730f;
import com.tinder.smsauth.entity.Flow.C14972a.C16731g;
import com.tinder.smsauth.entity.Flow.C14972a.C16732h;
import com.tinder.smsauth.entity.Flow.C14972a.C16733i;
import com.tinder.smsauth.entity.Flow.C14972a.C16734j;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "event", "Lcom/tinder/smsauth/entity/Flow$Event;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class SmsAuthAnalyticsWorker$d<T> implements Consumer<C14972a> {
    /* renamed from: a */
    final /* synthetic */ SmsAuthAnalyticsWorker f51764a;

    SmsAuthAnalyticsWorker$d(SmsAuthAnalyticsWorker smsAuthAnalyticsWorker) {
        this.f51764a = smsAuthAnalyticsWorker;
    }

    public /* synthetic */ void accept(Object obj) {
        m62272a((C14972a) obj);
    }

    /* renamed from: a */
    public final void m62272a(C14972a c14972a) {
        if (c14972a instanceof C16734j) {
            if (((C16734j) c14972a).m62243b() != null) {
                SmsAuthAnalyticsWorker.a(this.f51764a).fireEnterPhoneNumberAutoFill();
            }
        } else if (c14972a instanceof C16726b) {
            SmsAuthAnalyticsWorker.a(this.f51764a).setRegionCode(((C16726b) c14972a).m62235a());
            SmsAuthAnalyticsWorker.a(this.f51764a).fireCountrySelected();
        } else if (c14972a instanceof C16728d) {
            if (((C16728d) c14972a).m62237b() != null) {
                SmsAuthAnalyticsWorker.a(this.f51764a).fireOneTimePasswordAutoFill();
            }
        } else if (c14972a instanceof C16730f) {
            SmsAuthAnalyticsWorker.a(this.f51764a).fireEnterPhoneNumberSuccess();
        } else if (c14972a instanceof C16729e) {
            SmsAuthAnalyticsWorker.a(this.f51764a).firePhoneNumberErrorEvent();
        } else if (c14972a instanceof C16731g) {
            SmsAuthAnalyticsWorker.a(this.f51764a).fireOneTimePasswordResendSms();
        } else if (c14972a instanceof C16733i) {
            SmsAuthAnalyticsWorker.a(this.f51764a).fireOneTimePasswordSuccess();
        } else if ((c14972a instanceof C16732h) != null) {
            SmsAuthAnalyticsWorker.a(this.f51764a).fireOneTimePasswordError();
        }
    }
}
