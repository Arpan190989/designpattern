import com.designpattern.adapter.ManualtoAutomaticAdapter;
import com.designpattern.constants.DesignPatternConstants;
import com.designpattern.decorator.CustomClassR8;
import com.designpattern.decorator.SUV400;
import com.designpattern.iterator.CarModels;
import com.designpattern.iterator.CarModelsIterator;
import com.designpattern.iterator.CarModelsList;
import com.designpattern.model.BMWR8Automatic;
import com.designpattern.model.CruiseMManual;
import com.designpattern.proxy.CarMechanic;
import com.designpattern.proxy.ProxyCarMechanic;
import com.designpattern.singleton.MoneyTransaction;

public class Main {

	public static void main(String[] args) {

		String pattern = "Singleton";

		switch (pattern) {

		case "Singleton":

			for (int i = 0; i < 100; i++) {
				MoneyTransaction transaction = MoneyTransaction.getInstance();
				System.out.println(transaction.hashCode());
			}
			break;

		case "Adapter":

			BMWR8Automatic r8 = new BMWR8Automatic();
			r8.engineService();
			CruiseMManual cruise = new CruiseMManual();
			cruise.accelerate();
			ManualtoAutomaticAdapter adapter = new ManualtoAutomaticAdapter(cruise);
			adapter.fixAutomatedGearBox();
			break;

		case "Proxy":

			CarMechanic mech = new CarMechanic("Arpan");
			System.out.println(mech.initiateManufacturing());
			ProxyCarMechanic proxyMechanic = new ProxyCarMechanic("John");
			System.out.println(proxyMechanic.initiateManufacturing());

			break;

		case "Decorator":

			SUV400 suv400 = new SUV400();
			System.out.println(suv400.initiateManufacturing());
			CustomClassR8 classR8 = new CustomClassR8(suv400);
			System.out.println(classR8.initiateManufacturing());

			break;

		case "Iterator":

			CarModels[] carModels = new CarModels[4];
			carModels[0] = new CarModels("suv100");
			carModels[1] = new CarModels("suv200");
			carModels[2] = new CarModels("suv300");
			carModels[3] = new CarModels("suv400");
			CarModelsList list = new CarModelsList(carModels);
			CarModelsIterator iterator = (CarModelsIterator) list.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next().getName());
			}

			break;

		default:
			System.out.println(DesignPatternConstants.NO_PATTERN);

		}

	}

}
