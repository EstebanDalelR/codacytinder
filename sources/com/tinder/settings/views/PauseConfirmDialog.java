package com.tinder.settings.views;

import android.content.Context;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.views.CustomTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.Period;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/settings/views/PauseConfirmDialog;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "titleRes", "", "listener", "Lcom/tinder/settings/views/PauseConfirmDialog$PauseConfirmListener;", "(Landroid/content/Context;ILcom/tinder/settings/views/PauseConfirmDialog$PauseConfirmListener;)V", "onBackPressed", "", "selectRescheduleTime", "period", "Lorg/joda/time/Period;", "PauseConfirmListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PauseConfirmDialog extends AppCompatDialog {
    /* renamed from: a */
    private final int f56164a;
    /* renamed from: b */
    private final PauseConfirmListener f56165b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/settings/views/PauseConfirmDialog$PauseConfirmListener;", "", "backPressed", "", "cancelButtonClicked", "pauseSelected", "numDays", "Lorg/joda/time/Period;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface PauseConfirmListener {
        void backPressed();

        void cancelButtonClicked();

        void pauseSelected(@Nullable Period period);
    }

    public PauseConfirmDialog(@NotNull Context context, @StringRes int i, @NotNull PauseConfirmListener pauseConfirmListener) {
        C2668g.b(context, "context");
        C2668g.b(pauseConfirmListener, "listener");
        super(context, R.style.Theme.FloatingDialog);
        this.f56164a = i;
        this.f56165b = pauseConfirmListener;
        setContentView(R.layout.dialog_exit_survey_confirm_pause);
        ((CustomTextView) findViewById(C6248a.confirmTitle)).setText(this.f56164a);
        ((CustomTextView) findViewById(C6248a.tomorrowButton)).setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.m65658a(Period.c(1));
            }
        });
        ((CustomTextView) findViewById(C6248a.nextWeekButton)).setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.m65658a(Period.b(1));
            }
        });
        ((CustomTextView) findViewById(C6248a.nextMonthButton)).setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.m65658a(Period.a(1));
            }
        });
        ((CustomTextView) findViewById(C6248a.manualButton)).setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.m65658a(null);
            }
        });
        ((CustomTextView) findViewById(C6248a.cancelButton)).setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.f56165b.cancelButtonClicked();
                this.dismiss();
            }
        });
    }

    public void onBackPressed() {
        this.f56165b.backPressed();
        super.onBackPressed();
    }

    /* renamed from: a */
    private final void m65658a(Period period) {
        this.f56165b.pauseSelected(period);
        dismiss();
    }
}
