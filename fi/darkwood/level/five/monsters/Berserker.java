/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.darkwood.level.five.monsters;

import fi.darkwood.Creature;
import fi.darkwood.Monster;
import fi.mirake.Local;

/**
 *
 * @author Ville
 */
public class Berserker extends Monster {
    public Berserker() {
        super(Local.get("berserker"), "/images/monster/BarbarianMasked 40x70 15 frames.png", 40);
        setCreatureType(Creature.HUMANOID);
    }

}
