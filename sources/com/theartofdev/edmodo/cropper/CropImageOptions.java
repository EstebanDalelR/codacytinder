package com.theartofdev.edmodo.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.snapchat.kit.sdk.core.metrics.model.Event;
import com.theartofdev.edmodo.cropper.CropImageView.CropShape;
import com.theartofdev.edmodo.cropper.CropImageView.Guidelines;
import com.theartofdev.edmodo.cropper.CropImageView.RequestSizeOptions;
import com.theartofdev.edmodo.cropper.CropImageView.ScaleType;

public class CropImageOptions implements Parcelable {
    public static final Creator<CropImageOptions> CREATOR = new C61281();
    public int activityMenuIconColor;
    public String activityTitle;
    public boolean allowCounterRotation;
    public boolean allowRotation;
    public int aspectRatioX;
    public int aspectRatioY;
    public boolean autoZoomEnabled;
    public int backgroundColor;
    public int borderCornerColor;
    public float borderCornerLength;
    public float borderCornerOffset;
    public float borderCornerThickness;
    public int borderLineColor;
    public float borderLineThickness;
    public CropShape cropShape;
    public boolean fixAspectRatio;
    public Guidelines guidelines;
    public int guidelinesColor;
    public float guidelinesThickness;
    public float initialCropWindowPaddingRatio;
    public Rect initialCropWindowRectangle;
    public int initialRotation;
    public int maxCropResultHeight;
    public int maxCropResultWidth;
    public int maxZoom;
    public int minCropResultHeight;
    public int minCropResultWidth;
    public int minCropWindowHeight;
    public int minCropWindowWidth;
    public boolean multiTouchEnabled;
    public boolean noOutputImage;
    public CompressFormat outputCompressFormat;
    public int outputCompressQuality;
    public int outputRequestHeight;
    public RequestSizeOptions outputRequestSizeOptions;
    public int outputRequestWidth;
    public Uri outputUri;
    public int rotationDegrees;
    public ScaleType scaleType;
    public boolean showCropOverlay;
    public boolean showProgressBar;
    public float snapRadius;
    public float touchRadius;

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageOptions$1 */
    static class C61281 implements Creator<CropImageOptions> {
        C61281() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m26626a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m26627a(i);
        }

        /* renamed from: a */
        public CropImageOptions m26626a(Parcel parcel) {
            return new CropImageOptions(parcel);
        }

