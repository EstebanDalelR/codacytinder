package com.tinder.settingsemail.email.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup.LayoutParams;
import com.tinder.settingsemail.C14921a.C14915a;
import com.tinder.settingsemail.email.component.C16703a;
import com.tinder.settingsemail.email.component.EmailSettingsComponent$EmailSettingsComponentParentProvider;
import com.tinder.settingsemail.email.view.C16708a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, d2 = {"Lcom/tinder/settingsemail/email/activity/EmailSettingsActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "finish", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "settings-email_release"}, k = 1, mv = {1, 1, 10})
public final class EmailSettingsActivity extends AppCompatActivity {
    /* renamed from: a */
    public static final C14923a f59934a = new C14923a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/settingsemail/email/activity/EmailSettingsActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settingsemail.email.activity.EmailSettingsActivity$a */
    public static final class C14923a {
        private C14923a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final Intent m56387a(@NotNull Context context) {
            C2668g.b(context, "context");
            return new Intent(context, EmailSettingsActivity.class);
        }
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getApplicationContext();
        if (bundle == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.settingsemail.email.component.EmailSettingsComponent.EmailSettingsComponentParentProvider");
        }
        Context context = this;
        setContentView(new C16708a(context, C16703a.m62205a().activity(this).parent(((EmailSettingsComponent$EmailSettingsComponentParentProvider) bundle).getEmailSettingsParentComponent()).build()), new LayoutParams(-1, -1));
        overridePendingTransition(C14915a.enter_right_to_left, C14915a.enter_left_to_right);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C14915a.exit_left_to_right, C14915a.exit_right_to_left);
    }
}
