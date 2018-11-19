package com.tinder.tinderselect;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import com.tinder.R;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/tinder/tinderselect/SelectNominationSplashActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "hideActionBar", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SelectNominationSplashActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_select_nom_splash);
        m68612a();
    }

    /* renamed from: a */
    public final void m68612a() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
    }
}
