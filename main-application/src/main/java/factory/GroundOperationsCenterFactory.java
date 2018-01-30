package factory;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import configuration.Configuration;

public class GroundOperationsCenterFactory {
    public static Object build() {
        Object componentPort = null;

        try {
            URL[] urls = {new File(Configuration.instance.commonPathToJavaArchive + "/ground_operations_control_center.jar").toURI().toURL()};
            URLClassLoader urlClassLoader = new URLClassLoader(urls, GroundOperationsCenterFactory.class.getClassLoader());
            Class GroundOperationsCenterClass = Class.forName("GroundoperationsCenterClass", true, urlClassLoader);
            Object GroundOperationsCenterInstance = GroundOperationsCenterClass.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            componentPort = GroundOperationsCenterClass.getDeclaredField("port").get(GroundOperationsCenterInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return componentPort;
    }
}