        /* renamed from: a */
        public CropImageOptions[] m26627a(int i) {
            return new CropImageOptions[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public CropImageOptions() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.cropShape = CropShape.RECTANGLE;
        this.snapRadius = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.touchRadius = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.guidelines = Guidelines.ON_TOUCH;
        this.scaleType = ScaleType.FIT_CENTER;
        this.showCropOverlay = true;
        this.showProgressBar = true;
        this.autoZoomEnabled = true;
        this.multiTouchEnabled = false;
        this.maxZoom = 4;
        this.initialCropWindowPaddingRatio = 0.1f;
        this.fixAspectRatio = false;
        this.aspectRatioX = 1;
        this.aspectRatioY = 1;
        this.borderLineThickness = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.borderLineColor = Color.argb(170, 255, 255, 255);
        this.borderCornerThickness = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.borderCornerOffset = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.borderCornerLength = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.borderCornerColor = -1;
        this.guidelinesThickness = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.guidelinesColor = Color.argb(170, 255, 255, 255);
        this.backgroundColor = Color.argb(119, 0, 0, 0);
        this.minCropWindowWidth = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.minCropWindowHeight = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.minCropResultWidth = 40;
        this.minCropResultHeight = 40;
        this.maxCropResultWidth = Event.SERVER_EVENT_TIER_FIELD_NUMBER;
        this.maxCropResultHeight = Event.SERVER_EVENT_TIER_FIELD_NUMBER;
        this.activityTitle = "";
        this.activityMenuIconColor = 0;
        this.outputUri = Uri.EMPTY;
        this.outputCompressFormat = CompressFormat.JPEG;
        this.outputCompressQuality = 90;
        this.outputRequestWidth = 0;
        this.outputRequestHeight = 0;
        this.outputRequestSizeOptions = RequestSizeOptions.NONE;
        this.noOutputImage = false;
        this.initialCropWindowRectangle = null;
        this.initialRotation = -1;
        this.allowRotation = true;
        this.allowCounterRotation = false;
        this.rotationDegrees = 90;
    }

    protected CropImageOptions(Parcel parcel) {
        this.cropShape = CropShape.values()[parcel.readInt()];
        this.snapRadius = parcel.readFloat();
        this.touchRadius = parcel.readFloat();
        this.guidelines = Guidelines.values()[parcel.readInt()];
        this.scaleType = ScaleType.values()[parcel.readInt()];
        boolean z = false;
        this.showCropOverlay = parcel.readByte() != (byte) 0;
        this.showProgressBar = parcel.readByte() != (byte) 0;
        this.autoZoomEnabled = parcel.readByte() != (byte) 0;
        this.multiTouchEnabled = parcel.readByte() != (byte) 0;
        this.maxZoom = parcel.readInt();
        this.initialCropWindowPaddingRatio = parcel.readFloat();
        this.fixAspectRatio = parcel.readByte() != (byte) 0;
        this.aspectRatioX = parcel.readInt();
        this.aspectRatioY = parcel.readInt();
        this.borderLineThickness = parcel.readFloat();
        this.borderLineColor = parcel.readInt();
        this.borderCornerThickness = parcel.readFloat();
        this.borderCornerOffset = parcel.readFloat();
        this.borderCornerLength = parcel.readFloat();
        this.borderCornerColor = parcel.readInt();
        this.guidelinesThickness = parcel.readFloat();
        this.guidelinesColor = parcel.readInt();
        this.backgroundColor = parcel.readInt();
        this.minCropWindowWidth = parcel.readInt();
        this.minCropWindowHeight = parcel.readInt();
        this.minCropResultWidth = parcel.readInt();
        this.minCropResultHeight = parcel.readInt();
        this.maxCropResultWidth = parcel.readInt();
        this.maxCropResultHeight = parcel.readInt();
        this.activityTitle = parcel.readString();
        this.activityMenuIconColor = parcel.readInt();
        this.outputUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.outputCompressFormat = CompressFormat.valueOf(parcel.readString());
        this.outputCompressQuality = parcel.readInt();
        this.outputRequestWidth = parcel.readInt();
        this.outputRequestHeight = parcel.readInt();
        this.outputRequestSizeOptions = RequestSizeOptions.values()[parcel.readInt()];
        this.noOutputImage = parcel.readByte() != (byte) 0;
        this.initialCropWindowRectangle = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.initialRotation = parcel.readInt();
        this.allowRotation = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.allowCounterRotation = z;
        this.rotationDegrees = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.cropShape.ordinal());
        parcel.writeFloat(this.snapRadius);
        parcel.writeFloat(this.touchRadius);
        parcel.writeInt(this.guidelines.ordinal());
        parcel.writeInt(this.scaleType.ordinal());
        parcel.writeByte((byte) this.showCropOverlay);
        parcel.writeByte((byte) this.showProgressBar);
        parcel.writeByte((byte) this.autoZoomEnabled);
        parcel.writeByte((byte) this.multiTouchEnabled);
        parcel.writeInt(this.maxZoom);
        parcel.writeFloat(this.initialCropWindowPaddingRatio);
        parcel.writeByte((byte) this.fixAspectRatio);
        parcel.writeInt(this.aspectRatioX);
        parcel.writeInt(this.aspectRatioY);
        parcel.writeFloat(this.borderLineThickness);
        parcel.writeInt(this.borderLineColor);
        parcel.writeFloat(this.borderCornerThickness);
        parcel.writeFloat(this.borderCornerOffset);
        parcel.writeFloat(this.borderCornerLength);
        parcel.writeInt(this.borderCornerColor);
        parcel.writeFloat(this.guidelinesThickness);
        parcel.writeInt(this.guidelinesColor);
        parcel.writeInt(this.backgroundColor);
        parcel.writeInt(this.minCropWindowWidth);
        parcel.writeInt(this.minCropWindowHeight);
        parcel.writeInt(this.minCropResultWidth);
        parcel.writeInt(this.minCropResultHeight);
        parcel.writeInt(this.maxCropResultWidth);
        parcel.writeInt(this.maxCropResultHeight);
        parcel.writeString(this.activityTitle);
        parcel.writeInt(this.activityMenuIconColor);
        parcel.writeParcelable(this.outputUri, i);
        parcel.writeString(this.outputCompressFormat.name());
        parcel.writeInt(this.outputCompressQuality);
        parcel.writeInt(this.outputRequestWidth);
        parcel.writeInt(this.outputRequestHeight);
        parcel.writeInt(this.outputRequestSizeOptions.ordinal());
        parcel.writeInt(this.noOutputImage);
        parcel.writeParcelable(this.initialCropWindowRectangle, i);
        parcel.writeInt(this.initialRotation);
        parcel.writeByte((byte) this.allowRotation);
        parcel.writeByte((byte) this.allowCounterRotation);
        parcel.writeInt(this.rotationDegrees);
    }

    public void validate() {
        if (this.maxZoom < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        } else if (this.touchRadius < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        } else {
            if (this.initialCropWindowPaddingRatio >= 0.0f) {
                if (((double) this.initialCropWindowPaddingRatio) < 0.5d) {
                    if (this.aspectRatioX <= 0) {
                        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
                    } else if (this.aspectRatioY <= 0) {
                        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
                    } else if (this.borderLineThickness < 0.0f) {
                        throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
                    } else if (this.borderCornerThickness < 0.0f) {
                        throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
                    } else if (this.guidelinesThickness < 0.0f) {
                        throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
                    } else if (this.minCropWindowHeight < 0) {
                        throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
                    } else if (this.minCropResultWidth < 0) {
                        throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
                    } else if (this.minCropResultHeight < 0) {
                        throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
                    } else if (this.maxCropResultWidth < this.minCropResultWidth) {
                        throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
                    } else if (this.maxCropResultHeight < this.minCropResultHeight) {
                        throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
                    } else if (this.outputRequestWidth < 0) {
                        throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
                    } else if (this.outputRequestHeight < 0) {
                        throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
                    } else {
                        if (this.rotationDegrees >= 0) {
                            if (this.rotationDegrees <= 360) {
                                return;
                            }
                        }
                        throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
                    }
                }
            }
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
    }
}
