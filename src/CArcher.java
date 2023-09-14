import java.util.concurrent.ThreadLocalRandom;

public class CArcher extends CWarior {

    public CArcher(float damage, String name, String profession) {
        super(damage, name, profession);
        this.profession = "Archer";
    }

    @Override
    public void makeDamage(CWarior target) {
        float damage = this.getWeapon() == null ? this.getDamage() : this.getDamage() + this.getWeapon().getDamage();
        int randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);

        if(randomNum > this.getWeapon().getDispersion()) {
            target.takeDamage(damage);
        } else {
            System.out.println("Nie trafiles");
        }
    }

    public void setWeapon(CBow weapon) {
        if(this.getWeapon() == null) this.setWeapon(weapon);
    }
}
