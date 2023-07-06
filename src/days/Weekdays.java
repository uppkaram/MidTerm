/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class weekdays{
    
public enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
    
   
}

 private int code;
    private String name;

    Day(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static Day getDay(int code) {
        for (Day day : Day.values()) {
            if (day.getCode() == code) {
                return day;
            }
        }
        return null;
    }
}

