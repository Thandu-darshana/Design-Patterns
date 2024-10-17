

/*
Creational Patterns:
    Deal with object creation mechanisms.

    Factory Method:
        Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
*/

public class factory_method {

    // SmartDeviceFactory interface
    interface SmartDeviceFactory {
        SmartDevice createDevice();
    }

    // LightFactory subclass
    static class LightFactory implements SmartDeviceFactory {
        public SmartDevice createDevice() {
            return new Light();
        }
    }

    // CCTVFactory subclass
    static class CCTVFactory implements SmartDeviceFactory {
        public SmartDevice createDevice() {
            return new CCTV();
        }
    }

    // SmartDevice interface
    interface SmartDevice {
        void turnOn();
        void turnOff();
    }

    // Light subclass
    static class Light implements SmartDevice {
        public void turnOn() {
            System.out.println("Light is turned on");
        }

        public void turnOff() {
            System.out.println("Light is turned off");
        }
    }

    // CCTV subclass
    static class CCTV implements SmartDevice {
        public void turnOn() {
            System.out.println("CCTV is turned on");
        }

        public void turnOff() {
            System.out.println("CCTV is turned off");
        }
    }

    public static void main(String[] args) {
        SmartDeviceFactory lightFactory = new LightFactory();
        SmartDeviceFactory cctvFactory = new CCTVFactory();

        SmartDevice light = lightFactory.createDevice();
        SmartDevice cctv = cctvFactory.createDevice();

        light.turnOn();
        cctv.turnOn();

        light.turnOff();
        cctv.turnOff();
    }
}
