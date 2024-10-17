

/*
Structural Patterns:
    Deal with object composition or relationships between entities.

    Facade:
        Provides a simplified interface to a complex subsystem.
*/


public class facade {
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

    // Camera subclass
    static class Camera implements SmartDevice {
        public void turnOn() {
            System.out.println("Camera is turned on");
        }

        public void turnOff() {
            System.out.println("Camera is turned off");
        }
    }

    // HomeAutomationFacade facade
    static public class HomeAutomationFacade {
        private SmartDevice light;
        private SmartDevice camera;

        public HomeAutomationFacade(SmartDevice light, SmartDevice camera) {
            this.light = light;
            this.camera = camera;
        }

        public void turnOnAll() {
            light.turnOn();
            camera.turnOn();
        }

        public void turnOffAll() {
            light.turnOff();
            camera.turnOff();
        }
    }

    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice camera = new Camera();

        HomeAutomationFacade facade = new HomeAutomationFacade(light, camera);
        facade.turnOnAll();     // Turns on all devices
        facade.turnOffAll();    // Turns off all devices
    }
}