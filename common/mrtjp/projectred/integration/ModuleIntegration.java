package mrtjp.projectred.integration;

import mrtjp.projectred.core.IProjectRedModule;
import mrtjp.projectred.core.IProxy;
import cpw.mods.fml.common.network.IGuiHandler;

public class ModuleIntegration implements IProjectRedModule {

    @Override
    public IProxy getCommonProxy() {
        return new IntegrationProxy();
    }

    @Override
    public IProxy getClientProxy() {
        return new IntegrationClientProxy();
    }
    
    @Override
    public IGuiHandler getGuiHandler() {
        return null;
    }

    @Override
    public String getModuleID() {
        return "Integration";
    }

    @Override
    public String[] getModuleDependencies() {
        return null;
    }

}
