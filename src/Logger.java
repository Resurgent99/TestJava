public class Logger {
    private static Logger instance;
    private Logger(){
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public static void setInstance(Logger logger){
        instance=logger;
    }

    public void log(String message){
        System.out.println(message);
    }
}
