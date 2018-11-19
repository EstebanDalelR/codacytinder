package com.tinder.recs.view.superlike;

import android.support.annotation.VisibleForTesting;

class SuperLikeOverlayStarPointsGenerator {
    private static final float COS18 = ((float) Math.cos(Math.toRadians(18.0d)));
    private static final float COS36 = ((float) Math.cos(Math.toRadians(36.0d)));
    private static final float COS54 = ((float) Math.cos(Math.toRadians(54.0d)));
    private static final int OUTER_POINTS_COUNT = 5;
    private static final float SIN18 = ((float) Math.sin(Math.toRadians(18.0d)));
    private static final float SIN36 = ((float) Math.sin(Math.toRadians(36.0d)));
    private static final float SIN54 = ((float) Math.sin(Math.toRadians(54.0d)));
    private static final float TAN18 = ((float) Math.tan(Math.toRadians(18.0d)));
    private static final float TAN36 = ((float) Math.tan(Math.toRadians(36.0d)));
    private final AdjacentPoints[] adjacentPoints = new AdjacentPoints[10];
    private final AdjacentPoints[] innerAdjacentPointsTemp = new AdjacentPoints[5];
    private final Point[] innerPointsTemp = new Point[5];
    private final AdjacentPoints[] outerAdjacentPointsTemp = new AdjacentPoints[5];
    private final Point[] outerPointsTemp = new Point[5];

    SuperLikeOverlayStarPointsGenerator() {
        for (int i = 0; i < 5; i++) {
            this.outerPointsTemp[i] = new Point();
            this.innerPointsTemp[i] = new Point();
            this.outerAdjacentPointsTemp[i] = new AdjacentPoints();
            this.innerAdjacentPointsTemp[i] = new AdjacentPoints();
        }
    }

    AdjacentPoints[] generatePointsForStar(float f, float f2) {
        float innerRadius = getInnerRadius(f);
        generateOuterPoints(f, this.outerPointsTemp);
        generateInnerPoints(innerRadius, this.innerPointsTemp);
        generateAdjacentPointsForOuterVertices(this.outerPointsTemp, f / f2, this.outerAdjacentPointsTemp);
        generateAdjacentPointsForInnerVertices(this.innerPointsTemp, innerRadius / f2, this.innerAdjacentPointsTemp);
        for (f = 0.0f; f < this.outerAdjacentPointsTemp.length; f++) {
            int i = f * 2;
            this.adjacentPoints[i] = this.outerAdjacentPointsTemp[f];
            this.adjacentPoints[i + 1] = this.innerAdjacentPointsTemp[f];
        }
        return this.adjacentPoints;
    }

    @VisibleForTesting
    float getInnerRadius(float f) {
        return f / (COS54 * ((1.0f / TAN36) + (1.0f / TAN18)));
    }

    @VisibleForTesting
    void generateOuterPoints(float f, Point[] pointArr) {
        pointArr[0].f46299x = 0.0f;
        float f2 = -f;
        pointArr[0].f46300y = f2;
        pointArr[1].f46299x = COS18 * f;
        pointArr[1].f46300y = SIN18 * f2;
        pointArr[2].f46299x = COS54 * f;
        pointArr[2].f46300y = SIN54 * f;
        pointArr[3].f46299x = COS54 * f2;
        pointArr[3].f46300y = f * SIN54;
        pointArr[4].f46299x = COS18 * f2;
        pointArr[4].f46300y = f2 * SIN18;
    }

    @VisibleForTesting
    void generateInnerPoints(float f, Point[] pointArr) {
        pointArr[0].f46299x = COS54 * f;
        float f2 = -f;
        pointArr[0].f46300y = SIN54 * f2;
        pointArr[1].f46299x = COS18 * f;
        pointArr[1].f46300y = SIN18 * f;
        pointArr[2].f46299x = 0.0f;
        pointArr[2].f46300y = f;
        pointArr[3].f46299x = COS18 * f2;
        pointArr[3].f46300y = f * SIN18;
        pointArr[4].f46299x = COS54 * f2;
        pointArr[4].f46300y = f2 * SIN54;
    }

