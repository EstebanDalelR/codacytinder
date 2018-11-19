package com.facebook.accountkit.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class AccountKitEmailRedirectActivity extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = new Intent(this, AccountKitActivity.class);
        bundle.putExtra("url", getIntent().getDataString());
        bundle.addFlags(335544320);
        startActivity(bundle);
    }
}
