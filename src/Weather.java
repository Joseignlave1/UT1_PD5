//Parte 1
public class Weather {
    TypesOfWeather typesOfWeather; //Inicializamos el ENUM

    public Weather(TypesOfWeather typesOfWeather) {
        this.typesOfWeather = typesOfWeather;
    }
    public enum TypesOfWeather {
        RAIN, SNOW, THUNDERSTORMS, FOG, HEAT
    }

    public void doIlikethisWeatherType() {
        switch (typesOfWeather) {
            case RAIN:
                System.out.println("I dont like Rain");
                break;
            case SNOW:
                System.out.println("I like Snow");
                break;
            case THUNDERSTORMS:
                System.out.println("I dont like Thunderstorms");
                break;
            case FOG:
                System.out.println("I dont like Fogs");
                break;
            case HEAT:
                System.out.println("Not my best option but better than Rain, i like it");
                break;
            default:
                System.out.println("Uruguay doesnt have snow, sad for me");
                break;
        }
    }
    public static void main(String[] args) {
        Weather rain = new Weather(TypesOfWeather.RAIN);
        rain.doIlikethisWeatherType();
        Weather snow = new Weather(TypesOfWeather.SNOW);
        snow.doIlikethisWeatherType();
        Weather thunderstorms = new Weather(TypesOfWeather.THUNDERSTORMS);
        thunderstorms.doIlikethisWeatherType();
        Weather fog = new Weather(TypesOfWeather.FOG);
        fog.doIlikethisWeatherType();
        Weather heat = new Weather(TypesOfWeather.HEAT);
        heat.doIlikethisWeatherType();
    }
}