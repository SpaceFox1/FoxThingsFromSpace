package br.com.talesgardem.spacefox.foxthingsfromspace.datagen;

import br.com.talesgardem.spacefox.foxthingsfromspace.blocks.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;
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
    }
}
