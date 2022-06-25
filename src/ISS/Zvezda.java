package ISS;

class Zvezda extends Zarya {

    public Zvezda() { // доступ к изменению конструктора запрещён
        super();
        energyConsumption = 44;
        activateModule();
    }

    @Override
    void activateModule() {
        turnSolarPanels();
    }
    // доступ к созданию новых конструкторов запрещён

    // разрешено переопределение методов
}