package com.tinder.smsauth.ui.view.p413a;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.Toast;
import com.tinder.smsauth.ui.C15008k.C15003b;
import com.tinder.smsauth.ui.C15008k.C15004c;
import com.tinder.smsauth.ui.view.AnimatedProgressStatusView;
import com.tinder.smsauth.ui.view.AnimatedProgressStatusView.C15009a;
import com.tinder.smsauth.ui.view.AnimatedProgressStatusView.C15009a.C16788a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"showConfirmationCheckmarkToast", "", "Landroid/content/Context;", "messageText", "", "ui_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.ui.view.a.c */
public final class C15030c {
    /* renamed from: a */
    public static final void m56630a(@NotNull Context context, @NotNull String str) {
        C2668g.b(context, "$receiver");
        C2668g.b(str, "messageText");
        Toast toast = new Toast(context.getApplicationContext());
        AnimatedProgressStatusView animatedProgressStatusView = new AnimatedProgressStatusView(context, null, 2, null);
        animatedProgressStatusView.setText(str);
        animatedProgressStatusView.setAnimationMode((C15009a) C16788a.f51810a);
        if (VERSION.SDK_INT >= 21) {
            animatedProgressStatusView.setElevation((float) animatedProgressStatusView.getResources().getDimensionPixelSize(C15003b.space_xxxxs));
        }
        animatedProgressStatusView.setBackgroundResource(C15004c.rounded_corners_white_bg);
        toast.setView(animatedProgressStatusView);
        toast.setGravity(17, 0, 0);
        toast.show();
    }
}
