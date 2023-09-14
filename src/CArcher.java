import java.util.concurrent.ThreadLocalRandom;

public class CArcher extends CWarior {
    public CArcher(float damage, String name, String profession) {
        super(
                damage,
                name,
                "Archer",
                new CBow(5f, "Podstawowy Luk", false, true, 5)
        );
    }
    @Override
    public boolean makeDamage(CWarior target) {
        float damage = this.getDamage();

        int randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);

        if(randomNum >= this.getWeapon().getDispersion()) {
            target.takeDamage(damage);
            return true;
        } else {
            this.takeDamage(target.getDamage());
            System.out.println("Nie trafiles w " + target.getName());
        }
        return false;
    }
    @Override
    public void setWeapon(CWeapon weapon) {
        this.weapon = weapon;
    }
}
