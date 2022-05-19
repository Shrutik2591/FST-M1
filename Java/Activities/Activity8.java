package activities;

public class Activity8 extends CustomException{

    Activity8(String message) {
        super(message);
    }

    static void exceptionTest(String message) throws CustomException {
        if (message.equals(null)) {
            throw new CustomException("String is Null");
        } else {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        try {
        Activity8.exceptionTest("String is not null");
            System.out.println("String is assigned to Null ---See error below");
        Activity8.exceptionTest(null);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}
