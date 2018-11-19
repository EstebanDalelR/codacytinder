package com.tinder.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.C3086i;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.utils.ad;

public class RoundImageView extends ImageView {
    /* renamed from: a */
    private int f47824a;
    /* renamed from: b */
    private Integer f47825b;
    /* renamed from: c */
    private RectF f47826c;
    /* renamed from: d */
    private BitmapShader f47827d;
    /* renamed from: e */
    private Paint f47828e;
    /* renamed from: f */
    private Paint f47829f;
    /* renamed from: g */
    private Paint f47830g;
    /* renamed from: h */
    private Bitmap f47831h;
    /* renamed from: i */
    private float f47832i;
    /* renamed from: j */
    private float f47833j;
    /* renamed from: k */
    private int f47834k;
    /* renamed from: l */
    private boolean f47835l;

    public RoundImageView(Context context) {
        super(context);
        this.f47826c = new RectF();
    }

    public RoundImageView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        m57925a(context, attributeSet);
    }

    public RoundImageView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m57925a(context, attributeSet);
    }

    public void setStyle(@NonNull String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1360216880) {
            if (hashCode != 73087533) {
                if (hashCode != 105762980) {
                    if (hashCode == 1913349822) {
                        if (str.equals("slightly_rounded") != null) {
                            str = true;
                            switch (str) {
                                case null:
                                    this.f47825b = Integer.valueOf(6);
                                    return;
                                case 1:
                                    this.f47825b = Integer.valueOf(10);
                                    return;
                                case 2:
                                    this.f47825b = Integer.valueOf(20);
                                    return;
                                case 3:
                                    this.f47825b = Integer.valueOf(50);
                                    return;
                                default:
                                    return;
                            }
                        }
                    }
                } else if (str.equals("very_rounded") != null) {
                    str = 2;
                    switch (str) {
                        case null:
                            this.f47825b = Integer.valueOf(6);
                            return;
                        case 1:
                            this.f47825b = Integer.valueOf(10);
                            return;
                        case 2:
                            this.f47825b = Integer.valueOf(20);
                            return;
                        case 3:
                            this.f47825b = Integer.valueOf(50);
                            return;
                        default:
                            return;
                    }
                }
            } else if (str.equals("barely_rounded") != null) {
                str = null;
                switch (str) {
                    case null:
                        this.f47825b = Integer.valueOf(6);
                        return;
                    case 1:
                        this.f47825b = Integer.valueOf(10);
                        return;
                    case 2:
                        this.f47825b = Integer.valueOf(20);
                        return;
                    case 3:
                        this.f47825b = Integer.valueOf(50);
                        return;
                    default:
                        return;
                }
            }
        } else if (str.equals("circle") != null) {
            str = 3;
            switch (str) {
                case null:
                    this.f47825b = Integer.valueOf(6);
                    return;
                case 1:
                    this.f47825b = Integer.valueOf(10);
                    return;
                case 2:
                    this.f47825b = Integer.valueOf(20);
                    return;
                case 3:
                    this.f47825b = Integer.valueOf(50);
                    return;
                default:
                    return;
            }
        }
        str = -1;
        switch (str) {
            case null:
                this.f47825b = Integer.valueOf(6);
                return;
            case 1:
                this.f47825b = Integer.valueOf(10);
                return;
            case 2:
                this.f47825b = Integer.valueOf(20);
                return;
            case 3:
                this.f47825b = Integer.valueOf(50);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m57925a(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this.f47826c = new RectF();
        attributeSet = context.obtainStyledAttributes(attributeSet, C6249b.RoundImageView, 0, 0);
        try {
            this.f47825b = Integer.valueOf(attributeSet.getInteger(3, 0));
            this.f47824a = attributeSet.getInt(2, 1);
            this.f47832i = (float) attributeSet.getDimensionPixelSize(1, 0);
            this.f47834k = attributeSet.getColor(0, C0432b.c(context, R.color.white));
            this.f47833j = this.f47832i / 2.0f;
        } catch (Context context2) {
            ad.a("Failed to retrieve attributes for rounded image view", context2);
        } catch (Throwable th) {
            attributeSet.recycle();
        }
        attributeSet.recycle();
    }

    public void setBorderSize(float f) {
        this.f47832i = f;
        this.f47833j = this.f47832i / 2.0f;
        invalidate();
    }

    protected void onDraw(@Nullable Canvas canvas) {
        Drawable drawable = getDrawable();
        if (!isInEditMode()) {
            if (drawable == null) {
                ad.a("RoundImageView drawable null - aborting onDraw...");
            } else {
                if (canvas == null) {
                    canvas = new Canvas();
                }
                Bitmap bitmap = null;
                if (drawable instanceof C3086i) {
                    bitmap = ((C3086i) drawable).b();
                } else if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
                if (bitmap == null) {
                    super.onDraw(canvas);
                    return;
                }
                Paint a = m57923a(m57922a(bitmap));
                if (bitmap == null || this.f47826c == null || a == null) {
                    ad.b("Something important was null");
                } else {
                    m57924a(bitmap.getWidth());
                    this.f47826c.top = this.f47833j;
                    this.f47826c.left = this.f47833j;
                    this.f47826c.bottom = ((float) bitmap.getHeight()) - this.f47833j;
                    this.f47826c.right = ((float) bitmap.getWidth()) - this.f47833j;
                    try {
                        canvas.drawRoundRect(this.f47826c, (float) this.f47824a, (float) this.f47824a, a);
                        if (this.f47832i != 0.0f) {
                            canvas.drawRoundRect(this.f47826c, (float) this.f47824a, (float) this.f47824a, getBorderPaint());
                        }
                        if (this.f47835l) {
                            canvas.drawRoundRect(this.f47826c, (float) this.f47824a, (float) this.f47824a, getFadePaint());
                        }
                    } catch (Canvas canvas2) {
                        ad.a("Failed to draw rounded rect", canvas2);
                    }
                    this.f47831h = bitmap;
                }
            }
        }
    }

    public int getCornerRadius() {
        return this.f47824a;
    }

    public void setCornerRadius(int i) {
        this.f47824a = i;
        invalidate();
    }

    /* renamed from: a */
    private void m57924a(int i) {
        if (this.f47825b.intValue() != 0) {
            this.f47824a = Math.round((((float) this.f47825b.intValue()) / 100.0f) * ((float) i));
        }
    }

    /* renamed from: a */
    private Paint m57923a(BitmapShader bitmapShader) {
        if (this.f47828e == null || this.f47828e.getShader() != bitmapShader) {
            this.f47828e = new Paint();
            this.f47828e.setAntiAlias(true);
            this.f47828e.setShader(bitmapShader);
            this.f47828e.setFilterBitmap(true);
        }
        return this.f47828e;
    }

    private Paint getBorderPaint() {
        if (this.f47829f == null) {
            this.f47829f = new Paint();
            this.f47829f.setAntiAlias(true);
            this.f47829f.setStrokeWidth(this.f47832i);
            this.f47829f.setColor(this.f47834k);
            this.f47829f.setStyle(Style.STROKE);
        }
        return this.f47829f;
    }

    private Paint getFadePaint() {
        if (this.f47830g == null) {
            this.f47830g = new Paint();
            this.f47830g.setAntiAlias(true);
            this.f47830g.setStrokeWidth(this.f47832i);
            this.f47830g.setColor(C0432b.c(getContext(), R.color.white));
            this.f47830g.setAlpha(153);
        }
        return this.f47830g;
    }

    /* renamed from: a */
    private BitmapShader m57922a(Bitmap bitmap) {
        if (this.f47827d == null || this.f47831h != bitmap) {
            this.f47827d = new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP);
        }
        return this.f47827d;
    }
}
