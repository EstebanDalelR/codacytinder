package com.tinder.smsauth.sdk;

import android.app.PendingIntent;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Intent;
import com.google.android.gms.auth.api.C2422a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest.C2430a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.tinder.smsauth.ui.PhoneNumberCollector;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/smsauth/sdk/GooglePhoneNumberCollector;", "Lcom/tinder/smsauth/ui/PhoneNumberCollector;", "googleApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "(Lcom/google/android/gms/common/api/GoogleApiClient;)V", "connect", "", "createIntent", "Landroid/app/PendingIntent;", "disconnect", "phoneNumberFromResult", "", "data", "Landroid/content/Intent;", "sdk_release"}, k = 1, mv = {1, 1, 10})
public final class GooglePhoneNumberCollector implements PhoneNumberCollector {
    /* renamed from: a */
    private final GoogleApiClient f14066a;

    @Inject
    public GooglePhoneNumberCollector(@NotNull GoogleApiClient googleApiClient) {
        C2668g.m10309b(googleApiClient, "googleApiClient");
        this.f14066a = googleApiClient;
    }

    @OnLifecycleEvent(Event.ON_START)
    public final void connect() {
        this.f14066a.mo2504e();
    }

    @OnLifecycleEvent(Event.ON_STOP)
    public final void disconnect() {
        this.f14066a.mo2506g();
    }

    @Nullable
    public String phoneNumberFromResult(@Nullable Intent intent) {
        if (intent != null) {
            Credential credential = (Credential) intent.getParcelableExtra(Credential.EXTRA_KEY);
            if (credential != null) {
                return credential.getId();
            }
        }
        return null;
    }

    @NotNull
    public PendingIntent createIntent() {
        Object hintPickerIntent = C2422a.f7349g.getHintPickerIntent(this.f14066a, new C2430a().m8802b(true).m8801a());
        C2668g.m10305a(hintPickerIntent, "Auth.CredentialsApi.getH…leApiClient, hintRequest)");
        return hintPickerIntent;
    }
}
