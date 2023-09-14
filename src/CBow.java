public class CBow extends CWeapon{
    private int dispersion;
    CBow(float damage, String name, boolean upgradeable, boolean equiped, int dispersion)
    {
        super(damage, name, upgradeable, equiped, "long");
        this.dispersion = dispersion;
    }
    public int getDispersion() { return this.dispersion;}
}
