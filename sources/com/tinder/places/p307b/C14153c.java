package com.tinder.places.p307b;

import android.content.Context;
import android.os.Bundle;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.views.CustomTextView;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014¨\u0006\f"}, d2 = {"Lcom/tinder/places/dialog/NoneOfTheseDialog;", "Lcom/tinder/places/dialog/PlacesConfirmationDialog;", "context", "Landroid/content/Context;", "listener", "Lkotlin/Function1;", "", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.b.c */
public final class C14153c extends C13562d {
    public C14153c(@NotNull Context context, @NotNull Function1<? super Boolean, C15813i> function1) {
        C2668g.b(context, "context");
        C2668g.b(function1, "listener");
        super(context, function1);
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getContext();
        C2668g.a(bundle, "context");
        bundle = bundle.getResources().getString(R.string.places_none_of_these_dialog_title);
        Context context = getContext();
        C2668g.a(context, "context");
        String string = context.getResources().getString(R.string.places_keep_option);
        Context context2 = getContext();
        C2668g.a(context2, "context");
        String string2 = context2.getResources().getString(R.string.places_delete_option);
        CustomTextView customTextView = (CustomTextView) findViewById(C6248a.placesConfirmationDialogTitle);
        C2668g.a(customTextView, "placesConfirmationDialogTitle");
        customTextView.setText((CharSequence) bundle);
        CustomTextView customTextView2 = (CustomTextView) findViewById(C6248a.placesConfirmationDialogConfirm);
        C2668g.a(customTextView2, "placesConfirmationDialogConfirm");
        customTextView2.setText(string2);
        customTextView2 = (CustomTextView) findViewById(C6248a.placesConfirmationDialogCancel);
        C2668g.a(customTextView2, "placesConfirmationDialogCancel");
        customTextView2.setText(string);
    }
}
