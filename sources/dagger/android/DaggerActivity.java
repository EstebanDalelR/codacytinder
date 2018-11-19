package dagger.android;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public abstract class DaggerActivity extends Activity implements HasFragmentInjector {
    protected void onCreate(@Nullable Bundle bundle) {
        C15510a.m57985a(this);
        super.onCreate(bundle);
    }
}
