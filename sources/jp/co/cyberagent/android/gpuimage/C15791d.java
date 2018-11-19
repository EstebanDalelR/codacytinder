package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;
import android.hardware.Camera.Size;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import com.google.android.gms.gcm.Task;
import java.nio.IntBuffer;

/* renamed from: jp.co.cyberagent.android.gpuimage.d */
public class C15791d {
    /* renamed from: a */
    public static int m59792a(Bitmap bitmap, int i, boolean z) {
        int[] iArr = new int[1];
        if (i == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i);
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            iArr[0] = i;
        }
        if (z) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    /* renamed from: a */
    public static int m59795a(IntBuffer intBuffer, Size size, int i) {
        Size size2 = size;
        int i2 = i;
        int[] iArr = new int[1];
        if (i2 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glTexImage2D(3553, 0, 6408, size2.width, size2.height, 0, 6408, 5121, intBuffer);
        } else {
            GLES20.glBindTexture(3553, i2);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, size2.width, size2.height, 6408, 5121, intBuffer);
            iArr[0] = i2;
        }
        return iArr[0];
    }

    /* renamed from: a */
    public static int m59793a(String str, int i) {
        int[] iArr = new int[1];
        i = GLES20.glCreateShader(i);
        GLES20.glShaderSource(i, str);
        GLES20.glCompileShader(i);
        GLES20.glGetShaderiv(i, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Compilation\n");
        stringBuilder.append(GLES20.glGetShaderInfoLog(i));
        Log.d("Load Shader Failed", stringBuilder.toString());
        return 0;
    }

    /* renamed from: a */
    public static int m59794a(String str, String str2) {
        int[] iArr = new int[1];
        str = C15791d.m59793a(str, 35633);
        if (str == null) {
            Log.d("Load Program", "Vertex Shader Failed");
            return 0;
        }
        str2 = C15791d.m59793a(str2, 35632);
        if (str2 == null) {
            Log.d("Load Program", "Fragment Shader Failed");
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, str);
        GLES20.glAttachShader(glCreateProgram, str2);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            Log.d("Load Program", "Linking Failed");
            return 0;
        }
        GLES20.glDeleteShader(str);
        GLES20.glDeleteShader(str2);
        return glCreateProgram;
    }
}
