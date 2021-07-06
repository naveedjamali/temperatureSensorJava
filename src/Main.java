public class Main {
    public static void main(String[] args){
        Main p = new Main();


        OldTempSensorAdapter o1  = new OldTempSensorAdapter();
        o1.setId("o1");

        OldSensorDevice oldDev = new OldSensorDevice(o1);

        oldDev.start();

        System.out.println("Last reading sent from device was " + o1.getReading());


    }
}
