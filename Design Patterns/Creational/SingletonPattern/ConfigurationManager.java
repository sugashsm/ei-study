// File: SingletonPattern/ConfigurationManager.java
package SingletonPattern;

public class ConfigurationManager {
    // The single instance of this class
    private static ConfigurationManager instance;
    private String configValue;

    // Private constructor to prevent instantiation
    private ConfigurationManager() {
        configValue = "Default Config";
    }

    // Global access point to get the instance
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Method to get the configuration value
    public String getConfigValue() {
        return configValue;
    }

    // Method to set a new configuration value
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}
