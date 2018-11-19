package com.tinder.messageads.p297d;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.tinder.messageads.p350g.C12127a;
import com.tinder.messageads.provider.C9913a;
import com.tinder.messageads.repository.C12136a;
import com.tinder.messageads.repository.MessageAdSettingsRepository;
import com.tinder.messageads.scope.MessageAdSettingsScope;
import dagger.Module;
import dagger.Provides;

@Module
/* renamed from: com.tinder.messageads.d.a */
public class C9907a {
    /* renamed from: a */
    private Context f32749a;

    public C9907a(Context context) {
        this.f32749a = context;
    }

    @Provides
    /* renamed from: a */
    MessageAdSettingsRepository m40721a(SharedPreferences sharedPreferences) {
        return new C12136a(sharedPreferences);
    }

    @Provides
    /* renamed from: a */
    SharedPreferences m40719a() {
        return PreferenceManager.getDefaultSharedPreferences(this.f32749a);
    }

    @MessageAdSettingsScope
    @Provides
    /* renamed from: a */
    C9913a m40720a(C12127a c12127a) {
        return new C9913a(c12127a);
    }
}
