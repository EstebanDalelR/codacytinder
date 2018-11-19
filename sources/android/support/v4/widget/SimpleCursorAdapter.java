package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SimpleCursorAdapter extends C4039m {
    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    protected int[] f14146a;
    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: b */
    protected int[] f14147b;
    /* renamed from: c */
    String[] f14148c;
    /* renamed from: d */
    private int f14149d;
    /* renamed from: e */
    private CursorToStringConverter f14150e;
    /* renamed from: f */
    private ViewBinder f14151f;

    public interface CursorToStringConverter {
        CharSequence convertToString(Cursor cursor);
    }

    public interface ViewBinder {
        boolean setViewValue(View view, Cursor cursor, int i);
    }

    public void bindView(View view, Context context, Cursor cursor) {
        context = this.f14151f;
        int length = this.f14147b.length;
        int[] iArr = this.f14146a;
        int[] iArr2 = this.f14147b;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr2[i]);
            if (findViewById != null) {
                if (context != null ? context.setViewValue(findViewById, cursor, iArr[i]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        m17490a((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        m17489a((ImageView) findViewById, string);
                    } else {
                        context = new StringBuilder();
                        context.append(findViewById.getClass().getName());
                        context.append(" is not a ");
                        context.append(" view that can be bounds by this SimpleCursorAdapter");
                        throw new IllegalStateException(context.toString());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m17489a(android.widget.ImageView r2, java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x0008 }
        r2.setImageResource(r0);	 Catch:{ NumberFormatException -> 0x0008 }
        goto L_0x000f;
    L_0x0008:
        r3 = android.net.Uri.parse(r3);
        r2.setImageURI(r3);
    L_0x000f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SimpleCursorAdapter.a(android.widget.ImageView, java.lang.String):void");
    }

    /* renamed from: a */
    public void m17490a(TextView textView, String str) {
        textView.setText(str);
    }

    public CharSequence convertToString(Cursor cursor) {
        if (this.f14150e != null) {
            return this.f14150e.convertToString(cursor);
        }
        if (this.f14149d > -1) {
            return cursor.getString(this.f14149d);
        }
        return super.convertToString(cursor);
    }

    /* renamed from: a */
    private void m17488a(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            if (this.f14146a == null || this.f14146a.length != length) {
                this.f14146a = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.f14146a[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.f14146a = null;
    }

    public Cursor swapCursor(Cursor cursor) {
        m17488a(cursor, this.f14148c);
        return super.swapCursor(cursor);
    }
}
