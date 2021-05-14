package edu.wctc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManaTest {

    @Test
    void addMana() {
        Mana mana = new Mana();
        MonsterStrategy monster = new MonsterStrategy();
        mana.addMana(new MonsterCard("ABCDEF", monster , Color.WHITE, 1, 1, 1));
        assertEquals(1, mana.getMana());
    }

    @Test
    void useMana() {
        Mana mana = new Mana();
        MonsterStrategy monster = new MonsterStrategy();
        mana.addMana(new MonsterCard("ABCDEF", monster , Color.WHITE, 1, 1, 1));
        int now = mana.getMana();
        mana.useMana(new MonsterCard("ABCDEF", monster , Color.WHITE, 1, 1, 1));
        assertEquals(0, mana.getMana());
    }

    @Test
    void restoreMana() {
        Mana mana = new Mana();
        Mana land = new Mana();
        MonsterStrategy monster = new MonsterStrategy();
        mana.addMana(new MonsterCard("ABCDEF", monster , Color.WHITE, 1, 1, 1));
        land.addMana(new MonsterCard("ABCDEF", monster , Color.WHITE, 1, 1, 1));
        int now = mana.getMana();
        mana.useMana(new MonsterCard("ABCDEF", monster , Color.WHITE, 1, 1, 1));
        mana.restoreMana(land);
        assertEquals(land.getMana(), mana.getMana());
    }
}