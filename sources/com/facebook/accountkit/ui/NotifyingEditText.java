package com.facebook.accountkit.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

public final class NotifyingEditText extends AppCompatEditText {
    /* renamed from: a */
    private OnKeyListener f13040a;
    /* renamed from: b */
    private PasteListener f13041b;

    public interface PasteListener {
        void onTextPaste();
    }

    /* renamed from: com.facebook.accountkit.ui.NotifyingEditText$a */
    private class C1285a extends InputConnectionWrapper {
        /* renamed from: a */
        final /* synthetic */ NotifyingEditText f3420a;

        public C1285a(NotifyingEditText notifyingEditText, InputConnection inputConnection, boolean z) {
            this.f3420a = notifyingEditText;
            super(inputConnection, z);
        }

        public boolean deleteSurroundingText(int i, int i2) {
            if (this.f3420a.f13040a != null) {
                int i3 = 0;
                boolean onKey = this.f3420a.f13040a.onKey(this.f3420a, 67, new KeyEvent(0, 67));
                if (this.f3420a.f13040a.onKey(this.f3420a, 67, new KeyEvent(1, 67)) || onKey) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    return true;
                }
            }
            return super.deleteSurroundingText(i, i2);
        }

        public boolean sendKeyEvent(KeyEvent keyEvent) {
            return ((this.f3420a.f13040a == null || !this.f3420a.f13040a.onKey(this.f3420a, keyEvent.getKeyCode(), keyEvent)) && super.sendKeyEvent(keyEvent) == null) ? null : true;
        }
    }

    public NotifyingEditText(Context context) {
        super(context);
    }

    public NotifyingEditText(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NotifyingEditText(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setOnSoftKeyListener(OnKeyListener onKeyListener) {
        this.f13040a = onKeyListener;
    }

    public boolean onTextContextMenuItem(int i) {
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322) {
            if (this.f13041b != 0) {
                this.f13041b.onTextPaste();
            }
        }
        return onTextContextMenuItem;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new C1285a(this, super.onCreateInputConnection(editorInfo), true);
    }

    public void setPasteListener(PasteListener pasteListener) {
        this.f13041b = pasteListener;
    }
}
