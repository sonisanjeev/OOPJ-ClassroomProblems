package Problem8;

class Television implements Device {
    @Override
    public boolean turnOn() {
        System.out.println("Device is on");

        return false;
    }

    @Override
    public boolean turnOff() {
        System.out.println("Device is off");

        return false;
    }
}