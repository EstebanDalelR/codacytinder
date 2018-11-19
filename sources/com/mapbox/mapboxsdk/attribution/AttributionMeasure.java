package com.mapbox.mapboxsdk.attribution;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;

public class AttributionMeasure {
    private Bitmap logo;
    private Bitmap logoSmall;
    private float margin;
    private boolean shorterText;
    private Bitmap snapshot;
    private TextView textView;
    private TextView textViewShort;

    public static class Builder {
        private Bitmap logo;
        private Bitmap logoSmall;
        private float marginPadding;
        private Bitmap snapshot;
        private TextView textView;
        private TextView textViewShort;

        public Builder setSnapshot(Bitmap bitmap) {
            this.snapshot = bitmap;
            return this;
        }

        public Builder setLogo(Bitmap bitmap) {
            this.logo = bitmap;
            return this;
        }

        public Builder setLogoSmall(Bitmap bitmap) {
            this.logoSmall = bitmap;
            return this;
        }

        public Builder setTextView(TextView textView) {
            this.textView = textView;
            return this;
        }

        public Builder setTextViewShort(TextView textView) {
            this.textViewShort = textView;
            return this;
        }

        public Builder setMarginPadding(float f) {
            this.marginPadding = f;
            return this;
        }

        public AttributionMeasure build() {
            return new AttributionMeasure(this.snapshot, this.logo, this.logoSmall, this.textView, this.textViewShort, this.marginPadding);
        }
    }

    private class Chain {
        public List<Command> commands;

        Chain(Command... commandArr) {
            this.commands = Arrays.asList(commandArr);
        }

        public AttributionLayout start(AttributionMeasure attributionMeasure) {
            AttributionLayout attributionLayout = null;
            for (Command execute : this.commands) {
                attributionLayout = execute.execute(attributionMeasure);
                if (attributionLayout != null) {
                    break;
                }
            }
            return attributionLayout;
        }
    }

    public interface Command {
        AttributionLayout execute(AttributionMeasure attributionMeasure);
    }

    private static class FullLogoLongTextCommand implements Command {
        private FullLogoLongTextCommand() {
        }

        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            if ((attributionMeasure.getLogoContainerWidth() + attributionMeasure.getTextViewContainerWidth() <= attributionMeasure.getMaxSize() ? 1 : null) == null) {
                return null;
            }
            return new AttributionLayout(attributionMeasure.logo, AttributionMeasure.calculateAnchor(attributionMeasure.snapshot, attributionMeasure.textView, attributionMeasure.margin), false);
        }
    }

    private static class FullLogoShortTextCommand implements Command {
        private FullLogoShortTextCommand() {
        }

        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            if ((attributionMeasure.getLogoContainerWidth() + attributionMeasure.getTextViewShortContainerWidth() <= attributionMeasure.getMaxSizeShort() ? 1 : null) == null) {
                return null;
            }
            return new AttributionLayout(attributionMeasure.logo, AttributionMeasure.calculateAnchor(attributionMeasure.snapshot, attributionMeasure.textViewShort, attributionMeasure.margin), true);
        }
    }

    private static class LongTextCommand implements Command {
        private LongTextCommand() {
        }

        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            if ((attributionMeasure.getTextViewContainerWidth() + attributionMeasure.margin <= attributionMeasure.getMaxSize() ? 1 : null) != null) {
                return new AttributionLayout(null, AttributionMeasure.calculateAnchor(attributionMeasure.snapshot, attributionMeasure.textView, attributionMeasure.margin), false);
            }
            return null;
        }
    }

    private static class NoTextCommand implements Command {
        private NoTextCommand() {
        }

        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            return new AttributionLayout(null, null, false);
        }
    }

    private static class ShortTextCommand implements Command {
        private ShortTextCommand() {
        }

        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            if ((attributionMeasure.getTextViewShortContainerWidth() + attributionMeasure.margin <= attributionMeasure.getMaxSizeShort() ? 1 : null) != null) {
                return new AttributionLayout(null, AttributionMeasure.calculateAnchor(attributionMeasure.snapshot, attributionMeasure.textViewShort, attributionMeasure.margin), true);
            }
            return null;
        }
    }

    private static class SmallLogoLongTextCommand implements Command {
        private SmallLogoLongTextCommand() {
        }

        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            if ((attributionMeasure.getLogoSmallContainerWidth() + attributionMeasure.getTextViewContainerWidth() <= attributionMeasure.getMaxSize() ? 1 : null) == null) {
                return null;
            }
            return new AttributionLayout(attributionMeasure.logoSmall, AttributionMeasure.calculateAnchor(attributionMeasure.snapshot, attributionMeasure.textView, attributionMeasure.margin), false);
        }
    }

    private static class SmallLogoShortTextCommand implements Command {
        private SmallLogoShortTextCommand() {
        }

        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            if ((attributionMeasure.getLogoContainerWidth() + attributionMeasure.getTextViewShortContainerWidth() <= attributionMeasure.getMaxSizeShort() ? 1 : null) == null) {
                return null;
            }
            return new AttributionLayout(attributionMeasure.logoSmall, AttributionMeasure.calculateAnchor(attributionMeasure.snapshot, attributionMeasure.textViewShort, attributionMeasure.margin), true);
        }
    }

    AttributionMeasure(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, TextView textView, TextView textView2, float f) {
        this.snapshot = bitmap;
        this.logo = bitmap2;
        this.logoSmall = bitmap3;
        this.textView = textView;
        this.textViewShort = textView2;
        this.margin = f;
    }

    public AttributionLayout measure() {
        AttributionLayout start = new Chain(new FullLogoLongTextCommand(), new FullLogoShortTextCommand(), new SmallLogoLongTextCommand(), new SmallLogoShortTextCommand(), new LongTextCommand(), new ShortTextCommand(), new NoTextCommand()).start(this);
        this.shorterText = start.isShortText();
        return start;
    }

    private static PointF calculateAnchor(Bitmap bitmap, TextView textView, float f) {
        return new PointF(((float) (bitmap.getWidth() - textView.getMeasuredWidth())) - f, (((float) bitmap.getHeight()) - f) - ((float) textView.getMeasuredHeight()));
    }

    public TextView getTextView() {
        return this.shorterText ? this.textViewShort : this.textView;
    }

    private float getTextViewContainerWidth() {
        return ((float) this.textView.getMeasuredWidth()) + this.margin;
    }

    private float getLogoContainerWidth() {
        return ((float) this.logo.getWidth()) + (this.margin * 2.0f);
    }

    private float getTextViewShortContainerWidth() {
        return ((float) this.textViewShort.getMeasuredWidth()) + this.margin;
    }

    private float getLogoSmallContainerWidth() {
        return ((float) this.logoSmall.getWidth()) + (this.margin * 2.0f);
    }

    private float getMaxSize() {
        return (float) ((this.snapshot.getWidth() * 8) / 10);
    }

    private float getMaxSizeShort() {
        return (float) this.snapshot.getWidth();
    }
}
