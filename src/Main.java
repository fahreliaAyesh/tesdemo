class HitungLuasLingkaran {

    public static final double PHI = 3.14;
    public double r;

//JAVA DOC

    /**
     *
     * @param radius
     */
    public HitungLuasLingkaran(double radius) {
        this.r = radius;
    }

    /**
     *
     * @return
     */
    public double get() {
        return r;
    }

    /**
     *
     * @param r
     */
    public void set(double r) {
        this.r = r;
    }


    // Main method
    public static void main(String[] args) {
        HitungLuasLingkaran lingkaran = new HitungLuasLingkaran(2.5);
        System.out.println("Radius: " + lingkaran.r);
        System.out.println("Area: " + getArea(lingkaran));
    }

    /**
     *
     * @param lingkaran
     * @return
     */
    private static double getArea(HitungLuasLingkaran lingkaran) {
        return PHI * lingkaran.r * lingkaran.r;
    }
}



