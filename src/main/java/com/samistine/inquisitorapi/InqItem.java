/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samistine.inquisitorapi;

import java.util.Map;

/**
 *
 * @author Samuel
 */
public class InqItem {

    private final int amount;
    private final int data;
    private final int durability;
    private final int type;
    private final Map<String, Integer> enchantments;

    public InqItem(int amount, Map<String, Integer> enchantments, int durability, int data, int type) {
        this.amount = amount;
        this.enchantments = enchantments;
        this.durability = durability;
        this.data = data;
        this.type = type;
    }

    /**
     * The size of the stack
     *
     * @return
     */
    public int getAmount() {
        return amount;
    }

    /**
     * The material of this item
     *
     * See
     * <a href="http://minecraft-ids.grahamedgecombe.com/">http://minecraft-ids.grahamedgecombe.com/</a>
     *
     * @return
     */
    public int getType() {
        return type;
    }

    public int getData() {
        return data;
    }

    public int getDurability() {
        return durability;
    }

    /**
     * String = the enchantment name<br>
     * Integer = the level of this enchantment
     *
     * @return
     */
    public Map<String, Integer> getEnchantments() {
        return enchantments;
    }

    @Override
    public String toString() {
        return "InqItem{" + "amount=" + amount + ", data=" + data + ", durability=" + durability + ", type=" + type + ", enchantments=" + enchantments + '}';
    }

}
