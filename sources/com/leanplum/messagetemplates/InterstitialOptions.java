package com.leanplum.messagetemplates;

import android.content.Context;
import android.graphics.Bitmap;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;

public class InterstitialOptions extends BaseMessageOptions {
    public /* bridge */ /* synthetic */ void accept() {
        super.accept();
    }

    public /* bridge */ /* synthetic */ int getAcceptButtonBackgroundColor() {
        return super.getAcceptButtonBackgroundColor();
    }

    public /* bridge */ /* synthetic */ String getAcceptButtonText() {
        return super.getAcceptButtonText();
    }

    public /* bridge */ /* synthetic */ int getAcceptButtonTextColor() {
        return super.getAcceptButtonTextColor();
    }

    public /* bridge */ /* synthetic */ int getBackgroundColor() {
        return super.getBackgroundColor();
    }

    public /* bridge */ /* synthetic */ Bitmap getBackgroundImage() {
        return super.getBackgroundImage();
    }

    public /* bridge */ /* synthetic */ Bitmap getBackgroundImageRounded(int i) {
        return super.getBackgroundImageRounded(i);
    }

    public /* bridge */ /* synthetic */ int getMessageColor() {
        return super.getMessageColor();
    }

    public /* bridge */ /* synthetic */ String getMessageText() {
        return super.getMessageText();
    }

    public /* bridge */ /* synthetic */ String getTitle() {
        return super.getTitle();
    }

    public /* bridge */ /* synthetic */ int getTitleColor() {
        return super.getTitleColor();
    }

    public InterstitialOptions(ActionContext actionContext) {
        super(actionContext);
    }

    public static ActionArgs toArgs(Context context) {
        return BaseMessageOptions.toArgs(context).with("Message.Text", "Interstitial message goes here.");
    }
}
