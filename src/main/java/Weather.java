import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.model.CurrentWeather;

public class Weather {
    public static void main(String[] args) throws APIException {
        OWM owm = new OWM("3285545d627167f6356812673a7ad6e5");
        CurrentWeather currentWeather = owm.currentWeatherByCityName("Saint-Petersburg");
        System.out.println("Город: " + currentWeather.getCityName());
    }
}
