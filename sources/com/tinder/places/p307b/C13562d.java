package com.tinder.places.p307b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.views.CustomTextView;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/places/dialog/PlacesConfirmationDialog;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "listener", "Lkotlin/Function1;", "", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.b.d */
public class C13562d extends AppCompatDialog {
    /* renamed from: a */
    private final Function1<Boolean, C15813i> f43296a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.b.d$a */
    static final class C10121a implements OnCancelListener {
        /* renamed from: a */
        final /* synthetic */ C13562d f33090a;

        C10121a(C13562d c13562d) {
            this.f33090a = c13562d;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f33090a.f43296a.invoke(Boolean.valueOf(false));
            this.f33090a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.b.d$b */
    static final class C10122b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C13562d f33091a;

        C10122b(C13562d c13562d) {
            this.f33091a = c13562d;
        }

        public final void onClick(View view) {
            this.f33091a.f43296a.invoke(Boolean.valueOf(false));
            this.f33091a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.b.d$c */
    static final class C10123c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C13562d f33092a;

        C10123c(C13562d c13562d) {
            this.f33092a = c13562d;
        }

        public final void onClick(View view) {
            this.f33092a.f43296a.invoke(Boolean.valueOf(true));
            this.f33092a.dismiss();
        }
    }

    public C13562d(@NotNull Context context, @NotNull Function1<? super Boolean, C15813i> function1) {
        C2668g.b(context, "context");
        C2668g.b(function1, "listener");
        super(context, R.style.Theme.FloatingDialog);
        this.f43296a = function1;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_places_confirmation);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        setOnCancelListener((OnCancelListener) new C10121a(this));
        ((CustomTextView) findViewById(C6248a.placesConfirmationDialogCancel)).setOnClickListener(new C10122b(this));
        ((CustomTextView) findViewById(C6248a.placesConfirmationDialogConfirm)).setOnClickListener(new C10123c(this));
        CustomTextView customTextView = (CustomTextView) findViewById(C6248a.placesConfirmationDialogCancel);
        C2668g.a(customTextView, "placesConfirmationDialogCancel");
        Context context = getContext();
        C2668g.a(context, "context");
        customTextView.setText(context.getResources().getString(R.string.cancel));
    }
}
