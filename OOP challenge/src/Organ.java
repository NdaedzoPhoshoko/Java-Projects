public class Organ {
    private String name, medCondition, color;
    private int heartRate;
    private boolean isHungry;
    /**
     * constructs object of class Organ, accepting two parameters.
     * @param name
     * @param medCondition
     */
    public Organ(String name, String medCondition) {
        this.name = name;
        this.medCondition = medCondition;
    }
    /**
     * constructs object of class Organ, accepting three parameters.
     * @param name
     * @param medCondition
     * @param isHungry
     */
    public Organ(String name, String medCondition, boolean isHungry) {
        this.name = name;
        this.medCondition = medCondition;
        this.isHungry = isHungry;
    }
    /**
     * constructs object of class Organ, accepting three parameters.
     * @param name
     * @param medCondition
     * @param color
     */
    public Organ(String name, String medCondition, String color)
    {
        this.name = name;
        this.medCondition = medCondition;
        this.color = color;
    }
    /**
     * constructs object of class Organ, accepting three parameters.
     * @param name
     * @param medCondition
     * @param heartRate
     */
    public Organ(String name, String medCondition, int heartRate) {
        this.name = name;
        this.medCondition = medCondition;
        this.heartRate = heartRate;
    }

    /**
     * String getter method for name of organ.
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * setter method for name of organ.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * String getter method for medical condition of organ.
     * @return medCondition
     */
    public String getMedCondition() {
        return medCondition;
    }
    /**
     * setter method for medical condition
     * @param medCondition
     */
    public void setMedCondition(String medCondition) {
        this.medCondition = medCondition;
    }
    /**
     * getter method for color of organ.
     * @return color
     */
    public String getColor() {
        return color;
    }
    /**
     * setter method for color of organ.
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public boolean isHungry() {
        return isHungry;
    }
    public void setIsHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }
    
}
