package com.tinder.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.FileProvider;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView.Guidelines;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.dialogs.C8867t;
import com.tinder.dialogs.DialogError;
import com.tinder.fragments.C13308g;
import com.tinder.fragments.C13310q;
import com.tinder.fragments.am;
import com.tinder.interfaces.PhotoUploadSelection;
import com.tinder.managers.FacebookManager;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.bk;
import com.tinder.model.GalleryItem.Source;
import com.tinder.utils.Async;
import com.tinder.utils.C15363n;
import com.tinder.utils.C15370u;
import com.tinder.utils.ad;
import com.tinder.utils.av;
import java.io.File;
import javax.inject.Inject;

public class ActivityAddPhoto extends ActivitySignedInBase implements PhotoUploadSelection {
    @Inject
    /* renamed from: a */
    bk f29440a;
    @Inject
    /* renamed from: b */
    FacebookManager f29441b;
    @Inject
    /* renamed from: c */
    ManagerProfile f29442c;
    @Inject
    /* renamed from: d */
    LegacyBreadCrumbTracker f29443d;
    /* renamed from: e */
    private C13308g f29444e;
    /* renamed from: f */
    private C13310q f29445f;
    /* renamed from: g */
    private am f29446g;
    /* renamed from: h */
    private C8867t f29447h;
    @Nullable
    /* renamed from: i */
    private String f29448i;
    @Nullable
    /* renamed from: j */
    private String f29449j;

    /* renamed from: com.tinder.activities.ActivityAddPhoto$1 */
    static /* synthetic */ class C61541 {
        /* renamed from: a */
        static final /* synthetic */ int[] f22658a = new int[Source.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.model.GalleryItem.Source.values();
            r0 = r0.length;
            r0 = new int[r0];
            f22658a = r0;
            r0 = f22658a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.model.GalleryItem.Source.Device;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f22658a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.model.GalleryItem.Source.Facebook;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.activities.ActivityAddPhoto.1.<clinit>():void");
        }
    }

    /* renamed from: a */
    public boolean m35113a() {
        return true;
    }

