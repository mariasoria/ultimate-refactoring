package valueAndReference;

public class SomeType {
    public String someField;
    public int[] numbers;
    public SomeType child;

    public SomeType(){
        numbers = new int[10];
    }

    public void firstMethod(String arg1){
        arg1 = "foo";
    }

    public void secondMethod(SomeType other){
        other = new SomeType();
        other.someField = "blah";
    }

    public void thirdMethod(SomeType other){
        other.numbers[0] = 100;
        other.someField = "changed";
        other.child = new SomeType();
    }

    public void fourthMethod(int[] someNumbers){
        someNumbers[0] = this.numbers[0];
        someNumbers[1] = this.numbers[9];
    }
}
