package com.tinder.webprofile.p451b;

import android.content.Context;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tinder.webprofile.C15478a.C15474d;
import com.tinder.webprofile.C15478a.C15475e;
import com.tinder.webprofile.C15478a.C15477g;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/webprofile/view/DeleteUsernameDialog;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "onConfirmClick", "Lkotlin/Function0;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "negativeButton", "Landroid/widget/TextView;", "positiveButton", "webprofile_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.webprofile.b.a */
public final class C18309a extends AppCompatDialog {
    /* renamed from: a */
    private final TextView f56691a;
    /* renamed from: b */
    private final TextView f56692b;

    public C18309a(@NotNull Context context, @NotNull final Function0<C15813i> function0) {
        C2668g.b(context, "context");
        C2668g.b(function0, "onConfirmClick");
        super(context, C15477g.DialogStandard);
        setContentView(C15475e.delete_username_dialog);
        setCanceledOnTouchOutside(true);
        context = findViewById(C15474d.negative_button);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f56691a = (TextView) context;
        context = findViewById(C15474d.positive_button);
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f56692b = (TextView) context;
        this.f56691a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                this.dismiss();
            }
        });
        this.f56692b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                function0.invoke();
                this.dismiss();
            }
        });
    }
}
