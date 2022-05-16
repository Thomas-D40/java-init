package org.example;

public class Soldier extends AbstractBrawlerChar {

    private int attackDamage;

    public Soldier(String name, int healthPoint, int moveSpeed, int attackDamage) {
        super(name, healthPoint, moveSpeed);
        this.attackDamage = attackDamage;
    }

    @Override
    public void attack(AbstractBrawlerChar enemy) {
        if (enemy == null || enemy.getHealthPoint() <= 0) {
            System.out.println("On ne frappe pas un ennemi à terre!");
            return;
        }

        int enemyHpAfterAtk = enemy.getHealthPoint() - attackDamage;

        enemy.setHealthPoint(enemyHpAfterAtk);
        System.out.println(String.format("%s attaque %s infligeant %d points de dégats, il lui reste %d pv.", name, enemy.getName(), attackDamage, enemyHpAfterAtk));

    }
}
