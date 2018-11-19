package com.leanplum.messagetemplates;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Log;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.utils.BitmapUtil;
import java.io.InputStream;

abstract class BaseMessageOptions {
    private int acceptButtonBackgroundColor;
    private String acceptButtonText;
    private int acceptButtonTextColor;
    private int backgroundColor;
    private Bitmap backgroundImage;
    private ActionContext context;
    private int messageColor;
    private String messageText;
    private String title;
    private int titleColor;

    protected BaseMessageOptions(ActionContext actionContext) {
        this.context = actionContext;
        setTitle(actionContext.stringNamed("Title.Text"));
        setTitleColor(actionContext.numberNamed("Title.Color").intValue());
        setMessageText(actionContext.stringNamed("Message.Text"));
        setMessageColor(actionContext.numberNamed("Message.Color").intValue());
        InputStream streamNamed = actionContext.streamNamed("Background image");
        if (streamNamed != null) {
            try {
                setBackgroundImage(BitmapFactory.decodeStream(streamNamed));
            } catch (Throwable th) {
                Log.e("Leanplum", "Error loading background image", th);
            }
        }
        setBackgroundColor(actionContext.numberNamed("Background color").intValue());
        setAcceptButtonText(actionContext.stringNamed("Accept button.Text"));
        setAcceptButtonBackgroundColor(actionContext.numberNamed("Accept button.Background color").intValue());
        setAcceptButtonTextColor(actionContext.numberNamed("Accept button.Text color").intValue());
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    private void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public String getAcceptButtonText() {
        return this.acceptButtonText;
    }

    private void setAcceptButtonText(String str) {
        this.acceptButtonText = str;
    }

    public String getTitle() {
        return this.title;
    }

    private void setTitle(String str) {
        this.title = str;
    }

    public int getTitleColor() {
        return this.titleColor;
    }

    private void setTitleColor(int i) {
        this.titleColor = i;
    }

    public String getMessageText() {
        return this.messageText;
    }

    private void setMessageText(String str) {
        this.messageText = str;
    }

    public int getMessageColor() {
        return this.messageColor;
    }

    private void setMessageColor(int i) {
        this.messageColor = i;
    }

    public Bitmap getBackgroundImage() {
        return this.backgroundImage;
    }

    public Bitmap getBackgroundImageRounded(int i) {
        return BitmapUtil.getRoundedCornerBitmap(this.backgroundImage, i);
    }

    private void setBackgroundImage(Bitmap bitmap) {
        this.backgroundImage = bitmap;
    }

    public int getAcceptButtonBackgroundColor() {
        return this.acceptButtonBackgroundColor;
    }

    private void setAcceptButtonBackgroundColor(int i) {
        this.acceptButtonBackgroundColor = i;
    }

    public int getAcceptButtonTextColor() {
        return this.acceptButtonTextColor;
    }

    private void setAcceptButtonTextColor(int i) {
        this.acceptButtonTextColor = i;
    }

    public void accept() {
        this.context.runTrackedActionNamed("Accept action");
    }

    public static ActionArgs toArgs(Context context) {
        return new ActionArgs().with("Title.Text", MessageTemplates.a(context)).withColor("Title.Color", -16777216).with("Message.Text", "Popup message goes here.").withColor("Message.Color", -16777216).withFile("Background image", null).withColor("Background color", -1).with("Accept button.Text", "OK").withColor("Accept button.Background color", -1).withColor("Accept button.Text color", Color.argb(255, 0, 122, 255)).withAction("Accept action", null);
    }
}
