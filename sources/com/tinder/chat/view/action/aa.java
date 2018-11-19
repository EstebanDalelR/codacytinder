package com.tinder.chat.view.action;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.utils.at;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/chat/view/action/MessageTextCopyToClipboardAction;", "", "activityContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "copyToClipboard", "", "text", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class aa {
    /* renamed from: a */
    private final Context f30116a;

    @Inject
    public aa(@NotNull Context context) {
        C2668g.b(context, "activityContext");
        this.f30116a = context;
    }

    /* renamed from: a */
    public final void m36197a(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        Object systemService = this.f30116a.getSystemService("clipboard");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
        CharSequence charSequence = str;
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(charSequence, charSequence));
        str = at.f47621a;
        Context context = this.f30116a;
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        str.b((Activity) context, R.string.copied);
    }
}
