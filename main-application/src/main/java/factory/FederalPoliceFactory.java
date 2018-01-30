package factory;

import configuration.Configuration;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class FederalPoliceFactory {
    public static Object build() {
        Object componentPort = null;

        try {
            URL[] urls = {new File(Configuration.instance.commonPathToJavaArchive + Configuration.instance.fileSeparator+"federal-police"+Configuration.instance.fileSeparator+"target"+Configuration.instance.fileSeparator+"federal-police-1.0.0.jar").toURI().toURL()};
            URLClassLoader urlClassLoader = new URLClassLoader(urls, FederalPoliceFactory.class.getClassLoader());
            Class federalPoliceClass = Class.forName("FederalPolice", true, urlClassLoader);
            Object federalPoliceInstance = federalPoliceClass.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            componentPort = federalPoliceClass.getDeclaredField("port").get(federalPoliceInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return componentPort;
    }


}
