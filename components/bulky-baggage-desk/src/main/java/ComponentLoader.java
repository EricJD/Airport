import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class ComponentLoader {
    public static Object loadComponent(String componentName, String className) {
        try {
            URL[] urls = {new File("components/" + componentName + "target/" + componentName + "-1.0.0.jar").toURI().toURL()};
            URLClassLoader urlClassLoader = new URLClassLoader(urls, ComponentLoader.class.getClassLoader());
            Class clazz = Class.forName(className, true, urlClassLoader);
            Object instance = clazz.getMethod("getInstance").invoke(null);
            return clazz.getDeclaredField("port").get(instance);
        } catch (Exception e) {
            throw new RuntimeException("Could not load component", e);
        }
    }
}
