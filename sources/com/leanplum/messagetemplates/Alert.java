package com.leanplum.messagetemplates;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.PostponableAction;

public class Alert {
    /* renamed from: a */
    private static final String f21346a = "Alert";

    /* renamed from: com.leanplum.messagetemplates.Alert$1 */
    final class C70471 extends ActionCallback {
        C70471() {
        }

        public final boolean onResponse(final ActionContext actionContext) {
            LeanplumActivityHelper.queueActionUponActive(new PostponableAction(this) {
                /* renamed from: b */
                private /* synthetic */ C70471 f25648b;

                /* renamed from: com.leanplum.messagetemplates.Alert$1$1$1 */
                final class C57371 implements OnClickListener {
                    /* renamed from: a */
                    private /* synthetic */ C70461 f21345a;

                    C57371(C70461 c70461) {
                        this.f21345a = c70461;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        actionContext.runActionNamed("Dismiss action");
                    }
                }

                public final void run() {
                    Context currentActivity = LeanplumActivityHelper.getCurrentActivity();
                    if (currentActivity != null) {
                        Builder builder = new Builder(currentActivity);
                        builder.setTitle(actionContext.stringNamed("Title")).setMessage(actionContext.stringNamed("Message")).setCancelable(false).setPositiveButton(actionContext.stringNamed("Dismiss text"), new C57371(this));
                        AlertDialog create = builder.create();
                        if (!currentActivity.isFinishing()) {
                            create.show();
                        }
                    }
                }
            });
            return true;
        }
    }

    public static void register(Context context) {
        Leanplum.defineAction(f21346a, 3, new ActionArgs().with("Title", MessageTemplates.a(context)).with("Message", "Alert message goes here.").with("Dismiss text", "OK").withAction("Dismiss action", null), new C70471());
    }
}
