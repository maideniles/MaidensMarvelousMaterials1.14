package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

	public static Item CRABAPPLE_BLOSSOMS;
	public static Item POINCIANA_BLOSSOMS;
	public static Item LABURNUM_BLOSSOMS;
	public static Item JADE_BLOSSOMS;
	public static Item PAULOWNIA_BLOSSOMS;
	public static Item WISTERIA_BLOSSOMS;
	public static Item JACARANDA_BLOSSOMS;
	public static Item DOGWOOD_BLOSSOMS;
	public static Item SILVERBELL_BLOSSOMS;

	public static Item PRUNING_SHEARS;
	//public static Item FLORAL_ESSENCE;
	//public static Item EARTHEN_ESSENCE;



    public static final IItemProvider GROUT = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
      //  Item GROUT = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)), "grout");
     //   Item DARK_IRON_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)), "dark_iron_mix");
      //  Item DARK_IRON_INGOT = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)), "dark_iron_ingot");
     //   Item DARK_IRON_INLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)), "dark_iron_inlay");

        Item RED_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"red_clay");
        Item ORANGE_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"orange_clay");
        Item YELLOW_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"yellow_clay");
        Item LIME_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"lime_clay");
        Item GREEN_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"green_clay");
        Item CYAN_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"cyan_clay");
        Item LIGHT_BLUE_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"light_blue_clay");
        Item BLUE_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"blue_clay");
        Item PURPLE_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"purple_clay");
        Item MAGENTA_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"magenta_clay");
        Item PINK_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pink_clay");
        Item WHITE_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"white_clay");
        Item LIGHT_GRAY_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"light_gray_clay");
        Item GRAY_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"gray_clay");
        Item BLACK_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"black_clay");
        Item BROWN_CLAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"brown_clay");

        Item RED_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"red_clay_mix");
        Item ORANGE_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"orange_clay_mix");
        Item YELLOW_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"yellow_clay_mix");
        Item LIME_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"lime_clay_mix");
        Item GREEN_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"green_clay_mix");
        Item CYAN_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"cyan_clay_mix");
        Item LIGHT_BLUE_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"light_blue_clay_mix");
        Item BLUE_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"blue_clay_mix");
        Item PURPLE_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"purple_clay_mix");
        Item MAGENTA_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"magenta_clay_mix");
        Item PINK_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pink_clay_mix");
        Item WHITE_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"white_clay_mix");
        Item LIGHT_GRAY_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"light_gray_clay_mix");
        Item GRAY_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"gray_clay_mix");
        Item BLACK_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"black_clay_mix");
        Item BROWN_CLAY_MIX = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"brown_clay_mix");

        Item RED_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"red_brick");
        Item ORANGE_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"orange_brick");
        Item YELLOW_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"yellow_brick");
        Item LIME_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"lime_brick");
        Item GREEN_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"green_brick");
        Item CYAN_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"cyan_brick");
        Item LIGHT_BLUE_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"light_blue_brick");
        Item BLUE_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"blue_brick");
        Item PURPLE_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"purple_brick");
        Item MAGENTA_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"magenta_brick");
        Item PINK_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pink_brick");
        Item WHITE_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"white_brick");
        Item LIGHT_GRAY_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"light_gray_brick");
        Item GRAY_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"gray_brick");
        Item BLACK_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"black_brick");
        Item BROWN_BRICK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"brown_brick");

        Item CLAY_VASE_RED = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_red");
        Item CLAY_VASE_ORANGE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_orange");
        Item CLAY_VASE_YELLOW = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_yellow");
        Item CLAY_VASE_LIME = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_lime");
        Item CLAY_VASE_GREEN = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_green");
        Item CLAY_VASE_CYAN = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_cyan");
        Item CLAY_VASE_LIGHT_BLUE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_light_blue");
        Item CLAY_VASE_BLUE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_blue");
        Item CLAY_VASE_PURPLE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_purple");
        Item CLAY_VASE_MAGENTA = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_magenta");
        Item CLAY_VASE_PINK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_pink");
        Item CLAY_VASE_WHITE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_white");
        Item CLAY_VASE_LIGHT_GRAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_light_gray");
        Item CLAY_VASE_GRAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_gray");
        Item CLAY_VASE_BLACK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_black");
        Item CLAY_VASE_BROWN = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"clay_vase_brown");

        Item MICA_CHUNK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"mica_chunk");
        Item MICA_FRAGMENTS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"mica_fragments");
        Item MICA_POWDER = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"mica_powder");
         PRUNING_SHEARS = registerItem(new Item(new Item.Properties().maxDamage(48).group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pruning_shears");
        Item MORTAR_N_PESTLE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"mortar_and_pestle");

        Item GUIDE_BOOK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"guide_book");



	 Item AMETHYST_FRAGMENTS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"amethyst_fragments");
	 Item AVENTURINE_FRAGMENTS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"aventurine_fragments");
	 Item CARNELIAN_FRAGMENTS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"carnelian_fragments");
	 Item CHALCOPYRITE_FRAGMENTS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"chalcopyrite_fragments");
	 Item CITRINE_FRAGMENTS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"citrine_fragments");
	 Item JADE_FRAGMENTS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"jade_fragments");
	 Item JASPER_FRAGMENTS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"jasper_fragments");
	 Item LABRADORITE_FRAGMENTS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"labradorite_fragments");
	 Item MOONSTONE_FRAGMENTS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"moonstone_fragments");
	 Item ROSE_QUARTZ_FRAGMENTS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"rose_quartz_fragments");
	 Item SODALITE_FRAGMENTS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"sodalite_fragments");

	 Item AMETHYST_CHUNK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"amethyst_chunk");
	 Item AVENTURINE_CHUNK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"aventurine_chunk");
	 Item CARNELIAN_CHUNK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"carnelian_chunk");
	 Item CHALCOPYRITE_CHUNK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"chalcopyrite_chunk");
	 Item CITRINE_CHUNK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"citrine_chunk");
	 Item JADE_CHUNK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"jade_chunk");
	 Item JASPER_CHUNK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"jasper_chunk");
	 Item LABRADORITE_CHUNK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"labradorite_chunk");
	 Item MOONSTONE_CHUNK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"moonstone_chunk");
	 Item ROSE_QUARTZ_CHUNK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"rose_quartz_chunk");
	 Item SODALITE_CHUNK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"sodalite_chunk");

	  //FLORAL_ESSENCE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"floral_essence");
	 // EARTHEN_ESSENCE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"earthen_essence");

	 Item DOOR_PLANS_1 = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"door_plans_1");
	 Item DOOR_PLANS_2 = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"door_plans_2");
	 Item DOOR_PLANS_3 = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"door_plans_3");
	 Item DOOR_PLANS_4 = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"door_plans_4");
	 Item DOOR_PLANS_5 = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"door_plans_5");
	 Item DOOR_PLANS_6 = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"door_plans_6");

		CRABAPPLE_BLOSSOMS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"crabapple_blossoms");
		POINCIANA_BLOSSOMS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"poinciana_blossoms");
		LABURNUM_BLOSSOMS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"laburnum_blossoms");
		JADE_BLOSSOMS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"jade_blossoms");
		PAULOWNIA_BLOSSOMS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"paulownia_blossoms");
		WISTERIA_BLOSSOMS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"wisteria_blossoms");
		JACARANDA_BLOSSOMS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"jacaranda_blossoms");
		DOGWOOD_BLOSSOMS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dogwood_blossoms");
		SILVERBELL_BLOSSOMS = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"silverbell_blossoms");

	 Item PULVERIZED_RED = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_red");
	 Item PULVERIZED_ORANGE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_orange");
	 Item PULVERIZED_YELLOW = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_yellow");
	 Item PULVERIZED_LIME = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_lime");
	 Item PULVERIZED_GREEN = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_green");
	 Item PULVERIZED_CYAN = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_cyan");
	 Item PULVERIZED_LIGHT_BLUE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_light_blue");
	 Item PULVERIZED_BLUE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_blue");
	 Item PULVERIZED_PURPLE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_purple");
	 Item PULVERIZED_MAGENTA = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_magenta");
	 Item PULVERIZED_PINK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_pink");
	 Item PULVERIZED_WHITE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_white");
	 Item PULVERIZED_LIGHT_GRAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_light_gray");
	 Item PULVERIZED_GRAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_gray");
	 Item PULVERIZED_BLACK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_black");
	 Item PULVERIZED_BROWN = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"pulverized_brown");

	 Item WHITEwash = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"whitewash");

	 Item DYE_BATH_RED = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_red");
	 Item DYE_BATH_ORANGE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_orange");
	 Item DYE_BATH_YELLOW = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_yellow");
	 Item DYE_BATH_LIME = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_lime");
	 Item DYE_BATH_GREEN = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_green");
	 Item DYE_BATH_CYAN = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_cyan");
	 Item DYE_BATH_LIGHT_BLUE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_light_blue");
	 Item DYE_BATH_BLUE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_blue");
	 Item DYE_BATH_PURPLE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_purple");
	 Item DYE_BATH_MAGENTA = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_magenta");
	 Item DYE_BATH_PINK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_pink");
	 Item DYE_BATH_WHITE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_white");
	 Item DYE_BATH_LIGHT_GRAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_light_gray");
	 Item DYE_BATH_GRAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_gray");
	 Item DYE_BATH_BLACK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_black");
	 Item DYE_BATH_BROWN = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"dye_bath_brown");

	 Item STAIN_RED = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_red");
	 Item STAIN_ORANGE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_orange");
	 Item STAIN_YELLOW = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_yellow");
	 Item STAIN_LIME = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_lime");
	 Item STAIN_GREEN = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_green");
	 Item STAIN_CYAN = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_cyan");
	 Item STAIN_LIGHT_BLUE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_light_blue");
	 Item STAIN_BLUE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_blue");
	 Item STAIN_PURPLE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_purple");
	 Item STAIN_MAGENTA = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_magenta");
	 Item STAIN_PINK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_pink");
	 Item STAIN_WHITE = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_white");
	 Item STAIN_LIGHT_GRAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_light_gray");
	 Item STAIN_GRAY = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_gray");
	 Item STAIN_BLACK = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_black");
	 Item STAIN_BROWN = registerItem(new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP)),"stain_brown");


    }

    public static Item registerItem(Item item, String name)
    {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}