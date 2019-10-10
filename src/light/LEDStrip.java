package light;

public class LEDStrip {
    private LED[] LEDStrip;

    public LED[] getLEDStrip() {
        return LEDStrip;
    }

    public void setLEDStrip(LED[] LEDStrip) {
        this.LEDStrip = LEDStrip;
    }

    public LEDStrip(LED[] LEDStrip) {
        this.LEDStrip = LEDStrip;
    }

    private int lengthOfStrip(){
       int LEDLength= LEDStrip.length;
       return LEDLength;

    }

    private int numberOfDefectiveLEDs(){
        int count=0;
        for (int i=0;i<lengthOfStrip();i++){
            if (!LEDStrip[i].isWorking()){
                count++;
            }
        }
        return count;

    }
    private boolean isStripDefective(){
        return numberOfDefectiveLEDs()>lengthOfStrip()/2;
    }
    public  void printResult(){
        if(isStripDefective()==false) {
            System.out.print("This Strip is not defective");
        }
        else{
            System.out.print("This Strip is defective");

        }
    }

}
