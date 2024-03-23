public class UserInputException implements  InputException{
    @Override
    public Exception getException(int input) {
        if(input <1 || input>4){
            return new Exception("Lua chon ko hop le");
        };
        return null;
    }
}
