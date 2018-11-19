package com.tinder.utils;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.User;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

@Deprecated
/* renamed from: com.tinder.utils.n */
public class C15363n {
    @NonNull
    /* renamed from: a */
    public static String[] m57670a(@Nullable User user) {
        int i = 0;
        if (user == null) {
            return new String[0];
        }
        int i2;
        String[] strArr = new String[user.getPhotos().size()];
        user = user.getPhotos();
        int size = user.size();
        int i3 = 0;
        for (i2 = 0; i2 < size; i2++) {
            ProcessedPhoto processedPhoto = ((ProfilePhoto) user.get(i2)).getProcessedPhoto(av.a());
            if (processedPhoto != null) {
                i3++;
                strArr[i2] = processedPhoto.imageUrl;
            }
        }
        user = new String[i3];
        size = strArr.length;
        i2 = 0;
        while (i < size) {
            String str = strArr[i];
            if (str != null) {
                user[i2] = str;
                i2++;
            }
            i++;
        }
        return user;
    }

    @Nullable
    /* renamed from: b */
    public static String m57672b(User user) {
        return C15363n.m57667a(user, 0);
    }

    @Nullable
    /* renamed from: a */
    public static String m57667a(User user, int i) {
        user = user.getPhotos();
        int size = user.size();
        if (size > 0 && i < size) {
            user = ((ProfilePhoto) user.get(i)).getProcessedPhoto(av.a());
            if (user != null) {
                return user.imageUrl;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Bitmap m57662a(Context context, Uri uri, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("resampled width:");
        stringBuilder.append(i);
        stringBuilder.append(", height:");
        stringBuilder.append(i2);
        ad.a(stringBuilder.toString());
        Cursor query = context.getContentResolver().query(uri, new String[]{"_data", "_display_name"}, null, null, null);
        uri = Uri.parse(C15363n.m57668a(uri.toString()));
        InputStream inputStream = null;
        if (query != null) {
            query.moveToFirst();
            int columnIndex = query.getColumnIndex("_data");
            if (!uri.toString().startsWith("content://com.google.android.gallery3d")) {
                if (!uri.toString().startsWith("content://com.google.android")) {
                    String string = query.getString(columnIndex);
                    query.close();
                    return C15363n.m57666a(string, i, i2);
                }
            }
            if (query.getColumnIndex("_display_name") == -1) {
                return null;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("uri.getPath ");
            stringBuilder.append(uri.getPath());
            ad.a(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("uri.toString() ");
            stringBuilder.append(uri.toString());
            ad.a(stringBuilder.toString());
            try {
                if (uri.toString().startsWith("content://com.google.android.gallery3d")) {
                    context = context.getContentResolver().openInputStream(uri);
                    try {
                        uri = C15363n.m57665a((InputStream) context, i, i2);
                    } catch (FileNotFoundException e) {
                        uri = e;
                        ad.a("resample bitmap file not found", uri);
                        if (context != null) {
                            return null;
                        }
                        context.close();
                        return null;
                    } catch (MalformedURLException e2) {
                        uri = e2;
                        ad.a("resample bitmap malformed URL", uri);
                        if (context != null) {
                            return null;
                        }
                        context.close();
                        return null;
                    } catch (OutOfMemoryError e3) {
                        uri = e3;
                        ad.a("resample bitmap OOM", uri);
                        if (context != null) {
                            return null;
                        }
                        context.close();
                        return null;
                    } catch (IOException e4) {
                        uri = e4;
                        try {
                            ad.a("resample bitmap open stream", uri);
                            if (context != null) {
                                return null;
                            }
                            context.close();
                            return null;
                        } catch (Throwable th) {
                            uri = th;
                            inputStream = context;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Context context2) {
                                    ad.a("getting bitmap closing input stream", context2);
                                }
                            }
                            throw uri;
                        }
                    }
                } else if (uri.toString().startsWith("content://com.google.android")) {
                    context2 = context2.getContentResolver().openInputStream(uri);
                    uri = BitmapFactory.decodeStream(context2);
                } else {
                    InputStream openStream = new URL(uri.toString()).openStream();
                    uri = C15363n.m57665a(openStream, i, i2);
                }
                Bitmap bitmap = uri;
                if (context2 == null) {
                    return bitmap;
                }
                try {
                    context2.close();
                    return bitmap;
                } catch (Context context22) {
                    ad.a("getting bitmap closing input stream", context22);
                    return bitmap;
                }
            } catch (FileNotFoundException e5) {
                uri = e5;
                context22 = null;
                ad.a("resample bitmap file not found", uri);
                if (context22 != null) {
                    return null;
                }
                context22.close();
                return null;
            } catch (MalformedURLException e6) {
                uri = e6;
                context22 = null;
                ad.a("resample bitmap malformed URL", uri);
                if (context22 != null) {
                    return null;
                }
                context22.close();
                return null;
            } catch (OutOfMemoryError e7) {
                uri = e7;
                context22 = null;
                ad.a("resample bitmap OOM", uri);
                if (context22 != null) {
                    return null;
                }
                context22.close();
                return null;
            } catch (IOException e8) {
                uri = e8;
                context22 = null;
                ad.a("resample bitmap open stream", uri);
                if (context22 != null) {
                    return null;
                }
                context22.close();
                return null;
            } catch (Throwable th2) {
                uri = th2;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw uri;
            }
        } else if (uri == null || uri.toString().length() <= null) {
            return null;
        } else {
            return C15363n.m57671b(uri.getPath(), i, i2);
        }
    }

    /* renamed from: a */
    public static Bitmap m57666a(String str, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = C15363n.m57661a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    @Nullable
    /* renamed from: b */
    public static Bitmap m57671b(@NonNull String str, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        try {
            URL url = new URL(str.substring(str.indexOf("http")));
            BitmapFactory.decodeStream(url.openConnection().getInputStream(), new Rect(), options);
            options.inSampleSize = C15363n.m57661a(options, i, i2);
            options.inJustDecodeBounds = null;
            return BitmapFactory.decodeStream(url.openConnection().getInputStream(), new Rect(), options);
        } catch (String str2) {
            ad.a(str2.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static Bitmap m57665a(InputStream inputStream, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, new Rect(), options);
        options.inSampleSize = C15363n.m57661a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, new Rect(), options);
    }

    /* renamed from: a */
    private static int m57661a(@NonNull Options options, int i, int i2) {
        int i3 = options.outHeight;
        options = options.outWidth;
        int i4 = 1;
        if (i3 > i2 || options > i) {
            i3 /= 2;
            options /= 2;
            while (i3 / i4 > i2 && options / i4 > i) {
                i4 *= 2;
            }
        }
        return i4;
    }

    @NonNull
    /* renamed from: a */
    private static String m57668a(@NonNull String str) {
        return (TextUtils.isEmpty(str) || !str.startsWith("content://com.android.gallery3d.provider")) ? str : str.replace("content://com.android.gallery3d", "content://com.google.android.gallery3d");
    }

    /* renamed from: a */
    public static boolean m57669a(@NonNull Bitmap... bitmapArr) {
        boolean z = true;
        for (Bitmap bitmap : bitmapArr) {
            z = (!z || bitmap == null || bitmap.isRecycled()) ? false : true;
        }
        return z;
    }

    /* renamed from: a */
    public static Bitmap m57664a(Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        i = (float) i;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, i, i, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m57663a(@NonNull Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
