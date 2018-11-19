package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.C4017g;
import android.support.v4.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.WebDialog.C1693a;
import com.facebook.internal.WebDialog.OnCompleteListener;

/* renamed from: com.facebook.internal.e */
public class C4354e extends C4017g {
    /* renamed from: a */
    private Dialog f14289a;

    /* renamed from: com.facebook.internal.e$1 */
    class C34131 implements OnCompleteListener {
        /* renamed from: a */
        final /* synthetic */ C4354e f10394a;

        C34131(C4354e c4354e) {
            this.f10394a = c4354e;
        }

        public void onComplete(Bundle bundle, FacebookException facebookException) {
            this.f10394a.m17754a(bundle, facebookException);
        }
    }

    /* renamed from: com.facebook.internal.e$2 */
    class C34142 implements OnCompleteListener {
        /* renamed from: a */
        final /* synthetic */ C4354e f10395a;

        C34142(C4354e c4354e) {
            this.f10395a = c4354e;
        }

        public void onComplete(Bundle bundle, FacebookException facebookException) {
            this.f10395a.m17753a(bundle);
        }
    }

    /* renamed from: a */
    public void m17757a(Dialog dialog) {
        this.f14289a = dialog;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f14289a == null) {
            bundle = getActivity();
            Bundle d = C1745t.m6043d(bundle.getIntent());
            if (d.getBoolean("is_fallback", false)) {
                String string = d.getString("url");
                if (Utility.m5785a(string)) {
                    Utility.m5793b("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    bundle.finish();
                    return;
                }
                bundle = C3415h.m13098a(bundle, string, String.format("fb%s://bridge/", new Object[]{FacebookSdk.m3998i()}));
                bundle.m5840a(new C34142(this));
            } else {
                String string2 = d.getString("action");
                d = d.getBundle("params");
                if (Utility.m5785a(string2)) {
                    Utility.m5793b("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    bundle.finish();
                    return;
                }
                bundle = new C1693a(bundle, string2, d).m5812a(new C34131(this)).mo1866a();
            }
            this.f14289a = bundle;
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f14289a == null) {
            m17754a(null, null);
            setShowsDialog(null);
        }
        return this.f14289a;
    }

    public void onResume() {
        super.onResume();
        if (this.f14289a instanceof WebDialog) {
            ((WebDialog) this.f14289a).m5846e();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f14289a instanceof WebDialog) != null && isResumed() != null) {
            ((WebDialog) this.f14289a).m5846e();
        }
    }

    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    /* renamed from: a */
    private void m17754a(Bundle bundle, FacebookException facebookException) {
        FragmentActivity activity = getActivity();
        activity.setResult(facebookException == null ? -1 : null, C1745t.m6025a(activity.getIntent(), bundle, facebookException));
        activity.finish();
    }

    /* renamed from: a */
    private void m17753a(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
