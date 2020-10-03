package ru.job4j.weather.domain;

/**
 * @author Vitaly Vasilyev, date: 03.10.2020, e-mail: rav.energ@rambler.ru
 * @version 1.0
 */
public class Weather {
    private int id;
    private String city;
    private int temperature;

    public Weather(int id, String city, int temperature) {
        this.id = id;
        this.city = city;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public int getTemperature() {
        return temperature;
    }
}