package com.tinder.settings.views;

import android.content.Context;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.views.CustomButton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/settings/views/AccountPausedDialog;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "listener", "Lcom/tinder/settings/views/AccountPausedDialog$PauseConfirmListener;", "(Landroid/content/Context;Lcom/tinder/settings/views/AccountPausedDialog$PauseConfirmListener;)V", "onBackPressed", "", "PauseConfirmListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AccountPausedDialog extends AppCompatDialog {
    /* renamed from: a */
    private final PauseConfirmListener f56162a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/settings/views/AccountPausedDialog$PauseConfirmListener;", "", "reactivateClicked", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface PauseConfirmListener {
        void reactivateClicked();
    }

    public void onBackPressed() {
    }

    public AccountPausedDialog(@NotNull Context context, @NotNull PauseConfirmListener pauseConfirmListener) {
        C2668g.b(context, "context");
        C2668g.b(pauseConfirmListener, "listener");
        super(context, R.style.Theme.FloatingDialog);
        this.f56162a = pauseConfirmListener;
        setContentView(R.layout.dialog_account_paused);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        ((CustomButton) findViewById(C6248a.reactivateButton)).setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.f56162a.reactivateClicked();
            }
        });
    }
}
