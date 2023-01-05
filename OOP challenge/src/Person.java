public class Person{
    private String nameOfPerson;
    private int ageOfPerson;
    private Organ leftEye, rightEye, heart, stomach, skin;
    
    
    public Person(String nameOfPerson, int ageOfPerson, Organ leftEye, Organ rightEye, Organ heart, Organ stomach,
            Organ skin) {
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }
    public String getNameOfPerson() {
        return nameOfPerson;
    }
    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }
    public int getAgeOfPerson() {
        return ageOfPerson;
    }
    public void setAgeOfPerson(int ageOfPerson) {
        this.ageOfPerson = ageOfPerson;
    }
    public Organ getLeftEye() {
        return leftEye;
    }
    public void setLeftEye(Organ leftEye) {
        this.leftEye = leftEye;
    }
    public Organ getRightEye() {
        return rightEye;
    }
    public void setRightEye(Organ rightEye) {
        this.rightEye = rightEye;
    }
    public Organ getHeart() {
        return heart;
    }
    public void setHeart(Organ heart) {
        this.heart = heart;
    }
    public Organ getStomach() {
        return stomach;
    }
    public void setStomach(Organ stomach) {
        this.stomach = stomach;
    }
    public Organ getSkin() {
        return skin;
    }
    public void setSkin(Organ skin) {
        this.skin = skin;
    }
}
