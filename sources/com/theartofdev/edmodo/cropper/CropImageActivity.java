package com.theartofdev.edmodo.cropper;

import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import com.theartofdev.edmodo.cropper.C6148f.C6143b;
import com.theartofdev.edmodo.cropper.C6148f.C6144c;
import com.theartofdev.edmodo.cropper.C6148f.C6146e;
import com.theartofdev.edmodo.cropper.CropImage.ActivityResult;
import com.theartofdev.edmodo.cropper.CropImageView.C6129a;
import com.theartofdev.edmodo.cropper.CropImageView.OnCropImageCompleteListener;
import com.theartofdev.edmodo.cropper.CropImageView.OnSetImageUriCompleteListener;
import java.io.File;

public class CropImageActivity extends AppCompatActivity implements OnCropImageCompleteListener, OnSetImageUriCompleteListener {
    /* renamed from: a */
    private CropImageView f29414a;
    /* renamed from: b */
    private CropImageOptions f29415b;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6144c.crop_image_activity);
        this.f29414a = (CropImageView) findViewById(C6143b.cropImageView);
        Intent intent = getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("CROP_IMAGE_EXTRA_SOURCE");
        this.f29415b = (CropImageOptions) intent.getParcelableExtra("CROP_IMAGE_EXTRA_OPTIONS");
        if (bundle == null) {
            this.f29414a.setImageUriAsync(uri);
        }
        bundle = getSupportActionBar();
        if (bundle != null) {
            CharSequence string;
            if (this.f29415b.activityTitle == null || this.f29415b.activityTitle.isEmpty()) {
                string = getResources().getString(C6146e.crop_image_activity_title);
            } else {
                string = this.f29415b.activityTitle;
            }
            bundle.setTitle(string);
            bundle.setDisplayHomeAsUpEnabled(true);
        }
    }

    protected void onStart() {
        super.onStart();
        this.f29414a.setOnSetImageUriCompleteListener(this);
        this.f29414a.setOnCropImageCompleteListener(this);
    }

    protected void onStop() {
        super.onStop();
        this.f29414a.setOnSetImageUriCompleteListener(null);
        this.f29414a.setOnCropImageCompleteListener(null);
    }

    public boolean onCreateOptionsMenu(android.view.Menu r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.getMenuInflater();
        r1 = com.theartofdev.edmodo.cropper.C6148f.C6145d.crop_image_menu;
        r0.inflate(r1, r5);
        r0 = r4.f29415b;
        r0 = r0.allowRotation;
        r1 = 1;
        if (r0 != 0) goto L_0x001b;
    L_0x0010:
        r0 = com.theartofdev.edmodo.cropper.C6148f.C6143b.crop_image_menu_rotate_left;
        r5.removeItem(r0);
        r0 = com.theartofdev.edmodo.cropper.C6148f.C6143b.crop_image_menu_rotate_right;
        r5.removeItem(r0);
        goto L_0x002a;
    L_0x001b:
        r0 = r4.f29415b;
        r0 = r0.allowCounterRotation;
        if (r0 == 0) goto L_0x002a;
    L_0x0021:
        r0 = com.theartofdev.edmodo.cropper.C6148f.C6143b.crop_image_menu_rotate_left;
        r0 = r5.findItem(r0);
        r0.setVisible(r1);
    L_0x002a:
        r0 = 0;
        r2 = com.theartofdev.edmodo.cropper.C6148f.C6142a.crop_image_menu_crop;	 Catch:{ Exception -> 0x003d }
        r2 = android.support.v4.content.C0432b.a(r4, r2);	 Catch:{ Exception -> 0x003d }
        if (r2 == 0) goto L_0x003e;
    L_0x0033:
        r0 = com.theartofdev.edmodo.cropper.C6148f.C6143b.crop_image_menu_crop;	 Catch:{ Exception -> 0x003e }
        r0 = r5.findItem(r0);	 Catch:{ Exception -> 0x003e }
        r0.setIcon(r2);	 Catch:{ Exception -> 0x003e }
        goto L_0x003e;
    L_0x003d:
        r2 = r0;
    L_0x003e:
        r0 = r4.f29415b;
        r0 = r0.activityMenuIconColor;
        if (r0 == 0) goto L_0x0061;
    L_0x0044:
        r0 = com.theartofdev.edmodo.cropper.C6148f.C6143b.crop_image_menu_rotate_left;
        r3 = r4.f29415b;
        r3 = r3.activityMenuIconColor;
        r4.m35074a(r5, r0, r3);
        r0 = com.theartofdev.edmodo.cropper.C6148f.C6143b.crop_image_menu_rotate_right;
        r3 = r4.f29415b;
        r3 = r3.activityMenuIconColor;
        r4.m35074a(r5, r0, r3);
        if (r2 == 0) goto L_0x0061;
    L_0x0058:
        r0 = com.theartofdev.edmodo.cropper.C6148f.C6143b.crop_image_menu_crop;
        r2 = r4.f29415b;
        r2 = r2.activityMenuIconColor;
        r4.m35074a(r5, r0, r2);
    L_0x0061:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C6143b.crop_image_menu_crop) {
            m35075a();
            return true;
        } else if (menuItem.getItemId() == C6143b.crop_image_menu_rotate_left) {
            m35076a(-this.f29415b.rotationDegrees);
            return true;
        } else if (menuItem.getItemId() == C6143b.crop_image_menu_rotate_right) {
            m35076a(this.f29415b.rotationDegrees);
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            m35080c();
            return true;
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        m35080c();
    }

    public void onSetImageUriComplete(CropImageView cropImageView, Uri uri, Exception exception) {
        if (exception == null) {
            if (this.f29415b.initialCropWindowRectangle != null) {
                this.f29414a.setCropRect(this.f29415b.initialCropWindowRectangle);
            }
            if (this.f29415b.initialRotation > -1) {
                this.f29414a.setRotatedDegrees(this.f29415b.initialRotation);
                return;
            }
            return;
        }
        m35077a((Uri) null, exception, 1);
    }

    public void onCropImageComplete(CropImageView cropImageView, C6129a c6129a) {
        m35077a(c6129a.getUri(), c6129a.getError(), c6129a.getSampleSize());
    }

    /* renamed from: a */
    protected void m35075a() {
        if (this.f29415b.noOutputImage) {
            m35077a(null, null, 1);
            return;
        }
        this.f29414a.m26643a(m35079b(), this.f29415b.outputCompressFormat, this.f29415b.outputCompressQuality, this.f29415b.outputRequestWidth, this.f29415b.outputRequestHeight, this.f29415b.outputRequestSizeOptions);
    }

    /* renamed from: a */
    protected void m35076a(int i) {
        this.f29414a.m26641a(i);
    }

    /* renamed from: b */
    protected Uri m35079b() {
        Uri uri = this.f29415b.outputUri;
        if (uri.equals(Uri.EMPTY)) {
            try {
                String str = this.f29415b.outputCompressFormat == CompressFormat.JPEG ? ".jpg" : this.f29415b.outputCompressFormat == CompressFormat.PNG ? ".png" : ".webp";
                uri = Uri.fromFile(File.createTempFile("cropped", str, getCacheDir()));
            } catch (Throwable e) {
                throw new RuntimeException("Failed to create temp file for output image", e);
            }
        }
        return uri;
    }

    /* renamed from: a */
    protected void m35077a(Uri uri, Exception exception, int i) {
        setResult(exception == null ? -1 : 204, m35078b(uri, exception, i));
        finish();
    }

    /* renamed from: c */
    protected void m35080c() {
        setResult(0);
        finish();
    }

    /* renamed from: b */
    protected Intent m35078b(Uri uri, Exception exception, int i) {
        Parcelable activityResult = new ActivityResult(null, uri, exception, this.f29414a.getCropPoints(), this.f29414a.getCropRect(), this.f29414a.getRotatedDegrees(), i);
        uri = new Intent();
        uri.putExtra("CROP_IMAGE_EXTRA_RESULT", activityResult);
        return uri;
    }

    /* renamed from: a */
    private void m35074a(android.view.Menu r2, int r3, int r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r2 = r2.findItem(r3);
        if (r2 == 0) goto L_0x0017;
    L_0x0006:
        r3 = r2.getIcon();
        if (r3 == 0) goto L_0x0017;
    L_0x000c:
        r3.mutate();	 Catch:{ Exception -> 0x0017 }
        r0 = android.graphics.PorterDuff.Mode.SRC_ATOP;	 Catch:{ Exception -> 0x0017 }
        r3.setColorFilter(r4, r0);	 Catch:{ Exception -> 0x0017 }
        r2.setIcon(r3);	 Catch:{ Exception -> 0x0017 }
    L_0x0017:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImageActivity.a(android.view.Menu, int, int):void");
    }
}
