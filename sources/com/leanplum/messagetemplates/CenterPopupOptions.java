package com.leanplum.messagetemplates;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class CenterPopupOptions extends BaseMessageOptions {
    /* renamed from: a */
    private int f25653a;
    /* renamed from: b */
    private int f25654b;

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

    public CenterPopupOptions(ActionContext actionContext) {
        super(actionContext);
        this.f25653a = actionContext.numberNamed("Layout.Width").intValue();
        this.f25654b = actionContext.numberNamed("Layout.Height").intValue();
    }

    public int getWidth() {
        return this.f25653a;
    }

    /* renamed from: a */
    private void m30613a(int i) {
        this.f25653a = i;
    }

    public int getHeight() {
        return this.f25654b;
    }

    /* renamed from: b */
    private void m30614b(int i) {
        this.f25654b = i;
    }

    public static ActionArgs toArgs(Context context) {
        return BaseMessageOptions.toArgs(context).with("Layout.Width", Integer.valueOf(MapboxConstants.ANIMATION_DURATION)).with("Layout.Height", Integer.valueOf(Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
    }
}