    protected void onCreate(Bundle bundle) {
        requestWindowFeature(5);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("savedInstanceState=");
        stringBuilder.append(bundle);
        ad.a(stringBuilder.toString());
        super.onCreate(bundle);
        ManagerApp.e().inject(this);
        if (bundle != null) {
            this.f29448i = bundle.getString("id");
            this.f29449j = bundle.getString("source");
        }
        setContentView(R.layout.standard_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new C6158a(this));
            toolbar.setTitle(R.string.add_a_photo);
            setSupportActionBar(toolbar);
        }
        this.a_.a(R.id.standard_activity_fragment_container);
        showGalleries();
    }

    /* renamed from: a */
    final /* synthetic */ void m35111a(View view) {
        onBackPressed();
    }

    public void onResume() {
        super.onResume();
        this.f29443d.a(this);
    }

    public void showPhotos(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("albumId=");
        stringBuilder.append(str);
        stringBuilder.append(", albumName=");
        stringBuilder.append(str2);
        ad.a(stringBuilder.toString());
        if (this.f29444e == null) {
            this.f29444e = new C13308g();
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", str);
        bundle.putString("name", str2);
        this.f29444e.setArguments(bundle);
        a(this.f29444e);
    }

    public void showGalleries() {
        if (this.f29446g == null) {
            this.f29446g = new am();
        }
        c(this.f29446g);
    }

    public void cropDevicePhoto(@NonNull String str) {
        CropImage.m26625a(Uri.fromFile(new File(str))).m26618a(Guidelines.ON_TOUCH).m26617a(1, 1).m26621a((Activity) this, ImageCropperActivity.class);
    }

    public void cropFbPhoto(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        this.f29448i = str2;
        this.f29449j = str3;
        startActivityForResult(CropImage.m26625a(FileProvider.a(getApplicationContext(), "com.tinder.fileprovider", new File(str))).m26618a(Guidelines.ON_TOUCH).m26617a(1, 1).m26623b(null).m26616a((Context) this, ImageCropperActivity.class), 2);
    }

    public void r_() {
        startActivityForResult(new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI), 1);
    }

    public void showAlbums(Source source) {
        ad.a();
        switch (C61541.f22658a[source.ordinal()]) {
            case 1:
                r_();
                return;
            case 2:
                if (this.f29445f == null) {
                    this.f29445f = new C13310q();
                }
                a(this.f29445f);
                return;
            default:
                return;
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("requestCode=");
        stringBuilder.append(i);
        stringBuilder.append(", resultCode=");
        stringBuilder.append(i2);
        stringBuilder.append(", data=");
        stringBuilder.append(intent);
        ad.a(stringBuilder.toString());
        if (i != 203) {
            switch (i) {
                case 1:
                    if (i2 == -1) {
                        ad.a("result from gallery pick");
                        if (intent != null) {
                            Uri data = intent.getData();
                            if (data != null) {
                                String a = C15370u.a(this, data);
                                i = new StringBuilder();
                                i.append("imgPath = ");
                                i.append(a);
                                ad.a(i.toString());
                                int b = av.b();
                                int c = av.c();
                                if (this.f29447h == 0) {
                                    this.f29447h = new C8867t(this);
                                }
                                this.f29447h.show();
                                Async.a(new C7278b(this, a, b, c, data)).a(new C7279c(this)).a();
                                break;
                            }
                        }
                        if (isFinishing() == 0) {
                            new DialogError(this, R.string.photo_upload_failed_title, R.string.photo_upload_failed_details).show();
                        }
                        return;
                    }
                    break;
                case 2:
                    if (!(intent == null || intent.getExtras() == 0 || i2 != -1)) {
                        i = CropImage.m26624a(intent).getCropRect();
                        i2 = (float) (i.right - i.left);
                        float f = (float) (i.bottom - i.top);
                        float f2 = (float) intent.getExtras().getInt(ImageCropperActivity.f29437a);
                        intent = (float) intent.getExtras().getInt(ImageCropperActivity.f29438b);
                        float f3 = ((float) i.left) / f2;
                        i = ((float) i.top) / intent;
                        i2 /= f2;
                        f /= intent;
                        intent = new Intent();
                        intent.putExtra("id", this.f29448i);
                        intent.putExtra("source", this.f29449j);
                        intent.putExtra(ManagerWebServices.PARAM_XDISTANCE_PERCENT, i2);
                        intent.putExtra(ManagerWebServices.PARAM_YDISTANCE_PERCENT, f);
                        intent.putExtra(ManagerWebServices.PARAM_XOFFSET_PERCENT, f3);
                        intent.putExtra(ManagerWebServices.PARAM_YOFFSET_PERCENT, i);
                        setResult(-1, intent);
                        finish();
                        break;
                    }
                default:
                    super.onActivityResult(i, i2, intent);
                    break;
            }
        } else if (!(intent == null || intent.getExtras() == 0)) {
            i = CropImage.m26624a(intent);
            if (i != 0) {
                if (i.getUri() != 0) {
                    i2 = new Intent();
                    i2.putExtra("filePath", C15370u.a(getApplicationContext(), i.getUri()));
                    i2.putExtra("photoSource", "src_camera_roll");
                    setResult(-1, i2);
                    finish();
                }
            }
            if (o() != 0) {
                new DialogError(this, R.string.photo_upload_failed_title, R.string.photo_upload_failed_details).show();
            }
        }
    }

    /* renamed from: a */
    final /* synthetic */ Object m35110a(String str, int i, int i2, Uri uri) {
        if (str != null) {
            if (str.startsWith("http") != null) {
                i = C15363n.b(str, i, i2);
            } else {
                i = C15363n.a(str, i, i2);
            }
            str = C15370u.a(str);
            if (str != null) {
                i = C15363n.a(i, (float) str);
            }
        } else {
            i = C15363n.a(this, uri, i, i2);
        }
        if (i != 0) {
            return C15370u.a(this, i, "pendingupload");
        }
        return null;
    }

    /* renamed from: a */
    final /* synthetic */ void m35112a(Object obj) {
        if (this.f29447h != null) {
            av.a(this.f29447h);
        }
        if (obj != null) {
            cropDevicePhoto((String) obj);
        } else {
            new DialogError(this, R.string.photo_upload_failed_title, R.string.photo_upload_failed_details).show();
        }
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putString("id", this.f29448i);
        bundle.putString("source", this.f29449j);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        ad.a();
        super.onDestroy();
    }
}
