/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.ferrybig.bukkit.plugins.multiworld.rev2.natives.world.generation;

import me.ferrybig.bukkit.plugins.multiworld.rev2.natives.world.NativeWorld;

/**
 *
 * @author Fernando
 */
public interface NativeChunkPartGenerator {

    public void createChunk(int x, int z, NativeWorld world, short[][] blocks, byte[][] data);

}