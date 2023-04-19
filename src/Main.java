public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.KINETIC, "Crossbow");
        Boss boss = new Boss("Dragon", 1000, 50, bossWeapon);

        System.out.println("Boss name: " + boss.getName());
        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss weapon type: " + boss.getWeapon().getType());
        System.out.println("Boss weapon name: " + boss.getWeapon().getWeaponName());
    }
}