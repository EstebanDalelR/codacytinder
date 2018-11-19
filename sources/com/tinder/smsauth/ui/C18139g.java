package com.tinder.smsauth.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.smsauth.ui.C15008k.C15007f;
import com.tinder.smsauth.ui.view.AnimatedProgressStatusView;
import com.tinder.smsauth.ui.view.AnimatedProgressStatusView.C15009a;
import com.tinder.smsauth.ui.view.AnimatedProgressStatusView.C15009a.C16789b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/tinder/smsauth/ui/OneTimePasswordRequestFragment;", "Landroid/support/v4/app/Fragment;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "ui_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.ui.g */
public final class C18139g extends Fragment {
    /* renamed from: a */
    private HashMap f56283a;

    /* renamed from: a */
    public void m65814a() {
        if (this.f56283a != null) {
            this.f56283a.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m65814a();
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2668g.b(layoutInflater, "inflater");
        viewGroup = getActivity();
        if (viewGroup == null) {
            C2668g.a();
        }
        C2668g.a(viewGroup, "activity!!");
        layoutInflater = new AnimatedProgressStatusView((Context) viewGroup, null, 2, null);
        layoutInflater.setText(layoutInflater.getResources().getString(C15007f.sms_auth_request_in_progress));
        layoutInflater.setAnimationMode((C15009a) C16789b.f51811a);
        return (View) layoutInflater;
    }
}
