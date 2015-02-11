/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.darkwood.level.six.monsters;

import fi.darkwood.Monster;
import fi.mirake.Local;

/**
 *
 * @author Ville
 */
public class SkeletonKnight extends Monster {

    public SkeletonKnight() {
        super(Local.get("skeleton knight"), "/images/monster/skeleton_knight.png", 68);
        setCreatureType(super.UNDEAD);
    }
}
