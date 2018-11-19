package com.tinder.toppicks.intromodal;

import android.content.Context;
import android.support.v7.app.AppCompatDialog;
import com.tinder.toppicks.C15235b.C15233i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/toppicks/intromodal/TopPicksIntroModal;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "viewModel", "Lcom/tinder/toppicks/intromodal/TopPicksIntroModalViewModel;", "(Landroid/content/Context;Lcom/tinder/toppicks/intromodal/TopPicksIntroModalViewModel;)V", "show", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.intromodal.a */
public final class C18232a extends AppCompatDialog {
    public C18232a(@NotNull Context context, @NotNull C15274b c15274b) {
        C2668g.b(context, "context");
        C2668g.b(c15274b, "viewModel");
        super(context, C15233i.TopPicksIntroModalDialog);
        TopPicksIntroModalView topPicksIntroModalView = new TopPicksIntroModalView(context, null, 2, null);
        setContentView(topPicksIntroModalView);
        topPicksIntroModalView.m57382a(c15274b);
        topPicksIntroModalView.setOnContinueClickListener((Function0) new TopPicksIntroModal$1(this));
        getWindow().setWindowAnimations(C15233i.TopPicksIntroModalWindowAnimations);
    }

    public void show() {
        getWindow().setLayout(-1, -1);
        super.show();
    }
}