    @VisibleForTesting
    void generateAdjacentPointsForOuterVertices(Point[] pointArr, float f, AdjacentPoints[] adjacentPointsArr) {
        for (int i = 0; i < pointArr.length; i++) {
            AdjacentPoints adjacentPoints = adjacentPointsArr[i];
            Point point = pointArr[i];
            Point point2 = adjacentPoints.p1;
            Point point3 = adjacentPoints.p3;
            adjacentPoints.p2.set(point.f46299x, point.f46300y);
            AdjacentPoints adjacentPoints2;
            switch (i) {
                case 0:
                    point2.set((-f) * TAN18, point.f46300y + f);
                    point3.set(-point2.f46299x, point2.f46300y);
                    break;
                case 1:
                    point2.set(point.f46299x - (f / COS18), point.f46300y);
                    point3.set(point.f46299x - ((f / COS18) * COS36), point.f46300y + ((f / COS18) * SIN36));
                    break;
                case 2:
                    point2.set(point.f46299x - ((f / COS18) * SIN18), point.f46300y - ((f / COS18) * COS18));
                    point3.set(point.f46299x - ((f / COS18) * COS36), point.f46300y - ((f / COS18) * SIN36));
                    break;
                case 3:
                    adjacentPoints2 = adjacentPointsArr[2];
                    point2.set(-adjacentPoints2.p3.f46299x, adjacentPoints2.p3.f46300y);
                    point3.set(-adjacentPoints2.p1.f46299x, adjacentPoints2.p1.f46300y);
                    break;
                case 4:
                    adjacentPoints2 = adjacentPointsArr[1];
                    point2.set(-adjacentPoints2.p3.f46299x, adjacentPoints2.p3.f46300y);
                    point3.set(-adjacentPoints2.p1.f46299x, adjacentPoints2.p1.f46300y);
                    break;
                default:
                    f = new StringBuilder();
                    f.append("Unexpected Index:");
                    f.append(i);
                    throw new IllegalStateException(f.toString());
            }
            adjacentPointsArr[i] = adjacentPoints;
        }
    }

    @VisibleForTesting
    void generateAdjacentPointsForInnerVertices(Point[] pointArr, float f, AdjacentPoints[] adjacentPointsArr) {
        for (int i = 0; i < pointArr.length; i++) {
            AdjacentPoints adjacentPoints = adjacentPointsArr[i];
            Point point = pointArr[i];
            Point point2 = adjacentPoints.p1;
            Point point3 = adjacentPoints.p3;
            adjacentPoints.p2.set(point.f46299x, point.f46300y);
            AdjacentPoints adjacentPoints2;
            switch (i) {
                case 0:
                    point2.set(point.f46299x - ((f / COS54) * SIN18), point.f46300y - ((f / COS54) * COS18));
                    point3.set(point.f46299x + (f / COS54), point.f46300y);
                    break;
                case 1:
                    point2.set(point.f46299x + ((f / COS54) * COS36), point.f46300y - ((f / COS54) * SIN36));
                    point3.set(point.f46299x + ((f / COS54) * SIN18), point.f46300y + ((f / COS54) * COS18));
                    break;
                case 2:
                    point2.set(point.f46299x + (f / TAN36), point.f46300y + f);
                    point3.set(-point2.f46299x, point.f46300y + f);
                    break;
                case 3:
                    adjacentPoints2 = adjacentPointsArr[1];
                    point2.set(-adjacentPoints2.p3.f46299x, adjacentPoints2.p3.f46300y);
                    point3.set(-adjacentPoints2.p1.f46299x, adjacentPoints2.p1.f46300y);
                    break;
                case 4:
                    adjacentPoints2 = adjacentPointsArr[0];
                    point2.set(-adjacentPoints2.p3.f46299x, adjacentPoints2.p3.f46300y);
                    point3.set(-adjacentPoints2.p1.f46299x, adjacentPoints2.p1.f46300y);
                    break;
                default:
                    f = new StringBuilder();
                    f.append("Unexpected Index:");
                    f.append(i);
                    throw new IllegalStateException(f.toString());
            }
            adjacentPointsArr[i] = adjacentPoints;
        }
    }
}
