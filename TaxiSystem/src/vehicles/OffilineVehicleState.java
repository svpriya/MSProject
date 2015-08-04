package vehicles;

public class OffilineVehicleState implements IVehicleState {

	IVehicle vehicle;

	public OffilineVehicleState(IVehicle v) {
		vehicle = v;
	}

	@Override
	public String becomeAvailable() {
		vehicle.setState(new ForHireVehicleState(vehicle));
		return "Vehicle is available now to Hire.";
	}

	@Override
	public String hireVehicle() {
		return "Vehicle is not yet available to Hire.";
	}

	@Override
	public String doMaintenance() {
		vehicle.setState(new InMaintenanceVehicleState(vehicle));
		return "Vehicle is under maintenance.";
	}
}
