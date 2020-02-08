package iit.tutorial3_2.sachintha;

public class Person {
    protected String myName	;			//	name of	the	person
    protected int myAge;				//	person’s age
    protected String myGender;		//	“M”	for	male,	“F”	for	female

    public	Person(String name,	int	age, String	gender)	{
        myName = name;
        myAge =	age	;
        myGender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "myName='" + myName + '\'' +
                ", myAge=" + myAge +
                ", myGender='" + myGender + '\'' +
                '}';
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }
}
