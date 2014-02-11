package appeng.transformer;

import java.util.Map;

import appeng.core.AEConfig;

import com.google.common.eventbus.EventBus;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.relauncher.FMLRelaunchLog;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;

@MCVersion("1.7.2")
public class AppEngCore extends DummyModContainer implements IFMLLoadingPlugin
{

	protected final ModMetadata md = new ModMetadata();

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	}

	public AppEngCore() {
		FMLRelaunchLog.info( "[AppEng] Core Init" );
		md.autogenerated = true;
		md.credits = "AlgorithmX2";
		md.modId = getModId();
		md.version = getVersion();
		md.name = getName();
	}

	@Override
	public boolean registerBus(EventBus bus, LoadController controller)
	{
		return true;
	}

	@Override
	public String[] getASMTransformerClass()
	{
		return new String[] { "appeng.transformer.AppEngASMTransformer" };
	}

	@Override
	public String getModContainerClass()
	{
		return "appeng.transformer.AppEngCore";
	}

	@Override
	public String getSetupClass()
	{
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data)
	{

	}

	@Override
	public String getModId()
	{
		return "AppliedEnergistics2-Core";
	}

	@Override
	public String getName()
	{
		return "AppliedEnergistics2 Core";
	}

	@Override
	public String getVersion()
	{
		return AEConfig.VERSION;
	}

	@Override
	public String getDisplayVersion()
	{
		return getVersion();
	}

	public ModMetadata getMetadata()
	{
		return md;
	}

	@Override
	public String getAccessTransformerClass()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
