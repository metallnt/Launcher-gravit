package pro.gravit.launcher.modules;
@Deprecated
public interface ModuleContext {
    enum Type {
        SERVER, CLIENT, LAUNCHSERVER
    }

    Type getType();

    ModulesManager getModulesManager();

    ModulesConfigManager getModulesConfigManager();
}
