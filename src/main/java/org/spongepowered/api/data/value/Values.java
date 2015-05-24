/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.data.value;

import com.flowpowered.math.vector.Vector3d;
import com.google.common.base.Optional;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.data.Exp;
import org.spongepowered.api.data.marker.AchievementData;
import org.spongepowered.api.data.marker.AgeData;
import org.spongepowered.api.data.marker.ArtData;
import org.spongepowered.api.data.marker.BanData;
import org.spongepowered.api.data.marker.BlockTypeData;
import org.spongepowered.api.data.marker.BreathingData;
import org.spongepowered.api.data.marker.DamageableData;
import org.spongepowered.api.data.marker.DamagingData;
import org.spongepowered.api.data.marker.EntityTypeData;
import org.spongepowered.api.data.marker.ExperienceHolderData;
import org.spongepowered.api.data.marker.EyeLocationData;
import org.spongepowered.api.data.marker.FallingBlockData;
import org.spongepowered.api.data.marker.FoodData;
import org.spongepowered.api.data.marker.GameData;
import org.spongepowered.api.data.marker.HorseData;
import org.spongepowered.api.data.marker.IgniteableData;
import org.spongepowered.api.data.marker.InvisibilityData;
import org.spongepowered.api.data.marker.JoinData;
import org.spongepowered.api.data.marker.PartRotationData;
import org.spongepowered.api.data.marker.SizeData;
import org.spongepowered.api.data.marker.StatisticData;
import org.spongepowered.api.data.type.*;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.entity.Tamer;
import org.spongepowered.api.entity.hanging.Painting;
import org.spongepowered.api.entity.living.*;
import org.spongepowered.api.entity.living.animal.Animal;
import org.spongepowered.api.entity.living.monster.Creeper;
import org.spongepowered.api.entity.living.monster.Zombie;
import org.spongepowered.api.entity.player.Player;
import org.spongepowered.api.entity.player.User;
import org.spongepowered.api.entity.player.gamemode.GameMode;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.item.merchant.TradeOffer;
import org.spongepowered.api.statistic.Statistic;
import org.spongepowered.api.statistic.achievement.Achievement;
import org.spongepowered.api.util.Axis;
import org.spongepowered.api.util.Direction;
import org.spongepowered.api.util.ban.Ban;
import org.spongepowered.api.util.rotation.Rotation;
import org.spongepowered.api.world.Location;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class Values {
    private Values() {}

    // Block props

    // TODO missing Dyeable?
    // TODO missing Rotation
    // TODO missing Wet
    // TODO missing base manipulators in data.manipulators.*
    // TODO collection props

    /**
     * Represents whether a block that is "attached" or "hanging" on a block.
     *
     * <p>Mainly for {@link BlockTypes#TRIPWIRE}.</p>
     *
     * @see BlockTypes#TRIPWIRE
     */
    public static final Value<Boolean> IS_ATTACHED = null;

    /**
     * Represents the {@link Axis} that a block that is aligned upon.
     *
     * <p>Mainly for {@link BlockTypes#HAY_BLOCK}>
     *
     * @see BlockTypes#HAY_BLOCK
     * @see BlockTypes#LOG
     * @see BlockTypes#LOG2
     */
    public static final Value<Axis> AXIS = null;

    /**
     * Represents the {@link Axis} that a block is aligned vertically to.
     * Can be {@link Axis#X} or {@link Axis#Z}.
     *
     * <p>Mainly for {@link BlockTypes#PORTAL}.</p>
     *
     * @see BlockTypes#PORTAL
     */
    public static final Value<Axis> VERTICAL_AXIS = null;

    /**
     * Represents the {@link BigMushroomType} of a block.
     *
     * <p>Mainly for big mushroom blocks>
     *
     * @see BlockTypes#BROWN_MUSHROOM_BLOCK
     * @see BlockTypes#RED_MUSHROOM_BLOCK
     */
    public static final Value<BigMushroomType> BIG_MUSHROOM_TYPE = null;

    /**
     * Represents the {@link BrickType} of a block.
     *
     * <p>Mainly for {@link BlockTypes#STONEBRICK}</p>
     *
     * @see BlockTypes#STONEBRICK
     */
    public static final Value<BrickType> BRICK_TYPE = null;

    /**
     * Represents the type of {@link Comparison} of a block.
     *
     * <p>Mainly for {@link BlockTypes#POWERED_COMPARATOR} and {@link BlockTypes#UNPOWERED_COMPARATOR}.</p>
     *
     * @see BlockTypes#POWERED_COMPARATOR
     * @see BlockTypes#UNPOWERED_COMPARATOR
     */
    public static final Value<Comparison> COMPARISON_TYPE = null;

    /**
     * Represents the {@link Direction}s a block is "connected" to.
     *
     * <p>Mainly for {@link BlockTypes#GLASS_PANE}>
     *
     * @see BlockTypes#GLASS_PANE
     * @see BlockTypes#STAINED_GLASS_PANE
     * @see BlockTypes#IRON_BARS
     */
    public static final Value<List<Direction>> CONNECTED_DIRECTIONS = null;

    /**
     * Represents that a block will "decay" or be removed after a certain time.
     *
     * <p>Mainly for leaves>
     *
     * @see BlockTypes#LEAVES
     * @see BlockTypes#LEAVES2
     */
    public static final Value<Boolean> IS_DECAYABLE = null;

    /**
     * Represents what {@link Direction} a block is facing.
     * The available directions can vary.
     *
     * <p>Mainly for "rotational" blocks>
     *
     * @see BlockTypes#LOG
     * @see BlockTypes#LOG2
     */
    public static final Value<Direction> FACING = null;

    /**
     * Represents the {@link DirtType} for a block.
     *
     * <p>Mainly for {@link BlockTypes#DIRT}.</p>
     *
     * @see BlockTypes#DIRT
     */
    public static final Value<DirtType> DIRT_TYPE = null;

    /**
     * Represents that a block is "disarmed" and won't activate.
     *
     * <p>Mainly for {@link BlockTypes#TRIPWIRE_HOOK}s</p>
     *
     * @see BlockTypes#TRIPWIRE_HOOK
     */
    public static final Value<Boolean> IS_DISARMED = null;

    /**
     * Represents the {@link DisguisedBlockType} of a block.
     *
     * <p>Mainly for {@link BlockTypes#MONSTER_EGG}.</p>
     *
     * @see BlockTypes#MONSTER_EGG
     */
    public static final Value<DisguisedBlockType> DISGUISED_BLOCK_TYPE = null;

    /**
     * Represents the {@link DoubleSizePlantType} of a block.
     *
     * <p>Mainly for {@link BlockTypes#DOUBLE_PLANT}.</p>
     *
     * @see BlockTypes#DOUBLE_PLANT
     */
    public static final Value<DoubleSizePlantType> DOUBLE_PLANT_TYPE = null;

    /**
     * Represents whether a block is "extended" and takes up extra space.
     *
     * <p>Mainly for {@link BlockTypes#PISTON} or {@link BlockTypes#STICKY_PISTON}.</p>
     *
     * @see BlockTypes#PISTON
     * @see BlockTypes#STICKY_PISTON
     */
    public static final Value<Boolean> IS_EXTENDED = null;

    /**
     * Represents that a block is in its "filled" state.
     *
     * <p>Mainly for {@link BlockTypes#END_PORTAL_FRAME}.</p>
     *
     * @see BlockTypes#END_PORTAL_FRAME
     */
    public static final Value<Boolean> IS_FILLED = null;

    /**
     * Represents the "fluid level" or height of a liquid block.
     *
     * <p>Mainly for liquid blocks>
     *
     * @see BlockTypes#WATER
     * @see BlockTypes#FLOWING_WATER
     * @see BlockTypes#LAVA
     * @see BlockTypes#FLOWING_LAVA
     */
    public static final BoundedValue<Integer> FLUID_LEVEL = null;

    /**
     * Represents the "growth" or "age" of a block.
     *
     * <p>Mainly for growable blocks>
     *
     * @see BlockTypes#SAPLING
     * @see BlockTypes#WHEAT
     * @see BlockTypes#CACTUS
     * @see BlockTypes#REEDS
     * @see BlockTypes#PUMPKIN_STEM
     * @see BlockTypes#NETHER_BRICK
     * @see BlockTypes#CARROTS
     * @see BlockTypes#POTATOES
     */
    public static final BoundedValue<Integer> GROWTH_STAGE = null;

    // naming
    /**
     * Represents the "side" that a "hinge" is facing on a door. Usually
     * applicable to {@link BlockTypes#TRAPDOOR} and other doors.
     */
    public static final Value<Hinge> HINGE = null;

    /**
     * Represents the {@link InstrumentType}. Usually applicable to
     * {@link BlockTypes#NOTEBLOCK}.
     */
    public static final Value<InstrumentType> INSTRUMENT_TYPE = null;

    /**
     * Signifies that the owner is "connected" to a wall. Usually applicable to
     * {@link BlockTypes#FENCE_GATE}.
     */
    public static final Value<Boolean> IS_IN_WALL = null;

    /**
     * Represents the "layer" of an owner. Usually applicable to
     * {@link BlockTypes#CAKE}> LAYER = null;

    /**
     * Represents the "moisture" level of a block. Usually applicable to
     * {@link BlockTypes#FARMLAND}.
     */
    public static final BoundedValue<Integer> MOISTURE = null;

    // WILL_NOT_DROP? Depends on default
    /**
     * Signifies that the owner will drop something. Usually applicable
     * to {@link BlockTypes#SKULL}.
     */
    public static final Value<Boolean> WILL_DROP = null;

    /**
     * Signifies that a block is considered "occupied". Usually applicable to
     * {@link BlockTypes#BED}.
     */
    public static final Value<Boolean> IS_OCCUPIED = null;

    /**
     * Signifies that a block is "open". Usually applies to all doors.
     */
    public static final Value<Boolean> IS_OPEN = null;

    /**
     * Represents the {@link PistonType} of a {@link BlockTypes#PISTON_HEAD}.
     */
    public static final Value<PistonType> PISTON_TYPE = null;

    /**
     * Represents the "portion" of a block such as the top or bottom half of a
     * door. Usually applies to all {@link BlockTypes#ACACIA_DOOR}> PORTION = null;

    /**
     * Signifies that a block is "powered".
     */
    public static final Value<Boolean> IS_POWERED = null;

    /**
     * Represents the {@link PrismarineType} of a
     * {@link BlockTypes#PRISMARINE}.
     */
    public static final Value<PrismarineType> PRISMARINE_TYPE = null;

    /**
     * Represents the {@link QuartzType} of a
     * {@link BlockTypes#QUARTZ_BLOCK}.
     */
    public static final Value<QuartzType> QUARTZ_TYPE = null;

    /**
     * Represents the {@link RailDirection} of a {@link BlockTypes#RAIL} and
     * other types of rails.
     */
    public static final Value<RailDirection> RAIL_DIRECTION = null;

    // Also "Powered"?
    /**
     * Signifies that a block has some value of redstone power applied to it.
     * Usually applicable for all blocks.
     */
    public static final BoundedValue<Integer> REDSTONE_POWERED = null;

    /**
     * Signifies that a block is rotated with a {@link Rotation}.
     */
    public static final Value<SandType> SAND_TYPE = null;

    /**
     * Represents the {@link SandstoneType} of a sandstone based block. Usually
     * applicable to {@link BlockTypes#SANDSTONE} and
     * {@link BlockTypes#RED_SANDSTONE}.
     */
    public static final Value<SandstoneType> SANDSTONE_TYPE = null;

    /**
     * Signifies that a block is "seamless". Usually applicable to
     * {@link BlockTypes#DOUBLE_STONE_SLAB},
     * {@link BlockTypes#DOUBLE_STONE_SLAB2},
     * and {@link BlockTypes#DOUBLE_WOODEN_SLAB}.
     */
    public static final Value<Boolean> IS_SEAMLESS = null;

    /**
     * Represents the {@link ShrubType} of a {@link BlockTypes#TALLGRASS}.
     */
    public static final Value<ShrubType> SHRUB_TYPE = null;

    /**
     * Represents the signal strength of some redstone blocks> SIGNAL_OUTPUT = null;

    /**
     * Represents the {@link SlabType} of slabs.
     */
    public static final Value<SlabType> SLAB_TYPE = null;

    // IS_SNOWED?
    /**
     * Signifies that a block is considered to be "snowed. Usually applicable
     * to {@link BlockTypes#GRASS}> HAS_SNOW = null;

    /**
     * Represents the {@link StairShape} of a stair block.
     */
    public static final Value<StairShape> STAIR_SHAPE = null;

    /**
     * Represents the {@link StoneType} of a {@link BlockTypes#STONE}.
     */
    public static final Value<StoneType> STONE_TYPE = null;

    /**
     * Signifies that a block is "suspended". Usually applicable to
     * {@link BlockTypes#TRIPWIRE} and {@link BlockTypes#TRIPWIRE_HOOK}.
     */
    public static final Value<Boolean> IS_SUSPENDED = null;

    /**
     * Represents the {@link TreeType} for various tree based blocks. Usually
     * applicable to {@link BlockTypes#SAPLING}> TREE_TYPE = null;

    /**
     * Represents the {@link WallType} of a
     * {@link BlockTypes#COBBLESTONE_WALL}.
     */
    public static final Value<WallType> WALL_TYPE = null;

    /**
     * The {@link AchievementData} class that can be applied to
     * {@link Player}s.
     */
    public static final Value<Set<Achievement>> ACHIEVEMENTS = null;

    /**
     * Represents age determining whether an
     * {@link Entity} is a child or an adult. Always exists for
     * {@link Ageable} entities.
     */
    public static final BoundedValue<Integer> AGE = null;

    // TODO there are other ways to do this> IS_ADULT = null;

    /**
     * Represents whether the {@link Entity} is a baby. Always exists for
     * {@link Ageable} entities.
     */
    public static final Value<Boolean> IS_BABY = null;

    /**
     * Checks whether the {@link Entity} has AI enabled.
     * Usually applicable to {@link Agent}s.
     */
    public static final Value<Boolean> AI_ENABLED = null;

    /**
     * Checks whether the {@link Entity} is currently aggressive.
     * Usually applicable to {@link Agent}s.
     */
    public static final Value<Boolean> IS_AGGRESSIVE = null;

    /**
     * The time for an {@link Agent} that is currently angry to calm down.
     */
    public static final BoundedValue<Boolean> IS_ANGRY = null;

    /**
     * Represents the time for an {@link Agent} that is currently angry to calm down.
     */
    public static final BoundedValue<Integer> ANGER_LEVEL = null;

    /**
     * Represents what piece of {@link Art} is being
     * displayed. It is applicable for {@link Painting} entities.
     */
    public static final Value<Art> ART = null;

    // TODO attribute data

    /**
     * Represents the bans made>> BANS = null;

    /**
     * Represents the head rotation of an entity. Usually
     * applicable to {@link Human}s and {@link ArmorStand}s.
     */
    public static final Value<Vector3d> HEAD_ROTATION = null;

    /**
     * Represents the body rotation of an entity. Usually
     * applicable to {@link Human}s and {@link ArmorStand}s.
     */
    public static final Value<Vector3d> BODY_ROTATION = null;

    /**
     * Represents the rotation of the left arm of an entity. Usually
     * applicable to {@link Human}s and {@link ArmorStand}s.
     */
    public static final Value<Vector3d> LEFT_ARM_ROTATION = null;

    /**
     * Represents the rotation of the right arm of an entity. Usually
     * applicable to {@link Human}s and {@link ArmorStand}s.
     */
    public static final Value<Vector3d> RIGHT_ARM_ROTATION = null;

    /**
     * Represents the rotation of the left leg of an entity. Usually
     * applicable to {@link Human}s and {@link ArmorStand}s.
     */
    public static final Value<Vector3d> LEFT_LEG_ROTATION = null;

    /**
     * Represents the rotation of the right leg of an entity. Usually
     * applicable to {@link Human}s and {@link ArmorStand}s.
     */
    public static final Value<Vector3d> RIGHT_LEG_ROTATION = null;

    /**
     * Represents the remaining 'bubbles' of air left for an {@link Entity}.
     * Usually applies to {@link Living} entities but not {@link Aquatic} entities.
     */
    public static final Value<Integer> REMAINING_AIR = null;

    /**
     * Represents the max air 'bubbles' of air left for an {@link Entity}.
     * Usually applies to {@link Living} entities but not {@link Aquatic} entities.
     */
    public static final Value<Integer> MAX_AIR = null;

    /**
     * Represents that something is ready to breed. Usually applies to
     * {@link Animal}s> CAN_BREED = null;

    /**
     * Represents the {@link Career} of something.
     *
     * <p>Mainly for {@link Villager}, to describe their available trades and appearance.</p>
     *
     * @see Villager
     */
    public static final Value<Career> CAREER = null;

    /**
     * Represents whether something is "charged".
     *
     * <p>Mainly for {@link Creeper}s>
     *
     * @see Creeper
     */
    public static final Value<Boolean> IS_CHARGED = null;

    // TODO called CriticalHitData
    public static final Value<Boolean> WILL_PERFORM_CRITICAL_HIT = null;

    public static final Value<Living> LAST_ATTACKER = null;

    public static final Value<Double> LAST_DAMAGE = null;

    public static final Value<Integer> INVLUNLERABILITY_TICKS = null;

    public static final Value<Integer> MAX_INVLUNLERABILITY_TICKS = null;

    public static final Value<Double> DAMAGE = null;

    // TODO could do capitals> damageForEntity(EntityType type) {

    // TODO also IS_ELDER?
    public static final Value<Boolean> IS_ELDER_GUARDIAN = null;

    public static final Value<Exp> EXPERIENCE = null;

    public static final Value<Integer> EXPIRATION_TICKS = null;

    public static final Value<Integer> EXPLOSION_RADIUS = null;

    public static final GetterValue<Double> EYE_HEIGHT = null;

    public static final GetterValue<Double> EYE_LOCATION = null;

    public static final Value<Double> FALL_DAMAGE_PER_BLOCK = null;

    public static final Value<Double> MAX_FALL_DAMAGE = null;

    public static final Value<BlockState> BLOCK_STATE = null;

    public static final Value<Boolean> CAN_PLACE_AS_BLOCK = null;

    public static final Value<Double> CAN_DROP_AS_ITEM = null;

    public static final Value<Boolean> FLAMMABLE = null;

    public static final Value<Double> FLYING = null;

    public static final Value<Double> EXHAUSTION = null;

    public static final Value<Double> SATURATION = null;

    public static final Value<Double> FOOD_LEVEL = null;

    public static final Value<Integer> FUSE_DURATION = null;

    public static final Value<GameMode> GAME_MODE = null;

    public static final Value<Boolean> IS_HEALING_SOURCE = null;

    public static final Value<Integer> HEALTH = null;

    public static final Value<Integer> MAX_HEALTH = null;

    public static final Value<HorseStyle> HORSE_STYLE = null;

    public static final Value<HorseColor> HORSE_COLOR = null;

    public static final Value<HorseVariant> HORSE_VARIANT = null;

    public static final GetterValue<Integer> FIRE_DELAY = null;

    public static final GetterValue<Integer> FIRE_TICKS = null;

    public static Value<Boolean> invisibleTo(Player player) {
        return null;
    }

    public static final Value<Integer> INVLUNERABILE_TICKS = null;

    public static final Value<Boolean> HAS_JOINED_BEFORE = null;

    public static final GetterValue<Date> GET_FIRST_PLAYED = null;

    public static final GetterValue<Date> GET_LAST_PLAYED = null;

    public static final Value<Integer> KNOCKBACK_STRENGTH = null;

    public static final Value<Optional<Entity>> LEASH_HOLDER = null;

    public static final Value<OcelotType> OCELOT_TYPE = null;

    public static final Value<Integer> ORB_EXPERIENCE = null;

    public static final Value<Entity> VEHICLE = null;

    public static final GetterValue<Entity> BASE_VEHICLE = null;

    public static final Value<Boolean> WILL_PERSIST = null;

    public static final Value<Boolean> IS_PLAYER_CREATED = null;

    public static final Value<Boolean> PLAYER_DATA = null;

    public static final Value<RabbitType> RABBIT_TYPE = null;

    public static final Value<Location> RESPAWN_LOCATION = null;

    public static final Value<ItemStack> SADDLE = null;

    // meh on IS_SCREAMING
    public static final Value<Boolean> IS_GRIMACING = null;

    public static final GetterValue<Boolean> WILL_SHATTER = null;

    public static final GetterValue<Boolean> IS_SHEARED = null;

    public static final GetterValue<Boolean> IS_SITTING = null;

    public static final GetterValue<Float> BASE = null;

    public static final GetterValue<Float> HEIGHT = null;

    public static final GetterValue<Float> SCALE = null;

    public static final Value<SkeletonType> SKELETON_TYPE = null;

    public static final Value<Boolean> IS_SLEEPING = null;

    public static final Value<Integer> SLIME_SIZE = null;

    public static final Value<Boolean> IS_SNEAKING = null;

    public static Value<Long> statistic(Statistic statistic) {
        return null;
    }

    public static final Value<Tamer> OWNER = null;

    public static final Value<List<Living>> TARGETS = null;

    public static final Value<List<TradeOffer>> TRADE_OFFERS = null;

    public static final Value<Entity> PASSENGER = null;

    public static final GetterValue<Entity> TOP_PASSENGER = null;

    public static final Value<Vector3d> VELOCITY = null;

    public static final Value<Boolean> IS_VILLAGER_ZOMBIE = null;

    // TODO naming> IS_WHITELISTED = null;

}
