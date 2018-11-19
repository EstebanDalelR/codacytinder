package com.facebook.share.internal;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.C1674d;
import com.facebook.common.C1672a.C1667b;
import com.facebook.common.C1672a.C1670e;
import com.facebook.common.C1672a.C1671f;

@Deprecated
/* renamed from: com.facebook.share.internal.b */
public class C3459b extends C1674d {
    protected int getDefaultRequestCode() {
        return 0;
    }

    @Deprecated
    public void setSelected(boolean z) {
        super.setSelected(z);
        m13176a();
    }

    /* renamed from: a */
    protected void mo1875a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo1875a(context, attributeSet, i, i2);
        m13176a();
    }

    protected int getDefaultStyleResource() {
        return C1671f.com_facebook_button_like;
    }

    /* renamed from: a */
    private void m13176a() {
        if (isSelected()) {
            setCompoundDrawablesWithIntrinsicBounds(C1667b.com_facebook_button_like_icon_selected, 0, 0, 0);
            setText(getResources().getString(C1670e.com_facebook_like_button_liked));
            return;
        }
        setCompoundDrawablesWithIntrinsicBounds(C1667b.com_facebook_button_icon, 0, 0, 0);
        setText(getResources().getString(C1670e.com_facebook_like_button_not_liked));
    }
}
