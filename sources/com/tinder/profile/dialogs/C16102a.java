package com.tinder.profile.dialogs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.tinder.R;
import com.tinder.dialogs.C8858i;

/* renamed from: com.tinder.profile.dialogs.a */
public class C16102a extends C8858i {
    public C16102a(@NonNull Context context) {
        super(context, 0, R.string.instagram_account_in_use_title, R.string.instagram_account_in_use_body);
        a(R.string.ok, new C14401b(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m60921a(View view) {
        dismiss();
    }
}
