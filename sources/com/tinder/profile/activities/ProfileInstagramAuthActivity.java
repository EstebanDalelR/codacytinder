package com.tinder.profile.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tinder.activities.WebViewActivityInstagram;
import com.tinder.base.ActivityBase;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.profile.dialogs.C16102a;
import com.tinder.profile.dialogs.C16103c;
import com.tinder.profile.listener.InstagramConnectErrorDialogListener;
import com.tinder.profile.module.ProfileComponent;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.presenter.ae;
import com.tinder.profile.target.ProfileInstagramAuthTarget;
import javax.inject.Inject;
import org.michaelevans.aftermath.Aftermath;
import org.michaelevans.aftermath.OnActivityResult;

public class ProfileInstagramAuthActivity extends ActivityBase implements ProfileComponentProvider, ProfileInstagramAuthTarget {
    @Inject
    /* renamed from: a */
    ae f59970a;
    /* renamed from: b */
    private ProfileComponent f59971b;

    /* renamed from: com.tinder.profile.activities.ProfileInstagramAuthActivity$1 */
    class C160671 implements InstagramConnectErrorDialogListener {
        /* renamed from: a */
        final /* synthetic */ ProfileInstagramAuthActivity f49935a;

        C160671(ProfileInstagramAuthActivity profileInstagramAuthActivity) {
            this.f49935a = profileInstagramAuthActivity;
        }

        public void retryInstagramLogin() {
            this.f49935a.f59970a.m54977a(Integer.valueOf(4));
        }

        public void finishActivity() {
            this.f49935a.onBackPressed();
        }
    }

    public void showInitialPhotosFetched(boolean z) {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f59971b = ManagerApp.e().profileComponentBuilder().profileActivityContext(this).build();
        this.f59971b.inject(this);
        Deadshot.take(this, this.f59970a);
        bundle = getIntent();
        if (bundle != null && bundle.getExtras() != null) {
            this.f59970a.m54977a(Integer.valueOf(bundle.getIntExtra("instagramConnectValue", 0)));
        }
    }

    public void showInstagramLoginScreen() {
        Intent intent = new Intent(this, WebViewActivityInstagram.class);
        intent.putExtra("url", this.f59970a.m54975a());
        startActivityForResult(intent, 1);
    }

    protected void onStart() {
        Deadshot.take(this, this.f59970a);
        super.onStart();
    }

    protected void onStop() {
        super.onStop();
        Deadshot.drop(this);
    }

    protected void onDestroy() {
        super.onDestroy();
        Deadshot.drop(this);
        this.f59971b = null;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        Deadshot.take(this, this.f59970a);
        Aftermath.onActivityResult(this, i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @OnActivityResult(1)
    public void onInstragramAuthResult(Integer num, Intent intent) {
        switch (num.intValue()) {
            case -1:
                String stringExtra = intent.getStringExtra("access_code");
                if (stringExtra.isEmpty() == null) {
                    this.f59970a.m54978a(stringExtra);
                    return;
                } else {
                    this.f59970a.m54980b();
                    return;
                }
            case null:
                finish();
                return;
            default:
                this.f59970a.m54980b();
                return;
        }
    }

    public void finishWithResultCode() {
        setResult(-1, new Intent());
        finish();
    }

    public void showInstagramAccountInUseError() {
        C16102a c16102a = new C16102a(this);
        c16102a.setOnDismissListener(new C14359c(this));
        c16102a.show();
    }

    /* renamed from: a */
    final /* synthetic */ void m68645a(DialogInterface dialogInterface) {
        onBackPressed();
    }

    public void showInstagramConnectError() {
        new C16103c(this, new C160671(this)).show();
    }

    public ProfileComponent provideComponent() {
        return this.f59971b;
    }
}
