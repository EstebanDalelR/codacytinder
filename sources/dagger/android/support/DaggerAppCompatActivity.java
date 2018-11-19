package dagger.android.support;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import dagger.android.C15510a;
import dagger.android.HasFragmentInjector;

public abstract class DaggerAppCompatActivity extends AppCompatActivity implements HasFragmentInjector, HasSupportFragmentInjector {
    protected void onCreate(@Nullable Bundle bundle) {
        C15510a.m57985a(this);
        super.onCreate(bundle);
    }
}
