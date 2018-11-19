package com.tinder.spotify.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.sdk.android.authentication.AuthenticationClient;
import com.tinder.R;
import com.tinder.base.ActivityBase;
import com.tinder.dialogs.DialogError;
import com.tinder.managers.ManagerApp;
import com.tinder.spotify.p416b.C18157a;
import com.tinder.spotify.target.SpotifyAuthTarget;
import javax.inject.Inject;

public class SpotifyAuthActivity extends ActivityBase implements SpotifyAuthTarget {
    @Inject
    /* renamed from: a */
    C18157a f59979a;

    /* renamed from: a */
    public static Intent m68659a(Context context, int i) {
        Intent intent = new Intent(context, SpotifyAuthActivity.class);
        intent.putExtra("spotifyConnectValue", i);
        intent.addFlags(537001984);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ManagerApp.e().inject(this);
        bundle = getIntent();
        if (!(bundle == null || bundle.getExtras() == null)) {
            this.f59979a.m65861a(bundle.getIntExtra("spotifyConnectValue", 0));
        }
        AuthenticationClient.openLoginActivity(this, 1337, this.f59979a.m65865b());
    }

    protected void onStart() {
        super.onStart();
        this.f59979a.a(this);
    }

    protected void onStop() {
        super.onStop();
        this.f59979a.m65860a();
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f59979a.m65860a();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f59979a.a(this);
        this.f59979a.m65862a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f59979a.a(this);
        this.f59979a.m65863a(intent);
    }

    public void toastError() {
        DialogError dialogError = new DialogError(this, R.string.error_loading, R.string.spotify_connection_error);
        dialogError.setOnDismissListener(new C15037a(this));
        dialogError.show();
    }

    /* renamed from: a */
    final /* synthetic */ void m68660a(DialogInterface dialogInterface) {
        onBackPressed();
    }
}
