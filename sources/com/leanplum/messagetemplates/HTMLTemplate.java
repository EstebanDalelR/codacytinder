package com.leanplum.messagetemplates;

import android.app.Activity;
import android.graphics.Point;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.MotionEvent;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.PostponableAction;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.leanplum.utils.SizeUtil;

public class HTMLTemplate extends BaseMessageDialog {
    /* renamed from: a */
    private static final String f25658a = "HTML";

    /* renamed from: com.leanplum.messagetemplates.HTMLTemplate$1 */
    final class C70531 extends ActionCallback {
        C70531() {
        }

        public final boolean onResponse(final ActionContext actionContext) {
            Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new VariablesChangedCallback(this) {
                /* renamed from: b */
                private /* synthetic */ C70531 f25657b;

                /* renamed from: com.leanplum.messagetemplates.HTMLTemplate$1$1$1 */
                final class C70511 extends PostponableAction {
                    /* renamed from: a */
                    private /* synthetic */ C70521 f25655a;

                    C70511(C70521 c70521) {
                        this.f25655a = c70521;
                    }

                    public final void run() {
                        try {
                            C5748a c5748a = new C5748a(actionContext);
                            if (c5748a.m25261g() != null) {
                                Activity currentActivity = LeanplumActivityHelper.getCurrentActivity();
                                if (!(currentActivity == null || currentActivity.isFinishing())) {
                                    HTMLTemplate hTMLTemplate = new HTMLTemplate(currentActivity, c5748a);
                                }
                            }
                        } catch (Throwable th) {
                            Log.e("Leanplum", "Fail on show HTML In-App message.", th);
                        }
                    }
                }

                public final void variablesChanged() {
                    LeanplumActivityHelper.queueActionUponActive(new C70511(this));
                }
            });
            return true;
        }
    }

    public HTMLTemplate(Activity activity, C5748a c5748a) {
        super(activity, c5748a.m25255a(), null, null, c5748a);
        this.htmlOptions$6b189a4a = c5748a;
    }

    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!this.htmlOptions$6b189a4a.m25255a()) {
            int i;
            Point displaySize = SizeUtil.getDisplaySize(this.activity);
            int width = this.webView.getWidth();
            int i2 = (displaySize.x - width) / 2;
            int i3 = (displaySize.x + width) / 2;
            width = SizeUtil.dpToPx(Leanplum.getContext(), this.htmlOptions$6b189a4a.m25256b());
            int statusBarHeight = SizeUtil.getStatusBarHeight(Leanplum.getContext());
            int a = this.htmlOptions$6b189a4a.m25254a(this.activity);
            int i4;
            if ("Bottom".equals(this.htmlOptions$6b189a4a.m25259e())) {
                i = ((displaySize.y - width) - statusBarHeight) - a;
                i4 = (displaySize.y - a) - statusBarHeight;
            } else {
                i = a + statusBarHeight;
                i4 = (width + statusBarHeight) + a;
            }
            if (motionEvent.getY() < ((float) i) || motionEvent.getY() > ((float) r0) || motionEvent.getX() < ((float) i2) || motionEvent.getX() > ((float) i3)) {
                if (this.htmlOptions$6b189a4a.m25258d()) {
                    cancel();
                }
                this.activity.dispatchTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static void register() {
        Leanplum.defineAction(f25658a, 3, new ActionArgs().with("Close URL", "http://leanplum:close").with("Open URL", "http://leanplum:loadFinished").with("Action URL", "http://leanplum:runAction").with("Track Action URL", "http://leanplum:runTrackedAction").with("Track URL", "http://leanplum:track").with("HTML Align", "Top").with("HTML Height", Integer.valueOf(0)), new C70531());
    }
}
