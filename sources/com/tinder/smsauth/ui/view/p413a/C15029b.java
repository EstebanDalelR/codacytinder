package com.tinder.smsauth.ui.view.p413a;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"hideKeyboard", "", "Landroid/view/View;", "showKeyboard", "ui_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.ui.view.a.b */
public final class C15029b {
    /* renamed from: a */
    public static final void m56628a(@NotNull View view) {
        C2668g.b(view, "$receiver");
        view.requestFocus();
        Object systemService = view.getContext().getSystemService("input_method");
        if (!(systemService instanceof InputMethodManager)) {
            systemService = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 0);
        }
    }

    /* renamed from: b */
    public static final void m56629b(@NotNull View view) {
        C2668g.b(view, "$receiver");
        Object systemService = view.getContext().getSystemService("input_method");
        if (!(systemService instanceof InputMethodManager)) {
            systemService = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
