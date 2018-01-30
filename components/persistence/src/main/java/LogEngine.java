import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogEngine {
    private PrintWriter printWriter;

    public LogEngine(String logFile) {
        try {
            printWriter = new PrintWriter(new File(logFile));
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public void write(String className,String methodName,String attributes,String message) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = new Date();
        String line = simpleDateFormat.format(currentDate) + ": [" + className + "|" + methodName + "], [" + attributes + "] : " + message;
        System.out.println(line);
        printWriter.write(line + Configuration.instance.lineSeparator);
    }

    public void close() {
        printWriter.close();
    }
}