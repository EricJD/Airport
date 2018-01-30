import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
//import configuration.Configuration;

public class PushBackVehicleFactory {

    public static Object build() {
        Object componentPort = null;

        try {
            URL[] urls = {new File(Configuration.instance.commonPathToJavaArchive + "/pushbackvehicle.jar").toURI().toURL()};
            URLClassLoader urlClassLoader = new URLClassLoader(urls, PushBackVehicleFactory.class.getClassLoader());
            Class pushBackVehicleClass = Class.forName("PushBackVehicle",true,urlClassLoader);
            Object pushBackVehicleInstance = pushBackVehicleClass.getMethod("getInstance",new Class[0]).invoke(null,new Object[0]);
            componentPort = pushBackVehicleClass.getDeclaredField("port").get(pushBackVehicleInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return componentPort;
    }

}
