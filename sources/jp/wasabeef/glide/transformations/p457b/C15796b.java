package jp.wasabeef.glide.transformations.p457b;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Allocation.MipmapControl;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.RenderScript.RSMessageHandler;
import android.renderscript.ScriptIntrinsicBlur;

/* renamed from: jp.wasabeef.glide.transformations.b.b */
public class C15796b {
    @TargetApi(18)
    /* renamed from: a */
    public static Bitmap m59802a(Context context, Bitmap bitmap, int i) throws RSRuntimeException {
        Allocation createFromBitmap;
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        Allocation createTyped;
        Allocation allocation = null;
        try {
            context = RenderScript.create(context);
            try {
                context.setMessageHandler(new RSMessageHandler());
                createFromBitmap = Allocation.createFromBitmap(context, bitmap, MipmapControl.MIPMAP_NONE, 1);
            } catch (Throwable th) {
                bitmap = th;
                createFromBitmap = null;
                scriptIntrinsicBlur = createFromBitmap;
                if (context != null) {
                    context.destroy();
                }
                if (createFromBitmap != null) {
                    createFromBitmap.destroy();
                }
                if (allocation != null) {
                    allocation.destroy();
                }
                if (scriptIntrinsicBlur != null) {
                    scriptIntrinsicBlur.destroy();
                }
                throw bitmap;
            }
            try {
                createTyped = Allocation.createTyped(context, createFromBitmap.getType());
            } catch (Throwable th2) {
                bitmap = th2;
                scriptIntrinsicBlur = null;
                if (context != null) {
                    context.destroy();
                }
                if (createFromBitmap != null) {
                    createFromBitmap.destroy();
                }
                if (allocation != null) {
                    allocation.destroy();
                }
                if (scriptIntrinsicBlur != null) {
                    scriptIntrinsicBlur.destroy();
                }
                throw bitmap;
            }
            try {
                scriptIntrinsicBlur = ScriptIntrinsicBlur.create(context, Element.U8_4(context));
            } catch (Throwable th3) {
                bitmap = th3;
                scriptIntrinsicBlur = null;
                allocation = createTyped;
                if (context != null) {
                    context.destroy();
                }
                if (createFromBitmap != null) {
                    createFromBitmap.destroy();
                }
                if (allocation != null) {
                    allocation.destroy();
                }
                if (scriptIntrinsicBlur != null) {
                    scriptIntrinsicBlur.destroy();
                }
                throw bitmap;
            }
            try {
                scriptIntrinsicBlur.setInput(createFromBitmap);
                scriptIntrinsicBlur.setRadius((float) i);
                scriptIntrinsicBlur.forEach(createTyped);
                createTyped.copyTo(bitmap);
                if (context != null) {
                    context.destroy();
                }
                if (createFromBitmap != null) {
                    createFromBitmap.destroy();
                }
                if (createTyped != null) {
                    createTyped.destroy();
                }
                if (scriptIntrinsicBlur != null) {
                    scriptIntrinsicBlur.destroy();
                }
                return bitmap;
            } catch (Throwable th4) {
                bitmap = th4;
                allocation = createTyped;
                if (context != null) {
                    context.destroy();
                }
                if (createFromBitmap != null) {
                    createFromBitmap.destroy();
                }
                if (allocation != null) {
                    allocation.destroy();
                }
                if (scriptIntrinsicBlur != null) {
                    scriptIntrinsicBlur.destroy();
                }
                throw bitmap;
            }
        } catch (Throwable th5) {
            bitmap = th5;
            context = null;
            createFromBitmap = context;
            scriptIntrinsicBlur = createFromBitmap;
            if (context != null) {
                context.destroy();
            }
            if (createFromBitmap != null) {
                createFromBitmap.destroy();
            }
            if (allocation != null) {
                allocation.destroy();
            }
            if (scriptIntrinsicBlur != null) {
                scriptIntrinsicBlur.destroy();
            }
            throw bitmap;
        }
    }
}
