

/*
Behavioral Patterns:
    Concerned with communication between objects, focusing on how objects interact and distribute responsibility.

    Strategy:
        Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
*/

public class Strategy {

    interface EnergyStrategy {
        void manageEnergy();
    }

    // EcoModeStrategy class
    static class EcoModeStrategy implements EnergyStrategy {
        public void manageEnergy() {
            System.out.println("Managing energy in Eco Mode");
        }
    }

    // ComfortModeStrategy class
    static class ComfortModeStrategy implements EnergyStrategy {
        public void manageEnergy() {
            System.out.println("Managing energy in Comfort Mode");
        }
    }

    // HomeAutomationStrategy class
    static class HomeAutomationStrategy {
        private EnergyStrategy energyStrategy;

        public void setEnergyStrategy(EnergyStrategy energyStrategy) {
            this.energyStrategy = energyStrategy;
        }

        public void manageEnergy() {
            energyStrategy.manageEnergy();
        }
    }

    // Main method to demonstrate the Strategy pattern
    public static void main(String[] args) {
        HomeAutomationStrategy systemStrategy = new HomeAutomationStrategy();

        systemStrategy.setEnergyStrategy(new EcoModeStrategy());
        systemStrategy.manageEnergy(); // Output: Managing energy in Eco Mode

        systemStrategy.setEnergyStrategy(new ComfortModeStrategy());
        systemStrategy.manageEnergy(); // Output: Managing energy in Comfort Mode
    }
}
