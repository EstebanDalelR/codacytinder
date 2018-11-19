package com.tinder.utils;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.support.annotation.NonNull;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.GalleryItem;
import com.tinder.model.GalleryItem.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Deprecated
/* renamed from: com.tinder.utils.u */
public class C15370u {
    /* renamed from: a */
    public static String m57685a(Context context, Uri uri) {
        context = context.getContentResolver().query(uri, null, null, null, null);
        if (context != null) {
            if (context.getColumnIndex("_data") != -1) {
                context.moveToFirst();
                uri = context.getString(context.getColumnIndex("_data"));
                context.close();
                return uri;
            }
        }
        return uri.getPath();
    }

    /* renamed from: a */
    public static GalleryItem m57683a(Context context) {
        Cursor query = context.getContentResolver().query(Media.EXTERNAL_CONTENT_URI, new String[]{ManagerWebServices.PARAM_ID_UNDERSCORE, "_data", "bucket_display_name", "datetaken", "mime_type"}, null, null, "datetaken DESC");
        if (query == null || !query.moveToFirst()) {
            return null;
        }
        String string = query.getString(1);
        GalleryItem galleryItem = new GalleryItem();
        galleryItem.name = context.getString(R.string.photo_camera_gallery_title);
        galleryItem.filePath = string;
        galleryItem.count = query.getCount();
        galleryItem.source = Source.Device;
        return galleryItem;
    }

    /* renamed from: a */
    public static String m57684a(Context context, @NonNull Bitmap bitmap, String str) {
        try {
            context = context.getCacheDir();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(".jpeg");
            File file = new File(context, stringBuilder.toString());
            context = new FileOutputStream(file);
            try {
                str = new StringBuilder();
                str.append("Out file: ");
                str.append(file.toString());
                ad.a(str.toString());
                bitmap.compress(CompressFormat.JPEG, 100, context);
                context.flush();
                context.close();
                bitmap = file.getPath();
                if (context != null) {
                    try {
                        context.close();
                    } catch (Context context2) {
                        ad.a("closing fileOutputStream", context2);
                    }
                }
                return bitmap;
            } catch (FileNotFoundException e) {
                bitmap = e;
                ad.a("storing temp bitmap", bitmap);
                if (context2 != null) {
                    context2.close();
                }
                return null;
            } catch (IOException e2) {
                bitmap = e2;
                try {
                    ad.a("closing fileOutputStream", bitmap);
                    if (context2 != null) {
                        try {
                            context2.close();
                        } catch (Context context22) {
                            ad.a("closing fileOutputStream", context22);
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    bitmap = th;
                    if (context22 != null) {
                        try {
                            context22.close();
                        } catch (Context context222) {
                            ad.a("closing fileOutputStream", context222);
                        }
                    }
                    throw bitmap;
                }
            }
        } catch (FileNotFoundException e3) {
            bitmap = e3;
            context222 = null;
            ad.a("storing temp bitmap", bitmap);
            if (context222 != null) {
                context222.close();
            }
            return null;
        } catch (IOException e4) {
            bitmap = e4;
            context222 = null;
            ad.a("closing fileOutputStream", bitmap);
            if (context222 != null) {
                context222.close();
            }
            return null;
        } catch (Throwable th2) {
            bitmap = th2;
            context222 = null;
            if (context222 != null) {
                context222.close();
            }
            throw bitmap;
        }
    }

    /* renamed from: a */
    public static int m57682a(String str) {
        try {
            str = new ExifInterface(new File(str).getAbsolutePath()).getAttributeInt("Orientation", 1);
            if (str == 3) {
                return 180;
            }
            if (str == 6) {
                return 90;
            }
            if (str != 8) {
                return 0;
            }
            return 270;
        } catch (String str2) {
            ad.a("get image orientation", str2);
            return 0;
        }
    }
}
