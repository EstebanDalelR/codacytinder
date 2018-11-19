package com.tinder.profile.view;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.content.C0432b;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.views.CustomEditText;
import com.tinder.views.CustomTextView;

public class EditProfileSingleLineEntryView extends LinearLayout {
    @BindView(2131363580)
    CustomEditText entryField;
    @BindView(2131363581)
    CustomTextView header;

    public EditProfileSingleLineEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        inflate(context, R.layout.edit_profile_single_line_entry_view, this);
        ButterKnife.a(this);
        m55150a(context, attributeSet);
    }

    /* renamed from: a */
    private void m55150a(Context context, AttributeSet attributeSet) {
        attributeSet = context.obtainStyledAttributes(attributeSet, C6249b.EditProfileSingleLineEntryView);
        try {
            setTitle(attributeSet.getString(2));
            setTitleTextColor(attributeSet.getColor(3, C0432b.c(context, R.color.text_very_dark)));
            setText(attributeSet.getString(5));
            setTextColor(attributeSet.getColor(6, C0432b.c(context, R.color.z_profile_body_text)));
            CharSequence string = attributeSet.getString(4);
            if (!TextUtils.isEmpty(string)) {
                setHint(string);
            }
            context = attributeSet.getBoolean(1, false);
            setEditable(context);
            this.entryField.setInputType(attributeSet.getInt(0, context != null ? 40960 : 524288));
        } finally {
            attributeSet.recycle();
        }
    }

    public void setEditable(boolean z) {
        this.entryField.setFocusable(z);
        this.entryField.setCursorVisible(z);
    }

    public void setTitle(@StringRes int i) {
        this.header.setText(i);
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.header.setText(charSequence);
    }

    public void setTitleTextColor(@ColorInt int i) {
        this.header.setTextColor(i);
    }

    public void setText(@StringRes int i) {
        this.entryField.setText(i);
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.entryField.setText(charSequence);
    }

    public void setTextColor(@ColorInt int i) {
        this.entryField.setTextColor(i);
    }

    public void setHint(@StringRes int i) {
        this.entryField.setHint(i);
    }

    public void setHint(@NonNull CharSequence charSequence) {
        this.entryField.setHint(charSequence);
    }

    public void setEntryFieldClickListener(@Nullable OnClickListener onClickListener) {
        this.entryField.setOnClickListener(onClickListener);
    }

    public void setFieldFilter(@NonNull InputFilter[] inputFilterArr) {
        this.entryField.setFilters(inputFilterArr);
    }

    @NonNull
    public String getText() {
        return this.entryField.getText().toString();
    }
}
