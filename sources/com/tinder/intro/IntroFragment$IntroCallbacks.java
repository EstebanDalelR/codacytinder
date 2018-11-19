package com.tinder.intro;

import android.content.Intent;
import com.tinder.base.text.PrivacyLinkMovementMethod$OnLinksClickedListener;
import com.tinder.fragments.as;
import com.tinder.smsauth.sdk.C14987c;

public interface IntroFragment$IntroCallbacks extends PrivacyLinkMovementMethod$OnLinksClickedListener {
    void onShowWebViewFragment(as asVar);

    void onStartAccountKitActivityForResult(Intent intent);

    void onStartSmsAuthActivityForResult(C14987c c14987c);
}
