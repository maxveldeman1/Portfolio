package be.daStudios.legendOfTheLamb.items.weapons;

import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.Item;

public class Sword extends Item implements Weapon {

    Dices attDice = Dices.D20;
    Dices dmgDice = Dices.D10;
    private int hitChance;
    private int damage;

    public Sword() {
        setName("Sword");
        super.setItemDescription(getDescription());
        super.setWeapon(true);
    }

    public String getDescription() {
        return "A sharpened piece of steel with a little wooden handle. Lethal how ever you look at it";
    }
    public int getHitChance() {
        return hitChance;
    }
    public int getDamage() {
        return damage;
    }
    public void setBasicHitChance() {
        this.hitChance = DiceThrow.diceThrow(attDice);
    }

    public void setBasicDamage() {
        this.damage = DiceThrow.diceThrow(dmgDice);
    }

}
