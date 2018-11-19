package com.tinder.presenters;

import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Patterns;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.tinder.interactors.C9715f;
import com.tinder.listeners.C11896b;
import com.tinder.managers.FacebookManager.ListenerFacebookEmailRequest;
import com.tinder.targets.TargetIsTweenDialog;
import com.tinder.utils.ad;
import javax.inject.Inject;

public class PresenterDialogIsTween extends PresenterBase<TargetIsTweenDialog> {
    /* renamed from: a */
    protected C11896b<Boolean> f55202a = new C177382(this);
    /* renamed from: b */
    private final C9715f f55203b;

    private class URLSpanNoUnderline extends URLSpan {
        private URLSpanNoUnderline(String str) {
            super(str);
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.tinder.presenters.PresenterDialogIsTween$1 */
    class C160461 implements ListenerFacebookEmailRequest {
        /* renamed from: a */
        final /* synthetic */ PresenterDialogIsTween f49834a;

        C160461(PresenterDialogIsTween presenterDialogIsTween) {
            this.f49834a = presenterDialogIsTween;
        }

        public void onFbEmailResponse(@Nullable String str) {
            if (this.f49834a.H() == null || TextUtils.isEmpty(str)) {
                ((TargetIsTweenDialog) this.f49834a.H()).showEmailPlaceholderFacebookLoadFail();
            } else {
                ((TargetIsTweenDialog) this.f49834a.H()).showEmailFacebookLoadSuccess(str);
            }
        }

        public void onError() {
            if (this.f49834a.H() != null) {
                ((TargetIsTweenDialog) this.f49834a.H()).showEmailPlaceholderFacebookLoadFail();
            }
        }
    }

    /* renamed from: com.tinder.presenters.PresenterDialogIsTween$2 */
    class C177382 extends C11896b<Boolean> {
        /* renamed from: a */
        final /* synthetic */ PresenterDialogIsTween f55201a;

        C177382(PresenterDialogIsTween presenterDialogIsTween) {
            this.f55201a = presenterDialogIsTween;
        }

        public /* synthetic */ void onResult(Object obj) {
            m64619a((Boolean) obj);
        }

        /* renamed from: a */
        public void m64619a(Boolean bool) {
            if (bool.booleanValue() != null) {
                if (this.f55201a.H() != null) {
                    ad.a("Successfully uploaded tween email address");
                    ((TargetIsTweenDialog) this.f55201a.H()).showToastSendEmailSuccess();
                    this.f55201a.m64624c();
                }
            }
        }

        public void onError(Throwable th) {
            ad.a("Failed to upload tween email address", th);
            if (this.f55201a.H() != null) {
                ((TargetIsTweenDialog) this.f55201a.H()).showToastSendEmailFail();
            }
        }

        public void onErrorResponse(VolleyError volleyError) {
            super.onErrorResponse(volleyError);
            if (volleyError != null && this.f55201a.H() != null) {
                if (volleyError.f2358a.f2335a == 400) {
                    ad.c("Bad email address");
                    ((TargetIsTweenDialog) this.f55201a.H()).showToastSendEmailFail();
                } else if (volleyError.f2358a.f2335a == 500) {
                    ad.c("Server error");
                    ((TargetIsTweenDialog) this.f55201a.H()).showToastSendEmailFail();
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("isTweenError: ");
                    stringBuilder.append(volleyError.getMessage());
                    ad.c(stringBuilder.toString());
                    ((TargetIsTweenDialog) this.f55201a.H()).showToastSendEmailFail();
                }
            }
        }
    }

    @Inject
    public PresenterDialogIsTween(C9715f c9715f) {
        this.f55203b = c9715f;
    }

    /* renamed from: b */
    public void m64623b() {
        this.f55203b.a(new C160461(this));
    }

    /* renamed from: a */
    public void m64620a(TextView textView) {
        Linkify.addLinks(textView, 2);
        Spannable spannable = (Spannable) textView.getText();
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new URLSpanNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        textView.setText(spannable);
    }

    /* renamed from: a */
    public void m64621a(CharSequence charSequence) {
        if (!Patterns.EMAIL_ADDRESS.matcher(charSequence).matches() || H() == null) {
            ((TargetIsTweenDialog) H()).showToastSendEmailFail();
        } else {
            m64622a(charSequence.toString());
        }
    }

    /* renamed from: a */
    public void m64622a(String str) {
        if (str == null) {
            this.f55202a.onError(new IllegalArgumentException("Null email"));
        } else {
            this.f55203b.a(str, this.f55202a);
        }
    }

    /* renamed from: c */
    public void m64624c() {
        this.f55203b.a();
        if (H() != null) {
            ((TargetIsTweenDialog) H()).dismissDialog();
        }
    }
}
