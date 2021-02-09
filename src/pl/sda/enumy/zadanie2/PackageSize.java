package pl.sda.enumy.zadanie2;

public enum PackageSize {
    SMALL(1, 5),
    MEDIUM(6, 50),
    LARGE(51, 150),
    UNKNOWN(0, 0);

    PackageSize(int min, int max) {
        this.min = min;
        this.max = max;
    }

    private int min;
    private int max;

    public static PackageSize getPackageSize(int minSize, int maxSize) {
        for ( PackageSize packageSize : values() )
            if (packageSize.min < minSize && packageSize.max > maxSize) {
                return packageSize;
            }
        return UNKNOWN;
    }


}
