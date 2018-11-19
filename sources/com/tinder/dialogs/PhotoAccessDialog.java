package com.tinder.dialogs;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.content.C0432b;
import android.support.v7.app.AppCompatDialog;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;

public final class PhotoAccessDialog extends AppCompatDialog {
    @Nullable
    /* renamed from: a */
    private final OnOkayButtonClickedListener f41803a;
    @BindView(2131363185)
    ImageView mImage;
    @BindView(2131363186)
    TextView mSubtitle;
    @BindView(2131363187)
    TextView mTitle;

    public interface OnOkayButtonClickedListener {
        void onOkayButtonClicked();
    }

    /* renamed from: com.tinder.dialogs.PhotoAccessDialog$a */
    public static class C8849a {
        /* renamed from: a */
        private final Context f30993a;
        /* renamed from: b */
        private int f30994b = R.string.photo_access;
        /* renamed from: c */
        private int f30995c = R.string.photo_runtime_permission_prompt;
        /* renamed from: d */
        private int f30996d;
        /* renamed from: e */
        private OnOkayButtonClickedListener f30997e;

        public C8849a(@NonNull Context context) {
            this.f30993a = context;
        }

        /* renamed from: a */
        public C8849a m37620a(@StringRes int i) {
            this.f30995c = i;
            return this;
        }

        /* renamed from: b */
        public C8849a m37623b(@DrawableRes int i) {
            this.f30996d = i;
            return this;
        }

        /* renamed from: a */
        public C8849a m37621a(@Nullable OnOkayButtonClickedListener onOkayButtonClickedListener) {
            this.f30997e = onOkayButtonClickedListener;
            return this;
        }

        /* renamed from: a */
        public PhotoAccessDialog m37622a() {
            return new PhotoAccessDialog(this.f30993a, this.f30994b, this.f30995c, this.f30996d, this.f30997e);
        }
    }

    private PhotoAccessDialog(@NonNull Context context, @StringRes int i, @StringRes int i2, @DrawableRes int i3, @Nullable OnOkayButtonClickedListener onOkayButtonClickedListener) {
        super(context, R.style.Theme.FloatingDialog);
        this.f41803a = onOkayButtonClickedListener;
        setContentView(R.layout.dialog_photo_access);
        ButterKnife.a(this);
        this.mTitle.setText(i);
        this.mSubtitle.setText(i2);
        if (i3 != 0) {
            this.mImage.setImageDrawable(C0432b.a(context, i3));
        } else {
            this.mImage.setVisibility(8);
        }
    }

    @OnClick({2131363184})
    void onPositiveButtonClicked() {
        if (this.f41803a != null) {
            this.f41803a.onOkayButtonClicked();
        }
        dismiss();
    }
}
