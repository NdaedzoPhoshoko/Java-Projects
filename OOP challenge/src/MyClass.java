import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);
        Organ leftEye = new Organ("Left Eye", "Short sighted", "Blue");
        Organ rightEye = new Organ("Right Eye", "Normal", "Blue");
        Organ heart = new Organ("Heart", "Normal", 65);
        Organ stomach = new Organ("Stomach", "PUD", true);
        Organ skin = new Organ("Skin", "Burned");

        Person person = new Person("Tom", 25, leftEye, rightEye, heart, stomach, skin);

        System.out.print("Name: "+ person.getNameOfPerson()+ "\nAge : "+ person.getAgeOfPerson()); 

        /* */
                int option =1, answer=0;
        while(option==1 || option==2 || option==3 || option==4 || option==5)
        {
            System.out.println("\nChoose an Organ:");
            System.out.println("\t1. Left Eye");
            System.out.println("\t2. Right Eye");
            System.out.println("\t3. Heart");
            System.out.println("\t4. Stomach");
            System.out.println("\t5. SKin");
            System.out.println("\t6. Quit");
            option = input.nextInt();
            if(option==1)
            {
                System.out.println("Name: "+ person.getLeftEye().getName()+
                "\nMedical Condition: "+ person.getLeftEye().getMedCondition()+
                "\nColor: "+ person.getLeftEye().getColor()+
                "\n\t1. Close the Eye");
                answer = input.nextInt();
                if(answer==1)
                {
                    System.out.print("Left Eye Closed");
                }
            }else if(option==2)
            {
                System.out.println("Name: "+ person.getRightEye().getName()+
                "\nMedical Condition: "+ person.getRightEye().getMedCondition()+
                "\nColor: "+ person.getRightEye().getColor()+
                "\n\t1. Close the Eye");
                answer = input.nextInt();
            }else if(option==3)
            {
                System.out.println("Name: "+ person.getHeart().getName()+
                "\nMedical Condition: "+ person.getHeart().getMedCondition()+
                "\nHeart rate: "+ person.getHeart().getHeartRate()+
                "\n\t1. Change heart rate");
                answer = input.nextInt();
                if(answer==1)
                {
                    System.out.print("Enter the new heart rate: ");
                    person.getHeart().setHeartRate(input.nextInt());
                    System.out.print("Heart rate changed to: "+ person.getHeart().getHeartRate());
                }
            }else if(option==4)
            {
                System.out.print("Name: "+ person.getStomach().getName()+
                "\nMedical Condition: "+ person.getStomach().getMedCondition());
                if(person.getStomach().isHungry()==true)
                {
                    System.out.println("\nNeed to be fed\n\t1. Digest");
                    answer = input.nextInt();
                    if(answer==1)
                    {
                        System.out.print("Digesting begin...");
                    }
                }else{
                    System.out.print("\nNo need to be fed");
                }
            }else if(option==5)
            {
                System.out.print("Name: "+ person.getSkin().getName()+
                "\nMedical Condition: "+ person.getSkin().getMedCondition());
            }else if(option==6)
            {
                System.out.print("\t...Program Ended.");
                break;//close the program
            }

        }
        input.close();
    }
}
