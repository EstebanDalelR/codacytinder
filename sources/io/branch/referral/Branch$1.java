package io.branch.referral;

import android.net.Uri;
import android.text.TextUtils;
import io.branch.referral.DeferredAppLinkDataHandler.AppLinkFetchEvents;
import io.branch.referral.Defines.Jsonkey;

class Branch$1 implements AppLinkFetchEvents {
    /* renamed from: a */
    final /* synthetic */ Branch f52972a;

    Branch$1(Branch branch) {
        this.f52972a = branch;
    }

    public void onAppLinkFetchFinished(String str) {
        Branch.a(this.f52972a).m58405a(Boolean.valueOf(true));
        if (str != null) {
            str = Uri.parse(str).getQueryParameter(Jsonkey.LinkClickID.getKey());
            if (!TextUtils.isEmpty(str)) {
                Branch.a(this.f52972a).m58434j(str);
            }
        }
        Branch.b(this.f52972a).m58486a(PROCESS_WAIT_LOCK.FB_APP_LINK_WAIT_LOCK);
        Branch.c(this.f52972a);
    }
}
