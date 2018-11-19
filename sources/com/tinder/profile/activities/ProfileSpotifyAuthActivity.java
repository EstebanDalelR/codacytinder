package com.tinder.profile.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.sdk.android.authentication.AuthenticationClient;
import com.tinder.R;
import com.tinder.base.ActivityBase;
import com.tinder.dialogs.DialogError;
import com.tinder.managers.ManagerApp;
import com.tinder.profile.module.ProfileComponent;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profile.presenter.bd;
import com.tinder.profile.target.ProfileSpotifyAuthTarget;
import javax.inject.Inject;

@Deprecated
public class ProfileSpotifyAuthActivity extends ActivityBase implements ProfileComponentProvider, ProfileSpotifyAuthTarget {
    @Inject
    /* renamed from: a */
    bd f59972a;
    /* renamed from: b */
    private ProfileComponent f59973b;

    /* renamed from: a */
    public static Intent m68646a(Context context, int i) {
        Intent intent = new Intent(context, ProfileSpotifyAuthActivity.class);
        intent.putExtra("spotifyConnectValue", i);
        intent.addFlags(537001984);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f59973b = ManagerApp.e().profileComponentBuilder().profileActivityContext(this).build();
        this.f59973b.inject(this);
        bundle = getIntent();
        if (!(bundle == null || bundle.getExtras() == null)) {
            this.f59972a.m64945a(bundle.getIntExtra("spotifyConnectValue", 0));
        }
        AuthenticationClient.openLoginActivity(this, 1337, this.f59972a.m64949b());
    }

    protected void onStart() {
        super.onStart();
        this.f59972a.a(this);
    }

    protected void onStop() {
        super.onStop();
        this.f59972a.m64944a();
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f59972a.m64944a();
        this.f59973b = null;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f59972a.a(this);
        this.f59972a.m64946a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f59972a.a(this);
        this.f59972a.m64947a(intent);
    }

    public void showError() {
        DialogError dialogError = new DialogError(this, R.string.error_loading, R.string.spotify_connection_error);
        dialogError.setOnDismissListener(new C14360e(this));
        dialogError.show();
    }

    /* renamed from: a */
    final /* synthetic */ void m68647a(DialogInterface dialogInterface) {
        onBackPressed();
    }

    public void finishWithResultCode() {
        setResult(-1, new Intent());
        finish();
    }

    public ProfileComponent provideComponent() {
        return this.f59973b;
    }
}
