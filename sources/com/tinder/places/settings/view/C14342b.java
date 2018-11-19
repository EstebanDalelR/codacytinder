package com.tinder.places.settings.view;

import android.app.Dialog;
import android.content.Context;
import com.tinder.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/settings/view/PlacesDisabledThankYouDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.settings.view.b */
public final class C14342b extends Dialog {
    public C14342b(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context, R.style.DialogBinary);
        setContentView(R.layout.dialog_places_disabled_thank_you);
        context = getWindow();
        context.setLayout(-2, -2);
        context.setGravity(17);
        setCanceledOnTouchOutside(true);
    }
}
