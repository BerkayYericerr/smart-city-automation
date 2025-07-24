
//This is the implementation of the Command Pattern as suggested in Homework1.


interface Command {
    void execute();
}
class TurnOffStreetLightsCommand implements Command {
    private CityController cityController;
    public TurnOffStreetLightsCommand(CityController cityController) {
        this.cityController = cityController;
    }
    @Override
    public void execute() {
        this.cityController.controlStreetLights("OFF"); // Turns off the streetlights
    }
}
//  Command to turn ON streetlights
// Command  action to CityController
class TurnOnStreetLightsCommand implements Command {
    private CityController cityController;
    public TurnOnStreetLightsCommand(CityController cityController) {
        this.cityController = cityController;
    }
    @Override
    public void execute() {
        this.cityController.controlStreetLights("ON"); // Turns on the streetlights
    }
}
