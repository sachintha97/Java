
import java.math.BigDecimal;

public abstract class Vehicle {
    private String plateNumber;
    private String make;
    private String typeOfVehicle;
    private float engineCapacity;
    private BigDecimal rate;
    private String fuelType;
    private boolean vehicleAvailability;
    private int numOfSeats;

    public Vehicle(String plateNumber, String make, String typeOfVehicle, float engineCapacity, BigDecimal rate, String fuelType, boolean vehicleAvailability, int numOfSeats) {
        this.plateNumber = plateNumber;
        this.make = make;
        this.typeOfVehicle = typeOfVehicle;
        this.engineCapacity = engineCapacity;
        this.rate = rate;
        this.fuelType = fuelType;
        this.vehicleAvailability = vehicleAvailability;
        this.numOfSeats = numOfSeats;
    }

    public Vehicle() {
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isVehicleAvailability() {
        return vehicleAvailability;
    }

    public void setVehicleAvailability(boolean vehicleAvailability) {
        this.vehicleAvailability = vehicleAvailability;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plateNaumber='" + plateNumber + '\'' +
                ", make='" + make + '\'' +
                ", typeOfVehicle='" + typeOfVehicle + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", rate=" + rate +
                ", fuelType='" + fuelType + '\'' +
                ", vehicleAvailability=" + vehicleAvailability +
                '}';
    }
}
