package br.com.talesgardem.spacefox.foxthingsfromspace.datagen;

import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CLAYFILTER_BLOCK.get())
                .pattern("TST")
                .pattern("TBF")
                .pattern("TTT")
                .define('S', Items.BRICK)
                .define('T', Items.TERRACOTTA)
                .define('F', Items.IRON_NUGGET)
                .define('B', Fluids.WATER.getBucket())
                .unlockedBy("has_terracota", has(Items.TERRACOTTA))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPACEFOX_PLUSHIE_BLOCK.get())
                .pattern("OOO")
                .pattern("WJW")
                .pattern("R R")
                .define('W', Items.WHITE_WOOL)
                .define('O', Items.ORANGE_WOOL)
                .define('R', Items.RED_WOOL)
                .define('J', Items.JUKEBOX)
                .unlockedBy("has_white_wool", has(Items.WHITE_WOOL))
                .unlockedBy("has_orange_wool", has(Items.ORANGE_WOOL))
                .unlockedBy("has_red_wool", has(Items.RED_WOOL))
                .unlockedBy("has_jukebox", has(Items.JUKEBOX))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LOBO_PLUSHIE_BLOCK.get())
                .pattern("WGY")
                .pattern("PJC")
                .pattern("B B")
                .define('P', Items.STONE_PICKAXE)
                .define('G', Items.GRAY_WOOL)
                .define('W', Items.WHITE_WOOL)
                .define('Y', Items.YELLOW_WOOL)
                .define('C', Items.CYAN_WOOL)
                .define('B', Items.BLACK_WOOL)
                .define('J', Items.JUKEBOX)
                .unlockedBy("has_white_wool", has(Items.WHITE_WOOL))
                .unlockedBy("has_gray_wool", has(Items.GRAY_WOOL))
                .unlockedBy("has_yellow_wool", has(Items.YELLOW_WOOL))
                .unlockedBy("has_cyan_wool", has(Items.CYAN_WOOL))
                .unlockedBy("has_black_wool", has(Items.BLACK_WOOL))
                .unlockedBy("has_stone_pickaxe", has(Items.STONE_PICKAXE))
                .unlockedBy("has_jukebox", has(Items.JUKEBOX))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LEOBRINE_PLUSHIE_BLOCK.get())
                .pattern("BWK")
                .pattern("SJR")
                .pattern("K K")
                .define('S', ItemTags.SIGNS)
                .define('W', Items.WHITE_WOOL)
                .define('R', Items.RED_WOOL)
                .define('B', Items.BLUE_WOOL)
                .define('K', Items.BLACK_WOOL)
                .define('J', Items.JUKEBOX)
                .unlockedBy("has_white_wool", has(Items.WHITE_WOOL))
                .unlockedBy("has_red_wool", has(Items.RED_WOOL))
                .unlockedBy("has_blue_wool", has(Items.BLUE_WOOL))
                .unlockedBy("has_sign", has(ItemTags.SIGNS))
                .unlockedBy("has_jukebox", has(Items.JUKEBOX))
                .save(recipeOutput);
    }
}
