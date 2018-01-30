public class SpecialGoodRoboter {
    private String id;
    private boolean isDown = true;

    //private static SpecialGoodRoboter instance = new SpecialGoodRoboter(testRobot);

    public Port port;

    public SpecialGoodRoboter(String id) {
        this.id = id;
        port = new Port();
    }

    public boolean innerUp(){
        isDown = false;
        return  isDown;
    }

    public boolean innerDown(){
        isDown = true;
        return isDown;
    }




    //public static SpecialGoodRoboter getinstance() {return instance;}

    public class Port implements ISpecialGoodRoboter{

        public boolean up(){
            return innerUp();
        }

        public void move(SpecialGood specialGood) {

        }

        public void secure(SpecialGood specialGood) {

        }

        public boolean down() {
            return innerDown();
        }
    }
}
