package com.tinder.profile.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;
import com.tinder.views.CustomEditText;
import com.tinder.views.CustomTextView;

public class EditProfileSingleLineEntryView_ViewBinding implements Unbinder {
    /* renamed from: b */
    private EditProfileSingleLineEntryView f50234b;

    @UiThread
    public EditProfileSingleLineEntryView_ViewBinding(EditProfileSingleLineEntryView editProfileSingleLineEntryView, View view) {
        this.f50234b = editProfileSingleLineEntryView;
        editProfileSingleLineEntryView.header = (CustomTextView) C0761c.b(view, R.id.single_line_entry_title, "field 'header'", CustomTextView.class);
        editProfileSingleLineEntryView.entryField = (CustomEditText) C0761c.b(view, R.id.single_line_entry, "field 'entryField'", CustomEditText.class);
    }

    @CallSuper
    public void unbind() {
        EditProfileSingleLineEntryView editProfileSingleLineEntryView = this.f50234b;
        if (editProfileSingleLineEntryView == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f50234b = null;
        editProfileSingleLineEntryView.header = null;
        editProfileSingleLineEntryView.entryField = null;
    }
}
