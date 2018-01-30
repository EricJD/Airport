public enum Configuration {
    instance;

    public String lineSeparator = System.getProperty("line.separator");
    public String fileSeparator = System.getProperty("file.separator");
    public String userDirectory = System.getProperty("user.dir");
    public String logFile = userDirectory + fileSeparator + "log" + fileSeparator + "persistence.log";
    public String dataPath = userDirectory + fileSeparator + "data" + fileSeparator;
    public String baggage_archive = userDirectory + fileSeparator + "data" + fileSeparator + "baggage.csv";
}