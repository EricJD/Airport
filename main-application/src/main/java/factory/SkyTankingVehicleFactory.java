package factory;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import configuration.Configuration;


public class SkyTankingVehicleFactory {
    public static Object build() {
        Object componentPort = null;

        try {
            URL[] urls = {new File(Configuration.instance.commonPathToJavaArchive + "/skytankingvehicle.jar").toURI().toURL()};
            URLClassLoader urlClassLoader = new URLClassLoader(urls, SkyTankingVehicleFactory.class.getClassLoader());
            Class skyTankingVehicleClass = Class.forName("main.SkyTankingVehicle",true,urlClassLoader);
            Object skyTankingVehicleInstance = skyTankingVehicleClass.getMethod("getInstance",new Class[0]).invoke(null,new Object[0]);
            componentPort = skyTankingVehicleClass.getDeclaredField("port").get(skyTankingVehicleInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return componentPort;
    }

}
