package vitals;

public class Main {
    static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
        boolean tempStatus = temperature >= 0 && temperature <= 45;
        boolean socStatus = soc >= 20 && soc <= 80;
        boolean chargeRateStatus = chargeRate <= 0.8;    
        if(!tempStatus) System.out.println("Temperature out of range");
        if(!socStatus) System.out.println("SOC out of range");
        if(!chargeRateStatus) System.out.println("Charge Rate out of range");
        return tempStatus && socStatus && chargeRateStatus ;
    }

    public static void main(String[] args) {
        assert batteryIsOk(25, 70, 0.7f);
        assert !batteryIsOk(50, 85, 0.0f);
        System.out.println("Some more tests needed");
    }
}
