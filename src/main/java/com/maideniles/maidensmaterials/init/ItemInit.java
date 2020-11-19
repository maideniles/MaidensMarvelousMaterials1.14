package init;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MarvelousMaterials.MODID);

    public static final RegistryObject<Item> FLORAL_ESSENCE = ITEMS.register("floral_essence",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

    public static final RegistryObject<Item> EARTHEN_ESSENCE = ITEMS.register("earthen_essence",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

    public static final RegistryObject<Item> GROUT = ITEMS.register("grout",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

    public static final RegistryObject<Item> DARK_IRON_MIX = ITEMS.register("dark_iron_mix",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

    public static final RegistryObject<Item> DARK_IRON_INGOT = ITEMS.register("dark_iron_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

    public static final RegistryObject<Item> DARK_IRON_INLAY = ITEMS.register("dark_iron_inlay",
            () -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

}
