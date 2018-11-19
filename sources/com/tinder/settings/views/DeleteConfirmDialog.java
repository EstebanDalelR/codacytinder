package com.tinder.settings.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;

public class DeleteConfirmDialog extends AppCompatDialog {
    @Nullable
    /* renamed from: a */
    private DeleteConfirmListener f56163a;
    @BindView(2131362028)
    View cancelButton;
    @BindView(2131362292)
    View deleteButton;
    @BindView(2131362671)
    View hideButton;
    @BindView(2131362190)
    TextView titleText;

    public interface DeleteConfirmListener {
        void backPressed();

        void cancelButtonClicked();

        void deleteMyAccountClicked();

        void hideMyAccountClicked();
    }

    public enum Type {
        MET_SOMEONE(R.string.congratulations),
        FEEDBACK(R.string.exit_survey_thanks_for_feedback_delete),
        OTHER(R.string.exit_survey_are_you_sure);
        
        @StringRes
        private final int titleText;

        private Type(int i) {
            this.titleText = i;
        }
    }

    public DeleteConfirmDialog(@NonNull Context context, @NonNull Type type) {
        super(context, R.style.Theme.FloatingDialog);
        setContentView(R.layout.dialog_exit_survey_confirm_delete);
        ButterKnife.a(this);
        this.titleText.setText(type.titleText);
    }

    @OnClick({2131362028, 2131362671, 2131362292})
    public void buttonClicked(View view) {
        if (this.f56163a != null) {
            if (view == this.hideButton) {
                this.f56163a.hideMyAccountClicked();
            } else if (view == this.deleteButton) {
                this.f56163a.deleteMyAccountClicked();
            } else if (view == this.cancelButton) {
                this.f56163a.cancelButtonClicked();
            }
        }
        dismiss();
    }

    public void onBackPressed() {
        this.f56163a.backPressed();
        super.onBackPressed();
    }

    /* renamed from: a */
    public void m65655a(@Nullable DeleteConfirmListener deleteConfirmListener) {
        this.f56163a = deleteConfirmListener;
    }
}
