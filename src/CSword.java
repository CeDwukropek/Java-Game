public class CSword extends CWeapon {
    CSword(float damage, String name, boolean upgradeable, boolean equiped)
    {
        super(damage, name, upgradeable, equiped, "short");
    }
    @Override
    public int getDispersion() { return 0; }
    public void changeName(String name) { this.name = name; }
}
