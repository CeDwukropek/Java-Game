public abstract class CWeapon implements IBase {
    private float damage;
    protected String name;
    private boolean upgradeable;
    private boolean equiped;
    private String range;
    public CWeapon(float damage, String name, boolean upgradeable, boolean equiped, String range)
    {
        this.damage = damage;
        this.name = name;
        this.upgradeable = upgradeable;
        this.equiped = equiped;
        this.range = range;
    }

    abstract public int getDispersion();
    public void equip() { this.equiped = true; }
    public void unEquip() { this.equiped = false; }
    public float getDamage() { return this.damage; }
    public String getName() { return this.name; }
    public boolean getEquipped() { return this.equiped; }
    public boolean getUpgradeable() { return this.upgradeable; }
    public boolean upgradeWeapon(float amount) {
        if(!upgradeable) return false;
        this.damage += amount;
        return true;
    }
}
